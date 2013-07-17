package ${package}

import java.util.HashMap
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl

import static extension ${package}.EPackageHelper.*

class HelloEcore{

	public def run() {
		//Load Ecore Model
		var fact = new EcoreResourceFactoryImpl
		if (!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", fact);
		var rs = new ResourceSetImpl()
		var uri = URI.createURI("fsm.ecore");
		var res = rs.getResource(uri, true);

		var EPackage p = res.contents.get(0) as EPackage
		//properties are shared between instances
		p.start		
		p.start		

		//Call with properties
		var prop = new EPackageAspectProperties
		var map = new HashMap<EPackage, EPackageAspectProperties>
		map.put(p, prop)
		p.start(map)
		p.start(map)
		p.toto
	}

	def static void main(String[] args) {
		println('Hello Kermeta on top of Xtend!')
		new HelloEcore().run()

	}
	
	def void toto(EPackage f) {
		println("local extension method")		
	}

}

class EPackageHelper {

	static int i = 0;

	//aspect without properties
	static def void start(EPackage _self) {
		println("call start be careful it is just an helper function")
		i = i + 1
		println(i)
	}

	//aspect with properties
	static def void start(EPackage _self, Map<EPackage, EPackageAspectProperties> selfProp) {
		var self = selfProp.get(_self)
		self.i = self.i + 1;
		println(self.i)
		
	}

}

class EPackageAspectProperties {
	@Property
	var i = 0
}
