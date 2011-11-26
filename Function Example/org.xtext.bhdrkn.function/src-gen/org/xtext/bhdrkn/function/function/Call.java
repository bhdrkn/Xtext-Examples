/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.bhdrkn.function.function;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.bhdrkn.function.function.Call#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.bhdrkn.function.function.Call#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.bhdrkn.function.function.FunctionPackage#getCall()
 * @model
 * @generated
 */
public interface Call extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(Function)
   * @see org.xtext.bhdrkn.function.function.FunctionPackage#getCall_Name()
   * @model
   * @generated
   */
  Function getName();

  /**
   * Sets the value of the '{@link org.xtext.bhdrkn.function.function.Call#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(Function value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' reference.
   * @see #setArgs(Define)
   * @see org.xtext.bhdrkn.function.function.FunctionPackage#getCall_Args()
   * @model
   * @generated
   */
  Define getArgs();

  /**
   * Sets the value of the '{@link org.xtext.bhdrkn.function.function.Call#getArgs <em>Args</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Args</em>' reference.
   * @see #getArgs()
   * @generated
   */
  void setArgs(Define value);

} // Call
