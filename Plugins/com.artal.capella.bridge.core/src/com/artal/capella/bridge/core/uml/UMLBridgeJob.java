/*******************************************************************************
* Copyright (c) 2021 THALES GLOBAL SERVICES.
* All right reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* Contributors:
*     Artal Technologies - initial API and implementation
*******************************************************************************/
package com.artal.capella.bridge.core.uml;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.diffmerge.api.scopes.IEditableModelScope;
import org.eclipse.emf.diffmerge.bridge.api.IBridgeTrace.Editable;
import org.eclipse.emf.diffmerge.bridge.api.incremental.IIncrementalBridgeExecution;
import org.eclipse.emf.diffmerge.bridge.interactive.BridgeJob;
import org.eclipse.emf.diffmerge.bridge.interactive.EMFInteractiveBridge;
import org.eclipse.emf.diffmerge.bridge.interactive.Messages;
import org.eclipse.emf.diffmerge.bridge.interactive.util.ResourceUtil;
import org.eclipse.emf.diffmerge.bridge.traces.gen.bridgetraces.impl.TraceImpl;
import org.eclipse.emf.diffmerge.bridge.uml.incremental.UMLMergePolicy;
import org.eclipse.emf.diffmerge.gmf.GMFDiffPolicy;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.EMOFResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIHelperImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMISaveImpl;
import org.eclipse.ui.progress.IProgressConstants;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;

import com.artal.capella.bridge.core.CapellaBridgeAlgo;
import com.artal.capella.bridge.core.cheat.TraceCheat;

/**
 * @author Yann BINOT
 *
 */
public class UMLBridgeJob<SD> extends BridgeJob<SD> {

	UMLBridgeAlgo<SD> _algo;

	UMLBridge<SD, IEditableModelScope> _mappingBridge;

	/**
	 * Constructor
	 * 
	 * @param context_p a non-null physical architecture
	 */
	public UMLBridgeJob(SD context_p, URI targetURI_p, UMLBridgeAlgo<SD> algo) {
		super("UML Bridge Job", context_p, targetURI_p);
		setProperty(IProgressConstants.PROPERTY_IN_DIALOG, true);
		_algo = algo;
	}

	@Override
	protected ResourceSet initializeTargetResourceSet() {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION,
				UMLResource.Factory.INSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new EMOFResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION,
				UMLResource.Factory.INSTANCE);
		return resourceSet;
	}

	protected Profile loadSysMLProfileForBridge() {
		return null;
	}

	/**
	 * @see org.eclipse.emf.diffmerge.bridge.interactive.BridgeJob#getBridge()
	 */
	@Override
	protected EMFInteractiveBridge<SD, IEditableModelScope> getBridge() {
		createMappingBridge();
		_mappingBridge.registerRules();
		// Make the mapping bridge incremental
		GMFDiffPolicy diffPolicy = createDiffPolicy();
		diffPolicy.setIgnoreOrders(true);
		EMFInteractiveBridge<SD, IEditableModelScope> result = new EMFInteractiveBridge<SD, IEditableModelScope>(
				_mappingBridge, diffPolicy, new UMLMergePolicy(), null) {

			/**
			 * @see org.eclipse.emf.diffmerge.bridge.incremental.EMFIncrementalBridge#createTrace()
			 */
			@Override
			protected Editable createTrace() {
				TraceImpl trace = new TraceImpl() {
					/** {@inheritDoc} */
					@Override
					public String putCause(Object cause_p, Object target_p) {
						if (target_p == null) {
							return null;
						}

						if (target_p instanceof TraceCheat) {
							TraceCheat<?> cheat = (TraceCheat<?>) target_p;
							String stringCause = cheat.getCause();
							EObject targetItem = cheat.getTarget();
							return super.putCause(stringCause, targetItem);
						} else {
							return super.putCause(cause_p, target_p);
						}

					}
				};
				return trace;
			}

		};
		return result;
	}

	protected GMFDiffPolicy createDiffPolicy() {
		GMFDiffPolicy diffPolicy = new GMFDiffPolicy() {
			public boolean coverOutOfScopeValue(EObject element_p, org.eclipse.emf.ecore.EReference reference_p) {
				return false;
			};
		};
		return diffPolicy;
	}

	public UMLBridge<SD, IEditableModelScope> createMappingBridge() {
		_mappingBridge = new UMLBridge<SD, IEditableModelScope>(_algo) {
			@Override
			public Profile loadSysMLProfile() throws Exception {
				return loadSysMLProfileForBridge();
			}
		};
		return _mappingBridge;
	}

	public CapellaBridgeAlgo<SD> getAlgo() {
		return _algo;
	}

	public UMLBridge<SD, IEditableModelScope> getMappingBridge() {
		return _mappingBridge;
	}

	public XMLSave createOwnXMLSave(XMLHelper xmlHelper) {
		return new XMISaveImpl(xmlHelper);
	}

	protected XMLHelper createOwnedXMLHelper(XMIResource resource) {
		return new XMIHelperImpl(resource);
	}

	@Override
	protected Resource getCreateTargetResource(URI uri_p) {
		Resource resource = null;
		if (getAlgo().getManageUIDs().isCreateUIDs()) {
			resource = (XMIResourceImpl) getTargetResourceSet().getResource(uri_p, false);
			if (resource == null) {
				resource = new XMIResourceImpl(uri_p) {
					@Override
					protected XMLSave createXMLSave() {
						return createOwnXMLSave(createOwnedXMLHelper(this));
					}

					protected boolean useUUIDs() {
						return getAlgo().getManageUIDs().isUseUIDs();
					};

					@Override
					protected void attachedHelper(EObject eObject) {
						if (isTrackingModification()) {
							eObject.eAdapters().add(modificationTrackingAdapter);
						}

						Map<String, EObject> map = getIntrinsicIDToEObjectMap();
						if (map != null) {
							String id = EcoreUtil.getID(eObject);
							if (id != null) {
								map.put(id, eObject);
							}
						}

						if (useIDs()) {
							String id = getID(eObject);
							if (useUUIDs() && id == null) {
								if (assignIDsWhileLoading() || !isLoading()) {
									id = DETACHED_EOBJECT_TO_ID_MAP.remove(eObject);
									if (id == null) {
										id = ((CapellaBridgeAlgo<?>) getAlgo()).getManageUIDs().getUId(eObject);
									}
									setID(eObject, id);
								}
							} else if (id != null) {
								getIDToEObjectMap().put(id, eObject);
							}
						}
					}
				};
				getTargetResourceSet().getResources().add(resource);
				ResourceUtil.ensureLoaded(resource);
			}
		} else {
			resource = super.getCreateTargetResource(uri_p);
		}
		if (resource instanceof XMIResource) {
			((XMIResource) resource).setEncoding(getEncoding());
			((XMIResource) resource).setXMIVersion(getXMIVersion());
		}
		return resource;
	}

	@Override
	protected void saveAndClose(IIncrementalBridgeExecution execution_p, Resource targetResource_p,
			Resource traceResource_p, IProgressMonitor monitor_p) {
		// Save and unload
		monitor_p.subTask(Messages.BridgeJob_Step_Completion);
		monitor_p.worked(1);
		if (!execution_p.isActuallyIncremental())
			setTrace(traceResource_p, execution_p.getTrace());
		if (!traceResource_p.getContents().isEmpty())
			ResourceUtil.makePersistent(traceResource_p);
		ResourceUtil.closeResource(traceResource_p);
		if (isSaveAndCloseTarget()) {
			makePersistent(targetResource_p);
			ResourceUtil.closeResource(targetResource_p);
		}
	}

	/**
	 * Ensure that the given resource becomes persistent and save its contents
	 * 
	 * @param resource_p a non-null resource
	 * @return whether the operation succeeded
	 */
	public boolean makePersistent(Resource resource_p) {
		boolean result = false;
		final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		addOptions(saveOptions);

		try {
			resource_p.save(saveOptions);
			result = true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * @param saveOptions
	 */
	public void addOptions(final Map<Object, Object> saveOptions) {
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
	}

	/**
	 * @return
	 */
	public String getXMIVersion() {
		return XMIResource.VERSION_VALUE;
	}

	/**
	 * @return
	 */
	public String getEncoding() {
		return "ASCII";
	}

}
