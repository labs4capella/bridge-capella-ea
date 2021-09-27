/*******************************************************************************
* Copyright (c) 2021 THALES GLOBAL SERVICES.
* All right reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* Contributors:
*     Artal Technologies - initial API and implementation
*******************************************************************************/
package com.artal.capella.bridge.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellacore.ModellingArchitecture;
import org.polarsys.capella.core.data.capellacore.PropertyValueGroup;
import org.polarsys.capella.core.data.capellamodeller.ModelRoot;
import org.polarsys.capella.core.data.capellamodeller.Project;
import org.polarsys.capella.core.data.capellamodeller.SystemEngineering;
import org.polarsys.capella.core.data.cs.BlockArchitecture;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.core.data.cs.InterfacePkg;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.data.fa.ComponentFunctionalAllocation;
import org.polarsys.capella.core.data.fa.FunctionPkg;
import org.polarsys.capella.core.data.information.DataPkg;
import org.polarsys.capella.core.data.la.LogicalArchitecture;
import org.polarsys.capella.core.data.la.LogicalComponent;
import org.polarsys.capella.core.data.la.LogicalComponentPkg;
import org.polarsys.capella.core.data.la.LogicalFunctionPkg;
import org.polarsys.capella.core.data.pa.PhysicalArchitecture;
import org.polarsys.capella.core.data.pa.PhysicalComponent;

/**
 * @author Yann BINOT
 */
public class CapellaUtils {

	static public boolean isLogicalSystem(Component component) {
		if (component.eContainer() instanceof LogicalArchitecture) {
			return true;
		}
		return false;
	}

	public static boolean hasStereotype(CapellaElement ce) {
		return ce.getOwnedPropertyValueGroups().size() > 0;
	}

	public static String getSterotypeName(CapellaElement ce) {// TODO: To improve (search for a Helper?)
		for (PropertyValueGroup pvg : ce.getOwnedPropertyValueGroups()) {
			return pvg.getName().replace(".", "::");
		}
		return null;
	}

	public static List<String> getListStereotypeName(CapellaElement ce) {// TODO: To improve (search for a Helper?)
		List<String> results = new ArrayList<String>();
		for (PropertyValueGroup pvg : ce.getOwnedPropertyValueGroups()) {
			results.add(pvg.getName().replace(".", "::"));
		}
		return results;
	}

	/**
	 * Returns the logical component system root given a semantic object
	 * 
	 * @param source_p the semantic object
	 * @return the logical component root
	 */
	public static LogicalComponent getLogicalSystemRoot(EObject source_p) {
		ResourceSet resourceSet = source_p.eResource().getResourceSet();
		URI semanticResourceURI = source_p.eResource().getURI().trimFileExtension()
				.appendFileExtension("melodymodeller");
		Resource semanticResource = resourceSet.getResource(semanticResourceURI, false);
		if (semanticResource != null) {
			EObject root = semanticResource.getContents().get(0);
			if (root instanceof Project) {
				EList<ModelRoot> ownedModelRoots = ((Project) root).getOwnedModelRoots();
				for (ModelRoot modelRoot : ownedModelRoots) {
					if (modelRoot instanceof SystemEngineering) {
						EList<ModellingArchitecture> containedLogicalArchitecture = ((SystemEngineering) modelRoot)
								.getOwnedArchitectures();
						for (ModellingArchitecture arch : containedLogicalArchitecture) {
							if (arch instanceof LogicalArchitecture)
								return (LogicalComponent) ((LogicalArchitecture) arch).getSystem();
						}
					}
				}
			}
		}
		return null;
	}

	/**
	 * Returns the logical component system root given a semantic object
	 * 
	 * @param source_p the semantic object
	 * @return the logical component root
	 */
	public static PhysicalComponent getPhysicalSystemRoot(EObject source_p) {
		ResourceSet resourceSet = source_p.eResource().getResourceSet();
		URI semanticResourceURI = source_p.eResource().getURI().trimFileExtension()
				.appendFileExtension("melodymodeller");
		Resource semanticResource = resourceSet.getResource(semanticResourceURI, false);
		if (semanticResource != null) {
			EObject root = semanticResource.getContents().get(0);
			if (root instanceof Project) {
				EList<ModelRoot> ownedModelRoots = ((Project) root).getOwnedModelRoots();
				for (ModelRoot modelRoot : ownedModelRoots) {
					if (modelRoot instanceof SystemEngineering) {
						EList<ModellingArchitecture> containedLogicalArchitecture = ((SystemEngineering) modelRoot)
								.getOwnedArchitectures();
						for (ModellingArchitecture arch : containedLogicalArchitecture) {
							if (arch instanceof PhysicalArchitecture)
								return (PhysicalComponent) ((PhysicalArchitecture) arch).getSystem();
						}
					}
				}
			}
		}
		return null;
	}

	/**
	 * Returns the logical component system root given a semantic object
	 * 
	 * @param source_p the semantic object
	 * @return the logical component root
	 */
	public static LogicalComponentPkg getLogicalComponentPkg(EObject source_p) {
		ResourceSet resourceSet = source_p.eResource().getResourceSet();
		URI semanticResourceURI = source_p.eResource().getURI().trimFileExtension()
				.appendFileExtension("melodymodeller");
		Resource semanticResource = resourceSet.getResource(semanticResourceURI, false);
		if (semanticResource != null) {
			EObject root = semanticResource.getContents().get(0);
			if (root instanceof Project) {
				EList<ModelRoot> ownedModelRoots = ((Project) root).getOwnedModelRoots();
				for (ModelRoot modelRoot : ownedModelRoots) {
					if (modelRoot instanceof SystemEngineering) {
						EList<ModellingArchitecture> containedLogicalArchitecture = ((SystemEngineering) modelRoot)
								.getOwnedArchitectures();
						for (ModellingArchitecture arch : containedLogicalArchitecture) {
							if (arch instanceof LogicalArchitecture)
								return ((LogicalArchitecture) arch).getOwnedLogicalComponentPkg();
						}
					}
				}
			}
		}
		return null;
	}

//	/**
//	 * Returns the logical component system root given a semantic object
//	 * 
//	 * @param source_p
//	 *            the semantic object
//	 * @return the logical component root
//	 */
//	public static PhysicalActorPkg getPhysicalActorPkg(EObject source_p) {
//		ResourceSet resourceSet = source_p.eResource().getResourceSet();
//		URI semanticResourceURI = source_p.eResource().getURI().trimFileExtension()
//				.appendFileExtension("melodymodeller");
//		Resource semanticResource = resourceSet.getResource(semanticResourceURI, false);
//		if (semanticResource != null) {
//			EObject root = semanticResource.getContents().get(0);
//			if (root instanceof Project) {
//				EList<ModelRoot> ownedModelRoots = ((Project) root).getOwnedModelRoots();
//				for (ModelRoot modelRoot : ownedModelRoots) {
//					if (modelRoot instanceof SystemEngineering) {
//						EList<ModellingArchitecture> containedLogicalArchitecture = ((SystemEngineering) modelRoot)
//								.getOwnedArchitectures();
//						for (ModellingArchitecture arch : containedLogicalArchitecture) {
//							if (arch instanceof PhysicalArchitecture)
//								return ((PhysicalArchitecture) arch).getOwnedPhysicalActorPkg();
//						}
//					}
//				}
//			}
//		}
//		return null;
//	}

	/**
	 * Returns the logical architecture system root given a semantic object
	 * 
	 * @param source_p the semantic object
	 * @return the logical component root
	 */
	public static LogicalArchitecture getLogicalArchitecture(EObject source_p) {
		ResourceSet resourceSet = source_p.eResource().getResourceSet();
		URI semanticResourceURI = source_p.eResource().getURI().trimFileExtension()
				.appendFileExtension("melodymodeller");
		Resource semanticResource = resourceSet.getResource(semanticResourceURI, false);
		if (semanticResource != null) {
			EObject root = semanticResource.getContents().get(0);
			if (root instanceof Project) {
				EList<ModelRoot> ownedModelRoots = ((Project) root).getOwnedModelRoots();
				for (ModelRoot modelRoot : ownedModelRoots) {
					if (modelRoot instanceof SystemEngineering) {
						EList<ModellingArchitecture> containedLogicalArchitecture = ((SystemEngineering) modelRoot)
								.getOwnedArchitectures();
						for (ModellingArchitecture arch : containedLogicalArchitecture) {
							if (arch instanceof LogicalArchitecture)
								return ((LogicalArchitecture) arch);
						}
					}
				}
			}
		}
		return null;
	}

	/**
	 * Returns the logical architecture system root given a semantic object
	 * 
	 * @param source_p the semantic object
	 * @return the logical component root
	 */
	public static PhysicalArchitecture getPhysicalArchitecture(EObject source_p) {
		ResourceSet resourceSet = source_p.eResource().getResourceSet();
		URI semanticResourceURI = source_p.eResource().getURI().trimFileExtension()
				.appendFileExtension("melodymodeller");
		Resource semanticResource = resourceSet.getResource(semanticResourceURI, false);
		if (semanticResource != null) {
			EObject root = semanticResource.getContents().get(0);
			if (root instanceof Project) {
				EList<ModelRoot> ownedModelRoots = ((Project) root).getOwnedModelRoots();
				for (ModelRoot modelRoot : ownedModelRoots) {
					if (modelRoot instanceof SystemEngineering) {
						EList<ModellingArchitecture> containedLogicalArchitecture = ((SystemEngineering) modelRoot)
								.getOwnedArchitectures();
						for (ModellingArchitecture arch : containedLogicalArchitecture) {
							if (arch instanceof PhysicalArchitecture)
								return ((PhysicalArchitecture) arch);
						}
					}
				}
			}
		}
		return null;
	}

	/**
	 * Returns the interface package given a semantic object
	 * 
	 * @param source_p the semantic object
	 * @return the data pkg root
	 */
	public static InterfacePkg getInterfacePkgRoot(EObject source_p, Class<?> clazz) {
		ResourceSet resourceSet = source_p.eResource().getResourceSet();
		URI semanticResourceURI = source_p.eResource().getURI().trimFileExtension()
				.appendFileExtension("melodymodeller");
		Resource semanticResource = resourceSet.getResource(semanticResourceURI, false);
		if (semanticResource != null) {
			EObject root = semanticResource.getContents().get(0);
			if (root instanceof Project) {
				EList<ModelRoot> ownedModelRoots = ((Project) root).getOwnedModelRoots();
				for (ModelRoot modelRoot : ownedModelRoots) {
					if (modelRoot instanceof SystemEngineering) {
						EList<ModellingArchitecture> containedLogicalArchitecture = ((SystemEngineering) modelRoot)
								.getOwnedArchitectures();
						for (ModellingArchitecture arch : containedLogicalArchitecture) {
							if (/* arch instanceof LogicalArchitecture */clazz.isInstance(arch))
								return ((BlockArchitecture) arch).getOwnedInterfacePkg();
						}
					}
				}
			}
		}
		return null;
	}

	/**
	 * Returns the data package given a semantic object
	 * 
	 * @param source_p the semantic object
	 * @return the data pkg root
	 */
	public static DataPkg getDataPkgRoot(EObject source_p, Class<?> clazz) {
		ResourceSet resourceSet = source_p.eResource().getResourceSet();
		URI semanticResourceURI = source_p.eResource().getURI().trimFileExtension()
				.appendFileExtension("melodymodeller");
		Resource semanticResource = resourceSet.getResource(semanticResourceURI, false);
		if (semanticResource != null) {
			EObject root = semanticResource.getContents().get(0);
			if (root instanceof Project) {
				EList<ModelRoot> ownedModelRoots = ((Project) root).getOwnedModelRoots();
				for (ModelRoot modelRoot : ownedModelRoots) {
					if (modelRoot instanceof SystemEngineering) {
						EList<ModellingArchitecture> containedLogicalArchitecture = ((SystemEngineering) modelRoot)
								.getOwnedArchitectures();
						for (ModellingArchitecture arch : containedLogicalArchitecture) {
							if (clazz.isInstance(arch))
								return ((BlockArchitecture) arch).getOwnedDataPkg();
						}
					}
				}
			}
		}
		return null;
	}

	/**
	 * Returns the logical function package of a Capella model
	 * 
	 * @param source_p a (non-null) Capella semantic object
	 * @return the physical function package.
	 */
	public static LogicalFunctionPkg getLogicalFunctionPackage(EObject source_p) {
		ResourceSet resourceSet = source_p.eResource().getResourceSet();
		URI semanticResourceURI = source_p.eResource().getURI().trimFileExtension()
				.appendFileExtension("melodymodeller");
		Resource semanticResource = resourceSet.getResource(semanticResourceURI, false);
		LogicalFunctionPkg logicalFunctionPkgTmp = null;
		if (semanticResource != null) {
			EObject root = semanticResource.getContents().get(0);
			if (root instanceof Project) {
				EList<ModelRoot> ownedModelRoots = ((Project) root).getOwnedModelRoots();
				for (ModelRoot modelRoot : ownedModelRoots) {
					if (modelRoot instanceof SystemEngineering) {
						EList<ModellingArchitecture> containedPhysicalArchitectures = ((SystemEngineering) modelRoot)
								.getOwnedArchitectures();
						for (ModellingArchitecture arch : containedPhysicalArchitectures) {
							if (arch instanceof LogicalArchitecture) {
								FunctionPkg ownedFunctionPkg = ((LogicalArchitecture) arch).getOwnedFunctionPkg();
								if (ownedFunctionPkg instanceof LogicalFunctionPkg) {
									logicalFunctionPkgTmp = (LogicalFunctionPkg) ownedFunctionPkg;
									break;
								}
							}
						}
					}
				}
			}
		}
		return logicalFunctionPkgTmp;
	}

	static public Component getInverseComponent(AbstractFunction function) {
		Collection<Setting> referencingInverse = getReferencingInverse(function);
		for (Setting setting : referencingInverse) {
			EObject eObject = setting.getEObject();
			if (eObject instanceof Component) {
				return (Component) eObject;
			}
			if (eObject instanceof ComponentFunctionalAllocation) {
				return (Component) ((ComponentFunctionalAllocation) eObject).getSourceElement();
			}
		}
		return null;
	}

	static public Part getInversePart(Component component) {
		Collection<Setting> referencingInverse = getReferencingInverse(component);
		for (Setting setting : referencingInverse) {
			EObject eObject = setting.getEObject();
			if (eObject instanceof Part) {
				return (Part) eObject;
			}
		}
		return null;
	}

	static public Collection<Setting> getReferencingInverse(EObject referenceTarget) {
		Resource res = referenceTarget.eResource();
		ResourceSet rs = res.getResourceSet();
		ECrossReferenceAdapter crossReferencer = null;
		List<Adapter> adapters = rs.eAdapters();
		for (Adapter adapter : adapters) {
			if (adapter instanceof ECrossReferenceAdapter) {
				crossReferencer = (ECrossReferenceAdapter) adapter;
				break;
			}
		}
		if (crossReferencer == null) {
			crossReferencer = new ECrossReferenceAdapter();
			rs.eAdapters().add(crossReferencer);
		}
		Collection<Setting> referencers = crossReferencer.getInverseReferences(referenceTarget, true);

		return referencers;

	}

}
