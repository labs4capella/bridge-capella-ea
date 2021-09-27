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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import com.thalesgroup.capella.bridge.uml.ea.model.xmi.PackagedElement;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.umlProfile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>uml Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.umlProfileImpl#getPackagedElement <em>Packaged Element</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.umlProfileImpl#getMemberEnd <em>Member End</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.umlProfileImpl#getXmiversion <em>Xmiversion</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.umlProfileImpl#getXmlnsuml <em>Xmlnsuml</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.umlProfileImpl#getXmlnsxmi <em>Xmlnsxmi</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.umlProfileImpl#getXmiid <em>Xmiid</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.umlProfileImpl#getNsPrefix <em>Ns Prefix</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.umlProfileImpl#getMetamodelReference <em>Metamodel Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class umlProfileImpl extends MinimalEObjectImpl.Container implements umlProfile {
	/**
	 * The cached value of the '{@link #getPackagedElement() <em>Packaged Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<PackagedElement> packagedElement;

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
	 * The default value of the '{@link #getXmiversion() <em>Xmiversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmiversion()
	 * @generated
	 * @ordered
	 */
	protected static final String XMIVERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXmiversion() <em>Xmiversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmiversion()
	 * @generated
	 * @ordered
	 */
	protected String xmiversion = XMIVERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getXmlnsuml() <em>Xmlnsuml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlnsuml()
	 * @generated
	 * @ordered
	 */
	protected static final String XMLNSUML_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXmlnsuml() <em>Xmlnsuml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlnsuml()
	 * @generated
	 * @ordered
	 */
	protected String xmlnsuml = XMLNSUML_EDEFAULT;

	/**
	 * The default value of the '{@link #getXmlnsxmi() <em>Xmlnsxmi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlnsxmi()
	 * @generated
	 * @ordered
	 */
	protected static final String XMLNSXMI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXmlnsxmi() <em>Xmlnsxmi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlnsxmi()
	 * @generated
	 * @ordered
	 */
	protected String xmlnsxmi = XMLNSXMI_EDEFAULT;

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
	 * The default value of the '{@link #getNsPrefix() <em>Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String NS_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNsPrefix() <em>Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsPrefix()
	 * @generated
	 * @ordered
	 */
	protected String nsPrefix = NS_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetamodelReference() <em>Metamodel Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelReference()
	 * @generated
	 * @ordered
	 */
	protected static final String METAMODEL_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetamodelReference() <em>Metamodel Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelReference()
	 * @generated
	 * @ordered
	 */
	protected String metamodelReference = METAMODEL_REFERENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected umlProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmiPackage.Literals.UML_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PackagedElement> getPackagedElement() {
		if (packagedElement == null) {
			packagedElement = new EObjectResolvingEList<PackagedElement>(PackagedElement.class, this, XmiPackage.UML_PROFILE__PACKAGED_ELEMENT);
		}
		return packagedElement;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.UML_PROFILE__MEMBER_END, oldMemberEnd, memberEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXmiversion() {
		return xmiversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXmiversion(String newXmiversion) {
		String oldXmiversion = xmiversion;
		xmiversion = newXmiversion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.UML_PROFILE__XMIVERSION, oldXmiversion, xmiversion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXmlnsuml() {
		return xmlnsuml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXmlnsuml(String newXmlnsuml) {
		String oldXmlnsuml = xmlnsuml;
		xmlnsuml = newXmlnsuml;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.UML_PROFILE__XMLNSUML, oldXmlnsuml, xmlnsuml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXmlnsxmi() {
		return xmlnsxmi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXmlnsxmi(String newXmlnsxmi) {
		String oldXmlnsxmi = xmlnsxmi;
		xmlnsxmi = newXmlnsxmi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.UML_PROFILE__XMLNSXMI, oldXmlnsxmi, xmlnsxmi));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.UML_PROFILE__XMIID, oldXmiid, xmiid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNsPrefix() {
		return nsPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNsPrefix(String newNsPrefix) {
		String oldNsPrefix = nsPrefix;
		nsPrefix = newNsPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.UML_PROFILE__NS_PREFIX, oldNsPrefix, nsPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMetamodelReference() {
		return metamodelReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetamodelReference(String newMetamodelReference) {
		String oldMetamodelReference = metamodelReference;
		metamodelReference = newMetamodelReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.UML_PROFILE__METAMODEL_REFERENCE, oldMetamodelReference, metamodelReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmiPackage.UML_PROFILE__PACKAGED_ELEMENT:
				return getPackagedElement();
			case XmiPackage.UML_PROFILE__MEMBER_END:
				return getMemberEnd();
			case XmiPackage.UML_PROFILE__XMIVERSION:
				return getXmiversion();
			case XmiPackage.UML_PROFILE__XMLNSUML:
				return getXmlnsuml();
			case XmiPackage.UML_PROFILE__XMLNSXMI:
				return getXmlnsxmi();
			case XmiPackage.UML_PROFILE__XMIID:
				return getXmiid();
			case XmiPackage.UML_PROFILE__NS_PREFIX:
				return getNsPrefix();
			case XmiPackage.UML_PROFILE__METAMODEL_REFERENCE:
				return getMetamodelReference();
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
			case XmiPackage.UML_PROFILE__PACKAGED_ELEMENT:
				getPackagedElement().clear();
				getPackagedElement().addAll((Collection<? extends PackagedElement>)newValue);
				return;
			case XmiPackage.UML_PROFILE__MEMBER_END:
				setMemberEnd((String)newValue);
				return;
			case XmiPackage.UML_PROFILE__XMIVERSION:
				setXmiversion((String)newValue);
				return;
			case XmiPackage.UML_PROFILE__XMLNSUML:
				setXmlnsuml((String)newValue);
				return;
			case XmiPackage.UML_PROFILE__XMLNSXMI:
				setXmlnsxmi((String)newValue);
				return;
			case XmiPackage.UML_PROFILE__XMIID:
				setXmiid((String)newValue);
				return;
			case XmiPackage.UML_PROFILE__NS_PREFIX:
				setNsPrefix((String)newValue);
				return;
			case XmiPackage.UML_PROFILE__METAMODEL_REFERENCE:
				setMetamodelReference((String)newValue);
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
			case XmiPackage.UML_PROFILE__PACKAGED_ELEMENT:
				getPackagedElement().clear();
				return;
			case XmiPackage.UML_PROFILE__MEMBER_END:
				setMemberEnd(MEMBER_END_EDEFAULT);
				return;
			case XmiPackage.UML_PROFILE__XMIVERSION:
				setXmiversion(XMIVERSION_EDEFAULT);
				return;
			case XmiPackage.UML_PROFILE__XMLNSUML:
				setXmlnsuml(XMLNSUML_EDEFAULT);
				return;
			case XmiPackage.UML_PROFILE__XMLNSXMI:
				setXmlnsxmi(XMLNSXMI_EDEFAULT);
				return;
			case XmiPackage.UML_PROFILE__XMIID:
				setXmiid(XMIID_EDEFAULT);
				return;
			case XmiPackage.UML_PROFILE__NS_PREFIX:
				setNsPrefix(NS_PREFIX_EDEFAULT);
				return;
			case XmiPackage.UML_PROFILE__METAMODEL_REFERENCE:
				setMetamodelReference(METAMODEL_REFERENCE_EDEFAULT);
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
			case XmiPackage.UML_PROFILE__PACKAGED_ELEMENT:
				return packagedElement != null && !packagedElement.isEmpty();
			case XmiPackage.UML_PROFILE__MEMBER_END:
				return MEMBER_END_EDEFAULT == null ? memberEnd != null : !MEMBER_END_EDEFAULT.equals(memberEnd);
			case XmiPackage.UML_PROFILE__XMIVERSION:
				return XMIVERSION_EDEFAULT == null ? xmiversion != null : !XMIVERSION_EDEFAULT.equals(xmiversion);
			case XmiPackage.UML_PROFILE__XMLNSUML:
				return XMLNSUML_EDEFAULT == null ? xmlnsuml != null : !XMLNSUML_EDEFAULT.equals(xmlnsuml);
			case XmiPackage.UML_PROFILE__XMLNSXMI:
				return XMLNSXMI_EDEFAULT == null ? xmlnsxmi != null : !XMLNSXMI_EDEFAULT.equals(xmlnsxmi);
			case XmiPackage.UML_PROFILE__XMIID:
				return XMIID_EDEFAULT == null ? xmiid != null : !XMIID_EDEFAULT.equals(xmiid);
			case XmiPackage.UML_PROFILE__NS_PREFIX:
				return NS_PREFIX_EDEFAULT == null ? nsPrefix != null : !NS_PREFIX_EDEFAULT.equals(nsPrefix);
			case XmiPackage.UML_PROFILE__METAMODEL_REFERENCE:
				return METAMODEL_REFERENCE_EDEFAULT == null ? metamodelReference != null : !METAMODEL_REFERENCE_EDEFAULT.equals(metamodelReference);
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
		result.append(" (memberEnd: ");
		result.append(memberEnd);
		result.append(", xmiversion: ");
		result.append(xmiversion);
		result.append(", xmlnsuml: ");
		result.append(xmlnsuml);
		result.append(", xmlnsxmi: ");
		result.append(xmlnsxmi);
		result.append(", xmiid: ");
		result.append(xmiid);
		result.append(", nsPrefix: ");
		result.append(nsPrefix);
		result.append(", metamodelReference: ");
		result.append(metamodelReference);
		result.append(')');
		return result.toString();
	}

} //umlProfileImpl
