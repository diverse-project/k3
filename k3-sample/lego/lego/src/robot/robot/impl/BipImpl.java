/**
 */
package robot.robot.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import robot.robot.Bip;
import robot.robot.RobotPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bip</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link robot.robot.impl.BipImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link robot.robot.impl.BipImpl#getPower <em>Power</em>}</li>
 *   <li>{@link robot.robot.impl.BipImpl#getRepet <em>Repet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BipImpl extends MinimalEObjectImpl.Container implements Bip {
	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Integer duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected static final Double POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected Double power = POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepet() <em>Repet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepet()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REPET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepet() <em>Repet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepet()
	 * @generated
	 * @ordered
	 */
	protected Boolean repet = REPET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RobotPackage.Literals.BIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Integer newDuration) {
		Integer oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotPackage.BIP__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPower() {
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower(Double newPower) {
		Double oldPower = power;
		power = newPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotPackage.BIP__POWER, oldPower, power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getRepet() {
		return repet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepet(Boolean newRepet) {
		Boolean oldRepet = repet;
		repet = newRepet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RobotPackage.BIP__REPET, oldRepet, repet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RobotPackage.BIP__DURATION:
				return getDuration();
			case RobotPackage.BIP__POWER:
				return getPower();
			case RobotPackage.BIP__REPET:
				return getRepet();
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
			case RobotPackage.BIP__DURATION:
				setDuration((Integer)newValue);
				return;
			case RobotPackage.BIP__POWER:
				setPower((Double)newValue);
				return;
			case RobotPackage.BIP__REPET:
				setRepet((Boolean)newValue);
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
			case RobotPackage.BIP__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case RobotPackage.BIP__POWER:
				setPower(POWER_EDEFAULT);
				return;
			case RobotPackage.BIP__REPET:
				setRepet(REPET_EDEFAULT);
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
			case RobotPackage.BIP__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case RobotPackage.BIP__POWER:
				return POWER_EDEFAULT == null ? power != null : !POWER_EDEFAULT.equals(power);
			case RobotPackage.BIP__REPET:
				return REPET_EDEFAULT == null ? repet != null : !REPET_EDEFAULT.equals(repet);
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
		result.append(" (duration: ");
		result.append(duration);
		result.append(", power: ");
		result.append(power);
		result.append(", repet: ");
		result.append(repet);
		result.append(')');
		return result.toString();
	}

} //BipImpl
