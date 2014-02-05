/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class RobotRule extends robot.resource.robot.grammar.RobotSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public RobotRule(org.eclipse.emf.ecore.EClass metaclass, robot.resource.robot.grammar.RobotChoice choice, robot.resource.robot.grammar.RobotCardinality cardinality) {
		super(cardinality, new robot.resource.robot.grammar.RobotSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public robot.resource.robot.grammar.RobotChoice getDefinition() {
		return (robot.resource.robot.grammar.RobotChoice) getChildren()[0];
	}
	
}

