
package idm.expArithm

import expArithm.Division
import expArithm.EltExp
import expArithm.ExpressionArithm
import expArithm.Moins
import expArithm.Mult
import expArithm.OperateurBinaire
import expArithm.Plus
import expArithm.Valeur
import fr.inria.triskell.k3.Aspect
import fr.inria.triskell.k3.OverrideAspectMethod
import java.util.ArrayDeque

// Defines the concept of computable
@Aspect(className=typeof(Object)) 
public abstract class Calculable {
	def void calculer(Contexte ctx)
}


// The context used for the interpretation
public class Contexte extends ArrayDeque<Double> {
	def double finalValue() {
		if(size!=1)
			throw new IllegalArgumentException("The stack size does not equal 1")
		return peek
	}
}


// Augments ExpressionArithm with the aspect Calculable
@Aspect(className=typeof(ExpressionArithm)) 
public class ExpressionArithmAspect extends Calculable {
	@OverrideAspectMethod
	def void calculer(Contexte ctx) {
		if(_self.racine!=null)
			_self.racine.calculer(ctx)
	}
}

// Augments ExpressionArithm with the aspect Calculable
@Aspect(className=typeof(EltExp)) 
public abstract class EltExpAspect extends Calculable {}


@Aspect(className=typeof(OperateurBinaire))
public abstract class OperateurBinaireAspect extends EltExpAspect {
	@OverrideAspectMethod
	def void calculer(Contexte ctx) {
		_self.eltGauche.calculer(ctx)
		_self.eltDroit.calculer(ctx)
	}
}

// Implements the operation calculer
@Aspect(className=typeof(Moins))
public class MoinsAspect extends OperateurBinaireAspect {
	@OverrideAspectMethod
	def void calculer(Contexte ctx) {
		_self.super_calculer(ctx)
		val v1 = ctx.pop
		val v2 = ctx.pop
		ctx.push(v2-v1)
	}
}

@Aspect(className=typeof(Division))
public class DivisionAspect extends OperateurBinaireAspect {
	@OverrideAspectMethod
	def void calculer(Contexte ctx) {
		_self.super_calculer(ctx)
		val v1 = ctx.pop
		val v2 = ctx.pop
		ctx.push(v2/v1)
	}
}


@Aspect(className=typeof(Plus))
public class PlusAspect extends OperateurBinaireAspect {
	@OverrideAspectMethod
	def void calculer(Contexte ctx) {
		_self.super_calculer(ctx)
		ctx.push(ctx.pop+ctx.pop)
	}
}


@Aspect(className=typeof(Mult))
public class MultAspect extends OperateurBinaireAspect {
	@OverrideAspectMethod
	def void calculer(Contexte ctx) {
		_self.super_calculer(ctx)
		ctx.push(ctx.pop*ctx.pop)
	}
}


@Aspect(className=typeof(Valeur))
public class ValeurAspect extends EltExpAspect { 
	@OverrideAspectMethod
	def void calculer(Contexte ctx) {
		ctx.push(_self.valeur)
	}
}
