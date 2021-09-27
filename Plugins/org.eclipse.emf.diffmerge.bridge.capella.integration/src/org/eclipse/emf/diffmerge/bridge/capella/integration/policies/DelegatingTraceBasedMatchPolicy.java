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
package org.eclipse.emf.diffmerge.bridge.capella.integration.policies;

import org.eclipse.emf.diffmerge.api.IMatchPolicy;
import org.eclipse.emf.diffmerge.api.scopes.IModelScope;
import org.eclipse.emf.diffmerge.bridge.api.IBridgeTrace;
import org.eclipse.emf.diffmerge.bridge.incremental.BridgeTraceBasedMatchPolicy;
import org.eclipse.emf.ecore.EObject;

/**
 * A delegating trace-based match policy. It uses the trace primarily to return
 * match identifiers, when it cannot, it delegate to a second matching policy.
 * 
 */
public class DelegatingTraceBasedMatchPolicy extends
    BridgeTraceBasedMatchPolicy {

  /**
   * The second match policy to delegate to
   */
  private final IMatchPolicy delegate;

  /**
   * Default constructor
   * 
   * @param createdScope_p
   *          a non-null model scope
   * @param createdTrace_p
   *          a non-null trace
   * @param existingTrace_p
   *          a non-null trace
   * @param delegate_p
   *          the non-null match policy to delegate to
   */
  public DelegatingTraceBasedMatchPolicy(IModelScope createdScope_p,
      IBridgeTrace createdTrace_p, IBridgeTrace existingTrace_p,
      IMatchPolicy delegate_p) {
    super(createdScope_p, createdTrace_p, existingTrace_p);
    this.delegate = delegate_p;
  }

  /**
   * @see org.eclipse.emf.diffmerge.bridge.incremental.BridgeTraceBasedMatchPolicy#getMatchID(org.eclipse.emf.ecore.EObject,
   *      org.eclipse.emf.diffmerge.api.scopes.IModelScope)
   */
  @Override
  public Object getMatchID(EObject element_p, IModelScope scope_p) {
    IBridgeTrace trace = scope_p == _createdScope ? _createdTrace
        : _existingTrace;
    Object result = trace.getCause(element_p);
    if (result == null)
      result = getDelegate().getMatchID(element_p, scope_p);
    return result;
  }

  /**
   * Returns the match policy this policy delegates to.
   * 
   * @return the match policy delegate.
   */
  protected IMatchPolicy getDelegate() {
    return delegate;
  }
}