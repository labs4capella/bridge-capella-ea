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

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.ownedEnd;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>owned End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.ownedEndImpl#getXmiid <em>Xmiid</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.ownedEndImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.ownedEndImpl#getMemberEnd <em>Member End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ownedEndImpl extends MinimalEObjectImpl.Container implements ownedEnd {
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
	 * The default value of the '{@link #getMemberEnd() <em>Member End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberEnd()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMBER_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemberEnd() <em>Member End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberEnd()
	 * @generated
	 * @ordered
	 */
	protected String memberEnd = MEMBER_END_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ownedEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmiPackage.Literals.OWNED_END;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.OWNED_END__XMIID, oldXmiid, xmiid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.OWNED_END__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMemberEnd() {
		return memberEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemberEnd(String newMemberEnd) {
		String oldMemberEnd = memberEnd;
		memberEnd = newMemberEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.OWNED_END__MEMBER_END, oldMemberEnd, memberEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmiPackage.OWNED_END__XMIID:
				return getXmiid();
			case XmiPackage.OWNED_END__NAME:
				return getName();
			case XmiPackage.OWNED_END__MEMBER_END:
				return getMemberEnd();
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
			case XmiPackage.OWNED_END__XMIID:
				setXmiid((String)newValue);
				return;
			case XmiPackage.OWNED_END__NAME:
				setName((String)newValue);
				return;
			case XmiPackage.OWNED_END__MEMBER_END:
				setMemberEnd((String)newValue);
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
			case XmiPackage.OWNED_END__XMIID:
				setXmiid(XMIID_EDEFAULT);
				return;
			case XmiPackage.OWNED_END__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmiPackage.OWNED_END__MEMBER_END:
				setMemberEnd(MEMBER_END_EDEFAULT);
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
			case XmiPackage.OWNED_END__XMIID:
				return XMIID_EDEFAULT == null ? xmiid != null : !XMIID_EDEFAULT.equals(xmiid);
			case XmiPackage.OWNED_END__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmiPackage.OWNED_END__MEMBER_END:
				return MEMBER_END_EDEFAULT == null ? memberEnd != null : !MEMBER_END_EDEFAULT.equals(memberEnd);
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
		result.append(", memberEnd: ");
		result.append(memberEnd);
		result.append(')');
		return result.toString();
	}

} //ownedEndImpl
