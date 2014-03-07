/**
 */
package expArithm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see expArithm.ExpArithmPackage
 * @generated
 */
public interface ExpArithmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpArithmFactory eINSTANCE = expArithm.impl.ExpArithmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Expression Arithm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Arithm</em>'.
	 * @generated
	 */
	ExpressionArithm createExpressionArithm();

	/**
	 * Returns a new object of class '<em>Valeur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valeur</em>'.
	 * @generated
	 */
	Valeur createValeur();

	/**
	 * Returns a new object of class '<em>Plus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plus</em>'.
	 * @generated
	 */
	Plus createPlus();

	/**
	 * Returns a new object of class '<em>Moins</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Moins</em>'.
	 * @generated
	 */
	Moins createMoins();

	/**
	 * Returns a new object of class '<em>Mult</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mult</em>'.
	 * @generated
	 */
	Mult createMult();

	/**
	 * Returns a new object of class '<em>Division</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Division</em>'.
	 * @generated
	 */
	Division createDivision();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExpArithmPackage getExpArithmPackage();

} //ExpArithmFactory
