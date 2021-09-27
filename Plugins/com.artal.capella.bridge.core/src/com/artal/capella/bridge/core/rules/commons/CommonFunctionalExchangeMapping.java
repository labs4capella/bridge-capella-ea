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
import java.util.stream.Collectors;

import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.common.helpers.EObjectExt;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.fa.FaPackage;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.data.la.LogicalFunctionPkg;

import com.artal.capella.bridge.core.CapellaBridgeAlgo;
import com.artal.capella.bridge.core.CapellaUtils;
import com.artal.capella.bridge.core.rules.AbstractDynamicMapping;
import com.artal.capella.bridge.core.rules.MappingRulesManager;

/**
 * @author Yann BINOT
 *
 */
public abstract class CommonFunctionalExchangeMapping<SOURCE_CONTAINER extends CapellaElement, ALGO extends CapellaBridgeAlgo<?>>
		extends AbstractDynamicMapping<SOURCE_CONTAINER, org.polarsys.capella.core.data.fa.FunctionalExchange, ALGO> {

	public CommonFunctionalExchangeMapping(ALGO algo, SOURCE_CONTAINER parent, IMappingExecution mappingExecution) {
		super(algo, parent, mappingExecution);
	}

	@Override
	public Object computeTargetContainer(SOURCE_CONTAINER capellaContainer) {

		return MappingRulesManager.getCapellaObjectFromAllRules(capellaContainer);

	}

	@Override
	public List<FunctionalExchange> findSourceElements(SOURCE_CONTAINER capellaContainer) {

		LogicalFunctionPkg logicalFunctionPackage = CapellaUtils.getLogicalFunctionPackage(capellaContainer);
		List<FunctionalExchange> collect = EObjectExt
				.getAll(logicalFunctionPackage, FaPackage.eINSTANCE.getFunctionalExchange()).stream()
				.map(FunctionalExchange.class::cast).collect(Collectors.toList());

		return collect;
	}

	@Override
	public String getUID(EObject key, String id) {
		return "EAID_" + id;
	}

}
