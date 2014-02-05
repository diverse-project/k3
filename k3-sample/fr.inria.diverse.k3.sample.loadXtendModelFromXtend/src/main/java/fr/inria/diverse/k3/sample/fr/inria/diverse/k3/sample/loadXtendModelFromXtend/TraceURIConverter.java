package fr.inria.diverse.k3.sample.fr.inria.diverse.k3.sample.loadXtendModelFromXtend;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.generator.trace.DefaultTraceURIConverter;
import org.eclipse.xtext.resource.XtextResource;

public class TraceURIConverter extends DefaultTraceURIConverter {

	@Override
	public URI getURIForTrace(XtextResource context) {
		return context.getURI();
	}

}
