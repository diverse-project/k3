/**
 */
package expArithm.impl;

import expArithm.EltExp;
import expArithm.ExpArithmPackage;
import expArithm.OperateurBinaire;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operateur Binaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link expArithm.impl.OperateurBinaireImpl#getEltGauche <em>Elt Gauche</em>}</li>
 *   <li>{@link expArithm.impl.OperateurBinaireImpl#getEltDroit <em>Elt Droit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class OperateurBinaireImpl extends EltExpImpl implements OperateurBinaire {
	/**
	 * The cached value of the '{@link #getEltGauche() <em>Elt Gauche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEltGauche()
	 * @generated
	 * @ordered
	 */
	protected EltExp eltGauche;

	/**
	 * The cached value of the '{@link #getEltDroit() <em>Elt Droit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEltDroit()
	 * @generated
	 * @ordered
	 */
	protected EltExp eltDroit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperateurBinaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpArithmPackage.Literals.OPERATEUR_BINAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EltExp getEltGauche() {
		return eltGauche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEltGauche(EltExp newEltGauche, NotificationChain msgs) {
		EltExp oldEltGauche = eltGauche;
		eltGauche = newEltGauche;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpArithmPackage.OPERATEUR_BINAIRE__ELT_GAUCHE, oldEltGauche, newEltGauche);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEltGauche(EltExp newEltGauche) {
		if (newEltGauche != eltGauche) {
			NotificationChain msgs = null;
			if (eltGauche != null)
				msgs = ((InternalEObject)eltGauche).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpArithmPackage.OPERATEUR_BINAIRE__ELT_GAUCHE, null, msgs);
			if (newEltGauche != null)
				msgs = ((InternalEObject)newEltGauche).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpArithmPackage.OPERATEUR_BINAIRE__ELT_GAUCHE, null, msgs);
			msgs = basicSetEltGauche(newEltGauche, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpArithmPackage.OPERATEUR_BINAIRE__ELT_GAUCHE, newEltGauche, newEltGauche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EltExp getEltDroit() {
		return eltDroit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEltDroit(EltExp newEltDroit, NotificationChain msgs) {
		EltExp oldEltDroit = eltDroit;
		eltDroit = newEltDroit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpArithmPackage.OPERATEUR_BINAIRE__ELT_DROIT, oldEltDroit, newEltDroit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEltDroit(EltExp newEltDroit) {
		if (newEltDroit != eltDroit) {
			NotificationChain msgs = null;
			if (eltDroit != null)
				msgs = ((InternalEObject)eltDroit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpArithmPackage.OPERATEUR_BINAIRE__ELT_DROIT, null, msgs);
			if (newEltDroit != null)
				msgs = ((InternalEObject)newEltDroit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpArithmPackage.OPERATEUR_BINAIRE__ELT_DROIT, null, msgs);
			msgs = basicSetEltDroit(newEltDroit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpArithmPackage.OPERATEUR_BINAIRE__ELT_DROIT, newEltDroit, newEltDroit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpArithmPackage.OPERATEUR_BINAIRE__ELT_GAUCHE:
				return basicSetEltGauche(null, msgs);
			case ExpArithmPackage.OPERATEUR_BINAIRE__ELT_DROIT:
				return basicSetEltDroit(null, msgs);
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
			case ExpArithmPackage.OPERATEUR_BINAIRE__ELT_GAUCHE:
				return getEltGauche();
			case ExpArithmPackage.OPERATEUR_BINAIRE__ELT_DROIT:
				return getEltDroit();
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
			case ExpArithmPackage.OPERATEUR_BINAIRE__ELT_GAUCHE:
				setEltGauche((EltExp)newValue);
				return;
			case ExpArithmPackage.OPERATEUR_BINAIRE__ELT_DROIT:
				setEltDroit((EltExp)newValue);
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
			case ExpArithmPackage.OPERATEUR_BINAIRE__ELT_GAUCHE:
				setEltGauche((EltExp)null);
				return;
			case ExpArithmPackage.OPERATEUR_BINAIRE__ELT_DROIT:
				setEltDroit((EltExp)null);
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
			case ExpArithmPackage.OPERATEUR_BINAIRE__ELT_GAUCHE:
				return eltGauche != null;
			case ExpArithmPackage.OPERATEUR_BINAIRE__ELT_DROIT:
				return eltDroit != null;
		}
		return super.eIsSet(featureID);
	}

} //OperateurBinaireImpl
