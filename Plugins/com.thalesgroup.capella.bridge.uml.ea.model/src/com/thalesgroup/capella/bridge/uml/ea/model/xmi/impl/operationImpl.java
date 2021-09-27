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
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.operation;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.stereotype;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.tags;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.xrefs;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.operationImpl#getXmiidref <em>Xmiidref</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.operationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.operationImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.operationImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.operationImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.operationImpl#getXrefs <em>Xrefs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class operationImpl extends MinimalEObjectImpl.Container implements operation {
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
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected tags tags;

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
	 * The cached value of the '{@link #getXrefs() <em>Xrefs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXrefs()
	 * @generated
	 * @ordered
	 */
	protected xrefs xrefs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected operationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmiPackage.Literals.OPERATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XmiPackage.OPERATION__XMIIDREF, oldXmiidref, xmiidref));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.OPERATION__XMIIDREF, oldXmiidref, xmiidref));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.OPERATION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.OPERATION__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public tags getTags() {
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTags(tags newTags, NotificationChain msgs) {
		tags oldTags = tags;
		tags = newTags;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmiPackage.OPERATION__TAGS, oldTags, newTags);
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
	public void setTags(tags newTags) {
		if (newTags != tags) {
			NotificationChain msgs = null;
			if (tags != null)
				msgs = ((InternalEObject)tags).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmiPackage.OPERATION__TAGS, null, msgs);
			if (newTags != null)
				msgs = ((InternalEObject)newTags).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmiPackage.OPERATION__TAGS, null, msgs);
			msgs = basicSetTags(newTags, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.OPERATION__TAGS, newTags, newTags));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmiPackage.OPERATION__STEREOTYPE, oldStereotype, newStereotype);
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
				msgs = ((InternalEObject)stereotype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmiPackage.OPERATION__STEREOTYPE, null, msgs);
			if (newStereotype != null)
				msgs = ((InternalEObject)newStereotype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmiPackage.OPERATION__STEREOTYPE, null, msgs);
			msgs = basicSetStereotype(newStereotype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.OPERATION__STEREOTYPE, newStereotype, newStereotype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public xrefs getXrefs() {
		return xrefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXrefs(xrefs newXrefs, NotificationChain msgs) {
		xrefs oldXrefs = xrefs;
		xrefs = newXrefs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmiPackage.OPERATION__XREFS, oldXrefs, newXrefs);
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
	public void setXrefs(xrefs newXrefs) {
		if (newXrefs != xrefs) {
			NotificationChain msgs = null;
			if (xrefs != null)
				msgs = ((InternalEObject)xrefs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmiPackage.OPERATION__XREFS, null, msgs);
			if (newXrefs != null)
				msgs = ((InternalEObject)newXrefs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmiPackage.OPERATION__XREFS, null, msgs);
			msgs = basicSetXrefs(newXrefs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.OPERATION__XREFS, newXrefs, newXrefs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmiPackage.OPERATION__TAGS:
				return basicSetTags(null, msgs);
			case XmiPackage.OPERATION__STEREOTYPE:
				return basicSetStereotype(null, msgs);
			case XmiPackage.OPERATION__XREFS:
				return basicSetXrefs(null, msgs);
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
			case XmiPackage.OPERATION__XMIIDREF:
				if (resolve) return getXmiidref();
				return basicGetXmiidref();
			case XmiPackage.OPERATION__NAME:
				return getName();
			case XmiPackage.OPERATION__SCOPE:
				return getScope();
			case XmiPackage.OPERATION__TAGS:
				return getTags();
			case XmiPackage.OPERATION__STEREOTYPE:
				return getStereotype();
			case XmiPackage.OPERATION__XREFS:
				return getXrefs();
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
			case XmiPackage.OPERATION__XMIIDREF:
				setXmiidref((EObject)newValue);
				return;
			case XmiPackage.OPERATION__NAME:
				setName((String)newValue);
				return;
			case XmiPackage.OPERATION__SCOPE:
				setScope((String)newValue);
				return;
			case XmiPackage.OPERATION__TAGS:
				setTags((tags)newValue);
				return;
			case XmiPackage.OPERATION__STEREOTYPE:
				setStereotype((stereotype)newValue);
				return;
			case XmiPackage.OPERATION__XREFS:
				setXrefs((xrefs)newValue);
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
			case XmiPackage.OPERATION__XMIIDREF:
				setXmiidref((EObject)null);
				return;
			case XmiPackage.OPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmiPackage.OPERATION__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case XmiPackage.OPERATION__TAGS:
				setTags((tags)null);
				return;
			case XmiPackage.OPERATION__STEREOTYPE:
				setStereotype((stereotype)null);
				return;
			case XmiPackage.OPERATION__XREFS:
				setXrefs((xrefs)null);
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
			case XmiPackage.OPERATION__XMIIDREF:
				return xmiidref != null;
			case XmiPackage.OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmiPackage.OPERATION__SCOPE:
				return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
			case XmiPackage.OPERATION__TAGS:
				return tags != null;
			case XmiPackage.OPERATION__STEREOTYPE:
				return stereotype != null;
			case XmiPackage.OPERATION__XREFS:
				return xrefs != null;
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
		result.append(')');
		return result.toString();
	}

} //operationImpl
