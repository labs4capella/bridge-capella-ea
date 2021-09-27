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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.model;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.modelImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.modelImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.modelImpl#getTpos <em>Tpos</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.modelImpl#getEa_localid <em>Ea localid</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.modelImpl#getEa_eletype <em>Ea eletype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class modelImpl extends MinimalEObjectImpl.Container implements model {
	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected EObject package_;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected EObject owner;

	/**
	 * The default value of the '{@link #getTpos() <em>Tpos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTpos()
	 * @generated
	 * @ordered
	 */
	protected static final String TPOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTpos() <em>Tpos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTpos()
	 * @generated
	 * @ordered
	 */
	protected String tpos = TPOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEa_localid() <em>Ea localid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEa_localid()
	 * @generated
	 * @ordered
	 */
	protected static final String EA_LOCALID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEa_localid() <em>Ea localid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEa_localid()
	 * @generated
	 * @ordered
	 */
	protected String ea_localid = EA_LOCALID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEa_eletype() <em>Ea eletype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEa_eletype()
	 * @generated
	 * @ordered
	 */
	protected static final String EA_ELETYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEa_eletype() <em>Ea eletype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEa_eletype()
	 * @generated
	 * @ordered
	 */
	protected String ea_eletype = EA_ELETYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected modelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmiPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getPackage() {
		if (package_ != null && package_.eIsProxy()) {
			InternalEObject oldPackage = (InternalEObject)package_;
			package_ = eResolveProxy(oldPackage);
			if (package_ != oldPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XmiPackage.MODEL__PACKAGE, oldPackage, package_));
			}
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetPackage() {
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackage(EObject newPackage) {
		EObject oldPackage = package_;
		package_ = newPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.MODEL__PACKAGE, oldPackage, package_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XmiPackage.MODEL__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(EObject newOwner) {
		EObject oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.MODEL__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTpos() {
		return tpos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTpos(String newTpos) {
		String oldTpos = tpos;
		tpos = newTpos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.MODEL__TPOS, oldTpos, tpos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEa_localid() {
		return ea_localid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEa_localid(String newEa_localid) {
		String oldEa_localid = ea_localid;
		ea_localid = newEa_localid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.MODEL__EA_LOCALID, oldEa_localid, ea_localid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEa_eletype() {
		return ea_eletype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEa_eletype(String newEa_eletype) {
		String oldEa_eletype = ea_eletype;
		ea_eletype = newEa_eletype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.MODEL__EA_ELETYPE, oldEa_eletype, ea_eletype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmiPackage.MODEL__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case XmiPackage.MODEL__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case XmiPackage.MODEL__TPOS:
				return getTpos();
			case XmiPackage.MODEL__EA_LOCALID:
				return getEa_localid();
			case XmiPackage.MODEL__EA_ELETYPE:
				return getEa_eletype();
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
			case XmiPackage.MODEL__PACKAGE:
				setPackage((EObject)newValue);
				return;
			case XmiPackage.MODEL__OWNER:
				setOwner((EObject)newValue);
				return;
			case XmiPackage.MODEL__TPOS:
				setTpos((String)newValue);
				return;
			case XmiPackage.MODEL__EA_LOCALID:
				setEa_localid((String)newValue);
				return;
			case XmiPackage.MODEL__EA_ELETYPE:
				setEa_eletype((String)newValue);
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
			case XmiPackage.MODEL__PACKAGE:
				setPackage((EObject)null);
				return;
			case XmiPackage.MODEL__OWNER:
				setOwner((EObject)null);
				return;
			case XmiPackage.MODEL__TPOS:
				setTpos(TPOS_EDEFAULT);
				return;
			case XmiPackage.MODEL__EA_LOCALID:
				setEa_localid(EA_LOCALID_EDEFAULT);
				return;
			case XmiPackage.MODEL__EA_ELETYPE:
				setEa_eletype(EA_ELETYPE_EDEFAULT);
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
			case XmiPackage.MODEL__PACKAGE:
				return package_ != null;
			case XmiPackage.MODEL__OWNER:
				return owner != null;
			case XmiPackage.MODEL__TPOS:
				return TPOS_EDEFAULT == null ? tpos != null : !TPOS_EDEFAULT.equals(tpos);
			case XmiPackage.MODEL__EA_LOCALID:
				return EA_LOCALID_EDEFAULT == null ? ea_localid != null : !EA_LOCALID_EDEFAULT.equals(ea_localid);
			case XmiPackage.MODEL__EA_ELETYPE:
				return EA_ELETYPE_EDEFAULT == null ? ea_eletype != null : !EA_ELETYPE_EDEFAULT.equals(ea_eletype);
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
		result.append(" (tpos: ");
		result.append(tpos);
		result.append(", ea_localid: ");
		result.append(ea_localid);
		result.append(", ea_eletype: ");
		result.append(ea_eletype);
		result.append(')');
		return result.toString();
	}

} //modelImpl
