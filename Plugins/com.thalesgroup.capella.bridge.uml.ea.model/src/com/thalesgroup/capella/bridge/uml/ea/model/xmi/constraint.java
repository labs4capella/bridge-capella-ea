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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.constraint#getName <em>Name</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.constraint#getType <em>Type</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.constraint#getWeight <em>Weight</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.constraint#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getconstraint()
 * @model
 * @generated
 */
public interface constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getconstraint_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.constraint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getconstraint_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.constraint#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(String)
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getconstraint_Weight()
	 * @model
	 * @generated
	 */
	String getWeight();

	/**
	 * Sets the value of the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.constraint#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getconstraint_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.constraint#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

} // constraint
