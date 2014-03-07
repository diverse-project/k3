/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.grammar;

public class RobotChoice extends robot.resource.robot.grammar.RobotSyntaxElement {
	
	public RobotChoice(robot.resource.robot.grammar.RobotCardinality cardinality, robot.resource.robot.grammar.RobotSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return robot.resource.robot.util.RobotStringUtil.explode(getChildren(), "|");
	}
	
}
