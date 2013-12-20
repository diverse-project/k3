/**
 */
package evol.impl;

import evol.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvolFactoryImpl extends EFactoryImpl implements EvolFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EvolFactory init() {
		try {
			EvolFactory theEvolFactory = (EvolFactory)EPackage.Registry.INSTANCE.getEFactory(EvolPackage.eNS_URI);
			if (theEvolFactory != null) {
				return theEvolFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EvolFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EvolPackage.SIZE: return createSize();
			case EvolPackage.SUM: return createSum();
			case EvolPackage.MAX: return createMax();
			case EvolPackage.MIN: return createMin();
			case EvolPackage.POPULATION_RANGE: return createPopulationRange();
			case EvolPackage.CELLULAR_AUTOMATA: return createCellularAutomata();
			case EvolPackage.CURRENT_CELL_POPULATION: return createCurrentCellPopulation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size createSize() {
		SizeImpl size = new SizeImpl();
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sum createSum() {
		SumImpl sum = new SumImpl();
		return sum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Max createMax() {
		MaxImpl max = new MaxImpl();
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Min createMin() {
		MinImpl min = new MinImpl();
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopulationRange createPopulationRange() {
		PopulationRangeImpl populationRange = new PopulationRangeImpl();
		return populationRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellularAutomata createCellularAutomata() {
		CellularAutomataImpl cellularAutomata = new CellularAutomataImpl();
		return cellularAutomata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentCellPopulation createCurrentCellPopulation() {
		CurrentCellPopulationImpl currentCellPopulation = new CurrentCellPopulationImpl();
		return currentCellPopulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolPackage getEvolPackage() {
		return (EvolPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EvolPackage getPackage() {
		return EvolPackage.eINSTANCE;
	}

} //EvolFactoryImpl
