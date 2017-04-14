package fr.inria.diverse.k3.al.annotationprocessor.stepmanager

import java.util.Set
import org.eclipse.emf.ecore.EClass

interface IEventManager {
	
	def void sendEvent(Object event)
	
	def void manageEvents()
	
	def Set<EClass> getEventClasses()
	
	def boolean canSendEvent(Object event)
}
