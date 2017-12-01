package fr.inria.diverse.k3.al.annotationprocessor.stepmanager;

public interface IStepManager {

	default void executeStep(Object caller, StepCommand command, String className, String methodName) {
		executeStep(caller, new Object[] {}, command, className, methodName);
	};

	void executeStep(Object caller, Object[] parameters, StepCommand command, String className, String methodName);

	boolean canHandle(Object caller);
}
