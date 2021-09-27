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
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.EncapsulatedClassifier;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.PropertyValueGroup;
import org.polarsys.capella.core.data.capellacore.PropertyValuePkg;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.fa.ComponentPort;
import org.polarsys.capella.core.data.pa.PhysicalArchitecture;
import org.polarsys.capella.core.data.pa.PhysicalComponent;
import org.polarsys.capella.core.model.helpers.ProjectExt;

import com.artal.capella.bridge.core.CapellaUtils;
import com.artal.capella.bridge.core.MappingUtils;
import com.artal.capella.bridge.core.rules.MappingRulesManager;
import com.artal.capella.bridge.core.rules.commons.CommonPortMapping;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.Capella2UMLAlgo;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.rules.utils.SpecificUtils;
import com.thalesgroup.capella.bridge.uml.ea.model.XMIExtensionsUtils;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.element;

/**
 * @author Yann BINOT
 *
 */
public class PortMapping extends CommonPortMapping<Capella2UMLAlgo> {

	/**
	 * @param algo
	 * @param parent
	 * @param mappingExecution
	 */
	public PortMapping(Capella2UMLAlgo algo, org.polarsys.capella.core.data.cs.Component parent,
			IMappingExecution mappingExecution) {
		super(algo, parent, mappingExecution);
	}

	@Override
	public List<ComponentPort> findSourceElements(Component capellaContainer) {
		List<ComponentPort> ports = capellaContainer.getOwnedFeatures().stream().filter(p -> p instanceof ComponentPort)
				.map(ComponentPort.class::cast).filter(p -> isNotActorConnection(p)).collect(Collectors.toList());
		return ports;
	}

	public boolean isNotActorConnection(ComponentPort port) {

		// EList<ComponentExchange> componentExchanges = port.getComponentExchanges();
		// for (ComponentExchange componentExchange : componentExchanges) {
		// org.polarsys.capella.core.data.information.Port sourcePort =
		// componentExchange.getSourcePort();
		// org.polarsys.capella.core.data.information.Port targetPort =
		// componentExchange.getTargetPort();
		// if (sourcePort.equals(port)) {
		// if (targetPort.eContainer() instanceof SystemComponent) {
		// return true;
		// }
		// } else {
		//
		// if (sourcePort.eContainer() instanceof SystemComponent) {
		// return true;
		// }
		//
		// }
		// }

		return true;
	}

	@Override
	public Object compute(Object eaContainer, ComponentPort source) {
		// if (source.eContainer() instanceof AbstractActor) {
		// return null;
		// }
		Resource eResource = source.eResource();
		String sysMLID = MappingUtils.getSysMLID(eResource, source);
		Port targetPort = UMLFactory.eINSTANCE.createPort();
		MappingUtils.generateUID(getAlgo(), source, targetPort, this);
		if (eaContainer instanceof EncapsulatedClassifier) {
			((EncapsulatedClassifier) eaContainer).getOwnedPorts().add(targetPort);
		}
		if (eaContainer instanceof Actor) {
			Resource resource = (Resource) ((Actor) eaContainer).eResource();
			if (resource instanceof XMIResource) {
				SpecificUtils.addCustoRef((XMIResource) resource, (Actor) eaContainer, "ownedPort", targetPort, true,
						true);
			}
		}
		element targetelement = XMIExtensionsUtils.createElement(targetPort, getAlgo().getXMIExtension());

		CapellaElement ce = (CapellaElement) source;
		Model model = SpecificUtils.getModel(targetPort, source);
		if (CapellaUtils.hasStereotype(ce) && getAlgo().isPVMTExport()) {
			List<String> stereoNames = new ArrayList<String>();
			stereoNames.addAll(CapellaUtils.getListStereotypeName(ce));
			XMIExtensionsUtils.createStereotypeProperties(targetelement, stereoNames, "Port", sysMLID);
			EList<PropertyValueGroup> pvgs = ce.getOwnedPropertyValueGroups();
			for (PropertyValueGroup propertyValueGroup : pvgs) {
				PropertyValuePkg propertyValuePkgFromName = SpecificUtils
						.getProfilePropertyValueGroup(ProjectExt.getProject(source), propertyValueGroup.getName());
				Profile capellaObjectFromAllRules = (Profile) MappingRulesManager
						.getCapellaObjectFromAllRules(propertyValuePkgFromName);

				Stereotype ownedStereotype = capellaObjectFromAllRules
						.getOwnedStereotype(propertyValueGroup.getName().split("\\.")[1]);

				SpecificUtils.applyStereotypeAttribute(propertyValueGroup, targetelement, targetPort);

				getAlgo().getStereotypes().add(ownedStereotype);

				String typeBase = "Port";

				Port compStereo = UMLFactory.eINSTANCE.createPort();
				SpecificUtils.createCustoStereotypeApplication((Element) eaContainer, targetPort, model,
						propertyValueGroup, typeBase, compStereo, getAlgo());

			}
		}
		if (source.eContainer() instanceof PhysicalComponent) {
			PhysicalArchitecture physicalArchitecture = CapellaUtils.getPhysicalArchitecture(source);
			Profile capellaObjectFromAllRules = (Profile) MappingRulesManager
					.getCapellaObjectFromAllRules(physicalArchitecture);
			Stereotype ownedStereotype = capellaObjectFromAllRules.getOwnedStereotype("Component_Port");
			getAlgo().getStereotypes().add(ownedStereotype);

			List<String> stereoNames = new ArrayList<String>();
			stereoNames.add("Physical_Architecture::Component_Port");

			XMIExtensionsUtils.createStereotypeProperties(targetelement, stereoNames, "Port", sysMLID);
			SpecificUtils.applyComponentPortStereotypeAttribute(targetelement, source, targetPort);

			Port compStereo = UMLFactory.eINSTANCE.createPort();

			XMIResource res = (XMIResource) ((Element) eaContainer).eResource();
			SpecificUtils.addCustoRef(res, model, "Physical_Architecture:Component_Port", compStereo, false, true);
			getAlgo().getStereoNames().add("Physical_Architecture:Component_Port");

			String sysMLID2 = MappingUtils.getSysMLID(res, targetPort);
			if (sysMLID2 != null)
				SpecificUtils.addCustoAttr(res, compStereo, "base_Port" /* + typeBase */, sysMLID2);

			String kind = ((ComponentPort) source).getKind().getLiteral();
			String orientation = ((ComponentPort) source).getOrientation().getLiteral();

			SpecificUtils.addCustoAttr(res, compStereo, "Kind", kind);
			SpecificUtils.addCustoAttr(res, compStereo, "Direction", orientation);
		}

		targetPort.setName(source.getName());
		targetPort.setAggregation(AggregationKind.COMPOSITE_LITERAL);
		targetPort.setIsUnique(false);
		targetPort.setIsService(false);
		targetPort.setIsBehavior(true);

		return targetPort;
	}

	@Override
	public String getUID(EObject key, String id) {
		return "EAID_" + id;
	}

	@Override
	public void executeSubRules(List<ComponentPort> _capellaSource, MappingRulesManager manager) {

	}
}
