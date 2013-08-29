package fr.inria.triskell.k3.fsm
import fsm.FSM
import fsm.FsmPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import static extension fr.inria.triskell.k3.fsm.FSMAspect.*

class Demo {
 
	public def run() {
		var fact = new XMIResourceFactoryImpl
		if (!EPackage.Registry.INSTANCE.containsKey(FsmPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(FsmPackage.eNS_URI, FsmPackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", fact);

		var rs = new ResourceSetImpl()

		//var uri = URI.createURI(args.get(0));
		var uri = URI.createURI("TrafficLights.fsm");
		var res = rs.getResource(uri, true);
		var FSM fsm = res.contents.get(0) as FSM
		fsm.run 
	} 

	def static void main(String[] args) {
		println('Hello K3 based on xtend!')
		new Demo().run()
	}
}
	