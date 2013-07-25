package ${package}

import k3.Aspect
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl

import static extension ${package}.EPackageAspect.*

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

		p = EcoreFactory.eINSTANCE.createEPackage
		p.start		
		p.sayHello("k3")

	}

	def static void main(String[] args) {
		println('Hello Kermeta on top of Xtend!')
		new HelloEcore().run()

	}
	

}



@Aspect(className=typeof(EPackage))
class EPackageAspect {

	//Do not use this but use self for accessing aspect values
	EPackageAspect self;
	
	//i has a value persistance is static
	static int i = 0;
	
	//j is local
	int j;

	public def void start(EPackage _self) {
		i = i + 1
		println(i)
		self.j = self.j + 1;
		println(self.j)
		
	}

	public def void sayHello(EPackage _self,String say) {
		println(say)		
	}

}

