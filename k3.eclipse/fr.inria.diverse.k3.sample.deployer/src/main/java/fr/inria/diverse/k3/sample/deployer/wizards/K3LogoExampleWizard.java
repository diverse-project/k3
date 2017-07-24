/*******************************************************************************
 * Copyright (c) 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package fr.inria.diverse.k3.sample.deployer.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.ui.plugin.AbstractUIPlugin;

import fr.inria.diverse.k3.sample.deployer.Activator;

public class K3LogoExampleWizard 
extends AbstractExampleWizard {

	@Override
	protected Collection<ProjectDescriptor> getProjectDescriptors() {		
		// We need the statements example to be unzipped along with the
		// EMF library example model, edit and editor examples
		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(2);
		projects.add(new ProjectDescriptor("fr.inria.diverse.k3.sample.deployer", "zips/logo/k3.sample.maven.logo.model.zip", "k3.sample.maven.logo.model"));
		projects.add(new ProjectDescriptor("fr.inria.diverse.k3.sample.deployer", "zips/logo/k3.sample.maven.logo.zip", "k3.sample.maven.logo"));
		return projects;
	}

	@Override
	protected AbstractUIPlugin getContainerPlugin() {
		
		return Activator.getDefault();
	}
}
