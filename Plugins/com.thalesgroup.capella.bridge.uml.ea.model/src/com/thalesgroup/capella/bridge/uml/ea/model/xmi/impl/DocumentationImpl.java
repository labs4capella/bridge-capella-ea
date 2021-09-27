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

import com.thalesgroup.capella.bridge.uml.ea.model.xmi.Documentation;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.DocumentationImpl#getExporter <em>Exporter</em>}</li>
 *   <li>{@link com.thalesgroup.capella.bridge.uml.ea.model.xmi.impl.DocumentationImpl#getExporterVersion <em>Exporter Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentationImpl extends MinimalEObjectImpl.Container implements Documentation {
	/**
	 * The default value of the '{@link #getExporter() <em>Exporter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExporter()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPORTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExporter() <em>Exporter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExporter()
	 * @generated
	 * @ordered
	 */
	protected String exporter = EXPORTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getExporterVersion() <em>Exporter Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExporterVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPORTER_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExporterVersion() <em>Exporter Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExporterVersion()
	 * @generated
	 * @ordered
	 */
	protected String exporterVersion = EXPORTER_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmiPackage.Literals.DOCUMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExporter() {
		return exporter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExporter(String newExporter) {
		String oldExporter = exporter;
		exporter = newExporter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.DOCUMENTATION__EXPORTER, oldExporter, exporter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExporterVersion() {
		return exporterVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExporterVersion(String newExporterVersion) {
		String oldExporterVersion = exporterVersion;
		exporterVersion = newExporterVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmiPackage.DOCUMENTATION__EXPORTER_VERSION, oldExporterVersion, exporterVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmiPackage.DOCUMENTATION__EXPORTER:
				return getExporter();
			case XmiPackage.DOCUMENTATION__EXPORTER_VERSION:
				return getExporterVersion();
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
			case XmiPackage.DOCUMENTATION__EXPORTER:
				setExporter((String)newValue);
				return;
			case XmiPackage.DOCUMENTATION__EXPORTER_VERSION:
				setExporterVersion((String)newValue);
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
			case XmiPackage.DOCUMENTATION__EXPORTER:
				setExporter(EXPORTER_EDEFAULT);
				return;
			case XmiPackage.DOCUMENTATION__EXPORTER_VERSION:
				setExporterVersion(EXPORTER_VERSION_EDEFAULT);
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
			case XmiPackage.DOCUMENTATION__EXPORTER:
				return EXPORTER_EDEFAULT == null ? exporter != null : !EXPORTER_EDEFAULT.equals(exporter);
			case XmiPackage.DOCUMENTATION__EXPORTER_VERSION:
				return EXPORTER_VERSION_EDEFAULT == null ? exporterVersion != null : !EXPORTER_VERSION_EDEFAULT.equals(exporterVersion);
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
		result.append(" (exporter: ");
		result.append(exporter);
		result.append(", exporterVersion: ");
		result.append(exporterVersion);
		result.append(')');
		return result.toString();
	}

} //DocumentationImpl
