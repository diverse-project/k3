package $packageName$;

import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI

import static extension $packageName$.EPackage$aspectClassPostfix$.*
import java.util.HashMap

class $className${ 

	public def run(String modelPath, String resultModelPath) {
		//Load Ecore Model
		var fact = new EcoreResourceFactoryImpl
		if (!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", fact);
		var rs = new ResourceSetImpl()
		var uri = URI.createURI(modelPath);
		var res = rs.getResource(uri, true);

		// apply transformation
		res.contents.filter(EPackage).forEach[ pack | pack.annotate]
		
		// save the modified model in a new file
		val resSet2 = new  ResourceSetImpl()
		val res2 = resSet2.createResource(URI.createURI(resultModelPath))
		// move content to new resource
		res2.contents.addAll(res.contents)
		res2.save(new HashMap()) 
	}

	def static void main(String[] args) {
		println('Hello Kermeta on top of Xtend! (please create a My.ecore file to test this sample program)')
		new $className$().run("My.ecore", "My_annotated.ecore")
		println('file written (please refresh project to see it)')
	}
	
}