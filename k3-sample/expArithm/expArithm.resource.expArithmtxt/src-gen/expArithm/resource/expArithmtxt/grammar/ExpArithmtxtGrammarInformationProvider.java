/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.grammar;

public class ExpArithmtxtGrammarInformationProvider {
	
	public final static org.eclipse.emf.ecore.EStructuralFeature ANONYMOUS_FEATURE = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public final static ExpArithmtxtGrammarInformationProvider INSTANCE = new ExpArithmtxtGrammarInformationProvider();
	
	private java.util.Set<String> keywords;
	
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtContainment EXPARITHMTXT_0_0_0_0 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtContainment(expArithm.ExpArithmPackage.eINSTANCE.getExpressionArithm().getEStructuralFeature(expArithm.ExpArithmPackage.EXPRESSION_ARITHM__RACINE), expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.QUESTIONMARK, new org.eclipse.emf.ecore.EClass[] {expArithm.ExpArithmPackage.eINSTANCE.getEltExp(), }, 0);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSequence EXPARITHMTXT_0_0_0 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSequence(expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE, EXPARITHMTXT_0_0_0_0);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtChoice EXPARITHMTXT_0_0 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtChoice(expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE, EXPARITHMTXT_0_0_0);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtRule EXPARITHMTXT_0 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtRule(expArithm.ExpArithmPackage.eINSTANCE.getExpressionArithm(), EXPARITHMTXT_0_0, expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtPlaceholder EXPARITHMTXT_1_0_0_0 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtPlaceholder(expArithm.ExpArithmPackage.eINSTANCE.getValeur().getEStructuralFeature(expArithm.ExpArithmPackage.VALEUR__VALEUR), "VALUE", expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE, 0);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSequence EXPARITHMTXT_1_0_0 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSequence(expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE, EXPARITHMTXT_1_0_0_0);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtChoice EXPARITHMTXT_1_0 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtChoice(expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE, EXPARITHMTXT_1_0_0);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtRule EXPARITHMTXT_1 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtRule(expArithm.ExpArithmPackage.eINSTANCE.getValeur(), EXPARITHMTXT_1_0, expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtKeyword EXPARITHMTXT_2_0_0_0 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtKeyword("+", expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtContainment EXPARITHMTXT_2_0_0_1 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtContainment(expArithm.ExpArithmPackage.eINSTANCE.getPlus().getEStructuralFeature(expArithm.ExpArithmPackage.PLUS__ELT_GAUCHE), expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {expArithm.ExpArithmPackage.eINSTANCE.getEltExp(), }, 0);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtContainment EXPARITHMTXT_2_0_0_2 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtContainment(expArithm.ExpArithmPackage.eINSTANCE.getPlus().getEStructuralFeature(expArithm.ExpArithmPackage.PLUS__ELT_DROIT), expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {expArithm.ExpArithmPackage.eINSTANCE.getEltExp(), }, 0);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSequence EXPARITHMTXT_2_0_0 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSequence(expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE, EXPARITHMTXT_2_0_0_0, EXPARITHMTXT_2_0_0_1, EXPARITHMTXT_2_0_0_2);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtChoice EXPARITHMTXT_2_0 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtChoice(expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE, EXPARITHMTXT_2_0_0);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtRule EXPARITHMTXT_2 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtRule(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), EXPARITHMTXT_2_0, expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtKeyword EXPARITHMTXT_3_0_0_0 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtKeyword("*", expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtContainment EXPARITHMTXT_3_0_0_1 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtContainment(expArithm.ExpArithmPackage.eINSTANCE.getMult().getEStructuralFeature(expArithm.ExpArithmPackage.MULT__ELT_GAUCHE), expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {expArithm.ExpArithmPackage.eINSTANCE.getEltExp(), }, 0);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtContainment EXPARITHMTXT_3_0_0_2 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtContainment(expArithm.ExpArithmPackage.eINSTANCE.getMult().getEStructuralFeature(expArithm.ExpArithmPackage.MULT__ELT_DROIT), expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {expArithm.ExpArithmPackage.eINSTANCE.getEltExp(), }, 0);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSequence EXPARITHMTXT_3_0_0 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSequence(expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE, EXPARITHMTXT_3_0_0_0, EXPARITHMTXT_3_0_0_1, EXPARITHMTXT_3_0_0_2);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtChoice EXPARITHMTXT_3_0 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtChoice(expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE, EXPARITHMTXT_3_0_0);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtRule EXPARITHMTXT_3 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtRule(expArithm.ExpArithmPackage.eINSTANCE.getMult(), EXPARITHMTXT_3_0, expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtKeyword EXPARITHMTXT_4_0_0_0 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtKeyword("/", expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtContainment EXPARITHMTXT_4_0_0_1 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtContainment(expArithm.ExpArithmPackage.eINSTANCE.getDivision().getEStructuralFeature(expArithm.ExpArithmPackage.DIVISION__ELT_GAUCHE), expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {expArithm.ExpArithmPackage.eINSTANCE.getEltExp(), }, 0);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtContainment EXPARITHMTXT_4_0_0_2 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtContainment(expArithm.ExpArithmPackage.eINSTANCE.getDivision().getEStructuralFeature(expArithm.ExpArithmPackage.DIVISION__ELT_DROIT), expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {expArithm.ExpArithmPackage.eINSTANCE.getEltExp(), }, 0);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSequence EXPARITHMTXT_4_0_0 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSequence(expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE, EXPARITHMTXT_4_0_0_0, EXPARITHMTXT_4_0_0_1, EXPARITHMTXT_4_0_0_2);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtChoice EXPARITHMTXT_4_0 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtChoice(expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE, EXPARITHMTXT_4_0_0);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtRule EXPARITHMTXT_4 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtRule(expArithm.ExpArithmPackage.eINSTANCE.getDivision(), EXPARITHMTXT_4_0, expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtKeyword EXPARITHMTXT_5_0_0_0 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtKeyword("-", expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtContainment EXPARITHMTXT_5_0_0_1 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtContainment(expArithm.ExpArithmPackage.eINSTANCE.getMoins().getEStructuralFeature(expArithm.ExpArithmPackage.MOINS__ELT_GAUCHE), expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {expArithm.ExpArithmPackage.eINSTANCE.getEltExp(), }, 0);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtContainment EXPARITHMTXT_5_0_0_2 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtContainment(expArithm.ExpArithmPackage.eINSTANCE.getMoins().getEStructuralFeature(expArithm.ExpArithmPackage.MOINS__ELT_DROIT), expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {expArithm.ExpArithmPackage.eINSTANCE.getEltExp(), }, 0);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSequence EXPARITHMTXT_5_0_0 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSequence(expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE, EXPARITHMTXT_5_0_0_0, EXPARITHMTXT_5_0_0_1, EXPARITHMTXT_5_0_0_2);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtChoice EXPARITHMTXT_5_0 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtChoice(expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE, EXPARITHMTXT_5_0_0);
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtRule EXPARITHMTXT_5 = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtRule(expArithm.ExpArithmPackage.eINSTANCE.getMoins(), EXPARITHMTXT_5_0, expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality.ONE);
	
	public static String getSyntaxElementID(expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSyntaxElement syntaxElement) {
		if (syntaxElement == null) {
			// null indicates EOF
			return "<EOF>";
		}
		for (java.lang.reflect.Field field : expArithm.resource.expArithmtxt.grammar.ExpArithmtxtGrammarInformationProvider.class.getFields()) {
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
	
	public static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSyntaxElement getSyntaxElementByID(String syntaxElementID) {
		try {
			return (expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSyntaxElement) expArithm.resource.expArithmtxt.grammar.ExpArithmtxtGrammarInformationProvider.class.getField(syntaxElementID).get(null);
		} catch (Exception e) {
			return null;
		}
	}
	
	public final static expArithm.resource.expArithmtxt.grammar.ExpArithmtxtRule[] RULES = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtRule[] {
		EXPARITHMTXT_0,
		EXPARITHMTXT_1,
		EXPARITHMTXT_2,
		EXPARITHMTXT_3,
		EXPARITHMTXT_4,
		EXPARITHMTXT_5,
	};
	
	/**
	 * Returns all keywords of the grammar. This includes all literals for boolean and
	 * enumeration terminals.
	 */
	public java.util.Set<String> getKeywords() {
		if (this.keywords == null) {
			this.keywords = new java.util.LinkedHashSet<String>();
			for (expArithm.resource.expArithmtxt.grammar.ExpArithmtxtRule rule : RULES) {
				findKeywords(rule, this.keywords);
			}
		}
		return keywords;
	}
	
	/**
	 * Finds all keywords in the given element and its children and adds them to the
	 * set. This includes all literals for boolean and enumeration terminals.
	 */
	private void findKeywords(expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSyntaxElement element, java.util.Set<String> keywords) {
		if (element instanceof expArithm.resource.expArithmtxt.grammar.ExpArithmtxtKeyword) {
			keywords.add(((expArithm.resource.expArithmtxt.grammar.ExpArithmtxtKeyword) element).getValue());
		} else if (element instanceof expArithm.resource.expArithmtxt.grammar.ExpArithmtxtBooleanTerminal) {
			keywords.add(((expArithm.resource.expArithmtxt.grammar.ExpArithmtxtBooleanTerminal) element).getTrueLiteral());
			keywords.add(((expArithm.resource.expArithmtxt.grammar.ExpArithmtxtBooleanTerminal) element).getFalseLiteral());
		} else if (element instanceof expArithm.resource.expArithmtxt.grammar.ExpArithmtxtEnumerationTerminal) {
			expArithm.resource.expArithmtxt.grammar.ExpArithmtxtEnumerationTerminal terminal = (expArithm.resource.expArithmtxt.grammar.ExpArithmtxtEnumerationTerminal) element;
			for (String key : terminal.getLiteralMapping().keySet()) {
				keywords.add(key);
			}
		}
		for (expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSyntaxElement child : element.getChildren()) {
			findKeywords(child, this.keywords);
		}
	}
	
}
