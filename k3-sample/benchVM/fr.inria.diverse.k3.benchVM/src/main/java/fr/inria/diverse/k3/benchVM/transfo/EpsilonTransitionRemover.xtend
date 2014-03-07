package fr.inria.diverse.k3.benchVM.transfo;

import fr.inria.diverse.k3.benchVM.helper.HashValue
import fr.inria.diverse.k3.benchVM.helper.TransformationsToolBox
import java.util.List
import java.util.Map
import java.util.Set
import statemachine.State
import statemachine.StateMachine
import statemachine.StatemachineFactory
import statemachine.Transition

/**
 * This class allows to remove epsilon transitions in an automaton. Epsilon
 * transition are transitions (q , l , q') where l is null.
 * 
 * @author Yves Roos
 * @version 22032002
 */
public class EpsilonTransitionRemover implements Transformation {

	override def transform(StateMachine a) {
		val facto = StatemachineFactory.eINSTANCE
        val ret = facto.createStateMachine
        val Map<HashValue, State> sm = newHashMap
        val Set<HashValue> done = newHashSet
        val List<HashValue> todo = newArrayList
        val cur = TransformationsToolBox.epsilonClosure(a.initials, a)
        /* add cur as initial state of ret */
        val is = ret.addState(true,TransformationsToolBox.containsATerminalState(cur))
        var hv = new HashValue(cur)
        sm.put(hv,is);
        todo.add(hv);
        do {
            val s = todo.remove(0)
            var ns = sm.get(s)
            if(ns == null) {
                ns = ret.addState(false,TransformationsToolBox.containsATerminalState(s.s))
                sm.put(s,ns)
            }
            /* set s as explored */
            done.add(s)
            /* look for all transitions in s */
            val trm = instructions(a.delta(s.s),a)
            val i = trm.entrySet.iterator
            while (i.hasNext) {
                val e = i.next
                val o = e.getKey
                var ar = e.getValue
                /* compute closure of arrival set */
                ar = TransformationsToolBox.epsilonClosure(ar, a)
                hv = new HashValue(ar)
                /* retrieve state in new automaton from hashvalue */
                var ne = sm.get(hv)
                if(ne == null) {
                    ne = ret.addState(false,TransformationsToolBox.containsATerminalState(ar))
                    sm.put(hv,ne)
                }
                /* create transition */
                val trans = facto.createTransition
                trans.label = o
                trans.start = ns
                trans.end = ne
                ret.addTransition(trans)
                /* explore new state */
                if(!done.contains(hv))
                    todo.add(hv)
            }
        } while (!todo.isEmpty)
        return ret
    }


    private def Map< Object, Set<State>> instructions(Set< Transition > s, StateMachine a) {
        val Map< Object, Set<State> > m = newHashMap
        val i = s.iterator

        while (i.hasNext) {
            val tr = i.next
            val l = tr.label
            if (l != null) {
                var st = m.get(l)
                if (st == null) {
                    st = newHashSet
                    m.put(l,st);
                }
                /* add arrival state */
                st.add(tr.end)
            }
        }
        return m
    }
}

