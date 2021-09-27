/*******************************************************************************
* Copyright (c) 2021 THALES GLOBAL SERVICES.
* All right reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* Contributors:
*     Artal Technologies - initial API and implementation
*******************************************************************************/
package com.artal.capella.bridge.core.patch;

import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.eclipse.emf.diffmerge.bridge.api.ICause;
import org.eclipse.emf.diffmerge.bridge.impl.emf.EMFSymbolFunction;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IRule;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IRuleIdentifier;
import org.eclipse.emf.diffmerge.bridge.mapping.impl.MappingExecution;
import org.eclipse.emf.diffmerge.bridge.mapping.util.TraceLoggingMessage;
import org.eclipse.emf.diffmerge.bridge.util.AbstractLoggingMessage;
import org.eclipse.emf.ecore.EObject;

import com.artal.capella.bridge.core.patch.wrappers.RuleIdentifierWrapper;

/**
 * Patch of MappingExecution creator to bypass restriction (make it really
 * tolerant to several access to the same target (tolerantToDuplicates))
 * 
 * @author Yann BINOT
 */
public class CapellaMappingExecution extends MappingExecution {
	public CapellaMappingExecution(org.eclipse.emf.diffmerge.bridge.api.IBridgeTrace.Editable trace_p, Logger logger) {
		super(trace_p, logger);
	}

	/**
	 * Bypass the Mapping bug. This method must return "false" but the variable must
	 * be set to "true" (default value) to REALLY be tolerant to duplicates
	 */
	public boolean isTolerantToDuplicates() {
		return false;
	}

	@Override
	@Deprecated
	public <TRS, T> T get(TRS source_p, IRuleIdentifier<?, TRS, T> ruleID_p) {
		return super.get(source_p, ruleID_p);
	}

	@SuppressWarnings("rawtypes")
	public <TRS, T> T getFirst(TRS source_p, IRuleIdentifier<?, TRS, T> realRuleId) {
		T result = null;

		for (Entry<IRuleIdentifier<?, ?, ?>, IRule<?, ?, ?>> ruleMapEntry : _ruleMap.entrySet()) {
			IRuleIdentifier<?, ?, ?> ruleIdWrapper = ruleMapEntry.getKey();

			if (ruleIdWrapper instanceof RuleIdentifierWrapper<?, ?>
					&& ((RuleIdentifierWrapper) ruleIdWrapper).getRealIdentifier().equals(realRuleId)) {
				result = get(source_p, (IRuleIdentifier<?, TRS, T>) ruleIdWrapper);
				if (result != null) {
					return result;
				}
			}
		}
		return null;

	}

	@Override
	protected AbstractLoggingMessage createTraceLoggingMessage(Object target_p, ICause<?> cause_p) {
		return new TraceLoggingMessage(target_p, cause_p) {

			@Override
			protected String getMessageBody() {
				StringBuilder builder = new StringBuilder("("); //$NON-NLS-1$
				builder.append(getTarget().getClass().getSimpleName()).append(" \""); //$NON-NLS-1$
				builder.append(getObjectLabel(getTarget())).append("\""); //$NON-NLS-1$
				final EMFSymbolFunction function = EMFSymbolFunction.getInstance();
				// append the identifier inside the message using symbol
				// function.
				builder.append("[").append(function.getSymbol(getTarget())).append("]");//$NON-NLS-1$ //$NON-NLS-2$
				// source however can be a single object or a tuple
				builder.append(") From {"); //$NON-NLS-1$
				for (Object source : getCause().getSourceElements()) {
					if (source == null) {
						continue;
					}
					String sourceName = getObjectLabel(source);
					String sourceType = "";
					if (source instanceof EObject) {
						sourceType = ((EObject) source).eClass().getName();
					} else {
						source.getClass().getName();
					}
					builder.append("("); //$NON-NLS-1$
					builder.append(sourceType).append(" \""); //$NON-NLS-1$
					builder.append(sourceName).append("\""); //$NON-NLS-1$
					builder.append("[").append(function.getSymbol(source)).append("])");//$NON-NLS-1$ //$NON-NLS-2$
				}
				builder.append("}"); //$NON-NLS-1$
				return builder.toString();
			}
		};
	}
}
