package k3.language.aspectgenerator

import fr.inria.triskell.k3.Aspect
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl

import static extension k3.language.aspectgenerator.EPackageAspect.*
import static extension k3.language.aspectgenerator.EClassAspect.*
import java.util.ArrayList
import java.util.List

class AspectGenerator{


	def static void main(String[] args) {
		println('Hello Kermeta on top of Xtend!')
		var String projectPath = System.getProperty("user.dir") + "/target/"
		var String projectName = "aspectKermeta"
		var String operationName = "eval"
		new AspectGenerator().run(projectPath, projectName, operationName, "kermeta.ecore")

	}
	
	public def run(String projectPath, String projectName, String operationName, String ecorePath) {
		var Context context = new Context(projectPath, projectName, operationName)
		
		//Load Ecore Model
		var fact = new EcoreResourceFactoryImpl
		if (!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE)
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", fact)
		
		var rs = new ResourceSetImpl()
		//var uri = URI.createURI("kermeta.ecore")
		var uri = URI.createURI(ecorePath)
		var res = rs.getResource(uri, true)

		var EPackage p = res.contents.get(0) as EPackage
		p.generateAspect(context)
		generateContext(context)
	}
	
	private def void generateContext(Context context) {
		// initialization of packaging for the class "Context"
		var List<String> packageCollection = new ArrayList<String>
		packageCollection.add(context.projectName)
		
		// initialization of the content of file "Context.xtend"
		var StringBuffer content = new StringBuffer
		content.append("package " + context.projectName + "\n\n")
		content.append("class Context {\n\n")
		content.append("\tdef new (){\n\n\t}")
		content.append("\n\n}\n")
		
		FileManager.writeFile(context.projectPath, "Context", packageCollection, content.toString)
		
	}

}

@Aspect(className=typeof(EPackage)) 
class EPackageAspect { 
	
	public def void generateAspect(Context context) {		
		_self.addPackage(context)
		
		for (p : _self.ESubpackages){
			 p.generateAspect(context)
		}
		
		if (_self.EClassifiers.exists[elt | elt instanceof EClass]) {
					
			for(c : _self.EClassifiers){
				if(c instanceof EClass) {
					(c as EClass).generateAspect(context)
				}
			}
			_self.manageImport(context)
			FileManager.writeFile(context.projectPath, context.packageCollection.last, context.packageCollection, context.kmtContent.toString)
			//_self.writeFile(context)
			context.classCollection = new ArrayList<String>
			context.kmtContent = new StringBuffer
			
		}
		
		_self.deletePackage(context)
	}
	
	def private void addPackage (Context context) {
		context.counterPackage = context.counterPackage + 1
		context.packageCollection.add(_self.name)		
	}
			
		
	def private void deletePackage (Context context) {
		context.packageCollection.remove(context.counterPackage - 1)
		if (context.counterPackage > 0) {
			context.counterPackage = context.counterPackage - 1
		}	
	}
	
	def private void manageImport(Context context) {
		var String pack = ""
		var StringBuffer aspect = new StringBuffer
		
		for(pc : context.packageCollection) {
			if(context.packageCollection.last() == pc){
				pack = pack + pc	
			} else {
				pack = pack + pc + "."
			}
		}
		
		aspect.append("package " + pack + "\n\n")			
		aspect.append("import fr.inria.triskell.k3.Aspect\n")
		
		if(context.isOverride) {
			aspect.append("import fr.inria.triskell.k3.OverrideAspectMethod\n")			
		}
		
		aspect.append("import " + context.projectName + "\n\n")
		
		for (cl : context.classCollection){
			aspect.append("import static extension " + pack + "." + cl + ".*\n")
		}
		
		aspect.append("\n")
		context.kmtContent.insert(0, aspect.toString)
		context.kmtContent.append("\n\n")
	}
}

@Aspect(className=typeof(EClass)) 
class EClassAspect {
	
		def public void generateAspect(Context context) {
			
			_self.writeOpenClass(context)
			if(context.nameOperation != null) {
				_self.writeOperation(context)
			}
			_self.writeCloseClass(context)
			
		}
		
		def private void writeOpenClass (Context context) {
			var String scriptNewClass = ""
			
			_self.addClass (context)
			
			scriptNewClass = scriptNewClass + "@Aspect(className=typeof(" + _self.name + "))\n"
						
			if (_self.abstract) {
				scriptNewClass = scriptNewClass + "abstract class "
			} else {
				scriptNewClass = scriptNewClass + "class "
			}
			scriptNewClass = scriptNewClass + _self.name + "Aspect" 
			if (!_self.ESuperTypes.empty) {
				scriptNewClass = scriptNewClass + " extends " + _self.ESuperTypes.get(0).name
			}
			scriptNewClass = scriptNewClass + " {\n"
			if(_self.ESuperTypes.length > 1){
				scriptNewClass = scriptNewClass + context.comment_ForMultiInheritence
			}
			
			context.kmtContent.append(scriptNewClass)
		}
		
	def private void writeCloseClass (Context context) {
		context.kmtContent.append("\n}\n\n")
	}
		
	def private void addClass (Context context) {
		context.classCollection.add(_self.name + "Aspect")
	}
	
	def private void writeOperation (Context context) {
		var String operation = "\tdef public void " + context.nameOperation + " (Context context)"
		
		if (!_self.ESuperTypes.empty) {
			context.kmtContent.append("\t@OverrideAspectMethod\n")
			context.kmtContent.append(operation)
			context.isOverride = true
		} else {
			context.kmtContent.append(operation)
		}
		context.kmtContent.append(" { \n\n\t}")
			
	}
	
}


