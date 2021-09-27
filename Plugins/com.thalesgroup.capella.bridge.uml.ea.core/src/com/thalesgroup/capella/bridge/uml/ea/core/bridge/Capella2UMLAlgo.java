/*******************************************************************************
* Copyright (c) 2021 THALES GLOBAL SERVICES.
* All right reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* Contributors:
*     Artal Technologies - initial API and implementation
*******************************************************************************/
package com.thalesgroup.capella.bridge.uml.ea.core.bridge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.polarsys.capella.core.data.capellamodeller.Project;

import com.artal.capella.bridge.core.mix.AbstractMappingAlgoMix;
import com.artal.capella.bridge.core.rules.MappingRulesManager;
import com.artal.capella.bridge.core.uml.UMLBridgeAlgo;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.Extension;

/**
 * @author Yann BINOT
 *
 */
public class Capella2UMLAlgo extends UMLBridgeAlgo<Project> {

	public Capella2UMLAlgo(AbstractMappingAlgoMix<?, ?, ?> mix) {
		super(mix);
	}

	private Extension _xmiExtension;
	private List<Profile> _profiles;
	private List<Stereotype> _stereotypes;
	private Set<String> _stereoNames;
	// private EClass typeClass;
	// private EFactory bookFactoryInstance;
	// private EReference typeRef;

	@Override
	public void launch(Project source_p, IMappingExecution _mappingExecution) {
		MappingRulesManager.clearRules();
		// /*
		// * Instantiate EcoreFactory
		// */
		// EcoreFactory theCoreFactory = EcoreFactory.eINSTANCE;
		// /*
		// * Create EClass instance to model BookStore class
		// */
		// typeClass = theCoreFactory.createEClass();
		// typeClass.setName("type");
		//
		// EPackage bookStoreEPackage = theCoreFactory.createEPackage();
		// bookStoreEPackage.setName("uml");
		// bookStoreEPackage.setNsPrefix("uml");
		// bookStoreEPackage.setNsURI("http://www.eclipse.org/uml2/5.0.0/UML");
		// typeRef = theCoreFactory.createEReference();
		// typeRef.setName("type");
		// typeRef.setEType(typeClass);
		// typeRef.setContainment(true);
		//
		// EReference idref = theCoreFactory.createEReference();
		// idref.setName("xmi:idref");
		// idref.setEType(EcorePackage.eINSTANCE.getEObject());
		// typeClass.getEStructuralFeatures().add(idref);
		//
		// EClass property = UMLPackage.eINSTANCE.getProperty();
		// property.getEStructuralFeatures().add(typeRef);
		//
		// bookFactoryInstance = bookStoreEPackage.getEFactoryInstance();

		super.launch(source_p, _mappingExecution);
	}

	// public EReference getTypeRef() {
	// return typeRef;
	// }
	//
	// public EFactory getBookFactoryInstance() {
	// return bookFactoryInstance;
	// }
	//
	// public EClass getTypeClass() {
	// return typeClass;
	// }

	public void setXMIExtension(Extension xmiExtension) {
		_xmiExtension = xmiExtension;
	}

	public Extension getXMIExtension() {
		return _xmiExtension;
	}

	public List<Profile> getProfiles() {
		if (_profiles == null) {
			_profiles = new ArrayList<>();
		}
		return _profiles;
	}

	public List<Stereotype> getStereotypes() {
		if (_stereotypes == null) {
			_stereotypes = new ArrayList<>();
		}
		return _stereotypes;
	}

	public Set<String> getStereoNames() {
		if (_stereoNames == null) {
			_stereoNames = new HashSet<String>();
		}
		return _stereoNames;
	}

	/**
	 * @return
	 */
	public boolean useUIDs() {
		return true;
	}

	/**
	 * @return
	 */
	public boolean createUIDs() {
		return true;
	}

	public boolean isPVMTExport() {
		return ((EAMappingService) getMix().getMappingService()).isExportProfile();
	}
}
