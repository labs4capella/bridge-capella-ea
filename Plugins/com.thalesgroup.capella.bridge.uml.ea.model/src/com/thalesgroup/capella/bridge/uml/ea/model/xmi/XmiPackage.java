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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiFactory
 * @model kind="package"
 * @generated
 */
public interface XmiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xmi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schema.omg.org/spec/XMI/2.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xmi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XmiPackage eINSTANCE = com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.ExtensionImpl
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 0;

	/**
	 * The feature id for the '<em><b>Extender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__EXTENDER = 0;

	/**
	 * The feature id for the '<em><b>Extender ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__EXTENDER_ID = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ELEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Profiles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__PROFILES = 3;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__CONNECTORS = 4;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.DocumentationImpl <em>Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.DocumentationImpl
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getDocumentation()
	 * @generated
	 */
	int DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Exporter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__EXPORTER = 0;

	/**
	 * The feature id for the '<em><b>Exporter Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__EXPORTER_VERSION = 1;

	/**
	 * The number of structural features of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.elementsImpl <em>elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.elementsImpl
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getelements()
	 * @generated
	 */
	int ELEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS__ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Test</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS__TEST = 1;

	/**
	 * The number of structural features of the '<em>elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.elementImpl <em>element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.elementImpl
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getelement()
	 * @generated
	 */
	int ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__SCOPE = 1;

	/**
	 * The feature id for the '<em><b>Xrefs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__XREFS = 2;

	/**
	 * The feature id for the '<em><b>Xmiidref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__XMIIDREF = 3;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CLASSIFIER = 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PROPERTIES = 5;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ATTRIBUTES = 6;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CONSTRAINTS = 7;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__MODEL = 8;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TAGS = 9;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__OPERATIONS = 10;

	/**
	 * The number of structural features of the '<em>element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.xrefsImpl <em>xrefs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.xrefsImpl
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getxrefs()
	 * @generated
	 */
	int XREFS = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREFS__VALUE = 0;

	/**
	 * The number of structural features of the '<em>xrefs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREFS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>xrefs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREFS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.profilesImpl <em>profiles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.profilesImpl
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getprofiles()
	 * @generated
	 */
	int PROFILES = 5;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILES__PROFILE = 0;

	/**
	 * The number of structural features of the '<em>profiles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>profiles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.propertiesImpl <em>properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.propertiesImpl
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getproperties()
	 * @generated
	 */
	int PROPERTIES = 6;

	/**
	 * The feature id for the '<em><b>Is Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__IS_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>SType</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__STYPE = 1;

	/**
	 * The feature id for the '<em><b>NType</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__NTYPE = 2;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__SCOPE = 3;

	/**
	 * The feature id for the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__IS_ROOT = 4;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__IS_LEAF = 5;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__IS_ABSTRACT = 6;

	/**
	 * The feature id for the '<em><b>Xmiid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__XMIID = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__NAME = 8;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__PREFIX = 9;

	/**
	 * The feature id for the '<em><b>Owned End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__OWNED_END = 10;

	/**
	 * The feature id for the '<em><b>Xmitype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__XMITYPE = 11;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__OWNED_ATTRIBUTE = 12;

	/**
	 * The feature id for the '<em><b>Ea type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__EA_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__DIRECTION = 14;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__STEREOTYPE = 15;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__DOCUMENTATION = 16;

	/**
	 * The number of structural features of the '<em>properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.PackagedElementImpl <em>Packaged Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.PackagedElementImpl
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getPackagedElement()
	 * @generated
	 */
	int PACKAGED_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Xmiid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGED_ELEMENT__XMIID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGED_ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGED_ELEMENT__PREFIX = 2;

	/**
	 * The feature id for the '<em><b>Owned End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGED_ELEMENT__OWNED_END = 3;

	/**
	 * The feature id for the '<em><b>Xmitype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGED_ELEMENT__XMITYPE = 4;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGED_ELEMENT__OWNED_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Packaged Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGED_ELEMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Packaged Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.umlProfileImpl <em>uml Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.umlProfileImpl
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getumlProfile()
	 * @generated
	 */
	int UML_PROFILE = 8;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PROFILE__PACKAGED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Member End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PROFILE__MEMBER_END = 1;

	/**
	 * The feature id for the '<em><b>Xmiversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PROFILE__XMIVERSION = 2;

	/**
	 * The feature id for the '<em><b>Xmlnsuml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PROFILE__XMLNSUML = 3;

	/**
	 * The feature id for the '<em><b>Xmlnsxmi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PROFILE__XMLNSXMI = 4;

	/**
	 * The feature id for the '<em><b>Xmiid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PROFILE__XMIID = 5;

	/**
	 * The feature id for the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PROFILE__NS_PREFIX = 6;

	/**
	 * The feature id for the '<em><b>Metamodel Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PROFILE__METAMODEL_REFERENCE = 7;

	/**
	 * The number of structural features of the '<em>uml Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PROFILE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>uml Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PROFILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.ownedEndImpl <em>owned End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.ownedEndImpl
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getownedEnd()
	 * @generated
	 */
	int OWNED_END = 9;

	/**
	 * The feature id for the '<em><b>Xmiid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_END__XMIID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_END__NAME = 1;

	/**
	 * The feature id for the '<em><b>Member End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_END__MEMBER_END = 2;

	/**
	 * The number of structural features of the '<em>owned End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_END_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>owned End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_END_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.packageImportImpl <em>package Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.packageImportImpl
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getpackageImport()
	 * @generated
	 */
	int PACKAGE_IMPORT = 10;

	/**
	 * The feature id for the '<em><b>Xmiid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT__XMIID = 0;

	/**
	 * The feature id for the '<em><b>Imported Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT__IMPORTED_PACKAGE = 1;

	/**
	 * The number of structural features of the '<em>package Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>package Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.importedPackageImpl <em>imported Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.importedPackageImpl
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getimportedPackage()
	 * @generated
	 */
	int IMPORTED_PACKAGE = 11;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PACKAGE__HREF = 0;

	/**
	 * The number of structural features of the '<em>imported Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PACKAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>imported Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.ownedAttributeImpl <em>owned Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.ownedAttributeImpl
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getownedAttribute()
	 * @generated
	 */
	int OWNED_ATTRIBUTE = 12;

	/**
	 * The feature id for the '<em><b>Xmiid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_ATTRIBUTE__XMIID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_ATTRIBUTE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Member End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_ATTRIBUTE__MEMBER_END = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_ATTRIBUTE__TYPE = 3;

	/**
	 * The number of structural features of the '<em>owned Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_ATTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>owned Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.typeImpl <em>type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.typeImpl
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#gettype()
	 * @generated
	 */
	int TYPE = 13;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__HREF = 0;

	/**
	 * The number of structural features of the '<em>type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.extendedPropertiesImpl <em>extended Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.extendedPropertiesImpl
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getextendedProperties()
	 * @generated
	 */
	int EXTENDED_PROPERTIES = 14;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTIES__DIRECTION = 0;

	/**
	 * The number of structural features of the '<em>extended Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>extended Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.attributesImpl <em>attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.attributesImpl
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getattributes()
	 * @generated
	 */
	int ATTRIBUTES = 15;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__ATTRIBUTE = 0;

	/**
	 * The number of structural features of the '<em>attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.attributeImpl <em>attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.attributeImpl
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getattribute()
	 * @generated
	 */
	int ATTRIBUTE = 16;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__STEREOTYPE = 0;

	/**
	 * The feature id for the '<em><b>Xmiidref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__XMIIDREF = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SCOPE = 3;

	/**
	 * The feature id for the '<em><b>Extended Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__EXTENDED_PROPERTIES = 4;

	/**
	 * The feature id for the '<em><b>Tagged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TAGGED = 5;

	/**
	 * The number of structural features of the '<em>attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.stereotypeImpl <em>stereotype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.stereotypeImpl
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getstereotype()
	 * @generated
	 */
	int STEREOTYPE = 17;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE__STEREOTYPE = 0;

	/**
	 * The number of structural features of the '<em>stereotype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>stereotype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.constraintsImpl <em>constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.constraintsImpl
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getconstraints()
	 * @generated
	 */
	int CONSTRAINTS = 18;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS__CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.constraintImpl <em>constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.constraintImpl
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getconstraint()
	 * @generated
	 */
	int CONSTRAINT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__WEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__STATUS = 3;

	/**
	 * The number of structural features of the '<em>constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.connectorsImpl <em>connectors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.connectorsImpl
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getconnectors()
	 * @generated
	 */
	int CONNECTORS = 20;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTORS__CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Test</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTORS__TEST = 1;

	/**
	 * The number of structural features of the '<em>connectors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTORS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>connectors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTORS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.connectorImpl <em>connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.connectorImpl
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getconnector()
	 * @generated
	 */
	int CONNECTOR = 21;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PROPERTIES = 2;

	/**
	 * The feature id for the '<em><b>Xmiidref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__XMIIDREF = 3;

	/**
	 * The number of structural features of the '<em>connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.modelImpl <em>model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.modelImpl
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getmodel()
	 * @generated
	 */
	int MODEL = 22;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OWNER = 1;

	/**
	 * The feature id for the '<em><b>Tpos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TPOS = 2;

	/**
	 * The feature id for the '<em><b>Ea localid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__EA_LOCALID = 3;

	/**
	 * The feature id for the '<em><b>Ea eletype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__EA_ELETYPE = 4;

	/**
	 * The number of structural features of the '<em>model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.sourceImpl <em>source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.sourceImpl
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getsource()
	 * @generated
	 */
	int SOURCE = 23;

	/**
	 * The feature id for the '<em><b>Xmiidref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__XMIIDREF = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__ROLE = 1;

	/**
	 * The number of structural features of the '<em>source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.targetImpl <em>target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.targetImpl
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#gettarget()
	 * @generated
	 */
	int TARGET = 24;

	/**
	 * The feature id for the '<em><b>Xmiidref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__XMIIDREF = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__ROLE = 1;

	/**
	 * The number of structural features of the '<em>target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.roleImpl <em>role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.roleImpl
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getrole()
	 * @generated
	 */
	int ROLE = 25;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__VISIBILITY = 0;

	/**
	 * The number of structural features of the '<em>role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.tagsImpl <em>tags</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.tagsImpl
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#gettags()
	 * @generated
	 */
	int TAGS = 26;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS__TAG = 0;

	/**
	 * The number of structural features of the '<em>tags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>tags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.tagImpl <em>tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.tagImpl
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#gettag()
	 * @generated
	 */
	int TAG = 27;

	/**
	 * The feature id for the '<em><b>Xmiid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__XMIID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__MODEL_ELEMENT = 3;

	/**
	 * The number of structural features of the '<em>tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.operationsImpl <em>operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.operationsImpl
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getoperations()
	 * @generated
	 */
	int OPERATIONS = 28;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS__OPERATION = 0;

	/**
	 * The number of structural features of the '<em>operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.operationImpl <em>operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.operationImpl
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getoperation()
	 * @generated
	 */
	int OPERATION = 29;

	/**
	 * The feature id for the '<em><b>Xmiidref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__XMIIDREF = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SCOPE = 2;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TAGS = 3;

	/**
	 * The feature id for the '<em><b>Stereotype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__STEREOTYPE = 4;

	/**
	 * The feature id for the '<em><b>Xrefs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__XREFS = 5;

	/**
	 * The number of structural features of the '<em>operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.Extension#getExtender <em>Extender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extender</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.Extension#getExtender()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Extender();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.Extension#getExtenderID <em>Extender ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extender ID</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.Extension#getExtenderID()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_ExtenderID();

	/**
	 * Returns the meta object for the containment reference list '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.Extension#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.Extension#getElements()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Elements();

	/**
	 * Returns the meta object for the containment reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.Extension#getProfiles <em>Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Profiles</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.Extension#getProfiles()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Profiles();

	/**
	 * Returns the meta object for the containment reference list '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.Extension#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.Extension#getConnectors()
	 * @see #getExtension()
	 * @generated
	 */
	EReference getExtension_Connectors();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.Documentation
	 * @generated
	 */
	EClass getDocumentation();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.Documentation#getExporter <em>Exporter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exporter</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.Documentation#getExporter()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Exporter();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.Documentation#getExporterVersion <em>Exporter Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exporter Version</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.Documentation#getExporterVersion()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_ExporterVersion();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.elements <em>elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>elements</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.elements
	 * @generated
	 */
	EClass getelements();

	/**
	 * Returns the meta object for the containment reference list '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.elements#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.elements#getElement()
	 * @see #getelements()
	 * @generated
	 */
	EReference getelements_Element();

	/**
	 * Returns the meta object for the reference list '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.elements#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Test</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.elements#getTest()
	 * @see #getelements()
	 * @generated
	 */
	EReference getelements_Test();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element <em>element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>element</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.element
	 * @generated
	 */
	EClass getelement();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getName()
	 * @see #getelement()
	 * @generated
	 */
	EAttribute getelement_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getScope()
	 * @see #getelement()
	 * @generated
	 */
	EAttribute getelement_Scope();

	/**
	 * Returns the meta object for the containment reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getXrefs <em>Xrefs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xrefs</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getXrefs()
	 * @see #getelement()
	 * @generated
	 */
	EReference getelement_Xrefs();

	/**
	 * Returns the meta object for the reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getXmiidref <em>Xmiidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xmiidref</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getXmiidref()
	 * @see #getelement()
	 * @generated
	 */
	EReference getelement_Xmiidref();

	/**
	 * Returns the meta object for the reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classifier</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getClassifier()
	 * @see #getelement()
	 * @generated
	 */
	EReference getelement_Classifier();

	/**
	 * Returns the meta object for the containment reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getProperties()
	 * @see #getelement()
	 * @generated
	 */
	EReference getelement_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getAttributes()
	 * @see #getelement()
	 * @generated
	 */
	EReference getelement_Attributes();

	/**
	 * Returns the meta object for the containment reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraints</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getConstraints()
	 * @see #getelement()
	 * @generated
	 */
	EReference getelement_Constraints();

	/**
	 * Returns the meta object for the containment reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getModel()
	 * @see #getelement()
	 * @generated
	 */
	EReference getelement_Model();

	/**
	 * Returns the meta object for the containment reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tags</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getTags()
	 * @see #getelement()
	 * @generated
	 */
	EReference getelement_Tags();

	/**
	 * Returns the meta object for the containment reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operations</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getOperations()
	 * @see #getelement()
	 * @generated
	 */
	EReference getelement_Operations();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.xrefs <em>xrefs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>xrefs</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.xrefs
	 * @generated
	 */
	EClass getxrefs();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.xrefs#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.xrefs#getValue()
	 * @see #getxrefs()
	 * @generated
	 */
	EAttribute getxrefs_Value();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.profiles <em>profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>profiles</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.profiles
	 * @generated
	 */
	EClass getprofiles();

	/**
	 * Returns the meta object for the containment reference list '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.profiles#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Profile</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.profiles#getProfile()
	 * @see #getprofiles()
	 * @generated
	 */
	EReference getprofiles_Profile();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties <em>properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>properties</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties
	 * @generated
	 */
	EClass getproperties();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#isIsSpecification <em>Is Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Specification</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#isIsSpecification()
	 * @see #getproperties()
	 * @generated
	 */
	EAttribute getproperties_IsSpecification();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#getSType <em>SType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SType</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#getSType()
	 * @see #getproperties()
	 * @generated
	 */
	EAttribute getproperties_SType();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#getNType <em>NType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NType</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#getNType()
	 * @see #getproperties()
	 * @generated
	 */
	EAttribute getproperties_NType();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#getScope()
	 * @see #getproperties()
	 * @generated
	 */
	EAttribute getproperties_Scope();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#isIsRoot <em>Is Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Root</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#isIsRoot()
	 * @see #getproperties()
	 * @generated
	 */
	EAttribute getproperties_IsRoot();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#isIsLeaf <em>Is Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Leaf</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#isIsLeaf()
	 * @see #getproperties()
	 * @generated
	 */
	EAttribute getproperties_IsLeaf();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#isIsAbstract()
	 * @see #getproperties()
	 * @generated
	 */
	EAttribute getproperties_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#getXmiid <em>Xmiid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xmiid</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#getXmiid()
	 * @see #getproperties()
	 * @generated
	 */
	EAttribute getproperties_Xmiid();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#getName()
	 * @see #getproperties()
	 * @generated
	 */
	EAttribute getproperties_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#getPrefix()
	 * @see #getproperties()
	 * @generated
	 */
	EAttribute getproperties_Prefix();

	/**
	 * Returns the meta object for the reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#getOwnedEnd <em>Owned End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned End</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#getOwnedEnd()
	 * @see #getproperties()
	 * @generated
	 */
	EReference getproperties_OwnedEnd();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#getXmitype <em>Xmitype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xmitype</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#getXmitype()
	 * @see #getproperties()
	 * @generated
	 */
	EAttribute getproperties_Xmitype();

	/**
	 * Returns the meta object for the reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#getOwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned Attribute</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#getOwnedAttribute()
	 * @see #getproperties()
	 * @generated
	 */
	EReference getproperties_OwnedAttribute();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#getEa_type <em>Ea type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ea type</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#getEa_type()
	 * @see #getproperties()
	 * @generated
	 */
	EAttribute getproperties_Ea_type();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#getDirection()
	 * @see #getproperties()
	 * @generated
	 */
	EAttribute getproperties_Direction();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#getStereotype()
	 * @see #getproperties()
	 * @generated
	 */
	EAttribute getproperties_Stereotype();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties#getDocumentation()
	 * @see #getproperties()
	 * @generated
	 */
	EAttribute getproperties_Documentation();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.PackagedElement <em>Packaged Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packaged Element</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.PackagedElement
	 * @generated
	 */
	EClass getPackagedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.PackagedElement#getXmiid <em>Xmiid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xmiid</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.PackagedElement#getXmiid()
	 * @see #getPackagedElement()
	 * @generated
	 */
	EAttribute getPackagedElement_Xmiid();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.PackagedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.PackagedElement#getName()
	 * @see #getPackagedElement()
	 * @generated
	 */
	EAttribute getPackagedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.PackagedElement#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.PackagedElement#getPrefix()
	 * @see #getPackagedElement()
	 * @generated
	 */
	EAttribute getPackagedElement_Prefix();

	/**
	 * Returns the meta object for the reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.PackagedElement#getOwnedEnd <em>Owned End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned End</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.PackagedElement#getOwnedEnd()
	 * @see #getPackagedElement()
	 * @generated
	 */
	EReference getPackagedElement_OwnedEnd();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.PackagedElement#getXmitype <em>Xmitype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xmitype</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.PackagedElement#getXmitype()
	 * @see #getPackagedElement()
	 * @generated
	 */
	EAttribute getPackagedElement_Xmitype();

	/**
	 * Returns the meta object for the reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.PackagedElement#getOwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned Attribute</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.PackagedElement#getOwnedAttribute()
	 * @see #getPackagedElement()
	 * @generated
	 */
	EReference getPackagedElement_OwnedAttribute();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.umlProfile <em>uml Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>uml Profile</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.umlProfile
	 * @generated
	 */
	EClass getumlProfile();

	/**
	 * Returns the meta object for the reference list '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.umlProfile#getPackagedElement <em>Packaged Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Packaged Element</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.umlProfile#getPackagedElement()
	 * @see #getumlProfile()
	 * @generated
	 */
	EReference getumlProfile_PackagedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.umlProfile#getMemberEnd <em>Member End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member End</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.umlProfile#getMemberEnd()
	 * @see #getumlProfile()
	 * @generated
	 */
	EAttribute getumlProfile_MemberEnd();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.umlProfile#getXmiversion <em>Xmiversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xmiversion</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.umlProfile#getXmiversion()
	 * @see #getumlProfile()
	 * @generated
	 */
	EAttribute getumlProfile_Xmiversion();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.umlProfile#getXmlnsuml <em>Xmlnsuml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xmlnsuml</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.umlProfile#getXmlnsuml()
	 * @see #getumlProfile()
	 * @generated
	 */
	EAttribute getumlProfile_Xmlnsuml();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.umlProfile#getXmlnsxmi <em>Xmlnsxmi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xmlnsxmi</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.umlProfile#getXmlnsxmi()
	 * @see #getumlProfile()
	 * @generated
	 */
	EAttribute getumlProfile_Xmlnsxmi();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.umlProfile#getXmiid <em>Xmiid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xmiid</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.umlProfile#getXmiid()
	 * @see #getumlProfile()
	 * @generated
	 */
	EAttribute getumlProfile_Xmiid();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.umlProfile#getNsPrefix <em>Ns Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns Prefix</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.umlProfile#getNsPrefix()
	 * @see #getumlProfile()
	 * @generated
	 */
	EAttribute getumlProfile_NsPrefix();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.umlProfile#getMetamodelReference <em>Metamodel Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metamodel Reference</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.umlProfile#getMetamodelReference()
	 * @see #getumlProfile()
	 * @generated
	 */
	EAttribute getumlProfile_MetamodelReference();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.ownedEnd <em>owned End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>owned End</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.ownedEnd
	 * @generated
	 */
	EClass getownedEnd();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.ownedEnd#getXmiid <em>Xmiid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xmiid</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.ownedEnd#getXmiid()
	 * @see #getownedEnd()
	 * @generated
	 */
	EAttribute getownedEnd_Xmiid();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.ownedEnd#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.ownedEnd#getName()
	 * @see #getownedEnd()
	 * @generated
	 */
	EAttribute getownedEnd_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.ownedEnd#getMemberEnd <em>Member End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member End</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.ownedEnd#getMemberEnd()
	 * @see #getownedEnd()
	 * @generated
	 */
	EAttribute getownedEnd_MemberEnd();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.packageImport <em>package Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>package Import</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.packageImport
	 * @generated
	 */
	EClass getpackageImport();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.packageImport#getXmiid <em>Xmiid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xmiid</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.packageImport#getXmiid()
	 * @see #getpackageImport()
	 * @generated
	 */
	EAttribute getpackageImport_Xmiid();

	/**
	 * Returns the meta object for the reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.packageImport#getImportedPackage <em>Imported Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imported Package</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.packageImport#getImportedPackage()
	 * @see #getpackageImport()
	 * @generated
	 */
	EReference getpackageImport_ImportedPackage();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.importedPackage <em>imported Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>imported Package</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.importedPackage
	 * @generated
	 */
	EClass getimportedPackage();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.importedPackage#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.importedPackage#getHref()
	 * @see #getimportedPackage()
	 * @generated
	 */
	EAttribute getimportedPackage_Href();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.ownedAttribute <em>owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>owned Attribute</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.ownedAttribute
	 * @generated
	 */
	EClass getownedAttribute();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.ownedAttribute#getXmiid <em>Xmiid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xmiid</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.ownedAttribute#getXmiid()
	 * @see #getownedAttribute()
	 * @generated
	 */
	EAttribute getownedAttribute_Xmiid();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.ownedAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.ownedAttribute#getName()
	 * @see #getownedAttribute()
	 * @generated
	 */
	EAttribute getownedAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.ownedAttribute#getMemberEnd <em>Member End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member End</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.ownedAttribute#getMemberEnd()
	 * @see #getownedAttribute()
	 * @generated
	 */
	EAttribute getownedAttribute_MemberEnd();

	/**
	 * Returns the meta object for the reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.ownedAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.ownedAttribute#getType()
	 * @see #getownedAttribute()
	 * @generated
	 */
	EReference getownedAttribute_Type();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.type <em>type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>type</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.type
	 * @generated
	 */
	EClass gettype();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.type#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.type#getHref()
	 * @see #gettype()
	 * @generated
	 */
	EAttribute gettype_Href();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.extendedProperties <em>extended Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>extended Properties</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.extendedProperties
	 * @generated
	 */
	EClass getextendedProperties();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.extendedProperties#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.extendedProperties#getDirection()
	 * @see #getextendedProperties()
	 * @generated
	 */
	EAttribute getextendedProperties_Direction();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.attributes <em>attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>attributes</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.attributes
	 * @generated
	 */
	EClass getattributes();

	/**
	 * Returns the meta object for the containment reference list '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.attributes#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.attributes#getAttribute()
	 * @see #getattributes()
	 * @generated
	 */
	EReference getattributes_Attribute();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.attribute <em>attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>attribute</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.attribute
	 * @generated
	 */
	EClass getattribute();

	/**
	 * Returns the meta object for the containment reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.attribute#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stereotype</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.attribute#getStereotype()
	 * @see #getattribute()
	 * @generated
	 */
	EReference getattribute_Stereotype();

	/**
	 * Returns the meta object for the reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.attribute#getXmiidref <em>Xmiidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xmiidref</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.attribute#getXmiidref()
	 * @see #getattribute()
	 * @generated
	 */
	EReference getattribute_Xmiidref();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.attribute#getName()
	 * @see #getattribute()
	 * @generated
	 */
	EAttribute getattribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.attribute#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.attribute#getScope()
	 * @see #getattribute()
	 * @generated
	 */
	EAttribute getattribute_Scope();

	/**
	 * Returns the meta object for the containment reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.attribute#getExtendedProperties <em>Extended Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extended Properties</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.attribute#getExtendedProperties()
	 * @see #getattribute()
	 * @generated
	 */
	EReference getattribute_ExtendedProperties();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.attribute#getTagged <em>Tagged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tagged</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.attribute#getTagged()
	 * @see #getattribute()
	 * @generated
	 */
	EAttribute getattribute_Tagged();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.stereotype <em>stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>stereotype</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.stereotype
	 * @generated
	 */
	EClass getstereotype();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.stereotype#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stereotype</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.stereotype#getStereotype()
	 * @see #getstereotype()
	 * @generated
	 */
	EAttribute getstereotype_Stereotype();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.constraints <em>constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>constraints</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.constraints
	 * @generated
	 */
	EClass getconstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.constraints#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.constraints#getConstraint()
	 * @see #getconstraints()
	 * @generated
	 */
	EReference getconstraints_Constraint();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.constraint <em>constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>constraint</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.constraint
	 * @generated
	 */
	EClass getconstraint();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.constraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.constraint#getName()
	 * @see #getconstraint()
	 * @generated
	 */
	EAttribute getconstraint_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.constraint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.constraint#getType()
	 * @see #getconstraint()
	 * @generated
	 */
	EAttribute getconstraint_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.constraint#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.constraint#getWeight()
	 * @see #getconstraint()
	 * @generated
	 */
	EAttribute getconstraint_Weight();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.constraint#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.constraint#getStatus()
	 * @see #getconstraint()
	 * @generated
	 */
	EAttribute getconstraint_Status();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.connectors <em>connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>connectors</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.connectors
	 * @generated
	 */
	EClass getconnectors();

	/**
	 * Returns the meta object for the containment reference list '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.connectors#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.connectors#getConnector()
	 * @see #getconnectors()
	 * @generated
	 */
	EReference getconnectors_Connector();

	/**
	 * Returns the meta object for the reference list '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.connectors#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Test</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.connectors#getTest()
	 * @see #getconnectors()
	 * @generated
	 */
	EReference getconnectors_Test();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.connector <em>connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>connector</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.connector
	 * @generated
	 */
	EClass getconnector();

	/**
	 * Returns the meta object for the containment reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.connector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.connector#getSource()
	 * @see #getconnector()
	 * @generated
	 */
	EReference getconnector_Source();

	/**
	 * Returns the meta object for the containment reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.connector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.connector#getTarget()
	 * @see #getconnector()
	 * @generated
	 */
	EReference getconnector_Target();

	/**
	 * Returns the meta object for the containment reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.connector#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.connector#getProperties()
	 * @see #getconnector()
	 * @generated
	 */
	EReference getconnector_Properties();

	/**
	 * Returns the meta object for the reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.connector#getXmiidref <em>Xmiidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xmiidref</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.connector#getXmiidref()
	 * @see #getconnector()
	 * @generated
	 */
	EReference getconnector_Xmiidref();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.model <em>model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>model</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.model
	 * @generated
	 */
	EClass getmodel();

	/**
	 * Returns the meta object for the reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.model#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.model#getPackage()
	 * @see #getmodel()
	 * @generated
	 */
	EReference getmodel_Package();

	/**
	 * Returns the meta object for the reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.model#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.model#getOwner()
	 * @see #getmodel()
	 * @generated
	 */
	EReference getmodel_Owner();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.model#getTpos <em>Tpos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tpos</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.model#getTpos()
	 * @see #getmodel()
	 * @generated
	 */
	EAttribute getmodel_Tpos();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.model#getEa_localid <em>Ea localid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ea localid</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.model#getEa_localid()
	 * @see #getmodel()
	 * @generated
	 */
	EAttribute getmodel_Ea_localid();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.model#getEa_eletype <em>Ea eletype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ea eletype</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.model#getEa_eletype()
	 * @see #getmodel()
	 * @generated
	 */
	EAttribute getmodel_Ea_eletype();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.source <em>source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>source</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.source
	 * @generated
	 */
	EClass getsource();

	/**
	 * Returns the meta object for the reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.source#getXmiidref <em>Xmiidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xmiidref</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.source#getXmiidref()
	 * @see #getsource()
	 * @generated
	 */
	EReference getsource_Xmiidref();

	/**
	 * Returns the meta object for the containment reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.source#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.source#getRole()
	 * @see #getsource()
	 * @generated
	 */
	EReference getsource_Role();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.target <em>target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>target</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.target
	 * @generated
	 */
	EClass gettarget();

	/**
	 * Returns the meta object for the reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.target#getXmiidref <em>Xmiidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xmiidref</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.target#getXmiidref()
	 * @see #gettarget()
	 * @generated
	 */
	EReference gettarget_Xmiidref();

	/**
	 * Returns the meta object for the containment reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.target#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.target#getRole()
	 * @see #gettarget()
	 * @generated
	 */
	EReference gettarget_Role();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.role <em>role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>role</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.role
	 * @generated
	 */
	EClass getrole();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.role#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.role#getVisibility()
	 * @see #getrole()
	 * @generated
	 */
	EAttribute getrole_Visibility();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.tags <em>tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>tags</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.tags
	 * @generated
	 */
	EClass gettags();

	/**
	 * Returns the meta object for the containment reference list '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.tags#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tag</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.tags#getTag()
	 * @see #gettags()
	 * @generated
	 */
	EReference gettags_Tag();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.tag <em>tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>tag</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.tag
	 * @generated
	 */
	EClass gettag();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.tag#getXmiid <em>Xmiid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xmiid</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.tag#getXmiid()
	 * @see #gettag()
	 * @generated
	 */
	EAttribute gettag_Xmiid();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.tag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.tag#getName()
	 * @see #gettag()
	 * @generated
	 */
	EAttribute gettag_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.tag#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.tag#getValue()
	 * @see #gettag()
	 * @generated
	 */
	EAttribute gettag_Value();

	/**
	 * Returns the meta object for the reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.tag#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Element</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.tag#getModelElement()
	 * @see #gettag()
	 * @generated
	 */
	EReference gettag_ModelElement();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.operations <em>operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>operations</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.operations
	 * @generated
	 */
	EClass getoperations();

	/**
	 * Returns the meta object for the containment reference list '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.operations#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.operations#getOperation()
	 * @see #getoperations()
	 * @generated
	 */
	EReference getoperations_Operation();

	/**
	 * Returns the meta object for class '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.operation <em>operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>operation</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.operation
	 * @generated
	 */
	EClass getoperation();

	/**
	 * Returns the meta object for the reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.operation#getXmiidref <em>Xmiidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xmiidref</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.operation#getXmiidref()
	 * @see #getoperation()
	 * @generated
	 */
	EReference getoperation_Xmiidref();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.operation#getName()
	 * @see #getoperation()
	 * @generated
	 */
	EAttribute getoperation_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.operation#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.operation#getScope()
	 * @see #getoperation()
	 * @generated
	 */
	EAttribute getoperation_Scope();

	/**
	 * Returns the meta object for the containment reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.operation#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tags</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.operation#getTags()
	 * @see #getoperation()
	 * @generated
	 */
	EReference getoperation_Tags();

	/**
	 * Returns the meta object for the containment reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.operation#getStereotype <em>Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stereotype</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.operation#getStereotype()
	 * @see #getoperation()
	 * @generated
	 */
	EReference getoperation_Stereotype();

	/**
	 * Returns the meta object for the containment reference '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.operation#getXrefs <em>Xrefs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xrefs</em>'.
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.operation#getXrefs()
	 * @see #getoperation()
	 * @generated
	 */
	EReference getoperation_Xrefs();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XmiFactory getXmiFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.ExtensionImpl
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>Extender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__EXTENDER = eINSTANCE.getExtension_Extender();

		/**
		 * The meta object literal for the '<em><b>Extender ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__EXTENDER_ID = eINSTANCE.getExtension_ExtenderID();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__ELEMENTS = eINSTANCE.getExtension_Elements();

		/**
		 * The meta object literal for the '<em><b>Profiles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__PROFILES = eINSTANCE.getExtension_Profiles();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION__CONNECTORS = eINSTANCE.getExtension_Connectors();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.DocumentationImpl <em>Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.DocumentationImpl
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getDocumentation()
		 * @generated
		 */
		EClass DOCUMENTATION = eINSTANCE.getDocumentation();

		/**
		 * The meta object literal for the '<em><b>Exporter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__EXPORTER = eINSTANCE.getDocumentation_Exporter();

		/**
		 * The meta object literal for the '<em><b>Exporter Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTATION__EXPORTER_VERSION = eINSTANCE.getDocumentation_ExporterVersion();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.elementsImpl <em>elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.elementsImpl
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getelements()
		 * @generated
		 */
		EClass ELEMENTS = eINSTANCE.getelements();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTS__ELEMENT = eINSTANCE.getelements_Element();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTS__TEST = eINSTANCE.getelements_Test();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.elementImpl <em>element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.elementImpl
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getelement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getelement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getelement_Name();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__SCOPE = eINSTANCE.getelement_Scope();

		/**
		 * The meta object literal for the '<em><b>Xrefs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__XREFS = eINSTANCE.getelement_Xrefs();

		/**
		 * The meta object literal for the '<em><b>Xmiidref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__XMIIDREF = eINSTANCE.getelement_Xmiidref();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__CLASSIFIER = eINSTANCE.getelement_Classifier();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__PROPERTIES = eINSTANCE.getelement_Properties();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ATTRIBUTES = eINSTANCE.getelement_Attributes();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__CONSTRAINTS = eINSTANCE.getelement_Constraints();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__MODEL = eINSTANCE.getelement_Model();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__TAGS = eINSTANCE.getelement_Tags();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__OPERATIONS = eINSTANCE.getelement_Operations();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.xrefsImpl <em>xrefs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.xrefsImpl
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getxrefs()
		 * @generated
		 */
		EClass XREFS = eINSTANCE.getxrefs();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XREFS__VALUE = eINSTANCE.getxrefs_Value();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.profilesImpl <em>profiles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.profilesImpl
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getprofiles()
		 * @generated
		 */
		EClass PROFILES = eINSTANCE.getprofiles();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILES__PROFILE = eINSTANCE.getprofiles_Profile();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.propertiesImpl <em>properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.propertiesImpl
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getproperties()
		 * @generated
		 */
		EClass PROPERTIES = eINSTANCE.getproperties();

		/**
		 * The meta object literal for the '<em><b>Is Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__IS_SPECIFICATION = eINSTANCE.getproperties_IsSpecification();

		/**
		 * The meta object literal for the '<em><b>SType</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__STYPE = eINSTANCE.getproperties_SType();

		/**
		 * The meta object literal for the '<em><b>NType</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__NTYPE = eINSTANCE.getproperties_NType();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__SCOPE = eINSTANCE.getproperties_Scope();

		/**
		 * The meta object literal for the '<em><b>Is Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__IS_ROOT = eINSTANCE.getproperties_IsRoot();

		/**
		 * The meta object literal for the '<em><b>Is Leaf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__IS_LEAF = eINSTANCE.getproperties_IsLeaf();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__IS_ABSTRACT = eINSTANCE.getproperties_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Xmiid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__XMIID = eINSTANCE.getproperties_Xmiid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__NAME = eINSTANCE.getproperties_Name();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__PREFIX = eINSTANCE.getproperties_Prefix();

		/**
		 * The meta object literal for the '<em><b>Owned End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES__OWNED_END = eINSTANCE.getproperties_OwnedEnd();

		/**
		 * The meta object literal for the '<em><b>Xmitype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__XMITYPE = eINSTANCE.getproperties_Xmitype();

		/**
		 * The meta object literal for the '<em><b>Owned Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES__OWNED_ATTRIBUTE = eINSTANCE.getproperties_OwnedAttribute();

		/**
		 * The meta object literal for the '<em><b>Ea type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__EA_TYPE = eINSTANCE.getproperties_Ea_type();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__DIRECTION = eINSTANCE.getproperties_Direction();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__STEREOTYPE = eINSTANCE.getproperties_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__DOCUMENTATION = eINSTANCE.getproperties_Documentation();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.PackagedElementImpl <em>Packaged Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.PackagedElementImpl
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getPackagedElement()
		 * @generated
		 */
		EClass PACKAGED_ELEMENT = eINSTANCE.getPackagedElement();

		/**
		 * The meta object literal for the '<em><b>Xmiid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGED_ELEMENT__XMIID = eINSTANCE.getPackagedElement_Xmiid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGED_ELEMENT__NAME = eINSTANCE.getPackagedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGED_ELEMENT__PREFIX = eINSTANCE.getPackagedElement_Prefix();

		/**
		 * The meta object literal for the '<em><b>Owned End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGED_ELEMENT__OWNED_END = eINSTANCE.getPackagedElement_OwnedEnd();

		/**
		 * The meta object literal for the '<em><b>Xmitype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGED_ELEMENT__XMITYPE = eINSTANCE.getPackagedElement_Xmitype();

		/**
		 * The meta object literal for the '<em><b>Owned Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGED_ELEMENT__OWNED_ATTRIBUTE = eINSTANCE.getPackagedElement_OwnedAttribute();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.umlProfileImpl <em>uml Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.umlProfileImpl
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getumlProfile()
		 * @generated
		 */
		EClass UML_PROFILE = eINSTANCE.getumlProfile();

		/**
		 * The meta object literal for the '<em><b>Packaged Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_PROFILE__PACKAGED_ELEMENT = eINSTANCE.getumlProfile_PackagedElement();

		/**
		 * The meta object literal for the '<em><b>Member End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_PROFILE__MEMBER_END = eINSTANCE.getumlProfile_MemberEnd();

		/**
		 * The meta object literal for the '<em><b>Xmiversion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_PROFILE__XMIVERSION = eINSTANCE.getumlProfile_Xmiversion();

		/**
		 * The meta object literal for the '<em><b>Xmlnsuml</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_PROFILE__XMLNSUML = eINSTANCE.getumlProfile_Xmlnsuml();

		/**
		 * The meta object literal for the '<em><b>Xmlnsxmi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_PROFILE__XMLNSXMI = eINSTANCE.getumlProfile_Xmlnsxmi();

		/**
		 * The meta object literal for the '<em><b>Xmiid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_PROFILE__XMIID = eINSTANCE.getumlProfile_Xmiid();

		/**
		 * The meta object literal for the '<em><b>Ns Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_PROFILE__NS_PREFIX = eINSTANCE.getumlProfile_NsPrefix();

		/**
		 * The meta object literal for the '<em><b>Metamodel Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_PROFILE__METAMODEL_REFERENCE = eINSTANCE.getumlProfile_MetamodelReference();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.ownedEndImpl <em>owned End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.ownedEndImpl
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getownedEnd()
		 * @generated
		 */
		EClass OWNED_END = eINSTANCE.getownedEnd();

		/**
		 * The meta object literal for the '<em><b>Xmiid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNED_END__XMIID = eINSTANCE.getownedEnd_Xmiid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNED_END__NAME = eINSTANCE.getownedEnd_Name();

		/**
		 * The meta object literal for the '<em><b>Member End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNED_END__MEMBER_END = eINSTANCE.getownedEnd_MemberEnd();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.packageImportImpl <em>package Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.packageImportImpl
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getpackageImport()
		 * @generated
		 */
		EClass PACKAGE_IMPORT = eINSTANCE.getpackageImport();

		/**
		 * The meta object literal for the '<em><b>Xmiid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_IMPORT__XMIID = eINSTANCE.getpackageImport_Xmiid();

		/**
		 * The meta object literal for the '<em><b>Imported Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_IMPORT__IMPORTED_PACKAGE = eINSTANCE.getpackageImport_ImportedPackage();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.importedPackageImpl <em>imported Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.importedPackageImpl
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getimportedPackage()
		 * @generated
		 */
		EClass IMPORTED_PACKAGE = eINSTANCE.getimportedPackage();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_PACKAGE__HREF = eINSTANCE.getimportedPackage_Href();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.ownedAttributeImpl <em>owned Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.ownedAttributeImpl
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getownedAttribute()
		 * @generated
		 */
		EClass OWNED_ATTRIBUTE = eINSTANCE.getownedAttribute();

		/**
		 * The meta object literal for the '<em><b>Xmiid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNED_ATTRIBUTE__XMIID = eINSTANCE.getownedAttribute_Xmiid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNED_ATTRIBUTE__NAME = eINSTANCE.getownedAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Member End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNED_ATTRIBUTE__MEMBER_END = eINSTANCE.getownedAttribute_MemberEnd();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWNED_ATTRIBUTE__TYPE = eINSTANCE.getownedAttribute_Type();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.typeImpl <em>type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.typeImpl
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#gettype()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.gettype();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__HREF = eINSTANCE.gettype_Href();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.extendedPropertiesImpl <em>extended Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.extendedPropertiesImpl
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getextendedProperties()
		 * @generated
		 */
		EClass EXTENDED_PROPERTIES = eINSTANCE.getextendedProperties();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENDED_PROPERTIES__DIRECTION = eINSTANCE.getextendedProperties_Direction();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.attributesImpl <em>attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.attributesImpl
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getattributes()
		 * @generated
		 */
		EClass ATTRIBUTES = eINSTANCE.getattributes();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTES__ATTRIBUTE = eINSTANCE.getattributes_Attribute();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.attributeImpl <em>attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.attributeImpl
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getattribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getattribute();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__STEREOTYPE = eINSTANCE.getattribute_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Xmiidref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__XMIIDREF = eINSTANCE.getattribute_Xmiidref();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getattribute_Name();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__SCOPE = eINSTANCE.getattribute_Scope();

		/**
		 * The meta object literal for the '<em><b>Extended Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__EXTENDED_PROPERTIES = eINSTANCE.getattribute_ExtendedProperties();

		/**
		 * The meta object literal for the '<em><b>Tagged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TAGGED = eINSTANCE.getattribute_Tagged();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.stereotypeImpl <em>stereotype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.stereotypeImpl
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getstereotype()
		 * @generated
		 */
		EClass STEREOTYPE = eINSTANCE.getstereotype();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEREOTYPE__STEREOTYPE = eINSTANCE.getstereotype_Stereotype();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.constraintsImpl <em>constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.constraintsImpl
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getconstraints()
		 * @generated
		 */
		EClass CONSTRAINTS = eINSTANCE.getconstraints();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINTS__CONSTRAINT = eINSTANCE.getconstraints_Constraint();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.constraintImpl <em>constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.constraintImpl
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getconstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getconstraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__NAME = eINSTANCE.getconstraint_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__TYPE = eINSTANCE.getconstraint_Type();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__WEIGHT = eINSTANCE.getconstraint_Weight();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__STATUS = eINSTANCE.getconstraint_Status();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.connectorsImpl <em>connectors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.connectorsImpl
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getconnectors()
		 * @generated
		 */
		EClass CONNECTORS = eINSTANCE.getconnectors();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTORS__CONNECTOR = eINSTANCE.getconnectors_Connector();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTORS__TEST = eINSTANCE.getconnectors_Test();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.connectorImpl <em>connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.connectorImpl
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getconnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getconnector();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__SOURCE = eINSTANCE.getconnector_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__TARGET = eINSTANCE.getconnector_Target();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__PROPERTIES = eINSTANCE.getconnector_Properties();

		/**
		 * The meta object literal for the '<em><b>Xmiidref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__XMIIDREF = eINSTANCE.getconnector_Xmiidref();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.modelImpl <em>model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.modelImpl
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getmodel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getmodel();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PACKAGE = eINSTANCE.getmodel_Package();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__OWNER = eINSTANCE.getmodel_Owner();

		/**
		 * The meta object literal for the '<em><b>Tpos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__TPOS = eINSTANCE.getmodel_Tpos();

		/**
		 * The meta object literal for the '<em><b>Ea localid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__EA_LOCALID = eINSTANCE.getmodel_Ea_localid();

		/**
		 * The meta object literal for the '<em><b>Ea eletype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__EA_ELETYPE = eINSTANCE.getmodel_Ea_eletype();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.sourceImpl <em>source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.sourceImpl
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getsource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getsource();

		/**
		 * The meta object literal for the '<em><b>Xmiidref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__XMIIDREF = eINSTANCE.getsource_Xmiidref();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__ROLE = eINSTANCE.getsource_Role();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.targetImpl <em>target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.targetImpl
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#gettarget()
		 * @generated
		 */
		EClass TARGET = eINSTANCE.gettarget();

		/**
		 * The meta object literal for the '<em><b>Xmiidref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__XMIIDREF = eINSTANCE.gettarget_Xmiidref();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__ROLE = eINSTANCE.gettarget_Role();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.roleImpl <em>role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.roleImpl
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getrole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getrole();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__VISIBILITY = eINSTANCE.getrole_Visibility();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.tagsImpl <em>tags</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.tagsImpl
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#gettags()
		 * @generated
		 */
		EClass TAGS = eINSTANCE.gettags();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAGS__TAG = eINSTANCE.gettags_Tag();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.tagImpl <em>tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.tagImpl
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#gettag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.gettag();

		/**
		 * The meta object literal for the '<em><b>Xmiid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__XMIID = eINSTANCE.gettag_Xmiid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__NAME = eINSTANCE.gettag_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__VALUE = eINSTANCE.gettag_Value();

		/**
		 * The meta object literal for the '<em><b>Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG__MODEL_ELEMENT = eINSTANCE.gettag_ModelElement();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.operationsImpl <em>operations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.operationsImpl
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getoperations()
		 * @generated
		 */
		EClass OPERATIONS = eINSTANCE.getoperations();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONS__OPERATION = eINSTANCE.getoperations_Operation();

		/**
		 * The meta object literal for the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.operationImpl <em>operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.operationImpl
		 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiPackageImpl#getoperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getoperation();

		/**
		 * The meta object literal for the '<em><b>Xmiidref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__XMIIDREF = eINSTANCE.getoperation_Xmiidref();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getoperation_Name();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__SCOPE = eINSTANCE.getoperation_Scope();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__TAGS = eINSTANCE.getoperation_Tags();

		/**
		 * The meta object literal for the '<em><b>Stereotype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__STEREOTYPE = eINSTANCE.getoperation_Stereotype();

		/**
		 * The meta object literal for the '<em><b>Xrefs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__XREFS = eINSTANCE.getoperation_Xrefs();

	}

} //XmiPackage
