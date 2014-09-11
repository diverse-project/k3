package fr.inria.diverse.k3.sle ;

import org.eclipse.xtext.resource.IDerivedStateComputer;

import org.eclipse.xtext.xbase.compiler.XbaseCompiler;

import org.eclipse.xtext.xbase.typesystem.computation.SynonymTypesProvider;

public class K3SLERuntimeModule extends fr.inria.diverse.k3.sle.AbstractK3SLERuntimeModule
{
	@Override
	public Class<? extends IDerivedStateComputer> bindIDerivedStateComputer() {
		return fr.inria.diverse.k3.sle.processors.K3SLEDerivedStateComputer.class ;
	}

	public Class<? extends SynonymTypesProvider> bindSynonymTypesProvider() {
		return fr.inria.diverse.k3.sle.typesystem.K3SLESynonymTypesProvider.class ;
	}

	public Class<? extends XbaseCompiler> bindXbaseCompiler() {
		return fr.inria.diverse.k3.sle.compiler.ModelOrientedXbaseCompiler.class ;
	}
}
