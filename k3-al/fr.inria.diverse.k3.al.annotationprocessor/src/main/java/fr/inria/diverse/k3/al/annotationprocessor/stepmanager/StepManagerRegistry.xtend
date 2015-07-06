package fr.inria.diverse.k3.al.annotationprocessor.stepmanager

import java.util.Set
import java.util.HashSet

class StepManagerRegistry {

	private static var StepManagerRegistry instance;

	private Set<IStepManager> registeredManagers;
	
	private new() {
		this.registeredManagers = new HashSet<IStepManager>();
	}

	public static def StepManagerRegistry getInstance() {
		if(instance == null)
			instance = new StepManagerRegistry()
		return instance
	}

	public def void registerManager(IStepManager manager) {
		if(manager != null)
			registeredManagers.add(manager)
	}
	
	public def void unregisterManager(IStepManager manager) {
		if(manager != null)
			registeredManagers.remove(manager)
	}
	
	

	public def IStepManager findStepManager(Object caller) {
		return registeredManagers.findFirst[m|m.canHandle(caller)];
	}

}
