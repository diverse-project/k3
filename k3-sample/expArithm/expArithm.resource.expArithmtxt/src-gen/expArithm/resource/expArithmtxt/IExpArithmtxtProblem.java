/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt;

public interface IExpArithmtxtProblem {
	public String getMessage();
	public expArithm.resource.expArithmtxt.ExpArithmtxtEProblemSeverity getSeverity();
	public expArithm.resource.expArithmtxt.ExpArithmtxtEProblemType getType();
	public java.util.Collection<expArithm.resource.expArithmtxt.IExpArithmtxtQuickFix> getQuickFixes();
}
