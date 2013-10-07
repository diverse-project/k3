/**
 */
package geometry.impl;

import geometry.Dimension;
import geometry.GeometryPackage;
import geometry.RegularGeometry;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regular Geometry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link geometry.impl.RegularGeometryImpl#getNeighborsNumber <em>Neighbors Number</em>}</li>
 *   <li>{@link geometry.impl.RegularGeometryImpl#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegularGeometryImpl extends GeometryImpl implements RegularGeometry {
	/**
	 * The default value of the '{@link #getNeighborsNumber() <em>Neighbors Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeighborsNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NEIGHBORS_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNeighborsNumber() <em>Neighbors Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeighborsNumber()
	 * @generated
	 * @ordered
	 */
	protected int neighborsNumber = NEIGHBORS_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected EList<Dimension> dimensions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegularGeometryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeometryPackage.Literals.REGULAR_GEOMETRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNeighborsNumber() {
		return neighborsNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeighborsNumber(int newNeighborsNumber) {
		int oldNeighborsNumber = neighborsNumber;
		neighborsNumber = newNeighborsNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometryPackage.REGULAR_GEOMETRY__NEIGHBORS_NUMBER, oldNeighborsNumber, neighborsNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dimension> getDimensions() {
		if (dimensions == null) {
			dimensions = new EObjectContainmentEList<Dimension>(Dimension.class, this, GeometryPackage.REGULAR_GEOMETRY__DIMENSIONS);
		}
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeometryPackage.REGULAR_GEOMETRY__DIMENSIONS:
				return ((InternalEList<?>)getDimensions()).basicRemove(otherEnd, msgs);
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
			case GeometryPackage.REGULAR_GEOMETRY__NEIGHBORS_NUMBER:
				return getNeighborsNumber();
			case GeometryPackage.REGULAR_GEOMETRY__DIMENSIONS:
				return getDimensions();
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
			case GeometryPackage.REGULAR_GEOMETRY__NEIGHBORS_NUMBER:
				setNeighborsNumber((Integer)newValue);
				return;
			case GeometryPackage.REGULAR_GEOMETRY__DIMENSIONS:
				getDimensions().clear();
				getDimensions().addAll((Collection<? extends Dimension>)newValue);
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
			case GeometryPackage.REGULAR_GEOMETRY__NEIGHBORS_NUMBER:
				setNeighborsNumber(NEIGHBORS_NUMBER_EDEFAULT);
				return;
			case GeometryPackage.REGULAR_GEOMETRY__DIMENSIONS:
				getDimensions().clear();
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
			case GeometryPackage.REGULAR_GEOMETRY__NEIGHBORS_NUMBER:
				return neighborsNumber != NEIGHBORS_NUMBER_EDEFAULT;
			case GeometryPackage.REGULAR_GEOMETRY__DIMENSIONS:
				return dimensions != null && !dimensions.isEmpty();
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
		result.append(" (neighborsNumber: ");
		result.append(neighborsNumber);
		result.append(')');
		return result.toString();
	}

} //RegularGeometryImpl
