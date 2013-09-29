package fr.inria.triskell.k3.sample.logo

import kmLogo.ASM.LogoProgram
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.common.util.URI
import kmLogo.KmLogoPackage
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

import static extension fr.inria.triskell.k3.sample.logo.LogoProgramAspect.*

class HelloEcore{

	public def run() {
		var fact = new XMIResourceFactoryImpl
		if (!EPackage.Registry.INSTANCE.containsKey(KmLogoPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(KmLogoPackage.eNS_URI, KmLogoPackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", fact);

		var rs = new ResourceSetImpl()

		//var uri = URI.createURI(args.get(0));
		var uri = URI.createURI("hexa.logoasm");
		var res = rs.getResource(uri, true);
		var LogoProgram prog = res.contents.get(0) as LogoProgram
		var Context context = new Context()
		prog.eval(context)
		new Window(context.turtle)
	}

	def static void main(String[] args) {
		println('Hello Kermeta on top of Xtend!')
		new HelloEcore().run()
	}	

}

