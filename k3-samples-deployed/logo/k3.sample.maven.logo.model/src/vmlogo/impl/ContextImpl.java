/**
 */
package vmlogo.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import vmlogo.CallStack;
import vmlogo.Context;
import vmlogo.Turtle;
import vmlogo.VmlogoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vmlogo.impl.ContextImpl#getTurtle <em>Turtle</em>}</li>
 *   <li>{@link vmlogo.impl.ContextImpl#getCallStack <em>Call Stack</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextImpl extends MinimalEObjectImpl.Container implements Context {
	/**
	 * The cached value of the '{@link #getTurtle() <em>Turtle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurtle()
	 * @generated
	 * @ordered
	 */
	protected Turtle turtle;

	/**
	 * The cached value of the '{@link #getCallStack() <em>Call Stack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallStack()
	 * @generated
	 * @ordered
	 */
	protected CallStack callStack;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmlogoPackage.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Turtle getTurtle() {
		return turtle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTurtle(Turtle newTurtle, NotificationChain msgs) {
		Turtle oldTurtle = turtle;
		turtle = newTurtle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VmlogoPackage.CONTEXT__TURTLE, oldTurtle, newTurtle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTurtle(Turtle newTurtle) {
		if (newTurtle != turtle) {
			NotificationChain msgs = null;
			if (turtle != null)
				msgs = ((InternalEObject)turtle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VmlogoPackage.CONTEXT__TURTLE, null, msgs);
			if (newTurtle != null)
				msgs = ((InternalEObject)newTurtle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VmlogoPackage.CONTEXT__TURTLE, null, msgs);
			msgs = basicSetTurtle(newTurtle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmlogoPackage.CONTEXT__TURTLE, newTurtle, newTurtle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallStack getCallStack() {
		return callStack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallStack(CallStack newCallStack, NotificationChain msgs) {
		CallStack oldCallStack = callStack;
		callStack = newCallStack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VmlogoPackage.CONTEXT__CALL_STACK, oldCallStack, newCallStack);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallStack(CallStack newCallStack) {
		if (newCallStack != callStack) {
			NotificationChain msgs = null;
			if (callStack != null)
				msgs = ((InternalEObject)callStack).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VmlogoPackage.CONTEXT__CALL_STACK, null, msgs);
			if (newCallStack != null)
				msgs = ((InternalEObject)newCallStack).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VmlogoPackage.CONTEXT__CALL_STACK, null, msgs);
			msgs = basicSetCallStack(newCallStack, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmlogoPackage.CONTEXT__CALL_STACK, newCallStack, newCallStack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VmlogoPackage.CONTEXT__TURTLE:
				return basicSetTurtle(null, msgs);
			case VmlogoPackage.CONTEXT__CALL_STACK:
				return basicSetCallStack(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VmlogoPackage.CONTEXT__TURTLE:
				return getTurtle();
			case VmlogoPackage.CONTEXT__CALL_STACK:
				return getCallStack();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VmlogoPackage.CONTEXT__TURTLE:
				setTurtle((Turtle)newValue);
				return;
			case VmlogoPackage.CONTEXT__CALL_STACK:
				setCallStack((CallStack)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case VmlogoPackage.CONTEXT__TURTLE:
				setTurtle((Turtle)null);
				return;
			case VmlogoPackage.CONTEXT__CALL_STACK:
				setCallStack((CallStack)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VmlogoPackage.CONTEXT__TURTLE:
				return turtle != null;
			case VmlogoPackage.CONTEXT__CALL_STACK:
				return callStack != null;
		}
		return super.eIsSet(featureID);
	}

} //ContextImpl
