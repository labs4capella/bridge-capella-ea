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

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.diffmerge.bridge.interactive.BridgeJob;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.uml2.uml.Profile;
import org.osgi.service.component.annotations.Component;
import org.polarsys.capella.core.data.capellamodeller.Project;

import com.artal.capella.bridge.core.mix.AbstractMappingAlgoMix;
import com.artal.capella.bridge.core.services.MappingService;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.mix.AlternativePhysicalArchitectureMix;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.mix.DefaultCapella2UMLMix;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.mix.PhysicalArchitectureCapella2UMLMix;
import com.thalesgroup.capella.bridge.uml.ea.core.profiles.ExportUMLProfile;

/**
 * @author Yann BINOT
 *
 */
@Component
public class EAMappingService implements MappingService {

	public boolean _isExportProfile = false;
	private Capella2UMLAlgo _algo;

	/**
	 * 
	 */
	public EAMappingService() {
	}

	@Override
	public String getTransfoName() {
		return "Capella to Enterprise Architect";
	}

	@Override
	public BridgeJob<?> createBridgeJob(String jobName_p, Project sourceDataSet_p, URI targetURI_p,
			AbstractMappingAlgoMix<?, ?, ?> mix) {
		Capella2UMLBridgeJob job = new Capella2UMLBridgeJob("", sourceDataSet_p, targetURI_p, mix);
		_algo = (Capella2UMLAlgo) job.getAlgo();
		return job;
	}

	@Override
	public List<AbstractMappingAlgoMix<?, ?, ?>> getMixes() {
		List<AbstractMappingAlgoMix<?, ?, ?>> results = new ArrayList<AbstractMappingAlgoMix<?, ?, ?>>();

		DefaultCapella2UMLMix mix = new DefaultCapella2UMLMix(this);
		PhysicalArchitectureCapella2UMLMix pamix = new PhysicalArchitectureCapella2UMLMix(this);
		AlternativePhysicalArchitectureMix altMix = new AlternativePhysicalArchitectureMix(this);
		results.add(mix);
		results.add(pamix);
		results.add(altMix);

		return results;
	}

	@Override
	public Control getOrCreateSpecificView(Composite specificGroup) {

		Composite compo = new Composite(specificGroup, SWT.NONE);
		compo.setLayout(new GridLayout());
		compo.setLayoutData(new GridData(GridData.FILL_BOTH));

		Button exportProfile = new Button(compo, SWT.CHECK);
		exportProfile.setText("Export profiles");
		exportProfile.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		exportProfile.setSelection(_isExportProfile);

		exportProfile.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				_isExportProfile = exportProfile.getSelection();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});

		return compo;
	}

	@Override
	public String getExtension() {
		return "xml";
	}

	@Override
	public void postProcess(String outputPath) {
		if (_isExportProfile) {
			List<Profile> profiles = _algo.getProfiles();
			File file = new File(outputPath);
			String parent = file.getParent();
			ExportUMLProfile exporter = new ExportUMLProfile(profiles, parent);
			exporter.export();
		}
	}

	public boolean isExportProfile() {
		return _isExportProfile;
	}
}
