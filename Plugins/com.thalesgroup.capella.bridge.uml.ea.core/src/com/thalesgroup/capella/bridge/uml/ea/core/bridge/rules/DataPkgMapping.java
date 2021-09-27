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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.UMLFactory;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.core.data.information.DataPkg;
import org.polarsys.capella.core.model.helpers.ProjectExt;

import com.artal.capella.bridge.core.MappingUtils;
import com.artal.capella.bridge.core.rules.AbstractDynamicMapping;
import com.artal.capella.bridge.core.rules.MappingRulesManager;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.Capella2UMLAlgo;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.rules.utils.SpecificUtils;

/**
 * @author Yann BINOT
 *
 */
public class DataPkgMapping extends AbstractDynamicMapping<CapellaElement, DataPkg, Capella2UMLAlgo> {

	/**
	 * @param algo
	 * @param parent
	 * @param mappingExecution
	 */
	public DataPkgMapping(Capella2UMLAlgo algo, CapellaElement parent, IMappingExecution mappingExecution) {
		super(algo, parent, mappingExecution);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object computeTargetContainer(CapellaElement capellaContainer) {
		if (!(capellaContainer instanceof DataPkg)) {
			Project project = ProjectExt.getProject(capellaContainer);
			Object capellaObjectFromAllRules = MappingRulesManager.getCapellaObjectFromAllRules(project);
			EList<PackageableElement> packagedElements = ((Model) capellaObjectFromAllRules).getPackagedElements();
			for (PackageableElement ownedMember : packagedElements) {
				if (ownedMember.getName().equals(SpecificUtils.getCapellaImportName(this)))
					return ownedMember;
			}
		}
		return MappingRulesManager.getCapellaObjectFromAllRules(capellaContainer);
	}

	@Override
	public List<DataPkg> findSourceElements(CapellaElement capellaContainer) {

		List<DataPkg> results = new ArrayList<DataPkg>();
		if (capellaContainer instanceof BlockArchitecture) {
			DataPkg ownedInterfacePkg = ((BlockArchitecture) capellaContainer).getOwnedDataPkg();
			results.add(ownedInterfacePkg);
		}
		if (capellaContainer instanceof DataPkg) {
			EList<DataPkg> ownedInterfacePkgs = ((DataPkg) capellaContainer).getOwnedDataPkgs();
			results.addAll(ownedInterfacePkgs);
		}
		return results;
	}

	@Override
	public Object compute(Object eaContainer, DataPkg source) {
		Package createPackage = UMLFactory.eINSTANCE.createPackage();
		createPackage.setName(source.getName());
		MappingUtils.generateUID(getAlgo(), source, createPackage, this);

		((Package) eaContainer).getPackagedElements().add(createPackage);

		return createPackage;
	}

	@Override
	public void executeSubRules(List<DataPkg> _capellaSource, MappingRulesManager manager) {
		for (DataPkg interfacePkg : _capellaSource) {
			DataPkgMapping interfacePkgMapping = new DataPkgMapping(getAlgo(), interfacePkg, getMappingExucution());
			manager.add(interfacePkgMapping.getClass().getName() + interfacePkg.getId(), interfacePkgMapping);
			EnumerationMapping enumerationMapping = new EnumerationMapping(getAlgo(), interfacePkg,
					getMappingExucution());
			manager.add(EnumerationMapping.class.getName() + interfacePkg.getId(), enumerationMapping);

			PrimitiveMapping primitiveMapping = new PrimitiveMapping(getAlgo(), interfacePkg, getMappingExucution());
			manager.add(primitiveMapping.getClass().getName() + interfacePkg.getId(), primitiveMapping);

			ClassMapping classMapping = new ClassMapping(getAlgo(), interfacePkg, getMappingExucution());
			manager.add(ClassMapping.class.getName() + interfacePkg.getId(), classMapping);

		}
	}

	@Override
	public String getUID(EObject key, String id) {
		return "EAPK_" + id;
	}

}
