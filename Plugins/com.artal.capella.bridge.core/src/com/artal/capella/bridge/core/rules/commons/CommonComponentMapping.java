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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Model;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.core.data.la.LogicalArchitecture;
import org.polarsys.capella.core.data.la.LogicalComponent;
import org.polarsys.capella.core.data.la.LogicalComponentPkg;
import org.polarsys.capella.core.data.pa.PhysicalArchitecture;
import org.polarsys.capella.core.data.pa.PhysicalComponent;
import org.polarsys.capella.core.data.pa.PhysicalComponentPkg;
import org.polarsys.capella.core.model.helpers.ProjectExt;

import com.artal.capella.bridge.core.CapellaBridgeAlgo;
import com.artal.capella.bridge.core.CapellaUtils;
import com.artal.capella.bridge.core.rules.AbstractDynamicMapping;
import com.artal.capella.bridge.core.rules.MappingRulesManager;

/**
 * @author Yann BINOT
 *
 */
public abstract class CommonComponentMapping<ALGO extends CapellaBridgeAlgo<?>> extends
		AbstractDynamicMapping<org.polarsys.capella.core.data.capellacore.CapellaElement, org.polarsys.capella.core.data.cs.Component, ALGO> {

	public CommonComponentMapping(ALGO algo, CapellaElement parent, IMappingExecution mappingExecution) {
		super(algo, parent, mappingExecution);
	}

	@Override
	public Object computeTargetContainer(CapellaElement capellaContainer) {
		if (capellaContainer instanceof LogicalArchitecture) {
			Project capellaProject = ProjectExt.getProject(capellaContainer);
			Model model = (Model) MappingRulesManager.getCapellaObjectFromAllRules(capellaProject);
			return model;
		} else if (capellaContainer instanceof PhysicalArchitecture) {
			Project capellaProject = ProjectExt.getProject(capellaContainer);
			Model model = (Model) MappingRulesManager.getCapellaObjectFromAllRules(capellaProject);
			return model;
		} else {

			return (Component) MappingRulesManager.getCapellaObjectFromAllRules(capellaContainer);
		}
	}

	@Override
	public List<org.polarsys.capella.core.data.cs.Component> findSourceElements(CapellaElement capellaContainer) {
		if (capellaContainer instanceof LogicalArchitecture) {
			LogicalComponent logicalSystem = CapellaUtils.getLogicalSystemRoot(capellaContainer);
			List<org.polarsys.capella.core.data.cs.Component> resutls = new ArrayList<>();
			resutls.add(logicalSystem);
			return resutls;
		}
		if (capellaContainer instanceof PhysicalArchitecture) {
			PhysicalComponent logicalSystem = CapellaUtils.getPhysicalSystemRoot(capellaContainer);
			List<org.polarsys.capella.core.data.cs.Component> resutls = new ArrayList<>();
			resutls.add(logicalSystem);
			return resutls;
		}
		if (capellaContainer instanceof LogicalComponent) {
			List<LogicalComponent> ownedLogicalComponents = ((LogicalComponent) capellaContainer)
					.getOwnedLogicalComponents();
			List<org.polarsys.capella.core.data.cs.Component> resutls = new ArrayList<>();

			EList<LogicalComponentPkg> ownedLogicalComponentPkgs = ((LogicalComponent) capellaContainer)
					.getOwnedLogicalComponentPkgs();
			for (LogicalComponentPkg logicalComponentPkg : ownedLogicalComponentPkgs) {
				EList<LogicalComponent> ownedLogicalComponents2 = logicalComponentPkg.getOwnedLogicalComponents();
				resutls.addAll(ownedLogicalComponents2);
			}

			resutls.addAll(ownedLogicalComponents);
			return resutls;
		}
		if (capellaContainer instanceof PhysicalComponent) {
			List<PhysicalComponent> ownedLogicalComponents = ((PhysicalComponent) capellaContainer)
					.getOwnedPhysicalComponents();
			List<org.polarsys.capella.core.data.cs.Component> resutls = new ArrayList<>();
			EList<PhysicalComponentPkg> ownedLogicalComponentPkgs = ((PhysicalComponent) capellaContainer)
					.getOwnedPhysicalComponentPkgs();
			for (PhysicalComponentPkg logicalComponentPkg : ownedLogicalComponentPkgs) {
				EList<PhysicalComponent> ownedLogicalComponents2 = logicalComponentPkg.getOwnedPhysicalComponents();
				resutls.addAll(ownedLogicalComponents2);
			}
			resutls.addAll(ownedLogicalComponents);
			return resutls;
		}

		return Collections.emptyList();
	}

}
