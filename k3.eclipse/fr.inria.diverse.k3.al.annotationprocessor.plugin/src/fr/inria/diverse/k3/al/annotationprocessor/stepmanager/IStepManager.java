package fr.inria.diverse.k3.al.annotationprocessor.stepmanager;

public interface IStepManager {

	void executeStep(Object caller, StepCommand command, String className, String methodName);

	default void executeStep(Object caller, Object[] parameters, StepCommand command, String className, String methodName) {
		executeStep(caller, command, className, methodName);
	};

	boolean canHandle(Object caller);
}
