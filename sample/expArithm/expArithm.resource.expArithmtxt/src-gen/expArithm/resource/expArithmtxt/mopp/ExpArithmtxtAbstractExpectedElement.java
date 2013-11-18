/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class ExpArithmtxtAbstractExpectedElement implements expArithm.resource.expArithmtxt.IExpArithmtxtExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	
	private java.util.Set<expArithm.resource.expArithmtxt.util.ExpArithmtxtPair<expArithm.resource.expArithmtxt.IExpArithmtxtExpectedElement, expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[]>> followers = new java.util.LinkedHashSet<expArithm.resource.expArithmtxt.util.ExpArithmtxtPair<expArithm.resource.expArithmtxt.IExpArithmtxtExpectedElement, expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[]>>();
	
	public ExpArithmtxtAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(expArithm.resource.expArithmtxt.IExpArithmtxtExpectedElement follower, expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[] path) {
		followers.add(new expArithm.resource.expArithmtxt.util.ExpArithmtxtPair<expArithm.resource.expArithmtxt.IExpArithmtxtExpectedElement, expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[]>(follower, path));
	}
	
	public java.util.Collection<expArithm.resource.expArithmtxt.util.ExpArithmtxtPair<expArithm.resource.expArithmtxt.IExpArithmtxtExpectedElement, expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
