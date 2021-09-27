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
package com.thalesgroup.capella.bridge.uml.ea.model.xmi.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import com.thalesgroup.capella.bridge.uml.ea.model.xmi.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage
 * @generated
 */
public class XmiSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XmiPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmiSwitch() {
		if (modelPackage == null) {
			modelPackage = XmiPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case XmiPackage.EXTENSION: {
				Extension extension = (Extension)theEObject;
				T result = caseExtension(extension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmiPackage.DOCUMENTATION: {
				Documentation documentation = (Documentation)theEObject;
				T result = caseDocumentation(documentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmiPackage.ELEMENTS: {
				elements elements = (elements)theEObject;
				T result = caseelements(elements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmiPackage.ELEMENT: {
				element element = (element)theEObject;
				T result = caseelement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmiPackage.XREFS: {
				xrefs xrefs = (xrefs)theEObject;
				T result = casexrefs(xrefs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmiPackage.PROFILES: {
				profiles profiles = (profiles)theEObject;
				T result = caseprofiles(profiles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmiPackage.PROPERTIES: {
				properties properties = (properties)theEObject;
				T result = caseproperties(properties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmiPackage.PACKAGED_ELEMENT: {
				PackagedElement packagedElement = (PackagedElement)theEObject;
				T result = casePackagedElement(packagedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmiPackage.UML_PROFILE: {
				umlProfile umlProfile = (umlProfile)theEObject;
				T result = caseumlProfile(umlProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmiPackage.OWNED_END: {
				ownedEnd ownedEnd = (ownedEnd)theEObject;
				T result = caseownedEnd(ownedEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmiPackage.PACKAGE_IMPORT: {
				packageImport packageImport = (packageImport)theEObject;
				T result = casepackageImport(packageImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmiPackage.IMPORTED_PACKAGE: {
				importedPackage importedPackage = (importedPackage)theEObject;
				T result = caseimportedPackage(importedPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmiPackage.OWNED_ATTRIBUTE: {
				ownedAttribute ownedAttribute = (ownedAttribute)theEObject;
				T result = caseownedAttribute(ownedAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmiPackage.TYPE: {
				type type = (type)theEObject;
				T result = casetype(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmiPackage.EXTENDED_PROPERTIES: {
				extendedProperties extendedProperties = (extendedProperties)theEObject;
				T result = caseextendedProperties(extendedProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmiPackage.ATTRIBUTES: {
				attributes attributes = (attributes)theEObject;
				T result = caseattributes(attributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmiPackage.ATTRIBUTE: {
				attribute attribute = (attribute)theEObject;
				T result = caseattribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmiPackage.STEREOTYPE: {
				stereotype stereotype = (stereotype)theEObject;
				T result = casestereotype(stereotype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmiPackage.CONSTRAINTS: {
				constraints constraints = (constraints)theEObject;
				T result = caseconstraints(constraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmiPackage.CONSTRAINT: {
				constraint constraint = (constraint)theEObject;
				T result = caseconstraint(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmiPackage.CONNECTORS: {
				connectors connectors = (connectors)theEObject;
				T result = caseconnectors(connectors);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmiPackage.CONNECTOR: {
				connector connector = (connector)theEObject;
				T result = caseconnector(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmiPackage.MODEL: {
				model model = (model)theEObject;
				T result = casemodel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmiPackage.SOURCE: {
				source source = (source)theEObject;
				T result = casesource(source);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmiPackage.TARGET: {
				target target = (target)theEObject;
				T result = casetarget(target);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmiPackage.ROLE: {
				role role = (role)theEObject;
				T result = caserole(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmiPackage.TAGS: {
				tags tags = (tags)theEObject;
				T result = casetags(tags);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmiPackage.TAG: {
				tag tag = (tag)theEObject;
				T result = casetag(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmiPackage.OPERATIONS: {
				operations operations = (operations)theEObject;
				T result = caseoperations(operations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XmiPackage.OPERATION: {
				operation operation = (operation)theEObject;
				T result = caseoperation(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtension(Extension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentation(Documentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseelements(elements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseelement(element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>xrefs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>xrefs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casexrefs(xrefs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>profiles</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>profiles</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseprofiles(profiles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseproperties(properties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Packaged Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packaged Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackagedElement(PackagedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>uml Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>uml Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseumlProfile(umlProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>owned End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>owned End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseownedEnd(ownedEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>package Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>package Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casepackageImport(packageImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>imported Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>imported Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseimportedPackage(importedPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>owned Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>owned Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseownedAttribute(ownedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetype(type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>extended Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>extended Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseextendedProperties(extendedProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseattributes(attributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseattribute(attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>stereotype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>stereotype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casestereotype(stereotype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseconstraints(constraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseconstraint(constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>connectors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>connectors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseconnectors(connectors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseconnector(connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemodel(model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesource(source object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetarget(target object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caserole(role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>tags</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>tags</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetags(tags object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetag(tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseoperations(operations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseoperation(operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //XmiSwitch
