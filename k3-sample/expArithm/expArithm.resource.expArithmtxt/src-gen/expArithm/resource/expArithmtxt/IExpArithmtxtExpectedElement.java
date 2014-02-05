/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface IExpArithmtxtExpectedElement {
	
	/**
	 * Returns the names of all tokens that are expected at the given position.
	 */
	public java.util.Set<String> getTokenNames();
	
	/**
	 * Returns the metaclass of the rule that contains the expected element.
	 */
	public org.eclipse.emf.ecore.EClass getRuleMetaclass();
	
	/**
	 * Returns the syntax element that is expected.
	 */
	public expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSyntaxElement getSymtaxElement();
	
	/**
	 * Adds an element that is a valid follower for this element.
	 */
	public void addFollower(expArithm.resource.expArithmtxt.IExpArithmtxtExpectedElement follower, expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[] path);
	
	/**
	 * Returns all valid followers for this element. Each follower is represented by a
	 * pair of an expected elements and the containment trace that leads from the
	 * current element to the follower.
	 */
	public java.util.Collection<expArithm.resource.expArithmtxt.util.ExpArithmtxtPair<expArithm.resource.expArithmtxt.IExpArithmtxtExpectedElement, expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[]>> getFollowers();
	
}
