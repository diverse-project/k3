package fr.inria.diverse.k3.benchVM.prop;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import statemachine.State;
import statemachine.StateMachine;
import fr.inria.diverse.k3.benchVM.helper.TransformationsToolBox;

public class ContainsEpsilon implements UnaryTest {
    @Override
	public boolean test(StateMachine a) {
        Iterator<State> i = a.initials().iterator();
        Set<State> s = new HashSet<>();
        while (i.hasNext()) {
            State st = i.next();
            if (st.isTerminal())
                return true;
            s.add(st);
            /* compute epsilon closure */
            Set<State> cl = TransformationsToolBox.epsilonClosure(s,a);
            if(TransformationsToolBox.containsATerminalState(cl))
                return true;
        }
        return false;
    }
}
