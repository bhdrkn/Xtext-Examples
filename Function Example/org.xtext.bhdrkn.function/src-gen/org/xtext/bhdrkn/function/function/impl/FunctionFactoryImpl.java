/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.bhdrkn.function.function.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.bhdrkn.function.function.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionFactoryImpl extends EFactoryImpl implements FunctionFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FunctionFactory init()
  {
    try
    {
      FunctionFactory theFunctionFactory = (FunctionFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/bhdrkn/function/Function"); 
      if (theFunctionFactory != null)
      {
        return theFunctionFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FunctionFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FunctionPackage.FUNC_FÝLE: return createFUNCFile();
      case FunctionPackage.FUNCTÝONS: return createFunctions();
      case FunctionPackage.FUNCTÝON: return createFunction();
      case FunctionPackage.CALLS: return createCalls();
      case FunctionPackage.CALL: return createCall();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FUNCFile createFUNCFile()
  {
    FUNCFileImpl funcFile = new FUNCFileImpl();
    return funcFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Functions createFunctions()
  {
    FunctionsImpl functions = new FunctionsImpl();
    return functions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Calls createCalls()
  {
    CallsImpl calls = new CallsImpl();
    return calls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Call createCall()
  {
    CallImpl call = new CallImpl();
    return call;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionPackage getFunctionPackage()
  {
    return (FunctionPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FunctionPackage getPackage()
  {
    return FunctionPackage.eINSTANCE;
  }

} //FunctionFactoryImpl
