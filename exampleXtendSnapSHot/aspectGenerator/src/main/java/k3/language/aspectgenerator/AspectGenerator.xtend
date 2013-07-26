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
import java.io.BufferedWriter
import java.io.FileWriter
import java.io.File
import java.util.ArrayList

class AspectGenerator{


	def static void main(String[] args) {
		println('Hello Kermeta on top of Xtend!')
		new AspectGenerator().run()

	}
	
	public def run() {
		var Context context = new Context
		
		//Load Ecore Model
		var fact = new EcoreResourceFactoryImpl
		if (!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE)
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", fact)
		
		var rs = new ResourceSetImpl()
		var uri = URI.createURI("kermeta.ecore")
		var res = rs.getResource(uri, true)

		var EPackage p = res.contents.get(0) as EPackage
		p.generateAspect(context)
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
			_self.writeFile(context)
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
	
	def private void writeFile(Context context) {
		_self.writePackage(context)
		
		var BufferedWriter buffer = new BufferedWriter(new FileWriter(context.currentPath + context.packageCollection.last + ".xtend"))
		
		buffer.write(context.kmtContent.toString)
		buffer.flush
		buffer.close
	}
	
	def private void writePackage(Context context) {
		context.currentPath = context.projectPath + "/"
		for(pack : context.packageCollection) {
			context.currentPath = context.currentPath + "/" + pack
			var File dir =  new File(context.currentPath);
			dir.mkdirs
		}
		context.currentPath = context.currentPath + "/"
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
		aspect.append("import fr.inria.triskell.k3.Aspect\n\n")
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
						
			scriptNewClass = scriptNewClass + _self.name + "Aspect {\n"
			
			context.kmtContent.append(scriptNewClass)
		}
		
	def private void writeCloseClass (Context context) {
		context.kmtContent.append("\n}\n\n")
	}
		
	def private void addClass (Context context) {
		context.classCollection.add(_self.name + "Aspect")
	}
}


