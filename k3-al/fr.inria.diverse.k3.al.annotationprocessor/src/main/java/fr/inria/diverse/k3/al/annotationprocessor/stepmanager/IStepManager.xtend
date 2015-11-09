package fr.inria.diverse.k3.al.annotationprocessor.stepmanager

interface IStepManager {

	def void executeStep(Object caller, StepCommand command, String className, String methodName);
	
	def boolean canHandle(Object caller);

}
