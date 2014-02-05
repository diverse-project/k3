/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class ExpArithmtxtExpectedStructuralFeature extends expArithm.resource.expArithmtxt.mopp.ExpArithmtxtAbstractExpectedElement {
	
	private expArithm.resource.expArithmtxt.grammar.ExpArithmtxtPlaceholder placeholder;
	
	public ExpArithmtxtExpectedStructuralFeature(expArithm.resource.expArithmtxt.grammar.ExpArithmtxtPlaceholder placeholder) {
		super(placeholder.getMetaclass());
		this.placeholder = placeholder;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return placeholder.getFeature();
	}
	
	/**
	 * Returns the expected placeholder.
	 */
	public expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSyntaxElement getSymtaxElement() {
		return placeholder;
	}
	
	public String getTokenName() {
		return placeholder.getTokenName();
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton(getTokenName());
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof ExpArithmtxtExpectedStructuralFeature) {
			return getFeature().equals(((ExpArithmtxtExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
	@Override	
	public int hashCode() {
		return getFeature().hashCode();
	}
	
}
