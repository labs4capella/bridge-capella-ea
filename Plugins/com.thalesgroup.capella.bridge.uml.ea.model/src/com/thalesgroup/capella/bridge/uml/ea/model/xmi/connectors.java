/**
 * Copyright (c) 2021 THALES GLOBAL SERVICES.
 * All right reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * Contributors: 
 * 	Artal Technologies - initial API and implementation
 * 
 */
package com.thalesgroup.capella.bridge.uml.ea.model.xmi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>connectors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.connectors#getConnector <em>Connector</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.connectors#getTest <em>Test</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getconnectors()
 * @model
 * @generated
 */
public interface connectors extends EObject {
	/**
	 * Returns the value of the '<em><b>Connector</b></em>' containment reference list.
	 * The list contents are of type {@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' containment reference list.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getconnectors_Connector()
	 * @model containment="true"
	 * @generated
	 */
	EList<connector> getConnector();

	/**
	 * Returns the value of the '<em><b>Test</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' reference list.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getconnectors_Test()
	 * @model derived="true"
	 * @generated
	 */
	EList<EObject> getTest();

} // connectors
