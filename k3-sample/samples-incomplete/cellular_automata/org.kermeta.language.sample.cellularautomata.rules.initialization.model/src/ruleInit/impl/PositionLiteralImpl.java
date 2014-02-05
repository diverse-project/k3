/**
 */
package ruleInit.impl;

import core.impl.IntegerExpressionImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ruleInit.InitPackage;
import ruleInit.PositionLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ruleInit.impl.PositionLiteralImpl#getDimensionIndex <em>Dimension Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PositionLiteralImpl extends IntegerExpressionImpl implements PositionLiteral {
	/**
	 * The default value of the '{@link #getDimensionIndex() <em>Dimension Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int DIMENSION_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDimensionIndex() <em>Dimension Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionIndex()
	 * @generated
	 * @ordered
	 */
	protected int dimensionIndex = DIMENSION_INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InitPackage.Literals.POSITION_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDimensionIndex() {
		return dimensionIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensionIndex(int newDimensionIndex) {
		int oldDimensionIndex = dimensionIndex;
		dimensionIndex = newDimensionIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InitPackage.POSITION_LITERAL__DIMENSION_INDEX, oldDimensionIndex, dimensionIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InitPackage.POSITION_LITERAL__DIMENSION_INDEX:
				return getDimensionIndex();
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
			case InitPackage.POSITION_LITERAL__DIMENSION_INDEX:
				setDimensionIndex((Integer)newValue);
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
			case InitPackage.POSITION_LITERAL__DIMENSION_INDEX:
				setDimensionIndex(DIMENSION_INDEX_EDEFAULT);
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
			case InitPackage.POSITION_LITERAL__DIMENSION_INDEX:
				return dimensionIndex != DIMENSION_INDEX_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dimensionIndex: ");
		result.append(dimensionIndex);
		result.append(')');
		return result.toString();
	}

} //PositionLiteralImpl
