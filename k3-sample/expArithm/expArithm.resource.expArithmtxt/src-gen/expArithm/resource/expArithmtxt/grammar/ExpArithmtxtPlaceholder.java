/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class ExpArithmtxtPlaceholder extends expArithm.resource.expArithmtxt.grammar.ExpArithmtxtTerminal {
	
	private final String tokenName;
	
	public ExpArithmtxtPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
