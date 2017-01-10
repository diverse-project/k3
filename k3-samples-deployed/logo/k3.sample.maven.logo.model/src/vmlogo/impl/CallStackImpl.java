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
import vmlogo.StackFrame;
import vmlogo.VmlogoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Stack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vmlogo.impl.CallStackImpl#getFrames <em>Frames</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallStackImpl extends MinimalEObjectImpl.Container implements CallStack {
	/**
	 * The cached value of the '{@link #getFrames() <em>Frames</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrames()
	 * @generated
	 * @ordered
	 */
	protected StackFrame frames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallStackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmlogoPackage.Literals.CALL_STACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StackFrame getFrames() {
		return frames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrames(StackFrame newFrames, NotificationChain msgs) {
		StackFrame oldFrames = frames;
		frames = newFrames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VmlogoPackage.CALL_STACK__FRAMES, oldFrames, newFrames);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrames(StackFrame newFrames) {
		if (newFrames != frames) {
			NotificationChain msgs = null;
			if (frames != null)
				msgs = ((InternalEObject)frames).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VmlogoPackage.CALL_STACK__FRAMES, null, msgs);
			if (newFrames != null)
				msgs = ((InternalEObject)newFrames).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VmlogoPackage.CALL_STACK__FRAMES, null, msgs);
			msgs = basicSetFrames(newFrames, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmlogoPackage.CALL_STACK__FRAMES, newFrames, newFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VmlogoPackage.CALL_STACK__FRAMES:
				return basicSetFrames(null, msgs);
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
			case VmlogoPackage.CALL_STACK__FRAMES:
				return getFrames();
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
			case VmlogoPackage.CALL_STACK__FRAMES:
				setFrames((StackFrame)newValue);
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
			case VmlogoPackage.CALL_STACK__FRAMES:
				setFrames((StackFrame)null);
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
			case VmlogoPackage.CALL_STACK__FRAMES:
				return frames != null;
		}
		return super.eIsSet(featureID);
	}

} //CallStackImpl
