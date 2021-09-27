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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution;
import org.eclipse.emf.diffmerge.impl.scopes.AbstractEditableModelScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.core.data.pa.PhysicalArchitecture;

import com.artal.capella.bridge.core.CapellaUtils;
import com.artal.capella.bridge.core.MappingUtils;
import com.artal.capella.bridge.core.rules.AbstractDynamicMapping;
import com.artal.capella.bridge.core.rules.MappingRulesManager;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.Capella2UMLAlgo;
import com.thalesgroup.capella.bridge.uml.ea.model.XMIExtensionsUtils;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.Extension;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiFactory;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.profiles;

/**
 * @author Yann BINOT
 *
 */
public class PhysicalProfileMapping extends AbstractDynamicMapping<Project, PhysicalArchitecture, Capella2UMLAlgo> {

	public PhysicalProfileMapping(Capella2UMLAlgo algo, Project project, IMappingExecution mappingExecution) {
		super(algo, project, mappingExecution);
	}

	@Override
	public Object computeTargetContainer(Project capellaContainer) {

		Extension extension = getAlgo().getXMIExtension();
		profiles profiles = extension.getProfiles();
		if (profiles == null) {
			extension.setProfiles(XmiFactory.eINSTANCE.createprofiles());
		}
		return extension.getProfiles();
	}

	// @Override
	// public PhysicalArchitecture findSourceElements(Project capellaContainer) {
	//
	// return CapellaUtils.getPhysicalArchitecture(capellaContainer);
	// }

	/**
	 * Root property value package is transformed into profiles -> profile
	 */
	@Override
	public Object compute(Object eaContainer, PhysicalArchitecture source) {
		org.eclipse.uml2.uml.Profile profile = UMLFactory.eINSTANCE.createProfile();
		profiles profiles = (profiles) eaContainer;
		profiles.getProfile().add(profile);
		profile.setName("Physical_Architecture");
		getAlgo().getProfiles().add(profile);
		MappingUtils.generateUID(getAlgo(), source, profile, this);

		Stereotype nodeStereotype = UMLFactory.eINSTANCE.createStereotype();
		nodeStereotype.setName("Physical_Component");
		MappingUtils.generateUID(getAlgo(), source, nodeStereotype, this, "n");
		profile.getPackagedElements().add(nodeStereotype);

		Stereotype compoPortStereotype = UMLFactory.eINSTANCE.createStereotype();
		compoPortStereotype.setName("Component_Port");
		MappingUtils.generateUID(getAlgo(), source, compoPortStereotype, this, "p");
		profile.getPackagedElements().add(compoPortStereotype);

		Stereotype compoExStereotype = UMLFactory.eINSTANCE.createStereotype();
		compoExStereotype.setName("Exchange_Interface");
		MappingUtils.generateUID(getAlgo(), source, compoExStereotype, this, "e");
		profile.getPackagedElements().add(compoExStereotype);

		Stereotype compoCapStereotype = UMLFactory.eINSTANCE.createStereotype();
		compoCapStereotype.setName("Capella");
		MappingUtils.generateUID(getAlgo(), source, compoCapStereotype, this, "c");
		profile.getPackagedElements().add(compoCapStereotype);

		Object targetDataSet = getMappingExucution().getTargetDataSet();
		ResourceSet targetResourceSet = MappingUtils.getTargetResourceSet((AbstractEditableModelScope) targetDataSet);
		Model uml = UML2Util.load(targetResourceSet, URI.createURI(UMLResource.UML_METAMODEL_URI),
				UMLPackage.Literals.MODEL);

		org.eclipse.uml2.uml.Class ownedType = (org.eclipse.uml2.uml.Class) uml.getOwnedType("Component");
		profile.createMetaclassReference(ownedType);
		nodeStereotype.createExtension(ownedType, false);

		org.eclipse.uml2.uml.Class ownedType2 = (org.eclipse.uml2.uml.Class) uml.getOwnedType("Port");
		profile.createMetaclassReference(ownedType2);
		compoPortStereotype.createExtension(ownedType2, false);

		org.eclipse.uml2.uml.Class ownedType3 = (org.eclipse.uml2.uml.Class) uml.getOwnedType("Interface");
		profile.createMetaclassReference(ownedType3);
		compoExStereotype.createExtension(ownedType3, false);

		org.eclipse.uml2.uml.Class ownedType4 = (org.eclipse.uml2.uml.Class) uml.getOwnedType("Operation");
		profile.createMetaclassReference(ownedType4);
		compoCapStereotype.createExtension(ownedType4, false);

		Property kindProp = UMLFactory.eINSTANCE.createProperty();
		kindProp.setName("Kind");
		MappingUtils.generateUID(getAlgo(), source, kindProp, this, "k");
		Property natureProp = UMLFactory.eINSTANCE.createProperty();
		natureProp.setName("Nature");
		MappingUtils.generateUID(getAlgo(), source, kindProp, this, "n");
		nodeStereotype.getOwnedAttributes().add(kindProp);
		nodeStereotype.getOwnedAttributes().add(natureProp);
		XMIExtensionsUtils.createElement(kindProp, getAlgo().getXMIExtension());
		XMIExtensionsUtils.createElement(natureProp, getAlgo().getXMIExtension());

		Property kindProp2 = UMLFactory.eINSTANCE.createProperty();
		kindProp2.setName("Kind");
		MappingUtils.generateUID(getAlgo(), source, kindProp2, this, "kp");
		Property directionProp = UMLFactory.eINSTANCE.createProperty();
		directionProp.setName("Direction");
		MappingUtils.generateUID(getAlgo(), source, directionProp, this, "d");
		compoPortStereotype.getOwnedAttributes().add(kindProp2);
		compoPortStereotype.getOwnedAttributes().add(directionProp);
		XMIExtensionsUtils.createElement(kindProp2, getAlgo().getXMIExtension());
		XMIExtensionsUtils.createElement(directionProp, getAlgo().getXMIExtension());

		Property srcCapellaID = UMLFactory.eINSTANCE.createProperty();
		srcCapellaID.setName("SrcCapellaID");
		MappingUtils.generateUID(getAlgo(), source, srcCapellaID, this, "si");
		Property targetCapellaID = UMLFactory.eINSTANCE.createProperty();
		targetCapellaID.setName("TargetCapellaID");
		MappingUtils.generateUID(getAlgo(), source, targetCapellaID, this, "ti");
		compoExStereotype.getOwnedAttributes().add(srcCapellaID);
		compoExStereotype.getOwnedAttributes().add(targetCapellaID);
		XMIExtensionsUtils.createElement(srcCapellaID, getAlgo().getXMIExtension());
		XMIExtensionsUtils.createElement(targetCapellaID, getAlgo().getXMIExtension());

		profile.define();

		XMIExtensionsUtils.createElement(nodeStereotype, getAlgo().getXMIExtension());
		XMIExtensionsUtils.createElement(compoPortStereotype, getAlgo().getXMIExtension());
		XMIExtensionsUtils.createElement(compoExStereotype, getAlgo().getXMIExtension());
		XMIExtensionsUtils.createElement(compoCapStereotype, getAlgo().getXMIExtension());
		return profile;

	}

	@Override
	public String getUID(EObject key, String id) {
		return "EAID_" + id;
	}

	@Override
	public List<PhysicalArchitecture> findSourceElements(Project capellaContainer) {
		List<PhysicalArchitecture> result = new ArrayList<PhysicalArchitecture>();
		result.add(CapellaUtils.getPhysicalArchitecture(capellaContainer));

		return result;
	}

	@Override
	public void executeSubRules(List<PhysicalArchitecture> _capellaSource, MappingRulesManager manager) {

	}

}
