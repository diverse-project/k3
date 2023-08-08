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
package fr.inria.diverse.k3.ui.wizards;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.gemoc.commons.eclipse.core.resources.IFileUtils;
import org.eclipse.gemoc.commons.eclipse.core.resources.IFolderUtils;
import org.eclipse.gemoc.commons.eclipse.core.resources.ProjectDescriptor;
import org.eclipse.gemoc.commons.eclipse.pde.java.JavaNameHelper;
import org.eclipse.gemoc.commons.eclipse.pde.manifest.ManifestChanger;
import org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde.AbstractNewProjectWizardWithTemplates;
import org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde.ui.IProjectContentWizard;
import org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde.ui.ProjectTemplateApplicationOperation;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import fr.inria.diverse.k3.ui.Activator;
import fr.inria.diverse.k3.ui.tools.K3FileTemplates;
import fr.inria.diverse.k3.ui.tools.K3SampleFilesTemplates;
import fr.inria.diverse.k3.ui.tools.classpath.ManageClasspath;
import fr.inria.diverse.k3.ui.tools.classpath.ManageClasspathMaven;
import fr.inria.diverse.k3.ui.tools.classpath.ManageClasspathPlugin;
import fr.inria.diverse.k3.ui.tools.classpath.ManageClasspathStandAlone;
import fr.inria.diverse.k3.ui.wizards.pages.NewK3ProjectWizardFields;
import fr.inria.diverse.k3.ui.wizards.pages.NewK3ProjectWizardPage;

public class NewK3ProjectWizard extends AbstractNewProjectWizardWithTemplates implements INewWizard {

	protected NewK3ProjectWizardFields context;

	protected NewK3ProjectWizardPage projectPage;
	// WizardPageCustomNewProjectK3Plugin projectPageCustom = new
	// WizardPageCustomNewProjectK3Plugin(this.context);

	public NewK3ProjectWizard() {
		context = new NewK3ProjectWizardFields();
	}

	@Override
	public void addPages() {
		projectPage = new NewK3ProjectWizardPage(this.context);

		addPage(projectPage);
		addPage(getTemplateListSelectionPage(context));

	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean performFinish() {
		try {
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			final IProjectDescription description = workspace.newProjectDescription(this.context.projectName);
			if (!this.context.projectLocation.equals(workspace.getRoot().getLocation().toOSString()))
				description.setLocation(new Path(this.context.projectLocation));

			final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(this.context.projectName);
			IWorkspaceRunnable operation = new IWorkspaceRunnable() {
				public void run(IProgressMonitor monitor) throws CoreException {
					project.create(description, monitor);
					project.open(monitor);
					addKermetaNatureToProject(project);

					configureProject(project, monitor);

					// launch the template

					IProjectContentWizard contentWizard = templateSelectionPage.getSelectedWizard();
					try {
						getContainer().run(false, true,
								new ProjectTemplateApplicationOperation(context, project, contentWizard));
					} catch (InvocationTargetException e) {
						Activator.logErrorMessage(e.getMessage(), e);
					} catch (InterruptedException e) {
						Activator.logErrorMessage(e.getMessage(), e);
					}

					// setClassPath(project, monitor);
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
			if (!description.hasNature("fr.inria.diverse.k3.ui.k3Nature")) {
				addNature(description, "fr.inria.diverse.k3.ui.k3Nature");
			}
			if (!description.hasNature("org.eclipse.jdt.core.javanature")) {
				addNature(description, "org.eclipse.jdt.core.javanature");
			}
			if (!description.hasNature("org.eclipse.xtext.ui.shared.xtextNature")) {
				addNature(description, "org.eclipse.xtext.ui.shared.xtextNature");
			}
			if ((this.context.kindsOfProject == NewK3ProjectWizardFields.KindsOfProject.PLUGIN)
					&& (!description.hasNature("org.eclipse.pde.PluginNature"))) {
				addNature(description, "org.eclipse.pde.PluginNature");
			}
			if ((this.context.kindsOfProject == NewK3ProjectWizardFields.KindsOfProject.MAVEN)
					&& (!description.hasNature("org.eclipse.m2e.core.maven2Nature"))) {
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
			addNature(description, "fr.inria.diverse.k3.ui.k3Nature");
			addNature(description, "org.eclipse.jdt.core.javanature");
			addNature(description, "org.eclipse.xtext.ui.shared.xtextNature");
			String sourceFolderName;
			switch (this.context.kindsOfProject) {
			case MAVEN:
				sourceFolderName = "src/main/java/";
				break;
			default:
				sourceFolderName = "src/";
			}
			createSettingsResourcePrefs(project, monitor);

			String folderName = sourceFolderName + getContextNamePackage().replaceAll("\\.", "/");
			if (!project.getFolder(folderName).exists()) {
				IFolderUtils.createFolder(folderName, project, monitor);
			}
			/*
			 * if(context.ecoreIFile != null){ createProjectWithEcore(monitor,
			 * sourceFolderName); } else { if(context.useEMF){
			 * createMiniEcoreAspectSampleXtend(project, monitor, sourceFolderName); } else{
			 * createMiniAspectSampleXtend(project, monitor, sourceFolderName); } }
			 */
			switch (this.context.kindsOfProject) {
			case STANDALONE:
				IFileUtils.unZip(project, new ProjectDescriptor("fr.inria.diverse.k3.ui", "zips/k3.zip"));
				IFileUtils.unZip(project, new ProjectDescriptor("fr.inria.diverse.k3.ui", "zips/xtend.zip"));
				if (context.useEMF)
					IFileUtils.unZip(project, new ProjectDescriptor("fr.inria.diverse.k3.ui", "zips/emf.zip"));
				classpath = new ManageClasspathStandAlone("lib");
				classpath.setClasspath(project, monitor);
				break;
			case PLUGIN:
				classpath = new ManageClasspathPlugin(this.context.useSLE);
				addNature(description, "org.eclipse.pde.PluginNature");
				configurePluginProject(project, monitor);
				classpath.setClasspath(project, monitor);

				if (context.useSLE) {
					classpath.setClasspath(project, monitor);
				}

				break;
			case MAVEN:
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

	private void configurePluginProject(IProject project, IProgressMonitor monitor) {
		try {
			createManifestFile(project, monitor);
			ManifestChanger manifestChanger = new ManifestChanger(project.getFile("META-INF/MANIFEST.MF"));

			manifestChanger.addPluginDependency("org.eclipse.xtend.lib", "2.6.0", false, true);
			manifestChanger.addPluginDependency("org.eclipse.xtext.xbase.lib", "2.6.0", false, true);
			manifestChanger.addPluginDependency("com.google.guava", "0.0.0", false, true);
			if (context.useEMF) {
				manifestChanger.addPluginDependency("org.eclipse.emf.ecore.xmi", "2.8.0", true, true);
				manifestChanger.addPluginDependency("org.eclipse.emf.ecore", "2.8.0", true, true);
				manifestChanger.addPluginDependency("org.eclipse.emf.common", "2.8.0", true, true);
				if (context.ecoreIFile != null) {
					manifestChanger.addPluginDependency(context.ecoreIFile.getProject().getName(), "0.0.0", true, true);
				}
				if (context.useSLE) {
					manifestChanger.addPluginDependency("fr.inria.diverse.k3.sle.lib", "3.0.0", true, true);
				}
			}
			manifestChanger.commit();
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

	private void createManifestFile(IProject project, IProgressMonitor monitor) throws Exception {
		IFolder metaInf = project.getFolder("META-INF");
		metaInf.create(false, true, monitor);

		String path = "META-INF/MANIFEST.MF";
		IContainer currentContainer = project;
		IFile file = currentContainer.getFile(new Path(path));

		String contents = K3FileTemplates.manifestMFPlugin(this.context.projectName, new ArrayList<String>(),
				new ArrayList<String>());
		IFileUtils.writeInFile(file, contents, monitor);
	}

	private void createBuildProperties(IProject project, IProgressMonitor monitor) throws Exception {
		String path = "build.properties";
		IContainer currentContainer = project;
		IFile file = currentContainer.getFile(new Path(path));

		String contents = K3SampleFilesTemplates.buildProperties();
		IFileUtils.writeInFile(file, contents, monitor);
	}

	private void createSettingsResourcePrefs(IProject project, IProgressMonitor monitor) throws Exception {
		IFolder settings = project.getFolder(".settings");
		if (!settings.exists()) {
			settings.create(false, true, monitor);
		}

		String path = ".settings/org.eclipse.core.resources.prefs";
		IContainer currentContainer = project;
		IFile file = currentContainer.getFile(new Path(path));
		if (!file.exists()) {
			String contents = K3SampleFilesTemplates.eclipseResourcePrefs();
			IFileUtils.writeInFile(file, contents, monitor);
		}
	}

	private void createPlugInFile(IProject project, IProgressMonitor monitor) throws Exception {
		String path = "/plugin.xml";
		IContainer currentContainer = project;
		IFile file = currentContainer.getFile(new Path(path));

		String contents = K3FileTemplates.pluginbasisXML();
		IFileUtils.writeInFile(file, contents, monitor);
	}

	private void createMavenFile(IProject project, IProgressMonitor monitor, Boolean bEcoreProject) throws Exception {
		String path = "/pom.xml";
		IContainer currentContainer = project;
		IFile file = currentContainer.getFile(new Path(path));
		String contents = "";
		if (!bEcoreProject) {
			if (this.context.ecoreIFile != null) {
				contents = K3SampleFilesTemplates.pomXmlK3Ecore(this.context.projectName, "GroupID", "ArtifactID",
						"0.0.1-SNAPSHOT", this.context.ecoreIFile.getName() + ".metamodel",
						this.context.ecoreIFile.getName() + ".metamodel", "0.0.1-SNAPSHOT");
			} else {
				contents = K3SampleFilesTemplates.pomXmlK3(this.context.projectName, "GroupID", "ArtifactID",
						"0.0.1-SNAPSHOT");
			}
		} else {
			contents = K3SampleFilesTemplates.pomXmlMetamodel(this.context.ecoreIFile.getName() + ".metamodel",
					this.context.ecoreIFile.getName() + ".metamodel", this.context.ecoreIFile.getName() + ".metamodel",
					"0.0.1-SNAPSHOT");
		}
		IFileUtils.writeInFile(file, contents, monitor);
	}

	/*
	 * private void createDefaultKmt(IProject project,IProgressMonitor monitor,
	 * String sourceFolderName) throws CoreException{ String path = sourceFolderName
	 * + this.context.namePackage + "/HelloEcore.xtend"; IContainer currentContainer
	 * = project; IFile file = currentContainer.getFile(new Path(path));
	 * 
	 * String contents =
	 * K3SampleFilesTemplates.getFileTypeK3(this.context.namePackage, "HelloEcore");
	 * 
	 * FileUtils.writeInFile(file, contents, monitor); }
	 * 
	 * private void createMiniEcoreAspectSampleXtend(IProject
	 * project,IProgressMonitor monitor, String sourceFolderName) throws
	 * CoreException{ IContainer currentContainer = project; IFile file =
	 * currentContainer.getFile(new Path(sourceFolderName + this.context.namePackage
	 * + "/SampleEcoreMain.xtend"));
	 * 
	 * String contents =
	 * K3SampleFilesTemplates.get_MiniAspectSample_SampleEcoreMain_xtend(this.
	 * context.namePackage); FileUtils.writeInFile(file, contents, monitor);
	 * 
	 * // second file of the sample file = currentContainer.getFile(new
	 * Path(sourceFolderName + this.context.namePackage +
	 * "/SampleEcoreAspect.xtend"));
	 * 
	 * contents =
	 * K3SampleFilesTemplates.get_MiniAspectSample_SampleAnnotateEcoreAspect_xtend(
	 * this.context.namePackage); FileUtils.writeInFile(file, contents, monitor);
	 * 
	 * }
	 * 
	 * private void createMiniAspectSampleXtend(IProject project,IProgressMonitor
	 * monitor, String sourceFolderName) throws CoreException{ IContainer
	 * currentContainer = project; IFile file = currentContainer.getFile(new
	 * Path(sourceFolderName + this.context.namePackage + "/SampleMain.xtend"));
	 * 
	 * String contents =
	 * K3SampleFilesTemplates.get_MiniAspectSample_SampleMain_xtend(this.context.
	 * namePackage); FileUtils.writeInFile(file, contents, monitor);
	 * 
	 * // second file of the sample file = currentContainer.getFile(new
	 * Path(sourceFolderName + this.context.namePackage +
	 * "/SampleXMLFileAspect.xtend"));
	 * 
	 * contents =
	 * K3SampleFilesTemplates.get_MiniAspectSample_SampleXMLFileAspect_xtend(this.
	 * context.namePackage); FileUtils.writeInFile(file, contents, monitor);
	 * 
	 * }
	 * 
	 * private void createK3SLEStub(IProject project,IProgressMonitor monitor,
	 * String sourceFolderName) throws CoreException{ String mmName =
	 * this.context.ecoreIFile.getName().substring(0,
	 * this.context.ecoreIFile.getName().indexOf(".")); String ecorePlatformPath =
	 * this.context.ecoreIFile.toString().replaceFirst("L", "platform:/resource");
	 * String path = sourceFolderName + this.context.namePackage + "/" + mmName +
	 * ".k3sle"; IContainer currentContainer = project; IFile file =
	 * currentContainer.getFile(new Path(path));
	 * 
	 * String contents =
	 * K3SampleFilesTemplates.getK3SLEStub(this.context.namePackage,
	 * ecorePlatformPath, mmName);
	 * 
	 * FileUtils.writeInFile(file, contents, monitor); }
	 */
	public NewK3ProjectWizardFields getContext() {
		return context;
	}

	/*
	 * public boolean createProjectWithEcore(IProgressMonitor monitor, String
	 * sourceFolderName) { boolean returnVal = true;
	 * 
	 * updateBasePackageFromGenModel(this.context);
	 * 
	 * 
	 * if (this.context.indexTransfomation != 0) {
	 * k3.language.aspectgenerator.AspectGenerator.aspectGenerate (
	 * context.basePackage, "File:///"+this.context.locationProject,
	 * this.context.nameProject, this.context.operationName,
	 * "File:///"+this.context.ecoreIFile.getLocation().toOSString(),
	 * this.context.listNewClass, this.context.operationParams); }
	 * 
	 * if (this.context.useSLE){ try { final IProject project =
	 * ResourcesPlugin.getWorkspace().getRoot().getProject(this.context.nameProject)
	 * ; IFolderUtils.createFolder(sourceFolderName + getContextNamePackage(),
	 * project, monitor); createK3SLEStub(project, monitor, sourceFolderName); }
	 * catch (CoreException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } }
	 * 
	 * return returnVal; }
	 */
	public void addNatureToProject(IProject project, Boolean tabNature[]) {
		IProjectDescription description;
		try {

			description = project.getDescription();
			if (!tabNature[0] && !description.hasNature("fr.inria.diverse.k3.ui.k3Nature")) {
				addNature(description, "fr.inria.diverse.k3.ui.k3Nature");
			}
			if (!tabNature[1] && !description.hasNature("org.eclipse.jdt.core.javanature")) {
				addNature(description, "org.eclipse.jdt.core.javanature");
			}
			if (!tabNature[2] && !description.hasNature("org.eclipse.xtext.ui.shared.xtextNature")) {
				addNature(description, "org.eclipse.xtext.ui.shared.xtextNature");
			}
			if (!tabNature[3] && (!description.hasNature("org.eclipse.pde.PluginNature"))) {
				addNature(description, "org.eclipse.pde.PluginNature");
			}
			if (!tabNature[4] && (!description.hasNature("org.eclipse.m2e.core.maven2Nature"))) {
				addNature(description, "org.eclipse.m2e.core.maven2Nature");
			}
			project.setDescription(description, null);
		} catch (CoreException e) {
			Activator.logErrorMessage(e.getMessage(), e);
		}
	}

	private String getContextNamePackage() {
		if (this.context.namePackage == null || this.context.namePackage.isEmpty()) {
			// create a name from the project name
			return JavaNameHelper.getFormattedPackageName(context.projectName);
		} else {
			return this.context.namePackage;
		}
	}

	public NewK3ProjectWizardPage getPageProject() {
		return this.projectPage;
	}

	/*
	 * public void updateBasePackageFromGenModel(NewK3ProjectWizardFields context) {
	 * GenerateGenModelCode genmodel = new GenerateGenModelCode(); String
	 * basePackage; if(genmodel.existGenModel(context)) { basePackage =
	 * genmodel.getBasePackage(context.genModelFile); if (basePackage != null)
	 * context.basePackage = new ToolsString().generateListPackage(basePackage,
	 * (byte)46); } }
	 */

	@Override
	public String getTargetPluginId() {
		return Activator.PLUGIN_ID;
	}

}
