/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.grammar;

public class RobotWhiteSpace extends robot.resource.robot.grammar.RobotFormattingElement {
	
	private final int amount;
	
	public RobotWhiteSpace(int amount, robot.resource.robot.grammar.RobotCardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}
