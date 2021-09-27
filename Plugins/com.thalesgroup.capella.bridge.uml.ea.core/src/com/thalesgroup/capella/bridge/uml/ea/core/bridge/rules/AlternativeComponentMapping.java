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
import org.polarsys.capella.core.data.capellacore.CapellaElement;

import com.artal.capella.bridge.core.rules.MappingRulesManager;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.Capella2UMLAlgo;

/**
 * @author Yann BINOT
 *
 */
public class AlternativeComponentMapping extends ComponentMapping {

	/**
	 * @param algo
	 * @param component
	 * @param execution
	 */
	public AlternativeComponentMapping(Capella2UMLAlgo algo, CapellaElement component, IMappingExecution execution) {
		super(algo, component, execution);
	}

	@Override
	public void executeSubRules(List<org.polarsys.capella.core.data.cs.Component> _capellaSource,
			MappingRulesManager manager) {
		for (org.polarsys.capella.core.data.cs.Component logicalComponent : _capellaSource) {
			ComponentMapping componentMapping = new AlternativeComponentMapping(getAlgo(), logicalComponent,
					getMappingExucution());
			AlternativePortMapping portMapping = new AlternativePortMapping(getAlgo(), logicalComponent,
					getMappingExucution());

			manager.add(AlternativeComponentMapping.class.getName() + logicalComponent.getId(), componentMapping);
			manager.add(PortMapping.class.getName() + logicalComponent.getId(), portMapping);

			PropertyMapping propertyMapping = new PropertyMapping(getAlgo(), logicalComponent, getMappingExucution());
			manager.add(propertyMapping.getClass().getName() + logicalComponent.getId(), propertyMapping);

		}

		for (org.polarsys.capella.core.data.cs.Component logicalComponent : _capellaSource) {
			AggregationMapping aggregationMapping = new AggregationMapping(getAlgo(), logicalComponent,
					getMappingExucution());
			manager.add(aggregationMapping.getClass().getName(), aggregationMapping);
		}

	}

}
