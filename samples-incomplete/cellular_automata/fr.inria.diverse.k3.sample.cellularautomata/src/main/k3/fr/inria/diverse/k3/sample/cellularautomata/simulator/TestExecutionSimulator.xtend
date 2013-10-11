package fr.inria.diverse.k3.sample.cellularautomata.simulator

class TestExecution {
	
	def static void main(String[] args)  {
		var Simulator simulator = new Simulator
		simulator.simulateWithAsciiArt2Dvisualizer("src/main/k3/samples_simulator/lifeGame.evol.xmi", "src/main/k3/samples_simulator/Moore5x5_corner.vm.xmi", "5")
	}
}