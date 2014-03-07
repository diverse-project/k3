/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.analysis;

public class ExpArithmtxtVALUETokenResolver implements expArithm.resource.expArithmtxt.IExpArithmtxtTokenResolver {
	
	private expArithm.resource.expArithmtxt.analysis.ExpArithmtxtDefaultTokenResolver defaultTokenResolver = new expArithm.resource.expArithmtxt.analysis.ExpArithmtxtDefaultTokenResolver(true);
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		// By default token de-resolving is delegated to the DefaultTokenResolver.
		String result = defaultTokenResolver.deResolve(value, feature, container, null, null, null);
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, expArithm.resource.expArithmtxt.IExpArithmtxtTokenResolveResult result) {
		// By default token resolving is delegated to the DefaultTokenResolver.
		defaultTokenResolver.resolve(lexem, feature, result, null, null, null);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
