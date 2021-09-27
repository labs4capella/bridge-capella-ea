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
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.fa.ComponentPort;

import com.artal.capella.bridge.core.rules.MappingRulesManager;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.Capella2UMLAlgo;

/**
 * @author Yann BINOT
 *
 */
public class AlternativePortMapping extends PortMapping {

	/**
	 * @param algo
	 * @param parent
	 * @param mappingExecution
	 */
	public AlternativePortMapping(Capella2UMLAlgo algo, Component parent, IMappingExecution mappingExecution) {
		super(algo, parent, mappingExecution);
	}

	@Override
	public void executeSubRules(List<ComponentPort> _capellaSource, MappingRulesManager manager) {
		super.executeSubRules(_capellaSource, manager);

		for (ComponentPort componentPort : _capellaSource) {
			PortInterfaceMapping interfaceMapping = new PortInterfaceMapping(getAlgo(), componentPort,
					getMappingExucution());
			manager.add(interfaceMapping.getClass().getName() + componentPort.getId(), interfaceMapping);
		}
	}

}
