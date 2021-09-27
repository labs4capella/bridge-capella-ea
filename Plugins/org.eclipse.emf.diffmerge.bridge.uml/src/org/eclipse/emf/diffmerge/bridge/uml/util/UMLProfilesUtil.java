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
package org.eclipse.emf.diffmerge.bridge.uml.util;

import java.util.Deque;
import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.util.UMLUtil;

/**
 * A utility class for dealing with UML Profiles.
 * @author Olivier Constant
 */
public class UMLProfilesUtil {
  
  /**
   * Constructor
   */
  private UMLProfilesUtil() {
    // Prevents instantiation
  }
  
  /**
   * Return whether the given object is a UML Stereotype application
   * @param element_p a potentially null object
   */
  public static boolean isStereotypeApplication(Object element_p) {
    return
        element_p instanceof EObject &&
        UMLUtil.getBaseElement((EObject)element_p) != null;
  }
  
  /**
   * Register the given profile in the given resource set, prior to loading profiles models
   * @param resourceSet_p a non-null resource set
   * @param profile_p a non-null profile
   */
  public static void registerProfile(ResourceSet resourceSet_p, Profile profile_p) {
    // Resource Factory registration
    resourceSet_p.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
        UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
    // Profile EPackages registration, recursively
    if (!profile_p.isDefined())
      profile_p.define();
    EPackage definition = profile_p.getDefinition(); // Supposedly non-null
    Deque<EPackage> toRegister = new LinkedList<EPackage>();
    toRegister.add(definition);
    while (!toRegister.isEmpty()) {
      EPackage current = toRegister.pop();
      resourceSet_p.getPackageRegistry().put(current.getNsURI(), current);
      toRegister.addAll(current.getESubpackages());
    }
  }
  
}
