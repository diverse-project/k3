/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.grammar;

/**
 * This class provides the follow sets for all terminals of the grammar. These
 * sets are used during code completion.
 */
public class ExpArithmtxtFollowSetProvider {
	
	public final static expArithm.resource.expArithmtxt.IExpArithmtxtExpectedElement TERMINALS[] = new expArithm.resource.expArithmtxt.IExpArithmtxtExpectedElement[5];
	
	public final static org.eclipse.emf.ecore.EStructuralFeature[] FEATURES = new org.eclipse.emf.ecore.EStructuralFeature[3];
	
	public final static expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[] LINKS = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[70];
	
	public final static expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[] EMPTY_LINK_ARRAY = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[0];
	
	public static void initializeTerminals0() {
		TERMINALS[0] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectedStructuralFeature(expArithm.resource.expArithmtxt.grammar.ExpArithmtxtGrammarInformationProvider.EXPARITHMTXT_1_0_0_0);
		TERMINALS[1] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectedCsString(expArithm.resource.expArithmtxt.grammar.ExpArithmtxtGrammarInformationProvider.EXPARITHMTXT_2_0_0_0);
		TERMINALS[2] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectedCsString(expArithm.resource.expArithmtxt.grammar.ExpArithmtxtGrammarInformationProvider.EXPARITHMTXT_3_0_0_0);
		TERMINALS[3] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectedCsString(expArithm.resource.expArithmtxt.grammar.ExpArithmtxtGrammarInformationProvider.EXPARITHMTXT_4_0_0_0);
		TERMINALS[4] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectedCsString(expArithm.resource.expArithmtxt.grammar.ExpArithmtxtGrammarInformationProvider.EXPARITHMTXT_5_0_0_0);
	}
	
	public static void initializeTerminals() {
		initializeTerminals0();
	}
	
	public static void initializeFeatures0() {
		FEATURES[0] = expArithm.ExpArithmPackage.eINSTANCE.getOperateurBinaire().getEStructuralFeature(expArithm.ExpArithmPackage.OPERATEUR_BINAIRE__ELT_DROIT);
		FEATURES[1] = expArithm.ExpArithmPackage.eINSTANCE.getOperateurBinaire().getEStructuralFeature(expArithm.ExpArithmPackage.OPERATEUR_BINAIRE__ELT_GAUCHE);
		FEATURES[2] = expArithm.ExpArithmPackage.eINSTANCE.getExpressionArithm().getEStructuralFeature(expArithm.ExpArithmPackage.EXPRESSION_ARITHM__RACINE);
	}
	
	public static void initializeFeatures() {
		initializeFeatures0();
	}
	
	public static void initializeLinks0() {
		LINKS[0] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getValeur(), FEATURES[2]);
		LINKS[1] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), FEATURES[2]);
		LINKS[2] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMult(), FEATURES[2]);
		LINKS[3] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getDivision(), FEATURES[2]);
		LINKS[4] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMoins(), FEATURES[2]);
		LINKS[5] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getValeur(), FEATURES[0]);
		LINKS[6] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), FEATURES[0]);
		LINKS[7] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMult(), FEATURES[0]);
		LINKS[8] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getDivision(), FEATURES[0]);
		LINKS[9] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMoins(), FEATURES[0]);
		LINKS[10] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getValeur(), FEATURES[1]);
		LINKS[11] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), FEATURES[1]);
		LINKS[12] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMult(), FEATURES[1]);
		LINKS[13] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getDivision(), FEATURES[1]);
		LINKS[14] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMoins(), FEATURES[1]);
		LINKS[15] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getValeur(), FEATURES[0]);
		LINKS[16] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), FEATURES[0]);
		LINKS[17] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMult(), FEATURES[0]);
		LINKS[18] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getDivision(), FEATURES[0]);
		LINKS[19] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMoins(), FEATURES[0]);
		LINKS[20] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getValeur(), FEATURES[0]);
		LINKS[21] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), FEATURES[0]);
		LINKS[22] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMult(), FEATURES[0]);
		LINKS[23] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getDivision(), FEATURES[0]);
		LINKS[24] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMoins(), FEATURES[0]);
		LINKS[25] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getValeur(), FEATURES[1]);
		LINKS[26] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), FEATURES[1]);
		LINKS[27] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMult(), FEATURES[1]);
		LINKS[28] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getDivision(), FEATURES[1]);
		LINKS[29] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMoins(), FEATURES[1]);
		LINKS[30] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getValeur(), FEATURES[0]);
		LINKS[31] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), FEATURES[0]);
		LINKS[32] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMult(), FEATURES[0]);
		LINKS[33] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getDivision(), FEATURES[0]);
		LINKS[34] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMoins(), FEATURES[0]);
		LINKS[35] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getValeur(), FEATURES[0]);
		LINKS[36] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), FEATURES[0]);
		LINKS[37] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMult(), FEATURES[0]);
		LINKS[38] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getDivision(), FEATURES[0]);
		LINKS[39] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMoins(), FEATURES[0]);
		LINKS[40] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getValeur(), FEATURES[1]);
		LINKS[41] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), FEATURES[1]);
		LINKS[42] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMult(), FEATURES[1]);
		LINKS[43] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getDivision(), FEATURES[1]);
		LINKS[44] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMoins(), FEATURES[1]);
		LINKS[45] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getValeur(), FEATURES[0]);
		LINKS[46] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), FEATURES[0]);
		LINKS[47] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMult(), FEATURES[0]);
		LINKS[48] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getDivision(), FEATURES[0]);
		LINKS[49] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMoins(), FEATURES[0]);
		LINKS[50] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getValeur(), FEATURES[0]);
		LINKS[51] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), FEATURES[0]);
		LINKS[52] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMult(), FEATURES[0]);
		LINKS[53] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getDivision(), FEATURES[0]);
		LINKS[54] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMoins(), FEATURES[0]);
		LINKS[55] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getValeur(), FEATURES[1]);
		LINKS[56] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), FEATURES[1]);
		LINKS[57] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMult(), FEATURES[1]);
		LINKS[58] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getDivision(), FEATURES[1]);
		LINKS[59] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMoins(), FEATURES[1]);
		LINKS[60] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getValeur(), FEATURES[0]);
		LINKS[61] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), FEATURES[0]);
		LINKS[62] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMult(), FEATURES[0]);
		LINKS[63] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getDivision(), FEATURES[0]);
		LINKS[64] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMoins(), FEATURES[0]);
		LINKS[65] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getValeur(), FEATURES[0]);
		LINKS[66] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), FEATURES[0]);
		LINKS[67] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMult(), FEATURES[0]);
		LINKS[68] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getDivision(), FEATURES[0]);
		LINKS[69] = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMoins(), FEATURES[0]);
	}
	
	public static void initializeLinks() {
		initializeLinks0();
	}
	
	public static void wire0() {
		TERMINALS[0].addFollower(TERMINALS[0], new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[] {new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getValeur(), FEATURES[0]), });
		TERMINALS[0].addFollower(TERMINALS[1], new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[] {new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), FEATURES[0]), });
		TERMINALS[0].addFollower(TERMINALS[2], new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[] {new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMult(), FEATURES[0]), });
		TERMINALS[0].addFollower(TERMINALS[3], new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[] {new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getDivision(), FEATURES[0]), });
		TERMINALS[0].addFollower(TERMINALS[4], new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[] {new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMoins(), FEATURES[0]), });
		TERMINALS[1].addFollower(TERMINALS[0], new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[] {new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getValeur(), FEATURES[1]), });
		TERMINALS[1].addFollower(TERMINALS[1], new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[] {new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), FEATURES[1]), });
		TERMINALS[1].addFollower(TERMINALS[2], new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[] {new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMult(), FEATURES[1]), });
		TERMINALS[1].addFollower(TERMINALS[3], new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[] {new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getDivision(), FEATURES[1]), });
		TERMINALS[1].addFollower(TERMINALS[4], new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[] {new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMoins(), FEATURES[1]), });
		TERMINALS[2].addFollower(TERMINALS[0], new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[] {new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getValeur(), FEATURES[1]), });
		TERMINALS[2].addFollower(TERMINALS[1], new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[] {new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), FEATURES[1]), });
		TERMINALS[2].addFollower(TERMINALS[2], new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[] {new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMult(), FEATURES[1]), });
		TERMINALS[2].addFollower(TERMINALS[3], new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[] {new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getDivision(), FEATURES[1]), });
		TERMINALS[2].addFollower(TERMINALS[4], new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[] {new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMoins(), FEATURES[1]), });
		TERMINALS[3].addFollower(TERMINALS[0], new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[] {new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getValeur(), FEATURES[1]), });
		TERMINALS[3].addFollower(TERMINALS[1], new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[] {new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), FEATURES[1]), });
		TERMINALS[3].addFollower(TERMINALS[2], new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[] {new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMult(), FEATURES[1]), });
		TERMINALS[3].addFollower(TERMINALS[3], new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[] {new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getDivision(), FEATURES[1]), });
		TERMINALS[3].addFollower(TERMINALS[4], new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[] {new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMoins(), FEATURES[1]), });
		TERMINALS[4].addFollower(TERMINALS[0], new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[] {new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getValeur(), FEATURES[1]), });
		TERMINALS[4].addFollower(TERMINALS[1], new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[] {new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), FEATURES[1]), });
		TERMINALS[4].addFollower(TERMINALS[2], new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[] {new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMult(), FEATURES[1]), });
		TERMINALS[4].addFollower(TERMINALS[3], new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[] {new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getDivision(), FEATURES[1]), });
		TERMINALS[4].addFollower(TERMINALS[4], new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[] {new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature(expArithm.ExpArithmPackage.eINSTANCE.getMoins(), FEATURES[1]), });
	}
	
	public static void wire() {
		wire0();
	}
	
	static {
		// initialize the arrays
		initializeTerminals();
		initializeFeatures();
		initializeLinks();
		// wire the terminals
		wire();
	}
}
