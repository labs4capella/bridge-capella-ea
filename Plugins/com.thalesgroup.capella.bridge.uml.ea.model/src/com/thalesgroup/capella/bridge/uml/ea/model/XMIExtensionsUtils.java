/*******************************************************************************
* Copyright (c) 2021 THALES GLOBAL SERVICES.
* All right reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* Contributors:
*     Artal Technologies - initial API and implementation
*******************************************************************************/
package com.thalesgroup.capella.bridge.uml.ea.model;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.thalesgroup.capella.bridge.uml.ea.model.xmi.Documentation;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.Extension;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiFactory;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.attribute;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.attributes;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.connector;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.connectors;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.constraint;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.constraints;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.element;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.elements;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.model;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.operation;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.operations;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.properties;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.role;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.source;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.stereotype;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.tag;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.tags;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.target;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.xrefs;

/**
 * @author Yann BINOT
 *
 */
public class XMIExtensionsUtils {

	public static element createElement(EObject element, Extension extension) {
		return addElement(element, extension, null, null);
	}

	public static element addElement(EObject element, Extension extension, String ids, String name) {
		EList<elements> elements = extension.getElements();
		if (elements.size() == 0) {
			elements xmielements = XmiFactory.eINSTANCE.createelements();
			extension.getElements().add(xmielements);
		}
		elements xmiElements = extension.getElements().get(0);
		element xmielement = XmiFactory.eINSTANCE.createelement();
		xmielement.setXmiidref(element);
		xmiElements.getElement().add(xmielement);

		xrefs xrefs = XmiFactory.eINSTANCE.createxrefs();
		xmielement.setXrefs(xrefs);
		if (ids != null) {
			setXRefsValue(xrefs, ids, name);
		}
		return xmielement;
	}

	public static void addConnector(EObject connector, Extension extension, String ids, String direction, String type,
			EObject source, EObject target, boolean properties) {
		EList<connectors> connectors = extension.getConnectors();
		if (connectors.size() == 0) {
			connectors xmiconnectors = XmiFactory.eINSTANCE.createconnectors();
			extension.getConnectors().add(xmiconnectors);
		}
		connectors xmiConnectors = extension.getConnectors().get(0);
		connector xmiconnector = XmiFactory.eINSTANCE.createconnector();
		xmiconnector.setXmiidref(connector);
		xmiConnectors.getConnector().add(xmiconnector);
		if (properties) {
			properties xmiproperties = XmiFactory.eINSTANCE.createproperties();
			xmiproperties.setEa_type(type);
			xmiproperties.setDirection(direction);
			xmiconnector.setProperties(xmiproperties);
		}
		source createsource = XmiFactory.eINSTANCE.createsource();
		createsource.setXmiidref(source);
		role createrolesource = XmiFactory.eINSTANCE.createrole();
		createrolesource.setVisibility("Public");
		createsource.setRole(createrolesource);

		target createtarget = XmiFactory.eINSTANCE.createtarget();
		createtarget.setXmiidref(target);
		role createroletarget = XmiFactory.eINSTANCE.createrole();
		createroletarget.setVisibility("Public");
		createtarget.setRole(createroletarget);

		xmiconnector.setSource(createsource);
		xmiconnector.setTarget(createtarget);

	}

	public static element getElementFromEObject(EObject object, Extension extension) {

		EList<elements> elements = extension.getElements();
		for (elements elements2 : elements) {
			EList<element> element2 = elements2.getElement();
			for (element element3 : element2) {
				EObject xmiidref = element3.getXmiidref();
				if (object.equals(xmiidref)) {
					return element3;
				}
			}
		}
		return null;

	}

	public static operation createOperation(element element, EObject object, List<String> stereoNames, String ids) {
		operations operations = element.getOperations();
		if (operations == null) {
			operations = XmiFactory.eINSTANCE.createoperations();
			element.setOperations(operations);
		}

		operation operation = XmiFactory.eINSTANCE.createoperation();
		operation.setXmiidref(object);
		if (stereoNames != null && !stereoNames.isEmpty()) {
			stereotype createstereotype = XmiFactory.eINSTANCE.createstereotype();
			createstereotype.setStereotype(stereoNames.get(0));
			operation.setStereotype(createstereotype);

			xrefs createxrefs = XmiFactory.eINSTANCE.createxrefs();
			setXRefsValue(createxrefs, ids, stereoNames, "operation property");
			operation.setXrefs(createxrefs);

		}

		operations.getOperation().add(operation);
		return operation;

	}

	public static void addModel(element element, EObject owner, EObject pack) {
		model createmodel = XmiFactory.eINSTANCE.createmodel();
		createmodel.setPackage(pack);
		if (owner != null) {
			createmodel.setOwner(owner);
		}
		createmodel.setTpos("0");
		createmodel.setEa_eletype("element");
		element.setModel(createmodel);

	}

	// public static void addCustomProfile(Model model) {
	// model.
	// }

	static public void setXRefsValue(xrefs xrefs, String ids, String name) {
		String value = null;
		// value = "$XREFPROP=$XID={"+ids+"}$XID;$NAM=Stereotypes$NAM;$TYP=element
		// property$TYP;$VIS=Public$VIS;$PAR=0$PAR;$DES=@STEREO;Name=sign;GUID={1D3CEB02-60D8-41c9-9D8A-168ACA9D8E5E};@ENDSTEREO;$DES;$CLT={528D2027-4A69-48e6-8F05-CE3F31EC978D}$CLT;$SUP=&lt;none&gt;$SUP;$ENDXREF;";
		value = "$XREFPROP=$XID={" + ids + name
				+ "}$XID;$NAM=Stereotypes$NAM;$TYP=element property$TYP;$VIS=Public$VIS;$PAR=0$PAR;$DES=@STEREO;Name="
				+ name + ";GUID={25076860-6280-4441-B4D3-B21668224ABF};@ENDSTEREO;$DES;$CLT={" + ids
				+ "}$CLT;$SUP=&lt;none&gt;$SUP;$ENDXREF;";

		xrefs.setValue(value);
	}

	static public void setXRefsValue(xrefs xrefs, String ids, List<String> names, String typeProperty) {
		String value = null;
		// value = "$XREFPROP=$XID={"+ids+"}$XID;$NAM=Stereotypes$NAM;$TYP=element
		// property$TYP;$VIS=Public$VIS;$PAR=0$PAR;$DES=@STEREO;Name=sign;GUID={1D3CEB02-60D8-41c9-9D8A-168ACA9D8E5E};@ENDSTEREO;$DES;$CLT={528D2027-4A69-48e6-8F05-CE3F31EC978D}$CLT;$SUP=&lt;none&gt;$SUP;$ENDXREF;";
		value = "$XREFPROP=$XID={" + ids + names.get(0) + "}$XID;$NAM=Stereotypes$NAM;$TYP=" + typeProperty
				+ "$TYP;$VIS=Public$VIS;$PAR=0$PAR;$DES="/*
															 * @STEREO; Name=" + name +
															 * ";GUID={25076860-6280-4441-B4D3-B21668224ABF};@ENDSTEREO;$DES;$CLT={"
															 * +ids+ "}$CLT;$SUP=&lt;none&gt;$SUP;$ENDXREF;"
															 */;

		for (String string : names) {
			value += "@STEREO;Name=" + string + ";GUID={25076860-6280-4441-B4D3-B21668224ABF};@ENDSTEREO;";
		}
		value += "$DES;$CLT={" + ids + "}$CLT;$SUP=&lt;none&gt;$SUP;$ENDXREF;";

		xrefs.setValue(value);
	}

	static public void addXredPropIsConjugated(EObject element, Extension extension) {

		EList<elements> elements = extension.getElements();
		for (elements elements2 : elements) {
			EList<element> element2 = elements2.getElement();
			for (element element3 : element2) {
				EObject xmiidref = element3.getXmiidref();
				if (element.equals(xmiidref)) {
					xrefs xrefs = element3.getXrefs();
					String value = xrefs.getValue();
					if (value == null) {
						value = "";
					}

					value += "$XREFPROP=$XID={179361D8-0C7C-4a86-86E0-03DE8F85851A}$XID;$NAM=CustomProperties$NAM;$TYP=element property$TYP;$VIS=Public$VIS;$PAR=0$PAR;$DES=@PROP=@NAME=isConjugated@ENDNAME;@TYPE=Boolean@ENDTYPE;@VALU=-1@ENDVALU;@PRMT=@ENDPRMT;@ENDPROP;$DES;$CLT={009A954E-FF9A-43dd-9F03-A9A7D664FB86}$CLT;$SUP=&lt;none&gt;$SUP;$ENDXREF;";
					xrefs.setValue(value);
				}
			}
		}

	}

	static public void createProperties(element addElement, boolean isAbstract, boolean isLeaf, String sType, int nType,
			String scope, boolean isRoot, boolean isSpecification) {
		properties createproperties = XmiFactory.eINSTANCE.createproperties();
		createproperties.setIsAbstract(isAbstract);
		createproperties.setIsLeaf(isLeaf);
		createproperties.setSType(sType);
		createproperties.setNType(nType);
		createproperties.setScope(scope);
		createproperties.setIsRoot(isRoot);
		createproperties.setIsSpecification(isSpecification);
		addElement.setProperties(createproperties);
	}

	static public void setDocumentation(EObject element, Extension extension, String documentation, String sType) {

		EList<elements> elements = extension.getElements();
		for (elements elements2 : elements) {
			EList<element> element2 = elements2.getElement();
			for (element element3 : element2) {
				EObject xmiidref = element3.getXmiidref();
				if (element.equals(xmiidref)) {
					setDocumentation(element3, documentation, sType);
				}
			}
		}

	}

	static public void setDocumentation(element element, String description, String sType) {
		properties properties = element.getProperties();
		if (properties == null) {
			properties = XmiFactory.eINSTANCE.createproperties();
			element.setProperties(properties);
		}
		properties.setSType(sType);
		properties.setDocumentation(description);
	}

	static public void createStereotypeProperties(element addElement, String stereotype, String sType) {
		properties createproperties = XmiFactory.eINSTANCE.createproperties();
		createproperties.setStereotype(stereotype);
		createproperties.setSType(sType);
		addElement.setProperties(createproperties);
	}

	static public void createStereotypeProperties(element addElement, List<String> stereotypes, String sType,
			String ids) {

		properties createproperties = addElement.getProperties();
		if (createproperties == null) {
			createproperties = XmiFactory.eINSTANCE.createproperties();
			createproperties.setStereotype(stereotypes.get(0));
			createproperties.setSType(sType);
			addElement.setProperties(createproperties);
		}
		xrefs xrefs = XmiFactory.eINSTANCE.createxrefs();
		addElement.setXrefs(xrefs);
		setXRefsValue(xrefs, ids, stereotypes, "element property");
	}

	static public void createStereotypeProperties(operation operation, List<String> stereotypes, String sType,
			String ids) {

		xrefs xrefs = XmiFactory.eINSTANCE.createxrefs();
		operation.setXrefs(xrefs);
		setXRefsValue(xrefs, ids, stereotypes, "operation property");
	}

	static public tag addTag(element element, String name, String value, EObject targetComponent, String id,
			String suffix) {
		tags tags = element.getTags();
		if (tags == null) {
			tags = XmiFactory.eINSTANCE.createtags();
			element.setTags(tags);
		}

		tag createtag = XmiFactory.eINSTANCE.createtag();
		tags.getTag().add(createtag);
		if (id == null) {
			id = value;
		}
		createtag.setXmiid("EAID_" + id + suffix);
		createtag.setName(name);
		createtag.setValue(value);
		createtag.setModelElement(targetComponent);
		return createtag;

	}

	static public void createPropertiesWithStereotype(element addElement, boolean isAbstract, boolean isLeaf,
			String sType, int nType, String scope, boolean isRoot, boolean isSpecification, String stereotype) {
		properties createproperties = XmiFactory.eINSTANCE.createproperties();
		createproperties.setIsAbstract(isAbstract);
		createproperties.setIsLeaf(isLeaf);
		createproperties.setSType(sType);
		createproperties.setNType(nType);
		createproperties.setScope(scope);
		createproperties.setIsRoot(isRoot);
		createproperties.setIsSpecification(isSpecification);
		createproperties.setStereotype(stereotype);
		addElement.setProperties(createproperties);
	}

	static public attributes createAttributes(element addElement) {
		attributes createattributes = XmiFactory.eINSTANCE.createattributes();
		addElement.setAttributes(createattributes);
		return createattributes;
	}

	static public attribute createAttribute(attributes attr, EObject enumLiteral, String name) {
		attribute createattribute = XmiFactory.eINSTANCE.createattribute();
		createattribute.setName(name);
		createattribute.setXmiidref(enumLiteral);
		attr.getAttribute().add(createattribute);
		return createattribute;
	}

	static public stereotype createStereotypeAttr(attribute attr, String stereoName) {
		stereotype createstereotype = XmiFactory.eINSTANCE.createstereotype();
		createstereotype.setStereotype(stereoName);
		attr.setStereotype(createstereotype);
		return createstereotype;
	}

	public static Documentation createEnterpriseArchitectDocumentation() {
		Documentation documentationObject = XmiFactory.eINSTANCE.createDocumentation();
		documentationObject.setExporter("Enterprise Architect");
		documentationObject.setExporterVersion("6.5");
		return documentationObject;
	}

	public static Extension createEnterpriseArchitectExtension(EObject object) {
		Extension extensionObject = XmiFactory.eINSTANCE.createExtension();
		extensionObject.setExtender("Enterprise Architect");
		extensionObject.setExtenderID("6.5");

		elements createelements = XmiFactory.eINSTANCE.createelements();
		extensionObject.getElements().add(createelements);

		element createelement = XmiFactory.eINSTANCE.createelement();
		createelement.setXmiidref(object);
		createelements.getElement().add(createelement);

		xrefs createxrefs = XmiFactory.eINSTANCE.createxrefs();
		createelement.setXrefs(createxrefs);
		return extensionObject;
	}

	public static constraints createConstraints(element elem) {
		constraints createconstraints = XmiFactory.eINSTANCE.createconstraints();

		elem.setConstraints(createconstraints);
		return createconstraints;
	}

	public static void addConstraint(constraints constrs, String name, String type, String weight, String status) {
		constraint createconstraint = XmiFactory.eINSTANCE.createconstraint();
		createconstraint.setName(name);
		createconstraint.setType(type);
		createconstraint.setWeight(weight);
		createconstraint.setStatus(status);

		constrs.getConstraint().add(createconstraint);

	}

	// static public void modifyIDRefAttributeName() {
	// EStructuralFeature eStructuralFeature =
	// XmiPackage.eINSTANCE.getelement().getEStructuralFeature("xmiidref");
	// if (eStructuralFeature != null) {
	// eStructuralFeature.setName("xmi:idref");
	// }
	// }

}
