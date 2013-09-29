package fr.inria.diverse.k3.sample.fr.inria.diverse.k3.sample.loadXtendModelFromXtend;

import org.eclipse.xtend.core.XtendRuntimeModule;
import org.eclipse.xtext.generator.trace.ITraceURIConverter;

public class XtendModule extends XtendRuntimeModule {

	public Class<? extends ITraceURIConverter> bindITraceURIConverter() {
		return TraceURIConverter.class;
	}



}
