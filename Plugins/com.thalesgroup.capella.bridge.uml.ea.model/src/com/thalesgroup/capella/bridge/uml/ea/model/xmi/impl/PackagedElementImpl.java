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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import com.thalesgroup.capella.bridge.uml.ea.model.xmi.PackagedElement;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.ownedAttribute;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.ownedEnd;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Packaged Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.PackagedElementImpl#getXmiid <em>Xmiid</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.PackagedElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.PackagedElementImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.PackagedElementImpl#getOwnedEnd <em>Owned End</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.PackagedElementImpl#getXmitype <em>Xmitype</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.PackagedElementImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackagedElementImpl extends MinimalEObjectImpl.Container implements PackagedElement {
	/**
	 * The default value of the '{@link #getXmiid() <em>Xmiid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmiid()
	 * @generated
	 * @ordered
	 */
	protected static final String XMIID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXmiid() <em>Xmiid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmiid()
	 * @generated
	 * @ordered
	 */
	protected String xmiid = XMIID_EDEFAULT;

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
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedEnd() <em>Owned End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnd()
	 * @generated
	 * @ordered
	 */
	protected ownedEnd ownedEnd;

	/**
	 * The default value of the '{@link #getXmitype() <em>Xmitype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmitype()
	 * @generated
	 * @ordered
	 */
	protected static final String XMITYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXmitype() <em>Xmitype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmitype()
	 * @generated
	 * @ordered
	 */
	protected String xmitype = XMITYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedAttribute() <em>Owned Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAttribute()
	 * @generated
	 * @ordered
	 */
	protected ownedAttribute ownedAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackagedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmiPackage.Literals.PACKAGED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXmiid() {
		return xmiid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXmiid(String newXmiid) {
		String oldXmiid = xmiid;
		xmiid = newXmiid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.PACKAGED_ELEMENT__XMIID, oldXmiid, xmiid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.PACKAGED_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.PACKAGED_ELEMENT__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ownedEnd getOwnedEnd() {
		if (ownedEnd != null && ownedEnd.eIsProxy()) {
			InternalEObject oldOwnedEnd = (InternalEObject)ownedEnd;
			ownedEnd = (ownedEnd)eResolveProxy(oldOwnedEnd);
			if (ownedEnd != oldOwnedEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XmiPackage.PACKAGED_ELEMENT__OWNED_END, oldOwnedEnd, ownedEnd));
			}
		}
		return ownedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ownedEnd basicGetOwnedEnd() {
		return ownedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedEnd(ownedEnd newOwnedEnd) {
		ownedEnd oldOwnedEnd = ownedEnd;
		ownedEnd = newOwnedEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.PACKAGED_ELEMENT__OWNED_END, oldOwnedEnd, ownedEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXmitype() {
		return xmitype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXmitype(String newXmitype) {
		String oldXmitype = xmitype;
		xmitype = newXmitype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.PACKAGED_ELEMENT__XMITYPE, oldXmitype, xmitype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ownedAttribute getOwnedAttribute() {
		if (ownedAttribute != null && ownedAttribute.eIsProxy()) {
			InternalEObject oldOwnedAttribute = (InternalEObject)ownedAttribute;
			ownedAttribute = (ownedAttribute)eResolveProxy(oldOwnedAttribute);
			if (ownedAttribute != oldOwnedAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XmiPackage.PACKAGED_ELEMENT__OWNED_ATTRIBUTE, oldOwnedAttribute, ownedAttribute));
			}
		}
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ownedAttribute basicGetOwnedAttribute() {
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedAttribute(ownedAttribute newOwnedAttribute) {
		ownedAttribute oldOwnedAttribute = ownedAttribute;
		ownedAttribute = newOwnedAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.PACKAGED_ELEMENT__OWNED_ATTRIBUTE, oldOwnedAttribute, ownedAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmiPackage.PACKAGED_ELEMENT__XMIID:
				return getXmiid();
			case XmiPackage.PACKAGED_ELEMENT__NAME:
				return getName();
			case XmiPackage.PACKAGED_ELEMENT__PREFIX:
				return getPrefix();
			case XmiPackage.PACKAGED_ELEMENT__OWNED_END:
				if (resolve) return getOwnedEnd();
				return basicGetOwnedEnd();
			case XmiPackage.PACKAGED_ELEMENT__XMITYPE:
				return getXmitype();
			case XmiPackage.PACKAGED_ELEMENT__OWNED_ATTRIBUTE:
				if (resolve) return getOwnedAttribute();
				return basicGetOwnedAttribute();
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
			case XmiPackage.PACKAGED_ELEMENT__XMIID:
				setXmiid((String)newValue);
				return;
			case XmiPackage.PACKAGED_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case XmiPackage.PACKAGED_ELEMENT__PREFIX:
				setPrefix((String)newValue);
				return;
			case XmiPackage.PACKAGED_ELEMENT__OWNED_END:
				setOwnedEnd((ownedEnd)newValue);
				return;
			case XmiPackage.PACKAGED_ELEMENT__XMITYPE:
				setXmitype((String)newValue);
				return;
			case XmiPackage.PACKAGED_ELEMENT__OWNED_ATTRIBUTE:
				setOwnedAttribute((ownedAttribute)newValue);
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
			case XmiPackage.PACKAGED_ELEMENT__XMIID:
				setXmiid(XMIID_EDEFAULT);
				return;
			case XmiPackage.PACKAGED_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmiPackage.PACKAGED_ELEMENT__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case XmiPackage.PACKAGED_ELEMENT__OWNED_END:
				setOwnedEnd((ownedEnd)null);
				return;
			case XmiPackage.PACKAGED_ELEMENT__XMITYPE:
				setXmitype(XMITYPE_EDEFAULT);
				return;
			case XmiPackage.PACKAGED_ELEMENT__OWNED_ATTRIBUTE:
				setOwnedAttribute((ownedAttribute)null);
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
			case XmiPackage.PACKAGED_ELEMENT__XMIID:
				return XMIID_EDEFAULT == null ? xmiid != null : !XMIID_EDEFAULT.equals(xmiid);
			case XmiPackage.PACKAGED_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmiPackage.PACKAGED_ELEMENT__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case XmiPackage.PACKAGED_ELEMENT__OWNED_END:
				return ownedEnd != null;
			case XmiPackage.PACKAGED_ELEMENT__XMITYPE:
				return XMITYPE_EDEFAULT == null ? xmitype != null : !XMITYPE_EDEFAULT.equals(xmitype);
			case XmiPackage.PACKAGED_ELEMENT__OWNED_ATTRIBUTE:
				return ownedAttribute != null;
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
		result.append(" (xmiid: ");
		result.append(xmiid);
		result.append(", name: ");
		result.append(name);
		result.append(", prefix: ");
		result.append(prefix);
		result.append(", xmitype: ");
		result.append(xmitype);
		result.append(')');
		return result.toString();
	}

} //PackagedElementImpl
