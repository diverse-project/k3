/**
 */
package ruleInit.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ruleInit.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InitFactoryImpl extends EFactoryImpl implements InitFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InitFactory init() {
		try {
			InitFactory theInitFactory = (InitFactory)EPackage.Registry.INSTANCE.getEFactory("http://rules/init/1.0"); 
			if (theInitFactory != null) {
				return theInitFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InitFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitFactoryImpl() {
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
			case InitPackage.CELLULAR_AUTOMATAT_INITIALIZATION: return createCellularAutomatatInitialization();
			case InitPackage.GLOBAL_POSITION: return createGlobalPosition();
			case InitPackage.POSITION_LITERAL: return createPositionLiteral();
			case InitPackage.COORDINATE_RANGE: return createCoordinateRange();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellularAutomatatInitialization createCellularAutomatatInitialization() {
		CellularAutomatatInitializationImpl cellularAutomatatInitialization = new CellularAutomatatInitializationImpl();
		return cellularAutomatatInitialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalPosition createGlobalPosition() {
		GlobalPositionImpl globalPosition = new GlobalPositionImpl();
		return globalPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionLiteral createPositionLiteral() {
		PositionLiteralImpl positionLiteral = new PositionLiteralImpl();
		return positionLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinateRange createCoordinateRange() {
		CoordinateRangeImpl coordinateRange = new CoordinateRangeImpl();
		return coordinateRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitPackage getInitPackage() {
		return (InitPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InitPackage getPackage() {
		return InitPackage.eINSTANCE;
	}

} //InitFactoryImpl
