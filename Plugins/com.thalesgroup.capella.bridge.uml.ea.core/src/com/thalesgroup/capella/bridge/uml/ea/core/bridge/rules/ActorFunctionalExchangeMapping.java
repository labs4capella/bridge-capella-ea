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
import java.util.stream.Collectors;

import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.FunctionInputPort;
import org.polarsys.capella.core.data.fa.FunctionOutputPort;
import org.polarsys.capella.core.data.fa.FunctionalExchange;
import org.polarsys.capella.core.data.la.LogicalComponent;

import com.artal.capella.bridge.core.CapellaUtils;
import com.artal.capella.bridge.core.MappingUtils;
import com.artal.capella.bridge.core.rules.MappingRulesManager;
import com.artal.capella.bridge.core.rules.commons.CommonFunctionalExchangeMapping;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.Capella2UMLAlgo;

/**
 * @author Yann BINOT
 *
 */
public class ActorFunctionalExchangeMapping extends CommonFunctionalExchangeMapping<Component, Capella2UMLAlgo> {

	public ActorFunctionalExchangeMapping(Capella2UMLAlgo algo, LogicalComponent parent,
			IMappingExecution mappingExecution) {
		super(algo, parent, mappingExecution);
	}

	@Override
	public List<FunctionalExchange> findSourceElements(Component capellaContainer) {

		List<FunctionalExchange> findSourceElements = super.findSourceElements(capellaContainer);
		List<FunctionalExchange> collect = findSourceElements.stream().filter(lf -> isInActor(lf, capellaContainer))
				.collect(Collectors.toList());

		return collect;
	}

	public boolean isInActor(FunctionalExchange lf, Component capellaContainer) {
		FunctionOutputPort sourceFunctionOutputPort = lf.getSourceFunctionOutputPort();
		FunctionInputPort targetFunctionInputPort = lf.getTargetFunctionInputPort();

		AbstractFunction sourceFunction = (AbstractFunction) sourceFunctionOutputPort.eContainer();
		AbstractFunction targetFunction = (AbstractFunction) targetFunctionInputPort.eContainer();

		Component sourceComponent = CapellaUtils.getInverseComponent(sourceFunction);
		Component targetComponent = CapellaUtils.getInverseComponent(targetFunction);

		if (capellaContainer.equals(sourceComponent) && capellaContainer.equals(targetComponent)) {
			return false;
		}
		if (capellaContainer.equals(sourceComponent) || capellaContainer.equals(targetComponent)) {
			return true;
		}

		return false;
	}

	@Override
	public Object compute(Object eaContainer, FunctionalExchange source) {

		Association createAssociation = UMLFactory.eINSTANCE.createAssociation();
		MappingUtils.generateUID(getAlgo(), source, createAssociation, this);

		FunctionInputPort targetFunctionInputPort = source.getTargetFunctionInputPort();
		FunctionOutputPort sourceFunctionOutputPort = source.getSourceFunctionOutputPort();

		AbstractFunction sourceFunction = (AbstractFunction) sourceFunctionOutputPort.eContainer();
		AbstractFunction targetFunction = (AbstractFunction) targetFunctionInputPort.eContainer();

		Component sourceComponent = CapellaUtils.getInverseComponent(sourceFunction);
		Component targetComponent = CapellaUtils.getInverseComponent(targetFunction);

		Element sourceElement = (Element) MappingRulesManager.getCapellaObjectFromAllRules(sourceComponent);
		Element targetElement = (Element) MappingRulesManager.getCapellaObjectFromAllRules(targetComponent);

		Property sourceProperty = UMLFactory.eINSTANCE.createProperty();
		MappingUtils.generateUID(getAlgo(), source, sourceProperty, this, "s");
		Property targetProperty = UMLFactory.eINSTANCE.createProperty();
		MappingUtils.generateUID(getAlgo(), source, targetProperty, this, "t");

		sourceProperty.setAssociation(createAssociation);
		targetProperty.setAssociation(createAssociation);

		sourceProperty.setType((Type) sourceElement);
		targetProperty.setType((Type) targetElement);

		createAssociation.getOwnedEnds().add(sourceProperty);
		createAssociation.getOwnedEnds().add(targetProperty);

		if (eaContainer instanceof Element) {
			Model model = ((Element) eaContainer).getModel();
			org.eclipse.uml2.uml.Package pkgCapella = (org.eclipse.uml2.uml.Package) model.getPackagedElements().get(0);
			pkgCapella.getPackagedElements().add(createAssociation);
		}

		return createAssociation;
	}

	@Override
	public void executeSubRules(List<FunctionalExchange> _capellaSource, MappingRulesManager manager) {
	}

}
