/**
 */
package evol;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see evol.EvolPackage
 * @generated
 */
public interface EvolFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EvolFactory eINSTANCE = evol.impl.EvolFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Size</em>'.
	 * @generated
	 */
	Size createSize();

	/**
	 * Returns a new object of class '<em>Sum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sum</em>'.
	 * @generated
	 */
	Sum createSum();

	/**
	 * Returns a new object of class '<em>Max</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max</em>'.
	 * @generated
	 */
	Max createMax();

	/**
	 * Returns a new object of class '<em>Min</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Min</em>'.
	 * @generated
	 */
	Min createMin();

	/**
	 * Returns a new object of class '<em>Population Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Population Range</em>'.
	 * @generated
	 */
	PopulationRange createPopulationRange();

	/**
	 * Returns a new object of class '<em>Cellular Automata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cellular Automata</em>'.
	 * @generated
	 */
	CellularAutomata createCellularAutomata();

	/**
	 * Returns a new object of class '<em>Current Cell Population</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current Cell Population</em>'.
	 * @generated
	 */
	CurrentCellPopulation createCurrentCellPopulation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EvolPackage getEvolPackage();

} //EvolFactory
