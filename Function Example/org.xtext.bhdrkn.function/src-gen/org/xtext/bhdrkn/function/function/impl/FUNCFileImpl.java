/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.bhdrkn.function.function.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.bhdrkn.function.function.Calls;
import org.xtext.bhdrkn.function.function.Defines;
import org.xtext.bhdrkn.function.function.FUNCFile;
import org.xtext.bhdrkn.function.function.FunctionPackage;
import org.xtext.bhdrkn.function.function.Functions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FUNC File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.bhdrkn.function.function.impl.FUNCFileImpl#getDefines <em>Defines</em>}</li>
 *   <li>{@link org.xtext.bhdrkn.function.function.impl.FUNCFileImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.xtext.bhdrkn.function.function.impl.FUNCFileImpl#getCalls <em>Calls</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FUNCFileImpl extends MinimalEObjectImpl.Container implements FUNCFile
{
  /**
   * The cached value of the '{@link #getDefines() <em>Defines</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefines()
   * @generated
   * @ordered
   */
  protected Defines defines;

  /**
   * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctions()
   * @generated
   * @ordered
   */
  protected Functions functions;

  /**
   * The cached value of the '{@link #getCalls() <em>Calls</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCalls()
   * @generated
   * @ordered
   */
  protected Calls calls;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FUNCFileImpl()
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
    return FunctionPackage.Literals.FUNC_FÝLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Defines getDefines()
  {
    return defines;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefines(Defines newDefines, NotificationChain msgs)
  {
    Defines oldDefines = defines;
    defines = newDefines;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionPackage.FUNC_FÝLE__DEFÝNES, oldDefines, newDefines);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefines(Defines newDefines)
  {
    if (newDefines != defines)
    {
      NotificationChain msgs = null;
      if (defines != null)
        msgs = ((InternalEObject)defines).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionPackage.FUNC_FÝLE__DEFÝNES, null, msgs);
      if (newDefines != null)
        msgs = ((InternalEObject)newDefines).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionPackage.FUNC_FÝLE__DEFÝNES, null, msgs);
      msgs = basicSetDefines(newDefines, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FunctionPackage.FUNC_FÝLE__DEFÝNES, newDefines, newDefines));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Functions getFunctions()
  {
    return functions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunctions(Functions newFunctions, NotificationChain msgs)
  {
    Functions oldFunctions = functions;
    functions = newFunctions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionPackage.FUNC_FÝLE__FUNCTÝONS, oldFunctions, newFunctions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctions(Functions newFunctions)
  {
    if (newFunctions != functions)
    {
      NotificationChain msgs = null;
      if (functions != null)
        msgs = ((InternalEObject)functions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionPackage.FUNC_FÝLE__FUNCTÝONS, null, msgs);
      if (newFunctions != null)
        msgs = ((InternalEObject)newFunctions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionPackage.FUNC_FÝLE__FUNCTÝONS, null, msgs);
      msgs = basicSetFunctions(newFunctions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FunctionPackage.FUNC_FÝLE__FUNCTÝONS, newFunctions, newFunctions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Calls getCalls()
  {
    return calls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCalls(Calls newCalls, NotificationChain msgs)
  {
    Calls oldCalls = calls;
    calls = newCalls;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionPackage.FUNC_FÝLE__CALLS, oldCalls, newCalls);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCalls(Calls newCalls)
  {
    if (newCalls != calls)
    {
      NotificationChain msgs = null;
      if (calls != null)
        msgs = ((InternalEObject)calls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionPackage.FUNC_FÝLE__CALLS, null, msgs);
      if (newCalls != null)
        msgs = ((InternalEObject)newCalls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionPackage.FUNC_FÝLE__CALLS, null, msgs);
      msgs = basicSetCalls(newCalls, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FunctionPackage.FUNC_FÝLE__CALLS, newCalls, newCalls));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FunctionPackage.FUNC_FÝLE__DEFÝNES:
        return basicSetDefines(null, msgs);
      case FunctionPackage.FUNC_FÝLE__FUNCTÝONS:
        return basicSetFunctions(null, msgs);
      case FunctionPackage.FUNC_FÝLE__CALLS:
        return basicSetCalls(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case FunctionPackage.FUNC_FÝLE__DEFÝNES:
        return getDefines();
      case FunctionPackage.FUNC_FÝLE__FUNCTÝONS:
        return getFunctions();
      case FunctionPackage.FUNC_FÝLE__CALLS:
        return getCalls();
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
      case FunctionPackage.FUNC_FÝLE__DEFÝNES:
        setDefines((Defines)newValue);
        return;
      case FunctionPackage.FUNC_FÝLE__FUNCTÝONS:
        setFunctions((Functions)newValue);
        return;
      case FunctionPackage.FUNC_FÝLE__CALLS:
        setCalls((Calls)newValue);
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
      case FunctionPackage.FUNC_FÝLE__DEFÝNES:
        setDefines((Defines)null);
        return;
      case FunctionPackage.FUNC_FÝLE__FUNCTÝONS:
        setFunctions((Functions)null);
        return;
      case FunctionPackage.FUNC_FÝLE__CALLS:
        setCalls((Calls)null);
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
      case FunctionPackage.FUNC_FÝLE__DEFÝNES:
        return defines != null;
      case FunctionPackage.FUNC_FÝLE__FUNCTÝONS:
        return functions != null;
      case FunctionPackage.FUNC_FÝLE__CALLS:
        return calls != null;
    }
    return super.eIsSet(featureID);
  }

} //FUNCFileImpl
