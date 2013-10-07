package fr.inria.diverse.k3.sample.fr.inria.diverse.k3.sample.loadXtendModelFromXtend;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Provider;

public class MyProjectResourceSetProvider implements Provider<ResourceSet> {

	
	public MyProjectResourceSetProvider() {
		super();
	}

	public ResourceSet get() {
		ResourceSet rs = new XtextResourceSet();
		MyProjectAdapter.install(rs);
		return rs;
	}
}
