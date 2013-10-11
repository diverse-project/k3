package fr.inria.diverse.k3.sample.cellularautomata.evaluator

import fr.inria.triskell.k3.Aspect

import java.util.List
import java.util.ArrayList

import vm.Cell
import evol.PopulationRange
import evol.CurrentCellPopulation
import evol.Max
import evol.Min
import evol.Size
import evol.Sum
import evol.NeighborsExpression

import static extension fr.inria.diverse.k3.sample.cellularautomata.evaluator.PopulationRangeAspect.*


@Aspect(className=typeof(PopulationRange))
class PopulationRangeAspect extends FilterAspect {
		def public Boolean isApplicableForCell(Cell cell) {
			return _self.matchesValue(cell.^val)
		}
		
		def public Boolean matchesValue(Integer value) { 
			var Boolean lowerOk = false
			var Boolean upperOk = false
			
			if (_self.lowerRange != null) {
				if (value >= _self.lowerRange) { 
					 lowerOk = true
				} 
			} else {
				lowerOk = true
			}
			if (_self.upperRange != null) {
				if (value <= _self.upperRange) {
					 upperOk = true
				}
			} else {
				upperOk = true
			}
			return (lowerOk && upperOk)
		}
	}

@Aspect(className=typeof(CurrentCellPopulation))
class CurrentCellPopulationAspect extends IntegerExpressionAspect {
	def public Integer evaluate(Context context) {
		return context.currentCell.^val
	}
}

/* --- NeighborsExpressions --- */

@Aspect(className=typeof(NeighborsExpression))
abstract class NeighborsExpressionAspect extends IntegerExpressionAspect{
	def public Integer evaluate(Context context)
}

@Aspect(className=typeof(Max))
class MaxAspect extends NeighborsExpressionAspect {
	def public Integer evaluate(Context context) {
		var List<Integer> selectedCellValues = new ArrayList<Integer>()
		if (_self.neighborsFilter == null) {
			selectedCellValues = context.currentCell.neighbors.map[cellValue | cellValue.^val]
		} else {
			selectedCellValues = context.currentCell.neighbors.filter[cell | _self.neighborsFilter.matchesValue(cell.^val)].map[cellValue | cellValue.^val] as List
		}
		return selectedCellValues.reduce[p1, p2| if(p1 < p2) {p2} else {p1}] 
	}
}

@Aspect(className=typeof(Min))
class MinAspect extends NeighborsExpressionAspect {
	def public Integer evaluate(Context context) {
		var List<Integer> selectedCellValues = new ArrayList<Integer>()
		if (_self.neighborsFilter == null) {
			selectedCellValues = context.currentCell.neighbors.map[cellValue | cellValue.^val]
		} else {
			selectedCellValues = context.currentCell.neighbors.filter[cell | _self.neighborsFilter.matchesValue(cell.^val)].map[cellValue | cellValue.^val] as List			
		}
		return selectedCellValues.reduce[p1, p2| if(p1 > p2) {p2} else {p1}]
	}
}

@Aspect(className=typeof(Size))
class SizeAspect extends NeighborsExpressionAspect {
	def public Integer evaluate(Context context) {
		var result = 0
		var List<Cell> selectedCells = new ArrayList<Cell>()
		if (_self.neighborsFilter == null) {
			selectedCells = context.currentCell.neighbors
		} else {
			selectedCells = context.currentCell.neighbors.filter[cell | _self.neighborsFilter.matchesValue(cell.^val)].map[cellValue | cellValue.^val] as List
		}
		if (selectedCells != null) {
			result = selectedCells.size
		}
		return result
	}
}

@Aspect(className=typeof(Sum))
class SumAspect extends NeighborsExpressionAspect {
	def public Integer evaluate(Context context) {
		var List<Integer> selectedCellValues = new ArrayList<Integer>()
		if (_self.neighborsFilter == null) {
			selectedCellValues = context.currentCell.neighbors.map[cellValue | cellValue.^val]
		} else {
			selectedCellValues = context.currentCell.neighbors.filter[cell | _self.neighborsFilter.matchesValue(cell.^val)].map[cellValue | cellValue.^val] as List
		}
		return selectedCellValues.reduce[p1, p2| p1 + p2]
	}
}