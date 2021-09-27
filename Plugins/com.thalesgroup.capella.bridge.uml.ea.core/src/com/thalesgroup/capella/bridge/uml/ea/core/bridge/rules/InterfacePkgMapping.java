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
import org.polarsys.capella.core.data.cs.InterfacePkg;
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
public class InterfacePkgMapping extends AbstractDynamicMapping<CapellaElement, InterfacePkg, Capella2UMLAlgo> {

	/**
	 * @param algo
	 * @param parent
	 * @param mappingExecution
	 */
	public InterfacePkgMapping(Capella2UMLAlgo algo, CapellaElement parent, IMappingExecution mappingExecution) {
		super(algo, parent, mappingExecution);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object computeTargetContainer(CapellaElement capellaContainer) {
		if (!(capellaContainer instanceof InterfacePkg)) {
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
	public List<InterfacePkg> findSourceElements(CapellaElement capellaContainer) {

		List<InterfacePkg> results = new ArrayList<InterfacePkg>();
		if (capellaContainer instanceof BlockArchitecture) {
			InterfacePkg ownedInterfacePkg = ((BlockArchitecture) capellaContainer).getOwnedInterfacePkg();
			results.add(ownedInterfacePkg);
		}

		if (capellaContainer instanceof InterfacePkg) {
			EList<InterfacePkg> ownedInterfacePkgs = ((InterfacePkg) capellaContainer).getOwnedInterfacePkgs();
			results.addAll(ownedInterfacePkgs);
		}
		return results;
	}

	@Override
	public Object compute(Object eaContainer, InterfacePkg source) {
		Package createPackage = UMLFactory.eINSTANCE.createPackage();
		createPackage.setName(source.getName());
		MappingUtils.generateUID(getAlgo(), source, createPackage, this);

		((Package) eaContainer).getPackagedElements().add(createPackage);

		return createPackage;
	}

	@Override
	public void executeSubRules(List<InterfacePkg> _capellaSource, MappingRulesManager manager) {
		for (InterfacePkg interfacePkg : _capellaSource) {
			InterfacePkgMapping interfacePkgMapping = new InterfacePkgMapping(getAlgo(), interfacePkg,
					getMappingExucution());
			manager.add(interfacePkgMapping.getClass().getName() + interfacePkg.getId(), interfacePkgMapping);

//			InterfaceMapping interfaceMapping = new InterfaceMapping(getAlgo(), interfacePkg, getMappingExucution());
//			manager.add(interfaceMapping.getClass().getName() + interfacePkg.getId(), interfaceMapping);
		}
	}

	@Override
	public String getUID(EObject key, String id) {
		return "EAPK_" + id;
	}

}
