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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution;
import org.eclipse.emf.diffmerge.impl.scopes.AbstractEditableModelScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.VisibilityKind;
import org.polarsys.capella.common.helpers.EObjectExt;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.cs.CsPackage;
import org.polarsys.capella.core.data.information.Class;
import org.polarsys.capella.core.data.information.DataPkg;
import org.polarsys.capella.core.data.information.InformationPackage;
import org.polarsys.capella.core.data.pa.PhysicalArchitecture;
import org.polarsys.capella.core.data.pa.PhysicalComponent;

import com.artal.capella.bridge.core.CapellaUtils;
import com.artal.capella.bridge.core.MappingUtils;
import com.artal.capella.bridge.core.rules.AbstractDynamicMapping;
import com.artal.capella.bridge.core.rules.MappingRulesManager;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.Capella2UMLAlgo;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.rules.utils.SpecificUtils;
import com.thalesgroup.capella.bridge.uml.ea.model.XMIExtensionsUtils;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.Documentation;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.Extension;

/**
 * @author Yann BINOT
 */
public class AlternativePhysicalRootMapping extends AbstractDynamicMapping<Project, Project, Capella2UMLAlgo> {

	private boolean _pvmtExport = false;

	public AlternativePhysicalRootMapping(Capella2UMLAlgo algo, Project parent, IMappingExecution execution,
			boolean exportPVMT) {
		super(algo, parent, execution);
		_pvmtExport = exportPVMT;
	}

	@Override
	public Object computeTargetContainer(Project capellaContainer) {

		Object targetDataSet = getMappingExucution().getTargetDataSet();

		Documentation documentationObject = XMIExtensionsUtils.createEnterpriseArchitectDocumentation();

		((AbstractEditableModelScope) targetDataSet).add(documentationObject);

		Model model = UMLFactory.eINSTANCE.createModel();
		Resource eResource = capellaContainer.eResource();
		String sysMLID = MappingUtils.getSysMLID(eResource, capellaContainer);
		getAlgo().putId(model, this, sysMLID);
		((AbstractEditableModelScope) targetDataSet).add(model);
		model.setName("EA_Model");
		model.setVisibility(VisibilityKind.PUBLIC_LITERAL);

		Package createPackage = UMLFactory.eINSTANCE.createPackage();
		createPackage.setName(SpecificUtils.getCapellaImportName(this));
		PhysicalArchitecture physicalArchitecture = CapellaUtils.getPhysicalArchitecture(capellaContainer);
		String sysMLID2 = MappingUtils.getSysMLID(eResource, physicalArchitecture) + "a";
		getAlgo().putId(createPackage, this, sysMLID2);
		model.getPackagedElements().add(createPackage);

		Package createPackageInterface = UMLFactory.eINSTANCE.createPackage();
		createPackageInterface.setName("Interfaces");
		getAlgo().putId(createPackageInterface, this, sysMLID + "I");
		createPackage.getPackagedElements().add(createPackageInterface);

		Extension extensionObject = XMIExtensionsUtils
				.createEnterpriseArchitectExtension(model.getPackagedElements().get(0));
		getAlgo().setXMIExtension(extensionObject);

		((AbstractEditableModelScope) targetDataSet).add(extensionObject);

		return model;

	}

	static public Profile getProfile(String uri, ResourceSet rset) {
		URI pURI = URI.createURI(uri, false);
		Resource resource = rset.getResource(pURI, true);
		Profile umlStdProfile = (Profile) resource.getContents().get(0);
		return umlStdProfile;

	}

	@Override
	public List<Project> findSourceElements(Project capellaContainer) {
		List<Project> results = new ArrayList<Project>();
		results.add(capellaContainer);
		return results;
	}

	@Override
	public Object compute(Object eaContainer, Project source) {
		return eaContainer;
	}

	@Override
	public void executeSubRules(List<Project> _capellaSource, MappingRulesManager manager) {

		Project project = _capellaSource.get(0);

		PhysicalArchitecture physicalArchitecture = CapellaUtils.getPhysicalArchitecture(project);
		if (physicalArchitecture == null) {
			return;
		}

		if (_pvmtExport) {
			RootPropertyValuePkgMapping pvpMapping = new RootPropertyValuePkgMapping(getAlgo(), project,
					getMappingExucution());
			manager.add(RootPropertyValuePkgMapping.class.getName() + project.getId(), pvpMapping);
		}
		PhysicalProfileMapping ppMapping = new PhysicalProfileMapping(getAlgo(), project, getMappingExucution());
		manager.add(PhysicalProfileMapping.class.getName() + project.getId(), ppMapping);

		DataPkgMapping dataPkgMapping = new DataPkgMapping(getAlgo(), physicalArchitecture, getMappingExucution());
		manager.add(dataPkgMapping.getClass().getName() + physicalArchitecture.getId(), dataPkgMapping);

		DataPkg dataPkgRoot = CapellaUtils.getDataPkgRoot(project, PhysicalArchitecture.class);
		List<Class> classes = EObjectExt.getAll(dataPkgRoot, InformationPackage.Literals.CLASS).stream()
				.map(Class.class::cast).collect(Collectors.toList());
		for (Class class1 : classes) {
			PropertyMapping propertyMapping = new PropertyMapping(getAlgo(), class1, getMappingExucution());
			manager.add(propertyMapping.getClass().getName() + class1.getId(), propertyMapping);
		}

		PhysicalComponent physicalSystemRoot = CapellaUtils.getPhysicalSystemRoot(project);
		if (physicalSystemRoot != null) {
			AlternativeExchangeMapping alternativeExchangeMapping = new AlternativeExchangeMapping(getAlgo(),
					physicalSystemRoot, getMappingExucution());
			manager.add(alternativeExchangeMapping.getClass().getName() + physicalSystemRoot.getId(),
					alternativeExchangeMapping);
		}

		ComponentMapping componentMapping = new AlternativeComponentMapping(getAlgo(), physicalArchitecture,
				getMappingExucution());
		manager.add(componentMapping.getClass().getName() + physicalArchitecture.getId(), componentMapping);

		ActorPkgMapping actorPkgMapping = new ActorPkgMapping(getAlgo(), physicalArchitecture, getMappingExucution());
		manager.add(actorPkgMapping.getClass().getName() + physicalArchitecture.getId(), actorPkgMapping);

		List<Component> collect = EObjectExt.getAll(physicalArchitecture, CsPackage.Literals.COMPONENT).stream()
				.map(Component.class::cast).collect(Collectors.toList());
		for (Component component : collect) {
			AlternativeAssociationMapping mapping = new AlternativeAssociationMapping(getAlgo(), component,
					getMappingExucution());
			manager.add(mapping.getClass().getName() + component.getId(), mapping);
		}
		DescriptionMapping descriptionMapping = new DescriptionMapping(getAlgo(), physicalArchitecture,
				getMappingExucution());
		manager.add(descriptionMapping.getClass().getName() + physicalArchitecture.getId(), descriptionMapping);

	}

	@Override
	public String getUID(EObject key, String id) {
		if (key instanceof Model) {
			return "MX_EAID_" + id;
		} else if (key instanceof org.eclipse.uml2.uml.Package) {
			return "EAPK_" + id;
		}
		return "";
	}

}
