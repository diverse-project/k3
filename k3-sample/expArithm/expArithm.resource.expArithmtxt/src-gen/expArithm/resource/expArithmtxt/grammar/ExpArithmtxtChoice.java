/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.grammar;

public class ExpArithmtxtChoice extends expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSyntaxElement {
	
	public ExpArithmtxtChoice(expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality cardinality, expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return expArithm.resource.expArithmtxt.util.ExpArithmtxtStringUtil.explode(getChildren(), "|");
	}
	
}
