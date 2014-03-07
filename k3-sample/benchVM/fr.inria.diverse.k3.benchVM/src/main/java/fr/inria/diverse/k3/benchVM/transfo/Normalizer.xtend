package fr.inria.diverse.k3.benchVM.transfo

import fr.inria.diverse.k3.benchVM.prop.ContainsEpsilon
import java.util.Map
import statemachine.State
import statemachine.StateMachine
import statemachine.StatemachineFactory

class Normalizer implements Transformation {
	
	override transform(StateMachine a) {
		val facto = StatemachineFactory.eINSTANCE
		val b = facto.createStateMachine
        val ni = b.addState(true, false)
        val nt = b.addState(false, true)
        val Map<State,State> map = newHashMap
        val i = a.getStates.iterator

        while(i.hasNext) {
            val st = i.next
            map.put(st, b.addState(false, false))
        }

        /* add epsilon transition if contains epsilon */
        if (new ContainsEpsilon().test(a)) {
        	val trans = facto.createTransition
        	trans.start = ni
        	trans.end = nt
            b.addTransition(trans)
        }

        val itD = a.getDelta.iterator

        while (itD.hasNext()) {
            val t = itD.next
            if (t.start.isInitial && t.end.isTerminal) {
            	val trans = facto.createTransition
            	trans.start = ni
            	trans.label = t.label
            	trans.end = nt
                b.addTransition(trans)
            }
            if (t.start.isInitial) {
            	val trans = facto.createTransition
            	trans.start = ni
            	trans.label = t.label
            	trans.end = map.get(t.end)
                b.addTransition(trans)
            }

            if (t.end.isTerminal) {
            	val trans = facto.createTransition
            	trans.start = map.get(t.start)
            	trans.label = t.label
            	trans.end = nt
                b.addTransition(trans)
            }

        	val trans = facto.createTransition
        	trans.start = map.get(t.start)
        	trans.label = t.label
        	trans.end = map.get(t.end)
            b.addTransition(trans)
        }
        return new Pruner().transform(b)
	}
}