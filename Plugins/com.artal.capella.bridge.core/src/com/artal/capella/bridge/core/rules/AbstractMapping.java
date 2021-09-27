/*******************************************************************************
* Copyright (c) 2021 THALES GLOBAL SERVICES.
* All right reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* Contributors:
*     Artal Technologies - initial API and implementation
*******************************************************************************/
package com.artal.capella.bridge.core.rules;

import java.util.HashMap;
import java.util.Map;

import com.artal.capella.bridge.core.CapellaBridgeAlgo;

/**
 * Abstract class to implement for manage a specific rule.
 * 
 * @author Yann BINOT
 *
 */
public abstract class AbstractMapping {

	/**
	 * Map for link a source object at the transformed target object.
	 */
	Map<Object, Object> _mapSourceToTarget = new HashMap<>();

	/**
	 * The mapping algo.
	 */
	private CapellaBridgeAlgo<?> _algo;

	/**
	 * Constructor
	 * 
	 * @param algo the {@link CapellaBridgeAlgo}.
	 */
	public AbstractMapping(CapellaBridgeAlgo<?> algo) {
		_algo = algo;

	}

	/**
	 * Execute the specific transformation implementation.
	 */
	abstract public void computeMapping();

	/**
	 * Get the map linking a source object at the transformed target object.
	 * 
	 * @return the {@link Map}
	 */
	public Map<Object, Object> getMapSourceToTarget() {
		return _mapSourceToTarget;
	}

	/**
	 * Get the {@link CapellaBridgeAlgo} algo.
	 * 
	 * @return the {@link CapellaBridgeAlgo}
	 */
	public CapellaBridgeAlgo<?> getAlgo() {
		return _algo;
	}

}
