package fr.inria.diverse.k3.benchVM.synthesis.generic;

import org.eclipse.emf.common.util.Diagnostic;

public class InvalidModelExceptionFromDiagronstic extends Exception{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Diagnostic diagnostic;
	public Diagnostic getDiagnostic() {
		return diagnostic;
	}
	public InvalidModelExceptionFromDiagronstic(Diagnostic d
	) {
		this.diagnostic= d;
	}

}
