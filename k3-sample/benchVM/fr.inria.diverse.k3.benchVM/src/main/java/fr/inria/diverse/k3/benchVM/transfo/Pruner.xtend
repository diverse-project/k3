package fr.inria.diverse.k3.benchVM.transfo

import java.util.Map
import statemachine.State
import statemachine.StateMachine
import statemachine.StatemachineFactory

public class Pruner implements Transformation {

	override def transform(StateMachine a) {
		val facto = StatemachineFactory.eINSTANCE
	    val Map<State,State> conversion = newHashMap
	    val i = a.accessibleAndCoAccessibleStates.iterator
	    val b = facto.createStateMachine

	    while(i.hasNext) {
	      val e = i.next
	      conversion.put(e , b.addState(e.isInitial , e.isTerminal))
	    }

	    val itD = a.getDelta.iterator
	    while(itD.hasNext) {
	      val t = itD.next
	      val bs = conversion.get(t.start)
	      val be = conversion.get(t.end)

	      if(bs == null || be == null) {}
			else {
				val trans = facto.createTransition
				trans.label = t.label
				trans.start = bs
				trans.end = be
				b.addTransition(trans)
			}
	    }

	    return b
	  }
}
  
