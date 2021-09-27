/*******************************************************************************
* Copyright (c) 2021 THALES GLOBAL SERVICES.
* All right reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* Contributors:
*     Artal Technologies - initial API and implementation
*******************************************************************************/
package com.artal.capella.bridge.core.patch.wrappers;

import org.eclipse.emf.diffmerge.bridge.api.ISymbolFunction;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IQuery;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IQueryExecution;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IRule;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IRuleIdentifier;
import org.eclipse.emf.diffmerge.bridge.mapping.impl.QueryExecution;

import com.artal.capella.bridge.core.patch.CapellaQueryExecution;

/**
 * Used to simulate a different IRule (check PatchedMappingExecution)
 * 
 * @author Yann BINOT
 *
 * @param <S>
 * @param <T>
 */
public class RuleWrapper<S, TRS, T> implements IRule<S, TRS, T> {
	private IRule<S, TRS, T> _realRule;

	private IRuleIdentifier<S, TRS, T> _ruleIdWrapper;

	@SuppressWarnings("unchecked")
	public RuleWrapper(IRule<S, TRS, T> rule_p, QueryExecution queryExecution_p) {
		_realRule = rule_p;
		if (queryExecution_p instanceof CapellaQueryExecution) {
			_ruleIdWrapper = (IRuleIdentifier<S, TRS, T>) ((CapellaQueryExecution) queryExecution_p)
					.getCurrentIdentifierWrapper();
		}
	}

	@Override
	public IRuleIdentifier<S, TRS, T> getID() {
		return _ruleIdWrapper;
	}

	@Override
	public Object getSymbol(ISymbolFunction function_p) {
		return _realRule.getSymbol(function_p);
	}

	@Override
	public T createTarget(S source_p, IQueryExecution queryExecution_p) {
		return _realRule.createTarget(source_p, queryExecution_p);
	}

	@Override
	public void defineTarget(S source_p, T target_p, IQueryExecution queryExecution_p,
			IMappingExecution mappingExecution_p) {
		_realRule.defineTarget(source_p, target_p, queryExecution_p, mappingExecution_p);
	}

	@Override
	public IQuery<?, ? extends S> getInputProvider() {
		return _realRule.getInputProvider();
	}

	public IRule<S, TRS, T> getRealRule() {
		return _realRule;
	}

	@Override
	public TRS traceSource(S source_p) {
		// TODO Auto-generated method stub
		return null;
	}
}
