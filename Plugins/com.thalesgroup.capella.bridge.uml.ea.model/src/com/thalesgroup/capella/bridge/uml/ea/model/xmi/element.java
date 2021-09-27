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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getName <em>Name</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getScope <em>Scope</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getXrefs <em>Xrefs</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getXmiidref <em>Xmiidref</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getProperties <em>Properties</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getModel <em>Model</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getTags <em>Tags</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getelement()
 * @model
 * @generated
 */
public interface element extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getelement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see #setScope(String)
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getelement_Scope()
	 * @model
	 * @generated
	 */
	String getScope();

	/**
	 * Sets the value of the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(String value);

	/**
	 * Returns the value of the '<em><b>Xrefs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xrefs</em>' containment reference.
	 * @see #setXrefs(xrefs)
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getelement_Xrefs()
	 * @model containment="true"
	 * @generated
	 */
	xrefs getXrefs();

	/**
	 * Sets the value of the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getXrefs <em>Xrefs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xrefs</em>' containment reference.
	 * @see #getXrefs()
	 * @generated
	 */
	void setXrefs(xrefs value);

	/**
	 * Returns the value of the '<em><b>Xmiidref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xmiidref</em>' reference.
	 * @see #setXmiidref(EObject)
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getelement_Xmiidref()
	 * @model
	 * @generated
	 */
	EObject getXmiidref();

	/**
	 * Sets the value of the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getXmiidref <em>Xmiidref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xmiidref</em>' reference.
	 * @see #getXmiidref()
	 * @generated
	 */
	void setXmiidref(EObject value);

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' reference.
	 * @see #setClassifier(EObject)
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getelement_Classifier()
	 * @model
	 * @generated
	 */
	EObject getClassifier();

	/**
	 * Sets the value of the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getClassifier <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier</em>' reference.
	 * @see #getClassifier()
	 * @generated
	 */
	void setClassifier(EObject value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(properties)
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getelement_Properties()
	 * @model containment="true"
	 * @generated
	 */
	properties getProperties();

	/**
	 * Sets the value of the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(properties value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference.
	 * @see #setAttributes(attributes)
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getelement_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	attributes getAttributes();

	/**
	 * Sets the value of the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getAttributes <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' containment reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(attributes value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference.
	 * @see #setConstraints(constraints)
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getelement_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	constraints getConstraints();

	/**
	 * Sets the value of the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getConstraints <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' containment reference.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(constraints value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference.
	 * @see #setModel(model)
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getelement_Model()
	 * @model containment="true"
	 * @generated
	 */
	model getModel();

	/**
	 * Sets the value of the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getModel <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' containment reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(model value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference.
	 * @see #setTags(tags)
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getelement_Tags()
	 * @model containment="true"
	 * @generated
	 */
	tags getTags();

	/**
	 * Sets the value of the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getTags <em>Tags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tags</em>' containment reference.
	 * @see #getTags()
	 * @generated
	 */
	void setTags(tags value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference.
	 * @see #setOperations(operations)
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getelement_Operations()
	 * @model containment="true"
	 * @generated
	 */
	operations getOperations();

	/**
	 * Sets the value of the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.element#getOperations <em>Operations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operations</em>' containment reference.
	 * @see #getOperations()
	 * @generated
	 */
	void setOperations(operations value);

} // element
