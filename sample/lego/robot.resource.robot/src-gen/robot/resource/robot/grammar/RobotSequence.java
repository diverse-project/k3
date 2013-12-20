/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.grammar;

public class RobotSequence extends robot.resource.robot.grammar.RobotSyntaxElement {
	
	public RobotSequence(robot.resource.robot.grammar.RobotCardinality cardinality, robot.resource.robot.grammar.RobotSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return robot.resource.robot.util.RobotStringUtil.explode(getChildren(), " ");
	}
	
}
