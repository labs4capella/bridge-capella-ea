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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage
 * @generated
 */
public interface XmiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XmiFactory eINSTANCE = com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.XmiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extension</em>'.
	 * @generated
	 */
	Extension createExtension();

	/**
	 * Returns a new object of class '<em>Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Documentation</em>'.
	 * @generated
	 */
	Documentation createDocumentation();

	/**
	 * Returns a new object of class '<em>elements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>elements</em>'.
	 * @generated
	 */
	elements createelements();

	/**
	 * Returns a new object of class '<em>element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>element</em>'.
	 * @generated
	 */
	element createelement();

	/**
	 * Returns a new object of class '<em>xrefs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>xrefs</em>'.
	 * @generated
	 */
	xrefs createxrefs();

	/**
	 * Returns a new object of class '<em>profiles</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>profiles</em>'.
	 * @generated
	 */
	profiles createprofiles();

	/**
	 * Returns a new object of class '<em>properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>properties</em>'.
	 * @generated
	 */
	properties createproperties();

	/**
	 * Returns a new object of class '<em>Packaged Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Packaged Element</em>'.
	 * @generated
	 */
	PackagedElement createPackagedElement();

	/**
	 * Returns a new object of class '<em>uml Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>uml Profile</em>'.
	 * @generated
	 */
	umlProfile createumlProfile();

	/**
	 * Returns a new object of class '<em>owned End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>owned End</em>'.
	 * @generated
	 */
	ownedEnd createownedEnd();

	/**
	 * Returns a new object of class '<em>package Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>package Import</em>'.
	 * @generated
	 */
	packageImport createpackageImport();

	/**
	 * Returns a new object of class '<em>imported Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>imported Package</em>'.
	 * @generated
	 */
	importedPackage createimportedPackage();

	/**
	 * Returns a new object of class '<em>owned Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>owned Attribute</em>'.
	 * @generated
	 */
	ownedAttribute createownedAttribute();

	/**
	 * Returns a new object of class '<em>type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>type</em>'.
	 * @generated
	 */
	type createtype();

	/**
	 * Returns a new object of class '<em>extended Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>extended Properties</em>'.
	 * @generated
	 */
	extendedProperties createextendedProperties();

	/**
	 * Returns a new object of class '<em>attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>attributes</em>'.
	 * @generated
	 */
	attributes createattributes();

	/**
	 * Returns a new object of class '<em>attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>attribute</em>'.
	 * @generated
	 */
	attribute createattribute();

	/**
	 * Returns a new object of class '<em>stereotype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>stereotype</em>'.
	 * @generated
	 */
	stereotype createstereotype();

	/**
	 * Returns a new object of class '<em>constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>constraints</em>'.
	 * @generated
	 */
	constraints createconstraints();

	/**
	 * Returns a new object of class '<em>constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>constraint</em>'.
	 * @generated
	 */
	constraint createconstraint();

	/**
	 * Returns a new object of class '<em>connectors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>connectors</em>'.
	 * @generated
	 */
	connectors createconnectors();

	/**
	 * Returns a new object of class '<em>connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>connector</em>'.
	 * @generated
	 */
	connector createconnector();

	/**
	 * Returns a new object of class '<em>model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>model</em>'.
	 * @generated
	 */
	model createmodel();

	/**
	 * Returns a new object of class '<em>source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>source</em>'.
	 * @generated
	 */
	source createsource();

	/**
	 * Returns a new object of class '<em>target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>target</em>'.
	 * @generated
	 */
	target createtarget();

	/**
	 * Returns a new object of class '<em>role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>role</em>'.
	 * @generated
	 */
	role createrole();

	/**
	 * Returns a new object of class '<em>tags</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>tags</em>'.
	 * @generated
	 */
	tags createtags();

	/**
	 * Returns a new object of class '<em>tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>tag</em>'.
	 * @generated
	 */
	tag createtag();

	/**
	 * Returns a new object of class '<em>operations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>operations</em>'.
	 * @generated
	 */
	operations createoperations();

	/**
	 * Returns a new object of class '<em>operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>operation</em>'.
	 * @generated
	 */
	operation createoperation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XmiPackage getXmiPackage();

} //XmiFactory
