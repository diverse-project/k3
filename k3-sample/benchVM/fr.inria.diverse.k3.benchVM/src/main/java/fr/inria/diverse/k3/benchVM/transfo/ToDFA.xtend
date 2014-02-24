package fr.inria.diverse.k3.benchVM.transfo;

import fr.inria.diverse.k3.benchVM.helper.TransformationsToolBox
import java.util.Set
import statemachine.State
import statemachine.StateMachine
import statemachine.StatemachineFactory

/**
 * Determinization of an automaton.
 * 
 * @author yroos
 * @version $Id: ToDFA.java 932 2005-04-12 07:13:26Z bailly $
 */
public class ToDFA implements Transformation {

	override def transform(StateMachine a2) {
		val facto = StatemachineFactory.eINSTANCE
        val a = new EpsilonTransitionRemover().transform(a2)
        val b = facto.createStateMachine
        val map = newHashMap
        val l = newLinkedList
        val done = newHashSet
        val e = a.initials
        var t = TransformationsToolBox.containsATerminalState(e)
        map.put(e, b.addState(true, t))
        l.add(e)

        while (!l.isEmpty) {
            val e1 = l.removeFirst
            done.add(e1)
            val ep1 = map.get(e1)
            val j = a.alphabet.iterator
            var Object label = null
            while(j.hasNext()) {
                label = j.next
                val i = e1.iterator
                val Set<State> e2 = newHashSet
                while (i.hasNext) {
                    val k = a.delta(i.next, label).iterator
                    while (k.hasNext) {
                        e2.add(k.next.end)
                    }
                }
                var State ep2 = null

                if (!e2.isEmpty) {
                    if (!map.containsKey(e2)) {
                        t = TransformationsToolBox.containsATerminalState(e2)
                        map.put(e2, b.addState(false, t));
                    }
                    ep2 = map.get(e2)
                    val trans = facto.createTransition
                    trans.label = label
                    trans.start = ep1
                    trans.end = ep2
                    b.addTransition(trans)
                    if (!done.contains(e2))
                        l.add(e2)
                }
            }
        }
        return b
    }
}
