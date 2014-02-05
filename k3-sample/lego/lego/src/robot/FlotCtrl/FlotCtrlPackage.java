/**
 */
package robot.FlotCtrl;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see robot.FlotCtrl.FlotCtrlFactory
 * @model kind="package"
 * @generated
 */
public interface FlotCtrlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "FlotCtrl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://TPIDMINSA/MRL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "robot.MRL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FlotCtrlPackage eINSTANCE = robot.FlotCtrl.impl.FlotCtrlPackageImpl.init();

	/**
	 * The meta object id for the '{@link robot.FlotCtrl.Expression <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.FlotCtrl.Expression
	 * @see robot.FlotCtrl.impl.FlotCtrlPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link robot.FlotCtrl.impl.WhileLoopImpl <em>While Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.FlotCtrl.impl.WhileLoopImpl
	 * @see robot.FlotCtrl.impl.FlotCtrlPackageImpl#getWhileLoop()
	 * @generated
	 */
	int WHILE_LOOP = 1;

	/**
	 * The feature id for the '<em><b>Loop Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP__LOOP_COND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP__BLOCK = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>While Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>While Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOP_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.FlotCtrl.BoolExp <em>Bool Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.FlotCtrl.BoolExp
	 * @see robot.FlotCtrl.impl.FlotCtrlPackageImpl#getBoolExp()
	 * @generated
	 */
	int BOOL_EXP = 3;

	/**
	 * The number of structural features of the '<em>Bool Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_EXP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bool Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_EXP_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.FlotCtrl.impl.NegExpImpl <em>Neg Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.FlotCtrl.impl.NegExpImpl
	 * @see robot.FlotCtrl.impl.FlotCtrlPackageImpl#getNegExp()
	 * @generated
	 */
	int NEG_EXP = 2;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG_EXP__EXP = BOOL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Neg Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG_EXP_FEATURE_COUNT = BOOL_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Neg Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEG_EXP_OPERATION_COUNT = BOOL_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.FlotCtrl.impl.AndExpImpl <em>And Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.FlotCtrl.impl.AndExpImpl
	 * @see robot.FlotCtrl.impl.FlotCtrlPackageImpl#getAndExp()
	 * @generated
	 */
	int AND_EXP = 4;

	/**
	 * The feature id for the '<em><b>Left Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXP__LEFT_EXP = BOOL_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXP__RIGHT_EXP = BOOL_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>And Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXP_FEATURE_COUNT = BOOL_EXP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>And Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXP_OPERATION_COUNT = BOOL_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link robot.FlotCtrl.impl.IfBlockImpl <em>If Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see robot.FlotCtrl.impl.IfBlockImpl
	 * @see robot.FlotCtrl.impl.FlotCtrlPackageImpl#getIfBlock()
	 * @generated
	 */
	int IF_BLOCK = 5;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_BLOCK__CONDITION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_BLOCK__THEN_BLOCK = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_BLOCK__ELSE_BLOCK = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_BLOCK_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_BLOCK_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link robot.FlotCtrl.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see robot.FlotCtrl.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link robot.FlotCtrl.WhileLoop <em>While Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Loop</em>'.
	 * @see robot.FlotCtrl.WhileLoop
	 * @generated
	 */
	EClass getWhileLoop();

	/**
	 * Returns the meta object for the containment reference '{@link robot.FlotCtrl.WhileLoop#getLoopCond <em>Loop Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop Cond</em>'.
	 * @see robot.FlotCtrl.WhileLoop#getLoopCond()
	 * @see #getWhileLoop()
	 * @generated
	 */
	EReference getWhileLoop_LoopCond();

	/**
	 * Returns the meta object for the containment reference list '{@link robot.FlotCtrl.WhileLoop#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block</em>'.
	 * @see robot.FlotCtrl.WhileLoop#getBlock()
	 * @see #getWhileLoop()
	 * @generated
	 */
	EReference getWhileLoop_Block();

	/**
	 * Returns the meta object for class '{@link robot.FlotCtrl.NegExp <em>Neg Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neg Exp</em>'.
	 * @see robot.FlotCtrl.NegExp
	 * @generated
	 */
	EClass getNegExp();

	/**
	 * Returns the meta object for the containment reference '{@link robot.FlotCtrl.NegExp#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see robot.FlotCtrl.NegExp#getExp()
	 * @see #getNegExp()
	 * @generated
	 */
	EReference getNegExp_Exp();

	/**
	 * Returns the meta object for class '{@link robot.FlotCtrl.BoolExp <em>Bool Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Exp</em>'.
	 * @see robot.FlotCtrl.BoolExp
	 * @generated
	 */
	EClass getBoolExp();

	/**
	 * Returns the meta object for class '{@link robot.FlotCtrl.AndExp <em>And Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Exp</em>'.
	 * @see robot.FlotCtrl.AndExp
	 * @generated
	 */
	EClass getAndExp();

	/**
	 * Returns the meta object for the containment reference '{@link robot.FlotCtrl.AndExp#getLeftExp <em>Left Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Exp</em>'.
	 * @see robot.FlotCtrl.AndExp#getLeftExp()
	 * @see #getAndExp()
	 * @generated
	 */
	EReference getAndExp_LeftExp();

	/**
	 * Returns the meta object for the containment reference '{@link robot.FlotCtrl.AndExp#getRightExp <em>Right Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Exp</em>'.
	 * @see robot.FlotCtrl.AndExp#getRightExp()
	 * @see #getAndExp()
	 * @generated
	 */
	EReference getAndExp_RightExp();

	/**
	 * Returns the meta object for class '{@link robot.FlotCtrl.IfBlock <em>If Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Block</em>'.
	 * @see robot.FlotCtrl.IfBlock
	 * @generated
	 */
	EClass getIfBlock();

	/**
	 * Returns the meta object for the containment reference '{@link robot.FlotCtrl.IfBlock#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see robot.FlotCtrl.IfBlock#getCondition()
	 * @see #getIfBlock()
	 * @generated
	 */
	EReference getIfBlock_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link robot.FlotCtrl.IfBlock#getThenBlock <em>Then Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Then Block</em>'.
	 * @see robot.FlotCtrl.IfBlock#getThenBlock()
	 * @see #getIfBlock()
	 * @generated
	 */
	EReference getIfBlock_ThenBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link robot.FlotCtrl.IfBlock#getElseBlock <em>Else Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else Block</em>'.
	 * @see robot.FlotCtrl.IfBlock#getElseBlock()
	 * @see #getIfBlock()
	 * @generated
	 */
	EReference getIfBlock_ElseBlock();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FlotCtrlFactory getFlotCtrlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link robot.FlotCtrl.Expression <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.FlotCtrl.Expression
		 * @see robot.FlotCtrl.impl.FlotCtrlPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link robot.FlotCtrl.impl.WhileLoopImpl <em>While Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.FlotCtrl.impl.WhileLoopImpl
		 * @see robot.FlotCtrl.impl.FlotCtrlPackageImpl#getWhileLoop()
		 * @generated
		 */
		EClass WHILE_LOOP = eINSTANCE.getWhileLoop();

		/**
		 * The meta object literal for the '<em><b>Loop Cond</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_LOOP__LOOP_COND = eINSTANCE.getWhileLoop_LoopCond();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_LOOP__BLOCK = eINSTANCE.getWhileLoop_Block();

		/**
		 * The meta object literal for the '{@link robot.FlotCtrl.impl.NegExpImpl <em>Neg Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.FlotCtrl.impl.NegExpImpl
		 * @see robot.FlotCtrl.impl.FlotCtrlPackageImpl#getNegExp()
		 * @generated
		 */
		EClass NEG_EXP = eINSTANCE.getNegExp();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEG_EXP__EXP = eINSTANCE.getNegExp_Exp();

		/**
		 * The meta object literal for the '{@link robot.FlotCtrl.BoolExp <em>Bool Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.FlotCtrl.BoolExp
		 * @see robot.FlotCtrl.impl.FlotCtrlPackageImpl#getBoolExp()
		 * @generated
		 */
		EClass BOOL_EXP = eINSTANCE.getBoolExp();

		/**
		 * The meta object literal for the '{@link robot.FlotCtrl.impl.AndExpImpl <em>And Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.FlotCtrl.impl.AndExpImpl
		 * @see robot.FlotCtrl.impl.FlotCtrlPackageImpl#getAndExp()
		 * @generated
		 */
		EClass AND_EXP = eINSTANCE.getAndExp();

		/**
		 * The meta object literal for the '<em><b>Left Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_EXP__LEFT_EXP = eINSTANCE.getAndExp_LeftExp();

		/**
		 * The meta object literal for the '<em><b>Right Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_EXP__RIGHT_EXP = eINSTANCE.getAndExp_RightExp();

		/**
		 * The meta object literal for the '{@link robot.FlotCtrl.impl.IfBlockImpl <em>If Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see robot.FlotCtrl.impl.IfBlockImpl
		 * @see robot.FlotCtrl.impl.FlotCtrlPackageImpl#getIfBlock()
		 * @generated
		 */
		EClass IF_BLOCK = eINSTANCE.getIfBlock();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_BLOCK__CONDITION = eINSTANCE.getIfBlock_Condition();

		/**
		 * The meta object literal for the '<em><b>Then Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_BLOCK__THEN_BLOCK = eINSTANCE.getIfBlock_ThenBlock();

		/**
		 * The meta object literal for the '<em><b>Else Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_BLOCK__ELSE_BLOCK = eINSTANCE.getIfBlock_ElseBlock();

	}

} //FlotCtrlPackage
