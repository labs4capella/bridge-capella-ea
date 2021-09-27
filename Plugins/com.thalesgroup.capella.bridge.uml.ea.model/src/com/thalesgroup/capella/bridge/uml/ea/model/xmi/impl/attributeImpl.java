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
package com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.attribute;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.extendedProperties;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.stereotype;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.attributeImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.attributeImpl#getXmiidref <em>Xmiidref</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.attributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.attributeImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.attributeImpl#getExtendedProperties <em>Extended Properties</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.attributeImpl#getTagged <em>Tagged</em>}</li>
 * </ul>
 *
 * @generated
 */
public class attributeImpl extends MinimalEObjectImpl.Container implements attribute {
	/**
	 * The cached value of the '{@link #getStereotype() <em>Stereotype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
	protected stereotype stereotype;

	/**
	 * The cached value of the '{@link #getXmiidref() <em>Xmiidref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmiidref()
	 * @generated
	 * @ordered
	 */
	protected EObject xmiidref;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected String scope = SCOPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtendedProperties() <em>Extended Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedProperties()
	 * @generated
	 * @ordered
	 */
	protected extendedProperties extendedProperties;

	/**
	 * The default value of the '{@link #getTagged() <em>Tagged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagged()
	 * @generated
	 * @ordered
	 */
	protected static final String TAGGED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTagged() <em>Tagged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagged()
	 * @generated
	 * @ordered
	 */
	protected String tagged = TAGGED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected attributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmiPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public stereotype getStereotype() {
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStereotype(stereotype newStereotype, NotificationChain msgs) {
		stereotype oldStereotype = stereotype;
		stereotype = newStereotype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmiPackage.ATTRIBUTE__STEREOTYPE, oldStereotype, newStereotype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStereotype(stereotype newStereotype) {
		if (newStereotype != stereotype) {
			NotificationChain msgs = null;
			if (stereotype != null)
				msgs = ((InternalEObject)stereotype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmiPackage.ATTRIBUTE__STEREOTYPE, null, msgs);
			if (newStereotype != null)
				msgs = ((InternalEObject)newStereotype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmiPackage.ATTRIBUTE__STEREOTYPE, null, msgs);
			msgs = basicSetStereotype(newStereotype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.ATTRIBUTE__STEREOTYPE, newStereotype, newStereotype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getXmiidref() {
		if (xmiidref != null && xmiidref.eIsProxy()) {
			InternalEObject oldXmiidref = (InternalEObject)xmiidref;
			xmiidref = eResolveProxy(oldXmiidref);
			if (xmiidref != oldXmiidref) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XmiPackage.ATTRIBUTE__XMIIDREF, oldXmiidref, xmiidref));
			}
		}
		return xmiidref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetXmiidref() {
		return xmiidref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXmiidref(EObject newXmiidref) {
		EObject oldXmiidref = xmiidref;
		xmiidref = newXmiidref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.ATTRIBUTE__XMIIDREF, oldXmiidref, xmiidref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScope(String newScope) {
		String oldScope = scope;
		scope = newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.ATTRIBUTE__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public extendedProperties getExtendedProperties() {
		return extendedProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendedProperties(extendedProperties newExtendedProperties, NotificationChain msgs) {
		extendedProperties oldExtendedProperties = extendedProperties;
		extendedProperties = newExtendedProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmiPackage.ATTRIBUTE__EXTENDED_PROPERTIES, oldExtendedProperties, newExtendedProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtendedProperties(extendedProperties newExtendedProperties) {
		if (newExtendedProperties != extendedProperties) {
			NotificationChain msgs = null;
			if (extendedProperties != null)
				msgs = ((InternalEObject)extendedProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmiPackage.ATTRIBUTE__EXTENDED_PROPERTIES, null, msgs);
			if (newExtendedProperties != null)
				msgs = ((InternalEObject)newExtendedProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmiPackage.ATTRIBUTE__EXTENDED_PROPERTIES, null, msgs);
			msgs = basicSetExtendedProperties(newExtendedProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.ATTRIBUTE__EXTENDED_PROPERTIES, newExtendedProperties, newExtendedProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTagged() {
		return tagged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTagged(String newTagged) {
		String oldTagged = tagged;
		tagged = newTagged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.ATTRIBUTE__TAGGED, oldTagged, tagged));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmiPackage.ATTRIBUTE__STEREOTYPE:
				return basicSetStereotype(null, msgs);
			case XmiPackage.ATTRIBUTE__EXTENDED_PROPERTIES:
				return basicSetExtendedProperties(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmiPackage.ATTRIBUTE__STEREOTYPE:
				return getStereotype();
			case XmiPackage.ATTRIBUTE__XMIIDREF:
				if (resolve) return getXmiidref();
				return basicGetXmiidref();
			case XmiPackage.ATTRIBUTE__NAME:
				return getName();
			case XmiPackage.ATTRIBUTE__SCOPE:
				return getScope();
			case XmiPackage.ATTRIBUTE__EXTENDED_PROPERTIES:
				return getExtendedProperties();
			case XmiPackage.ATTRIBUTE__TAGGED:
				return getTagged();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmiPackage.ATTRIBUTE__STEREOTYPE:
				setStereotype((stereotype)newValue);
				return;
			case XmiPackage.ATTRIBUTE__XMIIDREF:
				setXmiidref((EObject)newValue);
				return;
			case XmiPackage.ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case XmiPackage.ATTRIBUTE__SCOPE:
				setScope((String)newValue);
				return;
			case XmiPackage.ATTRIBUTE__EXTENDED_PROPERTIES:
				setExtendedProperties((extendedProperties)newValue);
				return;
			case XmiPackage.ATTRIBUTE__TAGGED:
				setTagged((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XmiPackage.ATTRIBUTE__STEREOTYPE:
				setStereotype((stereotype)null);
				return;
			case XmiPackage.ATTRIBUTE__XMIIDREF:
				setXmiidref((EObject)null);
				return;
			case XmiPackage.ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmiPackage.ATTRIBUTE__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case XmiPackage.ATTRIBUTE__EXTENDED_PROPERTIES:
				setExtendedProperties((extendedProperties)null);
				return;
			case XmiPackage.ATTRIBUTE__TAGGED:
				setTagged(TAGGED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XmiPackage.ATTRIBUTE__STEREOTYPE:
				return stereotype != null;
			case XmiPackage.ATTRIBUTE__XMIIDREF:
				return xmiidref != null;
			case XmiPackage.ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmiPackage.ATTRIBUTE__SCOPE:
				return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
			case XmiPackage.ATTRIBUTE__EXTENDED_PROPERTIES:
				return extendedProperties != null;
			case XmiPackage.ATTRIBUTE__TAGGED:
				return TAGGED_EDEFAULT == null ? tagged != null : !TAGGED_EDEFAULT.equals(tagged);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", scope: ");
		result.append(scope);
		result.append(", tagged: ");
		result.append(tagged);
		result.append(')');
		return result.toString();
	}

} //attributeImpl
