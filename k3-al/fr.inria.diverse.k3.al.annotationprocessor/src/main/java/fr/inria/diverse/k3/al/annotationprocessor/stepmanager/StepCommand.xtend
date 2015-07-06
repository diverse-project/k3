package fr.inria.diverse.k3.al.annotationprocessor.stepmanager

abstract class StepCommand {

	private java.util.List<Object> result = new java.util.ArrayList<Object>();

	public def void execute() ;
	
	protected def boolean addToResult(Object o) {
		return result.add(o);
	}

	public def java.util.Collection<?> getResult() {
		return result.immutableCopy
	}

}
