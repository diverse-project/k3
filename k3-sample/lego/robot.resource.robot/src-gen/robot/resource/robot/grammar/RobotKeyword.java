/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class RobotKeyword extends robot.resource.robot.grammar.RobotSyntaxElement {
	
	private final String value;
	
	public RobotKeyword(String value, robot.resource.robot.grammar.RobotCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
