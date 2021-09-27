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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.thalesgroup.capella.bridge.uml.ea.model.xmi.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmiFactoryImpl extends EFactoryImpl implements XmiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XmiFactory init() {
		try {
			XmiFactory theXmiFactory = (XmiFactory)EPackage.Registry.INSTANCE.getEFactory(XmiPackage.eNS_URI);
			if (theXmiFactory != null) {
				return theXmiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XmiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XmiPackage.EXTENSION: return createExtension();
			case XmiPackage.DOCUMENTATION: return createDocumentation();
			case XmiPackage.ELEMENTS: return createelements();
			case XmiPackage.ELEMENT: return createelement();
			case XmiPackage.XREFS: return createxrefs();
			case XmiPackage.PROFILES: return createprofiles();
			case XmiPackage.PROPERTIES: return createproperties();
			case XmiPackage.PACKAGED_ELEMENT: return createPackagedElement();
			case XmiPackage.UML_PROFILE: return createumlProfile();
			case XmiPackage.OWNED_END: return createownedEnd();
			case XmiPackage.PACKAGE_IMPORT: return createpackageImport();
			case XmiPackage.IMPORTED_PACKAGE: return createimportedPackage();
			case XmiPackage.OWNED_ATTRIBUTE: return createownedAttribute();
			case XmiPackage.TYPE: return createtype();
			case XmiPackage.EXTENDED_PROPERTIES: return createextendedProperties();
			case XmiPackage.ATTRIBUTES: return createattributes();
			case XmiPackage.ATTRIBUTE: return createattribute();
			case XmiPackage.STEREOTYPE: return createstereotype();
			case XmiPackage.CONSTRAINTS: return createconstraints();
			case XmiPackage.CONSTRAINT: return createconstraint();
			case XmiPackage.CONNECTORS: return createconnectors();
			case XmiPackage.CONNECTOR: return createconnector();
			case XmiPackage.MODEL: return createmodel();
			case XmiPackage.SOURCE: return createsource();
			case XmiPackage.TARGET: return createtarget();
			case XmiPackage.ROLE: return createrole();
			case XmiPackage.TAGS: return createtags();
			case XmiPackage.TAG: return createtag();
			case XmiPackage.OPERATIONS: return createoperations();
			case XmiPackage.OPERATION: return createoperation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Documentation createDocumentation() {
		DocumentationImpl documentation = new DocumentationImpl();
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public elements createelements() {
		elementsImpl elements = new elementsImpl();
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public element createelement() {
		elementImpl element = new elementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public xrefs createxrefs() {
		xrefsImpl xrefs = new xrefsImpl();
		return xrefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public profiles createprofiles() {
		profilesImpl profiles = new profilesImpl();
		return profiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public properties createproperties() {
		propertiesImpl properties = new propertiesImpl();
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackagedElement createPackagedElement() {
		PackagedElementImpl packagedElement = new PackagedElementImpl();
		return packagedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public umlProfile createumlProfile() {
		umlProfileImpl umlProfile = new umlProfileImpl();
		return umlProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ownedEnd createownedEnd() {
		ownedEndImpl ownedEnd = new ownedEndImpl();
		return ownedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public packageImport createpackageImport() {
		packageImportImpl packageImport = new packageImportImpl();
		return packageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public importedPackage createimportedPackage() {
		importedPackageImpl importedPackage = new importedPackageImpl();
		return importedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ownedAttribute createownedAttribute() {
		ownedAttributeImpl ownedAttribute = new ownedAttributeImpl();
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public type createtype() {
		typeImpl type = new typeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public extendedProperties createextendedProperties() {
		extendedPropertiesImpl extendedProperties = new extendedPropertiesImpl();
		return extendedProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public attributes createattributes() {
		attributesImpl attributes = new attributesImpl();
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public attribute createattribute() {
		attributeImpl attribute = new attributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public stereotype createstereotype() {
		stereotypeImpl stereotype = new stereotypeImpl();
		return stereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public constraints createconstraints() {
		constraintsImpl constraints = new constraintsImpl();
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public constraint createconstraint() {
		constraintImpl constraint = new constraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public connectors createconnectors() {
		connectorsImpl connectors = new connectorsImpl();
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public connector createconnector() {
		connectorImpl connector = new connectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public model createmodel() {
		modelImpl model = new modelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public source createsource() {
		sourceImpl source = new sourceImpl();
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public target createtarget() {
		targetImpl target = new targetImpl();
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public role createrole() {
		roleImpl role = new roleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public tags createtags() {
		tagsImpl tags = new tagsImpl();
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public tag createtag() {
		tagImpl tag = new tagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public operations createoperations() {
		operationsImpl operations = new operationsImpl();
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public operation createoperation() {
		operationImpl operation = new operationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmiPackage getXmiPackage() {
		return (XmiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XmiPackage getPackage() {
		return XmiPackage.eINSTANCE;
	}

} //XmiFactoryImpl
