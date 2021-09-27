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

import org.eclipse.emf.diffmerge.api.scopes.IEditableModelScope;
import org.eclipse.emf.diffmerge.bridge.mapping.impl.MappingBridge;
import org.eclipse.emf.diffmerge.bridge.mapping.impl.MappingExecution;
import org.eclipse.emf.diffmerge.bridge.mapping.operations.MappingBridgeOperation;


/**
 * An EMFMappingBridge whose target data set covers Profile-aware UML elements.
 * @param <SD> the type of the source data set
 * @param <TD> the type of the target data set
 * @author Olivier Constant
 */
public class UMLMappingBridge<SD, TD extends IEditableModelScope>
extends MappingBridge<SD, TD> {
  
  /**
   * Constructor
   */
  public UMLMappingBridge() {
    super();
  }
  
  /**
   * @see org.eclipse.emf.diffmerge.bridge.mapping.impl.MappingBridge#createMappingOperation(java.lang.Object, java.lang.Object, org.eclipse.emf.diffmerge.bridge.mapping.impl.MappingExecution)
   */
  @Override
  protected MappingBridgeOperation createMappingOperation(SD sourceDataSet_p,
      TD targetDataSet_p, MappingExecution execution_p) {
    return new UMLMappingBridgeOperation(
        sourceDataSet_p, targetDataSet_p, this, execution_p);
  }
  
  /**
   * @see org.eclipse.emf.diffmerge.bridge.mapping.impl.MappingBridge#getWorkAmount(java.lang.Object, java.lang.Object)
   */
  @Override
  public int getWorkAmount(SD sourceDataSet_p, TD targetDataSet_p) {
    return super.getWorkAmount(sourceDataSet_p, targetDataSet_p) + 3;
  }
  
}
