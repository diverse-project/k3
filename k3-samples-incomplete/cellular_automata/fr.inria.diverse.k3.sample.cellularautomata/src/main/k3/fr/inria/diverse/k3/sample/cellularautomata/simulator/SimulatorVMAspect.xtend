package fr.inria.diverse.k3.sample.cellularautomata.simulator

import fr.inria.triskell.k3.Aspect
import vm.Cell

class SimulatorVMAspect {
}

@Aspect(className=typeof(Cell))
class CellAspect{
	public Integer futureValue
}