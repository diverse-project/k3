
package idm.expArithm

import expArithm.OperateurBinaire
import expArithm.Valeur
import fr.inria.diverse.k3.al.annotationprocessor.Aspect

// Negative value not allowed
//@Contracted
@Aspect(className=typeof(Valeur))
public class ValeurInvariant extends Calculable {
//	@Inv
//	def boolean mustBeGreaterThanZero() {
//		_self.valeur > 0
//	}
	
//	// Value operation must add 1 element to the context
//	@Post
//	def boolean precalculer(Contexte ctx) {
//		!ctx.empty
//	}
}

// Binary operations must use 2 values of the context
//@Contracted
@Aspect(className=typeof(OperateurBinaire))
public class OperateurBinaireAspectPre extends Calculable {
//	@Pre
//	def boolean precalculer(Contexte ctx) {
//		ctx.size>1
//	}
}
