/**
 */
package evol.impl;

import core.impl.IntegerExpressionImpl;

import evol.EvolPackage;
import evol.NeighborsExpression;
import evol.PopulationRange;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neighbors Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link evol.impl.NeighborsExpressionImpl#getNeighborsFilter <em>Neighbors Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NeighborsExpressionImpl extends IntegerExpressionImpl implements NeighborsExpression {
	/**
	 * The cached value of the '{@link #getNeighborsFilter() <em>Neighbors Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeighborsFilter()
	 * @generated
	 * @ordered
	 */
	protected PopulationRange neighborsFilter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeighborsExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvolPackage.Literals.NEIGHBORS_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopulationRange getNeighborsFilter() {
		return neighborsFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeighborsFilter(PopulationRange newNeighborsFilter, NotificationChain msgs) {
		PopulationRange oldNeighborsFilter = neighborsFilter;
		neighborsFilter = newNeighborsFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EvolPackage.NEIGHBORS_EXPRESSION__NEIGHBORS_FILTER, oldNeighborsFilter, newNeighborsFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeighborsFilter(PopulationRange newNeighborsFilter) {
		if (newNeighborsFilter != neighborsFilter) {
			NotificationChain msgs = null;
			if (neighborsFilter != null)
				msgs = ((InternalEObject)neighborsFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EvolPackage.NEIGHBORS_EXPRESSION__NEIGHBORS_FILTER, null, msgs);
			if (newNeighborsFilter != null)
				msgs = ((InternalEObject)newNeighborsFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EvolPackage.NEIGHBORS_EXPRESSION__NEIGHBORS_FILTER, null, msgs);
			msgs = basicSetNeighborsFilter(newNeighborsFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvolPackage.NEIGHBORS_EXPRESSION__NEIGHBORS_FILTER, newNeighborsFilter, newNeighborsFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvolPackage.NEIGHBORS_EXPRESSION__NEIGHBORS_FILTER:
				return basicSetNeighborsFilter(null, msgs);
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
			case EvolPackage.NEIGHBORS_EXPRESSION__NEIGHBORS_FILTER:
				return getNeighborsFilter();
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
			case EvolPackage.NEIGHBORS_EXPRESSION__NEIGHBORS_FILTER:
				setNeighborsFilter((PopulationRange)newValue);
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
			case EvolPackage.NEIGHBORS_EXPRESSION__NEIGHBORS_FILTER:
				setNeighborsFilter((PopulationRange)null);
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
			case EvolPackage.NEIGHBORS_EXPRESSION__NEIGHBORS_FILTER:
				return neighborsFilter != null;
		}
		return super.eIsSet(featureID);
	}

} //NeighborsExpressionImpl
