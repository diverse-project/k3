/* $Id: KermetaExampleWizard.java,v 1.2 2008-10-30 16:45:57 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta
 * File       : KermetaExampleWizard.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Authors : 
 *        	dvojtise <dvojtise@irisa.fr>
 */
package fr.inria.diverse.k3.sample.deployer.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.ui.plugin.AbstractUIPlugin;

import fr.inria.diverse.k3.sample.deployer.Activator;

public class K3SamplePluginHelloEcoreExampleWizard
	extends AbstractExampleWizard {
	
	protected Collection<ProjectDescriptor> getProjectDescriptors() {		
		// We need the statements example to be unzipped along with the
		// EMF library example model, edit and editor examples
		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		projects.add(new ProjectDescriptor("fr.inria.diverse.k3.sample.deployer", "zips/k3.sample.plugin.hello_ecore.zip", "k3.sample.plugin.hello_ecore"));
		return projects;
	}

	@Override
	protected AbstractUIPlugin getContainerPlugin() {
		
		return Activator.getDefault();
	}
}