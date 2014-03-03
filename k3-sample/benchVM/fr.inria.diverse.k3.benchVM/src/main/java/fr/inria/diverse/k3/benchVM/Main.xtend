package fr.inria.diverse.k3.benchVM

import fr.inria.diverse.k3.benchVM.synthesis.StateMachineGenerator
import java.util.Collections
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import statemachine.StateMachine
import statemachine.impl.StatemachineFactoryImpl

class Main {
	def static void main(String[] args) {
		var gen = new StateMachineGenerator(100000, 5,1,1)
		
		
		
		
		var fsm = gen.createStateMachine()
		gen.checkStateMachine(fsm)
		
		
		
	}
	
	
	
	static def List<StateMachine> getSlicerModel(String uriModel) {
		EcoreFactoryImpl.eINSTANCE.eClass
		StatemachineFactoryImpl.eINSTANCE.eClass

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap.put("ecore", new EcoreResourceFactoryImpl)
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl)

		val res = new ResourceSetImpl().getResource(URI.createURI(uriModel), true)
		res.load(Collections.emptyMap)
		res.contents.filter(StateMachine).toList
		
		
	}
}