/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.util;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractExpArithmtxtInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	private java.util.List<expArithm.resource.expArithmtxt.IExpArithmtxtInterpreterListener> listeners = new java.util.ArrayList<expArithm.resource.expArithmtxt.IExpArithmtxtInterpreterListener>();
	private org.eclipse.emf.ecore.EObject nextObjectToInterprete;
	private Object currentContext;
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		org.eclipse.emf.ecore.EObject next = null;
		currentContext = context;
		while (!interpretationStack.empty()) {
			try {
				next = interpretationStack.pop();
			} catch (java.util.EmptyStackException ese) {
				// this can happen when the interpreter was terminated between the call to empty()
				// and pop()
				break;
			}
			nextObjectToInterprete = next;
			notifyListeners(next);
			result = interprete(next, context);
			if (!continueInterpretation(context, result)) {
				break;
			}
		}
		currentContext = null;
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ContextType context, ResultType result) {
		return true;
	}
	
	public ResultType interprete(org.eclipse.emf.ecore.EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof expArithm.ExpressionArithm) {
			result = interprete_expArithm_ExpressionArithm((expArithm.ExpressionArithm) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof expArithm.OperateurBinaire) {
			result = interprete_expArithm_OperateurBinaire((expArithm.OperateurBinaire) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof expArithm.Valeur) {
			result = interprete_expArithm_Valeur((expArithm.Valeur) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof expArithm.Plus) {
			result = interprete_expArithm_Plus((expArithm.Plus) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof expArithm.Moins) {
			result = interprete_expArithm_Moins((expArithm.Moins) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof expArithm.Mult) {
			result = interprete_expArithm_Mult((expArithm.Mult) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof expArithm.Division) {
			result = interprete_expArithm_Division((expArithm.Division) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof expArithm.EltExp) {
			result = interprete_expArithm_EltExp((expArithm.EltExp) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_expArithm_ExpressionArithm(expArithm.ExpressionArithm expressionArithm, ContextType context) {
		return null;
	}
	
	public ResultType interprete_expArithm_EltExp(expArithm.EltExp eltExp, ContextType context) {
		return null;
	}
	
	public ResultType interprete_expArithm_OperateurBinaire(expArithm.OperateurBinaire operateurBinaire, ContextType context) {
		return null;
	}
	
	public ResultType interprete_expArithm_Valeur(expArithm.Valeur valeur, ContextType context) {
		return null;
	}
	
	public ResultType interprete_expArithm_Plus(expArithm.Plus plus, ContextType context) {
		return null;
	}
	
	public ResultType interprete_expArithm_Moins(expArithm.Moins moins, ContextType context) {
		return null;
	}
	
	public ResultType interprete_expArithm_Mult(expArithm.Mult mult, ContextType context) {
		return null;
	}
	
	public ResultType interprete_expArithm_Division(expArithm.Division division, ContextType context) {
		return null;
	}
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (expArithm.resource.expArithmtxt.IExpArithmtxtInterpreterListener listener : listeners) {
			listener.handleInterpreteObject(element);
		}
	}
	
	/**
	 * Adds the given object to the interpretation stack. Attention: Objects that are
	 * added first, are interpret last.
	 */
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
	/**
	 * Adds the given collection of objects to the interpretation stack. Attention:
	 * Collections that are added first, are interpret last.
	 */
	public void addObjectsToInterprete(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		for (org.eclipse.emf.ecore.EObject object : objects) {
			addObjectToInterprete(object);
		}
	}
	
	/**
	 * Adds the given collection of objects in reverse order to the interpretation
	 * stack.
	 */
	public void addObjectsToInterpreteInReverseOrder(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		java.util.List<org.eclipse.emf.ecore.EObject> reverse = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>(objects.size());
		reverse.addAll(objects);
		java.util.Collections.reverse(reverse);
		addObjectsToInterprete(reverse);
	}
	
	/**
	 * Adds the given object and all its children to the interpretation stack such
	 * that they are interpret in top down order.
	 */
	public void addObjectTreeToInterpreteTopDown(org.eclipse.emf.ecore.EObject root) {
		java.util.List<org.eclipse.emf.ecore.EObject> objects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		objects.add(root);
		java.util.Iterator<org.eclipse.emf.ecore.EObject> it = root.eAllContents();
		while (it.hasNext()) {
			org.eclipse.emf.ecore.EObject eObject = (org.eclipse.emf.ecore.EObject) it.next();
			objects.add(eObject);
		}
		addObjectsToInterpreteInReverseOrder(objects);
	}
	
	public void addListener(expArithm.resource.expArithmtxt.IExpArithmtxtInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(expArithm.resource.expArithmtxt.IExpArithmtxtInterpreterListener listener) {
		return listeners.remove(listener);
	}
	
	public org.eclipse.emf.ecore.EObject getNextObjectToInterprete() {
		return nextObjectToInterprete;
	}
	
	public java.util.Stack<org.eclipse.emf.ecore.EObject> getInterpretationStack() {
		return interpretationStack;
	}
	
	public void terminate() {
		interpretationStack.clear();
	}
	
	public Object getCurrentContext() {
		return currentContext;
	}
	
}
