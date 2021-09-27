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
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.Extension#getExtender <em>Extender</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.Extension#getExtenderID <em>Extender ID</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.Extension#getElements <em>Elements</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.Extension#getProfiles <em>Profiles</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.Extension#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getExtension()
 * @model
 * @generated
 */
public interface Extension extends EObject {
	/**
	 * Returns the value of the '<em><b>Extender</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extender</em>' attribute.
	 * @see #setExtender(String)
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getExtension_Extender()
	 * @model default=""
	 * @generated
	 */
	String getExtender();

	/**
	 * Sets the value of the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.Extension#getExtender <em>Extender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extender</em>' attribute.
	 * @see #getExtender()
	 * @generated
	 */
	void setExtender(String value);

	/**
	 * Returns the value of the '<em><b>Extender ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extender ID</em>' attribute.
	 * @see #setExtenderID(String)
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getExtension_ExtenderID()
	 * @model
	 * @generated
	 */
	String getExtenderID();

	/**
	 * Sets the value of the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.Extension#getExtenderID <em>Extender ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extender ID</em>' attribute.
	 * @see #getExtenderID()
	 * @generated
	 */
	void setExtenderID(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.elements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getExtension_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<elements> getElements();

	/**
	 * Returns the value of the '<em><b>Profiles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profiles</em>' containment reference.
	 * @see #setProfiles(profiles)
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getExtension_Profiles()
	 * @model containment="true"
	 * @generated
	 */
	profiles getProfiles();

	/**
	 * Sets the value of the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.Extension#getProfiles <em>Profiles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profiles</em>' containment reference.
	 * @see #getProfiles()
	 * @generated
	 */
	void setProfiles(profiles value);

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.connectors}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getExtension_Connectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<connectors> getConnectors();

} // Extension
