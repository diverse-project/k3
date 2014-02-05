/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.mopp;

public class ExpArithmtxtSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			expArithm.ExpArithmPackage.eINSTANCE.getExpressionArithm(),
			expArithm.ExpArithmPackage.eINSTANCE.getValeur(),
			expArithm.ExpArithmPackage.eINSTANCE.getPlus(),
			expArithm.ExpArithmPackage.eINSTANCE.getMult(),
			expArithm.ExpArithmPackage.eINSTANCE.getDivision(),
			expArithm.ExpArithmPackage.eINSTANCE.getMoins(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			expArithm.ExpArithmPackage.eINSTANCE.getExpressionArithm(),
		};
	}
	
}
