/*******************************************************************************
* Copyright (c) 2021 THALES GLOBAL SERVICES.
* All right reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* Contributors:
*     Artal Technologies - initial API and implementation
*******************************************************************************/
package com.artal.capella.bridge.core.uml;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.diffmerge.api.scopes.IEditableModelScope;
import org.eclipse.emf.diffmerge.bridge.api.IBridgeTrace.Editable;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IQueryExecution;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IRule;
import org.eclipse.emf.diffmerge.bridge.mapping.impl.MappingExecution;
import org.eclipse.emf.diffmerge.bridge.mapping.impl.MappingExecution.PendingDefinition;
import org.eclipse.emf.diffmerge.bridge.mapping.impl.QueryAndRule;
import org.eclipse.emf.diffmerge.bridge.mapping.operations.MappingBridgeOperation;
import org.eclipse.emf.diffmerge.bridge.uml.mapping.IUMLRule;
import org.eclipse.emf.diffmerge.bridge.uml.mapping.UMLMappingBridge;
import org.eclipse.emf.diffmerge.bridge.uml.mapping.UMLRule;
import org.eclipse.emf.diffmerge.bridge.util.structures.TupleN;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.Profile;

import com.artal.capella.bridge.core.CapellaMappingUtil;
import com.artal.capella.bridge.core.cheat.TraceCheat;
import com.artal.capella.bridge.core.patch.CapellaMappingExecution;
import com.artal.capella.bridge.core.patch.wrappers.RuleWrapper;

public class UMLBridge<SD, CD> extends UMLMappingBridge<SD, IEditableModelScope> {
	private CapellaMappingExecution _capellaMappingExecution;

	private UMLBridgeAlgo<SD> _algo;

	UMLRule<SD, TupleN<TraceCheat<?>>> _umlRule;

	public UMLBridge(UMLBridgeAlgo<SD> algo) {
		_algo = algo;
	}

	public MappingExecution createExecution(Editable trace_p) {
		_capellaMappingExecution = new CapellaMappingExecution(trace_p, getLogger());
		return _capellaMappingExecution;
	};

	@Override
	protected MappingBridgeOperation createMappingOperation(SD sourceDataSet_p, IEditableModelScope targetDataSet_p,
			MappingExecution execution_p) {
		return new CapellaUMLMappingBridgeOperation(sourceDataSet_p, targetDataSet_p, this, execution_p) {
			/**
			 * Execute profile applications for the given source, based on the given bridge
			 * execution
			 * 
			 * @param source_p    a non-null object
			 * @param execution_p a non-null object
			 * @param phase_p     the non-null phase for Profile data construction
			 */
			protected void handleRuleForProfileApplications(Object source_p, MappingExecution execution_p,
					Object targetDataSet_p, Phase phase_p) {
				Map<IRule<?, ?, ?>, PendingDefinition> pendingDefinitions = execution_p.getPendingDefinitions(source_p);
				// Handle all pending definitions
				for (Entry<IRule<?, ?, ?>, PendingDefinition> entry : pendingDefinitions.entrySet()) {
					IRule<?, ?, ?> rule = entry.getKey();
					if (phase_p == Phase.PROFILE_APPLICATION) // Registering
						registerTarget(entry.getValue(), source_p, entry.getKey(), execution_p);
					if (rule instanceof RuleWrapper) {
						rule = ((RuleWrapper<?, ?, ?>) rule).getRealRule();
					}
					if (rule instanceof IUMLRule) {
						handleRuleForProfileApplication((IUMLRule<?, ?, ?>) rule, source_p, entry.getValue(),
								execution_p, targetDataSet_p, phase_p);
					}

				}
			}

		};
	}

	/**
	 * Load the SysML profile
	 * 
	 * @throws Exception if any expected profile elements are missing
	 */
	public Profile loadSysMLProfile() throws Exception {

		URI pURI = URI.createURI("platform:/plugin/org.eclipse.papyrus.sysml14/resources/profile/SysML.profile.uml");

		ResourceSet rset = new ResourceSetImpl();
		Resource profile = rset.getResource(pURI, true);

		Profile sysMLProfile = (Profile) profile.getContents().get(0);

		return sysMLProfile;
	}

	public void registerRules() {
		new MainRule(this);
	}

	public class MainRule extends QueryAndRule<SD, SD, TupleN<TraceCheat<?>>> {

		public MainRule(UMLBridge<SD, CD> capellaBridge) {
			super(capellaBridge);
			_umlRule = new UMLRule<SD, TupleN<TraceCheat<?>>>(this) {

				@Override
				public TupleN<TraceCheat<?>> createTarget(SD source_p, IQueryExecution queryExecution_p) {
					return new TupleN<>();
				}

				@Override
				public void defineTarget(SD source_p, TupleN<TraceCheat<?>> target_p, IQueryExecution queryExecution_p,
						IMappingExecution mappingExecution_p) {
					// MainRule.this.defineTarget(source_p, target_p,
					// queryExecution_p, mappingExecution_p);

				}

				@Override
				public Collection<EObject> createProfileApplications(SD source_p, TupleN<TraceCheat<?>> target_p,
						IQueryExecution queryExecution_p, IMappingExecution mappingExecution_p) {
					List<EObject> profs = new ArrayList<EObject>();
					try {
						Profile prof = loadSysMLProfile();

						if (prof != null) {
							profs.addAll(prof.getProfileApplications());
						}
					}

					catch (Exception e) {
						e.printStackTrace();
					}
					profs.addAll(_algo.getProfileApplication());
					return profs;
				}

				@Override
				public Collection<EObject> createStereotypeApplications(SD source_p, TupleN<TraceCheat<?>> target_p,
						IQueryExecution queryExecution_p, IMappingExecution mappingExecution_p) {
					return _algo.getStereoApplications();
				}
			};

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

	public UMLRule<SD, TupleN<TraceCheat<?>>> getUmlRule() {
		return _umlRule;
	}
}
