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
 * A representation of the model object '<em><b>attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.attribute#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.attribute#getXmiidref <em>Xmiidref</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.attribute#getName <em>Name</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.attribute#getScope <em>Scope</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.attribute#getExtendedProperties <em>Extended Properties</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.attribute#getTagged <em>Tagged</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getattribute()
 * @model
 * @generated
 */
public interface attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Stereotype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stereotype</em>' containment reference.
	 * @see #setStereotype(stereotype)
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getattribute_Stereotype()
	 * @model containment="true"
	 * @generated
	 */
	stereotype getStereotype();

	/**
	 * Sets the value of the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.attribute#getStereotype <em>Stereotype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stereotype</em>' containment reference.
	 * @see #getStereotype()
	 * @generated
	 */
	void setStereotype(stereotype value);

	/**
	 * Returns the value of the '<em><b>Xmiidref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xmiidref</em>' reference.
	 * @see #setXmiidref(EObject)
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getattribute_Xmiidref()
	 * @model
	 * @generated
	 */
	EObject getXmiidref();

	/**
	 * Sets the value of the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.attribute#getXmiidref <em>Xmiidref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xmiidref</em>' reference.
	 * @see #getXmiidref()
	 * @generated
	 */
	void setXmiidref(EObject value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getattribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see #setScope(String)
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getattribute_Scope()
	 * @model
	 * @generated
	 */
	String getScope();

	/**
	 * Sets the value of the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.attribute#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(String value);

	/**
	 * Returns the value of the '<em><b>Extended Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Properties</em>' containment reference.
	 * @see #setExtendedProperties(extendedProperties)
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getattribute_ExtendedProperties()
	 * @model containment="true"
	 * @generated
	 */
	extendedProperties getExtendedProperties();

	/**
	 * Sets the value of the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.attribute#getExtendedProperties <em>Extended Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Properties</em>' containment reference.
	 * @see #getExtendedProperties()
	 * @generated
	 */
	void setExtendedProperties(extendedProperties value);

	/**
	 * Returns the value of the '<em><b>Tagged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tagged</em>' attribute.
	 * @see #setTagged(String)
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getattribute_Tagged()
	 * @model
	 * @generated
	 */
	String getTagged();

	/**
	 * Sets the value of the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.attribute#getTagged <em>Tagged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tagged</em>' attribute.
	 * @see #getTagged()
	 * @generated
	 */
	void setTagged(String value);

} // attribute
