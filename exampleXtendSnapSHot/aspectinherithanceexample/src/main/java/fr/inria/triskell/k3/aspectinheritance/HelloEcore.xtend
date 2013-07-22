package fr.inria.triskell.k3.aspectinheritance

import fr.inria.triskell.k3.Aspect
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl

import static extension fr.inria.triskell.k3.aspectinheritance.EClassAspect.*
import static extension fr.inria.triskell.k3.aspectinheritance.EClassifierAspect.*
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import fr.inria.triskell.k3.OverrideAspectMethod

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
		
		var EClass c = EcoreFactory.eINSTANCE.createEClass
		c.test1
		c.test2("hello") 
		c.test3 
		c.sayHello("hello1") 
		c.test4
		c.testInheritance
		
		//properties are shared between instances
		
		
}

	def static void main(String[] args) {
		println('Hello Kermeta on top of Xtend!')
		new HelloEcore().run()

	}
	

}




@Aspect(className=typeof(EClass))
class EClassAspect extends EClassifierAspect{

	//Do not use this but use self for accessing aspect values
	EClass self;
	
	//j is local
	int k;

	/* Testt call on method on the inherited class without parameter */
	public def void test3(EClass _self) {
		self.k = self.k + 1;
		println(self.k)
		
	}

	/* Testt call on method on the class with parameter */
	public def void sayHello(EClass _self,String say) {
		println(say)		
	}

	/* Testt call on method on the class that use attributes of the super aspect */
	public def void test4(EClass _self) {
		_self.j = _self.j + 1;
		println(_self.j)
		 
	}

	
	@OverrideAspectMethod
	public def void testInheritance(EClass _self) {
		println("call testInheritance on EClass" )
		_self.super_testInheritance
	}
		public def void testInheritance1(EClass _self) {
		println("call testInheritance 1 on EClass" )
		//call super (Must be improved must be something like super() 
		_self.test1		
	}
	


}


@Aspect(className=typeof(EClassifier))
class EClassifierAspect {

	//Do not use this but use self for accessing aspect values
	EClassifier self;
		
	//j is local
	int j;
	
	
	public def int j(EClassifier _self){
		return self.j
	}
	public def void j(EClassifier _self, int j){
		self.j=j
	}

	
	/* Testt call on method on the superclass without parameter */
	public def void test1(EClassifier _self) {
		self.j = self.j + 1;
		println(self.j)
		
	}

	/* Testt call on method on the superclass with parameter */
	public def void test2(EClassifier _self,String say) {
		println(say)		
	}
	
	public def void testInheritance(EClassifier _self) {
		println("call testInheritance on EClassifier" )
				
	}
	

}


