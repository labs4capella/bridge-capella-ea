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
package org.eclipse.emf.diffmerge.bridge.uml.mapping;

import java.util.Collection;

import org.eclipse.emf.diffmerge.bridge.mapping.api.IMappingExecution;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IQueryExecution;
import org.eclipse.emf.diffmerge.bridge.mapping.api.IRule;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.util.UMLUtil;


/**
 * A transformation rule that is able to produce profiled UML elements.
 * Profile application, Stereotype application, Stereotype application definition are
 * carried out in dedicated phases.
 * This is because UML2 imposes operations in the following order: create UML elements,
 * apply Profiles, apply Stereotypes.
 * @param <S> the type of source data elements
 * @param <TRS> the type of the source subset that traces the target
 * @param <T> the type of target data elements
 * @author Olivier Constant
 */
public interface IUMLRule<S, TRS, T> extends IRule<S, TRS, T> {
  
  /**
   * Apply Profiles on the given target element(s) in the given context and return
   * the resulting created elements (Profile applications and mandatory Stereotype applications)
   * @param source_p a non-null object
   * @param target_p a non-null object
   * @param queryExecution_p a non-null object
   * @param mappingExecution_p a non-null object
   * @return a non-null set containing no null value
   */
  Collection<EObject> createProfileApplications(S source_p, T target_p,
      IQueryExecution queryExecution_p, IMappingExecution mappingExecution_p);
  
  /**
   * Apply non-mandatory Stereotypes on the given target element(s) in the given context and return
   * the resulting Stereotype applications. Stereotype applications are only created, not defined.
   * The source data element and the executions are not modified by the operation.
   * @param source_p a non-null object
   * @param target_p a non-null object
   * @param queryExecution_p a non-null object
   * @param mappingExecution_p a non-null object
   * @return a non-null set containing no null value
   */
  Collection<EObject> createStereotypeApplications(S source_p, T target_p, IQueryExecution queryExecution_p,
      IMappingExecution mappingExecution_p);
  
  /**
   * Define Stereotype applications for the given target element(s) in the given context.
   * This operation is similar in its principle to
   * {@link IRule#defineTarget(Object, Object, IQueryExecution, IMappingExecution)}.
   * Use {@link UMLUtil#getStereotypeApplication(org.eclipse.uml2.uml.Element, Class)} to retrieve
   * the desired applications.
   * The source data element and the executions are not modified by the operation.
   * Use UMLUtil and UMLUtil.StereotypeApplicationHelper for Profile/Stereotype-related operations.
   * @see UMLUtil
   * @param source_p a non-null object
   * @param target_p a non-null object
   * @param queryExecution_p a non-null object
   * @param mappingExecution_p a non-null object
   */
  void defineStereotypeApplications(S source_p, T target_p, IQueryExecution queryExecution_p,
      IMappingExecution mappingExecution_p);
  
}
