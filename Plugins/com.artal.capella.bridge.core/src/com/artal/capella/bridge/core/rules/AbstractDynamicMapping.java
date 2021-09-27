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

import java.util.List;

import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import com.artal.capella.bridge.core.CapellaBridgeAlgo;
import com.artal.capella.bridge.core.MappingUtils;

/**
 * @author Yann BINOT
 *
 */
public abstract class AbstractDynamicMapping<SOURCE_CONTAINER, SOURCE_ELEMENT, ALGO extends CapellaBridgeAlgo<?>>
		extends AbstractMapping {

	SOURCE_CONTAINER _sourceContainer;

	List<SOURCE_ELEMENT> _sourceElements;

	protected MappingRulesManager _manager = new MappingRulesManager();

	IMappingExecution _mappingExecution;

	private ALGO _algo;

	public AbstractDynamicMapping(ALGO algo, SOURCE_CONTAINER parent, IMappingExecution mappingExecution) {
		super(algo);
		_algo = algo;
		_sourceContainer = parent;
		_mappingExecution = mappingExecution;
	}

	public SOURCE_CONTAINER getSourceContainer() {
		return _sourceContainer;
	}

	public List<SOURCE_ELEMENT> getChildren() {
		return null;
	}

	private boolean isActivated() {
		return true;
	}

	public IMappingExecution getMappingExucution() {
		return _mappingExecution;
	}

	@Override
	public void computeMapping() {
		if (!isActivated()) {
			return;
		}
		Object eaContainer = computeTargetContainer(_sourceContainer);
		List<SOURCE_ELEMENT> capellaSource = findSourceElements(_sourceContainer);

		if (eaContainer != null && capellaSource != null) {
			capellaSource.remove(null);
			if (!capellaSource.isEmpty()) {
				for (SOURCE_ELEMENT capella_SOURCE : capellaSource) {
					Object object = compute(eaContainer, capella_SOURCE);
					if (object != null) {
						toTrace(capella_SOURCE, object);
					}
				}

				executeSubRules(capellaSource, _manager);
				_manager.executeRules();
			}
		}

	}

	protected void toTrace(Object sourceElement, Object targetElement) {
		toTrace(sourceElement, targetElement, sourceElement.getClass().getName());
	}

	protected void toTrace(Object sourceElement, Object targetElement, String prefix) {
		Resource eResource = null;
		if (sourceElement instanceof EObject) {
			eResource = ((EObject) sourceElement).eResource();
		}
		MappingUtils.trace(this, eResource, sourceElement, targetElement, prefix);
	}

	abstract public Object computeTargetContainer(SOURCE_CONTAINER capellaContainer);

	abstract public List<SOURCE_ELEMENT> findSourceElements(SOURCE_CONTAINER capellaContainer);

	abstract public Object compute(Object eaContainer, SOURCE_ELEMENT source);

	abstract public void executeSubRules(List<SOURCE_ELEMENT> _capellaSource, MappingRulesManager manager);

	abstract public String getUID(EObject key, String id);

	@Override
	public ALGO getAlgo() {
		return _algo;
	}

}
