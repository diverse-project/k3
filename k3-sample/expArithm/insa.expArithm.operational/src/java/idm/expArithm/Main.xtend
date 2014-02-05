package idm.expArithm

import expArithm.ExpArithmPackage
import expArithm.ExpressionArithm
import java.util.Collections
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import static extension idm.expArithm.Calculable.*

public class Main {
	def static void main(String[] args) {
		val exp = load("src/resources/model1.xmi")
		
//		exp.checkAllInvariants // Checks the constraints
		
		val ctx = new Contexte
		
		exp.calculer(ctx)
		println(ctx.finalValue)
	}


	def static ExpressionArithm load(String path) {
		val rs = new ResourceSetImpl
		// init the required package
		ExpArithmPackage.eINSTANCE.eClass
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap.put("*", new XMIResourceFactoryImpl)
		val res = rs.getResource(URI.createURI(path), true)
		res.load(Collections.emptyMap)
		res.contents.filter(ExpressionArithm).head
	}
}