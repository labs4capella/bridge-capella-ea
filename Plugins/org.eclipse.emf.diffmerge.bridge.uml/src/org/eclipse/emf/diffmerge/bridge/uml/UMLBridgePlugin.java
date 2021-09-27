/*********************************************************************
 * Copyright (c) 2016-2019 Thales Global Services S.A.S.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S. - initial API and implementation
 **********************************************************************/
package org.eclipse.emf.diffmerge.bridge.uml;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;


/**
 * The activator class for this plug-in.
 * @author Olivier Constant
 */
public class UMLBridgePlugin extends Plugin {
  
	/** The shared instance */
	private static UMLBridgePlugin __plugin;
	
	
	/**
	 * Constructor
	 */
	public UMLBridgePlugin() {
	  // Nothing needed
	}
	
  /**
   * Return the shared instance of the activator
   * @return a non-null instance
   */
  public static UMLBridgePlugin getDefault() {
    return __plugin;
  }
  
  /**
   * Return the ID of this plug-in according to MANIFEST.MF
   * @return a non-null string
   */
  public String getPluginId() {
    return getBundle().getSymbolicName();
  }
  
  /**
   * @see org.eclipse.core.runtime.Plugin#start(org.osgi.framework.BundleContext)
   */
  @Override
	public void start(BundleContext context_p) throws Exception {
		super.start(context_p);
		__plugin = this;
	}
  
	/**
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context_p) throws Exception {
		__plugin = null;
		super.stop(context_p);
	}
  
}
