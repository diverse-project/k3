/**
 */
package RDBMSMM.impl;

import RDBMSMM.Column;
import RDBMSMM.FKey;
import RDBMSMM.RDBMSMMPackage;
import RDBMSMM.Table;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FKey</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link RDBMSMM.impl.FKeyImpl#getReferences <em>References</em>}</li>
 *   <li>{@link RDBMSMM.impl.FKeyImpl#getCols <em>Cols</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FKeyImpl extends MinimalEObjectImpl.Container implements FKey {
	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected Table references;

	/**
	 * The cached value of the '{@link #getCols() <em>Cols</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCols()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> cols;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDBMSMMPackage.Literals.FKEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getReferences() {
		if (references != null && references.eIsProxy()) {
			InternalEObject oldReferences = (InternalEObject)references;
			references = (Table)eResolveProxy(oldReferences);
			if (references != oldReferences) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RDBMSMMPackage.FKEY__REFERENCES, oldReferences, references));
			}
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetReferences() {
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferences(Table newReferences) {
		Table oldReferences = references;
		references = newReferences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBMSMMPackage.FKEY__REFERENCES, oldReferences, references));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getCols() {
		if (cols == null) {
			cols = new EObjectResolvingEList<Column>(Column.class, this, RDBMSMMPackage.FKEY__COLS);
		}
		return cols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RDBMSMMPackage.FKEY__REFERENCES:
				if (resolve) return getReferences();
				return basicGetReferences();
			case RDBMSMMPackage.FKEY__COLS:
				return getCols();
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
			case RDBMSMMPackage.FKEY__REFERENCES:
				setReferences((Table)newValue);
				return;
			case RDBMSMMPackage.FKEY__COLS:
				getCols().clear();
				getCols().addAll((Collection<? extends Column>)newValue);
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
			case RDBMSMMPackage.FKEY__REFERENCES:
				setReferences((Table)null);
				return;
			case RDBMSMMPackage.FKEY__COLS:
				getCols().clear();
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
			case RDBMSMMPackage.FKEY__REFERENCES:
				return references != null;
			case RDBMSMMPackage.FKEY__COLS:
				return cols != null && !cols.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FKeyImpl
