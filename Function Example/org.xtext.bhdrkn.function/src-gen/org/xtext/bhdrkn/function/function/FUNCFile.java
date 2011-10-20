/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.bhdrkn.function.function;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FUNC File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.bhdrkn.function.function.FUNCFile#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.xtext.bhdrkn.function.function.FUNCFile#getCalls <em>Calls</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.bhdrkn.function.function.FunctionPackage#getFUNCFile()
 * @model
 * @generated
 */
public interface FUNCFile extends EObject
{
  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference.
   * @see #setFunctions(Functions)
   * @see org.xtext.bhdrkn.function.function.FunctionPackage#getFUNCFile_Functions()
   * @model containment="true"
   * @generated
   */
  Functions getFunctions();

  /**
   * Sets the value of the '{@link org.xtext.bhdrkn.function.function.FUNCFile#getFunctions <em>Functions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Functions</em>' containment reference.
   * @see #getFunctions()
   * @generated
   */
  void setFunctions(Functions value);

  /**
   * Returns the value of the '<em><b>Calls</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Calls</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Calls</em>' containment reference.
   * @see #setCalls(Calls)
   * @see org.xtext.bhdrkn.function.function.FunctionPackage#getFUNCFile_Calls()
   * @model containment="true"
   * @generated
   */
  Calls getCalls();

  /**
   * Sets the value of the '{@link org.xtext.bhdrkn.function.function.FUNCFile#getCalls <em>Calls</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Calls</em>' containment reference.
   * @see #getCalls()
   * @generated
   */
  void setCalls(Calls value);

} // FUNCFile
