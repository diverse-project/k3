/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.mopp;

public class ExpArithmtxtSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private ExpArithmtxtSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private java.util.List<Integer> indicesToPrint = new java.util.ArrayList<Integer>();
	
	public ExpArithmtxtSyntaxElementDecorator(expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSyntaxElement decoratedElement, ExpArithmtxtSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(Integer index) {
		indicesToPrint.add(index);
	}
	
	public expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public ExpArithmtxtSyntaxElementDecorator[] getChildDecorators() {
		return childDecorators;
	}
	
	public Integer getNextIndexToPrint() {
		if (indicesToPrint.size() == 0) {
			return null;
		}
		return indicesToPrint.remove(0);
	}
	
	public String toString() {
		return "" + getDecoratedElement();
	}
	
}
