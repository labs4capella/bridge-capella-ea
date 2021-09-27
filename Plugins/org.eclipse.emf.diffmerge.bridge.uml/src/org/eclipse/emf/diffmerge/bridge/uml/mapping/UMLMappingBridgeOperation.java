/*********************************************************************
 * Copyright (c) 2016-2019 Thales Global Services S.A.S.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S. - initial API and implementation
 **********************************************************************/
package org.eclipse.emf.diffmerge.bridge.uml.mapping;

import static org.eclipse.emf.diffmerge.bridge.uml.mapping.UMLMappingBridgeOperation.Phase.PROFILE_APPLICATION;
import static org.eclipse.emf.diffmerge.bridge.uml.mapping.UMLMappingBridgeOperation.Phase.STEREOTYPE_APPLICATION;
import static org.eclipse.emf.diffmerge.bridge.uml.mapping.UMLMappingBridgeOperation.Phase.STEREOTYPE_APPLICATION_DEFINITION;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.diffmerge.api.scopes.IEditableModelScope;
import org.eclipse.emf.diffmerge.bridge.api.IBridgeExecution;
import org.eclipse.emf.diffmerge.bridge.impl.StructureBasedCause;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingBridge;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IRule;
import org.eclipse.emf.diffmerge.bridge.mapping.impl.MappingExecution;
import org.eclipse.emf.diffmerge.bridge.mapping.impl.MappingExecution.PendingDefinition;
import org.eclipse.emf.diffmerge.bridge.mapping.impl.QueryExecution;
import org.eclipse.emf.diffmerge.bridge.mapping.operations.MappingBridgeOperation;
import org.eclipse.emf.diffmerge.bridge.uml.Messages;
import org.eclipse.emf.diffmerge.bridge.util.INormalizableModelScope;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.util.UMLUtil;


/**
 * An operation that executes a UML mapping bridge between data scopes.
 * @see UMLMappingBridge
 * @author Olivier Constant
 */
public class UMLMappingBridgeOperation extends MappingBridgeOperation {
  
  /** The URI used to qualify profile applications via an annotation  */
  protected static final String UML_PROFILE_ANNOTATION = UMLUtil.UML2_UML_PACKAGE_2_0_NS_URI;
  
  /** The phases in this operation that are dedicated to Profile data */
  protected enum Phase {
    /** The application of Profiles */
    PROFILE_APPLICATION,
    /** The application of Stereotypes */
    STEREOTYPE_APPLICATION,
    /** The definition of Stereotype applications */
    STEREOTYPE_APPLICATION_DEFINITION
  }
  
  
  /**
   * Constructor
   * @param sourceDataSet_p the non-null source data set
   * @param targetDataSet_p the non-null target data set
   * @param bridge_p the non-null bridge to execute
   * @param execution_p a non-null execution for the bridge
   */
  public UMLMappingBridgeOperation(Object sourceDataSet_p, Object targetDataSet_p,
      IMappingBridge<?,?> bridge_p, IBridgeExecution execution_p) {
    super(sourceDataSet_p, targetDataSet_p, bridge_p, execution_p);
  }
  
  /**
   * @see org.eclipse.emf.diffmerge.bridge.mapping.operations.MappingBridgeOperation#handleBridge(org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingBridge, org.eclipse.emf.diffmerge.bridge.mapping.impl.MappingExecution, java.lang.Object, java.lang.Object)
   */
  @Override
  @SuppressWarnings({ "rawtypes", "unchecked" })
  protected void handleBridge(IMappingBridge<?,?> bridge_p, MappingExecution execution_p,
      Object sourceDataSet_p, Object targetDataSet_p) {
    // Store the target data set in the mapping execution
    execution_p.setTargetDataSet(targetDataSet_p);
    // Root query execution definition
    QueryExecution rootQueryEnv = createQueryExecution();
    // First iteration: target creations
    getLogger().info(
        org.eclipse.emf.diffmerge.bridge.mapping.Messages.BridgeLogger_TargetCreationStepMessage); 
    handleQueriesForTargetCreationRec(bridge_p.getQueries(), bridge_p,
        sourceDataSet_p, targetDataSet_p, rootQueryEnv, execution_p);
    // Second iteration: target definitions
    getLogger().info(
        org.eclipse.emf.diffmerge.bridge.mapping.Messages.BridgeLogger_TargetDefinitionStepMessage);
    handleTargetDefinitions(execution_p);
    // Third iteration: Profile applications
    getLogger().info(Messages.BridgeLogger_ProfileApplicationStepMessage);
    handleProfileData(execution_p, targetDataSet_p, PROFILE_APPLICATION);
    getMonitor().worked(1);
    // Fourth iteration: Stereotype applications
    getLogger().info(Messages.BridgeLogger_StereotypeApplicationStepMessage);
    handleProfileData(execution_p, targetDataSet_p, STEREOTYPE_APPLICATION);
    ((IMappingBridge)bridge_p).targetsCreated(targetDataSet_p);
    getMonitor().worked(1);
    // Fifth iteration: Stereotype application definitions
    getLogger().info(Messages.BridgeLogger_StereotypeApplicationDefinitionStepMessage);
    handleProfileData(execution_p, targetDataSet_p, STEREOTYPE_APPLICATION_DEFINITION);
    // Finishing
    if (targetDataSet_p instanceof INormalizableModelScope)
      ((INormalizableModelScope)targetDataSet_p).normalize();
    ((IMappingBridge)bridge_p).targetsDefined(targetDataSet_p);
    getMonitor().worked(1);
    execution_p.setStatus(Status.OK_STATUS);
  }
  
  /**
   * Handle Profile data for the pending target definitions of the given bridge execution
   * @param execution_p a non-null object
   * @param targetDataSet_p a non-null object
   * @param phase_p the non-null phase for Profile data construction
   */
  protected void handleProfileData(MappingExecution execution_p, Object targetDataSet_p,
      Phase phase_p) {
    Set<Object> pendingSources = execution_p.getPendingSources();
    // Handle all pending rules
    for (Object source : pendingSources) {
      handleRuleForProfileApplications(source, execution_p, targetDataSet_p, phase_p);
    }
  }
  
  /**
   * Execute profile applications for the given source, based on the given
   * bridge execution
   * @param source_p a non-null object
   * @param execution_p a non-null object
   * @param phase_p the non-null phase for Profile data construction
   */
  protected void handleRuleForProfileApplications(Object source_p,
      MappingExecution execution_p, Object targetDataSet_p, Phase phase_p) {
    Map<IRule<?,?,?>, PendingDefinition> pendingDefinitions =
        execution_p.getPendingDefinitions(source_p);
    // Handle all pending definitions
    for (Entry<IRule<?,?,?>, PendingDefinition> entry : pendingDefinitions.entrySet()) {
      IRule<?,?,?> rule = entry.getKey();
      if (phase_p == Phase.PROFILE_APPLICATION) // Registering targets
        registerTarget(entry.getValue(), source_p, entry.getKey(), execution_p);
      if (rule instanceof IUMLRule<?,?,?>) {
        handleRuleForProfileApplication((IUMLRule<?,?,?>)rule,
            source_p, entry.getValue(), execution_p, targetDataSet_p, phase_p);
      }
    }
  }
  
  /**
   * Execute the given rule for profile application, based on the given query and bridge
   * executions
   * @param rule_p a non-null object
   * @param source_p a non-null object
   * @param pendingDef_p a non-null object
   * @param execution_p a non-null object
   * @param phase_p the non-null phase for Profile data construction
   */
  @SuppressWarnings("unchecked")
  protected void handleRuleForProfileApplication(IUMLRule<?,?,?> rule_p, Object source_p,
      PendingDefinition pendingDef_p, MappingExecution execution_p, Object targetDataSet_p,
      Phase phase_p) {
    checkProgress();
    IUMLRule<Object,Object, Object> rule = (IUMLRule<Object,Object, Object>)rule_p;
    switch (phase_p) {
    case PROFILE_APPLICATION:
      Collection<EObject> profileApps = rule.createProfileApplications(
          source_p, pendingDef_p.getTarget(), pendingDef_p.getQueryExecution(), execution_p);
      for (EObject application : profileApps) {
        registerProfileData(rule_p, source_p, pendingDef_p, execution_p, targetDataSet_p, application);
      }
      break;
    case STEREOTYPE_APPLICATION:
      Collection<EObject> stereotypeApps = rule.createStereotypeApplications(
          source_p, pendingDef_p.getTarget(), pendingDef_p.getQueryExecution(), execution_p);
      for (EObject application : stereotypeApps) {
        if (application.eContainer() == null && targetDataSet_p instanceof IEditableModelScope)
          ((IEditableModelScope)targetDataSet_p).add(application);
        registerProfileData(rule_p, source_p, pendingDef_p, execution_p, targetDataSet_p, application);
      }
      break;
    case STEREOTYPE_APPLICATION_DEFINITION:
      rule.defineStereotypeApplications(
          source_p, pendingDef_p.getTarget(), pendingDef_p.getQueryExecution(), execution_p);
      break;
    }
  }
  
  /**
   * @see org.eclipse.emf.diffmerge.bridge.mapping.operations.MappingBridgeOperation#handleRuleForTargetDefinitions(java.lang.Object, org.eclipse.emf.diffmerge.bridge.mapping.impl.MappingExecution)
   */
  @Override
  protected void handleRuleForTargetDefinitions(Object source_p,
      MappingExecution execution_p) {
    Map<IRule<?,?,?>, PendingDefinition> pendingDefinitions =
        execution_p.getPendingDefinitions(source_p);
    // Handle all pending definitions
    for (Entry<IRule<?,?,?>, PendingDefinition> entry : pendingDefinitions.entrySet()) {
      handleRuleForTargetDefinition(
          entry.getKey(), entry.getValue(), execution_p);
      // Do not register target yet
    }
  }
  
  /**
   * Register the given Profile-related element
   * @param rule_p a non-null object
   * @param source_p a non-null object
   * @param pendingDef_p a non-null object
   * @param execution_p a non-null object
   * @param application_p a non-null element related to a Profile
   *          (Profile application or Stereotype application)
   */
  protected void registerProfileData(IUMLRule<?,?,?> rule_p, Object source_p,
      PendingDefinition pendingDef_p, MappingExecution execution_p, Object targetDataSet_p,
      EObject application_p) {
    checkProgress();
    EObject applicationTarget = getApplicationTarget(application_p);
    Object applicationTargetCause = execution_p.getTrace().getCause(applicationTarget);
    Object slot = getProfileDataCauseSuffix(application_p);
    StructureBasedCause cause = new StructureBasedCause(applicationTargetCause, slot);
    if (!execution_p.isTolerantToDuplicates() || !execution_p.isRegistered(cause)) {
      // Registration in bridge execution
      execution_p.put(cause, application_p);
      execution_p.putInTrace(cause, application_p);
      // Special case of UML annotation for profile applications, implicitly added, referencing EPackage
      if (application_p instanceof ProfileApplication) {
        EAnnotation umlAnnotation = ((EModelElement)application_p).getEAnnotation(UML_PROFILE_ANNOTATION);
        if (umlAnnotation != null) {
          Object annotationSlot = getProfileDataCauseSuffix(umlAnnotation);
          StructureBasedCause annotationCause = new StructureBasedCause(cause, annotationSlot);
          execution_p.putInTrace(annotationCause, umlAnnotation);
        }
      }
    }
  }
  
  /**
   * Return the UML element that is the target of the given Profile application
   * or Stereotype application
   * @param application_p a non-null Profile application or Stereotype application
   * @return a non-null element
   */
  protected Element getApplicationTarget(EObject application_p) {
    Element result;
    if (application_p instanceof ProfileApplication) {
      ProfileApplication profileApplication = (ProfileApplication)application_p;
      result = profileApplication.getApplyingPackage();
    } else {
      // Stereotype application
      result = UMLUtil.getBaseElement(application_p);
    }
    return result;
  }
  
  /**
   * Return an object that discriminates the given profile-related element w.r.t.
   * the UML element it characterizes
   * @param profileRelatedElement_p a non-null element
   * @return a non-null object
   */
  protected Object getProfileDataCauseSuffix(EObject profileRelatedElement_p) {
    Object result;
    if (profileRelatedElement_p instanceof EAnnotation) {
      // The annotation automatically created in Profile applications
      result = "umlAnnotation"; //$NON-NLS-1$
      EModelElement annotationTarget = ((EAnnotation)profileRelatedElement_p).getEModelElement();
      if (annotationTarget instanceof ProfileApplication) {
        Profile profile = ((ProfileApplication)annotationTarget).getAppliedProfile();
        if (profile != null)
          result = profile.getName() + '/' + result;
      }
    } else if (profileRelatedElement_p instanceof ProfileApplication) {
      Profile profile = ((ProfileApplication)profileRelatedElement_p).getAppliedProfile();
      result = profile.getName();
    } else {
      // Supposedly a Stereotype application
      result = profileRelatedElement_p.eClass().getName();
    }
    return result;
  }
  
}