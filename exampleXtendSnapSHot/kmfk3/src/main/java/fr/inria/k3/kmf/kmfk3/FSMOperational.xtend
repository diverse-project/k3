package fr.inria.k3.kmf.kmfk3

import fr.inria.triskell.k3.Aspect
import fr.inria.triskell.k3.Singleton
import java.io.BufferedReader
import java.io.File
import java.io.FileInputStream
import java.io.InputStreamReader
import org.fsmsample.FSM
import org.fsmsample.State
import org.fsmsample.Transition
import org.fsmsample.factory.MainFactory
import org.fsmsample.loader.XMIModelLoader
import org.fsmsample.serializer.XMIModelSerializer

import static extension fr.inria.k3.kmf.kmfk3.FSMAspect.*
import static extension fr.inria.k3.kmf.kmfk3.StateAspect.*
import static extension fr.inria.k3.kmf.kmfk3.TransitionAspect.*
import java.io.PrintStream

class FSMOperational{

	def static void main(String[] args) {
		val fact = (new MainFactory).fsmSampleFactory
		val fsm = fact.createFSM
		val s1 = fact.createState
		s1.name = "s1"
		val s2 = fact.createState
		s2.name = "s2"
		val s3 = fact.createState
		s3.name = "s3"
		fsm.initialState = s1
		
		val t1 = fact.createTransition
		
		val t2= fact.createTransition
		
		t1.input  = "a"
		t1.output  = "ok go to next"
		t2.input  = "b"
		t2.output  = "ok go to next one"
		s1.addOutgoingTransition(t1)
		//t1.source = s1
		s2.addIncomingTransition(t1)
		
		//t1.target = s2
		s2.addOutgoingTransition(t2)
		//t2.source = s1
		s3.addIncomingTransition(t2)
		//t2.target = s3
		
		fsm.addOwnedState(s1)
		fsm.addOwnedState(s2)
		fsm.addOwnedState(s3)
		fsm.addFinalState(s3)


		fsm.run
		
		val XMIModelLoader loader = new XMIModelLoader
		val fsm1 = loader.loadModelFromStream(new FileInputStream(new File("TrafficLights.fsm"))).get(0) as FSM
		println("initial state " + fsm1.initialState.name)


		val XMIModelSerializer saver = new XMIModelSerializer


		
		//saver.FSMtoXmi(fsm1,"fsm:FSM",new HashMap,new PrintStream(System.out),false)		
		
		saver.serialize(fsm, System.out)
		

		
	}
	

}




@Singleton 
public class Console {
	 
	def String readLine(String format, Object... args) {
		if (System.console() != null) {
			return System.console().readLine(format, args);
		}
		println(String.format(format, args));
		var reader = new BufferedReader(new InputStreamReader(System.in));
		return reader.readLine();
	}
} 


@Aspect(className=typeof(FSM))
public class  FSMAspect {

	State currentState

		// Operational semantic
	def void run() {

		
		// reset if there is no current state
		if (_self.currentState == null) {
			_self.currentState = _self.initialState
		}  
 
 		var str = "init"
		while (str != "quit") {
			println("Current state : " + _self.currentState.name)
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
				var textRes = _self.currentState.step(str)
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
	def String step(String c) {

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
	// Fire the transition
	public def String fire() {
		// update FSM current state
		_self.source.owningFSM.currentState = _self.target
		
		
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