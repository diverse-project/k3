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
	
	def public static String get_MiniAspectSample_SampleMain_xtend(String namePackage) {
		return '''package  «namePackage»

import java.io.File

import static extension «namePackage».SampleXMLFileAspect.*

class SampleMain{ 

	def static void main(String[] args) {
		println('Hello Kermeta on top of Xtend!')		
		
		val myFile = new File("sample.txt")
		
		// fill the attribute 'content' of the aspectized File with the evaluation of a template
		myFile.contentType = "color"
		myFile.contentArrayList = newArrayList("red", "green", "blue") 
		
		// write the file on disk
		myFile.writeXML
		
		
		println('file written (please refresh project to see it)')
	}
}
'''
	}
	
	def public static String get_MiniAspectSample_SampleXMLFileAspect_xtend(String namePackage) {
		return '''package  «namePackage»

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import java.io.PrintWriter
import java.util.ArrayList

/**
 * Sample aspect that gives java.io.File the ability to store Text content and save it to disk
 */
@Aspect(className=java.io.File)
class SampleXMLFileAspect {
	
	var String contentType = ""
	
	var ArrayList<String> contentArrayList = newArrayList("")
	
	public def void writeXML(){		
		var PrintWriter writer = new PrintWriter(_self, "UTF-8");
		// compute content String by using template
		val content = \'\'\' <xml>
	<'''+"«_self.contentType»"+'''s>	
		'''+"«FOR contentItem : _self.contentArrayList »<color>«contentItem»</color> «ENDFOR»"+'''
	</'''+"«_self.contentType»"+'''s>
</xml>\'\'\'
		writer.println(content);
		writer.close();
	}
	
}
'''
	}
	
}