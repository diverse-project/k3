package fr.inria.diverse.k3.ui.tools

class K3SampleFilesTemplates {
	def public static String getFileTypeK3(String namePackage, String nameClass) {
		return '''package  «namePackage» 
	
	import org.eclipse.emf.ecore.EPackage
	import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
	import org.eclipse.emf.ecore.EcorePackage
	import org.eclipse.emf.ecore.resource.Resource
	import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
	import org.eclipse.emf.common.util.URI
	
	class «nameClass»{ 
	
	
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
		}
		
		def static void main(String[] args) {
			println('Hello Kermeta on top of Xtend!')
			new «nameClass»().run(\"model\")
			val String s = \'\'\'  \'\'\'
	}
}
'''
	}
}