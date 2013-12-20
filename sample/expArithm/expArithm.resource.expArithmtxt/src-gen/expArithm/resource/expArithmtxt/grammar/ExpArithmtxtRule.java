/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class ExpArithmtxtRule extends expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public ExpArithmtxtRule(org.eclipse.emf.ecore.EClass metaclass, expArithm.resource.expArithmtxt.grammar.ExpArithmtxtChoice choice, expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality cardinality) {
		super(cardinality, new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public expArithm.resource.expArithmtxt.grammar.ExpArithmtxtChoice getDefinition() {
		return (expArithm.resource.expArithmtxt.grammar.ExpArithmtxtChoice) getChildren()[0];
	}
	
}

