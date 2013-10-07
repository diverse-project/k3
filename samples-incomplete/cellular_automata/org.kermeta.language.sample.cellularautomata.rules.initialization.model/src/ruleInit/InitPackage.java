/**
 */
package ruleInit;

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
 * @see ruleInit.InitFactory
 * @model kind="package"
 * @generated
 */
public interface InitPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ruleInit";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://rules/init/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ruleInit";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InitPackage eINSTANCE = ruleInit.impl.InitPackageImpl.init();

	/**
	 * The meta object id for the '{@link ruleInit.impl.CellularAutomatatInitializationImpl <em>Cellular Automatat Initialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ruleInit.impl.CellularAutomatatInitializationImpl
	 * @see ruleInit.impl.InitPackageImpl#getCellularAutomatatInitialization()
	 * @generated
	 */
	int CELLULAR_AUTOMATAT_INITIALIZATION = 0;

	/**
	 * The feature id for the '<em><b>Seed Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELLULAR_AUTOMATAT_INITIALIZATION__SEED_RULES = 0;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELLULAR_AUTOMATAT_INITIALIZATION__GEOMETRY = 1;

	/**
	 * The number of structural features of the '<em>Cellular Automatat Initialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELLULAR_AUTOMATAT_INITIALIZATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ruleInit.impl.GlobalPositionImpl <em>Global Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ruleInit.impl.GlobalPositionImpl
	 * @see ruleInit.impl.InitPackageImpl#getGlobalPosition()
	 * @generated
	 */
	int GLOBAL_POSITION = 1;

	/**
	 * The feature id for the '<em><b>Coordinate Ranges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_POSITION__COORDINATE_RANGES = CorePackage.FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Global Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_POSITION_FEATURE_COUNT = CorePackage.FILTER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ruleInit.impl.PositionLiteralImpl <em>Position Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ruleInit.impl.PositionLiteralImpl
	 * @see ruleInit.impl.InitPackageImpl#getPositionLiteral()
	 * @generated
	 */
	int POSITION_LITERAL = 2;

	/**
	 * The feature id for the '<em><b>Dimension Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_LITERAL__DIMENSION_INDEX = CorePackage.INTEGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Position Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_LITERAL_FEATURE_COUNT = CorePackage.INTEGER_EXPRESSION_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link ruleInit.impl.CoordinateRangeImpl <em>Coordinate Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ruleInit.impl.CoordinateRangeImpl
	 * @see ruleInit.impl.InitPackageImpl#getCoordinateRange()
	 * @generated
	 */
	int COORDINATE_RANGE = 3;

	/**
	 * The feature id for the '<em><b>Lower Coordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_RANGE__LOWER_COORDINATE = 0;

	/**
	 * The feature id for the '<em><b>Upper Coordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_RANGE__UPPER_COORDINATE = 1;

	/**
	 * The number of structural features of the '<em>Coordinate Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_RANGE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link ruleInit.CellularAutomatatInitialization <em>Cellular Automatat Initialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cellular Automatat Initialization</em>'.
	 * @see ruleInit.CellularAutomatatInitialization
	 * @generated
	 */
	EClass getCellularAutomatatInitialization();

	/**
	 * Returns the meta object for the containment reference list '{@link ruleInit.CellularAutomatatInitialization#getSeedRules <em>Seed Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Seed Rules</em>'.
	 * @see ruleInit.CellularAutomatatInitialization#getSeedRules()
	 * @see #getCellularAutomatatInitialization()
	 * @generated
	 */
	EReference getCellularAutomatatInitialization_SeedRules();

	/**
	 * Returns the meta object for the containment reference '{@link ruleInit.CellularAutomatatInitialization#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geometry</em>'.
	 * @see ruleInit.CellularAutomatatInitialization#getGeometry()
	 * @see #getCellularAutomatatInitialization()
	 * @generated
	 */
	EReference getCellularAutomatatInitialization_Geometry();

	/**
	 * Returns the meta object for class '{@link ruleInit.GlobalPosition <em>Global Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Position</em>'.
	 * @see ruleInit.GlobalPosition
	 * @generated
	 */
	EClass getGlobalPosition();

	/**
	 * Returns the meta object for the containment reference list '{@link ruleInit.GlobalPosition#getCoordinateRanges <em>Coordinate Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coordinate Ranges</em>'.
	 * @see ruleInit.GlobalPosition#getCoordinateRanges()
	 * @see #getGlobalPosition()
	 * @generated
	 */
	EReference getGlobalPosition_CoordinateRanges();

	/**
	 * Returns the meta object for class '{@link ruleInit.PositionLiteral <em>Position Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position Literal</em>'.
	 * @see ruleInit.PositionLiteral
	 * @generated
	 */
	EClass getPositionLiteral();

	/**
	 * Returns the meta object for the attribute '{@link ruleInit.PositionLiteral#getDimensionIndex <em>Dimension Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension Index</em>'.
	 * @see ruleInit.PositionLiteral#getDimensionIndex()
	 * @see #getPositionLiteral()
	 * @generated
	 */
	EAttribute getPositionLiteral_DimensionIndex();

	/**
	 * Returns the meta object for class '{@link ruleInit.CoordinateRange <em>Coordinate Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinate Range</em>'.
	 * @see ruleInit.CoordinateRange
	 * @generated
	 */
	EClass getCoordinateRange();

	/**
	 * Returns the meta object for the attribute '{@link ruleInit.CoordinateRange#getLowerCoordinate <em>Lower Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Coordinate</em>'.
	 * @see ruleInit.CoordinateRange#getLowerCoordinate()
	 * @see #getCoordinateRange()
	 * @generated
	 */
	EAttribute getCoordinateRange_LowerCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link ruleInit.CoordinateRange#getUpperCoordinate <em>Upper Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Coordinate</em>'.
	 * @see ruleInit.CoordinateRange#getUpperCoordinate()
	 * @see #getCoordinateRange()
	 * @generated
	 */
	EAttribute getCoordinateRange_UpperCoordinate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InitFactory getInitFactory();

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
		 * The meta object literal for the '{@link ruleInit.impl.CellularAutomatatInitializationImpl <em>Cellular Automatat Initialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ruleInit.impl.CellularAutomatatInitializationImpl
		 * @see ruleInit.impl.InitPackageImpl#getCellularAutomatatInitialization()
		 * @generated
		 */
		EClass CELLULAR_AUTOMATAT_INITIALIZATION = eINSTANCE.getCellularAutomatatInitialization();

		/**
		 * The meta object literal for the '<em><b>Seed Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELLULAR_AUTOMATAT_INITIALIZATION__SEED_RULES = eINSTANCE.getCellularAutomatatInitialization_SeedRules();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELLULAR_AUTOMATAT_INITIALIZATION__GEOMETRY = eINSTANCE.getCellularAutomatatInitialization_Geometry();

		/**
		 * The meta object literal for the '{@link ruleInit.impl.GlobalPositionImpl <em>Global Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ruleInit.impl.GlobalPositionImpl
		 * @see ruleInit.impl.InitPackageImpl#getGlobalPosition()
		 * @generated
		 */
		EClass GLOBAL_POSITION = eINSTANCE.getGlobalPosition();

		/**
		 * The meta object literal for the '<em><b>Coordinate Ranges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_POSITION__COORDINATE_RANGES = eINSTANCE.getGlobalPosition_CoordinateRanges();

		/**
		 * The meta object literal for the '{@link ruleInit.impl.PositionLiteralImpl <em>Position Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ruleInit.impl.PositionLiteralImpl
		 * @see ruleInit.impl.InitPackageImpl#getPositionLiteral()
		 * @generated
		 */
		EClass POSITION_LITERAL = eINSTANCE.getPositionLiteral();

		/**
		 * The meta object literal for the '<em><b>Dimension Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION_LITERAL__DIMENSION_INDEX = eINSTANCE.getPositionLiteral_DimensionIndex();

		/**
		 * The meta object literal for the '{@link ruleInit.impl.CoordinateRangeImpl <em>Coordinate Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ruleInit.impl.CoordinateRangeImpl
		 * @see ruleInit.impl.InitPackageImpl#getCoordinateRange()
		 * @generated
		 */
		EClass COORDINATE_RANGE = eINSTANCE.getCoordinateRange();

		/**
		 * The meta object literal for the '<em><b>Lower Coordinate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE_RANGE__LOWER_COORDINATE = eINSTANCE.getCoordinateRange_LowerCoordinate();

		/**
		 * The meta object literal for the '<em><b>Upper Coordinate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE_RANGE__UPPER_COORDINATE = eINSTANCE.getCoordinateRange_UpperCoordinate();

	}

} //InitPackage
