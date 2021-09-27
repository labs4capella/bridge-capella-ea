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
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.cs.ComponentPkg;
import org.polarsys.capella.core.data.cs.CsPackage;

import com.artal.capella.bridge.core.CapellaBridgeAlgo;
import com.artal.capella.bridge.core.rules.AbstractDynamicMapping;
import com.artal.capella.bridge.core.rules.MappingRulesManager;

/**
 * @author Yann BINOT
 *
 */
public abstract class CommonsActorMapping<ALGO extends CapellaBridgeAlgo<?>>
		extends AbstractDynamicMapping<ComponentPkg, Component, ALGO> {

	public CommonsActorMapping(ALGO algo, ComponentPkg parent, IMappingExecution mappingExecution) {
		super(algo, parent, mappingExecution);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object computeTargetContainer(ComponentPkg capellaContainer) {
		return MappingRulesManager.getCapellaObjectFromAllRules(capellaContainer);
	}

	@Override
	public List<Component> findSourceElements(ComponentPkg capellaContainer) {

		List<Component> actors = EObjectExt.getAll(capellaContainer, CsPackage.Literals.COMPONENT).stream()
				.map(Component.class::cast).filter(act -> act.isActor()).filter(act -> act.isHuman())
				.collect(Collectors.toList());

		return actors;
	}

	@Override
	public String getUID(EObject key, String id) {
		return "EAID_" + id;
	}

}
