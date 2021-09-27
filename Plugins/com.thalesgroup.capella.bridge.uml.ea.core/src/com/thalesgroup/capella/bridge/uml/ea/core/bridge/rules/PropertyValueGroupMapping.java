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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution;
import org.eclipse.emf.diffmerge.impl.scopes.AbstractEditableModelScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.polarsys.capella.core.data.capellacore.AbstractPropertyValue;
import org.polarsys.capella.core.data.capellacore.PropertyValueGroup;
import org.polarsys.capella.core.data.capellacore.PropertyValuePkg;
import org.polarsys.capella.core.model.helpers.ProjectExt;

import com.artal.capella.bridge.core.MappingUtils;
import com.artal.capella.bridge.core.rules.AbstractDynamicMapping;
import com.artal.capella.bridge.core.rules.MappingRulesManager;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.Capella2UMLAlgo;
import com.thalesgroup.capella.bridge.uml.ea.model.XMIExtensionsUtils;

/**
 * @author Yann BINOT
 */
public class PropertyValueGroupMapping
		extends AbstractDynamicMapping<PropertyValuePkg, PropertyValueGroup, Capella2UMLAlgo> {

	public PropertyValueGroupMapping(Capella2UMLAlgo algo, PropertyValuePkg pvp, IMappingExecution mappingExecution) {
		super(algo, pvp, mappingExecution);
	}

	@Override
	public Object computeTargetContainer(PropertyValuePkg capellaContainer) {

		Object container = MappingRulesManager.getCapellaObjectFromAllRules(capellaContainer);
		if (container != null) {
			return container;
		}
		// Project project = ProjectExt.getProject(capellaContainer);
		return null;
	}

	@Override
	public List<PropertyValueGroup> findSourceElements(PropertyValuePkg capellaContainer) {

		return capellaContainer.getOwnedPropertyValueGroups();
	}

	/**
	 * Sub property value package are transformed into stereotype
	 */
	@Override
	public Object compute(Object eaContainer, PropertyValueGroup source) {

		Stereotype stereo = null;
		if (eaContainer instanceof Profile) {
			Profile profile = (Profile) eaContainer;
			// profile.getPackagedElements().add(stereo);
			// stereo.setName(source.getName());
			stereo = profile.createOwnedStereotype(source.getName(), false);
			MappingUtils.generateUID(getAlgo(), source, stereo, this);
			Object targetDataSet = getMappingExucution().getTargetDataSet();
			ResourceSet targetResourceSet = MappingUtils
					.getTargetResourceSet((AbstractEditableModelScope) targetDataSet);
			Model uml = UML2Util.load(targetResourceSet, URI.createURI(UMLResource.UML_METAMODEL_URI),
					UMLPackage.Literals.MODEL);
			org.eclipse.uml2.uml.Class ownedType = (org.eclipse.uml2.uml.Class) uml.getOwnedType("Class");
			profile.createMetaclassReference(ownedType);
			stereo.createExtension(ownedType, false);
			XMIExtensionsUtils.createElement(stereo, getAlgo().getXMIExtension());// TODO

			PrimitiveType importPrimitiveType = importPrimitiveType(profile, "String", targetResourceSet);

			for (AbstractPropertyValue pv : source.getOwnedPropertyValues()) {
				Property property = UMLFactory.eINSTANCE.createProperty();
				MappingUtils.generateUID(getAlgo(), pv, property, this);
				stereo.getOwnedAttributes().add(property);
				property.setType(importPrimitiveType);
				property.setName(pv.getName());
				XMIExtensionsUtils.createElement(property, getAlgo().getXMIExtension());// TODO
			}
		}
		return stereo;
	}

	protected static PrimitiveType importPrimitiveType(org.eclipse.uml2.uml.Package package_, String name,
			ResourceSet rset) {
		org.eclipse.uml2.uml.Package umlLibrary = (org.eclipse.uml2.uml.Package) load(
				URI.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI), rset);
		PrimitiveType primitiveType = (PrimitiveType) umlLibrary.getOwnedType(name);
		package_.createElementImport(primitiveType);
		return primitiveType;
	}

	protected static org.eclipse.uml2.uml.Package load(URI uri, ResourceSet rset) {
		org.eclipse.uml2.uml.Package package_ = null;
		try {
			// Load the requested resource
			Resource resource = rset.getResource(uri, true);
			// Get the first (should be only) package from it
			package_ = (org.eclipse.uml2.uml.Package) EcoreUtil.getObjectByType(resource.getContents(),
					UMLPackage.Literals.PACKAGE);
		} catch (WrappedException we) {
			System.exit(1);
		}
		return package_;
	}

	@Override
	public String getUID(EObject key, String id) {
		return "EAID_" + id;
	}

	@Override
	public void executeSubRules(List<PropertyValueGroup> _capellaSource, MappingRulesManager manager) {

		Profile capellaObjectFromAllRules = (Profile) MappingRulesManager
				.getCapellaObjectFromAllRules(_capellaSource.get(0).eContainer());
		Model model = (Model) MappingRulesManager
				.getCapellaObjectFromAllRules(ProjectExt.getProject(_capellaSource.get(0)));
		capellaObjectFromAllRules.define();
		model.applyProfile(capellaObjectFromAllRules);

	}
}
