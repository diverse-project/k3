package fr.inria.diverse.k3.sample.fr.inria.diverse.k3.sample.loadXtendModelFromXtend;

import java.util.Iterator;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.resource.ResourceSet;


public class MyProjectAdapter extends AdapterImpl {
	
	public static void install(ResourceSet rs) {
		Iterator<Adapter> i = rs.eAdapters().iterator();
		while (i.hasNext())
			if (i.next() instanceof MyProjectAdapter)
				i.remove();
		rs.eAdapters().add(new MyProjectAdapter());
	}


	private MyProjectAdapter() {
		super();
	}
}
