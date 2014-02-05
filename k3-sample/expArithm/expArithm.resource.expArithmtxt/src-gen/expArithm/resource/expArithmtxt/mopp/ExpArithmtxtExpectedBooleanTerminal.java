/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.mopp;

/**
 * A representation for a range in a document where a boolean attribute is
 * expected.
 */
public class ExpArithmtxtExpectedBooleanTerminal extends expArithm.resource.expArithmtxt.mopp.ExpArithmtxtAbstractExpectedElement {
	
	private expArithm.resource.expArithmtxt.grammar.ExpArithmtxtBooleanTerminal booleanTerminal;
	
	public ExpArithmtxtExpectedBooleanTerminal(expArithm.resource.expArithmtxt.grammar.ExpArithmtxtBooleanTerminal booleanTerminal) {
		super(booleanTerminal.getMetaclass());
		this.booleanTerminal = booleanTerminal;
	}
	
	public expArithm.resource.expArithmtxt.grammar.ExpArithmtxtBooleanTerminal getBooleanTerminal() {
		return booleanTerminal;
	}
	
	/**
	 * Returns the expected boolean terminal.
	 */
	public expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSyntaxElement getSymtaxElement() {
		return booleanTerminal;
	}
	
	private org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return booleanTerminal.getFeature();
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof ExpArithmtxtExpectedBooleanTerminal) {
			return getFeature().equals(((ExpArithmtxtExpectedBooleanTerminal) o).getFeature());
		}
		return false;
	}
	
	@Override	
	public int hashCode() {
		return getFeature().hashCode();
	}
	
	public java.util.Set<String> getTokenNames() {
		// BooleanTerminals are associated with two or one token(s)
		java.util.Set<String> tokenNames = new java.util.LinkedHashSet<String>(2);
		String trueLiteral = booleanTerminal.getTrueLiteral();
		if (!"".equals(trueLiteral)) {
			tokenNames.add("'" + trueLiteral + "'");
		}
		String falseLiteral = booleanTerminal.getFalseLiteral();
		if (!"".equals(falseLiteral)) {
			tokenNames.add("'" + falseLiteral + "'");
		}
		return tokenNames;
	}
	
}
