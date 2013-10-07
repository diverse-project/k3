package fr.inria.diverse.k3.sample.fr.inria.diverse.k3.sample.loadXtendModelFromXtend;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtend.core.XtendStandaloneSetupGenerated;
import org.eclipse.xtend.core.xtend.XtendPackage;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.xbase.annotations.XbaseWithAnnotationsStandaloneSetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class XtendStandaloneSetup implements ISetup {

	private static Injector injector = null;

	public Injector createInjectorAndDoEMFRegistration() {
		if (injector != null)
			return injector;
		XbaseWithAnnotationsStandaloneSetup.doSetup();
		EPackage.Registry.INSTANCE.put(XtendPackage.eINSTANCE.getNsURI(), XtendPackage.eINSTANCE);
		injector = Guice.createInjector(new XtendModule());
		new XtendStandaloneSetupGenerated().register(injector);
		return injector;
	}

}
