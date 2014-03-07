package statemachine.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import statemachine.State;
import statemachine.StateMachine;
import statemachine.Transition;


public class TransformationsToolBox {

  public static boolean containsATerminalState(Set<State> s) {
    Iterator<State> i = s.iterator() ;
    while(i.hasNext()) {
        State e = i.next() ;
        if (e.isTerminal()) return true ;
    }
    return false ;
  } 

  public static boolean containsAnInitialState(Set<State> s) {
    Iterator<State> i = s.iterator() ;
    while(i.hasNext()) {
        State e = i.next() ;
        if (e.isInitial()) return true ;
    }
    return false ;
  } 
  
  /**
   * Compute the set of states that are reachable ina given automanton
   * from a set of states using epsilon moves.
   * An epsilon transition is a transition which is labelled <code>null</code>.
   * 
   * @param s the set of starting states 
   * @param a the automaton 
   * @return a - possibly empty - set of states reachable from <code>s</code> through
   * epsilon transitions. 
   */
  public static Set<State> epsilonClosure(Set<State> s, StateMachine a) {
      Set<State> exp = new HashSet<>();
      exp.addAll(s); /* set of states to visit */
      Set<State> view = new HashSet<>();
      Set<State> arr = new HashSet<>();
      arr.addAll(s);
      do {
          Set<State> ns = new HashSet<>();
          ns.addAll(exp); /* arrival states */
          Iterator<State> it = ns.iterator();
          while (it.hasNext()) {
              State st = it.next();
              Iterator<Transition> it2 = a.delta(st).iterator();
              while (it2.hasNext()) {
                  Transition tr = it2.next();
                  if (tr.getLabel() == null && !view.contains(tr.getEnd()) && !tr.getEnd().equals(st)) {
                      /* compute closure of epsilon transitions */
                      exp.add(tr.getEnd());
                      arr.add(tr.getEnd());
                  }
              }
              exp.remove(st);
              view.add(st);
          }
      } while (!exp.isEmpty());
      return arr;
  }

  
  /**
   * Compute a map from letters to set of states given 
   * a set of transitions.
   * This method computes the arrival set of states for each letter
   * occuring in a given set of transitions. epsilon transitions 
   * are not taken into account.
   *  
   * @param ts a Set of Transition objects.
   * @return a Map from Object - transition labels - to Set of State objects. 
   */
  public static Map<Object, Set<State>> mapAlphabet(Set<Transition> ts,StateMachine a) {
      Map<Object, Set<State>> am = new HashMap<>();
      List<Transition> tas = new ArrayList<>(ts);
      /* compute set of states for each letter */
      while (!tas.isEmpty()) {
          Transition tr = tas.remove(0);
          Object l = tr.getLabel();
          if (l == null)
              continue;
          Set<State> as = am.get(l);
          if (as == null) {
              as = new HashSet<>();
              am.put(l, as);
          }
          as.add(tr.getEnd());
      }
      return am;
  }

}
