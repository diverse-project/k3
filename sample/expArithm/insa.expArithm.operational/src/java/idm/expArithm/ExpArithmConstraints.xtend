
package idm.expArithm

import expArithm.Division
import expArithm.Valeur
import fr.inria.triskell.k3.Aspect
import fr.inria.triskell.k3.Contracted
import fr.inria.triskell.k3.Inv

// Pas de valeur negative
@Contracted
@Aspect(className=typeof(Valeur))
public class ValeurInvariant {
	@Inv
	def boolean doitEtreSupAZero() {
		_self.valeur > 0
	}
}

// Pas de division par zéro
@Contracted
@Aspect(className=typeof(Division))
public class DivisionPre extends Calculable {
//	@Pre
//	def boolean precalculer() {
////		 ctx.pop != 0
//		false
//	}
}
