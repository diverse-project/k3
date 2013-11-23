/**
 */
package robot.FlotCtrl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import robot.FlotCtrl.BoolExp;
import robot.FlotCtrl.Expression;
import robot.FlotCtrl.FlotCtrlPackage;
import robot.FlotCtrl.WhileLoop;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link robot.FlotCtrl.impl.WhileLoopImpl#getLoopCond <em>Loop Cond</em>}</li>
 *   <li>{@link robot.FlotCtrl.impl.WhileLoopImpl#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhileLoopImpl extends MinimalEObjectImpl.Container implements WhileLoop {
	/**
	 * The cached value of the '{@link #getLoopCond() <em>Loop Cond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopCond()
	 * @generated
	 * @ordered
	 */
	protected BoolExp loopCond;

	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> block;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileLoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlotCtrlPackage.Literals.WHILE_LOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolExp getLoopCond() {
		return loopCond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopCond(BoolExp newLoopCond, NotificationChain msgs) {
		BoolExp oldLoopCond = loopCond;
		loopCond = newLoopCond;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlotCtrlPackage.WHILE_LOOP__LOOP_COND, oldLoopCond, newLoopCond);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopCond(BoolExp newLoopCond) {
		if (newLoopCond != loopCond) {
			NotificationChain msgs = null;
			if (loopCond != null)
				msgs = ((InternalEObject)loopCond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlotCtrlPackage.WHILE_LOOP__LOOP_COND, null, msgs);
			if (newLoopCond != null)
				msgs = ((InternalEObject)newLoopCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlotCtrlPackage.WHILE_LOOP__LOOP_COND, null, msgs);
			msgs = basicSetLoopCond(newLoopCond, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlotCtrlPackage.WHILE_LOOP__LOOP_COND, newLoopCond, newLoopCond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getBlock() {
		if (block == null) {
			block = new EObjectContainmentEList<Expression>(Expression.class, this, FlotCtrlPackage.WHILE_LOOP__BLOCK);
		}
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlotCtrlPackage.WHILE_LOOP__LOOP_COND:
				return basicSetLoopCond(null, msgs);
			case FlotCtrlPackage.WHILE_LOOP__BLOCK:
				return ((InternalEList<?>)getBlock()).basicRemove(otherEnd, msgs);
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
			case FlotCtrlPackage.WHILE_LOOP__LOOP_COND:
				return getLoopCond();
			case FlotCtrlPackage.WHILE_LOOP__BLOCK:
				return getBlock();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FlotCtrlPackage.WHILE_LOOP__LOOP_COND:
				setLoopCond((BoolExp)newValue);
				return;
			case FlotCtrlPackage.WHILE_LOOP__BLOCK:
				getBlock().clear();
				getBlock().addAll((Collection<? extends Expression>)newValue);
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
			case FlotCtrlPackage.WHILE_LOOP__LOOP_COND:
				setLoopCond((BoolExp)null);
				return;
			case FlotCtrlPackage.WHILE_LOOP__BLOCK:
				getBlock().clear();
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
			case FlotCtrlPackage.WHILE_LOOP__LOOP_COND:
				return loopCond != null;
			case FlotCtrlPackage.WHILE_LOOP__BLOCK:
				return block != null && !block.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WhileLoopImpl
