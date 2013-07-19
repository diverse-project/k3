package fr.inria.triskell.k3.fsm
 
import fr.inria.triskell.k3.Aspect
import fsm.FSM 
import fsm.State
import fsm.Transition 
import java.io.BufferedReader
import java.io.InputStreamReader

import static extension fr.inria.triskell.k3.fsm.FSMAspect.*
import static extension fr.inria.triskell.k3.fsm.StateAspect.*
import static extension fr.inria.triskell.k3.fsm.TransitionAspect.*
import fr.inria.triskell.k3.Singleton

/* $Id: fsm_Operationnal_Semantics.kmt,v 1.3 2008-08-25 13:04:01 vmahe Exp $
 * Project    : fr.irisa.triskell.samples.fsm
 * File       : fsmmodel.kmt
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 03 October. 2005
 * Modified By : 
 *        Waqas Ahmed Saeed <wahmedsa@irisa.fr>
 *        Cyril Faucher <cfaucher@irisa.fr>
 * Description : 
 *       Finite State Machine Sample with Behaviour implemented in Kermeta
 */
@Singleton 
public class Console {
	
	def String readLine(String format, Object... args) {
		if (System.console() != null) {
			return System.console().readLine(format, args);
		}
		System.out.print(String.format(format, args));
		var reader = new BufferedReader(new InputStreamReader(System.in));
		return reader.readLine();
	}
}
 



@Aspect(className=typeof(FSM))
public class  FSMAspect {

	FSMAspect self

	public State _currentState

	def void setCurrentState(FSM _self, State current) {
		self._currentState = current;
	}
 
	def State getCurrentState(FSM _self) {
		return self._currentState;
	}
 
	// Operational semantic
	def void run(FSM _self) {

		// reset if there is no current state
		if (self._currentState == null) {
			self._currentState = _self.initialState
		} 
 
 		var str = "init"
		while (str != "quit") {
			println("Current state : " + self._currentState.name)
			str = Console.instance.readLine("give me a letter : ")
			if (str == "quit") {
				println("")
				println("quitting ...")
			} else if (str == "print") {
				println("")
			} else
				println(str)
			println("stepping...")
			try {   
				var textRes = self._currentState.step(str)
				if (textRes == void || textRes == "")
					textRes = "NC"

				println("string produced : " + textRes)
			} catch (
			/*ConstraintViolatedPre : err){
							
						}
			            		stdio.writeln(err.toString)
			            		stdio.writeln(err.message)
			            		str := "quit"
			            	rescue (err : ConstraintViolatedPost)
		            			stdio.writeln(err.toString)
		            			stdio.writeln(err.message)
		            			str := "quit"
		            		
							rescue(*/
			NonDeterminism err) {
				println(err.toString)
				str = "quit"
			} catch (NoTransition err) {
				println(err.toString)
				str = "quit"
			}
		}
	}

}
 
@Aspect(className=typeof(State))
 class StateAspect { // Go to the next state
	StateAspect self

	def String step(State _self, String c) {

		// Get the valid transitions
		var validTransitions = _self.outgoingTransition.filter[t|t.input.equals(c)]

		// Check if there is one and only one valid transition
		if(validTransitions.empty) throw new NoTransition
		if(validTransitions.size > 1) throw new NonDeterminism

		// Fire the transition
		return validTransitions.get(0).fire()
		//return ""
	}

} 

@Aspect(className=typeof(Transition))
 class TransitionAspect {
	TransitionAspect self;

	// Fire the transition
	public def String fire(Transition _self) {

		// update FSM current state
		_self.source.owningFSM.setCurrentState = _self.target
		return _self.output 
	}
}

abstract class FSMException extends Exception {
}

class NonDeterminism extends FSMException {
}

class NoTransition extends FSMException {
}

class NoInitialStateException extends FSMException {
}
