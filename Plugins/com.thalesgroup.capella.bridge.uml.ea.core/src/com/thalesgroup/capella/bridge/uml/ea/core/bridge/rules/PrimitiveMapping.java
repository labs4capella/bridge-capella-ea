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
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.PropertyValueGroup;
import org.polarsys.capella.core.data.capellacore.PropertyValuePkg;
import org.polarsys.capella.core.data.information.DataPkg;
import org.polarsys.capella.core.data.information.datatype.BooleanType;
import org.polarsys.capella.core.data.information.datatype.DataType;
import org.polarsys.capella.core.data.information.datatype.NumericType;
import org.polarsys.capella.core.data.information.datatype.PhysicalQuantity;
import org.polarsys.capella.core.data.information.datatype.StringType;
import org.polarsys.capella.core.data.information.datavalue.LiteralNumericValue;
import org.polarsys.capella.core.data.information.datavalue.NumericValue;
import org.polarsys.capella.core.model.helpers.ProjectExt;

import com.artal.capella.bridge.core.CapellaUtils;
import com.artal.capella.bridge.core.MappingUtils;
import com.artal.capella.bridge.core.rules.MappingRulesManager;
import com.artal.capella.bridge.core.rules.commons.CommonDatatypeMapping;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.Capella2UMLAlgo;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.rules.utils.SpecificUtils;
import com.thalesgroup.capella.bridge.uml.ea.model.XMIExtensionsUtils;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.constraints;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.element;

/**
 * @author Yann BINOT
 *
 */
public class PrimitiveMapping extends CommonDatatypeMapping<Capella2UMLAlgo> {

	/**
	 * @param algo
	 * @param parent
	 * @param mappingExecution
	 */
	public PrimitiveMapping(Capella2UMLAlgo algo, DataPkg parent, IMappingExecution mappingExecution) {
		super(algo, parent, mappingExecution);
	}

	public boolean isPrimitiveType(DataType type) {
		return (type instanceof NumericType) || type instanceof StringType || type instanceof BooleanType;
	}

	@Override
	public List<DataType> findSourceElements(DataPkg capellaContainer) {

		List<DataType> findSourceElements = super.findSourceElements(capellaContainer);
		List<DataType> primitives = findSourceElements.stream().filter(dt -> isPrimitiveType(dt))
				.collect(Collectors.toList());
		return primitives;

	}

	@Override
	public Object compute(Object eaContainer, DataType source) {
		org.eclipse.uml2.uml.DataType targetPrimitiveType = null;

		if (source instanceof PhysicalQuantity) {
			targetPrimitiveType = UMLFactory.eINSTANCE.createDataType();
		} else {
			targetPrimitiveType = UMLFactory.eINSTANCE.createPrimitiveType();
		}

		MappingUtils.generateUID(getAlgo(), source, targetPrimitiveType, this);
		((org.eclipse.uml2.uml.Package) eaContainer).getPackagedElements().add(targetPrimitiveType);
		element createElement = XMIExtensionsUtils.createElement(targetPrimitiveType, getAlgo().getXMIExtension());

		CapellaElement ce = (CapellaElement) source;
		if (CapellaUtils.hasStereotype(ce) && getAlgo().isPVMTExport()) {
			XMIExtensionsUtils.createStereotypeProperties(createElement, CapellaUtils.getSterotypeName(ce), "DataType");
			EList<PropertyValueGroup> pvgs = ce.getOwnedPropertyValueGroups();
			for (PropertyValueGroup propertyValueGroup : pvgs) {
				PropertyValuePkg propertyValuePkgFromName = SpecificUtils
						.getProfilePropertyValueGroup(ProjectExt.getProject(source), propertyValueGroup.getName());
				Profile capellaObjectFromAllRules = (Profile) MappingRulesManager
						.getCapellaObjectFromAllRules(propertyValuePkgFromName);

				Stereotype ownedStereotype = capellaObjectFromAllRules
						.getOwnedStereotype(propertyValueGroup.getName().split("\\.")[1]);

				getAlgo().getStereotypes().add(ownedStereotype);

				String typeBase = "DataType";

				org.eclipse.uml2.uml.DataType compStereo = UMLFactory.eINSTANCE.createDataType();
				SpecificUtils.createCustoStereotypeApplication((Element) eaContainer, targetPrimitiveType,
						SpecificUtils.getModel(targetPrimitiveType, source), propertyValueGroup, typeBase, compStereo,
						getAlgo());

			}
		}

		targetPrimitiveType.setName(source.getName());

		constraints createConstraints = XMIExtensionsUtils.createConstraints(createElement);

		if (source instanceof NumericType) {
			NumericValue ownedMaxValue = ((NumericType) source).getOwnedMaxValue();
			if (ownedMaxValue != null && ownedMaxValue instanceof LiteralNumericValue) {
				LiteralInteger maxInteger = UMLFactory.eINSTANCE.createLiteralInteger();
				MappingUtils.generateUID(getAlgo(), ownedMaxValue, maxInteger, this);
				maxInteger.setValue(1);

				String label2 = ((LiteralNumericValue) ownedMaxValue).getValue();
				XMIExtensionsUtils.addConstraint(createConstraints, "max = " + label2, "Invariant", "0,00", "Approved");
			}

			NumericValue ownedMinValue = ((NumericType) source).getOwnedMinValue();
			if (ownedMinValue != null && ownedMinValue instanceof LiteralNumericValue) {
				LiteralInteger minInteger = UMLFactory.eINSTANCE.createLiteralInteger();
				MappingUtils.generateUID(getAlgo(), ownedMinValue, minInteger, this);
				minInteger.setValue(1);
				String label = ((LiteralNumericValue) ownedMinValue).getValue();
				XMIExtensionsUtils.addConstraint(createConstraints, "min = " + label, "Invariant", "0,00", "Approved");
			}
		}

		return targetPrimitiveType;
	}

	@Override
	public void executeSubRules(List<DataType> _capellaSource, MappingRulesManager manager) {

	}

	@Override
	public String getUID(EObject key, String id) {
		return "EAID_" + id;
	}

}
