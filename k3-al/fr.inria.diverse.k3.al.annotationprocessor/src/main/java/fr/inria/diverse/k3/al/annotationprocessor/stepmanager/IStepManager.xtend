package fr.inria.diverse.k3.al.annotationprocessor.stepmanager

interface IStepManager {

	def Object execute(Object caller, StepCommand command, String methodName);
	
	def boolean canHandle(Object caller);

}
