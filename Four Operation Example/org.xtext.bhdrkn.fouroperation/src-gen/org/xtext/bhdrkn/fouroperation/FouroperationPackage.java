/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.bhdrkn.fouroperation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.bhdrkn.fouroperation.FouroperationFactory
 * @model kind="package"
 * @generated
 */
public interface FouroperationPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "fouroperation";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/bhdrkn/Fouroperation";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "fouroperation";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FouroperationPackage eINSTANCE = org.xtext.bhdrkn.fouroperation.impl.FouroperationPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.bhdrkn.fouroperation.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.bhdrkn.fouroperation.impl.OperationImpl
   * @see org.xtext.bhdrkn.fouroperation.impl.FouroperationPackageImpl#getOperation()
   * @generated
   */
  int OPERATÝON = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATÝON__NAME = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATÝON__STATEMENTS = 1;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATÝON_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.bhdrkn.fouroperation.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.bhdrkn.fouroperation.impl.StatementImpl
   * @see org.xtext.bhdrkn.fouroperation.impl.FouroperationPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__EXPRESSÝON = 0;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.bhdrkn.fouroperation.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.bhdrkn.fouroperation.impl.ExpressionImpl
   * @see org.xtext.bhdrkn.fouroperation.impl.FouroperationPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSÝON = 2;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSÝON__LEFT = 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSÝON__RÝGHT = 1;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSÝON_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.bhdrkn.fouroperation.impl.AdditionImpl <em>Addition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.bhdrkn.fouroperation.impl.AdditionImpl
   * @see org.xtext.bhdrkn.fouroperation.impl.FouroperationPackageImpl#getAddition()
   * @generated
   */
  int ADDÝTÝON = 3;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDÝTÝON__LEFT = EXPRESSÝON__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDÝTÝON__RÝGHT = EXPRESSÝON__RÝGHT;

  /**
   * The number of structural features of the '<em>Addition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDÝTÝON_FEATURE_COUNT = EXPRESSÝON_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.bhdrkn.fouroperation.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.bhdrkn.fouroperation.impl.MinusImpl
   * @see org.xtext.bhdrkn.fouroperation.impl.FouroperationPackageImpl#getMinus()
   * @generated
   */
  int MÝNUS = 4;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MÝNUS__LEFT = EXPRESSÝON__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MÝNUS__RÝGHT = EXPRESSÝON__RÝGHT;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MÝNUS_FEATURE_COUNT = EXPRESSÝON_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.bhdrkn.fouroperation.impl.MultiImpl <em>Multi</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.bhdrkn.fouroperation.impl.MultiImpl
   * @see org.xtext.bhdrkn.fouroperation.impl.FouroperationPackageImpl#getMulti()
   * @generated
   */
  int MULTÝ = 5;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTÝ__LEFT = EXPRESSÝON__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTÝ__RÝGHT = EXPRESSÝON__RÝGHT;

  /**
   * The number of structural features of the '<em>Multi</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTÝ_FEATURE_COUNT = EXPRESSÝON_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.bhdrkn.fouroperation.impl.DivImpl <em>Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.bhdrkn.fouroperation.impl.DivImpl
   * @see org.xtext.bhdrkn.fouroperation.impl.FouroperationPackageImpl#getDiv()
   * @generated
   */
  int DÝV = 6;

  /**
   * The feature id for the '<em><b>Left</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DÝV__LEFT = EXPRESSÝON__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DÝV__RÝGHT = EXPRESSÝON__RÝGHT;

  /**
   * The number of structural features of the '<em>Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DÝV_FEATURE_COUNT = EXPRESSÝON_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.xtext.bhdrkn.fouroperation.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see org.xtext.bhdrkn.fouroperation.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.bhdrkn.fouroperation.Operation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.bhdrkn.fouroperation.Operation#getName()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.bhdrkn.fouroperation.Operation#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.xtext.bhdrkn.fouroperation.Operation#getStatements()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Statements();

  /**
   * Returns the meta object for class '{@link org.xtext.bhdrkn.fouroperation.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.xtext.bhdrkn.fouroperation.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.bhdrkn.fouroperation.Statement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.bhdrkn.fouroperation.Statement#getExpression()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.bhdrkn.fouroperation.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.xtext.bhdrkn.fouroperation.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.bhdrkn.fouroperation.Expression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left</em>'.
   * @see org.xtext.bhdrkn.fouroperation.Expression#getLeft()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.bhdrkn.fouroperation.Expression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right</em>'.
   * @see org.xtext.bhdrkn.fouroperation.Expression#getRight()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.bhdrkn.fouroperation.Addition <em>Addition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Addition</em>'.
   * @see org.xtext.bhdrkn.fouroperation.Addition
   * @generated
   */
  EClass getAddition();

  /**
   * Returns the meta object for class '{@link org.xtext.bhdrkn.fouroperation.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see org.xtext.bhdrkn.fouroperation.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for class '{@link org.xtext.bhdrkn.fouroperation.Multi <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi</em>'.
   * @see org.xtext.bhdrkn.fouroperation.Multi
   * @generated
   */
  EClass getMulti();

  /**
   * Returns the meta object for class '{@link org.xtext.bhdrkn.fouroperation.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Div</em>'.
   * @see org.xtext.bhdrkn.fouroperation.Div
   * @generated
   */
  EClass getDiv();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FouroperationFactory getFouroperationFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.bhdrkn.fouroperation.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.bhdrkn.fouroperation.impl.OperationImpl
     * @see org.xtext.bhdrkn.fouroperation.impl.FouroperationPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATÝON = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATÝON__NAME = eINSTANCE.getOperation_Name();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATÝON__STATEMENTS = eINSTANCE.getOperation_Statements();

    /**
     * The meta object literal for the '{@link org.xtext.bhdrkn.fouroperation.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.bhdrkn.fouroperation.impl.StatementImpl
     * @see org.xtext.bhdrkn.fouroperation.impl.FouroperationPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__EXPRESSÝON = eINSTANCE.getStatement_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.bhdrkn.fouroperation.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.bhdrkn.fouroperation.impl.ExpressionImpl
     * @see org.xtext.bhdrkn.fouroperation.impl.FouroperationPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSÝON = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSÝON__LEFT = eINSTANCE.getExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSÝON__RÝGHT = eINSTANCE.getExpression_Right();

    /**
     * The meta object literal for the '{@link org.xtext.bhdrkn.fouroperation.impl.AdditionImpl <em>Addition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.bhdrkn.fouroperation.impl.AdditionImpl
     * @see org.xtext.bhdrkn.fouroperation.impl.FouroperationPackageImpl#getAddition()
     * @generated
     */
    EClass ADDÝTÝON = eINSTANCE.getAddition();

    /**
     * The meta object literal for the '{@link org.xtext.bhdrkn.fouroperation.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.bhdrkn.fouroperation.impl.MinusImpl
     * @see org.xtext.bhdrkn.fouroperation.impl.FouroperationPackageImpl#getMinus()
     * @generated
     */
    EClass MÝNUS = eINSTANCE.getMinus();

    /**
     * The meta object literal for the '{@link org.xtext.bhdrkn.fouroperation.impl.MultiImpl <em>Multi</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.bhdrkn.fouroperation.impl.MultiImpl
     * @see org.xtext.bhdrkn.fouroperation.impl.FouroperationPackageImpl#getMulti()
     * @generated
     */
    EClass MULTÝ = eINSTANCE.getMulti();

    /**
     * The meta object literal for the '{@link org.xtext.bhdrkn.fouroperation.impl.DivImpl <em>Div</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.bhdrkn.fouroperation.impl.DivImpl
     * @see org.xtext.bhdrkn.fouroperation.impl.FouroperationPackageImpl#getDiv()
     * @generated
     */
    EClass DÝV = eINSTANCE.getDiv();

  }

} //FouroperationPackage
