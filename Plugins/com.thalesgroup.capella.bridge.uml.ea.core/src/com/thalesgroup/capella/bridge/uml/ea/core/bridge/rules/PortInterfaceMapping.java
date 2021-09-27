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

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.UMLFactory;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentPort;
import org.polarsys.capella.core.data.fa.OrientationPortKind;

import com.artal.capella.bridge.core.MappingUtils;
import com.artal.capella.bridge.core.rules.AbstractDynamicMapping;
import com.artal.capella.bridge.core.rules.MappingRulesManager;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.Capella2UMLAlgo;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.rules.utils.SpecificUtils;

/**
 * @author Yann BINOT
 *
 */
public class PortInterfaceMapping extends AbstractDynamicMapping<ComponentPort, ComponentExchange, Capella2UMLAlgo> {

	/**
	 * @param algo
	 * @param parent
	 * @param mappingExecution
	 */
	public PortInterfaceMapping(Capella2UMLAlgo algo, ComponentPort parent, IMappingExecution mappingExecution) {
		super(algo, parent, mappingExecution);
	}

	@Override
	public Object computeTargetContainer(ComponentPort capellaContainer) {
		return MappingRulesManager.getCapellaObjectFromAllRules(capellaContainer);
	}

	@Override
	public List<ComponentExchange> findSourceElements(ComponentPort capellaContainer) {
		EList<ComponentExchange> componentExchanges = capellaContainer.getComponentExchanges();
		return componentExchanges;
	}

	@Override
	public Object compute(Object eaContainer, ComponentExchange source) {

		ComponentPort sourceContainer = getSourceContainer();
		OrientationPortKind orientation = sourceContainer.getOrientation();

		Port port = (Port) eaContainer;
		org.eclipse.uml2.uml.Interface inter = (org.eclipse.uml2.uml.Interface) MappingRulesManager
				.getCapellaObjectFromAllRules(source);
		port.setType(inter);
		Interface createInterface = null;
		if (inter != null) {
			if (orientation == OrientationPortKind.IN) {

				createInterface = UMLFactory.eINSTANCE.createInterface();
				MappingUtils.generateUID(getAlgo(), getSourceContainer(), createInterface, this, "P");
				createInterface.setName(inter.getName());
				XMIResource res = (XMIResource) (inter.eResource());
				SpecificUtils.addCustoRef(res, port, "provided", createInterface, false, true);
				SpecificUtils.addCustoAttr(res, createInterface, "xmi:idref", MappingUtils.getSysMLID(res, inter));

			} else if (orientation == OrientationPortKind.OUT) {
				port.setIsConjugated(true);

				createInterface = UMLFactory.eINSTANCE.createInterface();
				MappingUtils.generateUID(getAlgo(), getSourceContainer(), createInterface, this, "R");
				createInterface.setName(inter.getName());
				XMIResource res = (XMIResource) (inter.eResource());
				SpecificUtils.addCustoRef(res, port, "required", createInterface, false, true);
				SpecificUtils.addCustoAttr(res, createInterface, "xmi:idref", MappingUtils.getSysMLID(res, inter));
			}
		}

		return null;
	}

	@Override
	public void executeSubRules(List<ComponentExchange> _capellaSource, MappingRulesManager manager) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getUID(EObject key, String id) {
		return "EAID_" + id;
	}

}
