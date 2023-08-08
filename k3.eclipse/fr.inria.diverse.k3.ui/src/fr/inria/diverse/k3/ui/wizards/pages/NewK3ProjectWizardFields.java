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
package fr.inria.diverse.k3.ui.wizards.pages;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde.ui.BaseProjectWizardFields;

public class NewK3ProjectWizardFields extends BaseProjectWizardFields {
	
	// main fields (Ie. that are present in the main wizard page)
	public enum KindsOfProject { STANDALONE, PLUGIN, MAVEN }

	public KindsOfProject 	kindsOfProject;
	public String 			namePackage;
	public boolean			useEMF = true;
	public boolean			useKMF = false;
	
	// Additional.optional fields (Ie. that may be used by template pages)(we may consider changing that to a better structure)
	// this is a way to programmatically initialize some fields in the templates
	//public boolean 			ecoreProject;
	public String 			genModelFile;
	public String			basePackage;
	//public String 			typeProject;
	public IFile 			ecoreIFile;
	//public String 			ecoreProjectPath;
	public boolean			useSLE = false;
	
	
	public NewK3ProjectWizardFields () {
		super();
		this.projectLocation 		= ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
		this.projectName 			= "org.sample.k3project";

		this.kindsOfProject			= KindsOfProject.PLUGIN;
		this.ecoreIFile				= null;
		this.genModelFile			= null;
		this.namePackage 			= "";
		this.basePackage			= "";
		//this.ecoreProject 			= false;
		//this.typeProject			= "None";
		//this.ecoreProjectPath		= "";
	}
}
