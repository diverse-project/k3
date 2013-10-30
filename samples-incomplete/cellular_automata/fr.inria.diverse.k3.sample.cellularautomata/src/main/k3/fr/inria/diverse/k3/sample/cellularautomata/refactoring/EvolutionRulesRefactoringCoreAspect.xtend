package fr.inria.diverse.k3.sample.cellularautomata.refactoring

import fr.inria.triskell.k3.Aspect
import core.Equal
import evol.CurrentCellPopulation
import core.Rule
import evol.PopulationRange
import core.Conditional


import static extension fr.inria.diverse.k3.sample.cellularautomata.refactoring.EqualAspect.*
import java.util.List
import java.util.ArrayList
import core.IntegerLiteral
import core.CoreFactory
import evol.EvolFactory

@Aspect(className=typeof(Rule))
class RuleAspect {
	
	def public Boolean isEqualSplittable() {
		if(_self.filter instanceof PopulationRange){
			val lower = (_self.filter as PopulationRange).lowerRange
			val upper = (_self.filter as PopulationRange).upperRange
			if (lower != upper){
				if(_self.evaluatedVal instanceof Conditional){
					val conditional = (_self.evaluatedVal as Conditional)
					if(conditional.condition instanceof Equal){
						val equal = conditional.condition as Equal
						if(equal.isLeftOrRigthCurrentCellPopulation && equal.isLeftOrRigthIntegerLiteralOnBorderOfRange(lower, upper)){
							return true
						}
					}
				}
			} 
		}
		return false
	}
		
	def public List<Rule> splitEqual() {
		val result = new ArrayList<Rule>
		val lower = (_self.filter as PopulationRange).lowerRange
		val upper = (_self.filter as PopulationRange).upperRange
		
		val equalcondition = (_self.evaluatedVal as Conditional).condition as Equal
		var Integer literalValue
		if (equalcondition.left instanceof IntegerLiteral) literalValue = (equalcondition.left as IntegerLiteral).^val
		if (equalcondition.right instanceof IntegerLiteral) literalValue = (equalcondition.right as IntegerLiteral).^val
		
		val lowerRule = CoreFactory.eINSTANCE.createRule
		val upperRule = CoreFactory.eINSTANCE.createRule
		if(literalValue == lower){
			println("literalValue == lower")
			val lowerPopulationRange = EvolFactory.eINSTANCE.createPopulationRange
			lowerPopulationRange.lowerRange = lower
			lowerPopulationRange.upperRange = lower
			lowerRule.filter = lowerPopulationRange
			lowerRule.evaluatedVal = (_self.evaluatedVal as Conditional).ifTrueExpression
			val upperPopulationRange = EvolFactory.eINSTANCE.createPopulationRange
			upperPopulationRange.lowerRange = lower+1
			upperPopulationRange.upperRange = upper
			upperRule.filter = upperPopulationRange
			upperRule.evaluatedVal = (_self.evaluatedVal as Conditional).ifFalseExpression
		}
		else{
			println("literalValue != lower")
			val lowerPopulationRange = EvolFactory.eINSTANCE.createPopulationRange
			lowerPopulationRange.lowerRange = lower
			lowerPopulationRange.upperRange = upper-1
			lowerRule.filter = lowerPopulationRange
			lowerRule.evaluatedVal = (_self.evaluatedVal as Conditional).ifFalseExpression
			val upperPopulationRange = EvolFactory.eINSTANCE.createPopulationRange
			upperPopulationRange.lowerRange = upper
			upperPopulationRange.upperRange = upper
			upperRule.filter = upperPopulationRange
			upperRule.evaluatedVal = (_self.evaluatedVal as Conditional).ifTrueExpression
		}
		
		result.add(lowerRule)
		result.add(upperRule)
		return result
	}
}

@Aspect(className=typeof(Equal))
class EqualAspect {
	def public boolean isLeftOrRigthCurrentCellPopulation() {
		return _self.left instanceof CurrentCellPopulation || _self.right  instanceof CurrentCellPopulation
	}
	
	def public boolean isLeftOrRigthIntegerLiteralOnBorderOfRange(int lower, int upper) {
		return (_self.left instanceof IntegerLiteral && ((_self.left as IntegerLiteral).^val == lower || (_self.left as IntegerLiteral).^val == upper))
			|| (_self.right instanceof IntegerLiteral && ((_self.right as IntegerLiteral).^val == lower || (_self.right as IntegerLiteral).^val == upper))
	}
	
}