package hello_ecore

import org.eclipse.emf.ecore.EPackage
import fr.inria.diverse.k3.al.annotationprocessor.Aspect


import static extension hello_ecore.EPackageAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.Contracted
import fr.inria.diverse.k3.al.annotationprocessor.Inv
import fr.inria.diverse.k3.al.annotationprocessor.Pre
import fr.inria.diverse.k3.al.annotationprocessor.Post

@Aspect(className=EPackage)
@Contracted
class EPackageAspect { 

//	@Inv def boolean noPackageInName(){
//		return _self.name.nullOrEmpty || !_self.name.contains("Package")
//	}
	
	@Inv def boolean inv() { true }
	
//	@Pre  def boolean preFoo() { true }
//	@Post def boolean postFoo() { true }

}