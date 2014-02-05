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
import robot.FlotCtrl.IfBlock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link robot.FlotCtrl.impl.IfBlockImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link robot.FlotCtrl.impl.IfBlockImpl#getThenBlock <em>Then Block</em>}</li>
 *   <li>{@link robot.FlotCtrl.impl.IfBlockImpl#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfBlockImpl extends MinimalEObjectImpl.Container implements IfBlock {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected BoolExp condition;

	/**
	 * The cached value of the '{@link #getThenBlock() <em>Then Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> thenBlock;

	/**
	 * The cached value of the '{@link #getElseBlock() <em>Else Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> elseBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlotCtrlPackage.Literals.IF_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolExp getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(BoolExp newCondition, NotificationChain msgs) {
		BoolExp oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlotCtrlPackage.IF_BLOCK__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(BoolExp newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlotCtrlPackage.IF_BLOCK__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlotCtrlPackage.IF_BLOCK__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlotCtrlPackage.IF_BLOCK__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getThenBlock() {
		if (thenBlock == null) {
			thenBlock = new EObjectContainmentEList<Expression>(Expression.class, this, FlotCtrlPackage.IF_BLOCK__THEN_BLOCK);
		}
		return thenBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getElseBlock() {
		if (elseBlock == null) {
			elseBlock = new EObjectContainmentEList<Expression>(Expression.class, this, FlotCtrlPackage.IF_BLOCK__ELSE_BLOCK);
		}
		return elseBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlotCtrlPackage.IF_BLOCK__CONDITION:
				return basicSetCondition(null, msgs);
			case FlotCtrlPackage.IF_BLOCK__THEN_BLOCK:
				return ((InternalEList<?>)getThenBlock()).basicRemove(otherEnd, msgs);
			case FlotCtrlPackage.IF_BLOCK__ELSE_BLOCK:
				return ((InternalEList<?>)getElseBlock()).basicRemove(otherEnd, msgs);
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
			case FlotCtrlPackage.IF_BLOCK__CONDITION:
				return getCondition();
			case FlotCtrlPackage.IF_BLOCK__THEN_BLOCK:
				return getThenBlock();
			case FlotCtrlPackage.IF_BLOCK__ELSE_BLOCK:
				return getElseBlock();
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
			case FlotCtrlPackage.IF_BLOCK__CONDITION:
				setCondition((BoolExp)newValue);
				return;
			case FlotCtrlPackage.IF_BLOCK__THEN_BLOCK:
				getThenBlock().clear();
				getThenBlock().addAll((Collection<? extends Expression>)newValue);
				return;
			case FlotCtrlPackage.IF_BLOCK__ELSE_BLOCK:
				getElseBlock().clear();
				getElseBlock().addAll((Collection<? extends Expression>)newValue);
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
			case FlotCtrlPackage.IF_BLOCK__CONDITION:
				setCondition((BoolExp)null);
				return;
			case FlotCtrlPackage.IF_BLOCK__THEN_BLOCK:
				getThenBlock().clear();
				return;
			case FlotCtrlPackage.IF_BLOCK__ELSE_BLOCK:
				getElseBlock().clear();
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
			case FlotCtrlPackage.IF_BLOCK__CONDITION:
				return condition != null;
			case FlotCtrlPackage.IF_BLOCK__THEN_BLOCK:
				return thenBlock != null && !thenBlock.isEmpty();
			case FlotCtrlPackage.IF_BLOCK__ELSE_BLOCK:
				return elseBlock != null && !elseBlock.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfBlockImpl
