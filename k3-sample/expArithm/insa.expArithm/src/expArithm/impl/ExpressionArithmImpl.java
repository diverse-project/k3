/**
 */
package expArithm.impl;

import expArithm.EltExp;
import expArithm.ExpArithmPackage;
import expArithm.ExpressionArithm;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Arithm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link expArithm.impl.ExpressionArithmImpl#getRacine <em>Racine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionArithmImpl extends EObjectImpl implements ExpressionArithm {
	/**
	 * The cached value of the '{@link #getRacine() <em>Racine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRacine()
	 * @generated
	 * @ordered
	 */
	protected EltExp racine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionArithmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpArithmPackage.Literals.EXPRESSION_ARITHM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EltExp getRacine() {
		return racine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRacine(EltExp newRacine, NotificationChain msgs) {
		EltExp oldRacine = racine;
		racine = newRacine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpArithmPackage.EXPRESSION_ARITHM__RACINE, oldRacine, newRacine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRacine(EltExp newRacine) {
		if (newRacine != racine) {
			NotificationChain msgs = null;
			if (racine != null)
				msgs = ((InternalEObject)racine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpArithmPackage.EXPRESSION_ARITHM__RACINE, null, msgs);
			if (newRacine != null)
				msgs = ((InternalEObject)newRacine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpArithmPackage.EXPRESSION_ARITHM__RACINE, null, msgs);
			msgs = basicSetRacine(newRacine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpArithmPackage.EXPRESSION_ARITHM__RACINE, newRacine, newRacine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpArithmPackage.EXPRESSION_ARITHM__RACINE:
				return basicSetRacine(null, msgs);
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
			case ExpArithmPackage.EXPRESSION_ARITHM__RACINE:
				return getRacine();
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
			case ExpArithmPackage.EXPRESSION_ARITHM__RACINE:
				setRacine((EltExp)newValue);
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
			case ExpArithmPackage.EXPRESSION_ARITHM__RACINE:
				setRacine((EltExp)null);
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
			case ExpArithmPackage.EXPRESSION_ARITHM__RACINE:
				return racine != null;
		}
		return super.eIsSet(featureID);
	}

} //ExpressionArithmImpl
