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

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Model;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.cs.ComponentPkg;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.model.helpers.ProjectExt;

import com.artal.capella.bridge.core.CapellaBridgeAlgo;
import com.artal.capella.bridge.core.rules.AbstractDynamicMapping;
import com.artal.capella.bridge.core.rules.MappingRulesManager;

/**
 * @author Yann BINOT
 */
public abstract class CommonComponentExchangeMapping<ALGO extends CapellaBridgeAlgo<?>>
		extends AbstractDynamicMapping<CapellaElement, org.polarsys.capella.core.data.fa.ComponentExchange, ALGO> {

	public CommonComponentExchangeMapping(ALGO algo, CapellaElement parent, IMappingExecution mappingExecution) {
		super(algo, parent, mappingExecution);
	}

	@Override
	public Object computeTargetContainer(CapellaElement capellaContainer) {

		if (capellaContainer instanceof Component) {
			BehavioredClassifier container = (BehavioredClassifier) MappingRulesManager
					.getCapellaObjectFromAllRules(capellaContainer);
			if (container != null) {
				return container;
			}
		}
		if (capellaContainer instanceof ComponentPkg) {
			return MappingRulesManager.getCapellaObjectFromAllRules(capellaContainer);
		}
		Project project = ProjectExt.getProject(capellaContainer);

		return (Model) MappingRulesManager.getCapellaObjectFromAllRules(project);
	}

	@Override
	public List<ComponentExchange> findSourceElements(CapellaElement capellaContainer) {
		if (capellaContainer instanceof Component) {
			List<ComponentExchange> ownedComponentExchanges = ((Component) capellaContainer)
					.getOwnedComponentExchanges();
			return ownedComponentExchanges;
		} else if (capellaContainer instanceof ComponentPkg) {

			List<ComponentExchange> ownedComponentExchanges = ((ComponentPkg) capellaContainer)
					.getOwnedComponentExchanges();
			return ownedComponentExchanges;

		}

		return Collections.emptyList();
	}

}
