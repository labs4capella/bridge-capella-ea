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
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.VisibilityKind;
import org.polarsys.capella.core.data.capellacore.Type;
import org.polarsys.capella.core.data.information.ExchangeItem;
import org.polarsys.capella.core.data.information.ExchangeItemElement;

import com.artal.capella.bridge.core.MappingUtils;
import com.artal.capella.bridge.core.rules.MappingRulesManager;
import com.artal.capella.bridge.core.rules.commons.CommonExchangeItemElement;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.Capella2UMLAlgo;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.rules.utils.SpecificUtils;
import com.thalesgroup.capella.bridge.uml.ea.model.XMIExtensionsUtils;

/**
 * @author Yann BINOT
 *
 */
public class ShareDataExchangeItemElementMapping extends CommonExchangeItemElement<Capella2UMLAlgo> {

	/**
	 * @param algo
	 * @param parent
	 * @param mappingExecution
	 */
	public ShareDataExchangeItemElementMapping(Capella2UMLAlgo algo, ExchangeItem parent,
			IMappingExecution mappingExecution) {
		super(algo, parent, mappingExecution);
	}

	@Override
	public Object compute(Object eaContainer, ExchangeItemElement source) {
		Property targetProperty = UMLFactory.eINSTANCE.createProperty();
		MappingUtils.generateUID(getAlgo(), source, targetProperty, this);

		targetProperty.setName(source.getName());

		targetProperty.setVisibility(VisibilityKind.PUBLIC_LITERAL);
		targetProperty.setIsStatic(false);
		targetProperty.setIsReadOnly(false);
		targetProperty.setIsDerived(false);
		targetProperty.setIsOrdered(source.isOrdered());
		targetProperty.setIsUnique(source.isUnique());
		targetProperty.setIsDerivedUnion(false);

		Type type = source.getType();
		Object capellaObjectFromAllRules = MappingRulesManager.getCapellaObjectFromAllRules(type);
		if (capellaObjectFromAllRules instanceof org.eclipse.uml2.uml.Type) {
			targetProperty.setType((org.eclipse.uml2.uml.Type) capellaObjectFromAllRules);
		}

		if (eaContainer instanceof org.eclipse.uml2.uml.Class) {
			((org.eclipse.uml2.uml.Class) eaContainer).getOwnedAttributes().add(targetProperty);
		}

		if (capellaObjectFromAllRules != null) {
			Dependency createDependency = UMLFactory.eINSTANCE.createDependency();
			MappingUtils.generateUID(getAlgo(), source, createDependency, this, "d");
			createDependency.getClients().add((org.eclipse.uml2.uml.Class) eaContainer);
			createDependency.getSuppliers().add((org.eclipse.uml2.uml.Type) capellaObjectFromAllRules);
			Resource eResource = source.eResource();
			String sysMLID = MappingUtils.getSysMLID(eResource, source);
			XMIExtensionsUtils.addConnector(createDependency, getAlgo().getXMIExtension(), sysMLID, "Unspecified",
					"Dependency", (org.eclipse.uml2.uml.Class) eaContainer,
					(org.eclipse.uml2.uml.Type) capellaObjectFromAllRules, false);

			EList<PackageableElement> packagedElements = ((org.eclipse.uml2.uml.Class) eaContainer).getModel()
					.getPackagedElements();
			for (PackageableElement ownedMember : packagedElements) {
				if (ownedMember.getName().equals(SpecificUtils.getCapellaImportName(this)))
					((org.eclipse.uml2.uml.Package) ownedMember).getPackagedElements().add(createDependency);
			}
		}

		return targetProperty;
	}

	@Override
	public void executeSubRules(List<ExchangeItemElement> _capellaSource, MappingRulesManager manager) {

	}

	@Override
	public String getUID(EObject key, String id) {
		return "EAID_" + id;
	}

}
