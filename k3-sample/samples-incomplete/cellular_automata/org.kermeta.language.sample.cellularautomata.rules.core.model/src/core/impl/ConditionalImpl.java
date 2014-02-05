/**
 */
package core.impl;

import core.Conditional;
import core.CorePackage;
import core.IntegerExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link core.impl.ConditionalImpl#getIfTrueExpression <em>If True Expression</em>}</li>
 *   <li>{@link core.impl.ConditionalImpl#getIfFalseExpression <em>If False Expression</em>}</li>
 *   <li>{@link core.impl.ConditionalImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalImpl extends IntegerExpressionImpl implements Conditional {
	/**
	 * The cached value of the '{@link #getIfTrueExpression() <em>If True Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfTrueExpression()
	 * @generated
	 * @ordered
	 */
	protected IntegerExpression ifTrueExpression;

	/**
	 * The cached value of the '{@link #getIfFalseExpression() <em>If False Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfFalseExpression()
	 * @generated
	 * @ordered
	 */
	protected IntegerExpression ifFalseExpression;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected IntegerExpression condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CONDITIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression getIfTrueExpression() {
		return ifTrueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfTrueExpression(IntegerExpression newIfTrueExpression, NotificationChain msgs) {
		IntegerExpression oldIfTrueExpression = ifTrueExpression;
		ifTrueExpression = newIfTrueExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CONDITIONAL__IF_TRUE_EXPRESSION, oldIfTrueExpression, newIfTrueExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfTrueExpression(IntegerExpression newIfTrueExpression) {
		if (newIfTrueExpression != ifTrueExpression) {
			NotificationChain msgs = null;
			if (ifTrueExpression != null)
				msgs = ((InternalEObject)ifTrueExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONDITIONAL__IF_TRUE_EXPRESSION, null, msgs);
			if (newIfTrueExpression != null)
				msgs = ((InternalEObject)newIfTrueExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONDITIONAL__IF_TRUE_EXPRESSION, null, msgs);
			msgs = basicSetIfTrueExpression(newIfTrueExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONDITIONAL__IF_TRUE_EXPRESSION, newIfTrueExpression, newIfTrueExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression getIfFalseExpression() {
		return ifFalseExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfFalseExpression(IntegerExpression newIfFalseExpression, NotificationChain msgs) {
		IntegerExpression oldIfFalseExpression = ifFalseExpression;
		ifFalseExpression = newIfFalseExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CONDITIONAL__IF_FALSE_EXPRESSION, oldIfFalseExpression, newIfFalseExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfFalseExpression(IntegerExpression newIfFalseExpression) {
		if (newIfFalseExpression != ifFalseExpression) {
			NotificationChain msgs = null;
			if (ifFalseExpression != null)
				msgs = ((InternalEObject)ifFalseExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONDITIONAL__IF_FALSE_EXPRESSION, null, msgs);
			if (newIfFalseExpression != null)
				msgs = ((InternalEObject)newIfFalseExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONDITIONAL__IF_FALSE_EXPRESSION, null, msgs);
			msgs = basicSetIfFalseExpression(newIfFalseExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONDITIONAL__IF_FALSE_EXPRESSION, newIfFalseExpression, newIfFalseExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExpression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(IntegerExpression newCondition, NotificationChain msgs) {
		IntegerExpression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CONDITIONAL__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(IntegerExpression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONDITIONAL__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONDITIONAL__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONDITIONAL__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CONDITIONAL__IF_TRUE_EXPRESSION:
				return basicSetIfTrueExpression(null, msgs);
			case CorePackage.CONDITIONAL__IF_FALSE_EXPRESSION:
				return basicSetIfFalseExpression(null, msgs);
			case CorePackage.CONDITIONAL__CONDITION:
				return basicSetCondition(null, msgs);
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
			case CorePackage.CONDITIONAL__IF_TRUE_EXPRESSION:
				return getIfTrueExpression();
			case CorePackage.CONDITIONAL__IF_FALSE_EXPRESSION:
				return getIfFalseExpression();
			case CorePackage.CONDITIONAL__CONDITION:
				return getCondition();
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
			case CorePackage.CONDITIONAL__IF_TRUE_EXPRESSION:
				setIfTrueExpression((IntegerExpression)newValue);
				return;
			case CorePackage.CONDITIONAL__IF_FALSE_EXPRESSION:
				setIfFalseExpression((IntegerExpression)newValue);
				return;
			case CorePackage.CONDITIONAL__CONDITION:
				setCondition((IntegerExpression)newValue);
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
			case CorePackage.CONDITIONAL__IF_TRUE_EXPRESSION:
				setIfTrueExpression((IntegerExpression)null);
				return;
			case CorePackage.CONDITIONAL__IF_FALSE_EXPRESSION:
				setIfFalseExpression((IntegerExpression)null);
				return;
			case CorePackage.CONDITIONAL__CONDITION:
				setCondition((IntegerExpression)null);
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
			case CorePackage.CONDITIONAL__IF_TRUE_EXPRESSION:
				return ifTrueExpression != null;
			case CorePackage.CONDITIONAL__IF_FALSE_EXPRESSION:
				return ifFalseExpression != null;
			case CorePackage.CONDITIONAL__CONDITION:
				return condition != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalImpl
