/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.grammar;

public class ExpArithmtxtSequence extends expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSyntaxElement {
	
	public ExpArithmtxtSequence(expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality cardinality, expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return expArithm.resource.expArithmtxt.util.ExpArithmtxtStringUtil.explode(getChildren(), " ");
	}
	
}
