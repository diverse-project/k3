package fr.inria.diverse.k3.sle;

import org.eclipse.xtext.naming.IQualifiedNameProvider;

public class K3SLERuntimeModule extends fr.inria.diverse.k3.sle.AbstractK3SLERuntimeModule
{
	@Override
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return fr.inria.diverse.k3.sle.K3SLEQualifiedNameProvider.class ;
	}
}
