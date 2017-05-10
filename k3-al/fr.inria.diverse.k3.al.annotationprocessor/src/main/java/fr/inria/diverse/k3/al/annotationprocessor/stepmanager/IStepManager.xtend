package fr.inria.diverse.k3.al.annotationprocessor.stepmanager

interface IStepManager {

	def void executeStep(Object caller, StepCommand command, String className, String methodName) {
		executeStep(caller, command, className, methodName, false)
	}
	
	def void executeStep(Object caller, StepCommand command, String className, String methodName, boolean output)
	
	def boolean canHandle(Object caller)

}
