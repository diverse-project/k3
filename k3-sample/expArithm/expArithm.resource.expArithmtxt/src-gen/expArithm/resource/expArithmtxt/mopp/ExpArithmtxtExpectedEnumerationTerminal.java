/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.mopp;

/**
 * A representation for a range in a document where an enumeration literal (i.e.,
 * a set of static strings) is expected.
 */
public class ExpArithmtxtExpectedEnumerationTerminal extends expArithm.resource.expArithmtxt.mopp.ExpArithmtxtAbstractExpectedElement {
	
	private expArithm.resource.expArithmtxt.grammar.ExpArithmtxtEnumerationTerminal enumerationTerminal;
	
	public ExpArithmtxtExpectedEnumerationTerminal(expArithm.resource.expArithmtxt.grammar.ExpArithmtxtEnumerationTerminal enumerationTerminal) {
		super(enumerationTerminal.getMetaclass());
		this.enumerationTerminal = enumerationTerminal;
	}
	
	public java.util.Set<String> getTokenNames() {
		// EnumerationTerminals are associated with multiple tokens, one for each literal
		// that was mapped to a string
		java.util.Set<String> tokenNames = new java.util.LinkedHashSet<String>();
		java.util.Map<String, String> mapping = enumerationTerminal.getLiteralMapping();
		for (String literalName : mapping.keySet()) {
			String text = mapping.get(literalName);
			if (text != null && !"".equals(text)) {
				tokenNames.add("'" + text + "'");
			}
		}
		return tokenNames;
	}
	
	public expArithm.resource.expArithmtxt.grammar.ExpArithmtxtEnumerationTerminal getEnumerationTerminal() {
		return this.enumerationTerminal;
	}
	
	/**
	 * Returns the expected enumeration terminal.
	 */
	public expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSyntaxElement getSymtaxElement() {
		return enumerationTerminal;
	}
	
	public String toString() {
		return "EnumTerminal \"" + getEnumerationTerminal() + "\"";
	}
	
}
