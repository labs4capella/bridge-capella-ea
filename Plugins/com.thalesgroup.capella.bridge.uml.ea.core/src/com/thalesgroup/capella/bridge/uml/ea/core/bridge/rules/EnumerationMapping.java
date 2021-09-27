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
import org.eclipse.uml2.uml.UMLFactory;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.information.DataPkg;
import org.polarsys.capella.core.data.information.datatype.DataType;
import org.polarsys.capella.core.data.information.datatype.Enumeration;
import org.polarsys.capella.core.data.information.datavalue.EnumerationLiteral;

import com.artal.capella.bridge.core.CapellaUtils;
import com.artal.capella.bridge.core.MappingUtils;
import com.artal.capella.bridge.core.rules.MappingRulesManager;
import com.artal.capella.bridge.core.rules.commons.CommonDatatypeMapping;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.Capella2UMLAlgo;
import com.thalesgroup.capella.bridge.uml.ea.model.XMIExtensionsUtils;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.attribute;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.attributes;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.element;

/**
 * @author Yann BINOT
 */
public class EnumerationMapping extends CommonDatatypeMapping<Capella2UMLAlgo> {

	/**
	 * @param algo
	 * @param parent
	 * @param mappingExecution
	 */
	public EnumerationMapping(Capella2UMLAlgo algo, DataPkg parent, IMappingExecution mappingExecution) {
		super(algo, parent, mappingExecution);
	}

	@Override
	public List<DataType> findSourceElements(DataPkg capellaContainer) {
		List<DataType> findSourceElements = super.findSourceElements(capellaContainer);

		List<DataType> enumerations = findSourceElements.stream().filter(e -> e instanceof Enumeration)
				.map(Enumeration.class::cast).collect(Collectors.toList());
		return enumerations;
	}

	@Override
	public Object compute(Object eaContainer, DataType source) {
		Enumeration enumSource = (Enumeration) source;
		org.eclipse.uml2.uml.Enumeration enumerationTarget = UMLFactory.eINSTANCE.createEnumeration();

		MappingUtils.generateUID(getAlgo(), source, enumerationTarget, this);

		element addElement = XMIExtensionsUtils.createElement(enumerationTarget, getAlgo().getXMIExtension());

		CapellaElement ce = (CapellaElement) source;
		if (!CapellaUtils.hasStereotype(ce) || !getAlgo().isPVMTExport()) {
			XMIExtensionsUtils.createProperties(addElement, false, false, "Enumeration", 0, "public", false, false);
		} else {
			XMIExtensionsUtils.createPropertiesWithStereotype(addElement, false, false, "Enumeration", 0, "public",
					false, false, CapellaUtils.getSterotypeName(ce));
		}

		// XMIExtensionsUtils.createProperties(addElement, false, false, "Enumeration",
		// 0, "public", false, false);

		enumerationTarget.setName(source.getName());

		EList<EnumerationLiteral> ownedLiterals = enumSource.getOwnedLiterals();
		attributes createAttributes = XMIExtensionsUtils.createAttributes(addElement);
		for (EnumerationLiteral enumerationLiteral : ownedLiterals) {
			org.eclipse.uml2.uml.EnumerationLiteral createEnumerationLiteral = UMLFactory.eINSTANCE
					.createEnumerationLiteral();
			MappingUtils.generateUID(getAlgo(), enumerationLiteral, createEnumerationLiteral, this);
			createEnumerationLiteral.setName(enumerationLiteral.getName());

			enumerationTarget.getOwnedLiterals().add(createEnumerationLiteral);
			toTrace(enumerationLiteral, createEnumerationLiteral);

			attribute createAttribute = XMIExtensionsUtils.createAttribute(createAttributes, createEnumerationLiteral,
					enumerationLiteral.getName());
			XMIExtensionsUtils.createStereotypeAttr(createAttribute, "enum");

		}

		((org.eclipse.uml2.uml.Package) eaContainer).getPackagedElements().add(enumerationTarget);

		return enumerationTarget;
	}

	@Override
	public void executeSubRules(List<DataType> _capellaSource, MappingRulesManager manager) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getUID(EObject key, String id) {
		// TODO Auto-generated method stub
		return "EAID_" + id;
	}

}
