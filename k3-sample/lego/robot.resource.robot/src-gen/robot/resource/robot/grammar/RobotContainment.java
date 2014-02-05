/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.grammar;

public class RobotContainment extends robot.resource.robot.grammar.RobotTerminal {
	
	private final org.eclipse.emf.ecore.EClass[] allowedTypes;
	
	public RobotContainment(org.eclipse.emf.ecore.EStructuralFeature feature, robot.resource.robot.grammar.RobotCardinality cardinality, org.eclipse.emf.ecore.EClass[] allowedTypes, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.allowedTypes = allowedTypes;
	}
	
	public org.eclipse.emf.ecore.EClass[] getAllowedTypes() {
		return allowedTypes;
	}
	
	public String toString() {
		String typeRestrictions = null;
		if (allowedTypes != null && allowedTypes.length > 0) {
			typeRestrictions = robot.resource.robot.util.RobotStringUtil.explode(allowedTypes, ", ", new robot.resource.robot.IRobotFunction1<String, org.eclipse.emf.ecore.EClass>() {
				public String execute(org.eclipse.emf.ecore.EClass eClass) {
					return eClass.getName();
				}
			});
		}
		return getFeature().getName() + (typeRestrictions == null ? "" : "[" + typeRestrictions + "]");
	}
	
}
