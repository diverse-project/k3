package fr.inria.diverse.k3.al.annotationprocessor.stepmanager

abstract class StepCommand {

	private Object result

	public def void execute() ;
	
	protected def void addToResult(Object o) {
		result = o;
	}

	public def Object getResult() {
		return result;
	}

}
