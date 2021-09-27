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

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * @author Yann BINOT
 *
 */
public class MappingActivator implements BundleActivator {

	static private BundleContext _bundleContext;

	@Override
	public void start(BundleContext context) throws Exception {
		_bundleContext = context;

	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub

	}

	public static BundleContext getBundleContext() {
		return _bundleContext;
	}
}
