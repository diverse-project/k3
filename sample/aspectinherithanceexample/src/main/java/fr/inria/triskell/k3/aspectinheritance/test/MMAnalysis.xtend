package fr.inria.triskell.k3.aspectinheritance.test;



//import static extension fr.inria.triskell.k3.aspectinheritance.test.AAspect.*

import fr.inria.triskell.k3.Aspect
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EcoreFactory

import static extension fr.inria.triskell.k3.aspectinheritance.test.AAspect.*
import static extension fr.inria.triskell.k3.aspectinheritance.test.EClassAspect.*
import static extension fr.inria.triskell.k3.aspectinheritance.test.EClassifierAspect.*
import static extension fr.inria.triskell.k3.aspectinheritance.test.EClassifierAspectQName.* 


import java.util.List

class A{
	 
	
	
} 

class B extends A{
	 
} 

@Aspect(className=typeof(A))
public class AAspect{ 
	 def void bar(){   
		println("A")
	}
}

@Aspect(className=typeof(B)) 
public class BAspect extends AAspect{ 
	  def void bar(){ 
		println("B") 
	}  
   
	 
}   





/*class C {
	 
	static def dispatch void foo(A a){println("A")}
	static def dispatch void foo(B b){println("B")}

	
	
	 
}*/

class D{
		def static void main(String[] args) {
		// @Inject extension C
		new D().testfoo()
		
		var EClass c = EcoreFactory.eINSTANCE.createEClass
        var EClassifier cl = c;
        c.testInheritance("a")
        println("----")
        cl.testInheritance("a")
	} 
	  
	def void testfoo(){ 
		var A a  = new B()  
		//a.foo
		a.bar  
		  
	}
}
 
@Aspect(className=typeof(EClass))
class EClassAspect extends EClassifierAspect{
	
	def void testInheritance(String a){
		println(""+a+" EClass " + a)
	} 
	
}
@Aspect(className=typeof(EClassifier))
class EClassifierAspect {  
	def void testInheritance(String a){ 
		println(a +  "EClassifier")
	}
	
}

@Aspect(className=typeof(EClassifier)) 
class EClassifierAspectName {
    public def String getVarName(String name, boolean toto) {
        var result = "the" + name 
        //if(withS) result = result + "s"
        return result 
    }

}

@Aspect(className=typeof(EClassifier)) class EClassifierAspectQName {
    public def boolean isSuperTypeOfBis(EClass clazz) {
        var result = clazz!=null
        val List<EClass> superTypes = clazz.getESuperTypes//workaround k3
        
		
        if(result){ 
            result = superTypes.exists[st | _self.isSuperTypeOfBis(st) 
            	 
            ] // Ne reconnait pas l'operation isSuperTypeOfBis
        } 
        
        return result 
    }
}
