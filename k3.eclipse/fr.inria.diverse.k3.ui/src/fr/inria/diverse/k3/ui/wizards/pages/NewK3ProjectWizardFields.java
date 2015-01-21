package fr.inria.diverse.k3.ui.wizards.pages;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;

import fr.inria.diverse.commons.eclipse.pde.wizards.pages.pde.ui.BaseProjectWizardFields;

public class NewK3ProjectWizardFields extends BaseProjectWizardFields {
	
	public enum KindsOfProject { STANDALONE, PLUGIN, MAVEN }
	
	public boolean 			ecoreProject;
	public String 			genModelFile;
	public List<String>		basePackage;
	public String 			typeProject;
	public String 			namePackage;
	public IFile 			ecoreIFile;
	public String 			ecoreProjectPath;
	public KindsOfProject 	kindsOfProject;
	public boolean			useEMF = true;
	public boolean			useKMF = false;
	public boolean			useSLE = false;
	
	
	public NewK3ProjectWizardFields () {
		super();
		this.ecoreProject 			= false;
		this.genModelFile			= null;
		this.basePackage			= new ArrayList<String>();
		this.typeProject			= "None";
		this.projectName 			= "org.sample.k3project";
		this.namePackage 			= "sample";
		this.projectLocation 		= ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
		this.ecoreIFile				= null;
		this.ecoreProjectPath		= "";
		this.kindsOfProject			= KindsOfProject.PLUGIN;
	}
}
