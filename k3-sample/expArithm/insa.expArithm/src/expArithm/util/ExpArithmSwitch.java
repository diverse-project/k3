/**
 */
package expArithm.util;

import expArithm.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see expArithm.ExpArithmPackage
 * @generated
 */
public class ExpArithmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExpArithmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpArithmSwitch() {
		if (modelPackage == null) {
			modelPackage = ExpArithmPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ExpArithmPackage.EXPRESSION_ARITHM: {
				ExpressionArithm expressionArithm = (ExpressionArithm)theEObject;
				T result = caseExpressionArithm(expressionArithm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpArithmPackage.ELT_EXP: {
				EltExp eltExp = (EltExp)theEObject;
				T result = caseEltExp(eltExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpArithmPackage.OPERATEUR_BINAIRE: {
				OperateurBinaire operateurBinaire = (OperateurBinaire)theEObject;
				T result = caseOperateurBinaire(operateurBinaire);
				if (result == null) result = caseEltExp(operateurBinaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpArithmPackage.VALEUR: {
				Valeur valeur = (Valeur)theEObject;
				T result = caseValeur(valeur);
				if (result == null) result = caseEltExp(valeur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpArithmPackage.PLUS: {
				Plus plus = (Plus)theEObject;
				T result = casePlus(plus);
				if (result == null) result = caseOperateurBinaire(plus);
				if (result == null) result = caseEltExp(plus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpArithmPackage.MOINS: {
				Moins moins = (Moins)theEObject;
				T result = caseMoins(moins);
				if (result == null) result = caseOperateurBinaire(moins);
				if (result == null) result = caseEltExp(moins);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpArithmPackage.MULT: {
				Mult mult = (Mult)theEObject;
				T result = caseMult(mult);
				if (result == null) result = caseOperateurBinaire(mult);
				if (result == null) result = caseEltExp(mult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpArithmPackage.DIVISION: {
				Division division = (Division)theEObject;
				T result = caseDivision(division);
				if (result == null) result = caseOperateurBinaire(division);
				if (result == null) result = caseEltExp(division);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Arithm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Arithm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionArithm(ExpressionArithm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elt Exp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elt Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEltExp(EltExp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operateur Binaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operateur Binaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperateurBinaire(OperateurBinaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valeur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valeur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValeur(Valeur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlus(Plus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Moins</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Moins</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoins(Moins object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mult</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mult</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMult(Mult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Division</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivision(Division object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ExpArithmSwitch
