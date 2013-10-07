/**
 */
package ruleInit.impl;

import core.Rule;

import geometry.Geometry;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ruleInit.CellularAutomatatInitialization;
import ruleInit.InitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cellular Automatat Initialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ruleInit.impl.CellularAutomatatInitializationImpl#getSeedRules <em>Seed Rules</em>}</li>
 *   <li>{@link ruleInit.impl.CellularAutomatatInitializationImpl#getGeometry <em>Geometry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CellularAutomatatInitializationImpl extends EObjectImpl implements CellularAutomatatInitialization {
	/**
	 * The cached value of the '{@link #getSeedRules() <em>Seed Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeedRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> seedRules;

	/**
	 * The cached value of the '{@link #getGeometry() <em>Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected Geometry geometry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellularAutomatatInitializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InitPackage.Literals.CELLULAR_AUTOMATAT_INITIALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getSeedRules() {
		if (seedRules == null) {
			seedRules = new EObjectContainmentEList<Rule>(Rule.class, this, InitPackage.CELLULAR_AUTOMATAT_INITIALIZATION__SEED_RULES);
		}
		return seedRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geometry getGeometry() {
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometry(Geometry newGeometry, NotificationChain msgs) {
		Geometry oldGeometry = geometry;
		geometry = newGeometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InitPackage.CELLULAR_AUTOMATAT_INITIALIZATION__GEOMETRY, oldGeometry, newGeometry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometry(Geometry newGeometry) {
		if (newGeometry != geometry) {
			NotificationChain msgs = null;
			if (geometry != null)
				msgs = ((InternalEObject)geometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InitPackage.CELLULAR_AUTOMATAT_INITIALIZATION__GEOMETRY, null, msgs);
			if (newGeometry != null)
				msgs = ((InternalEObject)newGeometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InitPackage.CELLULAR_AUTOMATAT_INITIALIZATION__GEOMETRY, null, msgs);
			msgs = basicSetGeometry(newGeometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InitPackage.CELLULAR_AUTOMATAT_INITIALIZATION__GEOMETRY, newGeometry, newGeometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InitPackage.CELLULAR_AUTOMATAT_INITIALIZATION__SEED_RULES:
				return ((InternalEList<?>)getSeedRules()).basicRemove(otherEnd, msgs);
			case InitPackage.CELLULAR_AUTOMATAT_INITIALIZATION__GEOMETRY:
				return basicSetGeometry(null, msgs);
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
			case InitPackage.CELLULAR_AUTOMATAT_INITIALIZATION__SEED_RULES:
				return getSeedRules();
			case InitPackage.CELLULAR_AUTOMATAT_INITIALIZATION__GEOMETRY:
				return getGeometry();
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
			case InitPackage.CELLULAR_AUTOMATAT_INITIALIZATION__SEED_RULES:
				getSeedRules().clear();
				getSeedRules().addAll((Collection<? extends Rule>)newValue);
				return;
			case InitPackage.CELLULAR_AUTOMATAT_INITIALIZATION__GEOMETRY:
				setGeometry((Geometry)newValue);
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
			case InitPackage.CELLULAR_AUTOMATAT_INITIALIZATION__SEED_RULES:
				getSeedRules().clear();
				return;
			case InitPackage.CELLULAR_AUTOMATAT_INITIALIZATION__GEOMETRY:
				setGeometry((Geometry)null);
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
			case InitPackage.CELLULAR_AUTOMATAT_INITIALIZATION__SEED_RULES:
				return seedRules != null && !seedRules.isEmpty();
			case InitPackage.CELLULAR_AUTOMATAT_INITIALIZATION__GEOMETRY:
				return geometry != null;
		}
		return super.eIsSet(featureID);
	}

} //CellularAutomatatInitializationImpl
