/*******************************************************************************
* Copyright (c) 2021 THALES GLOBAL SERVICES.
* All right reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* Contributors:
*     Artal Technologies - initial API and implementation
*******************************************************************************/
package com.thalesgroup.capella.bridge.uml.ea.core.bridge.rules.utils;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.common.util.CacheAdapter;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.internal.operations.ElementOperations;

/**
 * @author Yann BINOT
 */
public class Capella2UMLElementOperations extends ElementOperations {

	/**
	 * 
	 */
	public Capella2UMLElementOperations() {
		// TODO Auto-generated constructor stub
	}

	
	public static EObject applyStereotype(Element element,
			Stereotype stereotype) {
		EClass definition = getDefinition(element, stereotype, true);

		if (getExtension(element, stereotype) == null) {
			throw new IllegalArgumentException(
				String.format("stereotype \"%s\" is not applicable to %s", //$NON-NLS-1$
					stereotype.getQualifiedName(), element.eClass().getName()));
		}

		if (element.getStereotypeApplication(stereotype) != null) {
			throw new IllegalArgumentException(
				String.format("stereotype \"%s\" is already applied", //$NON-NLS-1$
					stereotype.getQualifiedName()));
		}

		return applyStereotype(element, definition);
	}
	
	
	static public EObject applyStereotype(Element element, EClass definition) {
		EObject stereotypeApplication = EcoreUtil.create(definition);

		CacheAdapter.getInstance().adapt(stereotypeApplication);

		addToContainmentList(element, stereotypeApplication);
		setBaseElement(stereotypeApplication, element);

		return stereotypeApplication;
	}
	
	static public boolean addToContainmentList(Element element,
			EObject stereotypeApplication) {
		boolean result = false;

		EList<EObject> containmentList = getContainmentList(element,
			stereotypeApplication.eClass());

		if (containmentList != null) {
			result = containmentList.add(stereotypeApplication);
		}

		return result;
	}
	
	static protected EList<EObject> getContainmentList(Element element,
			EClass definition) {
		Resource eResource = element.eResource();
		
		Model model = element.getModel();
		EList<EObject> eContents = model.eContents();
		return eContents;
	}	
}