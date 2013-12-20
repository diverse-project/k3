/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class ExpArithmtxtExpectedCsString extends expArithm.resource.expArithmtxt.mopp.ExpArithmtxtAbstractExpectedElement {
	
	private expArithm.resource.expArithmtxt.grammar.ExpArithmtxtKeyword keyword;
	
	public ExpArithmtxtExpectedCsString(expArithm.resource.expArithmtxt.grammar.ExpArithmtxtKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	/**
	 * Returns the expected keyword.
	 */
	public expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSyntaxElement getSymtaxElement() {
		return keyword;
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof ExpArithmtxtExpectedCsString) {
			return getValue().equals(((ExpArithmtxtExpectedCsString) o).getValue());
		}
		return false;
	}
	
	@Override	
	public int hashCode() {
		return getValue().hashCode();
	}
	
}
