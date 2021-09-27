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

import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.UMLFactory;
import org.polarsys.capella.core.data.capellacore.Type;
import org.polarsys.capella.core.data.information.ExchangeItem;
import org.polarsys.capella.core.data.information.ExchangeItemElement;
import org.polarsys.capella.core.data.information.ParameterDirection;

import com.artal.capella.bridge.core.MappingUtils;
import com.artal.capella.bridge.core.rules.MappingRulesManager;
import com.artal.capella.bridge.core.rules.commons.CommonExchangeItemElement;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.Capella2UMLAlgo;

/**
 * @author Yann BINOT
 *
 */
public class OperationExchangeItemElementMapping extends CommonExchangeItemElement<Capella2UMLAlgo> {

	/**
	 * @param algo
	 * @param parent
	 * @param mappingExecution
	 */
	public OperationExchangeItemElementMapping(Capella2UMLAlgo algo, ExchangeItem parent,
			IMappingExecution mappingExecution) {
		super(algo, parent, mappingExecution);
	}

	@Override
	public Object compute(Object eaContainer, ExchangeItemElement source) {
		Parameter targetParameter = UMLFactory.eINSTANCE.createParameter();
		targetParameter.setName(source.getName());
		MappingUtils.generateUID(getAlgo(), source, targetParameter, this);

		setDirection(targetParameter, source.getDirection());
		Type type = source.getType();
		Object capellaObjectFromAllRules = MappingRulesManager.getCapellaObjectFromAllRules(type);
		if (capellaObjectFromAllRules instanceof org.eclipse.uml2.uml.Type) {
			targetParameter.setType((org.eclipse.uml2.uml.Type) capellaObjectFromAllRules);
		}
		if (eaContainer instanceof Operation) {
			((Operation) eaContainer).getOwnedParameters().add(targetParameter);
		}

		return targetParameter;
	}

	private void setDirection(Parameter parameter, ParameterDirection direction) {
		switch (direction) {
		case IN:
			parameter.setDirection(ParameterDirectionKind.IN_LITERAL);
			break;
		case OUT:
			parameter.setDirection(ParameterDirectionKind.OUT_LITERAL);
			break;
		case INOUT:
			parameter.setDirection(ParameterDirectionKind.INOUT_LITERAL);
			break;
		case RETURN:
			parameter.setDirection(ParameterDirectionKind.RETURN_LITERAL);
			break;
		case EXCEPTION:
		case UNSET:
		default:
			break;
		}
	}

	@Override
	public void executeSubRules(List<ExchangeItemElement> _capellaSource, MappingRulesManager manager) {

	}

	@Override
	public String getUID(EObject key, String id) {
		return "EAID_" + id;
	}

}
