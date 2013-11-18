/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.mopp;

/**
 * A basic implementation of the
 * expArithm.resource.expArithmtxt.IExpArithmtxtElementMapping interface.
 * 
 * @param <ReferenceType> the type of the reference that can be mapped to
 */
public class ExpArithmtxtElementMapping<ReferenceType> implements expArithm.resource.expArithmtxt.IExpArithmtxtElementMapping<ReferenceType> {
	
	private final ReferenceType target;
	private String identifier;
	private String warning;
	
	public ExpArithmtxtElementMapping(String identifier, ReferenceType target, String warning) {
		super();
		this.target = target;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public ReferenceType getTargetElement() {
		return target;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
