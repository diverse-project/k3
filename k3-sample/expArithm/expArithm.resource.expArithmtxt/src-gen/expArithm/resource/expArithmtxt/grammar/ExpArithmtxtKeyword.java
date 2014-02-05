/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class ExpArithmtxtKeyword extends expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSyntaxElement {
	
	private final String value;
	
	public ExpArithmtxtKeyword(String value, expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
