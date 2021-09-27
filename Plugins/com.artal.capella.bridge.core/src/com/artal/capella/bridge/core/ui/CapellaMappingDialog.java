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
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.diffmerge.bridge.interactive.BridgeJob;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.polarsys.capella.core.data.capellamodeller.Project;

import com.artal.capella.bridge.core.mix.AbstractMappingAlgoMix;
import com.artal.capella.bridge.core.services.MappingService;
import com.artal.capella.bridge.core.services.OsgiServiceTrackerUtils;

/**
 * @author Yann BINOT
 *
 */
public class CapellaMappingDialog extends TitleAreaDialog {

	private String _outputPath = "";

	private AbstractMappingAlgoMix<?, ?, ?> _selectedMix = null;

	private MappingService _selectedTransfo;

	/**
	 * @param parentShell
	 */
	public CapellaMappingDialog(Shell parentShell) {
		super(parentShell);
	}

	// overriding this methods allows you to set the
	// title of the custom dialog
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Transform model");
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		List<MappingService> listServices = OsgiServiceTrackerUtils.getServices(MappingService.class);

		Composite container = (Composite) super.createDialogArea(parent);
		setTitle("Select a target file");
		Group selectGroup = createSelectedGroup(container);

		ComboViewer comboTransitions = createTransfoCombo(selectGroup, listServices);
		// blob
		new Label(selectGroup, SWT.NONE);
		createBrowseButton(selectGroup);

		ComboViewer combo = createMixCombo(selectGroup);

		Composite specificGroup = new Composite(container, SWT.NONE);
		StackLayout stackLayout = new StackLayout();
		specificGroup.setLayout(stackLayout);
		specificGroup.setLayoutData(new GridData(GridData.FILL_BOTH));

		manageSpecifcView(listServices, specificGroup, stackLayout);

		createComboListeners(container, comboTransitions, combo, specificGroup, stackLayout);

		if (listServices.size() > 0) {
			comboTransitions.getCombo().select(0);
			_selectedTransfo = listServices.get(0);
			combo.getCombo().removeAll();

			List<AbstractMappingAlgoMix<?, ?, ?>> mixes = _selectedTransfo.getMixes();
			for (AbstractMappingAlgoMix mix : mixes) {
				combo.add(mix);
			}
			stackLayout.topControl = _selectedTransfo.getOrCreateSpecificView(specificGroup);
			specificGroup.layout(true);
			container.layout(true);

		}
		return container;
	}

	/**
	 * @param container
	 * @return
	 */
	public Group createSelectedGroup(Composite container) {
		Group selectGroup = new Group(container, SWT.NONE);

		selectGroup.setText("Selection");
		selectGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
		selectGroup.setLayout(new GridLayout(3, false));
		return selectGroup;
	}

	/**
	 * @param container
	 * @param comboTransitions
	 * @param combo
	 * @param specificGroup
	 * @param stackLayout
	 */
	public void createComboListeners(Composite container, ComboViewer comboTransitions, ComboViewer combo,
			Composite specificGroup, StackLayout stackLayout) {
		combo.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				AbstractMappingAlgoMix<?, ?, ?> firstElement = (AbstractMappingAlgoMix<?, ?, ?>) selection
						.getFirstElement();
				_selectedMix = firstElement;
				validate();
			}
		});

		comboTransitions.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {

				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				MappingService firstElement = (MappingService) selection.getFirstElement();
				if (!firstElement.equals(_selectedTransfo)) {
					_selectedTransfo = firstElement;
					combo.getCombo().removeAll();

					List<AbstractMappingAlgoMix<?, ?, ?>> mixes = _selectedTransfo.getMixes();
					for (AbstractMappingAlgoMix mix : mixes) {
						combo.add(mix);
					}
					stackLayout.topControl = _selectedTransfo.getOrCreateSpecificView(specificGroup);
					specificGroup.layout(true);
					container.layout(true);
				}
				validate();
			}
		});
	}

	/**
	 * @param listServices
	 * @param specificGroup
	 * @param stackLayout
	 */
	public void manageSpecifcView(List<MappingService> listServices, Composite specificGroup, StackLayout stackLayout) {
		Composite defaultComposite = new Composite(specificGroup, SWT.NONE);
		defaultComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
		defaultComposite.setLayout(new GridLayout());

		// for (MappingService mappingService : listServices) {
		// mappingService.getOrCreateSpecificView(specificGroup);
		//
		// }
		stackLayout.topControl = defaultComposite;

		GridData layoutData = new GridData(GridData.FILL_BOTH);
		specificGroup.setLayoutData(layoutData);
	}

	/**
	 * @param selectGroup
	 * @return
	 */
	public ComboViewer createMixCombo(Group selectGroup) {
		Label mixLabel = new Label(selectGroup, SWT.NONE);
		mixLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		mixLabel.setText("Transformation algorithm");

		ComboViewer combo = new ComboViewer(selectGroup, SWT.NONE);
		combo.getCombo().setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		combo.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof AbstractMappingAlgoMix<?, ?, ?>) {
					return ((AbstractMappingAlgoMix<?, ?, ?>) element).getMixName();
				}
				return super.getText(element);
			}
		});
		return combo;
	}

	/**
	 * @param selectGroup
	 * @param listServices
	 * @return
	 */
	public ComboViewer createTransfoCombo(Group selectGroup, List<MappingService> listServices) {
		Label transitionLabel = new Label(selectGroup, SWT.NONE);
		transitionLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		transitionLabel.setText("Transformation type");

		ComboViewer comboTransitions = new ComboViewer(selectGroup, SWT.NONE);
		comboTransitions.getCombo().setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		comboTransitions.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof MappingService) {
					return ((MappingService) element).getTransfoName();
				}
				return super.getText(element);
			}
		});

		for (MappingService mappingService : listServices) {
			comboTransitions.add(mappingService);
		}
		return comboTransitions;
	}

	/**
	 * @param selectGroup
	 * @param text
	 */
	public void createBrowseButton(Group selectGroup) {

		Label label = new Label(selectGroup, SWT.NONE);
		label.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		label.setText("Target file");

		Text text = new Text(selectGroup, SWT.BORDER);
		text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		text.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				_outputPath = text.getText();
				validate();

			}
		});
		Button button = new Button(selectGroup, SWT.NONE);
		button.setLayoutData(new GridData());
		button.setText("Browse..");

		button.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog dialog = new FileDialog(Display.getCurrent().getActiveShell());
				String extension = null;
				if (_selectedTransfo != null) {
					extension = _selectedTransfo.getExtension();
				}
				dialog.setFilterExtensions(new String[] { (extension == null) ? "*" : "*." + extension });
				String filePath = dialog.open();
				if (filePath != null) {
					if (extension != null) {
						if (!filePath.endsWith("." + extension)) {
							filePath += "." + extension;
						}
					}
					text.setText(filePath);
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);

			}
		});
	}

	public String getOutputPath() {
		return _outputPath;
	}

	@Override
	protected Control createButtonBar(Composite parent) {

		Control createButtonBar = super.createButtonBar(parent);
		validate();
		return createButtonBar;

	}

	private void validate() {
		String errorMessage = null;
		if (_outputPath == null || _outputPath.trim().isEmpty()) {
			errorMessage = "No input file.";
		} else {
			File file = new File(_outputPath);
			File parentFile = file.getParentFile();
			if (parentFile == null || !parentFile.exists()) {
				errorMessage = "Invalid parent folder.";
			}
		}
		if (_selectedMix == null) {
			errorMessage = "No selected mix";
		}
		setErrorMessage(errorMessage);
		if (errorMessage != null) {
			getButton(IDialogConstants.OK_ID).setEnabled(false);
		} else {
			getButton(IDialogConstants.OK_ID).setEnabled(true);
		}
	}

	public AbstractMappingAlgoMix<?, ?, ?> getMix() {
		return _selectedMix;
	}

	public BridgeJob<?> createBridgeJob(String jobName_p, Project sourceDataSet_p, URI targetURI_p,
			AbstractMappingAlgoMix<?, ?, ?> mix) {
		return _selectedTransfo.createBridgeJob(jobName_p, sourceDataSet_p, targetURI_p, mix);
	}

	public void postProcess() {
		_selectedTransfo.postProcess(_outputPath);

	}

}
