/*******************************************************************************
* Copyright (c) 2021 THALES GLOBAL SERVICES.
* All right reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* Contributors:
*     Artal Technologies - initial API and implementation
*******************************************************************************/
package com.artal.capella.bridge.core.uml;

import org.eclipse.emf.diffmerge.bridge.api.IBridge;
import org.eclipse.emf.diffmerge.bridge.api.IBridgeExecution;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingBridge;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IRule;
import org.eclipse.emf.diffmerge.bridge.mapping.impl.MappingExecution;
import org.eclipse.emf.diffmerge.bridge.mapping.impl.MappingExecution.PendingDefinition;
import org.eclipse.emf.diffmerge.bridge.mapping.impl.QueryExecution;
import org.eclipse.emf.diffmerge.bridge.uml.mapping.IUMLRule;
import org.eclipse.emf.diffmerge.bridge.uml.mapping.UMLMappingBridgeOperation;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;

import com.artal.capella.bridge.core.patch.CapellaQueryExecution;
import com.artal.capella.bridge.core.patch.wrappers.RuleWrapper;

/**
 * @author Yann BINOT
 *
 */
public class CapellaUMLMappingBridgeOperation extends UMLMappingBridgeOperation {

	public CapellaUMLMappingBridgeOperation(Object sourceDataSet_p, Object targetDataSet_p,
			IMappingBridge<?, ?> bridge_p, IBridgeExecution execution_p) {
		super(sourceDataSet_p, targetDataSet_p, bridge_p, execution_p);
	}

	protected QueryExecution createQueryExecution() {
		return new CapellaQueryExecution();
	}

	protected void handleRuleForTargetCreation(IRule<?, ?, ?> rule_p, IBridge<?, ?> bridge_p, Object source_p,
			Object targetDataSet_p, QueryExecution queryExecution_p, MappingExecution execution_p) {
		RuleWrapper<?, ?, ?> mirrorRule = new RuleWrapper<>(rule_p, queryExecution_p);
		super.handleRuleForTargetCreation(mirrorRule, bridge_p, source_p, targetDataSet_p, queryExecution_p,
				execution_p);

	}

	/**
	 * Return an object that discriminates the given profile-related element w.r.t.
	 * the UML element it characterizes
	 * 
	 * @param profileRelatedElement_p a non-null element
	 * @return a non-null object
	 */
	protected Object getProfileDataCauseSuffix(EObject profileRelatedElement_p) {
		Object result;
		if (profileRelatedElement_p instanceof EAnnotation) {
			// The annotation automatically created in Profile applications
			result = "umlAnnotation"; //$NON-NLS-1$
			EModelElement annotationTarget = ((EAnnotation) profileRelatedElement_p).getEModelElement();
			if (annotationTarget instanceof ProfileApplication) {
				Profile profile = ((ProfileApplication) annotationTarget).getAppliedProfile();
				if (profile != null)
					result = profile.getURI() + profile.getName() + '/' + result;
			}
		} else if (profileRelatedElement_p instanceof ProfileApplication) {
			Profile profile = ((ProfileApplication) profileRelatedElement_p).getAppliedProfile();
			result = profile.getURI() + profile.getName();
		} else {
			// Supposedly a Stereotype application
			result = profileRelatedElement_p.eClass().getName();
		}
		return result;
	}

	@Override
	protected void registerProfileData(IUMLRule<?, ?, ?> rule_p, Object source_p, PendingDefinition pendingDef_p,
			MappingExecution execution_p, Object targetDataSet_p, EObject application_p) {
		if (execution_p.getTrace() != null) {
			super.registerProfileData(rule_p, source_p, pendingDef_p, execution_p, targetDataSet_p, application_p);
		}
	}
}
