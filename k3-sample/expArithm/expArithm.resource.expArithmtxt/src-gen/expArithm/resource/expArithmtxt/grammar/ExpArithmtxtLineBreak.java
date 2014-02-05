/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.grammar;

public class ExpArithmtxtLineBreak extends expArithm.resource.expArithmtxt.grammar.ExpArithmtxtFormattingElement {
	
	private final int tabs;
	
	public ExpArithmtxtLineBreak(expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
