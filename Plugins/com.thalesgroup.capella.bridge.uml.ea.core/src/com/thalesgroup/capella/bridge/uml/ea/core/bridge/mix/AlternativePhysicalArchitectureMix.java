/*******************************************************************************
* Copyright (c) 2021 THALES GLOBAL SERVICES.
* All right reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* Contributors:
*     Artal Technologies - initial API and implementation
*******************************************************************************/
package com.thalesgroup.capella.bridge.uml.ea.core.bridge.mix;

import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution;
import org.polarsys.capella.core.data.capellamodeller.Project;

import com.artal.capella.bridge.core.mix.AbstractMappingAlgoMix;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.Capella2UMLAlgo;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.EAMappingService;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.rules.AlternativePhysicalRootMapping;

/**
 * @author Yann BINOT
 */
public class AlternativePhysicalArchitectureMix
		extends AbstractMappingAlgoMix<Project, Capella2UMLAlgo, EAMappingService> {

	public AlternativePhysicalArchitectureMix(EAMappingService mappingService) {
		super(mappingService);
	}

	@Override
	public void launch(Capella2UMLAlgo algo, Project source, IMappingExecution execution) {
		AlternativePhysicalRootMapping rootMapping = new AlternativePhysicalRootMapping(algo, source, execution,
				getMappingService().isExportProfile());
		getManagerRules().add(rootMapping.getClass().getName(), rootMapping);

		getManagerRules().executeRules();
	}

	@Override
	public String getMixName() {
		return "Physical Architecture Component Exchanges to Interfaces (partially)";
	}

	@Override
	public String getPackageName() {
		return "Transformed from Capella PA CE to Interfaces";
	}

}
