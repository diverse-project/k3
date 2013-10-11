package fr.inria.diverse.k3.sample.cellularautomata.vm.generator

import fr.inria.triskell.k3.Aspect
import java.util.List
import vm.Cell
import java.util.ArrayList

class VMGeneratorVMAspect {
	
}

@Aspect(className=typeof(Cell)) 
class CellAspect {
	
	public List<Integer> coordinates
	public Integer globalPosition
		
	def public void init () {
		_self.coordinates = new ArrayList<Integer>()
	}
}
