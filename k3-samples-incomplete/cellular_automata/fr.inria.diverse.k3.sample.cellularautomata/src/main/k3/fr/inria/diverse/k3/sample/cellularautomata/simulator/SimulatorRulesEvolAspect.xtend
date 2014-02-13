package fr.inria.diverse.k3.sample.cellularautomata.simulator

import fr.inria.triskell.k3.Aspect
import evol.CellularAutomata
import fr.inria.diverse.k3.sample.cellularautomata.simulator.Context
import core.Rule

import static extension fr.inria.diverse.k3.sample.cellularautomata.simulator.RuleAspect.*
import static extension fr.inria.diverse.k3.sample.cellularautomata.simulator.CellAspect.*

class SimulatorRulesEvolAspect {
}

@Aspect(className=typeof(CellularAutomata))
class CellularAutomataAspect {
	def public applyRules(Context context) { 
		context.currentUniverse.cells.forEach[cell |
			context.currentCell = cell
			var Rule rule = _self.rules.filter[r | 
				r.isApplicableForCell(cell)].get(0)
			if (rule == null) {
				// no rule, report the current value as the future
				cell.futureValue = cell.^val
			} else {
				cell.futureValue = rule.evaluate(context)
			}
		]
		// apply the change
		context.currentUniverse.cells.forEach[ cell | cell.^val = cell.futureValue]
	}
}