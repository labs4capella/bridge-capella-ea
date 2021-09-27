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
 * A representation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.Documentation#getExporter <em>Exporter</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.Documentation#getExporterVersion <em>Exporter Version</em>}</li>
 * </ul>
 *
 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getDocumentation()
 * @model
 * @generated
 */
public interface Documentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Exporter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exporter</em>' attribute.
	 * @see #setExporter(String)
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getDocumentation_Exporter()
	 * @model
	 * @generated
	 */
	String getExporter();

	/**
	 * Sets the value of the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.Documentation#getExporter <em>Exporter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exporter</em>' attribute.
	 * @see #getExporter()
	 * @generated
	 */
	void setExporter(String value);

	/**
	 * Returns the value of the '<em><b>Exporter Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exporter Version</em>' attribute.
	 * @see #setExporterVersion(String)
	 * @see com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage#getDocumentation_ExporterVersion()
	 * @model
	 * @generated
	 */
	String getExporterVersion();

	/**
	 * Sets the value of the '{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.Documentation#getExporterVersion <em>Exporter Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exporter Version</em>' attribute.
	 * @see #getExporterVersion()
	 * @generated
	 */
	void setExporterVersion(String value);

} // Documentation
