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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.thalesgroup.capella.bridge.uml.ea.model.xmi.Extension;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.connectors;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.elements;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.profiles;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.ExtensionImpl#getExtender <em>Extender</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.ExtensionImpl#getExtenderID <em>Extender ID</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.ExtensionImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.ExtensionImpl#getProfiles <em>Profiles</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.ExtensionImpl#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtensionImpl extends MinimalEObjectImpl.Container implements Extension {
	/**
	 * The default value of the '{@link #getExtender() <em>Extender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtender()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENDER_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getExtender() <em>Extender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtender()
	 * @generated
	 * @ordered
	 */
	protected String extender = EXTENDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtenderID() <em>Extender ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtenderID()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtenderID() <em>Extender ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtenderID()
	 * @generated
	 * @ordered
	 */
	protected String extenderID = EXTENDER_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<elements> elements;

	/**
	 * The cached value of the '{@link #getProfiles() <em>Profiles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfiles()
	 * @generated
	 * @ordered
	 */
	protected profiles profiles;

	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<connectors> connectors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmiPackage.Literals.EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExtender() {
		return extender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtender(String newExtender) {
		String oldExtender = extender;
		extender = newExtender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.EXTENSION__EXTENDER, oldExtender, extender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExtenderID() {
		return extenderID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtenderID(String newExtenderID) {
		String oldExtenderID = extenderID;
		extenderID = newExtenderID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.EXTENSION__EXTENDER_ID, oldExtenderID, extenderID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<elements> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<elements>(elements.class, this, XmiPackage.EXTENSION__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public profiles getProfiles() {
		return profiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfiles(profiles newProfiles, NotificationChain msgs) {
		profiles oldProfiles = profiles;
		profiles = newProfiles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmiPackage.EXTENSION__PROFILES, oldProfiles, newProfiles);
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
	public void setProfiles(profiles newProfiles) {
		if (newProfiles != profiles) {
			NotificationChain msgs = null;
			if (profiles != null)
				msgs = ((InternalEObject)profiles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmiPackage.EXTENSION__PROFILES, null, msgs);
			if (newProfiles != null)
				msgs = ((InternalEObject)newProfiles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmiPackage.EXTENSION__PROFILES, null, msgs);
			msgs = basicSetProfiles(newProfiles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.EXTENSION__PROFILES, newProfiles, newProfiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<connectors> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentEList<connectors>(connectors.class, this, XmiPackage.EXTENSION__CONNECTORS);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmiPackage.EXTENSION__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case XmiPackage.EXTENSION__PROFILES:
				return basicSetProfiles(null, msgs);
			case XmiPackage.EXTENSION__CONNECTORS:
				return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
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
			case XmiPackage.EXTENSION__EXTENDER:
				return getExtender();
			case XmiPackage.EXTENSION__EXTENDER_ID:
				return getExtenderID();
			case XmiPackage.EXTENSION__ELEMENTS:
				return getElements();
			case XmiPackage.EXTENSION__PROFILES:
				return getProfiles();
			case XmiPackage.EXTENSION__CONNECTORS:
				return getConnectors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmiPackage.EXTENSION__EXTENDER:
				setExtender((String)newValue);
				return;
			case XmiPackage.EXTENSION__EXTENDER_ID:
				setExtenderID((String)newValue);
				return;
			case XmiPackage.EXTENSION__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends elements>)newValue);
				return;
			case XmiPackage.EXTENSION__PROFILES:
				setProfiles((profiles)newValue);
				return;
			case XmiPackage.EXTENSION__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends connectors>)newValue);
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
			case XmiPackage.EXTENSION__EXTENDER:
				setExtender(EXTENDER_EDEFAULT);
				return;
			case XmiPackage.EXTENSION__EXTENDER_ID:
				setExtenderID(EXTENDER_ID_EDEFAULT);
				return;
			case XmiPackage.EXTENSION__ELEMENTS:
				getElements().clear();
				return;
			case XmiPackage.EXTENSION__PROFILES:
				setProfiles((profiles)null);
				return;
			case XmiPackage.EXTENSION__CONNECTORS:
				getConnectors().clear();
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
			case XmiPackage.EXTENSION__EXTENDER:
				return EXTENDER_EDEFAULT == null ? extender != null : !EXTENDER_EDEFAULT.equals(extender);
			case XmiPackage.EXTENSION__EXTENDER_ID:
				return EXTENDER_ID_EDEFAULT == null ? extenderID != null : !EXTENDER_ID_EDEFAULT.equals(extenderID);
			case XmiPackage.EXTENSION__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case XmiPackage.EXTENSION__PROFILES:
				return profiles != null;
			case XmiPackage.EXTENSION__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
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
		result.append(" (extender: ");
		result.append(extender);
		result.append(", extenderID: ");
		result.append(extenderID);
		result.append(')');
		return result.toString();
	}

} //ExtensionImpl
