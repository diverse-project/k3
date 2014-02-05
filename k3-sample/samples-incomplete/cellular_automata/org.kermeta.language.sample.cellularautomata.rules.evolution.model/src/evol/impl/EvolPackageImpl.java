/**
 */
package evol.impl;

import core.CorePackage;

import evol.CellularAutomata;
import evol.CurrentCellPopulation;
import evol.EvolFactory;
import evol.EvolPackage;
import evol.Max;
import evol.Min;
import evol.NeighborsExpression;
import evol.PopulationRange;
import evol.Size;
import evol.Sum;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvolPackageImpl extends EPackageImpl implements EvolPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neighborsExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass populationRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cellularAutomataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentCellPopulationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see evol.EvolPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EvolPackageImpl() {
		super(eNS_URI, EvolFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EvolPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EvolPackage init() {
		if (isInited) return (EvolPackage)EPackage.Registry.INSTANCE.getEPackage(EvolPackage.eNS_URI);

		// Obtain or create and register package
		EvolPackageImpl theEvolPackage = (EvolPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EvolPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EvolPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEvolPackage.createPackageContents();

		// Initialize created meta-data
		theEvolPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEvolPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EvolPackage.eNS_URI, theEvolPackage);
		return theEvolPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNeighborsExpression() {
		return neighborsExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNeighborsExpression_NeighborsFilter() {
		return (EReference)neighborsExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSize() {
		return sizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSum() {
		return sumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMax() {
		return maxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMin() {
		return minEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPopulationRange() {
		return populationRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPopulationRange_LowerRange() {
		return (EAttribute)populationRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPopulationRange_UpperRange() {
		return (EAttribute)populationRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCellularAutomata() {
		return cellularAutomataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCellularAutomata_Rules() {
		return (EReference)cellularAutomataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrentCellPopulation() {
		return currentCellPopulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolFactory getEvolFactory() {
		return (EvolFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		neighborsExpressionEClass = createEClass(NEIGHBORS_EXPRESSION);
		createEReference(neighborsExpressionEClass, NEIGHBORS_EXPRESSION__NEIGHBORS_FILTER);

		sizeEClass = createEClass(SIZE);

		sumEClass = createEClass(SUM);

		maxEClass = createEClass(MAX);

		minEClass = createEClass(MIN);

		populationRangeEClass = createEClass(POPULATION_RANGE);
		createEAttribute(populationRangeEClass, POPULATION_RANGE__LOWER_RANGE);
		createEAttribute(populationRangeEClass, POPULATION_RANGE__UPPER_RANGE);

		cellularAutomataEClass = createEClass(CELLULAR_AUTOMATA);
		createEReference(cellularAutomataEClass, CELLULAR_AUTOMATA__RULES);

		currentCellPopulationEClass = createEClass(CURRENT_CELL_POPULATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		neighborsExpressionEClass.getESuperTypes().add(theCorePackage.getIntegerExpression());
		sizeEClass.getESuperTypes().add(this.getNeighborsExpression());
		sumEClass.getESuperTypes().add(this.getNeighborsExpression());
		maxEClass.getESuperTypes().add(this.getNeighborsExpression());
		minEClass.getESuperTypes().add(this.getNeighborsExpression());
		populationRangeEClass.getESuperTypes().add(theCorePackage.getFilter());
		currentCellPopulationEClass.getESuperTypes().add(theCorePackage.getIntegerExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(neighborsExpressionEClass, NeighborsExpression.class, "NeighborsExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeighborsExpression_NeighborsFilter(), this.getPopulationRange(), null, "neighborsFilter", null, 0, 1, NeighborsExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sizeEClass, Size.class, "Size", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sumEClass, Sum.class, "Sum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(maxEClass, Max.class, "Max", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minEClass, Min.class, "Min", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(populationRangeEClass, PopulationRange.class, "PopulationRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPopulationRange_LowerRange(), ecorePackage.getEIntegerObject(), "lowerRange", "-2147483648", 0, 1, PopulationRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPopulationRange_UpperRange(), ecorePackage.getEIntegerObject(), "upperRange", "2147483647", 0, 1, PopulationRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cellularAutomataEClass, CellularAutomata.class, "CellularAutomata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCellularAutomata_Rules(), theCorePackage.getRule(), null, "rules", null, 0, -1, CellularAutomata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(currentCellPopulationEClass, CurrentCellPopulation.class, "CurrentCellPopulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EvolPackageImpl
