/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.grammar;

public class ExpArithmtxtCompound extends expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSyntaxElement {
	
	public ExpArithmtxtCompound(expArithm.resource.expArithmtxt.grammar.ExpArithmtxtChoice choice, expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality cardinality) {
		super(cardinality, new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
