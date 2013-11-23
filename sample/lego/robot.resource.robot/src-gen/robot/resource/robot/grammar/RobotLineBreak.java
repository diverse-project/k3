/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.grammar;

public class RobotLineBreak extends robot.resource.robot.grammar.RobotFormattingElement {
	
	private final int tabs;
	
	public RobotLineBreak(robot.resource.robot.grammar.RobotCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
