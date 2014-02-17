package hello_ecore

import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import fr.inria.diverse.k3.al.annotationprocessor.Aspect


import static extension hello_ecore.EPackageAspect.*
import org.eclipse.emf.ecore.EcoreFactory

class HelloEcore{ 

	public def run(String modelPath) {
		//Load Ecore Model
		var fact = new EcoreResourceFactoryImpl
		if (!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", fact);
		var rs = new ResourceSetImpl()
		var uri = URI.createURI(modelPath);
		var res = rs.getResource(uri, true);

		var EPackage p = res.contents.get(0) as EPackage
		//properties are shared between instances
		//Add the expected behavior
		p.start(1)
		p.sayHello()		 

		// create a new EPackage
		p = EcoreFactory.eINSTANCE.createEPackage
		p.name = "New Package"
		p.start(1)	
		p.sayHello()
	}

	def static void main(String[] args) {
		println('Hello Kermeta on top of Xtend!')
		new HelloEcore().run("sample_models/fsm.ecore")
		val String s = '''  '''
	}
}

@Aspect(className=typeof(EPackage))
class EPackageAspect { 
	
	//i has a value persistence is static
	static int i = 0;
	
	//j is local
	int j;

	public def void start(int increment) {
		_self.i= _self.i + increment
		println("i="+_self.i)
		_self.j = _self.j + increment;
		println("j="+_self.j)
		
	}

	public def  void sayHello() {
		println("Hello, my name is "+_self.name)		
	}

}