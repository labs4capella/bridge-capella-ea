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
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.UMLFactory;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.EnumerationPropertyLiteral;
import org.polarsys.capella.core.data.capellacore.EnumerationPropertyType;
import org.polarsys.capella.core.data.capellacore.PropertyValuePkg;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.core.model.helpers.ProjectExt;

import com.artal.capella.bridge.core.CapellaUtils;
import com.artal.capella.bridge.core.MappingUtils;
import com.artal.capella.bridge.core.rules.AbstractDynamicMapping;
import com.artal.capella.bridge.core.rules.MappingRulesManager;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.Capella2UMLAlgo;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.rules.utils.SpecificUtils;
import com.thalesgroup.capella.bridge.uml.ea.model.XMIExtensionsUtils;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiFactory;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.attribute;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.attributes;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.element;

/**
 * @author Yann BINOT
 */
public class EnumerationPropertyValueMapping
		extends AbstractDynamicMapping<PropertyValuePkg, EnumerationPropertyType, Capella2UMLAlgo> {

	public EnumerationPropertyValueMapping(Capella2UMLAlgo algo, PropertyValuePkg pvp,
			IMappingExecution mappingExecution) {
		super(algo, pvp, mappingExecution);
	}

	@Override
	public Object computeTargetContainer(PropertyValuePkg capellaContainer) {

		return getAlgo().getXMIExtension();

	}

	@Override
	public List<EnumerationPropertyType> findSourceElements(PropertyValuePkg capellaContainer) {

		return capellaContainer.getOwnedEnumerationPropertyTypes();
	}

	@Override
	public Object compute(Object eaContainer, EnumerationPropertyType source) {
		org.eclipse.uml2.uml.Enumeration enumerationTarget = UMLFactory.eINSTANCE.createEnumeration();

		MappingUtils.generateUID(getAlgo(), source, enumerationTarget, this);
		// Add element
		element addElement = XMIExtensionsUtils.createElement(enumerationTarget, getAlgo().getXMIExtension());

		CapellaElement ce = (CapellaElement) source;
		if (!CapellaUtils.hasStereotype(ce) || !getAlgo().isPVMTExport()) {
			XMIExtensionsUtils.createProperties(addElement, false, false, "Enumeration", 0, "public", false, false);
		} else {
			XMIExtensionsUtils.createPropertiesWithStereotype(addElement, false, false, "Enumeration", 0, "public",
					false, false, CapellaUtils.getSterotypeName(ce));
		}

		Project project = ProjectExt.getProject(source);
		Model capellaObjectFromAllRules = (Model) MappingRulesManager.getCapellaObjectFromAllRules(project);
		EList<PackageableElement> ownedMembers = ((Model) capellaObjectFromAllRules).getPackagedElements();
		for (PackageableElement ownedMember : ownedMembers) {
			if (ownedMember.getName().equals(SpecificUtils.getCapellaImportName(this)))
				((org.eclipse.uml2.uml.Package) ownedMember).getPackagedElements().add(enumerationTarget);
		}
		enumerationTarget.setName(source.getName());

		EList<EnumerationPropertyLiteral> ownedLiterals = source.getOwnedLiterals();
		if (ownedLiterals.size() > 1) {
			// Add attributes
			attributes attributes = XmiFactory.eINSTANCE.createattributes();

			addElement.setAttributes(attributes);
			for (EnumerationPropertyLiteral enumerationLiteral : ownedLiterals) {
				// Add attribute for each literal
				org.eclipse.uml2.uml.EnumerationLiteral createEnumerationLiteral = UMLFactory.eINSTANCE
						.createEnumerationLiteral();
				attribute attribute = XmiFactory.eINSTANCE.createattribute();
				attribute.setName(enumerationLiteral.getName());
				MappingUtils.generateUID(getAlgo(), enumerationLiteral, createEnumerationLiteral, this);
				createEnumerationLiteral.setName(enumerationLiteral.getName());
				attributes.getAttribute().add(attribute);
				enumerationTarget.getOwnedLiterals().add(createEnumerationLiteral);
				toTrace(enumerationLiteral, createEnumerationLiteral);
			}
		}

		// if (eaContainer instanceof xmi.Extension) {
		//
		// xmi.Extension extension = (xmi.Extension) eaContainer;
		// addElement.setClassifier(enumerationTarget);
		//
		// EList<Element> ownedMembers =
		// extension.getOwnedElements().add(enumerationTarget);
		// for (Element ownedMember : ownedMembers) {
		// // if (ownedMember.getName().equals("Import Capella"))
		// ((org.eclipse.uml2.uml.Package)
		// ownedMember).getPackagedElements().add(enumerationTarget);
		// }
		//
		// }
		// enumerationTarget.destroy();

		return enumerationTarget;
	}

	@Override
	public String getUID(EObject key, String id) {
		return "EAID_" + id;
	}

	@Override
	public void executeSubRules(List<EnumerationPropertyType> _capellaSource, MappingRulesManager manager) {

	}
}
