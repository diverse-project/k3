package fr.inria.diverse.k3.sample.cellularautomata.vm.generator

import vm.Cell
import vm.Universe

class Context {
	public Universe currentUniverse
	public Cell currentCell
		
		def public Context initialize (Universe universe, Cell cell) {
			currentUniverse = universe
			currentCell = cell
			return this
		}
		
		def public Context initialize (Universe universe) {
			currentUniverse = universe
			return this
		}
}