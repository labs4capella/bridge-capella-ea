/*******************************************************************************
* Copyright (c) 2021 THALES GLOBAL SERVICES.
* All right reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* Contributors:
*     Artal Technologies - initial API and implementation
*******************************************************************************/
package com.artal.capella.bridge.core.services;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.diffmerge.bridge.interactive.BridgeJob;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.polarsys.capella.core.data.capellamodeller.Project;

import com.artal.capella.bridge.core.mix.AbstractMappingAlgoMix;

/**
 * Service dedicated to language mapping definition
 * 
 * @author Yann BINOT
 */
public interface MappingService {

	/**
	 * Name of the mapping/bridge
	 * 
	 * @return the name
	 */
	String getTransfoName();

	/**
	 * Get all available mixes for this given bridge
	 * 
	 * @return
	 */
	List<AbstractMappingAlgoMix<?, ?, ?>> getMixes();

	/**
	 * Create the transformation bridge itself (to be executed to convert data)
	 * 
	 * @param jobName_p       name of the job
	 * @param sourceDataSet_p source Capella project
	 * @param targetURI_p     target URI
	 * @param mix             The "rules" mix to be considered (selected by the
	 *                        user)
	 * @return the executable bridge
	 */
	BridgeJob<?> createBridgeJob(String jobName_p, Project sourceDataSet_p, URI targetURI_p,
			AbstractMappingAlgoMix<?, ?, ?> mix);

	/**
	 * Allow the injection of UI extension (bridge configuration dialog)
	 * 
	 * @param specificGroup Composite to be extended
	 * @return the Control
	 */
	Control getOrCreateSpecificView(Composite specificGroup);

	/**
	 * Get file extension of the file to be generated
	 * 
	 * @return String extension (without the "dot". e.g : "xml")
	 */
	String getExtension();

	/**
	 * 
	 * 
	 * @param _outputPath
	 */
	void postProcess(String _outputPath);

}
