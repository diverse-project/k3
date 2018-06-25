package fr.inria.diverse.k3.al.annotationprocessor.stepmanager

import java.util.List

interface IStepManager {

	def void executeStep(Object caller, StepCommand command, String className, String methodName, List<Object> params)

	def void executeStep(Object caller, StepCommand command, String className, String methodName) {
		executeStep(caller, command, className, methodName, #[])
	}

	def boolean canHandle(Object caller)

}
