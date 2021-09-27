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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.LiteralInteger;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.Usage;
import org.polarsys.capella.core.data.capellacore.Classifier;
import org.polarsys.capella.core.data.capellacore.Type;
import org.polarsys.capella.core.data.information.AbstractInstance;
import org.polarsys.capella.core.data.information.AggregationKind;
import org.polarsys.capella.core.data.information.Port;
import org.polarsys.capella.core.data.information.Property;

import com.artal.capella.bridge.core.MappingUtils;
import com.artal.capella.bridge.core.rules.AbstractDynamicMapping;
import com.artal.capella.bridge.core.rules.MappingRulesManager;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.Capella2UMLAlgo;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.rules.utils.SpecificUtils;
import com.thalesgroup.capella.bridge.uml.ea.model.XMIExtensionsUtils;

/**
 * @author Yann BINOT
 *
 */
public class PropertyMapping extends AbstractDynamicMapping<Classifier, Property, Capella2UMLAlgo> {

	/**
	 * @param algo
	 * @param parent
	 * @param mappingExecution
	 */
	public PropertyMapping(Capella2UMLAlgo algo, Classifier parent, IMappingExecution mappingExecution) {
		super(algo, parent, mappingExecution);
	}

	@Override
	public Object computeTargetContainer(Classifier capellaContainer) {
		Object capellaObjectFromAllRules = MappingRulesManager.getCapellaObjectFromAllRules(capellaContainer);
		return capellaObjectFromAllRules;
	}

	@Override
	public List<Property> findSourceElements(Classifier capellaContainer) {

		List<Property> properties = capellaContainer.getOwnedFeatures().stream()
				.filter(prop -> prop instanceof Property).map(Property.class::cast).filter(prop -> isNotPartition(prop))
				.collect(Collectors.toList());

		return properties;
	}

	public boolean isNotPartition(Property prop) {

		if (prop instanceof AbstractInstance || prop instanceof Port) {
			return false;
		}

		return true;
	}

	@Override
	public Object compute(Object eaContainer, Property source) {
		Type type = source.getType();
		Object capellaObjectFromAllRules = MappingRulesManager.getCapellaObjectFromAllRules(type);
		if (!(type instanceof org.polarsys.capella.core.data.information.Class)
				|| ((type instanceof org.polarsys.capella.core.data.information.Class)
						&& ((org.polarsys.capella.core.data.information.Class) type).isIsPrimitive())) {

			org.eclipse.uml2.uml.Property targetProperty = UMLFactory.eINSTANCE.createProperty();
			MappingUtils.generateUID(getAlgo(), source, targetProperty, this);
			targetProperty.setName(source.getName());

			targetProperty.setType((org.eclipse.uml2.uml.Type) capellaObjectFromAllRules);

			LiteralInteger minInteger = UMLFactory.eINSTANCE.createLiteralInteger();
			MappingUtils.generateUID(getAlgo(), source, minInteger, this, "min");
			minInteger.setValue(1);

			LiteralInteger maxInteger = UMLFactory.eINSTANCE.createLiteralInteger();
			MappingUtils.generateUID(getAlgo(), source, maxInteger, this, "max");
			maxInteger.setValue(1);

			targetProperty.setUpperValue(maxInteger);
			targetProperty.setLowerValue(minInteger);

			if (eaContainer instanceof org.eclipse.uml2.uml.DataType) {
				((org.eclipse.uml2.uml.DataType) eaContainer).getOwnedAttributes().add(targetProperty);
			}
			if (eaContainer instanceof Component) {
				((Component) eaContainer).getOwnedAttributes().add(targetProperty);
			}
			if (eaContainer instanceof Actor) {
				Resource resource = (Resource) ((Actor) eaContainer).eResource();
				if (resource instanceof XMIResource) {
					SpecificUtils.addCustoRef((XMIResource) resource, (Actor) eaContainer, "ownedAttribute",
							targetProperty, true, true);
				}
			}

			return targetProperty;
		}
		if (eaContainer instanceof org.eclipse.uml2.uml.DataType) {
//		((org.eclipse.uml2.uml.DataType) eaContainer).getOwnedAttributes().add(targetProperty);
			if (!(type instanceof org.polarsys.capella.core.data.information.Class)
					|| ((type instanceof org.polarsys.capella.core.data.information.Class)
							&& ((org.polarsys.capella.core.data.information.Class) type).isIsPrimitive())) {
				if (capellaObjectFromAllRules != null) {

					Usage createUsage = UMLFactory.eINSTANCE.createUsage();
					MappingUtils.generateUID(getAlgo(), source, createUsage, this, "us");

					createUsage.getClients().add((DataType) eaContainer);
					createUsage.getSuppliers().add((org.eclipse.uml2.uml.Type) capellaObjectFromAllRules);

					EList<PackageableElement> packagedElements = ((org.eclipse.uml2.uml.DataType) eaContainer)
							.getModel().getPackagedElements();
					for (PackageableElement ownedMember : packagedElements) {
						if (ownedMember.getName().equals(SpecificUtils.getCapellaImportName(this)))
							((org.eclipse.uml2.uml.Package) ownedMember).getPackagedElements().add(createUsage);
					}

				}
			} else {
				Association targetAssociation = UMLFactory.eINSTANCE.createAssociation();
				MappingUtils.generateUID(getAlgo(), source, targetAssociation, this, "a");
				Resource eResource = source.eResource();
				String sysMLID = MappingUtils.getSysMLID(eResource, source);

				org.eclipse.uml2.uml.DataType parent = (org.eclipse.uml2.uml.DataType) eaContainer;
				((org.eclipse.uml2.uml.Package) parent.getModel().getPackagedElements().get(0)).getPackagedElements()
						.add(targetAssociation);

				org.eclipse.uml2.uml.Property targetProp = UMLFactory.eINSTANCE.createProperty();
				MappingUtils.generateUID(getAlgo(), source, targetProp, this, "tp");
				targetProp.setIsComposite(false);
				targetAssociation.getOwnedEnds().add(targetProp);

				// Component targetC = (Component)
				// MappingRulesManager.getCapellaObjectFromAllRules(source);
				org.eclipse.uml2.uml.Property subProp = UMLFactory.eINSTANCE.createProperty();
				MappingUtils.generateUID(getAlgo(), source, subProp, this, "p");

				targetProp.setType(parent);
				subProp.setType((org.eclipse.uml2.uml.Type) capellaObjectFromAllRules);
				if (source.getAggregationKind() == AggregationKind.ASSOCIATION) {
					subProp.setIsComposite(false);
				}
				if (source.getAggregationKind() == AggregationKind.COMPOSITION) {
					subProp.setIsComposite(true);
					subProp.setAggregation(org.eclipse.uml2.uml.AggregationKind.COMPOSITE_LITERAL);
				}
				if (source.getAggregationKind() == AggregationKind.AGGREGATION) {
					subProp.setIsComposite(true);
					subProp.setAggregation(org.eclipse.uml2.uml.AggregationKind.SHARED_LITERAL);
				}

				subProp.setAssociation(targetAssociation);
				targetProp.setAssociation(targetAssociation);
				parent.getOwnedAttributes().add(subProp);

				if (source.getAggregationKind() == AggregationKind.ASSOCIATION) {
					XMIExtensionsUtils.addConnector(targetAssociation, getAlgo().getXMIExtension(), sysMLID,
							"Destination -&gt; Source", "Association", subProp, targetProp, true);
				} else {
					XMIExtensionsUtils.addConnector(targetAssociation, getAlgo().getXMIExtension(), sysMLID,
							"Unspecified", "Association", subProp, targetProp, true);
				}
			}
		}
		if (eaContainer instanceof Component) {
//			((Component) eaContainer).getOwnedAttributes().add(targetProperty);
			if (!(type instanceof org.polarsys.capella.core.data.information.Class)
					|| ((type instanceof org.polarsys.capella.core.data.information.Class)
							&& ((org.polarsys.capella.core.data.information.Class) type).isIsPrimitive())) {
				if (capellaObjectFromAllRules != null) {
					Usage createUsage = UMLFactory.eINSTANCE.createUsage();
					MappingUtils.generateUID(getAlgo(), source, createUsage, this, "us");

					createUsage.getClients().add((Component) eaContainer);
					createUsage.getSuppliers().add((org.eclipse.uml2.uml.Type) capellaObjectFromAllRules);

					EList<PackageableElement> packagedElements = ((Component) eaContainer).getModel()
							.getPackagedElements();
					for (PackageableElement ownedMember : packagedElements) {
						if (ownedMember.getName().equals(SpecificUtils.getCapellaImportName(this)))
							((org.eclipse.uml2.uml.Package) ownedMember).getPackagedElements().add(createUsage);
					}

				}
			} else {
				Association targetAssociation = UMLFactory.eINSTANCE.createAssociation();
				MappingUtils.generateUID(getAlgo(), source, targetAssociation, this, "a");
				Resource eResource = source.eResource();
				String sysMLID = MappingUtils.getSysMLID(eResource, source);

				org.eclipse.uml2.uml.DataType parent = (org.eclipse.uml2.uml.DataType) eaContainer;
				((org.eclipse.uml2.uml.Package) parent.getModel().getPackagedElements().get(0)).getPackagedElements()
						.add(targetAssociation);

				org.eclipse.uml2.uml.Property targetProp = UMLFactory.eINSTANCE.createProperty();
				MappingUtils.generateUID(getAlgo(), source, targetProp, this, "tp");
				targetProp.setIsComposite(false);
				targetAssociation.getOwnedEnds().add(targetProp);

				// Component targetC = (Component)
				// MappingRulesManager.getCapellaObjectFromAllRules(source);
				org.eclipse.uml2.uml.Property subProp = UMLFactory.eINSTANCE.createProperty();
				MappingUtils.generateUID(getAlgo(), source, subProp, this, "p");

				targetProp.setType(parent);
				subProp.setType((org.eclipse.uml2.uml.Type) capellaObjectFromAllRules);
				if (source.getAggregationKind() == AggregationKind.ASSOCIATION) {
					subProp.setIsComposite(false);
				}
				if (source.getAggregationKind() == AggregationKind.COMPOSITION) {
					subProp.setIsComposite(true);
					subProp.setAggregation(org.eclipse.uml2.uml.AggregationKind.COMPOSITE_LITERAL);
				}
				if (source.getAggregationKind() == AggregationKind.AGGREGATION) {
					subProp.setIsComposite(true);
					subProp.setAggregation(org.eclipse.uml2.uml.AggregationKind.SHARED_LITERAL);
				}

				subProp.setAssociation(targetAssociation);
				targetProp.setAssociation(targetAssociation);
				parent.getOwnedAttributes().add(subProp);

				XMIExtensionsUtils.addConnector(targetAssociation, getAlgo().getXMIExtension(), sysMLID, "Unspecified",
						"Association", subProp, targetProp, true);
			}
		}
//		if (eaContainer instanceof Actor) {
//			Resource resource = (Resource) ((Actor) eaContainer).eResource();
//			if (resource instanceof XMIResource) {
//				SpecificUtils.addCustoRef((XMIResource) resource, (Actor) eaContainer, "ownedAttribute", targetProperty,
//						true, true);
//			}
//		}

		return null;
	}

	@Override
	public void executeSubRules(List<Property> _capellaSource, MappingRulesManager manager) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getUID(EObject key, String id) {
		return "EAID_" + id;
	}

}
