/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.grammar;

public class RobotCompound extends robot.resource.robot.grammar.RobotSyntaxElement {
	
	public RobotCompound(robot.resource.robot.grammar.RobotChoice choice, robot.resource.robot.grammar.RobotCardinality cardinality) {
		super(cardinality, new robot.resource.robot.grammar.RobotSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
