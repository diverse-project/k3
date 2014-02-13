package fr.inria.diverse.k3.sample.cellularautomata.vm.generator

import fr.inria.triskell.k3.Aspect
import ruleInit.GlobalPosition
import ruleInit.CoordinateRange
import ruleInit.PositionLiteral
import vm.Cell
import core.Filter
import fr.inria.diverse.k3.sample.cellularautomata.vm.generator.Context

import static extension fr.inria.diverse.k3.sample.cellularautomata.vm.generator.CellAspect.*
import static extension fr.inria.diverse.k3.sample.cellularautomata.vm.generator.CoordinateRangeAspect.*


@Aspect(className=typeof(Filter))
abstract class FilterAspect {
	def public Boolean isApplicableForCell(Cell cell)
}

@Aspect(className=typeof(GlobalPosition)) 
class GlobalPositionAspect extends FilterAspect {
	
	def public Boolean isApplicableForCell(Cell cell) {
		var Boolean result = true
		if (_self.coordinateRanges.size == cell.coordinates.size) {
		    for(int i : 0.._self.coordinateRanges.size-1) {
		    	result = result && (_self.coordinateRanges.get(i).isInRange(cell.coordinates.get(i)))
		    }
		    return result
		}
	}
}

@Aspect(className=typeof(CoordinateRange))
class CoordinateRangeAspect {
	def public Boolean isInRange(Integer i) {
		return ((_self.lowerCoordinate <= i) && (i <= _self.upperCoordinate))
	}
}

@Aspect(className=typeof(PositionLiteral))
class PositionLiteralAspect extends IntegerExpressionAspect {
	def public Integer evaluate(Context context) {
		return context.currentCell.coordinates.get(_self.dimensionIndex)
	}
}