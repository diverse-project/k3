package fr.inria.diverse.k3.benchVM.transfo

import statemachine.StateMachine

interface Transformation {
	def StateMachine transform(StateMachine sm)
}
