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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution;
import org.eclipse.emf.ecore.EObject;

import com.artal.capella.bridge.core.cheat.TraceCheat;
import com.artal.capella.bridge.core.mix.AbstractMappingAlgoMix;
import com.artal.capella.bridge.core.rules.AbstractDynamicMapping;

/**
 * Abstract class to implement to manage the specific mapping.
 * 
 * @author Yann BINOT
 * 
 *         DO NOT FORGET TO CALL ADD/ATTACH METHOD on created objects
 */
public abstract class CapellaBridgeAlgo<SD> {
	private List<TraceCheat<? extends EObject>> _allItems = new ArrayList<>();

	private List<EObject> _transientItems = new ArrayList<>();

	ManageUIDs _manageUIDs = new ManageUIDs();

	private AbstractMappingAlgoMix<SD, CapellaBridgeAlgo<?>, ?> _mix;

	public CapellaBridgeAlgo() {
		this(null);
	}

	public CapellaBridgeAlgo(AbstractMappingAlgoMix<SD, CapellaBridgeAlgo<?>, ?> mix) {
		_mix = mix;
		init();
	}

	private void init() {
		_manageUIDs.setCreateUIDs(createUIDs());
		_manageUIDs.setUseUIDs(useUIDs());

	}

	/**
	 * @return
	 */
	public boolean useUIDs() {
		return true;
	}

	/**
	 * @return
	 */
	public boolean createUIDs() {
		return false;
	}

	/**
	 * Launch the execution of the algorithm
	 * 
	 * DO NOT FORGET TO CALL ADD/ATTACH METHOD on created objects
	 * 
	 * @param _capellaMappingExecution
	 */
	public void launch(SD source_p, IMappingExecution _mappingExecution) {
		_manageUIDs.getUIds().clear();
		if (_mix != null) {
			_mix.launch(this, source_p, _mappingExecution);
		}
	}

	public void putId(EObject key, AbstractDynamicMapping<?, ?, ?> rule, String id) {

		String uid = rule.getUID(key, id);
		_manageUIDs.getUIds().put(key, uid);
	}

	/**
	 * Indicate that the given item was created during the algo
	 * 
	 * @param unique identifier of the created item (must be stable throw calls)
	 * @param item   the created EObject
	 */
	public void add(String guid, EObject item) {
		_allItems.add(new TraceCheat<EObject>(guid, item));
	}

	/**
	 * Indicate that the given item was created during the algo and is not contained
	 * by any parent ("add" method automatically called)
	 * 
	 * @param unique identifier of the created item (must be stable throw calls)
	 * @param item   the created EObject
	 */
	public void attach(String guid, EObject item) {
		add(guid, item);
		_transientItems.add(item);
	}

	/**
	 * Just "attach" the given item. The method "add" must also be called on this
	 * item.
	 * 
	 * @param item EObject to attach
	 */
	protected void attachOnly(EObject item) {
		_transientItems.add(item);
	}

	/**
	 * Get ALL created objects
	 * 
	 * @return the list of ALL created objects
	 */
	public List<TraceCheat<? extends EObject>> getAllItems() {
		return _allItems;
	}

	/**
	 * Get all created objects that are not attached to any parent
	 * 
	 * @return a List of items
	 */
	public List<EObject> getTransientItems() {
		return _transientItems;
	}

	public ManageUIDs getManageUIDs() {
		return _manageUIDs;
	}

	public class ManageUIDs {

		public Map<EObject, String> _UIds = new HashMap<>();

		public boolean useUIDs = true;

		public boolean createUIDs = false;

		public Map<EObject, String> getUIds() {
			return _UIds;
		}

		public boolean isCreateUIDs() {
			return createUIDs;
		}

		public boolean isUseUIDs() {
			return useUIDs;
		}

		public String getUId(EObject eObject) {
			return _UIds.get(eObject);
		}

		public void setCreateUIDs(boolean createUIDs) {
			this.createUIDs = createUIDs;
		}

		public void setUseUIDs(boolean useUIDs) {
			this.useUIDs = useUIDs;
		}

	}

	public void setMix(AbstractMappingAlgoMix<SD, CapellaBridgeAlgo<?>, ?> _mix) {
		this._mix = _mix;
	}

	public AbstractMappingAlgoMix<SD, CapellaBridgeAlgo<?>, ?> getMix() {
		return _mix;
	}
}
