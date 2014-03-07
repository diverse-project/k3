package fr.inria.diverse.k3.sample.cellularautomata.refactoring

class TestExecution {
	
	def static void main(String[] args)  {
	var EvolutionRuleRefactoring refactoring = new EvolutionRuleRefactoring
	refactoring.refactorCondition("src/main/examples/refactoring/flipFlop.evol.xmi","src/main/examples/refactoring/out/flipFlop.evol.xmi")
	}
}