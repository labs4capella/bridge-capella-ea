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
import java.util.List;

import org.eclipse.emf.diffmerge.api.scopes.IModelScope;
import org.eclipse.emf.diffmerge.bridge.incremental.IntermediateModelScope;
import org.eclipse.emf.diffmerge.impl.scopes.FragmentedModelScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMIResource;

import com.artal.capella.bridge.core.rules.AbstractDynamicMapping;
import com.artal.capella.bridge.core.rules.AbstractMapping;

/**
 * @author Yann BINOT
 */
public class MappingUtils {

	/**
	 * Allows to trace the created target element.
	 * 
	 * @param rule          the creation rule.
	 * @param eResource     the {@link Resource}
	 * @param sourceElement the sysml element.
	 * @param targetElement the capella element
	 * @param prefix        a prefix to add for identification.
	 */
	@SuppressWarnings("unchecked")
	static public void trace(AbstractMapping rule, Resource eResource, Object sourceElement, Object targetElement,
			String prefix) {
		String id = "";
		if (sourceElement instanceof EObject) {
			id = getSysMLID(eResource, (EObject) sourceElement);
		} else {
			id = sourceElement.toString();
		}
		rule.getAlgo().add(prefix + id, (EObject) targetElement);
		if (rule.getMapSourceToTarget().containsKey(sourceElement)) {
			Object object = rule.getMapSourceToTarget().get(sourceElement);
			if (object instanceof List<?>) {
				List<Object> list = (List<Object>) object;
				list.add(targetElement);
			} else {
				List<Object> list = new ArrayList<>();
				list.add(object);
				list.add(targetElement);
				rule.getMapSourceToTarget().put(sourceElement, list);
			}
		} else {
			rule.getMapSourceToTarget().put(sourceElement, targetElement);
		}
	}

	/**
	 * Get the xmi id for a {@link EObject} <code>object</code>> element.
	 * 
	 * @param resource The Sysml {@link Resource}.
	 * @param object   the element to identify
	 * @return the String id
	 */
	static public String getSysMLID(Resource resource, EObject object) {
		if (resource instanceof XMIResource) {
			return ((XMIResource) resource).getID(object);
		}
		return "";
	}

	public static ResourceSet getTargetResourceSet(IModelScope scope) {

		if (scope instanceof FragmentedModelScope) {
			List<Resource> resources = ((FragmentedModelScope) scope).getResources();
			if (resources != null && !resources.isEmpty()) {
				return resources.get(0).getResourceSet();
			}

		} else if (scope instanceof IntermediateModelScope) {
			return getTargetResourceSet(((IntermediateModelScope) scope).getTargetDataSet());
		}

		return null;
	}

	static public void generateUID(CapellaBridgeAlgo<?> algo, EObject source, EObject element,
			AbstractDynamicMapping<?, ?, ?> rule) {
		generateUID(algo, source, element, rule, "");
	}

	static public void generateUID(CapellaBridgeAlgo<?> algo, EObject source, EObject element,
			AbstractDynamicMapping<?, ?, ?> rule, String suffix) {
		Resource eResource = source.eResource();
		String sysMLID = MappingUtils.getSysMLID(eResource, source);
		algo.putId(element, rule, sysMLID + suffix);
	}

	static public void generateNamesUID(CapellaBridgeAlgo<?> algo, EObject element,
			AbstractDynamicMapping<?, ?, ?> rule, String id) {
		algo.putId(element, rule, id);
	}

}
