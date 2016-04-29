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

	def static void main(String[] args) {
		println('Hello Kermeta on top of Xtend!')
		new HelloEcore().run("sample_models/fsm.ecore")
		
	}

	public def run(String modelPath) {
		//Load Ecore Model
		val EPackage p = loadModel(modelPath)
		
		// call features defined on the aspects
		p.start(1)
		p.sayHello()		 

		for (var i = 0 ; i < 2 ; i++) {
			// create a new EPackage
			val p2 = EcoreFactory.eINSTANCE.createEPackage
			p2.name = "NewPackage_"+i
			p2.start(1)	
			p2.sayHello()
			// modify initial model
			p.ESubpackages.add(p2)
		}
		
		println("number of call of start() = "+EPackageAspect::i)
		
		// demonstrates string template use
		val String s = '''package «p.name» {«FOR elem : p.ESubpackages SEPARATOR ', '»«elem.name»«ENDFOR»} '''
		println(s)
	}
	
	def EPackage loadModel(String modelPath){
		//Load Ecore Model
		var fact = new EcoreResourceFactoryImpl
		if (!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", fact);
		var rs = new ResourceSetImpl()
		var uri = URI.createURI(modelPath);
		var res = rs.getResource(uri, true);

		// get first element of the Resource, we consider only the first EPackage 
		var EPackage p = res.contents.get(0) as EPackage
		return p
	}
}

@Aspect(className=typeof(EPackage))
class EPackageAspect { 
	
	//i has a value persistence is static
	public static int i = 0;
	
	//j is local
	public int j;

	public def void start(int increment) {
		i= i + increment
		println("i="+ i)
		_self.j = _self.j + increment;
		println("j="+_self.j)
		
	}

	public def  void sayHello() {
		println("Hello, my name is "+_self.name)		
	}

}