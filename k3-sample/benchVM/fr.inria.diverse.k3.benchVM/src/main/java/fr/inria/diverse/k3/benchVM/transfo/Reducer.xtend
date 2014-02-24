package fr.inria.diverse.k3.benchVM.transfo;

import fr.inria.diverse.k3.benchVM.helper.TransformationsToolBox
import java.util.Map
import java.util.Set
import statemachine.State
import statemachine.StateMachine
import statemachine.StatemachineFactory

/**
 * Computes the minimal automaton from a deterministic automaton.
 * <p />
 * This class first determinizes the transformed automaton, then compute
 * states equivalence classes to create new states and transitions.
 * 
 * @author nono
 * @version $Id: Reducer.java 932 2005-04-12 07:13:26Z bailly $
 */
public class Reducer implements Transformation {
    /*
     * equivalence on DFA
     */
    private def boolean same(State e1, State e2, StateMachine a, Map<State,Set<State>> m) {
        if (!m.get(e1).equals(m.get(e2)))
            return false
        /* iterate over all transitions */
        val tas = a.delta(e1)
        val tbs = a.delta(e2)
        val i = tas.iterator

        while (i.hasNext) {
            val tr = i.next
            val ep1 = tr.end
            /* check transition exists in b */
            val tbsl = a.delta(e2, tr.label)
            if (tbsl.isEmpty)
                return false
            val trb = tbsl.iterator
            while (trb.hasNext) {
                val tb = trb.next
                /* mark transition as visited */
                tbs.remove(tb)
                val ep2 = tb.end
                if (!m.get(ep1).equals(m.get(ep2)))
                    return false
            }
            
        }
        if (!tbs.isEmpty()) {
            return false;
        }
        return true;
    }


	override def transform(StateMachine a) {
        val b = new ToDFA().transform(a)
        var Map<State,Set<State>> current = newHashMap
        val Set<State> s1 = newHashSet
        val Set<State> s2 = newHashSet
        var i = b.getStates.iterator

        while (i.hasNext) {
            val e = i.next
            if (e.isTerminal()) {
                s1.add(e)
                current.put(e, s1)
            } else {
                s2.add(e)
                current.put(e, s2)
            }
        }
        var Map<State,Set<State>> old
        do {
            old = current
            current = newHashMap
            i = old.keySet.iterator
            while (i.hasNext) {
                val e1 = i.next
                var Set<State> s = newHashSet
                val j = current.keySet.iterator
                var ok = true

                while(j.hasNext && ok) {
                    val e2 = j.next
                    if (same(e1, e2, b, old)) {
                        s = current.get(e2)
                        ok = false
                    }
                }
                s.add(e1)
                current.put(e1, s)
            }
        } while (!newHashSet(current.values).equals(newHashSet(old.values)))
        
        val c = StatemachineFactory.eINSTANCE.createStateMachine
        val Set<Set<State>> setSet = newHashSet(current.values)
        var sets = setSet.iterator
        val Map<Set<?>, State> newStates = newHashMap
        while (sets.hasNext()) {
            val set = sets.next
            val term = TransformationsToolBox.containsATerminalState(set)
            val init = TransformationsToolBox.containsAnInitialState(set)
            newStates.put(set, c.addState(init, term))
        }

        sets = setSet.iterator
        while(sets.hasNext) {
            val set = sets.next
            val r = set.iterator.next
            val rp = newStates.get(set)
            val k = b.alphabet.iterator
            while (k.hasNext) {
                val l = k.next
                val ds = b.delta(r, l)
                if(!ds.isEmpty){
	                val f = ds.iterator.next.end
	                val fp = newStates.get(current.get(f))
	                val trans = StatemachineFactory.eINSTANCE.createTransition
	                trans.label = l
	                trans.start = rp
	                trans.end = fp
	                c.addTransition(trans)
                }
            }
        }
        return c
    }
}
