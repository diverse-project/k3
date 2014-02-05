/**
 */
package robot.FlotCtrl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import robot.FlotCtrl.AndExp;
import robot.FlotCtrl.BoolExp;
import robot.FlotCtrl.FlotCtrlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>And Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link robot.FlotCtrl.impl.AndExpImpl#getLeftExp <em>Left Exp</em>}</li>
 *   <li>{@link robot.FlotCtrl.impl.AndExpImpl#getRightExp <em>Right Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AndExpImpl extends MinimalEObjectImpl.Container implements AndExp {
	/**
	 * The cached value of the '{@link #getLeftExp() <em>Left Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftExp()
	 * @generated
	 * @ordered
	 */
	protected BoolExp leftExp;

	/**
	 * The cached value of the '{@link #getRightExp() <em>Right Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightExp()
	 * @generated
	 * @ordered
	 */
	protected BoolExp rightExp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlotCtrlPackage.Literals.AND_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolExp getLeftExp() {
		return leftExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftExp(BoolExp newLeftExp, NotificationChain msgs) {
		BoolExp oldLeftExp = leftExp;
		leftExp = newLeftExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlotCtrlPackage.AND_EXP__LEFT_EXP, oldLeftExp, newLeftExp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftExp(BoolExp newLeftExp) {
		if (newLeftExp != leftExp) {
			NotificationChain msgs = null;
			if (leftExp != null)
				msgs = ((InternalEObject)leftExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlotCtrlPackage.AND_EXP__LEFT_EXP, null, msgs);
			if (newLeftExp != null)
				msgs = ((InternalEObject)newLeftExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlotCtrlPackage.AND_EXP__LEFT_EXP, null, msgs);
			msgs = basicSetLeftExp(newLeftExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlotCtrlPackage.AND_EXP__LEFT_EXP, newLeftExp, newLeftExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolExp getRightExp() {
		return rightExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightExp(BoolExp newRightExp, NotificationChain msgs) {
		BoolExp oldRightExp = rightExp;
		rightExp = newRightExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlotCtrlPackage.AND_EXP__RIGHT_EXP, oldRightExp, newRightExp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightExp(BoolExp newRightExp) {
		if (newRightExp != rightExp) {
			NotificationChain msgs = null;
			if (rightExp != null)
				msgs = ((InternalEObject)rightExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlotCtrlPackage.AND_EXP__RIGHT_EXP, null, msgs);
			if (newRightExp != null)
				msgs = ((InternalEObject)newRightExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlotCtrlPackage.AND_EXP__RIGHT_EXP, null, msgs);
			msgs = basicSetRightExp(newRightExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlotCtrlPackage.AND_EXP__RIGHT_EXP, newRightExp, newRightExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlotCtrlPackage.AND_EXP__LEFT_EXP:
				return basicSetLeftExp(null, msgs);
			case FlotCtrlPackage.AND_EXP__RIGHT_EXP:
				return basicSetRightExp(null, msgs);
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
			case FlotCtrlPackage.AND_EXP__LEFT_EXP:
				return getLeftExp();
			case FlotCtrlPackage.AND_EXP__RIGHT_EXP:
				return getRightExp();
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
			case FlotCtrlPackage.AND_EXP__LEFT_EXP:
				setLeftExp((BoolExp)newValue);
				return;
			case FlotCtrlPackage.AND_EXP__RIGHT_EXP:
				setRightExp((BoolExp)newValue);
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
			case FlotCtrlPackage.AND_EXP__LEFT_EXP:
				setLeftExp((BoolExp)null);
				return;
			case FlotCtrlPackage.AND_EXP__RIGHT_EXP:
				setRightExp((BoolExp)null);
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
			case FlotCtrlPackage.AND_EXP__LEFT_EXP:
				return leftExp != null;
			case FlotCtrlPackage.AND_EXP__RIGHT_EXP:
				return rightExp != null;
		}
		return super.eIsSet(featureID);
	}

} //AndExpImpl
