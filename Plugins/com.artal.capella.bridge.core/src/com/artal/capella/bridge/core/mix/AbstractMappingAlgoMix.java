/*******************************************************************************
* Copyright (c) 2021 THALES GLOBAL SERVICES.
* All right reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* Contributors:
*     Artal Technologies - initial API and implementation
*******************************************************************************/
package com.artal.capella.bridge.core.mix;

import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution;

import com.artal.capella.bridge.core.CapellaBridgeAlgo;
import com.artal.capella.bridge.core.rules.MappingRulesManager;

/**
 * Service dedicated to rules mix definition (allow to combine existing
 * conversion rules)
 * 
 * @author Yann BINOT
 */
abstract public class AbstractMappingAlgoMix<SOURCE, ALGO extends CapellaBridgeAlgo<?>, MAPPINGSERVICE> {

	/**
	 * Concerned mapping service
	 */
	MAPPINGSERVICE _mappingService;

	/**
	 * Corresponding rules manager
	 */
	MappingRulesManager _managerRules = new MappingRulesManager();

	/**
	 * Launch the registering of rules and their execution
	 * 
	 * @param algo      concerned conversion algo
	 * @param source    Source Capella model
	 * @param execution IMapping Execution
	 */
	abstract public void launch(ALGO algo, SOURCE source, IMappingExecution execution);

	/**
	 * Get the name/description of the mix
	 * 
	 * @return a String short sentence
	 */
	abstract public String getMixName();

	/**
	 * Get the name/description of concerned Capella data
	 * 
	 * @return a String short sentence
	 */
	abstract public String getPackageName();

	public AbstractMappingAlgoMix(MAPPINGSERVICE mappingService) {
		_mappingService = mappingService;
	}

	public MappingRulesManager getManagerRules() {
		return _managerRules;
	}

	public MAPPINGSERVICE getMappingService() {
		return _mappingService;
	}

}
