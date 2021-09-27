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
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.fa.ComponentPort;

import com.artal.capella.bridge.core.CapellaBridgeAlgo;
import com.artal.capella.bridge.core.rules.AbstractDynamicMapping;
import com.artal.capella.bridge.core.rules.MappingRulesManager;

/**
 * @author Yann BINOT
 *
 */
public abstract class CommonPortMapping<ALGO extends CapellaBridgeAlgo<?>> extends
		AbstractDynamicMapping<org.polarsys.capella.core.data.cs.Component, org.polarsys.capella.core.data.fa.ComponentPort, ALGO> {

	public CommonPortMapping(ALGO algo, Component parent, IMappingExecution mappingExecution) {
		super(algo, parent, mappingExecution);
	}

	@Override
	public Object computeTargetContainer(Component capellaContainer) {
		return MappingRulesManager.getCapellaObjectFromAllRules(capellaContainer);
	}

	@Override
	public List<ComponentPort> findSourceElements(Component capellaContainer) {
		List<ComponentPort> ports = capellaContainer.getOwnedFeatures().stream().filter(p -> p instanceof ComponentPort)
				.map(ComponentPort.class::cast).collect(Collectors.toList());
		return ports;
	}

}
