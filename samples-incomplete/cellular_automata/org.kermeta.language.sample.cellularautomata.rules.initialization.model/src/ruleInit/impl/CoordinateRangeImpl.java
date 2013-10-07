/**
 */
package ruleInit.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ruleInit.CoordinateRange;
import ruleInit.InitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordinate Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ruleInit.impl.CoordinateRangeImpl#getLowerCoordinate <em>Lower Coordinate</em>}</li>
 *   <li>{@link ruleInit.impl.CoordinateRangeImpl#getUpperCoordinate <em>Upper Coordinate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoordinateRangeImpl extends EObjectImpl implements CoordinateRange {
	/**
	 * The default value of the '{@link #getLowerCoordinate() <em>Lower Coordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerCoordinate()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_COORDINATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowerCoordinate() <em>Lower Coordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerCoordinate()
	 * @generated
	 * @ordered
	 */
	protected int lowerCoordinate = LOWER_COORDINATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperCoordinate() <em>Upper Coordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperCoordinate()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_COORDINATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUpperCoordinate() <em>Upper Coordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperCoordinate()
	 * @generated
	 * @ordered
	 */
	protected int upperCoordinate = UPPER_COORDINATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinateRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InitPackage.Literals.COORDINATE_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLowerCoordinate() {
		return lowerCoordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerCoordinate(int newLowerCoordinate) {
		int oldLowerCoordinate = lowerCoordinate;
		lowerCoordinate = newLowerCoordinate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InitPackage.COORDINATE_RANGE__LOWER_COORDINATE, oldLowerCoordinate, lowerCoordinate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpperCoordinate() {
		return upperCoordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperCoordinate(int newUpperCoordinate) {
		int oldUpperCoordinate = upperCoordinate;
		upperCoordinate = newUpperCoordinate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InitPackage.COORDINATE_RANGE__UPPER_COORDINATE, oldUpperCoordinate, upperCoordinate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InitPackage.COORDINATE_RANGE__LOWER_COORDINATE:
				return getLowerCoordinate();
			case InitPackage.COORDINATE_RANGE__UPPER_COORDINATE:
				return getUpperCoordinate();
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
			case InitPackage.COORDINATE_RANGE__LOWER_COORDINATE:
				setLowerCoordinate((Integer)newValue);
				return;
			case InitPackage.COORDINATE_RANGE__UPPER_COORDINATE:
				setUpperCoordinate((Integer)newValue);
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
			case InitPackage.COORDINATE_RANGE__LOWER_COORDINATE:
				setLowerCoordinate(LOWER_COORDINATE_EDEFAULT);
				return;
			case InitPackage.COORDINATE_RANGE__UPPER_COORDINATE:
				setUpperCoordinate(UPPER_COORDINATE_EDEFAULT);
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
			case InitPackage.COORDINATE_RANGE__LOWER_COORDINATE:
				return lowerCoordinate != LOWER_COORDINATE_EDEFAULT;
			case InitPackage.COORDINATE_RANGE__UPPER_COORDINATE:
				return upperCoordinate != UPPER_COORDINATE_EDEFAULT;
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
		result.append(" (lowerCoordinate: ");
		result.append(lowerCoordinate);
		result.append(", upperCoordinate: ");
		result.append(upperCoordinate);
		result.append(')');
		return result.toString();
	}

} //CoordinateRangeImpl
