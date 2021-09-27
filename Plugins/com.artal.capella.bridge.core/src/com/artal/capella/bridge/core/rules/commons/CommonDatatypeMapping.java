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
import org.polarsys.capella.core.data.information.DataPkg;
import org.polarsys.capella.core.data.information.datatype.DataType;

import com.artal.capella.bridge.core.CapellaBridgeAlgo;
import com.artal.capella.bridge.core.rules.AbstractDynamicMapping;
import com.artal.capella.bridge.core.rules.MappingRulesManager;

/**
 * @author Yann BINOT
 *
 */
public abstract class CommonDatatypeMapping<ALGO extends CapellaBridgeAlgo<?>>
		extends AbstractDynamicMapping<DataPkg, org.polarsys.capella.core.data.information.datatype.DataType, ALGO> {

	public CommonDatatypeMapping(ALGO algo, DataPkg parent, IMappingExecution mappingExecution) {
		super(algo, parent, mappingExecution);
	}

	@Override
	public Object computeTargetContainer(DataPkg capellaContainer) {

//		Project capellaProject = ProjectExt.getProject(capellaContainer);
//		Model model = (Model) MappingRulesManager.getCapellaObjectFromAllRules(capellaProject);
		return MappingRulesManager.getCapellaObjectFromAllRules(capellaContainer);
	}

	@Override
	public List<DataType> findSourceElements(DataPkg capellaContainer) {

		EList<DataType> ownedDataTypes = capellaContainer.getOwnedDataTypes();

//		List<DataType> primitives = EObjectExt.getAll(capellaContainer, DatatypePackage.Literals.DATA_TYPE).stream()
//				.map(DataType.class::cast).collect(Collectors.toList());

		return ownedDataTypes;

	}

}
