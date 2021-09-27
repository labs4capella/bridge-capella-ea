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

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IQuery;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IQueryExecution;
import org.eclipse.emf.diffmerge.bridge.mapping.impl.Rule;
import org.eclipse.emf.diffmerge.bridge.mapping.impl.RuleIdentifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Stereotype;


/**
 * A base implementation of UMLProfilesUtil.
 * @param <S> the type of source data elements
 * @param <T> the type of target data elements
 * @author Olivier Constant
 */
public abstract class UMLRule<S, T> extends Rule<S, T> implements IUMLRule<S, S, T> {
  
  /**
   * Default constructor for a randomly generated ID
   * @param provider_p a non-null input provider
   */
  public UMLRule(IQuery<?, ? extends S> provider_p) {
    super(provider_p);
  }
  
  /**
   * Constructor
   * @param provider_p a non-null input provider
   * @param id_p the non-null identifier of the rule
   */
  public UMLRule(IQuery<?, ? extends S> provider_p, String id_p) {
    super(provider_p, id_p);
  }
  
  /**
   * Constructor
   * @param provider_p a non-null input provider
   * @param id_p the non-null identifier of the rule
   */
  public UMLRule(IQuery<?, ? extends S> provider_p, RuleIdentifier<S, T> id_p) {
    super(provider_p, id_p);
  }
  
  /**
   * Apply the given Profile on the given UML Package and return the resulting set of
   * created elements (Profile application and mandatory Stereotype applications)
   * @param package_p a non-null UML Package
   * @param profile_p a non-null profile
   * @return a non-null collection containing no null value
   */
  protected Collection<EObject> applyProfile(org.eclipse.uml2.uml.Package package_p,
      Profile profile_p) {
    Collection<EObject> result = new LinkedList<EObject>();
    result.addAll(package_p.applyProfile(profile_p));
    ProfileApplication profileApp = package_p.getProfileApplication(profile_p);
    if (profileApp != null)
      result.add(profileApp);
    return result;
  }
  
  /**
   * Apply the given Stereotype on the given UML Element and return the resulting set of
   * created elements (only a Stereotype application if successful, otherwise an empty set).
   * Precondition: The Profile of the Stereotype has been applied to the nearest Package
   * of the UML Element.
   * @param element_p a non-null UML Element
   * @param stereotype_p a non-null Stereotype
   * @return a non-null collection containing no null value
   */
  protected Collection<EObject> applyStereotype(Element element_p, Stereotype stereotype_p) {
    Collection<EObject> result = new LinkedList<EObject>();
    EObject stereotypeApp = element_p.applyStereotype(stereotype_p);
    if (stereotypeApp != null)
      result.add(stereotypeApp);
    return result;
  }
  
  /**
   * @see org.eclipse.emf.diffmerge.bridge.uml.mapping.IUMLRule#createProfileApplications(java.lang.Object, java.lang.Object, org.eclipse.emf.diffmerge.bridge.mapping.api.IQueryExecution, org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution)
   */
  public Collection<EObject> createProfileApplications(S source_p,
      T target_p, IQueryExecution queryExecution_p,
      IMappingExecution mappingExecution_p) {
    // Default: no Profile application
    return Collections.emptySet();
  }
  
  /**
   * @see org.eclipse.emf.diffmerge.bridge.uml.mapping.IUMLRule#createStereotypeApplications(java.lang.Object, java.lang.Object, org.eclipse.emf.diffmerge.bridge.mapping.api.IQueryExecution, org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution)
   */
  public Collection<EObject> createStereotypeApplications(S source_p,
      T target_p, IQueryExecution queryExecution_p,
      IMappingExecution mappingExecution_p) {
    // Default: no Stereotype application
    return Collections.emptySet();
  }
  
  /**
   * @see org.eclipse.emf.diffmerge.bridge.uml.mapping.IUMLRule#defineStereotypeApplications(java.lang.Object, java.lang.Object, org.eclipse.emf.diffmerge.bridge.mapping.api.IQueryExecution, org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution)
   */
  public void defineStereotypeApplications(S source_p, T target_p,
      IQueryExecution queryExecution_p, IMappingExecution mappingExecution_p) {
    // Default: nothing to define
  }
  
}
