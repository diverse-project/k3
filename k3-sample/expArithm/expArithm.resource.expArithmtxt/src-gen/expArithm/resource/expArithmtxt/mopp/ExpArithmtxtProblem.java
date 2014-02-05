/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.mopp;

public class ExpArithmtxtProblem implements expArithm.resource.expArithmtxt.IExpArithmtxtProblem {
	
	private String message;
	private expArithm.resource.expArithmtxt.ExpArithmtxtEProblemType type;
	private expArithm.resource.expArithmtxt.ExpArithmtxtEProblemSeverity severity;
	private java.util.Collection<expArithm.resource.expArithmtxt.IExpArithmtxtQuickFix> quickFixes;
	
	public ExpArithmtxtProblem(String message, expArithm.resource.expArithmtxt.ExpArithmtxtEProblemType type, expArithm.resource.expArithmtxt.ExpArithmtxtEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<expArithm.resource.expArithmtxt.IExpArithmtxtQuickFix>emptySet());
	}
	
	public ExpArithmtxtProblem(String message, expArithm.resource.expArithmtxt.ExpArithmtxtEProblemType type, expArithm.resource.expArithmtxt.ExpArithmtxtEProblemSeverity severity, expArithm.resource.expArithmtxt.IExpArithmtxtQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public ExpArithmtxtProblem(String message, expArithm.resource.expArithmtxt.ExpArithmtxtEProblemType type, expArithm.resource.expArithmtxt.ExpArithmtxtEProblemSeverity severity, java.util.Collection<expArithm.resource.expArithmtxt.IExpArithmtxtQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<expArithm.resource.expArithmtxt.IExpArithmtxtQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public expArithm.resource.expArithmtxt.ExpArithmtxtEProblemType getType() {
		return type;
	}
	
	public expArithm.resource.expArithmtxt.ExpArithmtxtEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<expArithm.resource.expArithmtxt.IExpArithmtxtQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
