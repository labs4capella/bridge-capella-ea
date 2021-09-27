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
package org.eclipse.emf.diffmerge.bridge.uml.incremental;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.diffmerge.api.scopes.IFeaturedModelScope;
import org.eclipse.emf.diffmerge.gmf.GMFMergePolicy;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;


/**
 * A merge policy for UML models and diagrams, encompassing some GMF and UML peculiarities.
 * @author Olivier Constant
 */
public class UMLMergePolicy extends GMFMergePolicy {
  
  /**
   * Constructor
   */
  public UMLMergePolicy() {
    super();
    setGraphicalFromSemantic(true);
  }
  
  /**
   * @see org.eclipse.emf.diffmerge.gmf.GMFMergePolicy#isSingleMandatory(org.eclipse.emf.ecore.EReference)
   */
  @Override
  protected boolean isSingleMandatory(EReference reference_p) {
    return super.isSingleMandatory(reference_p) ||
        reference_p == UMLPackage.eINSTANCE.getTypedElement_Type();
  }
  
  /**
   * Extend the given addition group for the given element within the given scope
   * based on UML peculiarities
   * @param group_p a non-null, modifiable collection
   * @param element_p a non-null element
   * @param scope_p a non-null scope
   */
  protected void extendUMLAdditionGroup(Set<EObject> group_p, EObject element_p,
      IFeaturedModelScope scope_p) {
    // Annotation -> children
    if (element_p instanceof EAnnotation) {
      group_p.addAll(element_p.eContents());
    } else {
      // Element -> children which are annotations
      for (EObject child : element_p.eContents())
        if (child instanceof EAnnotation)
          group_p.add(child);
    }
    // Element -> Stereotype applications
    if (element_p instanceof Element)
      group_p.addAll(((Element)element_p).getStereotypeApplications());
    // Association <-> Property
    if (element_p instanceof Association) {
      group_p.addAll(((Association)element_p).getMemberEnds());
    // Property -> Association and default value
    } else if (element_p instanceof Property) {
      Property property = (Property)element_p;
      Association association = property.getAssociation();
      if (association != null) group_p.add(association);
    // Connector -> ConnectorEnd
    } else if (element_p instanceof Connector) {
      group_p.addAll(((Connector)element_p).getEnds());
      // ConnectorEnd -> Connector
    } else if (element_p instanceof ConnectorEnd) {
      group_p.add(element_p.eContainer());
    }
    // MultiplicityElement -> lowerValue, upperValue
    if (element_p instanceof MultiplicityElement) {
      MultiplicityElement me = (MultiplicityElement)element_p;
      ValueSpecification lowerValue = me.getLowerValue();
      if (lowerValue != null) group_p.add(lowerValue);
      ValueSpecification upperValue = me.getUpperValue();
      if (upperValue != null) group_p.add(upperValue);
    }
  }
  
  /**
   * @see org.eclipse.emf.diffmerge.gmf.GMFMergePolicy#getAdditionGroup(org.eclipse.emf.ecore.EObject, org.eclipse.emf.diffmerge.api.scopes.IFeaturedModelScope)
   */
  @Override
  public Set<EObject> getAdditionGroup(EObject element_p, IFeaturedModelScope scope_p) {
    Set<EObject> result = super.getAdditionGroup(element_p, scope_p);
    extendUMLAdditionGroup(result, element_p, scope_p);
    return result;
  }
  
  /**
   * Return the references which are subsetted by the given one
   * @param reference_p a non-null reference
   * @return a non-null, potentially empty, unmodifiable set
   */
  protected Set<EReference> getSubsettedReferences(EReference reference_p) {
    Set<EReference> result = Collections.emptySet();
    EAnnotation subsetsAnnotation =
        UML2Util.getEAnnotation(reference_p, "subsets", false); //$NON-NLS-1$
    if (subsetsAnnotation != null) {
      result = new HashSet<EReference>();
      for (EObject referenced : subsetsAnnotation.getReferences()) {
        if (referenced instanceof EReference)
          result.add((EReference)referenced);
      }
    }
    return result;
  }
  
}
