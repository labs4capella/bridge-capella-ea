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

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * Manage the rules.
 * 
 * @author Yann BINOT
 *
 */
public class MappingRulesManager {

	/**
	 * static map containing all the rules
	 */
	static Map<String, AbstractMapping> _rules = new HashMap<String, AbstractMapping>();

	Queue<AbstractMapping> _queue = new LinkedList<>();

	/**
	 * Get the rule by id
	 * 
	 * @param id the {@link String} rule id
	 * @return {@link AbstractMapping} rule
	 */
	static public AbstractMapping getRule(String id) {
		return _rules.get(id);
	}

	/**
	 * Add rule with id in the rules map for find them and in the queue for executed
	 * them.
	 * 
	 * @param id   the {@link String} rule id
	 * @param rule the {@link AbstractMapping} rule to add
	 */
	public void add(String id, AbstractMapping rule) {
		_rules.put(id, rule);
		_queue.add(rule);
	}

	/**
	 * Execute the {@link AbstractMapping} rules queue. The {@link AbstractMapping}
	 * rules are treated in the order they are added.
	 */
	public void executeRules() {
		while (!_queue.isEmpty()) {
			AbstractMapping poll = _queue.poll();
			poll.computeMapping();
		}
	}

	/**
	 * Clear the rules map.
	 */
	static public void clearRules() {
		_rules.clear();
	}

	static public Object getCapellaObjectFromAllRules(Object sysmlObj) {
		Collection<AbstractMapping> values = _rules.values();
		for (AbstractMapping abstractMapping : values) {
			Object object = abstractMapping.getMapSourceToTarget().get(sysmlObj);
			if (object != null) {
				return object;
			}
		}

		return null;
	}

}
