package org.k3.language.ui.wizards;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.k3.language.ui.Activator;
import org.k3.language.ui.tools.Context;
import org.k3.language.ui.tools.FileUtils;
import org.k3.language.ui.tools.GenerateGenModelCode;
import org.k3.language.ui.tools.ProjectDescriptor;
import org.k3.language.ui.tools.classpath.ManageClasspath;
import org.k3.language.ui.tools.classpath.ManageClasspathMaven;
import org.k3.language.ui.tools.classpath.ManageClasspathPlugin;
import org.k3.language.ui.tools.classpath.ManageClasspathStandAlone;
import org.k3.language.ui.wizards.pages.WizardPageCustomNewProjectK3Plugin;
import org.k3.language.ui.wizards.pages.WizardPageNewProjectK3Plugin;

public class WizardNewProjectK3Plugin extends Wizard implements INewWizard {

	protected Context context = new Context();
	
	WizardPageNewProjectK3Plugin 		projectPage			 = new WizardPageNewProjectK3Plugin(this.context);
	WizardPageCustomNewProjectK3Plugin 	projectPageCustom	 = new WizardPageCustomNewProjectK3Plugin(this.context);
	
	public WizardNewProjectK3Plugin() {
		
	}
	
	@Override
	public void addPages() {
		addPage(projectPage);
		addPage(projectPageCustom);
	}
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean performFinish() {	
		try {
			final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(this.context.nameProject);
			IWorkspaceRunnable operation = new IWorkspaceRunnable() {
				public void run(IProgressMonitor monitor) throws CoreException {
					project.create(monitor);
					project.open(monitor);
					addKermetaNatureToProject(project);
					IFile ecoreFile = context.ecoreIFile;
					if(ecoreFile != null){
						createProjectWithEcore(monitor);
					} else {
						createFolder("src/" + getContextNamePackage(), project, monitor);
						createDefaultKmt(project, monitor);
					}
					FileUtils.unZip(project, new ProjectDescriptor("fr.inria.diverse.k3.eclipse.language.ui","zips/resources.zip"));
					configureProject(project, monitor);
					//setClassPath(project, monitor);
					project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
				}
			};
			ResourcesPlugin.getWorkspace().run(operation, null);
			
		} catch (Exception exception) {
			Activator.logErrorMessage(exception.getMessage(), exception);
			return false;
		}
		return true;
	}
	
	@Override
	public boolean isHelpAvailable() {
		return true;
	}

	public void addKermetaNatureToProject(IProject project) {
		IProjectDescription description;
		try {
			
			description = project.getDescription();				
			if (!description.hasNature("org.eclipse.jdt.core.javanature")){
				addNature(description, "org.eclipse.jdt.core.javanature");
			}
			if(!description.hasNature("org.eclipse.xtext.ui.shared.xtextNature")){
				addNature(description, "org.eclipse.xtext.ui.shared.xtextNature");				
			}
			if((this.context.kindsOfProject == Context.KindsOfProject.PLUGIN) && (!description.hasNature("org.eclipse.pde.PluginNature"))){
				addNature(description, "org.eclipse.pde.PluginNature");				
			}
			if((this.context.kindsOfProject == Context.KindsOfProject.MAVEN) && (!description.hasNature("org.eclipse.m2e.core.maven2Nature"))){
				addNature(description, "org.eclipse.m2e.core.maven2Nature");			
			}
			project.setDescription(description, null);
		} catch (CoreException e) {
			Activator.logErrorMessage(e.getMessage(), e);
		}
	}
	
	public void configureProject(IProject project, IProgressMonitor monitor) {
		try {
			ManageClasspath classpath;
			IProjectDescription description;
			description = project.getDescription();
			addNature(description, "org.eclipse.jdt.core.javanature");
			addNature(description, "org.eclipse.xtext.ui.shared.xtextNature");
			switch (this.context.kindsOfProject)
			{
			case STANDALONE :
				classpath = new ManageClasspathStandAlone();
				classpath.setClasspath(project, monitor);
				break;
			case PLUGIN :
				classpath = new ManageClasspathPlugin();
				addNature(description, "org.eclipse.pde.PluginNature");
				configurePlugIn(project, monitor);
				classpath.setClasspath(project, monitor);
				break;
			case MAVEN :
				classpath = new ManageClasspathMaven();
				addNature(description, "org.eclipse.m2e.core.maven2Nature");
				createMavenFile(project, monitor, false);
				classpath.setClasspath(project, monitor);
				break;
			}
			project.setDescription(description, monitor);
		} catch (Exception e) {
			Activator.logErrorMessage(e.getMessage(), e);
		}
	}
	
	private void configurePlugIn (IProject project, IProgressMonitor monitor) {
		try {
			createManifestFile(project, monitor);
			createPlugInFile(project, monitor);
			createBuildProperties(project, monitor);			
		} catch (Exception e) {
			Activator.logErrorMessage(e.getMessage(), e);
		}
	}
	
	public static void addNature(IProjectDescription description, String nature) {
		String[] natures = description.getNatureIds();
		String[] newNatures = new String[natures.length + 1];
		System.arraycopy(natures, 0, newNatures, 0, natures.length);
		newNatures[natures.length] = nature;
		description.setNatureIds(newNatures);
	}
	
	private void createFolder(String path, IProject project, IProgressMonitor monitor) throws CoreException {
		String[] strings = path.split("/");
		IContainer currentContainer = project;
		for ( String s : strings ) {
			IFolder folder = currentContainer.getFolder( new Path(s) );
			folder.create(true, true, monitor);
			currentContainer = folder;
		}
	}
	
    private void createManifestFile(IProject project, IProgressMonitor monitor) throws Exception {	
	    IFolder metaInf = project.getFolder("META-INF");
	    metaInf.create(false, true, monitor);
	    
	    String path = "META-INF/MANIFEST.MF";
		IContainer currentContainer = project;
		IFile file = currentContainer.getFile(new Path(path));
		
		String contents = FileUtils.manifestMFPlugin(this.context.nameProject, new ArrayList<String>(), new ArrayList<String>());
		InputStream stream =  new ByteArrayInputStream(contents.getBytes());
		if (file.exists()) {
			file.setContents(stream, true, true, monitor);
		} else {
			file.create(stream, true, monitor);
		}
		stream.close();    
    }
	
    private void createBuildProperties(IProject project, IProgressMonitor monitor) throws Exception {	    
	    String path = "build.properties";
		IContainer currentContainer = project;
		IFile file = currentContainer.getFile(new Path(path));
		
		String contents = FileUtils.buildProperties();
		InputStream stream =  new ByteArrayInputStream(contents.getBytes());
		if (file.exists()) {
			file.setContents(stream, true, true, monitor);
		} else {
			file.create(stream, true, monitor);
		}
		stream.close();   
    }
    
	private void createPlugInFile(IProject project,IProgressMonitor monitor) throws Exception {
		String path = "/plugin.xml";
		IContainer currentContainer = project;
		IFile file = currentContainer.getFile(new Path(path));
		
		String contents = FileUtils.pluginbasisXML();
		InputStream stream =  new ByteArrayInputStream(contents.getBytes());
		if (file.exists()) {
			file.setContents(stream, true, true, monitor);
		} else {
			file.create(stream, true, monitor);
		}
		stream.close();
	}
	
	private void createMavenFile(IProject project,IProgressMonitor monitor, Boolean bEcoreProject) throws Exception {
		String path = "/pom.xml";
		IContainer currentContainer = project;
		IFile file = currentContainer.getFile(new Path(path));
		String contents = "";
		if(!bEcoreProject) {
			if(this.context.ecoreProject) {
				contents = FileUtils.pomXmlK3Ecore(this.context.nameProject, "GroupID", "ArtifactID", "0.0.1-SNAPSHOT", this.context.ecoreIFile.getName() + ".metamodel", this.context.ecoreIFile.getName() + ".metamodel", "0.0.1-SNAPSHOT");
			}else {
				contents = FileUtils.pomXmlK3(this.context.nameProject, "GroupID", "ArtifactID", "0.0.1-SNAPSHOT");
			}
		} else {
			contents = FileUtils.pomXmlMetamodel(this.context.ecoreIFile.getName() + ".metamodel", this.context.ecoreIFile.getName() + ".metamodel", this.context.ecoreIFile.getName() + ".metamodel", "0.0.1-SNAPSHOT");
		}
		InputStream stream =  new ByteArrayInputStream(contents.getBytes());
		if (file.exists()) {
			file.setContents(stream, true, true, monitor);
		} else {
			file.create(stream, true, monitor);
		}
		stream.close();
	}
		
	private void createDefaultKmt(IProject project,IProgressMonitor monitor) throws CoreException{
		String path = "src/" + this.context.namePackage + "/HelloEcore.xtend";
		IContainer currentContainer = project;
		IFile file = currentContainer.getFile(new Path(path));
		
		String contents = FileUtils.getFileTypeK3(this.context.namePackage, "HelloEcore");
		
		try {
			InputStream stream =  new ByteArrayInputStream(contents.getBytes());
			if (file.exists()) {
				file.setContents(stream, true, true, monitor);
			} else {
				file.create(stream, true, monitor);
			}
			stream.close();
		} catch (IOException e) {
			Activator.logErrorMessage(e.getMessage(), e);
		}
	}
	
	public Context getContext() {
		return context;
	}
	
	public boolean createProjectWithEcore(IProgressMonitor monitor) {
		boolean returnVal = true;
		if(this.context.bCreateEMFProject) {
			try {
				final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(this.context.ecoreIFile.getName() +".metamodel");
				project.create(monitor);
				project.open(monitor);
				Boolean tabNature[] = {true,false,true,true};
				addNatureToProject(project, tabNature);
				createFolder("src/", project, monitor);
				createFolder("model/", project, monitor);
				createEcoreFile(project, monitor);
				new GenerateGenModelCode().createGenModel(this.context.ecoreIFile.getLocation().toString(), this.context.ecoreIFile.getName() +".metamodel");
				configurePlugIn(project, null);
				try {
					createMavenFile(project, monitor, true);
				} catch (Exception e) {
					Activator.logErrorMessage(e.getMessage(), e);
				}
				//setClassPath(project, monitor);
				project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
				
			} catch (Exception exception) {
				Activator.logErrorMessage(exception.getMessage(), exception);
				returnVal = false;
			}
		}
		
		if (this.context.indexTransfomation != 0) {
			k3.language.aspectgenerator.AspectGenerator.aspectGenerate (
					"File:///"+this.context.locationProject,
					this.context.nameProject,
					this.context.operationName,
					"File:///"+this.context.ecoreIFile.getLocation().toOSString(), 
					this.context.listNewClass, 
					this.context.operationParams);			
		}
		
		return returnVal;
	}

	public void addNatureToProject(IProject project, Boolean tabNature[]) {
		IProjectDescription description;
		try {
			
			description = project.getDescription();
			if (!tabNature[0] && !description.hasNature("org.eclipse.jdt.core.javanature")){
				addNature(description, "org.eclipse.jdt.core.javanature");
			}
			if(!tabNature[1] && !description.hasNature("org.eclipse.xtext.ui.shared.xtextNature")){
				addNature(description, "org.eclipse.xtext.ui.shared.xtextNature");				
			}
			if(!tabNature[2] && (!description.hasNature("org.eclipse.pde.PluginNature"))){
				addNature(description, "org.eclipse.pde.PluginNature");				
			}
			if(!tabNature[3] && (!description.hasNature("org.eclipse.m2e.core.maven2Nature"))){
				addNature(description, "org.eclipse.m2e.core.maven2Nature");			
			}
			project.setDescription(description, null);
		} catch (CoreException e) {
			Activator.logErrorMessage(e.getMessage(), e);
		}
	}
	
	private void createEcoreFile(IProject project,IProgressMonitor monitor) throws Exception {
		String path = "model/"+ this.context.ecoreIFile.getName();
		IContainer currentContainer = project;
		IFile file = currentContainer.getFile(new Path(path));
		
		String contents = "";
		
		InputStream stream =  new ByteArrayInputStream(contents.getBytes());
		if (file.exists()) {
			file.setContents(stream, true, true, monitor);
		} else {
			file.create(stream, true, monitor);
		}
		stream.close();
		FileUtils.copyFile (new File(this.context.ecoreIFile.getLocationURI()), new File(file.getLocationURI()));
	}
	
	private String getContextNamePackage() {
		return this.context.namePackage;
	}

	public WizardPageNewProjectK3Plugin getPageProject() {
		return this.projectPage;
	}
}
