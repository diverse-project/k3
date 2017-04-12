package fr.inria.diverse.k3.al.annotationprocessor.stepmanager

import java.util.HashSet
import java.util.Set

class EventManagerRegistry {

	private static var EventManagerRegistry instance;

	private Set<IEventManager> registeredManagers;
	
	private new() {
		this.registeredManagers = new HashSet<IEventManager>();
	}

	public static def EventManagerRegistry getInstance() {
		if(instance == null)
			instance = new EventManagerRegistry()
		return instance
	}

	public def void registerManager(IEventManager manager) {
		if(manager != null)
			registeredManagers.add(manager)
	}
	
	public def void unregisterManager(IStepManager manager) {
		if(manager != null)
			registeredManagers.remove(manager)
	}
	
	public def IEventManager findEventManager() {
		return registeredManagers.findFirst[true];
	}

}
