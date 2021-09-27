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

import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.UMLFactory;
import org.polarsys.capella.core.data.capellacore.AbstractPropertyValue;
import org.polarsys.capella.core.data.capellacore.PropertyValuePkg;
import org.polarsys.capella.core.data.capellacore.StringPropertyValue;
import org.polarsys.capella.core.data.capellamodeller.Project;

import com.artal.capella.bridge.core.MappingUtils;
import com.artal.capella.bridge.core.rules.AbstractDynamicMapping;
import com.artal.capella.bridge.core.rules.MappingRulesManager;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.Capella2UMLAlgo;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.Extension;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiFactory;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.profiles;

/**
 * @author Yann BINOT
 *
 */
public class RootPropertyValuePkgMapping extends AbstractDynamicMapping<Project, PropertyValuePkg, Capella2UMLAlgo> {

	public RootPropertyValuePkgMapping(Capella2UMLAlgo algo, Project project, IMappingExecution mappingExecution) {
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

	@Override
	public List<PropertyValuePkg> findSourceElements(Project capellaContainer) {

		for (PropertyValuePkg pvp : capellaContainer.getOwnedPropertyValuePkgs()) {
			if (pvp.getName().equals(("EXTENSIONS"))) {
				return pvp.getOwnedPropertyValuePkgs();
			}
		}
		;
		return null;
	}

	/**
	 * Root property value package is transformed into profiles -> profile
	 */
	@Override
	public Object compute(Object eaContainer, PropertyValuePkg source) {
		org.eclipse.uml2.uml.Profile profile = UMLFactory.eINSTANCE.createProfile();
		profile.setName(source.getName());
		profiles profiles = (profiles) eaContainer;
		profiles.getProfile().add(profile);
		// Package packageProfile = UMLFactory.eINSTANCE.createPackage();
		// MappingUtils.generateUID(getAlgo(), source, packageProfile, this);

		MappingUtils.generateUID(getAlgo(), source, profile, this);
		for (AbstractPropertyValue pv : source.getAppliedPropertyValues()) {
			if (pv.getName().equals("version")) {
				StringPropertyValue spv = (StringPropertyValue) pv;
				Comment comment = UMLFactory.eINSTANCE.createComment();
				comment.setBody(pv.getName() + " " + spv.getValue());
				profile.getOwnedComments().add(comment);
			}
		}

		getAlgo().getProfiles().add(profile);

		return profile;

	}

	@Override
	public String getUID(EObject key, String id) {
		return "EAID_" + id;
	}

	@Override
	public void executeSubRules(List<PropertyValuePkg> _capellaSource, MappingRulesManager manager) {

		for (PropertyValuePkg pvp : _capellaSource) {
			PropertyValueGroupMapping pvgMapping = new PropertyValueGroupMapping(getAlgo(), pvp, getMappingExucution());
			manager.add(PropertyValueGroupMapping.class.getName() + pvp.getId(), pvgMapping);

//			EnumerationPropertyValueMapping epvMapping = new EnumerationPropertyValueMapping(getAlgo(), pvp,
//					getMappingExucution());
//			manager.add(EnumerationPropertyValueMapping.class.getName() + pvp.getId(), epvMapping);

		}

	}
}
