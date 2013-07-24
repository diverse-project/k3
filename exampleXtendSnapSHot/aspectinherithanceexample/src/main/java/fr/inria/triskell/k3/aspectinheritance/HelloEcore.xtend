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
		c.testInheritance1
		c.testU
		 
		
		
}

	def static void main(String[] args) {
		println('Hello Kermeta on top of Xtend!')
		new HelloEcore().run()

	}
	

}




@Aspect(className=typeof(EClass))
class EClassAspect extends EClassifierAspect{

	
	//j is local
	int k;

	/* Testt call on method on the inherited class without parameter */
	public def void test3() {
		_self.k = _self.k + 1;
		
		println(self.k)
		
	}

	/* Testt call on method on the class with parameter */
	public def void sayHello(String say) {
		println(say)		
	}

	/* Testt call on method on the class that use attributes of the super aspect */
	public def void test4() {
		self.j = self.j + 1;
		println(self.j)
		 
	}

	
	@OverrideAspectMethod
	public def void testInheritance() {
		println("call testInheritance on EClass" )
		self.super_testInheritance
	}
		public def void testInheritance1() {
		println("call testInheritance 1 on EClass" )
		//call super (Must be improved must be something like super() 
		self.test1		
	}
	 
	@OverrideAspectMethod
	public def void testU(){
		self.super_testU
		self.u = self.u+1;
		println(self.u)
		
	}
	 
  

}


@Aspect(className=typeof(EClassifier))
class EClassifierAspect {

		
	//j is local
	 
	int j;
	
	int u=0;
	
	/*
	
	public def int j(EClassifier _self){
		return self.j
	}
	public def void j(EClassifier _self, int j){
		self.j=j
	} */

	
	/* Testt call on method on the superclass without parameter */
	public def void test1() { 
		_self.j = _self.j + 1;
		println(_self.j)
		
	}

	/* Testt call on method on the superclass with parameter */
	public def void test2(String say) {
		println(say)	 	
	}
	
	public def void testInheritance() {
		println("call testInheritance on EClassifier" )
				
	} 
	
	public def void testU(){
		_self.u = _self.u+1;
		println(_self.u)
	}

}


