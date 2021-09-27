/*******************************************************************************
* Copyright (c) 2021 THALES GLOBAL SERVICES.
* All right reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* Contributors:
*     Artal Technologies - initial API and implementation
*******************************************************************************/
package com.thalesgroup.capella.bridge.uml.ea.core.profiles;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * @author Yann BINOT
 *
 */
public class ExportUMLProfile {

	private List<Profile> _profiles;

	private String _outputPath;

	public static String TAG_MDG_Technology = "MDG.Technology";
	public static String TAG_Documentation = "Documentation";
	public static String TAG_UMLProfiles = "UMLProfiles";
	public static String TAG_UMLProfile = "UMLProfile";
	public static String TAG_Content = "Content";
	public static String TAG_Stereotypes = "Stereotypes";
	public static String TAG_Stereotype = "Stereotype";
	public static String TAG_AppliesTo = "AppliesTo";
	public static String TAG_Apply = "Apply";
	public static String TAG_TaggedValues = "TaggedValues";
	public static String TAG_Tag = "Tag";
	public static String TAG_TaggedValueTypes = "TaggedValueTypes";
	public static String TAG_ViewDefinitions = "ViewDefinitions";
	public static String TAG_Metamodel = "Metamodel";
	public static String TAG_RefData = "RefData";

	/**
	 * @param profiles
	 * 
	 */
	public ExportUMLProfile(List<Profile> profiles, String outputPath) {
		_profiles = profiles;
		_outputPath = outputPath;
	}

	private Element createMDGTechnology(Document doc, String version) {
		Element mdgTeck = doc.createElement(TAG_MDG_Technology);
		Attr versionAttr = doc.createAttribute("version");
		versionAttr.setValue(version);
		mdgTeck.setAttributeNode(versionAttr);
		return mdgTeck;
	}

	private Element createProfiles(Document doc) {
		Element profiles = doc.createElement(TAG_UMLProfiles);
		return profiles;
	}

	private Element createProfile(Document doc) {
		Element profil = doc.createElement(TAG_UMLProfile);
		Attr profileTypeAttr = doc.createAttribute("profiletype");
		profileTypeAttr.setValue("uml2");
		return profil;
	}

	private Element createDocumentation(Document doc, String id, String name, String version, String notes) {
		Element element = doc.createElement(TAG_Documentation);
		Attr idAttr = doc.createAttribute("id");
		idAttr.setValue(id);
		element.setAttributeNode(idAttr);
		Attr nameAttr = doc.createAttribute("name");
		nameAttr.setValue(name);
		element.setAttributeNode(nameAttr);
		Attr versionAttr = doc.createAttribute("version");
		versionAttr.setValue(version);
		element.setAttributeNode(versionAttr);
		Attr notesAttr = doc.createAttribute("notes");
		notesAttr.setValue(notes);
		element.setAttributeNode(notesAttr);
		return element;
	}

	private Element createContent(Document doc) {
		Element element = doc.createElement(TAG_Content);

		return element;
	}

	private Element createStereotypes(Document doc) {
		Element element = doc.createElement(TAG_Stereotypes);

		return element;
	}

	private Element createStereotype(Document doc, String name, String notes) {
		Element element = doc.createElement(TAG_Stereotype);
		Attr nameAttr = doc.createAttribute("name");
		nameAttr.setValue(name);
		element.setAttributeNode(nameAttr);
		Attr notesAttr = doc.createAttribute("notes");
		notesAttr.setValue(notes);
		element.setAttributeNode(notesAttr);
		return element;
	}

	private Element createAppliesTo(Document doc) {
		Element element = doc.createElement(TAG_AppliesTo);

		return element;
	}

	private Element createApply(Document doc, String type) {
		Element element = doc.createElement(TAG_Apply);
		Attr typeAttr = doc.createAttribute("type");
		typeAttr.setValue(type);
		element.setAttributeNode(typeAttr);
		return element;
	}

	private Element createTaggedValue(Document doc) {
		Element element = doc.createElement(TAG_TaggedValues);

		return element;
	}

	private Element createTag(Document doc, String name, String type, String description, String unit, String values,
			String defaut) {
		Element element = doc.createElement(TAG_Tag);
		Attr nameAttr = doc.createAttribute("name");
		nameAttr.setValue(name);
		element.setAttributeNode(nameAttr);
		Attr typeAttr = doc.createAttribute("type");
		typeAttr.setValue(type);
		element.setAttributeNode(typeAttr);
		Attr descriptionAttr = doc.createAttribute("description");
		descriptionAttr.setValue(description);
		element.setAttributeNode(descriptionAttr);
		Attr unitAttr = doc.createAttribute("unit");
		unitAttr.setValue(unit);
		element.setAttributeNode(unitAttr);
		Attr valuesAttr = doc.createAttribute("values");
		valuesAttr.setValue(values);
		element.setAttributeNode(valuesAttr);
		Attr defaultAttr = doc.createAttribute("default");
		defaultAttr.setValue(defaut);
		element.setAttributeNode(defaultAttr);

		return element;
	}

	private Element createTaggedValueType(Document doc) {
		Element element = doc.createElement(TAG_TaggedValueTypes);

		return element;
	}

	private Element createViewDefinitions(Document doc) {
		Element element = doc.createElement(TAG_ViewDefinitions);

		return element;
	}

	private Element createMetamodel(Document doc) {
		Element element = doc.createElement(TAG_Metamodel);

		return element;
	}

	private Element createRefData(Document doc) {
		Element element = doc.createElement(TAG_RefData);
		Attr versionAttr = doc.createAttribute("version");
		versionAttr.setValue("1.0");
		element.setAttributeNode(versionAttr);
		Attr exporterAttr = doc.createAttribute("exporter");
		exporterAttr.setValue("EA.25");
		element.setAttributeNode(exporterAttr);
		return element;
	}

	public void export() {
		Document document = null;
		DocumentBuilderFactory fabrique = null;

		try {
			fabrique = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = fabrique.newDocumentBuilder();
			document = builder.newDocument();
			Element racine = createMDGTechnology(document, "1.0");
			document.appendChild(racine);

			Date date = new Date();
			SimpleDateFormat formatVersion = new SimpleDateFormat("yyyyMMddhhmm");
			String version = formatVersion.format(date);

			SimpleDateFormat formatNotes = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
			String notes = "This MDG technologies provides the following profiles:(";
			for (Profile profile : _profiles) {
				notes += profile.getName() + " ; ";
			}
			notes += "). These profiles are generated from Capella. Generation date: " + formatNotes.format(date);

			Element mainDocumentation = createDocumentation(document, "MDG_Capella", "CapellaProfile", version, notes);
			racine.appendChild(mainDocumentation);

			createProfiles(document, racine);

			Element taggedValueType = createTaggedValueType(document);
			racine.appendChild(taggedValueType);

			Element refDElement = createRefData(document);
			taggedValueType.appendChild(refDElement);

			final TransformerFactory transformerFactory = TransformerFactory.newInstance();
			final Transformer transformer = transformerFactory.newTransformer();
			final DOMSource source = new DOMSource(document);

			final StreamResult sortie = new StreamResult(
					new File(_outputPath + "\\MDG_CapellaProfile_" + version + ".xml"));
			// final StreamResult result = new StreamResult(System.out);
			transformer.setOutputProperty(OutputKeys.VERSION, "1.0");
			transformer.setOutputProperty(OutputKeys.ENCODING, "windows-1252");

			// formatage
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

			// sortie
			transformer.transform(source, sortie);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param document
	 * @param racine
	 */
	public void createProfiles(Document document, Element racine) {
		Element profiles = createProfiles(document);
		racine.appendChild(profiles);
		for (Profile profile : _profiles) {
			Element profileElement = createProfile(document);
			profiles.appendChild(profileElement);

			Element docum = createDocumentation(document, profile.getName(), profile.getName(), "1.0", "");
			profileElement.appendChild(docum);

			Element content = createContent(document);
			profileElement.appendChild(content);

			createStereoTypes(document, profile, content);

			Element taggedValueType = createTaggedValueType(document);
			content.appendChild(taggedValueType);

			Element viewDefinitions = createViewDefinitions(document);
			content.appendChild(viewDefinitions);

			Element metaModel = createMetamodel(document);
			content.appendChild(metaModel);

		}
	}

	/**
	 * @param document
	 * @param profile
	 * @param content
	 */
	public void createStereoTypes(Document document, Profile profile, Element content) {
		Element stereotypesElem = createStereotypes(document);
		content.appendChild(stereotypesElem);

		EList<Stereotype> ownedStereotypes = profile.getOwnedStereotypes();
		for (Stereotype stereotype : ownedStereotypes) {
			Element stereotypeElem = createStereotype(document, stereotype.getName(), "");
			stereotypesElem.appendChild(stereotypeElem);

			createApplies(document, stereotype, stereotypeElem);

			createTags(document, stereotype, stereotypeElem);

		}
	}

	/**
	 * @param document
	 * @param stereotypeElem
	 */
	public void createApplies(Document document, Stereotype stereotype, Element stereotypeElem) {
		Element appliesToElem = createAppliesTo(document);
		stereotypeElem.appendChild(appliesToElem);

		EList<Property> ownedAttributes = stereotype.getOwnedAttributes();
		for (Property property : ownedAttributes) {
			Association association = property.getAssociation();
			if (association == null || !(association instanceof Extension)) {
				continue;
			}
			Type type = property.getType();
			if (type == null) {
				continue;
			}
			String canonicalName = type.getName();
			Element applyElem = createApply(document, canonicalName);
			appliesToElem.appendChild(applyElem);
		}

	}

	/**
	 * @param document
	 * @param stereotype
	 * @param stereotypeElem
	 */
	public void createTags(Document document, Stereotype stereotype, Element stereotypeElem) {
		Element taggedValueElem = createTaggedValue(document);
		stereotypeElem.appendChild(taggedValueElem);

		EList<Property> ownedAttributes = stereotype.getOwnedAttributes();
		for (Property property : ownedAttributes) {
			Association association = property.getAssociation();
			if (association != null && association instanceof Extension) {
				continue;
			}
			Element tagElem = createTag(document, property.getName(), "string", "", "", "", "");
			taggedValueElem.appendChild(tagElem);
		}
	}
}
