/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.grammar;

public class ExpArithmtxtContainment extends expArithm.resource.expArithmtxt.grammar.ExpArithmtxtTerminal {
	
	private final org.eclipse.emf.ecore.EClass[] allowedTypes;
	
	public ExpArithmtxtContainment(org.eclipse.emf.ecore.EStructuralFeature feature, expArithm.resource.expArithmtxt.grammar.ExpArithmtxtCardinality cardinality, org.eclipse.emf.ecore.EClass[] allowedTypes, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.allowedTypes = allowedTypes;
	}
	
	public org.eclipse.emf.ecore.EClass[] getAllowedTypes() {
		return allowedTypes;
	}
	
	public String toString() {
		String typeRestrictions = null;
		if (allowedTypes != null && allowedTypes.length > 0) {
			typeRestrictions = expArithm.resource.expArithmtxt.util.ExpArithmtxtStringUtil.explode(allowedTypes, ", ", new expArithm.resource.expArithmtxt.IExpArithmtxtFunction1<String, org.eclipse.emf.ecore.EClass>() {
				public String execute(org.eclipse.emf.ecore.EClass eClass) {
					return eClass.getName();
				}
			});
		}
		return getFeature().getName() + (typeRestrictions == null ? "" : "[" + typeRestrictions + "]");
	}
	
}
