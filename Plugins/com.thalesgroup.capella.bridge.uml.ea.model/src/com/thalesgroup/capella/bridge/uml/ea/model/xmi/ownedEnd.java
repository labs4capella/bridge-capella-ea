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
 * A representation of the model object '<em><b>owned End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.ownedEnd#getXmiid <em>Xmiid</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.ownedEnd#getName <em>Name</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.ownedEnd#getMemberEnd <em>Member End</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getownedEnd()
 * @model
 * @generated
 */
public interface ownedEnd extends EObject {
	/**
	 * Returns the value of the '<em><b>Xmiid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xmiid</em>' attribute.
	 * @see #setXmiid(String)
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getownedEnd_Xmiid()
	 * @model
	 * @generated
	 */
	String getXmiid();

	/**
	 * Sets the value of the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.ownedEnd#getXmiid <em>Xmiid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xmiid</em>' attribute.
	 * @see #getXmiid()
	 * @generated
	 */
	void setXmiid(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getownedEnd_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.ownedEnd#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Member End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member End</em>' attribute.
	 * @see #setMemberEnd(String)
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getownedEnd_MemberEnd()
	 * @model
	 * @generated
	 */
	String getMemberEnd();

	/**
	 * Sets the value of the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.ownedEnd#getMemberEnd <em>Member End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member End</em>' attribute.
	 * @see #getMemberEnd()
	 * @generated
	 */
	void setMemberEnd(String value);

} // ownedEnd
