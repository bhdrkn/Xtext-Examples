/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.bhdrkn.function.function.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.bhdrkn.function.function.Call;
import org.xtext.bhdrkn.function.function.Define;
import org.xtext.bhdrkn.function.function.Function;
import org.xtext.bhdrkn.function.function.FunctionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.bhdrkn.function.function.impl.CallImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.bhdrkn.function.function.impl.CallImpl#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallImpl extends MinimalEObjectImpl.Container implements Call
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected Function name;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected Define args;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CallImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FunctionPackage.Literals.CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function getName()
  {
    if (name != null && name.eIsProxy())
    {
      InternalEObject oldName = (InternalEObject)name;
      name = (Function)eResolveProxy(oldName);
      if (name != oldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionPackage.CALL__NAME, oldName, name));
      }
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function basicGetName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(Function newName)
  {
    Function oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FunctionPackage.CALL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Define getArgs()
  {
    if (args != null && args.eIsProxy())
    {
      InternalEObject oldArgs = (InternalEObject)args;
      args = (Define)eResolveProxy(oldArgs);
      if (args != oldArgs)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionPackage.CALL__ARGS, oldArgs, args));
      }
    }
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Define basicGetArgs()
  {
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgs(Define newArgs)
  {
    Define oldArgs = args;
    args = newArgs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FunctionPackage.CALL__ARGS, oldArgs, args));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FunctionPackage.CALL__NAME:
        if (resolve) return getName();
        return basicGetName();
      case FunctionPackage.CALL__ARGS:
        if (resolve) return getArgs();
        return basicGetArgs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FunctionPackage.CALL__NAME:
        setName((Function)newValue);
        return;
      case FunctionPackage.CALL__ARGS:
        setArgs((Define)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FunctionPackage.CALL__NAME:
        setName((Function)null);
        return;
      case FunctionPackage.CALL__ARGS:
        setArgs((Define)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FunctionPackage.CALL__NAME:
        return name != null;
      case FunctionPackage.CALL__ARGS:
        return args != null;
    }
    return super.eIsSet(featureID);
  }

} //CallImpl
