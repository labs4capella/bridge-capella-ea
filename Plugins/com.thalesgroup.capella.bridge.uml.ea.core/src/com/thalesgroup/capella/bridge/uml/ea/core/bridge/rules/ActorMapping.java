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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.PropertyValueGroup;
import org.polarsys.capella.core.data.capellacore.PropertyValuePkg;
import org.polarsys.capella.core.data.cs.ComponentPkg;
import org.polarsys.capella.core.model.helpers.ProjectExt;

import com.artal.capella.bridge.core.CapellaUtils;
import com.artal.capella.bridge.core.MappingUtils;
import com.artal.capella.bridge.core.rules.MappingRulesManager;
import com.artal.capella.bridge.core.rules.commons.CommonsActorMapping;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.Capella2UMLAlgo;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.rules.utils.SpecificUtils;
import com.thalesgroup.capella.bridge.uml.ea.model.XMIExtensionsUtils;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.element;

/**
 * @author Yann BINOT
 *
 */
public class ActorMapping extends CommonsActorMapping<Capella2UMLAlgo> {

	public ActorMapping(Capella2UMLAlgo algo, ComponentPkg parent, IMappingExecution mappingExecution) {
		super(algo, parent, mappingExecution);
	}

	@Override
	public Object compute(Object eaContainer, org.polarsys.capella.core.data.cs.Component source) {

		Resource eResource = source.eResource();
		String sysMLID = MappingUtils.getSysMLID(eResource, source);
		Actor targetActor = UMLFactory.eINSTANCE.createActor();

		Capella2UMLAlgo algo = getAlgo();

		MappingUtils.generateUID(algo, source, targetActor, this);
		element targetelement = XMIExtensionsUtils.createElement(targetActor, algo.getXMIExtension());

		targetActor.setName(source.getName());

		CapellaElement ce = (CapellaElement) source;

		((org.eclipse.uml2.uml.Package) eaContainer).getPackagedElements().add(targetActor);
		if (CapellaUtils.hasStereotype(ce) && getAlgo().isPVMTExport()) {
			List<String> stereoNames = new ArrayList<String>();
			stereoNames.addAll(CapellaUtils.getListStereotypeName(ce));

			XMIExtensionsUtils.createStereotypeProperties(targetelement, stereoNames, "Actor", sysMLID);

			EList<PropertyValueGroup> pvgs = ce.getOwnedPropertyValueGroups();
			for (PropertyValueGroup propertyValueGroup : pvgs) {
				PropertyValuePkg propertyValuePkgFromName = SpecificUtils
						.getProfilePropertyValueGroup(ProjectExt.getProject(source), propertyValueGroup.getName());
				Profile capellaObjectFromAllRules = (Profile) MappingRulesManager
						.getCapellaObjectFromAllRules(propertyValuePkgFromName);

				Stereotype ownedStereotype = capellaObjectFromAllRules
						.getOwnedStereotype(propertyValueGroup.getName().split("\\.")[1]);
				SpecificUtils.applyStereotypeAttribute(propertyValueGroup, targetelement, targetActor);

				getAlgo().getStereotypes().add(ownedStereotype);

				String typeBase = "Actor";

				Actor compStereo = UMLFactory.eINSTANCE.createActor();
				SpecificUtils.createCustoStereotypeApplication((Element) eaContainer, targetActor,
						SpecificUtils.getModel(targetActor, source), propertyValueGroup, typeBase, compStereo,
						getAlgo());

			}
		}
		return targetActor;
	}

	@Override
	public String getUID(EObject key, String id) {
		return "EAID_" + id;
	}

	@Override
	public void executeSubRules(List<org.polarsys.capella.core.data.cs.Component> _capellaSource,
			MappingRulesManager manager) {
		for (org.polarsys.capella.core.data.cs.Component logicalActor : _capellaSource) {
			PropertyMapping propertyMapping = new PropertyMapping(getAlgo(), logicalActor, getMappingExucution());
			manager.add(propertyMapping.getClass().getName() + logicalActor.getId(), propertyMapping);

			PortMapping portMapping = new PortMapping(getAlgo(), logicalActor, getMappingExucution());
			manager.add(PortMapping.class.getName() + logicalActor.getId(), portMapping);
		}
	}

}
