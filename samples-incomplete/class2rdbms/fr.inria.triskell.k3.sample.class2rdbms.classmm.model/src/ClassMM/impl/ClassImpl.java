/**
 */
package ClassMM.impl;

import ClassMM.Attribute;
import ClassMM.ClassMMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ClassMM.impl.ClassImpl#getIs_persistent <em>Is persistent</em>}</li>
 *   <li>{@link ClassMM.impl.ClassImpl#getAttrs <em>Attrs</em>}</li>
 *   <li>{@link ClassMM.impl.ClassImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends ClassifierImpl implements ClassMM.Class {
	/**
	 * The default value of the '{@link #getIs_persistent() <em>Is persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIs_persistent()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_PERSISTENT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIs_persistent() <em>Is persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIs_persistent()
	 * @generated
	 * @ordered
	 */
	protected Boolean is_persistent = IS_PERSISTENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttrs() <em>Attrs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrs()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attrs;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected ClassMM.Class parent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassMMPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIs_persistent() {
		return is_persistent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIs_persistent(Boolean newIs_persistent) {
		Boolean oldIs_persistent = is_persistent;
		is_persistent = newIs_persistent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassMMPackage.CLASS__IS_PERSISTENT, oldIs_persistent, is_persistent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttrs() {
		if (attrs == null) {
			attrs = new EObjectContainmentEList<Attribute>(Attribute.class, this, ClassMMPackage.CLASS__ATTRS);
		}
		return attrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMM.Class getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (ClassMM.Class)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassMMPackage.CLASS__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMM.Class basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ClassMM.Class newParent) {
		ClassMM.Class oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassMMPackage.CLASS__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassMMPackage.CLASS__ATTRS:
				return ((InternalEList<?>)getAttrs()).basicRemove(otherEnd, msgs);
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
			case ClassMMPackage.CLASS__IS_PERSISTENT:
				return getIs_persistent();
			case ClassMMPackage.CLASS__ATTRS:
				return getAttrs();
			case ClassMMPackage.CLASS__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
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
			case ClassMMPackage.CLASS__IS_PERSISTENT:
				setIs_persistent((Boolean)newValue);
				return;
			case ClassMMPackage.CLASS__ATTRS:
				getAttrs().clear();
				getAttrs().addAll((Collection<? extends Attribute>)newValue);
				return;
			case ClassMMPackage.CLASS__PARENT:
				setParent((ClassMM.Class)newValue);
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
			case ClassMMPackage.CLASS__IS_PERSISTENT:
				setIs_persistent(IS_PERSISTENT_EDEFAULT);
				return;
			case ClassMMPackage.CLASS__ATTRS:
				getAttrs().clear();
				return;
			case ClassMMPackage.CLASS__PARENT:
				setParent((ClassMM.Class)null);
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
			case ClassMMPackage.CLASS__IS_PERSISTENT:
				return IS_PERSISTENT_EDEFAULT == null ? is_persistent != null : !IS_PERSISTENT_EDEFAULT.equals(is_persistent);
			case ClassMMPackage.CLASS__ATTRS:
				return attrs != null && !attrs.isEmpty();
			case ClassMMPackage.CLASS__PARENT:
				return parent != null;
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
		result.append(" (is_persistent: ");
		result.append(is_persistent);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
