/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class ExpArithmtxtSyntaxElement {
	
	private ExpArithmtxtSyntaxElement[] children;
	private ExpArithmtxtSyntaxElement parent;
	private expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality cardinality;
	
	public ExpArithmtxtSyntaxElement(expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality cardinality, ExpArithmtxtSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (ExpArithmtxtSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	/**
	 * Sets the parent of this syntax element. This method must be invoked at most
	 * once.
	 */
	public void setParent(ExpArithmtxtSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	/**
	 * Returns the parent of this syntax element. This parent is determined by the
	 * containment hierarchy in the CS model.
	 */
	public ExpArithmtxtSyntaxElement getParent() {
		return parent;
	}
	
	public ExpArithmtxtSyntaxElement[] getChildren() {
		if (children == null) {
			return new ExpArithmtxtSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality getCardinality() {
		return cardinality;
	}
	
}
