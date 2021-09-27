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

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.diffmerge.api.scopes.IEditableModelScope;
import org.eclipse.emf.diffmerge.bridge.api.IBridgeTrace.Editable;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IQueryExecution;
import org.eclipse.emf.diffmerge.bridge.mapping.impl.MappingExecution;
import org.eclipse.emf.diffmerge.bridge.mapping.impl.QueryAndRule;
import org.eclipse.emf.diffmerge.bridge.mapping.impl.emf.EMFMappingBridge;
import org.eclipse.emf.diffmerge.bridge.mapping.operations.MappingBridgeOperation;
import org.eclipse.emf.diffmerge.bridge.util.structures.TupleN;
import org.eclipse.emf.ecore.EObject;

import com.artal.capella.bridge.core.cheat.TraceCheat;
import com.artal.capella.bridge.core.patch.CapellaMappingBridgeOperation;
import com.artal.capella.bridge.core.patch.CapellaMappingExecution;

/**
 * 
 * API dedicated to the definition of MMT MAPPING process. Specific "PATCH" to
 * support duplicates by default (if rule access the same item by several
 * paths).
 * 
 * @author Yann BINOT
 *
 * @param <SD> Type of the input data
 * @param <CD> Type of the target context
 *
 */
public class CapellaBridge<SD, CD>
		extends EMFMappingBridge<SD, org.eclipse.emf.diffmerge.api.scopes.IEditableModelScope> {

	private CapellaBridgeAlgo<SD> _algo;
	private CapellaMappingExecution _capellaMappingExecution;

	public CapellaBridge(CapellaBridgeAlgo<SD> algo) {
		_algo = algo;
	}

	@Override
	public MappingExecution createExecution(Editable trace_p) {
		_capellaMappingExecution = new CapellaMappingExecution(trace_p, getLogger());
		return _capellaMappingExecution;
	}

	@Override
	protected MappingBridgeOperation createMappingOperation(SD sourceDataSet_p, IEditableModelScope targetDataSet_p,
			MappingExecution execution_p) {
		return new CapellaMappingBridgeOperation(sourceDataSet_p, targetDataSet_p, this, execution_p);
	}

	public void registerRules() {
		new MainRule(this);
	}

	class MainRule extends QueryAndRule<SD, SD, TupleN<TraceCheat<?>>> {

		public MainRule(CapellaBridge<SD, CD> capellaBridge) {
			super(capellaBridge);
		}

		@Override
		public Iterable<SD> evaluate(SD input_p, IQueryExecution queryExecution_p) {
			return Arrays.asList(input_p);
		}

		@Override
		public TupleN<TraceCheat<?>> createTarget(SD source_p, IQueryExecution queryExecution_p) {
			_algo.launch(source_p, _capellaMappingExecution);
			List<TraceCheat<? extends EObject>> allItems = _algo.getAllItems();
			return new TupleN<TraceCheat<?>>(allItems.toArray(new TraceCheat<?>[allItems.size()]));
		}

		@Override
		public void defineTarget(SD source_p, TupleN<TraceCheat<?>> target_p, IQueryExecution queryExecution_p,
				IMappingExecution mappingExecution_p) {
			List<EObject> attachedItems = _algo.getTransientItems();
			CapellaMappingUtil.attach(mappingExecution_p, attachedItems.toArray(new EObject[attachedItems.size()]));
		}
	}
}
