/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.grammar;

public class ExpArithmtxtWhiteSpace extends expArithm.resource.expArithmtxt.grammar.ExpArithmtxtFormattingElement {
	
	private final int amount;
	
	public ExpArithmtxtWhiteSpace(int amount, expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}
