package fr.inria.diverse.k3.sample.cellularautomata.evaluator

import fr.inria.triskell.k3.Aspect
import fr.inria.triskell.k3.OverrideAspectMethod

import vm.Cell
import core.Rule
import core.IntegerExpression
import core.Filter
import core.IntegerLiteral
import core.Conditional
import core.Add
import core.And
import core.Div
import core.Equal
import core.Greater
import core.Lower
import core.Minus
import core.Mult
import core.Or
import core.UnaryExpression
import core.BinaryExpression
import core.UMinus
import core.Not
import core.Mod

import static extension fr.inria.diverse.k3.sample.cellularautomata.evaluator.IntegerExpressionAspect.*
import static extension fr.inria.diverse.k3.sample.cellularautomata.evaluator.FilterAspect.*


@Aspect(className=typeof(Rule))
class RuleAspect {
	
	def public Boolean isApplicableForCell(Cell cell) {
		if (_self.filter == null) {
			return true
		}
		else {
			return _self.filter.isApplicableForCell(cell)
		}
	}
		
	def public Integer evaluate(Context context) {
		var Integer value = _self.evaluatedVal.evaluate(context)
		return value
	}
}

@Aspect(className=typeof(IntegerExpression))
abstract class IntegerExpressionAspect
{
	def public Integer evaluate(Context context) {
		return -1
		//raise NotImplementedException.new.initialize("evaluate not implemented for "+self.toString)
	}
}

@Aspect(className=typeof(IntegerLiteral))
class IntegerLiteralAspect extends IntegerExpressionAspect
{
	def public Integer evaluate(Context context) { 
		return _self.^val
	}
}

@Aspect(className=typeof(Conditional))	
class ConditionalAspect extends IntegerExpressionAspect {
	@OverrideAspectMethod
	def public Integer evaluate(Context context) {
		if (_self.condition.evaluate(context) != 0) {
			return _self.ifTrueExpression.evaluate(context)
		} else {
			return _self.ifFalseExpression.evaluate(context)				
		}
	}
}

/* --- BinaryExpressions --- */
@Aspect(className=typeof(Add))
class AddAspect extends BinaryExpressionAspect {
	@OverrideAspectMethod
	def public Integer evaluate(Context context) {
		return _self.left.evaluate(context) + _self.right.evaluate(context)
	}
}

@Aspect(className=typeof(And))
class AndAspect extends BinaryExpressionAspect{
	
	def public Integer evaluate(Context context) {
		var Boolean leftVal = false
		var Boolean rightVal = false
		
		if (_self.left.evaluate(context) != 0) {
			leftVal = true
		}
		if (_self.right.evaluate(context) != 0) {
			rightVal = true
		}
		
		if (leftVal && rightVal) {
			return 1 
		} else {
			return 0
		}
	 }
	
}

@Aspect(className=typeof(Div))
class DivAspect extends BinaryExpressionAspect{
	def public Integer evaluate(Context context) {
		return _self.left.evaluate(context) / _self.right.evaluate(context)
	}
}

@Aspect(className=typeof(Equal))
class EqualAspect extends BinaryExpressionAspect{
	def public Integer evaluate(Context context) {
		if (_self.left.evaluate(context) == _self.right.evaluate(context)) {
			return 1
		} else {
			return 0
		}
	}
}

@Aspect(className=typeof(Greater))
class GreaterAspect extends BinaryExpressionAspect{
	def public Integer evaluate(Context context) {
		if (_self.left.evaluate(context) > _self.right.evaluate(context)) {
			return 1
		} else {
			return 0
		}
	}
}

@Aspect(className=typeof(Lower))
class LowerAspect extends BinaryExpressionAspect{
	def public Integer evaluate(Context context) {
		if (_self.left.evaluate(context) < _self.right.evaluate(context)) {
			return 1
		} else {
			return 0
		}
	}
}

@Aspect(className=typeof(Minus))
class MinusAspect extends BinaryExpressionAspect {
	def public Integer evaluate(Context context) {
		return _self.left.evaluate(context) - _self.right.evaluate(context)
	}
}

@Aspect(className=typeof(Mod))
class ModAspect extends BinaryExpressionAspect {
	def public Integer evaluate(Context context) {
		var leftVal = _self.left.evaluate(context)
		var rightVal = _self.right.evaluate(context)
		return leftVal % (rightVal)
	}
}

@Aspect(className=typeof(Mult))
class MultAspect extends BinaryExpressionAspect{
	def public Integer evaluate(Context context) {
		return _self.left.evaluate(context) * _self.right.evaluate(context)
	}
}

@Aspect(className=typeof(Or))
class OrAspect extends BinaryExpressionAspect {
	def public Integer evaluate(Context context) {
		var Boolean leftVal = false
		var Boolean rightVal = false
		
		if (_self.left.evaluate(context) != 0) {
			leftVal = true
		}
		if (_self.right.evaluate(context) != 0) {
			rightVal = true
		}
		
		if (leftVal || rightVal) {
			return 1 
		} else {
			return 0
		}
	 }
}	

/* --- UnaryExpressions --- */
@Aspect(className=typeof(Not))
class NotAspect extends UnaryExpressionAspect{
	def public Integer evaluate(Context context) {
		var Boolean targetVal = false
		if (_self.target.evaluate(context) != 0) {
			targetVal = true
		}
		if (targetVal) {
			return 1 
		} else {
			return 0
		}
	}
}

@Aspect(className=typeof(UMinus))
class UMinusAspect extends UnaryExpressionAspect {
	@OverrideAspectMethod
	def public Integer evaluate(Context context) {
		return _self.target.evaluate(context)*(-1)
	}
	
}

@Aspect(className=typeof(BinaryExpression))
class BinaryExpressionAspect extends IntegerExpressionAspect {
	
	def public Integer evaluate(Context context) {
		return 0
	}
}

@Aspect(className=typeof(UnaryExpression))
class UnaryExpressionAspect extends IntegerExpressionAspect {
	
	def public Integer evaluate(Context context) {
		return 0
	}
}


@Aspect(className=typeof(Filter))
abstract class FilterAspect {
	def public Boolean isApplicableForCell(Cell cell)
}

