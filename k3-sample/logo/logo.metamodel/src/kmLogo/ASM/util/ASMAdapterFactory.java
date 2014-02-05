/**
 */
package kmLogo.ASM.util;

import kmLogo.ASM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see kmLogo.ASM.ASMPackage
 * @generated
 */
public class ASMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ASMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ASMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ASMSwitch<Adapter> modelSwitch =
		new ASMSwitch<Adapter>() {
			@Override
			public Adapter caseInstruction(Instruction object) {
				return createInstructionAdapter();
			}
			@Override
			public Adapter casePrimitive(Primitive object) {
				return createPrimitiveAdapter();
			}
			@Override
			public Adapter caseBack(Back object) {
				return createBackAdapter();
			}
			@Override
			public Adapter caseForward(Forward object) {
				return createForwardAdapter();
			}
			@Override
			public Adapter caseLeft(Left object) {
				return createLeftAdapter();
			}
			@Override
			public Adapter caseRight(Right object) {
				return createRightAdapter();
			}
			@Override
			public Adapter casePenDown(PenDown object) {
				return createPenDownAdapter();
			}
			@Override
			public Adapter casePenUp(PenUp object) {
				return createPenUpAdapter();
			}
			@Override
			public Adapter caseClear(Clear object) {
				return createClearAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseBinaryExp(BinaryExp object) {
				return createBinaryExpAdapter();
			}
			@Override
			public Adapter caseConstant(Constant object) {
				return createConstantAdapter();
			}
			@Override
			public Adapter caseProcCall(ProcCall object) {
				return createProcCallAdapter();
			}
			@Override
			public Adapter caseProcDeclaration(ProcDeclaration object) {
				return createProcDeclarationAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseIf(If object) {
				return createIfAdapter();
			}
			@Override
			public Adapter caseControlStructure(ControlStructure object) {
				return createControlStructureAdapter();
			}
			@Override
			public Adapter caseRepeat(Repeat object) {
				return createRepeatAdapter();
			}
			@Override
			public Adapter caseWhile(While object) {
				return createWhileAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseParameterCall(ParameterCall object) {
				return createParameterCallAdapter();
			}
			@Override
			public Adapter casePlus(Plus object) {
				return createPlusAdapter();
			}
			@Override
			public Adapter caseMinus(Minus object) {
				return createMinusAdapter();
			}
			@Override
			public Adapter caseMult(Mult object) {
				return createMultAdapter();
			}
			@Override
			public Adapter caseDiv(Div object) {
				return createDivAdapter();
			}
			@Override
			public Adapter caseEquals(Equals object) {
				return createEqualsAdapter();
			}
			@Override
			public Adapter caseGreater(Greater object) {
				return createGreaterAdapter();
			}
			@Override
			public Adapter caseLower(Lower object) {
				return createLowerAdapter();
			}
			@Override
			public Adapter caseLogoProgram(LogoProgram object) {
				return createLogoProgramAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link kmLogo.ASM.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kmLogo.ASM.Instruction
	 * @generated
	 */
	public Adapter createInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kmLogo.ASM.Primitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kmLogo.ASM.Primitive
	 * @generated
	 */
	public Adapter createPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kmLogo.ASM.Back <em>Back</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kmLogo.ASM.Back
	 * @generated
	 */
	public Adapter createBackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kmLogo.ASM.Forward <em>Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kmLogo.ASM.Forward
	 * @generated
	 */
	public Adapter createForwardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kmLogo.ASM.Left <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kmLogo.ASM.Left
	 * @generated
	 */
	public Adapter createLeftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kmLogo.ASM.Right <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kmLogo.ASM.Right
	 * @generated
	 */
	public Adapter createRightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kmLogo.ASM.PenDown <em>Pen Down</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kmLogo.ASM.PenDown
	 * @generated
	 */
	public Adapter createPenDownAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kmLogo.ASM.PenUp <em>Pen Up</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kmLogo.ASM.PenUp
	 * @generated
	 */
	public Adapter createPenUpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kmLogo.ASM.Clear <em>Clear</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kmLogo.ASM.Clear
	 * @generated
	 */
	public Adapter createClearAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kmLogo.ASM.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kmLogo.ASM.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kmLogo.ASM.BinaryExp <em>Binary Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kmLogo.ASM.BinaryExp
	 * @generated
	 */
	public Adapter createBinaryExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kmLogo.ASM.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kmLogo.ASM.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kmLogo.ASM.ProcCall <em>Proc Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kmLogo.ASM.ProcCall
	 * @generated
	 */
	public Adapter createProcCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kmLogo.ASM.ProcDeclaration <em>Proc Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kmLogo.ASM.ProcDeclaration
	 * @generated
	 */
	public Adapter createProcDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kmLogo.ASM.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kmLogo.ASM.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kmLogo.ASM.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kmLogo.ASM.If
	 * @generated
	 */
	public Adapter createIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kmLogo.ASM.ControlStructure <em>Control Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kmLogo.ASM.ControlStructure
	 * @generated
	 */
	public Adapter createControlStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kmLogo.ASM.Repeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kmLogo.ASM.Repeat
	 * @generated
	 */
	public Adapter createRepeatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kmLogo.ASM.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kmLogo.ASM.While
	 * @generated
	 */
	public Adapter createWhileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kmLogo.ASM.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kmLogo.ASM.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kmLogo.ASM.ParameterCall <em>Parameter Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kmLogo.ASM.ParameterCall
	 * @generated
	 */
	public Adapter createParameterCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kmLogo.ASM.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kmLogo.ASM.Plus
	 * @generated
	 */
	public Adapter createPlusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kmLogo.ASM.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kmLogo.ASM.Minus
	 * @generated
	 */
	public Adapter createMinusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kmLogo.ASM.Mult <em>Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kmLogo.ASM.Mult
	 * @generated
	 */
	public Adapter createMultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kmLogo.ASM.Div <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kmLogo.ASM.Div
	 * @generated
	 */
	public Adapter createDivAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kmLogo.ASM.Equals <em>Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kmLogo.ASM.Equals
	 * @generated
	 */
	public Adapter createEqualsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kmLogo.ASM.Greater <em>Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kmLogo.ASM.Greater
	 * @generated
	 */
	public Adapter createGreaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kmLogo.ASM.Lower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kmLogo.ASM.Lower
	 * @generated
	 */
	public Adapter createLowerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link kmLogo.ASM.LogoProgram <em>Logo Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see kmLogo.ASM.LogoProgram
	 * @generated
	 */
	public Adapter createLogoProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ASMAdapterFactory
