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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.Usage;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentPort;
import org.polarsys.capella.core.model.helpers.ProjectExt;

import com.artal.capella.bridge.core.MappingUtils;
import com.artal.capella.bridge.core.rules.MappingRulesManager;
import com.artal.capella.bridge.core.rules.commons.CommonComponentExchangeMapping;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.Capella2UMLAlgo;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.rules.utils.SpecificUtils;

/**
 * @author Yann BINOT
 *
 */
public class AlternativeAssociationMapping extends CommonComponentExchangeMapping<Capella2UMLAlgo> {

	/**
	 * @param algo
	 * @param parent
	 * @param mappingExecution
	 */
	public AlternativeAssociationMapping(Capella2UMLAlgo algo, Component parent, IMappingExecution mappingExecution) {
		super(algo, parent, mappingExecution);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object compute(Object eaContainer, ComponentExchange source) {

		Resource eResource = source.eResource();

		ComponentPort sourcePort = (ComponentPort) source.getSourcePort();
		ComponentPort targetPort = (ComponentPort) source.getTargetPort();
		org.eclipse.uml2.uml.Port sp = (org.eclipse.uml2.uml.Port) MappingRulesManager
				.getCapellaObjectFromAllRules(sourcePort);
		org.eclipse.uml2.uml.Port tp = (org.eclipse.uml2.uml.Port) MappingRulesManager
				.getCapellaObjectFromAllRules(targetPort);
		if (sp == null || tp == null) {
			return null;
		}

		Interface sourceV = (Interface) SpecificUtils.getCustomFeature(sp, "required", "provided");
		Interface targetV = (Interface) SpecificUtils.getCustomFeature(tp, "required", "provided");

		Usage createUsage = UMLFactory.eINSTANCE.createUsage();
		MappingUtils.generateUID(getAlgo(), source, createUsage, this, "us");

		if (sourceV != null) {
			createUsage.getClients().add(sourceV);
		}
		if (targetV != null) {
			createUsage.getSuppliers().add(targetV);
		}

		Project project = ProjectExt.getProject(source);
		Object capellaObjectFromAllRules2 = MappingRulesManager.getCapellaObjectFromAllRules(project);

		EList<PackageableElement> packagedElements = ((Model) capellaObjectFromAllRules2).getPackagedElements();
		for (PackageableElement ownedMember : packagedElements) {
			if (ownedMember.getName().equals(SpecificUtils.getCapellaImportName(this)))
				((org.eclipse.uml2.uml.Package) ownedMember).getPackagedElements().add(createUsage);
		}
		return null;
	}

	@Override
	public void executeSubRules(List<ComponentExchange> _capellaSource, MappingRulesManager manager) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getUID(EObject key, String id) {
		// TODO Auto-generated method stub
		return "EAID_" + id;
	}

}
