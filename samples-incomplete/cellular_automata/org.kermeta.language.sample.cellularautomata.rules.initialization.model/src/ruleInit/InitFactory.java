/**
 */
package ruleInit;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ruleInit.InitPackage
 * @generated
 */
public interface InitFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InitFactory eINSTANCE = ruleInit.impl.InitFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cellular Automatat Initialization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cellular Automatat Initialization</em>'.
	 * @generated
	 */
	CellularAutomatatInitialization createCellularAutomatatInitialization();

	/**
	 * Returns a new object of class '<em>Global Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Position</em>'.
	 * @generated
	 */
	GlobalPosition createGlobalPosition();

	/**
	 * Returns a new object of class '<em>Position Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position Literal</em>'.
	 * @generated
	 */
	PositionLiteral createPositionLiteral();

	/**
	 * Returns a new object of class '<em>Coordinate Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordinate Range</em>'.
	 * @generated
	 */
	CoordinateRange createCoordinateRange();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InitPackage getInitPackage();

} //InitFactory
