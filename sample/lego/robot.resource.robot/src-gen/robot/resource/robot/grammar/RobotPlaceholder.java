/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class RobotPlaceholder extends robot.resource.robot.grammar.RobotTerminal {
	
	private final String tokenName;
	
	public RobotPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, robot.resource.robot.grammar.RobotCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
