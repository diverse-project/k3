/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.grammar;

public class RobotGrammarInformationProvider {
	
	public final static org.eclipse.emf.ecore.EStructuralFeature ANONYMOUS_FEATURE = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public final static RobotGrammarInformationProvider INSTANCE = new RobotGrammarInformationProvider();
	
	private java.util.Set<String> keywords;
	
	public final static robot.resource.robot.grammar.RobotContainment ROBOT_0_0_0_0 = new robot.resource.robot.grammar.RobotContainment(robot.robot.RobotPackage.eINSTANCE.getProgramUnit().getEStructuralFeature(robot.robot.RobotPackage.PROGRAM_UNIT__BLOCK), robot.resource.robot.grammar.RobotCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getExpression(), }, 0);
	public final static robot.resource.robot.grammar.RobotSequence ROBOT_0_0_0 = new robot.resource.robot.grammar.RobotSequence(robot.resource.robot.grammar.RobotCardinality.ONE, ROBOT_0_0_0_0);
	public final static robot.resource.robot.grammar.RobotChoice ROBOT_0_0 = new robot.resource.robot.grammar.RobotChoice(robot.resource.robot.grammar.RobotCardinality.ONE, ROBOT_0_0_0);
	public final static robot.resource.robot.grammar.RobotRule ROBOT_0 = new robot.resource.robot.grammar.RobotRule(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), ROBOT_0_0, robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotContainment ROBOT_1_0_0_0 = new robot.resource.robot.grammar.RobotContainment(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getAndExp().getEStructuralFeature(robot.FlotCtrl.FlotCtrlPackage.AND_EXP__LEFT_EXP), robot.resource.robot.grammar.RobotCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getBoolExp(), }, 0);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_1_0_0_1 = new robot.resource.robot.grammar.RobotKeyword("and", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotContainment ROBOT_1_0_0_2 = new robot.resource.robot.grammar.RobotContainment(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getAndExp().getEStructuralFeature(robot.FlotCtrl.FlotCtrlPackage.AND_EXP__RIGHT_EXP), robot.resource.robot.grammar.RobotCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getBoolExp(), }, 0);
	public final static robot.resource.robot.grammar.RobotSequence ROBOT_1_0_0 = new robot.resource.robot.grammar.RobotSequence(robot.resource.robot.grammar.RobotCardinality.ONE, ROBOT_1_0_0_0, ROBOT_1_0_0_1, ROBOT_1_0_0_2);
	public final static robot.resource.robot.grammar.RobotChoice ROBOT_1_0 = new robot.resource.robot.grammar.RobotChoice(robot.resource.robot.grammar.RobotCardinality.ONE, ROBOT_1_0_0);
	public final static robot.resource.robot.grammar.RobotRule ROBOT_1 = new robot.resource.robot.grammar.RobotRule(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getAndExp(), ROBOT_1_0, robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_2_0_0_0 = new robot.resource.robot.grammar.RobotKeyword("not", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotContainment ROBOT_2_0_0_1 = new robot.resource.robot.grammar.RobotContainment(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getNegExp().getEStructuralFeature(robot.FlotCtrl.FlotCtrlPackage.NEG_EXP__EXP), robot.resource.robot.grammar.RobotCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getBoolExp(), }, 0);
	public final static robot.resource.robot.grammar.RobotSequence ROBOT_2_0_0 = new robot.resource.robot.grammar.RobotSequence(robot.resource.robot.grammar.RobotCardinality.ONE, ROBOT_2_0_0_0, ROBOT_2_0_0_1);
	public final static robot.resource.robot.grammar.RobotChoice ROBOT_2_0 = new robot.resource.robot.grammar.RobotChoice(robot.resource.robot.grammar.RobotCardinality.ONE, ROBOT_2_0_0);
	public final static robot.resource.robot.grammar.RobotRule ROBOT_2 = new robot.resource.robot.grammar.RobotRule(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getNegExp(), ROBOT_2_0, robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_3_0_0_0 = new robot.resource.robot.grammar.RobotKeyword("hasTurned", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_3_0_0_1 = new robot.resource.robot.grammar.RobotKeyword("(", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_3_0_0_2 = new robot.resource.robot.grammar.RobotKeyword("angle", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_3_0_0_3 = new robot.resource.robot.grammar.RobotKeyword("=", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotPlaceholder ROBOT_3_0_0_4 = new robot.resource.robot.grammar.RobotPlaceholder(robot.robot.RobotPackage.eINSTANCE.getHasTurnedCmd().getEStructuralFeature(robot.robot.RobotPackage.HAS_TURNED_CMD__ANGLE), "INT_LITERAL", robot.resource.robot.grammar.RobotCardinality.ONE, 0);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_3_0_0_5 = new robot.resource.robot.grammar.RobotKeyword(")", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotSequence ROBOT_3_0_0 = new robot.resource.robot.grammar.RobotSequence(robot.resource.robot.grammar.RobotCardinality.ONE, ROBOT_3_0_0_0, ROBOT_3_0_0_1, ROBOT_3_0_0_2, ROBOT_3_0_0_3, ROBOT_3_0_0_4, ROBOT_3_0_0_5);
	public final static robot.resource.robot.grammar.RobotChoice ROBOT_3_0 = new robot.resource.robot.grammar.RobotChoice(robot.resource.robot.grammar.RobotCardinality.ONE, ROBOT_3_0_0);
	public final static robot.resource.robot.grammar.RobotRule ROBOT_3 = new robot.resource.robot.grammar.RobotRule(robot.robot.RobotPackage.eINSTANCE.getHasTurnedCmd(), ROBOT_3_0, robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_4_0_0_0 = new robot.resource.robot.grammar.RobotKeyword("obstacle", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_4_0_0_1 = new robot.resource.robot.grammar.RobotKeyword("(", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_4_0_0_2 = new robot.resource.robot.grammar.RobotKeyword("distance", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_4_0_0_3 = new robot.resource.robot.grammar.RobotKeyword("=", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotPlaceholder ROBOT_4_0_0_4 = new robot.resource.robot.grammar.RobotPlaceholder(robot.robot.RobotPackage.eINSTANCE.getObstacleCmd().getEStructuralFeature(robot.robot.RobotPackage.OBSTACLE_CMD__DISTANCE), "INT_LITERAL", robot.resource.robot.grammar.RobotCardinality.ONE, 0);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_4_0_0_5 = new robot.resource.robot.grammar.RobotKeyword(")", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotSequence ROBOT_4_0_0 = new robot.resource.robot.grammar.RobotSequence(robot.resource.robot.grammar.RobotCardinality.ONE, ROBOT_4_0_0_0, ROBOT_4_0_0_1, ROBOT_4_0_0_2, ROBOT_4_0_0_3, ROBOT_4_0_0_4, ROBOT_4_0_0_5);
	public final static robot.resource.robot.grammar.RobotChoice ROBOT_4_0 = new robot.resource.robot.grammar.RobotChoice(robot.resource.robot.grammar.RobotCardinality.ONE, ROBOT_4_0_0);
	public final static robot.resource.robot.grammar.RobotRule ROBOT_4 = new robot.resource.robot.grammar.RobotRule(robot.robot.RobotPackage.eINSTANCE.getObstacleCmd(), ROBOT_4_0, robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_5_0_0_0 = new robot.resource.robot.grammar.RobotKeyword("while", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotContainment ROBOT_5_0_0_1 = new robot.resource.robot.grammar.RobotContainment(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop().getEStructuralFeature(robot.FlotCtrl.FlotCtrlPackage.WHILE_LOOP__LOOP_COND), robot.resource.robot.grammar.RobotCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getBoolExp(), }, 0);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_5_0_0_2 = new robot.resource.robot.grammar.RobotKeyword("do", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotContainment ROBOT_5_0_0_3 = new robot.resource.robot.grammar.RobotContainment(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop().getEStructuralFeature(robot.FlotCtrl.FlotCtrlPackage.WHILE_LOOP__BLOCK), robot.resource.robot.grammar.RobotCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getExpression(), }, 0);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_5_0_0_4 = new robot.resource.robot.grammar.RobotKeyword("end", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotSequence ROBOT_5_0_0 = new robot.resource.robot.grammar.RobotSequence(robot.resource.robot.grammar.RobotCardinality.ONE, ROBOT_5_0_0_0, ROBOT_5_0_0_1, ROBOT_5_0_0_2, ROBOT_5_0_0_3, ROBOT_5_0_0_4);
	public final static robot.resource.robot.grammar.RobotChoice ROBOT_5_0 = new robot.resource.robot.grammar.RobotChoice(robot.resource.robot.grammar.RobotCardinality.ONE, ROBOT_5_0_0);
	public final static robot.resource.robot.grammar.RobotRule ROBOT_5 = new robot.resource.robot.grammar.RobotRule(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), ROBOT_5_0, robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_6_0_0_0 = new robot.resource.robot.grammar.RobotKeyword("if", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotContainment ROBOT_6_0_0_1 = new robot.resource.robot.grammar.RobotContainment(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock().getEStructuralFeature(robot.FlotCtrl.FlotCtrlPackage.IF_BLOCK__CONDITION), robot.resource.robot.grammar.RobotCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getBoolExp(), }, 0);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_6_0_0_2 = new robot.resource.robot.grammar.RobotKeyword("then", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotContainment ROBOT_6_0_0_3 = new robot.resource.robot.grammar.RobotContainment(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock().getEStructuralFeature(robot.FlotCtrl.FlotCtrlPackage.IF_BLOCK__THEN_BLOCK), robot.resource.robot.grammar.RobotCardinality.PLUS, new org.eclipse.emf.ecore.EClass[] {robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getExpression(), }, 0);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_6_0_0_4_0_0_0 = new robot.resource.robot.grammar.RobotKeyword("else", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotContainment ROBOT_6_0_0_4_0_0_1 = new robot.resource.robot.grammar.RobotContainment(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock().getEStructuralFeature(robot.FlotCtrl.FlotCtrlPackage.IF_BLOCK__ELSE_BLOCK), robot.resource.robot.grammar.RobotCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getExpression(), }, 0);
	public final static robot.resource.robot.grammar.RobotSequence ROBOT_6_0_0_4_0_0 = new robot.resource.robot.grammar.RobotSequence(robot.resource.robot.grammar.RobotCardinality.ONE, ROBOT_6_0_0_4_0_0_0, ROBOT_6_0_0_4_0_0_1);
	public final static robot.resource.robot.grammar.RobotChoice ROBOT_6_0_0_4_0 = new robot.resource.robot.grammar.RobotChoice(robot.resource.robot.grammar.RobotCardinality.ONE, ROBOT_6_0_0_4_0_0);
	public final static robot.resource.robot.grammar.RobotCompound ROBOT_6_0_0_4 = new robot.resource.robot.grammar.RobotCompound(ROBOT_6_0_0_4_0, robot.resource.robot.grammar.RobotCardinality.QUESTIONMARK);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_6_0_0_5 = new robot.resource.robot.grammar.RobotKeyword("end", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotSequence ROBOT_6_0_0 = new robot.resource.robot.grammar.RobotSequence(robot.resource.robot.grammar.RobotCardinality.ONE, ROBOT_6_0_0_0, ROBOT_6_0_0_1, ROBOT_6_0_0_2, ROBOT_6_0_0_3, ROBOT_6_0_0_4, ROBOT_6_0_0_5);
	public final static robot.resource.robot.grammar.RobotChoice ROBOT_6_0 = new robot.resource.robot.grammar.RobotChoice(robot.resource.robot.grammar.RobotCardinality.ONE, ROBOT_6_0_0);
	public final static robot.resource.robot.grammar.RobotRule ROBOT_6 = new robot.resource.robot.grammar.RobotRule(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), ROBOT_6_0, robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_7_0_0_0 = new robot.resource.robot.grammar.RobotKeyword("bip", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_7_0_0_1 = new robot.resource.robot.grammar.RobotKeyword("(", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_7_0_0_2 = new robot.resource.robot.grammar.RobotKeyword("duration", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_7_0_0_3 = new robot.resource.robot.grammar.RobotKeyword("=", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotPlaceholder ROBOT_7_0_0_4 = new robot.resource.robot.grammar.RobotPlaceholder(robot.robot.RobotPackage.eINSTANCE.getBip().getEStructuralFeature(robot.robot.RobotPackage.BIP__DURATION), "INT_LITERAL", robot.resource.robot.grammar.RobotCardinality.ONE, 0);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_7_0_0_5 = new robot.resource.robot.grammar.RobotKeyword(",", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_7_0_0_6 = new robot.resource.robot.grammar.RobotKeyword("power", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_7_0_0_7 = new robot.resource.robot.grammar.RobotKeyword("=", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotPlaceholder ROBOT_7_0_0_8 = new robot.resource.robot.grammar.RobotPlaceholder(robot.robot.RobotPackage.eINSTANCE.getBip().getEStructuralFeature(robot.robot.RobotPackage.BIP__POWER), "INT_LITERAL", robot.resource.robot.grammar.RobotCardinality.ONE, 0);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_7_0_0_9 = new robot.resource.robot.grammar.RobotKeyword(",", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_7_0_0_10 = new robot.resource.robot.grammar.RobotKeyword("repeat", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_7_0_0_11 = new robot.resource.robot.grammar.RobotKeyword("=", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotPlaceholder ROBOT_7_0_0_12 = new robot.resource.robot.grammar.RobotPlaceholder(robot.robot.RobotPackage.eINSTANCE.getBip().getEStructuralFeature(robot.robot.RobotPackage.BIP__REPET), "BOOLEAN_LITERAL", robot.resource.robot.grammar.RobotCardinality.ONE, 0);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_7_0_0_13 = new robot.resource.robot.grammar.RobotKeyword(")", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotSequence ROBOT_7_0_0 = new robot.resource.robot.grammar.RobotSequence(robot.resource.robot.grammar.RobotCardinality.ONE, ROBOT_7_0_0_0, ROBOT_7_0_0_1, ROBOT_7_0_0_2, ROBOT_7_0_0_3, ROBOT_7_0_0_4, ROBOT_7_0_0_5, ROBOT_7_0_0_6, ROBOT_7_0_0_7, ROBOT_7_0_0_8, ROBOT_7_0_0_9, ROBOT_7_0_0_10, ROBOT_7_0_0_11, ROBOT_7_0_0_12, ROBOT_7_0_0_13);
	public final static robot.resource.robot.grammar.RobotChoice ROBOT_7_0 = new robot.resource.robot.grammar.RobotChoice(robot.resource.robot.grammar.RobotCardinality.ONE, ROBOT_7_0_0);
	public final static robot.resource.robot.grammar.RobotRule ROBOT_7 = new robot.resource.robot.grammar.RobotRule(robot.robot.RobotPackage.eINSTANCE.getBip(), ROBOT_7_0, robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_8_0_0_0 = new robot.resource.robot.grammar.RobotKeyword("move", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_8_0_0_1 = new robot.resource.robot.grammar.RobotKeyword("(", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_8_0_0_2 = new robot.resource.robot.grammar.RobotKeyword("power", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_8_0_0_3 = new robot.resource.robot.grammar.RobotKeyword("=", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotPlaceholder ROBOT_8_0_0_4 = new robot.resource.robot.grammar.RobotPlaceholder(robot.robot.RobotPackage.eINSTANCE.getMoveCmd().getEStructuralFeature(robot.robot.RobotPackage.MOVE_CMD__POWER), "INT_LITERAL", robot.resource.robot.grammar.RobotCardinality.ONE, 0);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_8_0_0_5 = new robot.resource.robot.grammar.RobotKeyword(")", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotSequence ROBOT_8_0_0 = new robot.resource.robot.grammar.RobotSequence(robot.resource.robot.grammar.RobotCardinality.ONE, ROBOT_8_0_0_0, ROBOT_8_0_0_1, ROBOT_8_0_0_2, ROBOT_8_0_0_3, ROBOT_8_0_0_4, ROBOT_8_0_0_5);
	public final static robot.resource.robot.grammar.RobotChoice ROBOT_8_0 = new robot.resource.robot.grammar.RobotChoice(robot.resource.robot.grammar.RobotCardinality.ONE, ROBOT_8_0_0);
	public final static robot.resource.robot.grammar.RobotRule ROBOT_8 = new robot.resource.robot.grammar.RobotRule(robot.robot.RobotPackage.eINSTANCE.getMoveCmd(), ROBOT_8_0, robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_9_0_0_0 = new robot.resource.robot.grammar.RobotKeyword("display", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_9_0_0_1 = new robot.resource.robot.grammar.RobotKeyword("(", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_9_0_0_2 = new robot.resource.robot.grammar.RobotKeyword("msg", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_9_0_0_3 = new robot.resource.robot.grammar.RobotKeyword("=", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotPlaceholder ROBOT_9_0_0_4 = new robot.resource.robot.grammar.RobotPlaceholder(robot.robot.RobotPackage.eINSTANCE.getPrintCmd().getEStructuralFeature(robot.robot.RobotPackage.PRINT_CMD__MSG), "STRING_LITERAL", robot.resource.robot.grammar.RobotCardinality.ONE, 0);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_9_0_0_5 = new robot.resource.robot.grammar.RobotKeyword(",", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_9_0_0_6 = new robot.resource.robot.grammar.RobotKeyword("duration", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_9_0_0_7 = new robot.resource.robot.grammar.RobotKeyword("=", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotPlaceholder ROBOT_9_0_0_8 = new robot.resource.robot.grammar.RobotPlaceholder(robot.robot.RobotPackage.eINSTANCE.getPrintCmd().getEStructuralFeature(robot.robot.RobotPackage.PRINT_CMD__DURATION), "INT_LITERAL", robot.resource.robot.grammar.RobotCardinality.ONE, 0);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_9_0_0_9 = new robot.resource.robot.grammar.RobotKeyword(",", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_9_0_0_10 = new robot.resource.robot.grammar.RobotKeyword("line", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_9_0_0_11 = new robot.resource.robot.grammar.RobotKeyword("=", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotPlaceholder ROBOT_9_0_0_12 = new robot.resource.robot.grammar.RobotPlaceholder(robot.robot.RobotPackage.eINSTANCE.getPrintCmd().getEStructuralFeature(robot.robot.RobotPackage.PRINT_CMD__LINE), "INT_LITERAL", robot.resource.robot.grammar.RobotCardinality.ONE, 0);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_9_0_0_13 = new robot.resource.robot.grammar.RobotKeyword(",", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_9_0_0_14 = new robot.resource.robot.grammar.RobotKeyword("col", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_9_0_0_15 = new robot.resource.robot.grammar.RobotKeyword("=", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotPlaceholder ROBOT_9_0_0_16 = new robot.resource.robot.grammar.RobotPlaceholder(robot.robot.RobotPackage.eINSTANCE.getPrintCmd().getEStructuralFeature(robot.robot.RobotPackage.PRINT_CMD__COL), "INT_LITERAL", robot.resource.robot.grammar.RobotCardinality.ONE, 0);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_9_0_0_17 = new robot.resource.robot.grammar.RobotKeyword(")", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotSequence ROBOT_9_0_0 = new robot.resource.robot.grammar.RobotSequence(robot.resource.robot.grammar.RobotCardinality.ONE, ROBOT_9_0_0_0, ROBOT_9_0_0_1, ROBOT_9_0_0_2, ROBOT_9_0_0_3, ROBOT_9_0_0_4, ROBOT_9_0_0_5, ROBOT_9_0_0_6, ROBOT_9_0_0_7, ROBOT_9_0_0_8, ROBOT_9_0_0_9, ROBOT_9_0_0_10, ROBOT_9_0_0_11, ROBOT_9_0_0_12, ROBOT_9_0_0_13, ROBOT_9_0_0_14, ROBOT_9_0_0_15, ROBOT_9_0_0_16, ROBOT_9_0_0_17);
	public final static robot.resource.robot.grammar.RobotChoice ROBOT_9_0 = new robot.resource.robot.grammar.RobotChoice(robot.resource.robot.grammar.RobotCardinality.ONE, ROBOT_9_0_0);
	public final static robot.resource.robot.grammar.RobotRule ROBOT_9 = new robot.resource.robot.grammar.RobotRule(robot.robot.RobotPackage.eINSTANCE.getPrintCmd(), ROBOT_9_0, robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_10_0_0_0 = new robot.resource.robot.grammar.RobotKeyword("setTurnAngle", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_10_0_0_1 = new robot.resource.robot.grammar.RobotKeyword("(", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_10_0_0_2 = new robot.resource.robot.grammar.RobotKeyword("angle", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_10_0_0_3 = new robot.resource.robot.grammar.RobotKeyword("=", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotPlaceholder ROBOT_10_0_0_4 = new robot.resource.robot.grammar.RobotPlaceholder(robot.robot.RobotPackage.eINSTANCE.getSetTurnAngleCmd().getEStructuralFeature(robot.robot.RobotPackage.SET_TURN_ANGLE_CMD__ANGLE), "INT_LITERAL", robot.resource.robot.grammar.RobotCardinality.ONE, 0);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_10_0_0_5 = new robot.resource.robot.grammar.RobotKeyword(")", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotSequence ROBOT_10_0_0 = new robot.resource.robot.grammar.RobotSequence(robot.resource.robot.grammar.RobotCardinality.ONE, ROBOT_10_0_0_0, ROBOT_10_0_0_1, ROBOT_10_0_0_2, ROBOT_10_0_0_3, ROBOT_10_0_0_4, ROBOT_10_0_0_5);
	public final static robot.resource.robot.grammar.RobotChoice ROBOT_10_0 = new robot.resource.robot.grammar.RobotChoice(robot.resource.robot.grammar.RobotCardinality.ONE, ROBOT_10_0_0);
	public final static robot.resource.robot.grammar.RobotRule ROBOT_10 = new robot.resource.robot.grammar.RobotRule(robot.robot.RobotPackage.eINSTANCE.getSetTurnAngleCmd(), ROBOT_10_0, robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_11_0_0_0 = new robot.resource.robot.grammar.RobotKeyword("stopEngine", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotSequence ROBOT_11_0_0 = new robot.resource.robot.grammar.RobotSequence(robot.resource.robot.grammar.RobotCardinality.ONE, ROBOT_11_0_0_0);
	public final static robot.resource.robot.grammar.RobotChoice ROBOT_11_0 = new robot.resource.robot.grammar.RobotChoice(robot.resource.robot.grammar.RobotCardinality.ONE, ROBOT_11_0_0);
	public final static robot.resource.robot.grammar.RobotRule ROBOT_11 = new robot.resource.robot.grammar.RobotRule(robot.robot.RobotPackage.eINSTANCE.getStopEngineCmd(), ROBOT_11_0, robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_12_0_0_0 = new robot.resource.robot.grammar.RobotKeyword("stopProgram", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotSequence ROBOT_12_0_0 = new robot.resource.robot.grammar.RobotSequence(robot.resource.robot.grammar.RobotCardinality.ONE, ROBOT_12_0_0_0);
	public final static robot.resource.robot.grammar.RobotChoice ROBOT_12_0 = new robot.resource.robot.grammar.RobotChoice(robot.resource.robot.grammar.RobotCardinality.ONE, ROBOT_12_0_0);
	public final static robot.resource.robot.grammar.RobotRule ROBOT_12 = new robot.resource.robot.grammar.RobotRule(robot.robot.RobotPackage.eINSTANCE.getStopProgramCmd(), ROBOT_12_0, robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_13_0_0_0 = new robot.resource.robot.grammar.RobotKeyword("turn", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_13_0_0_1 = new robot.resource.robot.grammar.RobotKeyword("(", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_13_0_0_2 = new robot.resource.robot.grammar.RobotKeyword("power", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_13_0_0_3 = new robot.resource.robot.grammar.RobotKeyword("=", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotPlaceholder ROBOT_13_0_0_4 = new robot.resource.robot.grammar.RobotPlaceholder(robot.robot.RobotPackage.eINSTANCE.getTurnCmd().getEStructuralFeature(robot.robot.RobotPackage.TURN_CMD__POWER), "INT_LITERAL", robot.resource.robot.grammar.RobotCardinality.ONE, 0);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_13_0_0_5 = new robot.resource.robot.grammar.RobotKeyword(",", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_13_0_0_6 = new robot.resource.robot.grammar.RobotKeyword("angle", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_13_0_0_7 = new robot.resource.robot.grammar.RobotKeyword("=", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotPlaceholder ROBOT_13_0_0_8 = new robot.resource.robot.grammar.RobotPlaceholder(robot.robot.RobotPackage.eINSTANCE.getTurnCmd().getEStructuralFeature(robot.robot.RobotPackage.TURN_CMD__ANGLE), "INT_LITERAL", robot.resource.robot.grammar.RobotCardinality.ONE, 0);
	public final static robot.resource.robot.grammar.RobotKeyword ROBOT_13_0_0_9 = new robot.resource.robot.grammar.RobotKeyword(")", robot.resource.robot.grammar.RobotCardinality.ONE);
	public final static robot.resource.robot.grammar.RobotSequence ROBOT_13_0_0 = new robot.resource.robot.grammar.RobotSequence(robot.resource.robot.grammar.RobotCardinality.ONE, ROBOT_13_0_0_0, ROBOT_13_0_0_1, ROBOT_13_0_0_2, ROBOT_13_0_0_3, ROBOT_13_0_0_4, ROBOT_13_0_0_5, ROBOT_13_0_0_6, ROBOT_13_0_0_7, ROBOT_13_0_0_8, ROBOT_13_0_0_9);
	public final static robot.resource.robot.grammar.RobotChoice ROBOT_13_0 = new robot.resource.robot.grammar.RobotChoice(robot.resource.robot.grammar.RobotCardinality.ONE, ROBOT_13_0_0);
	public final static robot.resource.robot.grammar.RobotRule ROBOT_13 = new robot.resource.robot.grammar.RobotRule(robot.robot.RobotPackage.eINSTANCE.getTurnCmd(), ROBOT_13_0, robot.resource.robot.grammar.RobotCardinality.ONE);
	
	public static String getSyntaxElementID(robot.resource.robot.grammar.RobotSyntaxElement syntaxElement) {
		if (syntaxElement == null) {
			// null indicates EOF
			return "<EOF>";
		}
		for (java.lang.reflect.Field field : robot.resource.robot.grammar.RobotGrammarInformationProvider.class.getFields()) {
			Object fieldValue;
			try {
				fieldValue = field.get(null);
				if (fieldValue == syntaxElement) {
					String id = field.getName();
					return id;
				}
			} catch (Exception e) { }
		}
		return null;
	}
	
	public static robot.resource.robot.grammar.RobotSyntaxElement getSyntaxElementByID(String syntaxElementID) {
		try {
			return (robot.resource.robot.grammar.RobotSyntaxElement) robot.resource.robot.grammar.RobotGrammarInformationProvider.class.getField(syntaxElementID).get(null);
		} catch (Exception e) {
			return null;
		}
	}
	
	public final static robot.resource.robot.grammar.RobotRule[] RULES = new robot.resource.robot.grammar.RobotRule[] {
		ROBOT_0,
		ROBOT_1,
		ROBOT_2,
		ROBOT_3,
		ROBOT_4,
		ROBOT_5,
		ROBOT_6,
		ROBOT_7,
		ROBOT_8,
		ROBOT_9,
		ROBOT_10,
		ROBOT_11,
		ROBOT_12,
		ROBOT_13,
	};
	
	/**
	 * Returns all keywords of the grammar. This includes all literals for boolean and
	 * enumeration terminals.
	 */
	public java.util.Set<String> getKeywords() {
		if (this.keywords == null) {
			this.keywords = new java.util.LinkedHashSet<String>();
			for (robot.resource.robot.grammar.RobotRule rule : RULES) {
				findKeywords(rule, this.keywords);
			}
		}
		return keywords;
	}
	
	/**
	 * Finds all keywords in the given element and its children and adds them to the
	 * set. This includes all literals for boolean and enumeration terminals.
	 */
	private void findKeywords(robot.resource.robot.grammar.RobotSyntaxElement element, java.util.Set<String> keywords) {
		if (element instanceof robot.resource.robot.grammar.RobotKeyword) {
			keywords.add(((robot.resource.robot.grammar.RobotKeyword) element).getValue());
		} else if (element instanceof robot.resource.robot.grammar.RobotBooleanTerminal) {
			keywords.add(((robot.resource.robot.grammar.RobotBooleanTerminal) element).getTrueLiteral());
			keywords.add(((robot.resource.robot.grammar.RobotBooleanTerminal) element).getFalseLiteral());
		} else if (element instanceof robot.resource.robot.grammar.RobotEnumerationTerminal) {
			robot.resource.robot.grammar.RobotEnumerationTerminal terminal = (robot.resource.robot.grammar.RobotEnumerationTerminal) element;
			for (String key : terminal.getLiteralMapping().keySet()) {
				keywords.add(key);
			}
		}
		for (robot.resource.robot.grammar.RobotSyntaxElement child : element.getChildren()) {
			findKeywords(child, this.keywords);
		}
	}
	
}
