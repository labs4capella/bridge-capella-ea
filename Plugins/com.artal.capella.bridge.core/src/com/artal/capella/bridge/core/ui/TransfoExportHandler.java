/*******************************************************************************
* Copyright (c) 2021 THALES GLOBAL SERVICES.
* All right reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* Contributors:
*     Artal Technologies - initial API and implementation
*******************************************************************************/
package com.artal.capella.bridge.core.ui;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.diffmerge.bridge.interactive.BridgeJob;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.handlers.HandlerUtil;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.capellamodeller.Project;

import com.artal.capella.bridge.core.mix.AbstractMappingAlgoMix;

/**
 * @author Yann BINOT
 *
 */
public class TransfoExportHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		String umlPath = null;
		AbstractMappingAlgoMix<?, ?, ?> mix = null;

		StructuredSelection currentSelection = (StructuredSelection) HandlerUtil.getCurrentSelection(event);
		CapellaMappingDialog dialog = new CapellaMappingDialog(Display.getCurrent().getActiveShell());
		int status = dialog.open();

		if (status == IStatus.OK) {

			umlPath = dialog.getOutputPath();

			mix = dialog.getMix();
		}

		if (umlPath == null || mix == null) {
			return null;
		}

		File file = new File(umlPath);
		if (file.exists()) {
			boolean openConfirm = MessageDialog.openConfirm(Display.getCurrent().getActiveShell(),
					"Overwritte existing output file",
					"Are you sure to overwrite the existing " + file.getName() + " file ?");
			if (!openConfirm) {
				return null;
			} else {
				file.delete();
			}

		}

		// String folder = umlPath.substring(0, umlPath.lastIndexOf(File.separator));
		URI targetUri = URI.createFileURI(umlPath);

		CapellaElement firstElement = (CapellaElement) currentSelection.getFirstElement();
		Resource capellaResource = firstElement.eResource();
		ResourceSet resourceSet = capellaResource.getResourceSet();
		URI semanticResourceURI = capellaResource.getURI().trimFileExtension().appendFileExtension("melodymodeller");
		Resource semanticResource = resourceSet.getResource(semanticResourceURI, false);
		Project context = null;
		if (semanticResource != null) {
			EObject root = semanticResource.getContents().get(0);
			if (root instanceof Project) {
				context = (Project) root;
			}
		}

		if (context != null) {
			if (targetUri != null) {

				// TODO
				// Capella2UMLBridgeJob job = new Capella2UMLBridgeJob("", context, targetUri,
				// mix);
				// bridgeJob.setTargetParentFolder(folder);
				BridgeJob<?> bridgeJob = dialog.createBridgeJob("", context, targetUri, mix);

				ProgressMonitorDialog pmd = new ProgressMonitorDialog(Display.getCurrent().getActiveShell());
				try {
					pmd.run(false, false, new IRunnableWithProgress() {

						@Override
						public void run(IProgressMonitor monitor)
								throws InvocationTargetException, InterruptedException {
							bridgeJob.run(monitor);

						}
					});
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
		// for this moment the bridge trace is not saved
		File f = new File(umlPath + ".bridgetraces");
		if (f.exists()) {
			f.delete();
		}

		dialog.postProcess();
		return null;
	}
}
