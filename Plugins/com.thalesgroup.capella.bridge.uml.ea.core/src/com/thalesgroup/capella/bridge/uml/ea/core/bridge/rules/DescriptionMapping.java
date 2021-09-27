/*******************************************************************************
* Copyright (c) 2021 THALES GLOBAL SERVICES.
* All right reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* Contributors:
*     Artal Technologies - initial API and implementation
*******************************************************************************/
package com.thalesgroup.capella.bridge.uml.ea.core.bridge.rules;

import java.util.List;

import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.cs.BlockArchitecture;

import com.artal.capella.bridge.core.rules.MappingRulesManager;
import com.artal.capella.bridge.core.rules.commons.CommonDescriptionMapping;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.Capella2UMLAlgo;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.rules.utils.SpecificUtils;
import com.thalesgroup.capella.bridge.uml.ea.model.XMIExtensionsUtils;

/**
 * @author Yann BINOT
 *
 */
public class DescriptionMapping extends CommonDescriptionMapping<BlockArchitecture, Capella2UMLAlgo> {

	/**
	 * @param algo
	 * @param parent
	 * @param mappingExecution
	 */
	public DescriptionMapping(Capella2UMLAlgo algo, BlockArchitecture parent, IMappingExecution mappingExecution) {
		super(algo, parent, mappingExecution);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object compute(Object eaContainer, CapellaElement source) {

		Element capellaObjectFromAllRules = (Element) MappingRulesManager.getCapellaObjectFromAllRules(source);
		if (capellaObjectFromAllRules != null) {
//			Comment createComment = UMLFactory.eINSTANCE.createComment();
//			MappingUtils.generateUID(getAlgo(), source, createComment, this, "ct");
//
//			createComment.setBody(source.getDescription());
//
//			createComment.getAnnotatedElements().add(capellaObjectFromAllRules);
//
//			if (eaContainer instanceof Model) {
//				org.eclipse.uml2.uml.Package pkgCapella = (org.eclipse.uml2.uml.Package) (((Model) eaContainer)
//						.getPackagedElements().get(0));
//				pkgCapella.getOwnedComments().add(createComment);
//			}

			XMIExtensionsUtils.setDocumentation(capellaObjectFromAllRules, getAlgo().getXMIExtension(),
					source.getDescription(), SpecificUtils.getSType(capellaObjectFromAllRules));

//			return createComment;
		}
		return null;
	}

	@Override
	public void executeSubRules(List<CapellaElement> _capellaSource, MappingRulesManager manager) {

	}

	@Override
	public String getUID(EObject key, String id) {
		return "EAID_" + id;
	}

}
