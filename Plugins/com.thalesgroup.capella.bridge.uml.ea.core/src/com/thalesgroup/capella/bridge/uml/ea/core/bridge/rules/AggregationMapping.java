/*******************************************************************************
* Copyright (c) 2021 THALES GLOBAL SERVICES.
* All right reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* Contributors:
*     Artal Technologies - initial API and implementation
*******************************************************************************/
package com.thalesgroup.capella.bridge.uml.ea.core.bridge.rules;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.polarsys.capella.core.data.la.LogicalComponent;
import org.polarsys.capella.core.data.pa.PhysicalComponent;

import com.artal.capella.bridge.core.MappingUtils;
import com.artal.capella.bridge.core.rules.AbstractDynamicMapping;
import com.artal.capella.bridge.core.rules.MappingRulesManager;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.Capella2UMLAlgo;
import com.thalesgroup.capella.bridge.uml.ea.model.XMIExtensionsUtils;

/**
 * @author Yann BINOT
 *
 */
public class AggregationMapping extends
		AbstractDynamicMapping<org.polarsys.capella.core.data.cs.Component, org.polarsys.capella.core.data.cs.Component, Capella2UMLAlgo> {

	/**
	 * @param algo
	 * @param parent
	 * @param mappingExecution
	 */
	public AggregationMapping(Capella2UMLAlgo algo, org.polarsys.capella.core.data.cs.Component parent,
			IMappingExecution mappingExecution) {
		super(algo, parent, mappingExecution);
	}

	@Override
	public Object computeTargetContainer(org.polarsys.capella.core.data.cs.Component capellaContainer) {
		Component lc = (Component) MappingRulesManager.getCapellaObjectFromAllRules(capellaContainer);
		return lc;
	}

	@Override
	public List<org.polarsys.capella.core.data.cs.Component> findSourceElements(
			org.polarsys.capella.core.data.cs.Component capellaContainer) {
		List<org.polarsys.capella.core.data.cs.Component> result = new ArrayList<org.polarsys.capella.core.data.cs.Component>();
		if (capellaContainer instanceof LogicalComponent) {
			EList<LogicalComponent> ownedLogicalComponents = ((LogicalComponent) capellaContainer)
					.getOwnedLogicalComponents();
			result.addAll(ownedLogicalComponents);
		} else if (capellaContainer instanceof PhysicalComponent) {
			EList<PhysicalComponent> ownedLogicalComponents = ((PhysicalComponent) capellaContainer)
					.getOwnedPhysicalComponents();
			result.addAll(ownedLogicalComponents);
		}
		return result;
	}

	@Override
	public Object compute(Object eaContainer, org.polarsys.capella.core.data.cs.Component source) {
		// LogicalComponent sourceContainer = getSourceContainer();
		Association targetAssociation = UMLFactory.eINSTANCE.createAssociation();
		MappingUtils.generateUID(getAlgo(), source, targetAssociation, this, "a");
		Resource eResource = source.eResource();
		String sysMLID = MappingUtils.getSysMLID(eResource, source);

		Component parent = (Component) eaContainer;
		((org.eclipse.uml2.uml.Package) parent.getModel().getPackagedElements().get(0)).getPackagedElements()
				.add(targetAssociation);

		Property targetProperty = UMLFactory.eINSTANCE.createProperty();
		MappingUtils.generateUID(getAlgo(), source, targetProperty, this, "tp");
		targetProperty.setIsComposite(false);
		targetAssociation.getOwnedEnds().add(targetProperty);

		Component targetC = (Component) MappingRulesManager.getCapellaObjectFromAllRules(source);
		Property subProp = UMLFactory.eINSTANCE.createProperty();
		MappingUtils.generateUID(getAlgo(), source, subProp, this, "p");

		targetProperty.setType(parent);
		subProp.setType(targetC);
		subProp.setIsComposite(true);

		subProp.setAssociation(targetAssociation);
		targetProperty.setAssociation(targetAssociation);
		parent.getOwnedAttributes().add(subProp);

		XMIExtensionsUtils.addConnector(targetAssociation, getAlgo().getXMIExtension(), sysMLID, "Unspecified",
				"Association", subProp, targetProperty, true);
		return targetAssociation;
	}

	@Override
	public void executeSubRules(List<org.polarsys.capella.core.data.cs.Component> _capellaSource,
			MappingRulesManager manager) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getUID(EObject key, String id) {
		return "EAID_" + id;
	}

}
