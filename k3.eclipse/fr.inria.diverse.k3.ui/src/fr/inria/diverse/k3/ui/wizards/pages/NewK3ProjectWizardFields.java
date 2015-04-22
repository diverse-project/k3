package fr.inria.diverse.k3.ui.wizards.pages;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;

import fr.inria.diverse.commons.eclipse.pde.wizards.pages.pde.ui.BaseProjectWizardFields;

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
	//public List<String>		basePackage;
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
		//this.ecoreProject 			= false;
		//this.basePackage			= new ArrayList<String>();
		//this.typeProject			= "None";
		//this.ecoreProjectPath		= "";
	}
}
