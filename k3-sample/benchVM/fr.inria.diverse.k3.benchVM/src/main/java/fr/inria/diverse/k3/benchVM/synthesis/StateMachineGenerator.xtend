package fr.inria.diverse.k3.benchVM.synthesis

import java.util.ArrayList
import java.util.HashSet
import java.util.Random
import org.eclipse.emf.ecore.resource.Resource
import statemachine.State
import statemachine.StateMachine
import statemachine.Transition

import static statemachine.StatemachineFactory.*

class StateMachineGenerator {
	var Random rand = new Random();

	new (Integer numberMaxOfState,Integer transitionDensity, Integer initialStateDensity, Integer terminalStateDensity){
		this.numberMaxOfState=numberMaxOfState
		this.transitionDensity = transitionDensity 
		this.initialStateDensity = initialStateDensity 
		this.terminalStateDensity = terminalStateDensity 
	}

	var numberMaxOfState = 1000
	var transitionDensity = 5
	var initialStateDensity = 5
	var terminalStateDensity = 5

	def StateMachine createStateMachine() {

		var f = eINSTANCE.createStateMachine();

		var numberOfSate = 1 + rand.nextInt(numberMaxOfState);
		val numberOfTransition = numberOfSate * (1 + rand.nextInt(transitionDensity))

		var i = 0
		var listStates = new ArrayList<State>()
		while (i < numberOfSate) {
			i = i + 1;
			var s = eINSTANCE.createState();

			listStates.add(s)
			f.states.add(s)
		}


		var numberOffin = rand.nextInt(numberOfSate)*initialStateDensity /100;
		var j = 0
		while (j < numberOffin) {
			j = j + 1;
			var initial = rand.nextInt(listStates.size);
			listStates.get(initial).initial = true
		}


		var numberOffend = rand.nextInt(numberOfSate)*terminalStateDensity /100;
		j = 0
		while (j < numberOffend) {
			j = j + 1;
			var fin = rand.nextInt(listStates.size);
			listStates.get(fin).terminal = true
		}

		var k = 0
		while (k < numberOfTransition) {
			k = k + 1;
			var instate = rand.nextInt(numberOfSate);
			var outstate = rand.nextInt(numberOfSate);
			var Transition t = eINSTANCE.createTransition()
			t.setStart(listStates.get(instate))
			t.setEnd(listStates.get(outstate))
			t.setLabel("t" + rand.nextInt(100000))
			f.delta.add(t)
		}

		return f;
	}

	var result = true

  def Boolean checkStateMachine( StateMachine f)  {
	result = true
    
    if (f.states.forall[s | s.initial==false ])
      throw new NoInitialState();
    
    //println(f.getFinalState().size)
    
    //println(f.getInitialState())
    if (f.states.exists[s | s.initial==true && s.terminal==true ])
      throw new FinalEqualInitial();
    return result;
  }




}
class NoInitialState extends Exception {}
class FinalEqualInitial extends Exception {}
class InderteministFSM extends Exception {}
class FSMWithEtatPuit extends Exception {}
class FSMWithStateThatCanNotBeTarget extends Exception {}
class InvalidVRM extends Exception {}
