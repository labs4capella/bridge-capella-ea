/*******************************************************************************
* Copyright (c) 2021 THALES GLOBAL SERVICES.
* All right reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* Contributors:
*     Artal Technologies - initial API and implementation
*******************************************************************************/
package com.artal.capella.bridge.core;

import java.util.Collection;

import org.eclipse.emf.diffmerge.api.scopes.IEditableModelScope;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IQuery;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IQueryExecution;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IQueryHolder;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IQueryIdentifier;
import org.eclipse.emf.diffmerge.bridge.mapping.impl.QueryAndRule.QueryAndRuleIdentifier;
import org.eclipse.emf.diffmerge.bridge.mapping.impl.RuleIdentifier;
import org.eclipse.emf.ecore.EObject;

import com.artal.capella.bridge.core.patch.CapellaMappingExecution;
import com.artal.capella.bridge.core.patch.CapellaQueryExecution;

/**
 * Utils dedicated to MAPPING algo
 * 
 * @author Yann BINOT
 */
public final class CapellaMappingUtil {

	/**
	 * Hidden constructor
	 */
	private CapellaMappingUtil() {
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <S, T> T getTarget(IQueryExecution queryExecution_p, IMappingExecution mappingExecution_p,
			QueryAndRuleIdentifier<S, T> ruleID) {
		T res = (T) ((CapellaQueryExecution) queryExecution_p).getLastTargetObject(mappingExecution_p, ruleID);

		return res;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <S, T> T getTarget(IQueryExecution queryExecution_p, IMappingExecution mappingExecution_p,
			QueryAndRuleIdentifier<S, T> ruleID, S source) {
		// Search in the hierarchy
		T res = (T) ((CapellaQueryExecution) queryExecution_p).getTargetObject(mappingExecution_p, ruleID, source);

		// If not found, search the first fitting result
		if (res == null) {
			res = ((CapellaMappingExecution) mappingExecution_p).getFirst(source, ruleID);
		}

		return res;
	}

	public static void attach(IMappingExecution mappingExecution_p, EObject... items) {
		IEditableModelScope resManagement = mappingExecution_p.getTargetDataSet();

		for (EObject item : items) {
			resManagement.add(item);
		}
	}

	public static IQuery<?, ?> getRuleByName(CapellaBridge<?, ?> bridge, String searchedRule) {
		return searchRuleByName(bridge.getQueries(), searchedRule);
	}

	private static IQuery<?, ?> searchRuleByName(Collection<? extends IQuery<?, ?>> rules, String searchedRule) {
		for (IQuery<?, ?> rule : rules) {
			if (checkRule(rule, searchedRule)) {
				return rule;
			}

			IQuery<?, ?> subQuery = searchRuleByName(rule.getQueries(), searchedRule);
			if (subQuery != null) {
				return subQuery;
			}

			// for (IRule<?, ?> subRule : rule.getRules())
			// {
			// if (checkRule(subRule, searchedRule))
			// {
			// return subRule;
			// }
			// }

		}

		return null;
	}

	private static boolean checkRule(IQuery<?, ?> rule, String searchedRule) {
		IQueryIdentifier<?> ruleId = rule.getID();
		if (ruleId instanceof RuleIdentifier) {
			String ruleName = ((RuleIdentifier<?, ?>) ruleId).getName();
			if (searchedRule.equals(ruleName)) {
				return true;
			}
		}
		return false;
	}

	public static Object getContextDetail(IQueryHolder<?> item) {
		if (item instanceof CapellaBridge) {
//			return ((CapellaBridge<?, ?>) item).getCtxDetail(); TODO
		} else if (item instanceof org.eclipse.emf.diffmerge.bridge.mapping.impl.Query<?, ?>) {
			return getContextDetail(
					((org.eclipse.emf.diffmerge.bridge.mapping.impl.Query<?, ?>) item).getInputProvider());
		}
		return null;
	}
}
