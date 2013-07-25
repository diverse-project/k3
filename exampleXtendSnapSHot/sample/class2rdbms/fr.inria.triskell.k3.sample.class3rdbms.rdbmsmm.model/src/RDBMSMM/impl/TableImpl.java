/**
 */
package RDBMSMM.impl;

import RDBMSMM.Column;
import RDBMSMM.FKey;
import RDBMSMM.RDBMSMMPackage;
import RDBMSMM.Table;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link RDBMSMM.impl.TableImpl#getName <em>Name</em>}</li>
 *   <li>{@link RDBMSMM.impl.TableImpl#getCols <em>Cols</em>}</li>
 *   <li>{@link RDBMSMM.impl.TableImpl#getPkey <em>Pkey</em>}</li>
 *   <li>{@link RDBMSMM.impl.TableImpl#getFkeys <em>Fkeys</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableImpl extends MinimalEObjectImpl.Container implements Table {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCols() <em>Cols</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCols()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> cols;

	/**
	 * The cached value of the '{@link #getPkey() <em>Pkey</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPkey()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> pkey;

	/**
	 * The cached value of the '{@link #getFkeys() <em>Fkeys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFkeys()
	 * @generated
	 * @ordered
	 */
	protected EList<FKey> fkeys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RDBMSMMPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RDBMSMMPackage.TABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getCols() {
		if (cols == null) {
			cols = new EObjectContainmentEList<Column>(Column.class, this, RDBMSMMPackage.TABLE__COLS);
		}
		return cols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getPkey() {
		if (pkey == null) {
			pkey = new EObjectResolvingEList<Column>(Column.class, this, RDBMSMMPackage.TABLE__PKEY);
		}
		return pkey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FKey> getFkeys() {
		if (fkeys == null) {
			fkeys = new EObjectContainmentEList<FKey>(FKey.class, this, RDBMSMMPackage.TABLE__FKEYS);
		}
		return fkeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RDBMSMMPackage.TABLE__COLS:
				return ((InternalEList<?>)getCols()).basicRemove(otherEnd, msgs);
			case RDBMSMMPackage.TABLE__FKEYS:
				return ((InternalEList<?>)getFkeys()).basicRemove(otherEnd, msgs);
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
			case RDBMSMMPackage.TABLE__NAME:
				return getName();
			case RDBMSMMPackage.TABLE__COLS:
				return getCols();
			case RDBMSMMPackage.TABLE__PKEY:
				return getPkey();
			case RDBMSMMPackage.TABLE__FKEYS:
				return getFkeys();
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
			case RDBMSMMPackage.TABLE__NAME:
				setName((String)newValue);
				return;
			case RDBMSMMPackage.TABLE__COLS:
				getCols().clear();
				getCols().addAll((Collection<? extends Column>)newValue);
				return;
			case RDBMSMMPackage.TABLE__PKEY:
				getPkey().clear();
				getPkey().addAll((Collection<? extends Column>)newValue);
				return;
			case RDBMSMMPackage.TABLE__FKEYS:
				getFkeys().clear();
				getFkeys().addAll((Collection<? extends FKey>)newValue);
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
			case RDBMSMMPackage.TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RDBMSMMPackage.TABLE__COLS:
				getCols().clear();
				return;
			case RDBMSMMPackage.TABLE__PKEY:
				getPkey().clear();
				return;
			case RDBMSMMPackage.TABLE__FKEYS:
				getFkeys().clear();
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
			case RDBMSMMPackage.TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RDBMSMMPackage.TABLE__COLS:
				return cols != null && !cols.isEmpty();
			case RDBMSMMPackage.TABLE__PKEY:
				return pkey != null && !pkey.isEmpty();
			case RDBMSMMPackage.TABLE__FKEYS:
				return fkeys != null && !fkeys.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TableImpl
