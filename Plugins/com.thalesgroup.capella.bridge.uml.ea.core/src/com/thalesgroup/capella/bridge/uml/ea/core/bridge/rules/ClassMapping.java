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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.PropertyValueGroup;
import org.polarsys.capella.core.data.capellacore.PropertyValuePkg;
import org.polarsys.capella.core.data.information.Class;
import org.polarsys.capella.core.data.information.DataPkg;
import org.polarsys.capella.core.model.helpers.ProjectExt;

import com.artal.capella.bridge.core.CapellaUtils;
import com.artal.capella.bridge.core.MappingUtils;
import com.artal.capella.bridge.core.rules.MappingRulesManager;
import com.artal.capella.bridge.core.rules.commons.CommonClassMapping;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.Capella2UMLAlgo;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.rules.utils.SpecificUtils;
import com.thalesgroup.capella.bridge.uml.ea.model.XMIExtensionsUtils;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.element;

/**
 * @author Yann BINOT
 *
 */
public class ClassMapping extends CommonClassMapping<Capella2UMLAlgo> {

	/**
	 * @param algo
	 * @param parent
	 * @param mappingExecution
	 */
	public ClassMapping(Capella2UMLAlgo algo, DataPkg parent, IMappingExecution mappingExecution) {
		super(algo, parent, mappingExecution);
	}

	@Override
	public Object compute(Object eaContainer, Class source) {
		Resource eResource = source.eResource();
		String sysMLID = MappingUtils.getSysMLID(eResource, source);

		DataType targetdataType = UMLFactory.eINSTANCE.createDataType();

		MappingUtils.generateUID(getAlgo(), source, targetdataType, this);
		element targetelement = XMIExtensionsUtils.createElement(targetdataType, getAlgo().getXMIExtension());
		targetdataType.setName(source.getName());
		((org.eclipse.uml2.uml.Package) eaContainer).getPackagedElements().add(targetdataType);
		CapellaElement ce = (CapellaElement) source;
		if (CapellaUtils.hasStereotype(ce) && getAlgo().isPVMTExport()) {
			List<String> stereoNames = new ArrayList<String>();
			stereoNames.addAll(CapellaUtils.getListStereotypeName(ce));
			XMIExtensionsUtils.createStereotypeProperties(targetelement, stereoNames, "Class", sysMLID);
			EList<PropertyValueGroup> pvgs = ce.getOwnedPropertyValueGroups();
			for (PropertyValueGroup propertyValueGroup : pvgs) {
				PropertyValuePkg propertyValuePkgFromName = SpecificUtils
						.getProfilePropertyValueGroup(ProjectExt.getProject(source), propertyValueGroup.getName());
				Profile capellaObjectFromAllRules = (Profile) MappingRulesManager
						.getCapellaObjectFromAllRules(propertyValuePkgFromName);

				Stereotype ownedStereotype = capellaObjectFromAllRules
						.getOwnedStereotype(propertyValueGroup.getName().split("\\.")[1]);

				SpecificUtils.applyStereotypeAttribute(propertyValueGroup, targetelement, targetdataType);

				getAlgo().getStereotypes().add(ownedStereotype);

				String typeBase = "Class";

				DataType compStereo = UMLFactory.eINSTANCE.createDataType();
				SpecificUtils.createCustoStereotypeApplication((Element) eaContainer, targetdataType,
						SpecificUtils.getModel(targetdataType, source), propertyValueGroup, typeBase, compStereo,
						getAlgo());

			}
		}

		return targetdataType;
	}

	@Override
	public void executeSubRules(List<Class> _capellaSource, MappingRulesManager manager) {

	}

}
