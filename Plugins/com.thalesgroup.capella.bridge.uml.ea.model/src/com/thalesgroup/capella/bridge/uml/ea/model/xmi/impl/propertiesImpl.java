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

import com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.ownedAttribute;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.ownedEnd;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.propertiesImpl#isIsSpecification <em>Is Specification</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.propertiesImpl#getSType <em>SType</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.propertiesImpl#getNType <em>NType</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.propertiesImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.propertiesImpl#isIsRoot <em>Is Root</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.propertiesImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.propertiesImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.propertiesImpl#getXmiid <em>Xmiid</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.propertiesImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.propertiesImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.propertiesImpl#getOwnedEnd <em>Owned End</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.propertiesImpl#getXmitype <em>Xmitype</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.propertiesImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.propertiesImpl#getEa_type <em>Ea type</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.propertiesImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.propertiesImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.propertiesImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class propertiesImpl extends MinimalEObjectImpl.Container implements properties {
	/**
	 * The default value of the '{@link #isIsSpecification() <em>Is Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSpecification()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SPECIFICATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSpecification() <em>Is Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSpecification()
	 * @generated
	 * @ordered
	 */
	protected boolean isSpecification = IS_SPECIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSType() <em>SType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSType()
	 * @generated
	 * @ordered
	 */
	protected static final String STYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSType() <em>SType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSType()
	 * @generated
	 * @ordered
	 */
	protected String sType = STYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNType() <em>NType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNType()
	 * @generated
	 * @ordered
	 */
	protected static final int NTYPE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNType() <em>NType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNType()
	 * @generated
	 * @ordered
	 */
	protected int nType = NTYPE_EDEFAULT;

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
	 * The default value of the '{@link #isIsRoot() <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRoot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ROOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRoot() <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRoot()
	 * @generated
	 * @ordered
	 */
	protected boolean isRoot = IS_ROOT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LEAF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected boolean isLeaf = IS_LEAF_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

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
	 * The default value of the '{@link #getEa_type() <em>Ea type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEa_type()
	 * @generated
	 * @ordered
	 */
	protected static final String EA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEa_type() <em>Ea type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEa_type()
	 * @generated
	 * @ordered
	 */
	protected String ea_type = EA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected String direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
	protected static final String STEREOTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStereotype()
	 * @generated
	 * @ordered
	 */
	protected String stereotype = STEREOTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected propertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmiPackage.Literals.PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsSpecification() {
		return isSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSpecification(boolean newIsSpecification) {
		boolean oldIsSpecification = isSpecification;
		isSpecification = newIsSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.PROPERTIES__IS_SPECIFICATION, oldIsSpecification, isSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSType() {
		return sType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSType(String newSType) {
		String oldSType = sType;
		sType = newSType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.PROPERTIES__STYPE, oldSType, sType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNType() {
		return nType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNType(int newNType) {
		int oldNType = nType;
		nType = newNType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.PROPERTIES__NTYPE, oldNType, nType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.PROPERTIES__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsRoot() {
		return isRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsRoot(boolean newIsRoot) {
		boolean oldIsRoot = isRoot;
		isRoot = newIsRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.PROPERTIES__IS_ROOT, oldIsRoot, isRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsLeaf() {
		return isLeaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsLeaf(boolean newIsLeaf) {
		boolean oldIsLeaf = isLeaf;
		isLeaf = newIsLeaf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.PROPERTIES__IS_LEAF, oldIsLeaf, isLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.PROPERTIES__IS_ABSTRACT, oldIsAbstract, isAbstract));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.PROPERTIES__XMIID, oldXmiid, xmiid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.PROPERTIES__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.PROPERTIES__PREFIX, oldPrefix, prefix));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XmiPackage.PROPERTIES__OWNED_END, oldOwnedEnd, ownedEnd));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.PROPERTIES__OWNED_END, oldOwnedEnd, ownedEnd));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.PROPERTIES__XMITYPE, oldXmitype, xmitype));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XmiPackage.PROPERTIES__OWNED_ATTRIBUTE, oldOwnedAttribute, ownedAttribute));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.PROPERTIES__OWNED_ATTRIBUTE, oldOwnedAttribute, ownedAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEa_type() {
		return ea_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEa_type(String newEa_type) {
		String oldEa_type = ea_type;
		ea_type = newEa_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.PROPERTIES__EA_TYPE, oldEa_type, ea_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirection(String newDirection) {
		String oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.PROPERTIES__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStereotype() {
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStereotype(String newStereotype) {
		String oldStereotype = stereotype;
		stereotype = newStereotype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.PROPERTIES__STEREOTYPE, oldStereotype, stereotype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.PROPERTIES__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmiPackage.PROPERTIES__IS_SPECIFICATION:
				return isIsSpecification();
			case XmiPackage.PROPERTIES__STYPE:
				return getSType();
			case XmiPackage.PROPERTIES__NTYPE:
				return getNType();
			case XmiPackage.PROPERTIES__SCOPE:
				return getScope();
			case XmiPackage.PROPERTIES__IS_ROOT:
				return isIsRoot();
			case XmiPackage.PROPERTIES__IS_LEAF:
				return isIsLeaf();
			case XmiPackage.PROPERTIES__IS_ABSTRACT:
				return isIsAbstract();
			case XmiPackage.PROPERTIES__XMIID:
				return getXmiid();
			case XmiPackage.PROPERTIES__NAME:
				return getName();
			case XmiPackage.PROPERTIES__PREFIX:
				return getPrefix();
			case XmiPackage.PROPERTIES__OWNED_END:
				if (resolve) return getOwnedEnd();
				return basicGetOwnedEnd();
			case XmiPackage.PROPERTIES__XMITYPE:
				return getXmitype();
			case XmiPackage.PROPERTIES__OWNED_ATTRIBUTE:
				if (resolve) return getOwnedAttribute();
				return basicGetOwnedAttribute();
			case XmiPackage.PROPERTIES__EA_TYPE:
				return getEa_type();
			case XmiPackage.PROPERTIES__DIRECTION:
				return getDirection();
			case XmiPackage.PROPERTIES__STEREOTYPE:
				return getStereotype();
			case XmiPackage.PROPERTIES__DOCUMENTATION:
				return getDocumentation();
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
			case XmiPackage.PROPERTIES__IS_SPECIFICATION:
				setIsSpecification((Boolean)newValue);
				return;
			case XmiPackage.PROPERTIES__STYPE:
				setSType((String)newValue);
				return;
			case XmiPackage.PROPERTIES__NTYPE:
				setNType((Integer)newValue);
				return;
			case XmiPackage.PROPERTIES__SCOPE:
				setScope((String)newValue);
				return;
			case XmiPackage.PROPERTIES__IS_ROOT:
				setIsRoot((Boolean)newValue);
				return;
			case XmiPackage.PROPERTIES__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case XmiPackage.PROPERTIES__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case XmiPackage.PROPERTIES__XMIID:
				setXmiid((String)newValue);
				return;
			case XmiPackage.PROPERTIES__NAME:
				setName((String)newValue);
				return;
			case XmiPackage.PROPERTIES__PREFIX:
				setPrefix((String)newValue);
				return;
			case XmiPackage.PROPERTIES__OWNED_END:
				setOwnedEnd((ownedEnd)newValue);
				return;
			case XmiPackage.PROPERTIES__XMITYPE:
				setXmitype((String)newValue);
				return;
			case XmiPackage.PROPERTIES__OWNED_ATTRIBUTE:
				setOwnedAttribute((ownedAttribute)newValue);
				return;
			case XmiPackage.PROPERTIES__EA_TYPE:
				setEa_type((String)newValue);
				return;
			case XmiPackage.PROPERTIES__DIRECTION:
				setDirection((String)newValue);
				return;
			case XmiPackage.PROPERTIES__STEREOTYPE:
				setStereotype((String)newValue);
				return;
			case XmiPackage.PROPERTIES__DOCUMENTATION:
				setDocumentation((String)newValue);
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
			case XmiPackage.PROPERTIES__IS_SPECIFICATION:
				setIsSpecification(IS_SPECIFICATION_EDEFAULT);
				return;
			case XmiPackage.PROPERTIES__STYPE:
				setSType(STYPE_EDEFAULT);
				return;
			case XmiPackage.PROPERTIES__NTYPE:
				setNType(NTYPE_EDEFAULT);
				return;
			case XmiPackage.PROPERTIES__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case XmiPackage.PROPERTIES__IS_ROOT:
				setIsRoot(IS_ROOT_EDEFAULT);
				return;
			case XmiPackage.PROPERTIES__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case XmiPackage.PROPERTIES__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case XmiPackage.PROPERTIES__XMIID:
				setXmiid(XMIID_EDEFAULT);
				return;
			case XmiPackage.PROPERTIES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmiPackage.PROPERTIES__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case XmiPackage.PROPERTIES__OWNED_END:
				setOwnedEnd((ownedEnd)null);
				return;
			case XmiPackage.PROPERTIES__XMITYPE:
				setXmitype(XMITYPE_EDEFAULT);
				return;
			case XmiPackage.PROPERTIES__OWNED_ATTRIBUTE:
				setOwnedAttribute((ownedAttribute)null);
				return;
			case XmiPackage.PROPERTIES__EA_TYPE:
				setEa_type(EA_TYPE_EDEFAULT);
				return;
			case XmiPackage.PROPERTIES__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case XmiPackage.PROPERTIES__STEREOTYPE:
				setStereotype(STEREOTYPE_EDEFAULT);
				return;
			case XmiPackage.PROPERTIES__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
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
			case XmiPackage.PROPERTIES__IS_SPECIFICATION:
				return isSpecification != IS_SPECIFICATION_EDEFAULT;
			case XmiPackage.PROPERTIES__STYPE:
				return STYPE_EDEFAULT == null ? sType != null : !STYPE_EDEFAULT.equals(sType);
			case XmiPackage.PROPERTIES__NTYPE:
				return nType != NTYPE_EDEFAULT;
			case XmiPackage.PROPERTIES__SCOPE:
				return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
			case XmiPackage.PROPERTIES__IS_ROOT:
				return isRoot != IS_ROOT_EDEFAULT;
			case XmiPackage.PROPERTIES__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case XmiPackage.PROPERTIES__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case XmiPackage.PROPERTIES__XMIID:
				return XMIID_EDEFAULT == null ? xmiid != null : !XMIID_EDEFAULT.equals(xmiid);
			case XmiPackage.PROPERTIES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmiPackage.PROPERTIES__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case XmiPackage.PROPERTIES__OWNED_END:
				return ownedEnd != null;
			case XmiPackage.PROPERTIES__XMITYPE:
				return XMITYPE_EDEFAULT == null ? xmitype != null : !XMITYPE_EDEFAULT.equals(xmitype);
			case XmiPackage.PROPERTIES__OWNED_ATTRIBUTE:
				return ownedAttribute != null;
			case XmiPackage.PROPERTIES__EA_TYPE:
				return EA_TYPE_EDEFAULT == null ? ea_type != null : !EA_TYPE_EDEFAULT.equals(ea_type);
			case XmiPackage.PROPERTIES__DIRECTION:
				return DIRECTION_EDEFAULT == null ? direction != null : !DIRECTION_EDEFAULT.equals(direction);
			case XmiPackage.PROPERTIES__STEREOTYPE:
				return STEREOTYPE_EDEFAULT == null ? stereotype != null : !STEREOTYPE_EDEFAULT.equals(stereotype);
			case XmiPackage.PROPERTIES__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
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
		result.append(" (isSpecification: ");
		result.append(isSpecification);
		result.append(", sType: ");
		result.append(sType);
		result.append(", nType: ");
		result.append(nType);
		result.append(", scope: ");
		result.append(scope);
		result.append(", isRoot: ");
		result.append(isRoot);
		result.append(", isLeaf: ");
		result.append(isLeaf);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(", xmiid: ");
		result.append(xmiid);
		result.append(", name: ");
		result.append(name);
		result.append(", prefix: ");
		result.append(prefix);
		result.append(", xmitype: ");
		result.append(xmitype);
		result.append(", ea_type: ");
		result.append(ea_type);
		result.append(", direction: ");
		result.append(direction);
		result.append(", stereotype: ");
		result.append(stereotype);
		result.append(", documentation: ");
		result.append(documentation);
		result.append(')');
		return result.toString();
	}

} //propertiesImpl
