/**
 */
package evol;

import core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see evol.EvolFactory
 * @model kind="package"
 * @generated
 */
public interface EvolPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "evol";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://rules/evol/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "evol";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EvolPackage eINSTANCE = evol.impl.EvolPackageImpl.init();

	/**
	 * The meta object id for the '{@link evol.impl.NeighborsExpressionImpl <em>Neighbors Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see evol.impl.NeighborsExpressionImpl
	 * @see evol.impl.EvolPackageImpl#getNeighborsExpression()
	 * @generated
	 */
	int NEIGHBORS_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Neighbors Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEIGHBORS_EXPRESSION__NEIGHBORS_FILTER = CorePackage.INTEGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Neighbors Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEIGHBORS_EXPRESSION_FEATURE_COUNT = CorePackage.INTEGER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link evol.impl.SizeImpl <em>Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see evol.impl.SizeImpl
	 * @see evol.impl.EvolPackageImpl#getSize()
	 * @generated
	 */
	int SIZE = 1;

	/**
	 * The feature id for the '<em><b>Neighbors Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE__NEIGHBORS_FILTER = NEIGHBORS_EXPRESSION__NEIGHBORS_FILTER;

	/**
	 * The number of structural features of the '<em>Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_FEATURE_COUNT = NEIGHBORS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link evol.impl.SumImpl <em>Sum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see evol.impl.SumImpl
	 * @see evol.impl.EvolPackageImpl#getSum()
	 * @generated
	 */
	int SUM = 2;

	/**
	 * The feature id for the '<em><b>Neighbors Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM__NEIGHBORS_FILTER = NEIGHBORS_EXPRESSION__NEIGHBORS_FILTER;

	/**
	 * The number of structural features of the '<em>Sum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_FEATURE_COUNT = NEIGHBORS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link evol.impl.MaxImpl <em>Max</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see evol.impl.MaxImpl
	 * @see evol.impl.EvolPackageImpl#getMax()
	 * @generated
	 */
	int MAX = 3;

	/**
	 * The feature id for the '<em><b>Neighbors Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX__NEIGHBORS_FILTER = NEIGHBORS_EXPRESSION__NEIGHBORS_FILTER;

	/**
	 * The number of structural features of the '<em>Max</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_FEATURE_COUNT = NEIGHBORS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link evol.impl.MinImpl <em>Min</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see evol.impl.MinImpl
	 * @see evol.impl.EvolPackageImpl#getMin()
	 * @generated
	 */
	int MIN = 4;

	/**
	 * The feature id for the '<em><b>Neighbors Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN__NEIGHBORS_FILTER = NEIGHBORS_EXPRESSION__NEIGHBORS_FILTER;

	/**
	 * The number of structural features of the '<em>Min</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_FEATURE_COUNT = NEIGHBORS_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link evol.impl.PopulationRangeImpl <em>Population Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see evol.impl.PopulationRangeImpl
	 * @see evol.impl.EvolPackageImpl#getPopulationRange()
	 * @generated
	 */
	int POPULATION_RANGE = 5;

	/**
	 * The feature id for the '<em><b>Lower Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_RANGE__LOWER_RANGE = CorePackage.FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_RANGE__UPPER_RANGE = CorePackage.FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Population Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POPULATION_RANGE_FEATURE_COUNT = CorePackage.FILTER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link evol.impl.CellularAutomataImpl <em>Cellular Automata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see evol.impl.CellularAutomataImpl
	 * @see evol.impl.EvolPackageImpl#getCellularAutomata()
	 * @generated
	 */
	int CELLULAR_AUTOMATA = 6;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELLULAR_AUTOMATA__RULES = 0;

	/**
	 * The number of structural features of the '<em>Cellular Automata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELLULAR_AUTOMATA_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link evol.impl.CurrentCellPopulationImpl <em>Current Cell Population</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see evol.impl.CurrentCellPopulationImpl
	 * @see evol.impl.EvolPackageImpl#getCurrentCellPopulation()
	 * @generated
	 */
	int CURRENT_CELL_POPULATION = 7;

	/**
	 * The number of structural features of the '<em>Current Cell Population</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_CELL_POPULATION_FEATURE_COUNT = CorePackage.INTEGER_EXPRESSION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link evol.NeighborsExpression <em>Neighbors Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neighbors Expression</em>'.
	 * @see evol.NeighborsExpression
	 * @generated
	 */
	EClass getNeighborsExpression();

	/**
	 * Returns the meta object for the containment reference '{@link evol.NeighborsExpression#getNeighborsFilter <em>Neighbors Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Neighbors Filter</em>'.
	 * @see evol.NeighborsExpression#getNeighborsFilter()
	 * @see #getNeighborsExpression()
	 * @generated
	 */
	EReference getNeighborsExpression_NeighborsFilter();

	/**
	 * Returns the meta object for class '{@link evol.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Size</em>'.
	 * @see evol.Size
	 * @generated
	 */
	EClass getSize();

	/**
	 * Returns the meta object for class '{@link evol.Sum <em>Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sum</em>'.
	 * @see evol.Sum
	 * @generated
	 */
	EClass getSum();

	/**
	 * Returns the meta object for class '{@link evol.Max <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max</em>'.
	 * @see evol.Max
	 * @generated
	 */
	EClass getMax();

	/**
	 * Returns the meta object for class '{@link evol.Min <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min</em>'.
	 * @see evol.Min
	 * @generated
	 */
	EClass getMin();

	/**
	 * Returns the meta object for class '{@link evol.PopulationRange <em>Population Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Population Range</em>'.
	 * @see evol.PopulationRange
	 * @generated
	 */
	EClass getPopulationRange();

	/**
	 * Returns the meta object for the attribute '{@link evol.PopulationRange#getLowerRange <em>Lower Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Range</em>'.
	 * @see evol.PopulationRange#getLowerRange()
	 * @see #getPopulationRange()
	 * @generated
	 */
	EAttribute getPopulationRange_LowerRange();

	/**
	 * Returns the meta object for the attribute '{@link evol.PopulationRange#getUpperRange <em>Upper Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Range</em>'.
	 * @see evol.PopulationRange#getUpperRange()
	 * @see #getPopulationRange()
	 * @generated
	 */
	EAttribute getPopulationRange_UpperRange();

	/**
	 * Returns the meta object for class '{@link evol.CellularAutomata <em>Cellular Automata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cellular Automata</em>'.
	 * @see evol.CellularAutomata
	 * @generated
	 */
	EClass getCellularAutomata();

	/**
	 * Returns the meta object for the containment reference list '{@link evol.CellularAutomata#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see evol.CellularAutomata#getRules()
	 * @see #getCellularAutomata()
	 * @generated
	 */
	EReference getCellularAutomata_Rules();

	/**
	 * Returns the meta object for class '{@link evol.CurrentCellPopulation <em>Current Cell Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Cell Population</em>'.
	 * @see evol.CurrentCellPopulation
	 * @generated
	 */
	EClass getCurrentCellPopulation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EvolFactory getEvolFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link evol.impl.NeighborsExpressionImpl <em>Neighbors Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see evol.impl.NeighborsExpressionImpl
		 * @see evol.impl.EvolPackageImpl#getNeighborsExpression()
		 * @generated
		 */
		EClass NEIGHBORS_EXPRESSION = eINSTANCE.getNeighborsExpression();

		/**
		 * The meta object literal for the '<em><b>Neighbors Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEIGHBORS_EXPRESSION__NEIGHBORS_FILTER = eINSTANCE.getNeighborsExpression_NeighborsFilter();

		/**
		 * The meta object literal for the '{@link evol.impl.SizeImpl <em>Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see evol.impl.SizeImpl
		 * @see evol.impl.EvolPackageImpl#getSize()
		 * @generated
		 */
		EClass SIZE = eINSTANCE.getSize();

		/**
		 * The meta object literal for the '{@link evol.impl.SumImpl <em>Sum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see evol.impl.SumImpl
		 * @see evol.impl.EvolPackageImpl#getSum()
		 * @generated
		 */
		EClass SUM = eINSTANCE.getSum();

		/**
		 * The meta object literal for the '{@link evol.impl.MaxImpl <em>Max</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see evol.impl.MaxImpl
		 * @see evol.impl.EvolPackageImpl#getMax()
		 * @generated
		 */
		EClass MAX = eINSTANCE.getMax();

		/**
		 * The meta object literal for the '{@link evol.impl.MinImpl <em>Min</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see evol.impl.MinImpl
		 * @see evol.impl.EvolPackageImpl#getMin()
		 * @generated
		 */
		EClass MIN = eINSTANCE.getMin();

		/**
		 * The meta object literal for the '{@link evol.impl.PopulationRangeImpl <em>Population Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see evol.impl.PopulationRangeImpl
		 * @see evol.impl.EvolPackageImpl#getPopulationRange()
		 * @generated
		 */
		EClass POPULATION_RANGE = eINSTANCE.getPopulationRange();

		/**
		 * The meta object literal for the '<em><b>Lower Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POPULATION_RANGE__LOWER_RANGE = eINSTANCE.getPopulationRange_LowerRange();

		/**
		 * The meta object literal for the '<em><b>Upper Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POPULATION_RANGE__UPPER_RANGE = eINSTANCE.getPopulationRange_UpperRange();

		/**
		 * The meta object literal for the '{@link evol.impl.CellularAutomataImpl <em>Cellular Automata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see evol.impl.CellularAutomataImpl
		 * @see evol.impl.EvolPackageImpl#getCellularAutomata()
		 * @generated
		 */
		EClass CELLULAR_AUTOMATA = eINSTANCE.getCellularAutomata();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELLULAR_AUTOMATA__RULES = eINSTANCE.getCellularAutomata_Rules();

		/**
		 * The meta object literal for the '{@link evol.impl.CurrentCellPopulationImpl <em>Current Cell Population</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see evol.impl.CurrentCellPopulationImpl
		 * @see evol.impl.EvolPackageImpl#getCurrentCellPopulation()
		 * @generated
		 */
		EClass CURRENT_CELL_POPULATION = eINSTANCE.getCurrentCellPopulation();

	}

} //EvolPackage
