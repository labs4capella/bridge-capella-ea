/*******************************************************************************
* Copyright (c) 2021 THALES GLOBAL SERVICES.
* All right reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* Contributors:
*     Artal Technologies - initial API and implementation
*******************************************************************************/
package com.artal.capella.bridge.core.rules.commons;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.information.Class;
import org.polarsys.capella.core.data.information.DataPkg;

import com.artal.capella.bridge.core.CapellaBridgeAlgo;
import com.artal.capella.bridge.core.rules.AbstractDynamicMapping;
import com.artal.capella.bridge.core.rules.MappingRulesManager;

public abstract class CommonClassMapping<ALGO extends CapellaBridgeAlgo<?>>
		extends AbstractDynamicMapping<DataPkg, org.polarsys.capella.core.data.information.Class, ALGO> {

	public CommonClassMapping(ALGO algo, DataPkg parent, IMappingExecution mappingExecution) {
		super(algo, parent, mappingExecution);
	}

	@Override
	public Object computeTargetContainer(DataPkg capellaContainer) {

//		Project capellaProject = ProjectExt.getProject(capellaContainer);
		return MappingRulesManager.getCapellaObjectFromAllRules(capellaContainer);
//		return model;
	}

	@Override
	public List<Class> findSourceElements(DataPkg capellaContainer) {

		EList<Class> ownedClasses = capellaContainer.getOwnedClasses();
//		List<Class> classes = EObjectExt.getAll(capellaContainer, InformationPackage.Literals.CLASS).stream()
//				.map(Class.class::cast).collect(Collectors.toList());
		return ownedClasses;
	}

	@Override
	public String getUID(EObject key, String id) {
		return "EAID_" + id;
	}
}
