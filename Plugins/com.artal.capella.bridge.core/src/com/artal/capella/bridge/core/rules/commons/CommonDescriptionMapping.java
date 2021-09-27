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
import org.eclipse.uml2.uml.Model;
import org.polarsys.capella.common.helpers.EObjectExt;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.core.model.helpers.ProjectExt;

import com.artal.capella.bridge.core.CapellaBridgeAlgo;
import com.artal.capella.bridge.core.rules.AbstractDynamicMapping;
import com.artal.capella.bridge.core.rules.MappingRulesManager;

/**
 * @author Yann BINOT
 *
 */
public abstract class CommonDescriptionMapping<SOURCE_CONTAINER extends CapellaElement, ALGO extends CapellaBridgeAlgo<?>>
		extends AbstractDynamicMapping<SOURCE_CONTAINER, CapellaElement, ALGO> {

	public CommonDescriptionMapping(ALGO algo, SOURCE_CONTAINER parent, IMappingExecution mappingExecution) {
		super(algo, parent, mappingExecution);
	}

	@Override
	public Object computeTargetContainer(SOURCE_CONTAINER capellaContainer) {
		Project capellaProject = ProjectExt.getProject(capellaContainer);
		Model model = (Model) MappingRulesManager.getCapellaObjectFromAllRules(capellaProject);
		return model;
	}

	@Override
	public List<CapellaElement> findSourceElements(SOURCE_CONTAINER capellaContainer) {
		List<CapellaElement> collect = EObjectExt.getAll(capellaContainer, CapellacorePackage.Literals.CAPELLA_ELEMENT)
				.stream().map(CapellaElement.class::cast).filter(ce -> hasDescription(ce)).collect(Collectors.toList());

		return collect;
	}

	public boolean hasDescription(CapellaElement ce) {
		if (ce.getDescription() != null && !ce.getDescription().isEmpty()) {
			return true;
		}
		return false;
	}

}
