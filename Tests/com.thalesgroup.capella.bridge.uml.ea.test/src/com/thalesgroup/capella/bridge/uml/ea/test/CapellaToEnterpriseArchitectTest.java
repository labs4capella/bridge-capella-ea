/*******************************************************************************
* Copyright (c) 2021 THALES GLOBAL SERVICES.
* All right reserved. This program and the accompanying materials are made 
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* Contributors:
*     Artal Technologies - initial API and implementation
*******************************************************************************/
package com.thalesgroup.capella.bridge.uml.ea.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.diffmerge.bridge.interactive.BridgeJob;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.polarsys.capella.core.data.capellamodeller.Project;

import com.artal.capella.bridge.core.services.MappingService;
import com.artal.capella.bridge.core.services.OsgiServiceTrackerUtils;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.EAMappingService;
import com.thalesgroup.capella.bridge.uml.ea.core.bridge.mix.DefaultCapella2UMLMix;

/**
 * @author Yann BINOT
 */
public class CapellaToEnterpriseArchitectTest {

	public CapellaToEnterpriseArchitectTest() {
	}

	static private File fileTemp;

	@BeforeClass
	static public void setUp() throws IOException {
		Path createTempDirectory = Files.createTempDirectory("Capella_EA_Bridge");
		fileTemp = createTempDirectory.toFile();
	}

	static private void deleteLib(File dossierLib) {
		if (dossierLib.listFiles().length != 0) {
			deleteDirectoryContent(dossierLib.listFiles());
		} else {
			dossierLib.delete();
		}
	}

	@AfterClass
	static public void setDown() {
		deleteLib(fileTemp);
		fileTemp.deleteOnExit();
	}

	static private void deleteDirectoryContent(File[] files) {
		for (int i = 0; i < files.length; i++) {
			if (files[i].isDirectory() && files[i].listFiles().length != 0) {
				deleteDirectoryContent(files[i].listFiles());
			}
			files[i].delete();
		}
	}

	private void launchTest(String pathCapellaProject, String pathReferenceModel, String nameTest) throws IOException {

		MappingService service = OsgiServiceTrackerUtils.getService(MappingService.class);

		if (service instanceof EAMappingService) {
			Project model = CapellaTestUtils.loadCapellaModel(pathCapellaProject);

			// load the reference capella project

			File referenceFile = new File(pathReferenceModel);

			// load the empty capella project to fill.
			// and copy them in the the os temp repository.

			// File targetFile = new File(pathEmptyProject);
			File tmpFile = new File(fileTemp.getAbsolutePath() + "/" + nameTest,
					nameTest + "." + service.getExtension());

			if (!tmpFile.getParentFile().exists()) {
				tmpFile.getParentFile().mkdirs();
			}
			tmpFile.createNewFile();

			// Create and launch the bridge itself
			URI targetUri = URI.createFileURI(tmpFile.getAbsolutePath());

			BridgeJob<?> eaBridgeJob = service.createBridgeJob("", model, targetUri,
					new DefaultCapella2UMLMix((EAMappingService) service));
			eaBridgeJob.run(new NullProgressMonitor());

			boolean compareTwoFiles = CapellaTestUtils.compareTwoFiles(referenceFile.getAbsolutePath(),
					tmpFile.getAbsolutePath());
			if (!compareTwoFiles) {
				Assert.fail("");
			}
		}
	}

	////////////////////////// TESTS//////////////////////////////////

	@Test
	public void Test_C2EA_01() throws IOException {
		launchTest("resources/Test_C2EA_01/Camera SysML2 Example.melodymodeller",
				"resources/Test_C2EA_01/Camera SysML2 Example.xml", "Test_C2EA_01");
	}

	@Test
	public void Test_C2EA_02() throws IOException {
		launchTest("resources/Test_C2EA_02/LogicalActorTest.melodymodeller",
				"resources/Test_C2EA_02/LogicalActorTest.xml", "Test_C2EA_02");
	}

	@Test
	public void Test_C2EA_03() throws IOException {
		launchTest("resources/Test_C2EA_03/LogicalComponent.melodymodeller",
				"resources/Test_C2EA_03/LogicalComponent.xml", "Test_C2EA_03");
	}

	@Test
	public void Test_C2EA_04() throws IOException {
		launchTest("resources/Test_C2EA_04/ComponentPortTest.melodymodeller",
				"resources/Test_C2EA_04/ComponentPortTest.xml", "Test_C2EA_04");
	}

	@Test
	public void Test_C2EA_05() throws IOException {
		launchTest("resources/Test_C2EA_05/ComponentExchangeTest.melodymodeller",
				"resources/Test_C2EA_05/ComponentExchangeTest.xml", "Test_C2EA_05");
	}

	@Test
	public void Test_C2EA_06() throws IOException {
		launchTest("resources/Test_C2EA_06/EventExchangeItemTest.melodymodeller",
				"resources/Test_C2EA_06/EventExchangeItemTest.xml", "Test_C2EA_06");
	}

	@Test
	public void Test_C2EA_07() throws IOException {
		launchTest("resources/Test_C2EA_07/EventExchangeItemTest.melodymodeller",
				"resources/Test_C2EA_07/EventExchangeItemTest.xml", "Test_C2EA_07");
	}

	@Test
	public void Test_C2EA_08() throws IOException {
		launchTest("resources/Test_C2EA_08/OperationExchangeItemTest.melodymodeller",
				"resources/Test_C2EA_08/OperationExchangeItemTest.xml", "Test_C2EA_08");
	}

	@Test
	public void Test_C2EA_09() throws IOException {
		launchTest("resources/Test_C2EA_09/OperationExchangeItemTest.melodymodeller",
				"resources/Test_C2EA_09/OperationExchangeItemTest.xml", "Test_C2EA_09");
	}

	@Test
	public void Test_C2EA_10() throws IOException {
		launchTest("resources/Test_C2EA_10/InterfaceTest.melodymodeller", "resources/Test_C2EA_10/InterfaceTest.xml",
				"Test_C2EA_10");
	}

	@Test
	public void Test_C2EA_11() throws IOException {
		launchTest("resources/Test_C2EA_11/DecriptionTest.melodymodeller", "resources/Test_C2EA_11/DecriptionTest.xml",
				"Test_C2EA_11");
	}

	@Test
	public void Test_C2EA_12() throws IOException {
		launchTest("resources/Test_C2EA_12/ShareDataExchangeItemTest.melodymodeller",
				"resources/Test_C2EA_12/ShareDataExchangeItemTest.xml", "Test_C2EA_12");
	}

	@Test
	public void Test_C2EA_13() throws IOException {
		launchTest("resources/Test_C2EA_13/ShareDataExchangeItemTest.melodymodeller",
				"resources/Test_C2EA_13/ShareDataExchangeItemTest.xml", "Test_C2EA_13");
	}

	@Test
	public void Test_C2EA_14() throws IOException {
		launchTest("resources/Test_C2EA_14/EnumerationTest.melodymodeller",
				"resources/Test_C2EA_14/EnumerationTest.xml", "Test_C2EA_14");
	}

	@Test
	public void Test_C2EA_15() throws IOException {
		launchTest("resources/Test_C2EA_15/PrimitiveTest.melodymodeller", "resources/Test_C2EA_15/PrimitiveTest.xml",
				"Test_C2EA_15");
	}
}
