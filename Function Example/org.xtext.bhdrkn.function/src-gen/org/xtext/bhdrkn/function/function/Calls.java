/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.bhdrkn.function.function;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calls</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.bhdrkn.function.function.Calls#getCalls <em>Calls</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.bhdrkn.function.function.FunctionPackage#getCalls()
 * @model
 * @generated
 */
public interface Calls extends EObject
{
  /**
   * Returns the value of the '<em><b>Calls</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.bhdrkn.function.function.Call}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Calls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Calls</em>' containment reference list.
   * @see org.xtext.bhdrkn.function.function.FunctionPackage#getCalls_Calls()
   * @model containment="true"
   * @generated
   */
  EList<Call> getCalls();

} // Calls
