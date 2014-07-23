package fr.inria.diverse.k3.ui.tools;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;

public class Context {
	
	public enum KindsOfProject { STANDALONE, PLUGIN, MAVEN }
	
	public boolean 			ecoreProject;
	public boolean 			bCreateEMFProject;
	public String 			genModelFile;
	public List<String>		basePackage;
	public String 			typeProject;
	public String 			nameProject;
	public String 			namePackage;
	public String	 		locationProject;
	public IFile 			ecoreIFile;
	public String 			ecoreProjectPath;
	public String 			operationName;
	public String 			operationReturnType;
	public Integer			indexTransfomation;
	public KindsOfProject 	kindsOfProject;
	public boolean			useEMF = true;
	public boolean			useKMF = false;
	public boolean			useSLE = false;
	
	public List<String> listNewClass;
	public List<String> operationParams; 
	
	public Context () {
		this.ecoreProject 			= false;
		this.bCreateEMFProject		= false;
		this.genModelFile			= null;
		this.basePackage			= new ArrayList<String>();
		this.typeProject			= "None";
		this.nameProject 			= "NewKermetaProject";
		this.namePackage 			= "sample";
		this.locationProject 		= ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
		this.ecoreIFile				= null;
		this.ecoreProjectPath		= "";
		this.operationName 			= "eval";
		this.operationReturnType 	= "";
		this.operationParams 		= new ArrayList<String>();
		this.listNewClass 			= new ArrayList<String>();
		this.indexTransfomation		= 0;
		this.kindsOfProject			= KindsOfProject.STANDALONE;
	}
}
