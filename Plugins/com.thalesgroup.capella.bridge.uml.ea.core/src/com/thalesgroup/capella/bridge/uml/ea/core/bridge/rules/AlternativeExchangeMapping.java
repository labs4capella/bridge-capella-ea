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
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.polarsys.capella.common.helpers.EObjectExt;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.PropertyValueGroup;
import org.polarsys.capella.core.data.capellacore.PropertyValuePkg;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.FaPackage;
import org.polarsys.capella.core.data.information.Port;
import org.polarsys.capella.core.data.pa.PhysicalArchitecture;
import org.polarsys.capella.core.data.pa.PhysicalComponent;
import org.polarsys.capella.core.model.helpers.ProjectExt;

import com.artal.capella.bridge.core.CapellaUtils;
import com.artal.capella.bridge.core.MappingUtils;
import com.artal.capella.bridge.core.rules.MappingRulesManager;
import com.artal.capella.bridge.core.rules.commons.CommonComponentExchangeMapping;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.Capella2UMLAlgo;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.rules.utils.SpecificUtils;
import com.thalesgroup.capella.bridge.uml.ea.model.XMIExtensionsUtils;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.element;

/**
 * @author Yann BINOT
 *
 */
public class AlternativeExchangeMapping extends CommonComponentExchangeMapping<Capella2UMLAlgo> {

	/**
	 * @param algo
	 * @param parent
	 * @param mappingExecution
	 */
	public AlternativeExchangeMapping(Capella2UMLAlgo algo, Component parent, IMappingExecution mappingExecution) {
		super(algo, parent, mappingExecution);
	}

	@Override
	public Object computeTargetContainer(CapellaElement capellaContainer) {

		Project project = ProjectExt.getProject(capellaContainer);
		Model capellaObjectFromAllRules = (Model) MappingRulesManager.getCapellaObjectFromAllRules(project);
		EList<PackageableElement> packagedElements = capellaObjectFromAllRules.getPackagedElements();
		for (PackageableElement ownedMember : packagedElements) {
			if (ownedMember.getName().equals(SpecificUtils.getCapellaImportName(this))) {
				EList<PackageableElement> packagedElements2 = ((Package) ownedMember).getPackagedElements();
				for (PackageableElement packageableElement : packagedElements2) {
					if (packageableElement.getName().equals("Interfaces")) {
						return packageableElement;
					}
				}
			}
		}

		return MappingRulesManager.getCapellaObjectFromAllRules(project);
	}

	@Override
	public List<ComponentExchange> findSourceElements(CapellaElement capellaContainer) {
		PhysicalComponent logicalSystemRoot = CapellaUtils.getPhysicalSystemRoot(capellaContainer);
		List<ComponentExchange> collect = EObjectExt.getAll(logicalSystemRoot, FaPackage.Literals.COMPONENT_EXCHANGE)
				.stream().map(ComponentExchange.class::cast).collect(Collectors.toList());
		return collect;
	}

	@Override
	public Object compute(Object eaContainer, ComponentExchange source) {
		Interface createInterface = UMLFactory.eINSTANCE.createInterface();
		MappingUtils.generateUID(getAlgo(), source, createInterface, this);
		((Package) eaContainer).getPackagedElements().add(createInterface);
		createInterface.setName(source.getName());
		element targetelement = XMIExtensionsUtils.createElement(createInterface, getAlgo().getXMIExtension());
		Resource eResource = source.eResource();
		String sysMLID = MappingUtils.getSysMLID(eResource, source);
		CapellaElement ce = (CapellaElement) source;
		List<String> stereoNames = new ArrayList<String>();
		Model model = SpecificUtils.getModel(createInterface, source);
		if (CapellaUtils.hasStereotype(ce) && getAlgo().isPVMTExport()) {
			String sterotypeName = CapellaUtils.getSterotypeName(ce);
			stereoNames.add(sterotypeName);
			XMIExtensionsUtils.createStereotypeProperties(targetelement, stereoNames, "Interface", sysMLID);
			EList<PropertyValueGroup> pvgs = ce.getOwnedPropertyValueGroups();
			for (PropertyValueGroup propertyValueGroup : pvgs) {
				PropertyValuePkg propertyValuePkgFromName = SpecificUtils
						.getProfilePropertyValueGroup(ProjectExt.getProject(source), propertyValueGroup.getName());
				Profile capellaObjectFromAllRules = (Profile) MappingRulesManager
						.getCapellaObjectFromAllRules(propertyValuePkgFromName);

				Stereotype ownedStereotype = capellaObjectFromAllRules
						.getOwnedStereotype(propertyValueGroup.getName().split("\\.")[1]);

				getAlgo().getStereotypes().add(ownedStereotype);

				String typeBase = "Interface";

				Interface compStereo = UMLFactory.eINSTANCE.createInterface();
				SpecificUtils.createCustoStereotypeApplication((Element) eaContainer, createInterface, model,
						propertyValueGroup, typeBase, compStereo, getAlgo());

			}
		}

		PhysicalArchitecture physicalArchitecture = CapellaUtils.getPhysicalArchitecture(source);
		Profile capellaObjectFromAllRules = (Profile) MappingRulesManager
				.getCapellaObjectFromAllRules(physicalArchitecture);
		Stereotype ownedStereotype = capellaObjectFromAllRules.getOwnedStereotype("Exchange_Interface");
		getAlgo().getStereotypes().add(ownedStereotype);

		stereoNames.add("Physical_Architecture::Exchange_Interface");
		XMIExtensionsUtils.createStereotypeProperties(targetelement, stereoNames, "Interface", sysMLID);
		SpecificUtils.applyComponentExchangeStereotypeAttribute(targetelement, source, createInterface);

		Interface compStereo = UMLFactory.eINSTANCE.createInterface();

		XMIResource res = (XMIResource) ((Element) eaContainer).eResource();
		SpecificUtils.addCustoRef(res, model, "Physical_Architecture:Exchange_Interface", compStereo, false, true);
		getAlgo().getStereoNames().add("Physical_Architecture:Exchange_Interface");

		String sysMLID2 = MappingUtils.getSysMLID(res, createInterface);
		if (sysMLID2 != null)
			SpecificUtils.addCustoAttr(res, compStereo, "base_Interface" /* + typeBase */, sysMLID2);

		Port sourcePort = source.getSourcePort();
		String sysMLIDSource = MappingUtils.getSysMLID(eResource, sourcePort);

		Port targetPort = source.getTargetPort();
		String sysMLIDTarget = MappingUtils.getSysMLID(eResource, targetPort);

		SpecificUtils.addCustoAttr(res, compStereo, "SrcCapellaID", sysMLIDSource);
		SpecificUtils.addCustoAttr(res, compStereo, "TargetCapellaID", sysMLIDTarget);

		return createInterface;
	}

	@Override
	public void executeSubRules(List<ComponentExchange> _capellaSource, MappingRulesManager manager) {
		for (ComponentExchange componentExchange : _capellaSource) {
			AlternativeExchangeItemMapping itemMapping = new AlternativeExchangeItemMapping(getAlgo(),
					componentExchange, getMappingExucution());
			manager.add(itemMapping.getClass().getName() + componentExchange.getId(), itemMapping);
		}

	}

	@Override
	public String getUID(EObject key, String id) {
		return "EAID_" + id;
	}

}
