/*******************************************************************************
* Copyright (c) 2021 THALES GLOBAL SERVICES.
* All right reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* Contributors:
*     Artal Technologies - initial API and implementation
*******************************************************************************/
package com.thalesgroup.capella.bridge.uml.ea.core.bridge.rules.utils;

import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EDataTypeImpl;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.util.FeatureMap.Entry;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.ecore.xml.type.impl.AnyTypeImpl;
import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.UMLPackage;
import org.polarsys.capella.core.data.capellacore.AbstractPropertyValue;
import org.polarsys.capella.core.data.capellacore.BooleanPropertyValue;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.EnumerationPropertyLiteral;
import org.polarsys.capella.core.data.capellacore.EnumerationPropertyValue;
import org.polarsys.capella.core.data.capellacore.FloatPropertyValue;
import org.polarsys.capella.core.data.capellacore.IntegerPropertyValue;
import org.polarsys.capella.core.data.capellacore.PropertyValueGroup;
import org.polarsys.capella.core.data.capellacore.PropertyValuePkg;
import org.polarsys.capella.core.data.capellacore.StringPropertyValue;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.core.data.fa.ComponentExchange;
import org.polarsys.capella.core.data.fa.ComponentPort;
import org.polarsys.capella.core.data.fa.ComponentPortKind;
import org.polarsys.capella.core.data.fa.OrientationPortKind;
import org.polarsys.capella.core.data.information.Port;
import org.polarsys.capella.core.data.pa.PhysicalComponent;
import org.polarsys.capella.core.data.pa.PhysicalComponentKind;
import org.polarsys.capella.core.data.pa.PhysicalComponentNature;
import org.polarsys.capella.core.model.helpers.ProjectExt;

import com.artal.capella.bridge.core.CapellaBridgeAlgo;
import com.artal.capella.bridge.core.MappingUtils;
import com.artal.capella.bridge.core.mix.AbstractMappingAlgoMix;
import com.artal.capella.bridge.core.rules.AbstractMapping;
import com.artal.capella.bridge.core.rules.MappingRulesManager;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.Capella2UMLAlgo;
import com.thalesgroup.capella.bridge.uml.ea.model.XMIExtensionsUtils;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.element;

/**
 * @author Yann BINOT
 */
public class SpecificUtils {

	static public PropertyValuePkg getExtensionsPropertyValuesPkg(Project capellaProject) {

		for (PropertyValuePkg pvp : capellaProject.getOwnedPropertyValuePkgs()) {
			if (pvp.getName().equals(("EXTENSIONS"))) {
				return pvp;
			}
		}
		return null;

	}

	static public PropertyValuePkg getProfilePropertyValueGroup(Project capellaProject, String name) {

		String[] split = name.split("\\.");
		String profileName = split[0];

		PropertyValuePkg extensionsPropertyValuesPkg = getExtensionsPropertyValuesPkg(capellaProject);
		EList<PropertyValuePkg> ownedPropertyValuePkgs = extensionsPropertyValuesPkg.getOwnedPropertyValuePkgs();
		for (PropertyValuePkg propertyValuePkg : ownedPropertyValuePkgs) {
			if (propertyValuePkg.getName().equals(profileName)) {
				return propertyValuePkg;
			}
		}
		return null;
	}

	static public PropertyValueGroup getStereotypePropertyValueGroup(Project capellaProject, String name) {

		String[] split = name.split("\\.");
		String profileName = split[1];

		PropertyValuePkg extensionsPropertyValuesPkg = getExtensionsPropertyValuesPkg(capellaProject);
		EList<PropertyValuePkg> ownedPropertyValuePkgs = extensionsPropertyValuesPkg.getOwnedPropertyValuePkgs();
		for (PropertyValuePkg propertyValuePkg : ownedPropertyValuePkgs) {
			EList<PropertyValueGroup> ownedPropertyValueGroups = propertyValuePkg.getOwnedPropertyValueGroups();
			for (PropertyValueGroup propertyValueGroup : ownedPropertyValueGroups) {
				if (propertyValueGroup.getName().equals(profileName)) {
					return propertyValueGroup;
				}
			}

		}
		return null;

	}

	static public PropertyValuePkg getPropertyValuePkgFromName(Project capellaProject, String name) {

		PropertyValuePkg extensionsPropertyValuesPkg = getExtensionsPropertyValuesPkg(capellaProject);
		EList<PropertyValuePkg> ownedPropertyValuePkgs = extensionsPropertyValuesPkg.getOwnedPropertyValuePkgs();
		for (PropertyValuePkg propertyValuePkg : ownedPropertyValuePkgs) {
			EList<PropertyValueGroup> ownedPropertyValueGroups = propertyValuePkg.getOwnedPropertyValueGroups();
			for (PropertyValueGroup propertyValueGroup : ownedPropertyValueGroups) {
				if (propertyValueGroup.getName().equals(name)) {
					return propertyValuePkg;
				}
			}
		}
		return null;

	}

	static public void applyPhysicalStereotypeAttribute(element element, PhysicalComponent component,
			EObject targetComponent) {
		Resource eResource = component.eResource();
		String sysMLIDSource = MappingUtils.getSysMLID(eResource, component);
		PhysicalComponentKind kind = component.getKind();
		XMIExtensionsUtils.addTag(element, "Kind", kind.getLiteral(), targetComponent, sysMLIDSource, "K");
		PhysicalComponentNature nature = component.getNature();
		XMIExtensionsUtils.addTag(element, "Nature", nature.getLiteral(), targetComponent, sysMLIDSource, "N");

	}

	static public void applyComponentPortStereotypeAttribute(element element, ComponentPort componentPort,
			EObject targetPort) {
		Resource eResource = componentPort.eResource();
		String sysMLIDSource = MappingUtils.getSysMLID(eResource, componentPort);
		OrientationPortKind orientation = componentPort.getOrientation();
		XMIExtensionsUtils.addTag(element, "Direction", orientation.getLiteral(), targetPort, sysMLIDSource, "D");

		ComponentPortKind kind = componentPort.getKind();
		XMIExtensionsUtils.addTag(element, "Kind", kind.getLiteral(), targetPort, sysMLIDSource, "K");

	}

	static public void applyComponentExchangeStereotypeAttribute(element element, ComponentExchange ce,
			EObject interf) {
		Port sourcePort = ce.getSourcePort();
		Resource eResource = ce.eResource();
		String sysMLIDSource = MappingUtils.getSysMLID(eResource, sourcePort);

		XMIExtensionsUtils.addTag(element, "SrcCapellaID", sysMLIDSource, interf, sysMLIDSource, "S");
		Port targetPort = ce.getTargetPort();
		String sysMLIDTarget = MappingUtils.getSysMLID(eResource, targetPort);
		XMIExtensionsUtils.addTag(element, "TargetCapellaID", sysMLIDTarget, interf, sysMLIDTarget, "T");

	}

	static public void applyStereotypeAttribute(PropertyValueGroup propertyValueGroup, element createElement,
			EObject eobject) {
		EList<AbstractPropertyValue> ownedPropertyValues = propertyValueGroup.getOwnedPropertyValues();
		for (AbstractPropertyValue abstractPropertyValue : ownedPropertyValues) {
			String name = abstractPropertyValue.getName();
			String value = null;
			if (abstractPropertyValue instanceof StringPropertyValue) {
				value = ((StringPropertyValue) abstractPropertyValue).getValue();
			}
			if (abstractPropertyValue instanceof BooleanPropertyValue) {
				value = ((BooleanPropertyValue) abstractPropertyValue).isValue() + "#NOTES#Values: true,false&#xA;";
			}
			if (abstractPropertyValue instanceof EnumerationPropertyValue) {

				EnumerationPropertyLiteral valueLiteral = ((EnumerationPropertyValue) abstractPropertyValue).getValue();
				if (valueLiteral != null) {
					value = valueLiteral.getLabel();
				}
			}
			if (abstractPropertyValue instanceof FloatPropertyValue) {
				value = "" + ((FloatPropertyValue) abstractPropertyValue).getValue();
			}
			if (abstractPropertyValue instanceof IntegerPropertyValue) {
				value = "" + ((IntegerPropertyValue) abstractPropertyValue).getValue();
			}
			Resource eResource = abstractPropertyValue.eResource();
			String sysMLIDSource = MappingUtils.getSysMLID(eResource, abstractPropertyValue);
			XMIExtensionsUtils.addTag(createElement, name, value, eobject, sysMLIDSource, "p");
		}
	}

	static public String getSType(Element capellaElement) {

		if (capellaElement instanceof Actor) {
			return "Actor";
		}
		if (capellaElement instanceof org.eclipse.uml2.uml.Component) {
			return "Component";
		}

		if (capellaElement instanceof org.eclipse.uml2.uml.Port) {
			return "Port";
		}
		if (capellaElement instanceof org.eclipse.uml2.uml.Enumeration) {
			return "Enumeration";
		}
		if (capellaElement instanceof Signal) {
			return "Signal";
		}
		if (capellaElement instanceof org.eclipse.uml2.uml.Class) {
			return "Class";
		}
		if (capellaElement instanceof org.eclipse.uml2.uml.Interface) {
			return "Interface";
		}
		if (capellaElement instanceof PrimitiveType) {
			return "PrimitiveType";
		}
		if (capellaElement instanceof DataType) {
			return "DataType";
		}

		return null;
	}

	static public String getCapellaImportName(AbstractMapping rule) {
		AbstractMappingAlgoMix<?, CapellaBridgeAlgo<?>, ?> mix = rule.getAlgo().getMix();
		return mix.getPackageName();
	}

	static public AnyType getOrCreateCustomizationList(XMIResource res, EObject sourceItem) {
		Map<EObject, AnyType> customMap = res.getEObjectToExtensionMap();
		AnyType allCustoms = customMap.get(sourceItem);

		if (allCustoms == null) {
			allCustoms = new AnyTypeImpl() {
				public FeatureMap getMixed() {
					if (mixed == null) {
						mixed = new BasicFeatureMap(this, XMLTypePackage.ANY_TYPE__MIXED) {
							protected org.eclipse.emf.ecore.util.FeatureMap.Entry validate(int index,
									org.eclipse.emf.ecore.util.FeatureMap.Entry object) {
								if (modCount == 0)
									return object;

								return null;

							}

							public boolean add(EStructuralFeature feature, Object object) {

								boolean isFeatureMap = FeatureMapUtil.isFeatureMap(feature);
								if (isMany(feature)) {
									if (feature.isUnique() && contains(feature, object)) {
										return false;
									}
								}

								return doAdd(isFeatureMap ? (Entry) object : createEntry(feature, object));

							}
						};

					}
					return mixed;
				}

				@Override
				public FeatureMap getAnyAttribute() {
					if (anyAttribute == null) {
						anyAttribute = new BasicFeatureMap(this, XMLTypePackage.ANY_TYPE__ANY_ATTRIBUTE) {
							protected org.eclipse.emf.ecore.util.FeatureMap.Entry validate(int index,
									org.eclipse.emf.ecore.util.FeatureMap.Entry object) {
								if (modCount == 0)
									return object;

								return null;

							}

							public boolean add(EStructuralFeature feature, Object object) {

								boolean isFeatureMap = FeatureMapUtil.isFeatureMap(feature);
								if (isMany(feature)) {
									if (feature.isUnique() && contains(feature, object)) {
										return false;
									}
								}

								return doAdd(isFeatureMap ? (Entry) object : createEntry(feature, object));

							}
						};
					}
					return anyAttribute;
				}
			};
			customMap.put(sourceItem, allCustoms);
		}

		return allCustoms;
	}

	/**
	 * Add a custom reference
	 *
	 * @param res         concerned UML resource
	 * @param sourceItem  item to customize
	 * @param featureName name of the new attribute
	 * @param targetItem  customization to add on the sourceItem
	 * @param displayType indicate if the object type must be displayed in a
	 *                    "xmi:type" attribute
	 */
	static public void addCustoRef(XMIResource res, EObject sourceItem, String featureName, EObject targetItem,
			boolean displayType, boolean isContainment) {
		// New Feature
		EReference feature = EcoreFactory.eINSTANCE.createEReference();
		feature.setName(featureName);
		if (displayType) {
			feature.setEType(UMLPackage.eINSTANCE.getElement());
		} else {
			feature.setEType(targetItem.eClass());
		}

		feature.setContainment(isContainment);
		AnyType allCustoms = getOrCreateCustomizationList(res, sourceItem);

		allCustoms.getAny().add(feature, targetItem);
		if (res instanceof ResourceImpl) {
			((ResourceImpl) res).attached(targetItem);
		}
	}

	/**
	 * Add a custom attribute
	 *
	 * @param res         concerned UML resource
	 * @param sourceItem  item to customize
	 * @param featureName name of the new attribute
	 * @param value       string value to display
	 */
	static public void addCustoAttr(XMIResource res, EObject sourceItem, String featureName, String value) {
		// New Attribute
		EAttribute attr = EcoreFactory.eINSTANCE.createEAttribute();
		// attributes.add(attr);
		attr.setName(featureName);
		EDataType type = new EDataTypeImpl() {
			@Override
			public EPackage getEPackage() {
				return new EPackageImpl() {
					@Override
					public EFactory getEFactoryInstance() {
						return new EcoreFactoryImpl() {
							@Override
							public String convertToString(EDataType eDataType, Object instanceValue) {
								return instanceValue.toString();
							}
						};
					}
				};
			}
		};
		type.setName("AnySimpleType");
		type.setInstanceClass(String.class);
		attr.setEType(type);
		attr.setUpperBound(1);

		AnyType allCustoms = getOrCreateCustomizationList(res, sourceItem);

		allCustoms.getAnyAttribute().add(attr, value);
	}

	/**
	 * @param sp
	 * @param featureName
	 * @return
	 */
	static public Object getCustomFeature(EObject sp, String... featureNames) {
		Object value = null;
		XMIResource res = (XMIResource) sp.eResource();
		if (res != null) {
			Map<EObject, AnyType> eObjectToExtensionMap = res.getEObjectToExtensionMap();
			AnyType anyType = eObjectToExtensionMap.get(sp);
			if (anyType != null) {
				FeatureMap any = anyType.getMixed();

				for (String featureName : featureNames) {
					for (int i = 0; i < any.size(); i++) {
						Entry entry = any.get(i);

						EStructuralFeature eStructuralFeature = entry.getEStructuralFeature();
						if (eStructuralFeature.getName().equals(featureName)) {
							value = entry.getValue();
						}
					}
				}
			}
		}
		return value;
	}

	/**
	 * @param eaContainer
	 * @param targetComponent
	 * @param model
	 * @param propertyValueGroup
	 * @param typeBase
	 * @param compStereo
	 */
	static public void createCustoStereotypeApplication(Element eaContainer, Element targetComponent, Model model,
			PropertyValueGroup propertyValueGroup, String typeBase, Element compStereo, Capella2UMLAlgo algo) {
		XMIResource res = (XMIResource) (eaContainer).eResource();
		String name = propertyValueGroup.getName().replace(".", ":").replace("?", "").replace(" ", "");
		SpecificUtils.addCustoRef(res, model, name, compStereo, false, true);
		algo.getStereoNames().add(name);

		String sysMLID = MappingUtils.getSysMLID(res, targetComponent);
		if (sysMLID != null)
			SpecificUtils.addCustoAttr(res, compStereo, "base_Class" /* + typeBase */, sysMLID);
		EList<AbstractPropertyValue> ownedPropertyValues = propertyValueGroup.getOwnedPropertyValues();
		int eaStereoAttrCount = 0;
		for (AbstractPropertyValue abstractPropertyValue : ownedPropertyValues) {
			String pvName = abstractPropertyValue.getName();
			String value = null;
			if (abstractPropertyValue instanceof StringPropertyValue) {
				value = ((StringPropertyValue) abstractPropertyValue).getValue();
			}
			if (abstractPropertyValue instanceof BooleanPropertyValue) {
				value = ((BooleanPropertyValue) abstractPropertyValue).isValue() + "#NOTES#Values: true,false&#xA;";
			}
			if (abstractPropertyValue instanceof EnumerationPropertyValue) {

				EnumerationPropertyLiteral valueLiteral = ((EnumerationPropertyValue) abstractPropertyValue).getValue();
				if (valueLiteral != null) {
					value = valueLiteral.getLabel();
				}
			}
			if (abstractPropertyValue instanceof FloatPropertyValue) {
				value = "" + ((FloatPropertyValue) abstractPropertyValue).getValue();
			}
			if (abstractPropertyValue instanceof IntegerPropertyValue) {
				value = "" + ((IntegerPropertyValue) abstractPropertyValue).getValue();
			}
			if (value != null) {
				if(pvName.contains(" ")){
					String replace = pvName.replace(" ", "_").replace("/", " ");
					eaStereoAttrCount++;
					addCustoAttr(res, compStereo, "__EAStereoName"+((eaStereoAttrCount!=1)?eaStereoAttrCount:""), pvName);
					pvName = replace;
				}
				SpecificUtils.addCustoAttr(res, compStereo, pvName, value);
				
			}
		}
	}

	static public Model getModel(Element element, CapellaElement ce) {
		Model model = element.getModel();
		if (model != null) {
			return model;
		}
		Project project = ProjectExt.getProject(ce);
		return ((Model) MappingRulesManager.getCapellaObjectFromAllRules(project));
	}

}
