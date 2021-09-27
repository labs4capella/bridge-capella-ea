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

import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution;
import org.polarsys.capella.core.data.information.ExchangeItem;
import org.polarsys.capella.core.data.information.ExchangeItemElement;

import com.artal.capella.bridge.core.CapellaBridgeAlgo;
import com.artal.capella.bridge.core.rules.AbstractDynamicMapping;
import com.artal.capella.bridge.core.rules.MappingRulesManager;

/**
 * @author Yann BINOT
 *
 */
public abstract class CommonExchangeItemElement<ALGO extends CapellaBridgeAlgo<?>> extends
		AbstractDynamicMapping<org.polarsys.capella.core.data.information.ExchangeItem, org.polarsys.capella.core.data.information.ExchangeItemElement, ALGO> {

	public CommonExchangeItemElement(ALGO algo, ExchangeItem parent, IMappingExecution mappingExecution) {
		super(algo, parent, mappingExecution);
	}

	@Override
	public Object computeTargetContainer(ExchangeItem capellaContainer) {
		return MappingRulesManager.getCapellaObjectFromAllRules(capellaContainer);
	}

	@Override
	public List<ExchangeItemElement> findSourceElements(ExchangeItem capellaContainer) {
		List<ExchangeItemElement> ownedElements = capellaContainer.getOwnedElements();
		return ownedElements;
	}

}
