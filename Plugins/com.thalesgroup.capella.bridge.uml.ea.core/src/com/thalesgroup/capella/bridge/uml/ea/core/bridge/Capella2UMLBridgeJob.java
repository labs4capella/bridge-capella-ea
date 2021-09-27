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

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.XMLSave.XMLTypeInfo;
import org.eclipse.emf.ecore.xmi.impl.XMIHelperImpl;
import org.eclipse.emf.ecore.xmi.impl.XMISaveImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import com.artal.capella.bridge.core.mix.AbstractMappingAlgoMix;
import com.artal.capella.bridge.core.uml.UMLBridgeJob;
import com.thalesgroup.capella.bridge.uml.ea.model.xmi.XmiPackage;

/**
 * @author Yann BINOT
 *
 */
public class Capella2UMLBridgeJob extends UMLBridgeJob<Project> {

	public Capella2UMLBridgeJob(String jobName_p, Project sourceDataSet_p, URI targetURI_p,
			AbstractMappingAlgoMix<?, ?, ?> mix) {
		super(sourceDataSet_p, targetURI_p, new Capella2UMLAlgo(mix));
	}

	public void setTargetParentFolder(String folder) {

	}

	@Override
	protected Resource getCreateTraceResource(URI uri_p) {
		return super.getCreateTargetResource(uri_p);
	}

	/**
	 * @param saveOptions
	 */
	public void addOptions(final Map<Object, Object> saveOptions) {
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		saveOptions.put(XMIResource.OPTION_USE_XMI_TYPE, Boolean.TRUE);
		saveOptions.put(XMIResource.OPTION_SAVE_TYPE_INFORMATION, new XMLTypeInfo() {
			public boolean shouldSaveType(EClass objectType, EClassifier featureType, EStructuralFeature feature) {

				Set<String> stereoNames = ((Capella2UMLAlgo) getAlgo()).getStereoNames();
				if (feature.getName().equals("provided") || feature.getName().equals("required")
						|| stereoNames.contains(feature.getName())) {
					return false;
				}
				return objectType != XMLTypePackage.eINSTANCE.getAnyType();
			}

			public boolean shouldSaveType(EClass objectType, EClass featureType, EStructuralFeature feature) {
				return true;
			}

		});
		saveOptions.put(XMIResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
		saveOptions.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.FALSE);

		final ExtendedMetaData ext = new BasicExtendedMetaData(ExtendedMetaData.ANNOTATION_URI,
				EPackage.Registry.INSTANCE, new HashMap<>());
		ext.setQualified(UMLPackage.eINSTANCE, true);
		ext.setFeatureKind(UMLPackage.eINSTANCE.getTypedElement_Type(), ExtendedMetaData.ELEMENT_FEATURE);
		saveOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, ext);

	}

	/**
	 * @return
	 */
	public String getXMIVersion() {
		return XMIResource.VERSION_2_1_VALUE;
	}

	protected XMLHelper createOwnedXMLHelper(XMIResource resource) {
		return new XMIHelperImpl(resource);
	}

	@Override
	public XMLSave createOwnXMLSave(XMLHelper xmlHelper) {
		// TODO Auto-generated method stub
		return new XMISaveImpl(xmlHelper) {

			@Override
			public void addNamespaceDeclarations() {

				super.addNamespaceDeclarations();
				List<Profile> stereotypes = ((Capella2UMLAlgo) getAlgo()).getProfiles();
				for (Profile stereotype : stereotypes) {
					// ((Element)currentNode).setAttributeNS(ExtendedMetaData.XMLNS_URI,
					// "xmlns:"+stereotype.getName(), "http://"+stereotype.getName());
					String name = stereotype.getName().replace("?", "").replace(" ", "");
					doc.addAttribute("xmlns:" + name, "http://" + name);
				}
			}

			@Override
			protected void saveElementReferenceSingle(EObject o, EStructuralFeature f) {
				// TODO Auto-generated method stub

				if (o instanceof Property || o instanceof Parameter) {
					if (f.getName().equals("type")) {
						// super.saveElementReferenceSingle(o, f);

						EObject remote = (EObject) helper.getValue(o, f);
						if (remote != null) {
							String href = helper.getHREF(remote);
							if (href != null) {
								href = convertURI(href);
								EClass eClass = remote.eClass();
								EClass expectedType = (EClass) f.getEType();
								boolean shouldSaveType = saveTypeInfo
										? xmlTypeInfo.shouldSaveType(eClass, expectedType, f)
										: eClass != expectedType && (expectedType.isAbstract()
												|| f.getEGenericType().getETypeParameter() != null);
								if (elementHandler != null && shouldSaveType) {
									EStructuralFeature substitutionGroup = featureTable.getSubstitutionGroup(f, eClass);
									if (substitutionGroup != null) {
										f = substitutionGroup;
										shouldSaveType = substitutionGroup.getEType() != eClass;
									}
								}
								if (!toDOM) {
									doc.startElement(helper.getQName(f));
								} else {
									helper.populateNameInfo(nameInfo, f);
									Element elem = document.createElementNS(nameInfo.getNamespaceURI(),
											nameInfo.getQualifiedName());
									Node text = document.createTextNode(href);
									elem.appendChild(text);
									currentNode = currentNode.appendChild(elem);
									handler.recordValues(elem, remote.eContainer(), f, remote);
									handler.recordValues(text, remote.eContainer(), f, remote);
								}
								if (shouldSaveType) {
									// saveTypeAttribute(eClass);

								}
								if (!toDOM) {
									// doc.add(" xmi:idref=\"" + href.replace("#", "") + "\"");
									doc.addAttribute("xmi:idref", href.replace("#", ""));
									doc.endContentElement("");
								} else {
									currentNode = currentNode.getParentNode();
								}
							}
						}

						// String href = xmlHelper.getHREF(o);
						// doc.add(">");
						// doc.addLine();
						// doc.add("<type xmi:idref=" + href + "/>");
						// doc.addLine();
						// doc.add("</ownedAttribute>");
					}
				} else {

					super.saveElementReferenceSingle(o, f);
				}
			}

			@Override
			protected void saveTypeAttribute(EClass eClass) {
				if (xmiType) {
					if (!toDOM) {
						doc.addAttribute(XMI_TYPE_NS, helper.getQName(eClass));
					} else {
						((Element) currentNode).setAttributeNS(xmiURI, XMI_TYPE_NS, helper.getQName(eClass));
					}
				} else {
					super.saveTypeAttribute(eClass);
				}
			}

			protected boolean saveFeatures(EObject o, boolean attributesOnly) {
				EClass eClass = o.eClass();
				int contentKind = extendedMetaData == null ? ExtendedMetaData.UNSPECIFIED_CONTENT
						: extendedMetaData.getContentKind(eClass);
				if (!toDOM) {
					switch (contentKind) {
					case ExtendedMetaData.MIXED_CONTENT:
					case ExtendedMetaData.SIMPLE_CONTENT: {
						doc.setMixed(true);
						break;
					}
					}
				}

				if (o == root) {
					writeTopAttributes(root);
				}

				EStructuralFeature[] features = featureTable.getFeatures(eClass);
				int[] featureKinds = featureTable.getKinds(eClass, features);
				int[] elementFeatures = null;
				int elementCount = 0;

				String content = null;

				// Process XML attributes
				LOOP: for (int i = 0; i < features.length; i++) {
					int kind = featureKinds[i];
					EStructuralFeature f = features[i];
					boolean b = kind != TRANSIENT && shouldSaveFeature(o, f);
					if (o instanceof Connector && f.getName().equalsIgnoreCase("kind") && b == false) {
						b = true;
						kind = DATATYPE_SINGLE;
					}
					if (b) {
						if (f.equals(UMLPackage.eINSTANCE.getTypedElement_Type())) {
							if (o.eContainer() instanceof Operation) {
								kind = OBJECT_ATTRIBUTE_IDREF_SINGLE;
							}
						}
						switch (kind) {
						case DATATYPE_ELEMENT_SINGLE: {
							if (contentKind == ExtendedMetaData.SIMPLE_CONTENT) {
								content = getDataTypeElementSingleSimple(o, f);
								continue LOOP;
							}
							break;
						}
						case DATATYPE_SINGLE: {
							saveDataTypeSingle(o, f);
							continue LOOP;
						}
						case DATATYPE_SINGLE_NILLABLE: {
							if (!isNil(o, f)) {
								saveDataTypeSingle(o, f);
								continue LOOP;
							}
							break;
						}
						case OBJECT_ATTRIBUTE_SINGLE: {
							saveEObjectSingle(o, f);
							continue LOOP;
						}
						case OBJECT_ATTRIBUTE_MANY: {
							saveEObjectMany(o, f);
							continue LOOP;
						}
						case OBJECT_ATTRIBUTE_IDREF_SINGLE: {
							saveIDRefSingle(o, f);
							continue LOOP;
						}
						case OBJECT_ATTRIBUTE_IDREF_MANY: {
							saveIDRefMany(o, f);
							continue LOOP;
						}
						case OBJECT_HREF_SINGLE_UNSETTABLE: {
							if (isNil(o, f)) {
								break;
							}
							// it's intentional to keep going
						}
						case OBJECT_HREF_SINGLE: {
							if (useEncodedAttributeStyle) {
								saveEObjectSingle(o, f);
								continue LOOP;
							} else {
								switch (sameDocSingle(o, f)) {
								case SAME_DOC: {
									saveIDRefSingle(o, f);
									continue LOOP;
								}
								case CROSS_DOC: {
									break;
								}
								default: {
									continue LOOP;
								}
								}
							}
							break;
						}
						case OBJECT_HREF_MANY_UNSETTABLE: {
							if (isEmpty(o, f)) {
								saveManyEmpty(o, f);
								continue LOOP;
							}
							// It's intentional to keep going.
						}
						case OBJECT_HREF_MANY: {
							if (useEncodedAttributeStyle) {
								saveEObjectMany(o, f);
								continue LOOP;
							} else {
								switch (sameDocMany(o, f)) {
								case SAME_DOC: {
									saveIDRefMany(o, f);
									continue LOOP;
								}
								case CROSS_DOC: {
									break;
								}
								default: {
									continue LOOP;
								}
								}
							}
							break;
						}
						case OBJECT_ELEMENT_SINGLE_UNSETTABLE:
						case OBJECT_ELEMENT_SINGLE: {
							if (contentKind == ExtendedMetaData.SIMPLE_CONTENT) {
								content = getElementReferenceSingleSimple(o, f);
								continue LOOP;
							}
							break;
						}
						case OBJECT_ELEMENT_MANY: {
							if (contentKind == ExtendedMetaData.SIMPLE_CONTENT) {
								content = getElementReferenceManySimple(o, f);
								continue LOOP;
							}
							break;
						}
						case OBJECT_ELEMENT_IDREF_SINGLE_UNSETTABLE:
						case OBJECT_ELEMENT_IDREF_SINGLE: {
							if (contentKind == ExtendedMetaData.SIMPLE_CONTENT) {
								content = getElementIDRefSingleSimple(o, f);
								continue LOOP;
							}
							break;
						}
						case OBJECT_ELEMENT_IDREF_MANY: {
							if (contentKind == ExtendedMetaData.SIMPLE_CONTENT) {
								content = getElementIDRefManySimple(o, f);
								continue LOOP;
							}
							break;
						}
						case DATATYPE_ATTRIBUTE_MANY: {
							break;
						}
						case OBJECT_CONTAIN_MANY_UNSETTABLE:
						case DATATYPE_MANY: {
							if (isEmpty(o, f)) {
								saveManyEmpty(o, f);
								continue LOOP;
							}
							break;
						}
						case OBJECT_CONTAIN_SINGLE_UNSETTABLE:
						case OBJECT_CONTAIN_SINGLE:
						case OBJECT_CONTAIN_MANY:
						case ELEMENT_FEATURE_MAP: {
							break;
						}
						case ATTRIBUTE_FEATURE_MAP: {
							saveAttributeFeatureMap(o, f);
							continue LOOP;
						}
						default: {
							continue LOOP;
						}
						}

						if (attributesOnly) {
							continue LOOP;
						}

						// We only get here if we should do this.
						//
						if (elementFeatures == null) {
							elementFeatures = new int[features.length];
						}
						elementFeatures[elementCount++] = i;
					}
				}

				processAttributeExtensions(o);

				if (elementFeatures == null) {
					if (content == null) {
						content = getContent(o, features);
					}

					if (content == null) {
						if (o == root && writeTopElements(root)) {
							endSaveFeatures(o, 0, null);
							return true;
						} else {
							endSaveFeatures(o, EMPTY_ELEMENT, null);
							return false;
						}
					} else {
						endSaveFeatures(o, CONTENT_ELEMENT, content);
						return true;
					}
				}

				if (o == root) {
					writeTopElements(root);
				}

				// Process XML elements
				for (int i = 0; i < elementCount; i++) {
					int kind = featureKinds[elementFeatures[i]];
					EStructuralFeature f = features[elementFeatures[i]];
					switch (kind) {
					case DATATYPE_SINGLE_NILLABLE: {
						saveNil(o, f);
						break;
					}
					case ELEMENT_FEATURE_MAP: {
						saveElementFeatureMap(o, f);
						break;
					}
					case DATATYPE_MANY: {
						saveDataTypeMany(o, f);
						break;
					}
					case DATATYPE_ATTRIBUTE_MANY: {
						saveDataTypeAttributeMany(o, f);
						break;
					}
					case DATATYPE_ELEMENT_SINGLE: {
						saveDataTypeElementSingle(o, f);
						break;
					}
					case OBJECT_CONTAIN_SINGLE_UNSETTABLE: {
						if (isNil(o, f)) {
							saveNil(o, f);
							break;
						}
						// it's intentional to keep going
					}
					case OBJECT_CONTAIN_SINGLE: {
						saveContainedSingle(o, f);
						break;
					}
					case OBJECT_CONTAIN_MANY_UNSETTABLE:
					case OBJECT_CONTAIN_MANY: {
						saveContainedMany(o, f);
						break;
					}
					case OBJECT_HREF_SINGLE_UNSETTABLE: {
						if (isNil(o, f)) {
							saveNil(o, f);
							break;
						}
						// it's intentional to keep going
					}
					case OBJECT_HREF_SINGLE: {
						saveHRefSingle(o, f);
						break;
					}
					case OBJECT_HREF_MANY_UNSETTABLE:
					case OBJECT_HREF_MANY: {
						saveHRefMany(o, f);
						break;
					}
					case OBJECT_ELEMENT_SINGLE_UNSETTABLE: {
						if (isNil(o, f)) {
							saveNil(o, f);
							break;
						}
						// it's intentional to keep going
					}
					case OBJECT_ELEMENT_SINGLE: {
						saveElementReferenceSingle(o, f);
						break;
					}
					case OBJECT_ELEMENT_MANY: {
						saveElementReferenceMany(o, f);
						break;
					}
					case OBJECT_ELEMENT_IDREF_SINGLE_UNSETTABLE: {
						if (isNil(o, f)) {
							saveNil(o, f);
							break;
						}
						// it's intentional to keep going
					}
					case OBJECT_ELEMENT_IDREF_SINGLE: {
						saveElementIDRefSingle(o, f);
						break;
					}
					case OBJECT_ELEMENT_IDREF_MANY: {
						saveElementIDRefMany(o, f);
						break;
					}
					}
				}
				endSaveFeatures(o, 0, null);
				return true;
			}

			protected String getDatatypeValue(Object value, EStructuralFeature f, boolean isAttribute) {
				if (value == null) {
					return null;
				}
				EDataType d = (EDataType) f.getEType();
				EPackage ePackage = d.getEPackage();
				EFactory fac = ePackage.getEFactoryInstance();
				String svalue = helper.convertToString(fac, d, value);

				if (escape != null) {
					if (f.equals(XmiPackage.Literals.XREFS__VALUE)) {
						return svalue;
					}

					if (isAttribute) {
						svalue = escape.convert(svalue);
					} else {
						svalue = escape.convertText(svalue);
					}
				}
				return svalue;
			}

		};

	}

	/**
	 * @return
	 */
	public String getEncoding() {
		return "windows-1252";
	}

}
