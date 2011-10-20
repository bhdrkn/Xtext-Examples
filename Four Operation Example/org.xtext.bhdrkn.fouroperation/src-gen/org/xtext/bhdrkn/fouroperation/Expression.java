/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.bhdrkn.fouroperation;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.bhdrkn.fouroperation.Expression#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.bhdrkn.fouroperation.Expression#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.bhdrkn.fouroperation.FouroperationPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' attribute.
   * @see #setLeft(BigDecimal)
   * @see org.xtext.bhdrkn.fouroperation.FouroperationPackage#getExpression_Left()
   * @model
   * @generated
   */
  BigDecimal getLeft();

  /**
   * Sets the value of the '{@link org.xtext.bhdrkn.fouroperation.Expression#getLeft <em>Left</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' attribute.
   * @see #getLeft()
   * @generated
   */
  void setLeft(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' attribute.
   * @see #setRight(BigDecimal)
   * @see org.xtext.bhdrkn.fouroperation.FouroperationPackage#getExpression_Right()
   * @model
   * @generated
   */
  BigDecimal getRight();

  /**
   * Sets the value of the '{@link org.xtext.bhdrkn.fouroperation.Expression#getRight <em>Right</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' attribute.
   * @see #getRight()
   * @generated
   */
  void setRight(BigDecimal value);

} // Expression
