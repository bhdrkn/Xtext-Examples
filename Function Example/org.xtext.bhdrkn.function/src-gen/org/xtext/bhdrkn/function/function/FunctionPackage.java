/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.bhdrkn.function.function;

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
 * @see org.xtext.bhdrkn.function.function.FunctionFactory
 * @model kind="package"
 * @generated
 */
public interface FunctionPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "function";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/bhdrkn/function/Function";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "function";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FunctionPackage eINSTANCE = org.xtext.bhdrkn.function.function.impl.FunctionPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.bhdrkn.function.function.impl.FUNCFileImpl <em>FUNC File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.bhdrkn.function.function.impl.FUNCFileImpl
   * @see org.xtext.bhdrkn.function.function.impl.FunctionPackageImpl#getFUNCFile()
   * @generated
   */
  int FUNC_FÝLE = 0;

  /**
   * The feature id for the '<em><b>Defines</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_FÝLE__DEFÝNES = 0;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_FÝLE__FUNCTÝONS = 1;

  /**
   * The feature id for the '<em><b>Calls</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_FÝLE__CALLS = 2;

  /**
   * The number of structural features of the '<em>FUNC File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_FÝLE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.bhdrkn.function.function.impl.DefinesImpl <em>Defines</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.bhdrkn.function.function.impl.DefinesImpl
   * @see org.xtext.bhdrkn.function.function.impl.FunctionPackageImpl#getDefines()
   * @generated
   */
  int DEFÝNES = 1;

  /**
   * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFÝNES__DEFÝNÝTÝONS = 0;

  /**
   * The number of structural features of the '<em>Defines</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFÝNES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.bhdrkn.function.function.impl.DefineImpl <em>Define</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.bhdrkn.function.function.impl.DefineImpl
   * @see org.xtext.bhdrkn.function.function.impl.FunctionPackageImpl#getDefine()
   * @generated
   */
  int DEFÝNE = 2;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFÝNE__KEYWORD = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFÝNE__NAME = 1;

  /**
   * The number of structural features of the '<em>Define</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFÝNE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.bhdrkn.function.function.impl.FunctionsImpl <em>Functions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.bhdrkn.function.function.impl.FunctionsImpl
   * @see org.xtext.bhdrkn.function.function.impl.FunctionPackageImpl#getFunctions()
   * @generated
   */
  int FUNCTÝONS = 3;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTÝONS__FUNCTÝONS = 0;

  /**
   * The number of structural features of the '<em>Functions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTÝONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.bhdrkn.function.function.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.bhdrkn.function.function.impl.FunctionImpl
   * @see org.xtext.bhdrkn.function.function.impl.FunctionPackageImpl#getFunction()
   * @generated
   */
  int FUNCTÝON = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTÝON__NAME = 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTÝON__ARGS = 1;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTÝON_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.bhdrkn.function.function.impl.ArgumentImpl <em>Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.bhdrkn.function.function.impl.ArgumentImpl
   * @see org.xtext.bhdrkn.function.function.impl.FunctionPackageImpl#getArgument()
   * @generated
   */
  int ARGUMENT = 5;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__KEYWORD = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__NAME = 1;

  /**
   * The number of structural features of the '<em>Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.bhdrkn.function.function.impl.CallsImpl <em>Calls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.bhdrkn.function.function.impl.CallsImpl
   * @see org.xtext.bhdrkn.function.function.impl.FunctionPackageImpl#getCalls()
   * @generated
   */
  int CALLS = 6;

  /**
   * The feature id for the '<em><b>Calls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALLS__CALLS = 0;

  /**
   * The number of structural features of the '<em>Calls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALLS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.bhdrkn.function.function.impl.CallImpl <em>Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.bhdrkn.function.function.impl.CallImpl
   * @see org.xtext.bhdrkn.function.function.impl.FunctionPackageImpl#getCall()
   * @generated
   */
  int CALL = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL__NAME = 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL__ARGS = 1;

  /**
   * The number of structural features of the '<em>Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.xtext.bhdrkn.function.function.FUNCFile <em>FUNC File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FUNC File</em>'.
   * @see org.xtext.bhdrkn.function.function.FUNCFile
   * @generated
   */
  EClass getFUNCFile();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.bhdrkn.function.function.FUNCFile#getDefines <em>Defines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Defines</em>'.
   * @see org.xtext.bhdrkn.function.function.FUNCFile#getDefines()
   * @see #getFUNCFile()
   * @generated
   */
  EReference getFUNCFile_Defines();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.bhdrkn.function.function.FUNCFile#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Functions</em>'.
   * @see org.xtext.bhdrkn.function.function.FUNCFile#getFunctions()
   * @see #getFUNCFile()
   * @generated
   */
  EReference getFUNCFile_Functions();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.bhdrkn.function.function.FUNCFile#getCalls <em>Calls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Calls</em>'.
   * @see org.xtext.bhdrkn.function.function.FUNCFile#getCalls()
   * @see #getFUNCFile()
   * @generated
   */
  EReference getFUNCFile_Calls();

  /**
   * Returns the meta object for class '{@link org.xtext.bhdrkn.function.function.Defines <em>Defines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Defines</em>'.
   * @see org.xtext.bhdrkn.function.function.Defines
   * @generated
   */
  EClass getDefines();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.bhdrkn.function.function.Defines#getDefinitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Definitions</em>'.
   * @see org.xtext.bhdrkn.function.function.Defines#getDefinitions()
   * @see #getDefines()
   * @generated
   */
  EReference getDefines_Definitions();

  /**
   * Returns the meta object for class '{@link org.xtext.bhdrkn.function.function.Define <em>Define</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Define</em>'.
   * @see org.xtext.bhdrkn.function.function.Define
   * @generated
   */
  EClass getDefine();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.bhdrkn.function.function.Define#getKeyword <em>Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Keyword</em>'.
   * @see org.xtext.bhdrkn.function.function.Define#getKeyword()
   * @see #getDefine()
   * @generated
   */
  EAttribute getDefine_Keyword();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.bhdrkn.function.function.Define#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.bhdrkn.function.function.Define#getName()
   * @see #getDefine()
   * @generated
   */
  EAttribute getDefine_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.bhdrkn.function.function.Functions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Functions</em>'.
   * @see org.xtext.bhdrkn.function.function.Functions
   * @generated
   */
  EClass getFunctions();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.bhdrkn.function.function.Functions#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see org.xtext.bhdrkn.function.function.Functions#getFunctions()
   * @see #getFunctions()
   * @generated
   */
  EReference getFunctions_Functions();

  /**
   * Returns the meta object for class '{@link org.xtext.bhdrkn.function.function.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see org.xtext.bhdrkn.function.function.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.bhdrkn.function.function.Function#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.bhdrkn.function.function.Function#getName()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.bhdrkn.function.function.Function#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.xtext.bhdrkn.function.function.Function#getArgs()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Args();

  /**
   * Returns the meta object for class '{@link org.xtext.bhdrkn.function.function.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument</em>'.
   * @see org.xtext.bhdrkn.function.function.Argument
   * @generated
   */
  EClass getArgument();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.bhdrkn.function.function.Argument#getKeyword <em>Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Keyword</em>'.
   * @see org.xtext.bhdrkn.function.function.Argument#getKeyword()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Keyword();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.bhdrkn.function.function.Argument#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.bhdrkn.function.function.Argument#getName()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.bhdrkn.function.function.Calls <em>Calls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Calls</em>'.
   * @see org.xtext.bhdrkn.function.function.Calls
   * @generated
   */
  EClass getCalls();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.bhdrkn.function.function.Calls#getCalls <em>Calls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Calls</em>'.
   * @see org.xtext.bhdrkn.function.function.Calls#getCalls()
   * @see #getCalls()
   * @generated
   */
  EReference getCalls_Calls();

  /**
   * Returns the meta object for class '{@link org.xtext.bhdrkn.function.function.Call <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call</em>'.
   * @see org.xtext.bhdrkn.function.function.Call
   * @generated
   */
  EClass getCall();

  /**
   * Returns the meta object for the reference '{@link org.xtext.bhdrkn.function.function.Call#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see org.xtext.bhdrkn.function.function.Call#getName()
   * @see #getCall()
   * @generated
   */
  EReference getCall_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.bhdrkn.function.function.Call#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Args</em>'.
   * @see org.xtext.bhdrkn.function.function.Call#getArgs()
   * @see #getCall()
   * @generated
   */
  EReference getCall_Args();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FunctionFactory getFunctionFactory();

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
     * The meta object literal for the '{@link org.xtext.bhdrkn.function.function.impl.FUNCFileImpl <em>FUNC File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.bhdrkn.function.function.impl.FUNCFileImpl
     * @see org.xtext.bhdrkn.function.function.impl.FunctionPackageImpl#getFUNCFile()
     * @generated
     */
    EClass FUNC_FÝLE = eINSTANCE.getFUNCFile();

    /**
     * The meta object literal for the '<em><b>Defines</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNC_FÝLE__DEFÝNES = eINSTANCE.getFUNCFile_Defines();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNC_FÝLE__FUNCTÝONS = eINSTANCE.getFUNCFile_Functions();

    /**
     * The meta object literal for the '<em><b>Calls</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNC_FÝLE__CALLS = eINSTANCE.getFUNCFile_Calls();

    /**
     * The meta object literal for the '{@link org.xtext.bhdrkn.function.function.impl.DefinesImpl <em>Defines</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.bhdrkn.function.function.impl.DefinesImpl
     * @see org.xtext.bhdrkn.function.function.impl.FunctionPackageImpl#getDefines()
     * @generated
     */
    EClass DEFÝNES = eINSTANCE.getDefines();

    /**
     * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFÝNES__DEFÝNÝTÝONS = eINSTANCE.getDefines_Definitions();

    /**
     * The meta object literal for the '{@link org.xtext.bhdrkn.function.function.impl.DefineImpl <em>Define</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.bhdrkn.function.function.impl.DefineImpl
     * @see org.xtext.bhdrkn.function.function.impl.FunctionPackageImpl#getDefine()
     * @generated
     */
    EClass DEFÝNE = eINSTANCE.getDefine();

    /**
     * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFÝNE__KEYWORD = eINSTANCE.getDefine_Keyword();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFÝNE__NAME = eINSTANCE.getDefine_Name();

    /**
     * The meta object literal for the '{@link org.xtext.bhdrkn.function.function.impl.FunctionsImpl <em>Functions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.bhdrkn.function.function.impl.FunctionsImpl
     * @see org.xtext.bhdrkn.function.function.impl.FunctionPackageImpl#getFunctions()
     * @generated
     */
    EClass FUNCTÝONS = eINSTANCE.getFunctions();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTÝONS__FUNCTÝONS = eINSTANCE.getFunctions_Functions();

    /**
     * The meta object literal for the '{@link org.xtext.bhdrkn.function.function.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.bhdrkn.function.function.impl.FunctionImpl
     * @see org.xtext.bhdrkn.function.function.impl.FunctionPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTÝON = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTÝON__NAME = eINSTANCE.getFunction_Name();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTÝON__ARGS = eINSTANCE.getFunction_Args();

    /**
     * The meta object literal for the '{@link org.xtext.bhdrkn.function.function.impl.ArgumentImpl <em>Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.bhdrkn.function.function.impl.ArgumentImpl
     * @see org.xtext.bhdrkn.function.function.impl.FunctionPackageImpl#getArgument()
     * @generated
     */
    EClass ARGUMENT = eINSTANCE.getArgument();

    /**
     * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__KEYWORD = eINSTANCE.getArgument_Keyword();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__NAME = eINSTANCE.getArgument_Name();

    /**
     * The meta object literal for the '{@link org.xtext.bhdrkn.function.function.impl.CallsImpl <em>Calls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.bhdrkn.function.function.impl.CallsImpl
     * @see org.xtext.bhdrkn.function.function.impl.FunctionPackageImpl#getCalls()
     * @generated
     */
    EClass CALLS = eINSTANCE.getCalls();

    /**
     * The meta object literal for the '<em><b>Calls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALLS__CALLS = eINSTANCE.getCalls_Calls();

    /**
     * The meta object literal for the '{@link org.xtext.bhdrkn.function.function.impl.CallImpl <em>Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.bhdrkn.function.function.impl.CallImpl
     * @see org.xtext.bhdrkn.function.function.impl.FunctionPackageImpl#getCall()
     * @generated
     */
    EClass CALL = eINSTANCE.getCall();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL__NAME = eINSTANCE.getCall_Name();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL__ARGS = eINSTANCE.getCall_Args();

  }

} //FunctionPackage
