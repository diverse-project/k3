package org.kermeta.language.sample.deployer.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.kermeta.language.sample.deployer.Activator;

public class K3LogoExampleWizard 
extends AbstractExampleWizard {

	@Override
	protected Collection<ProjectDescriptor> getProjectDescriptors() {		
		// We need the statements example to be unzipped along with the
		// EMF library example model, edit and editor examples
		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(2);
		projects.add(new ProjectDescriptor("fr.inria.diverse.k3.eclipse.sample.deployer", "zips/logo.metamodel.zip", "sample.logo.metamodel"));
		projects.add(new ProjectDescriptor("fr.inria.diverse.k3.eclipse.sample.deployer", "zips/logo.zip", "sample.logo"));
		return projects;
	}

	@Override
	protected AbstractUIPlugin getContainerPlugin() {
		
		return Activator.getDefault();
	}
}
