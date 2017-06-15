/*******************************************************************************
 *  Copyright (c) 2000, 2007 IBM Corporation and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package fr.inria.diverse.k3.ui.templates.k3al;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.BundleException;

import org.eclipse.gemoc.commons.eclipse.pde.classpath.ClasspathHelper;
import org.eclipse.gemoc.commons.eclipse.pde.manifest.ManifestChanger;
import org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde.ui.BaseProjectWizardFields;
import org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde.ui.templates.AbstractStringWithButtonOption;
import org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde.ui.templates.NewProjectTemplateWizard;
import org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde.ui.templates.TemplateOption;
import fr.inria.diverse.k3.ui.templates.Activator;
import fr.inria.diverse.k3.ui.templates.IHelpContextIds;
import fr.inria.diverse.k3.ui.templates.K3TemplateMessages;
import fr.inria.diverse.k3.ui.templates.K3TemplateSection;
import fr.inria.diverse.k3.ui.wizards.pages.NewK3ProjectWizardFields;
import fr.inria.diverse.k3.ui.wizards.pages.NewK3ProjectWizardFields.KindsOfProject;

public class UserEcoreBasicAspectTemplate extends K3TemplateSection {
	public static final String KEY_ASPECTCLASS_POSTFIX = "aspectClassPostfix"; //$NON-NLS-1$
	public static final String ASPECTCLASS_POSTFIX = "Aspect"; //$NON-NLS-1$
	public static final String KEY_ASPECTBASEPACKAGE_NAME = "aspectBasePackage"; //$NON-NLS-1$
	public static final String ASPECTBASEPACKAGE_NAME = ""; //$NON-NLS-1$
	public static final String KEY_ASPECTPACKAGE_POSTFIX = "aspectPackagePostfix"; //$NON-NLS-1$
	public static final String ASPECTPACKAGE_POSTFIX = ".aspects"; //$NON-NLS-1$
	public static final String KEY_ECOREBASEPACKAGE_NAME = "ecoreBasePackage"; //$NON-NLS-1$
	public static final String ECOREBASEPACKAGE_NAME = ""; //$NON-NLS-1$
	public static final String KEY_ASPECTFILE_NAME = "aspectFileName"; //$NON-NLS-1$
	public static final String ASPECTFILE_NAME = "MyAspects"; //$NON-NLS-1$
	public static final String KEY_ECOREFILE_PATH = "ecoreFilePath"; //$NON-NLS-1$
	
	protected static final List<String> FILE_EXTENSIONS = Arrays.asList(new String [] { "ecore" });

	NewK3ProjectWizardFields _data;
	
	protected NewProjectTemplateWizard hostWizard;
	
	/**
	 * Constructor for HelloWorldTemplate.
	 */
	public UserEcoreBasicAspectTemplate(NewProjectTemplateWizard hostWizard) {
		setPageCount(1);
		createOptions();
		this.hostWizard = hostWizard;
	}

	/** 
	 * used to retrieve the template folder
	 */
	public String getSectionId() {
		return "userEcoreBasicAspect"; //$NON-NLS-1$
	}

	/*
	 * @see ITemplateSection#getNumberOfWorkUnits()
	 */
	public int getNumberOfWorkUnits() {
		return super.getNumberOfWorkUnits() + 1;
	}

	protected void createOptions() {
		//addOption(KEY_PACKAGE_NAME, K3TemplateMessages.UserEcoreBasicAspectTemplate_packageName, (String) null, 0);
		addBlankField(0).setLabel(K3TemplateMessages.UserEcoreBasicAspectTemplate_desc_complement_part1);
		addBlankField(0).setLabel(K3TemplateMessages.UserEcoreBasicAspectTemplate_desc_complement_part2);
		addOption(KEY_ASPECTBASEPACKAGE_NAME, K3TemplateMessages.UserEcoreBasicAspectTemplate_aspectBasePackageName,
				K3TemplateMessages.UserEcoreBasicAspectTemplate_aspectBasePackageNameToolTip,
				ASPECTBASEPACKAGE_NAME, 0).setRequired(false);
		addOption(KEY_ASPECTPACKAGE_POSTFIX, K3TemplateMessages.UserEcoreBasicAspectTemplate_aspectPackagePostfix, 
				K3TemplateMessages.UserEcoreBasicAspectTemplate_aspectPackagePostfixToolTip,
				ASPECTPACKAGE_POSTFIX, 0).setRequired(false);
		addOption(KEY_ASPECTFILE_NAME, K3TemplateMessages.UserEcoreBasicAspectTemplate_aspectFileName, 
				K3TemplateMessages.UserEcoreBasicAspectTemplate_aspectFileNameToolTip,
				ASPECTFILE_NAME, 0);
		addOption(KEY_ASPECTCLASS_POSTFIX, K3TemplateMessages.UserEcoreBasicAspectTemplate_aspectClassPostfix, 
				K3TemplateMessages.UserEcoreBasicAspectTemplate_aspectClassPostfixToolTip, 
				ASPECTCLASS_POSTFIX, 0);
		addBlankField(0);
		addOption(KEY_ECOREBASEPACKAGE_NAME, K3TemplateMessages.UserEcoreBasicAspectTemplate_ecoreBasePackageName,
				K3TemplateMessages.UserEcoreBasicAspectTemplate_ecoreBasePackageNameToolTip,
				null, 0).setRequired(false);
		//addOption(KEY_ECOREFILE_LOCATION, K3TemplateMessages.UserEcoreBasicAspectTemplate_ecoreFileLocation, (String) null, 0);
		TemplateOption ecoreLocationOption  = new AbstractStringWithButtonOption(this, KEY_ECOREFILE_PATH, K3TemplateMessages.UserEcoreBasicAspectTemplate_ecoreFilePath) {
			@Override
			public String doSelectButton() {
				final IWorkbenchWindow workbenchWindow = PlatformUI
						.getWorkbench().getActiveWorkbenchWindow();
				Object selection = null;
				if (workbenchWindow.getSelectionService().getSelection() instanceof IStructuredSelection) {
					selection = ((IStructuredSelection) workbenchWindow
							.getSelectionService().getSelection())
							.getFirstElement();
				}
				final IFile selectedEcoreFile = selection != null
						&& selection instanceof IFile
						&& FILE_EXTENSIONS.contains(((IFile) selection)
								.getFileExtension()) ? (IFile) selection : null;
				ViewerFilter viewerFilter = new ViewerFilter() {
					@Override
					public boolean select(Viewer viewer, Object parentElement,
							Object element) {
						if (element instanceof IFile) {
							IFile file = (IFile) element;
							return FILE_EXTENSIONS.contains(file
									.getFileExtension())
									&& (selectedEcoreFile == null || !selectedEcoreFile
											.getFullPath().equals(
													file.getFullPath()));
						}
						return true;
					}
				};
				final IFile[] files = WorkspaceResourceDialog
						.openFileSelection(workbenchWindow.getShell(), null,
								"Select ecore", true, null,
								Collections.singletonList(viewerFilter));
				if (files.length > 0) {
					UserEcoreBasicAspectTemplate.this._data.ecoreIFile = files[0];
					//txtPathEcore.setText(files[i].getFullPath().toOSString());
					//UserEcoreBasicAspectTemplate.this._data.ecoreProjectPath = files[0].getProject().getFullPath().toOSString();
					return files[0].getFullPath().toOSString();
				}

				return null;
			}
		};
		registerOption(ecoreLocationOption, (String) null, 0);
	}

	public void addPages(Wizard wizard) {
		WizardPage page = createPage(0, IHelpContextIds.TEMPLATE_ECORE_ASPECT);
		page.setTitle(K3TemplateMessages.UserEcoreBasicAspectTemplate_title);
		page.setDescription(K3TemplateMessages.UserEcoreBasicAspectTemplate_desc);
		wizard.addPage(page);
		markPagesAdded();
	}

	public boolean isDependentOnParentWizard() {
		return true;
	}

	protected void initializeFields(BaseProjectWizardFields data) {
		// save reference to content for later use 
		_data = (NewK3ProjectWizardFields)data;
		// initialize values according to previous pages content or o
		//String packageName = getFormattedPackageName(_data.projectName);
		//initializeOption(KEY_PACKAGE_NAME, packageName);
		if(_data.ecoreIFile != null){
			initializeOption(KEY_ECOREFILE_PATH,_data.ecoreIFile.getFullPath().toOSString());
		}
		if(_data.basePackage != null){
			initializeOption(KEY_ECOREBASEPACKAGE_NAME,_data.basePackage);
		} 
	}


	public String getUsedExtensionPoint() {
		return "org.eclipse.ui.actionSets"; //$NON-NLS-1$
	}


	/* (non-Javadoc)
	 * @see org.eclipse.pde.ui.templates.ITemplateSection#getFoldersToInclude()
	 */
	public String[] getNewFiles() {
		return new String[] {"icons/"}; //$NON-NLS-1$
	}

	
	
	
	/* (non-Javadoc)
	 * @see fr.inria.diverse.k3.ui.templates.K3TemplateSection#generateFiles(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected void generateFiles(IProgressMonitor monitor) throws CoreException {		
		updateDataFromOptions();
		super.generateFiles(monitor);
		
		k3.language.aspectgenerator.Context aspectGeneratorContext = k3.language.aspectgenerator.AspectGenerator.aspectGenerate (
				_data.projectLocation,
				_data.projectName,
				"File:///"+_data.ecoreIFile.getLocation().toOSString(),  
				(String) this.getValue(KEY_ECOREBASEPACKAGE_NAME), // ecoreBasePackage (String) this.getValue(KEY_PACKAGE_NAME)
				(String) this.getValue(KEY_ASPECTBASEPACKAGE_NAME), // aspectBasePackage
				(String) this.getValue(KEY_ASPECTPACKAGE_POSTFIX), // aspectPackageSuffix
				null, //_data.operationName,
				new ArrayList<String>(),//_data.operationParams
				new ArrayList<String>() //_data.listNewClass, (no parameters so no need to create empty classes)
				);
		
		// now also fix the project configuration
		
		// If this is a plugin
		if(_data.kindsOfProject == KindsOfProject.PLUGIN){
			ManifestChanger manifestChanger;
			try {
				manifestChanger = new ManifestChanger(project.getFile("META-INF/MANIFEST.MF"));
				manifestChanger.addPluginDependency(_data.ecoreIFile.getProject().getName(), "0.0.0", false, true);
				for(String createdPackage : aspectGeneratorContext.createdPackages){
					manifestChanger.addExportPackage(createdPackage);
				}
				manifestChanger.commit();
			} catch (IOException | BundleException e) {
				Activator.logErrorMessage(e.getMessage(), e);
			}
		}
		else if(_data.kindsOfProject == KindsOfProject.STANDALONE){
			// must update the build path
			ClasspathHelper.addEntry(project, JavaCore.newProjectEntry(_data.ecoreIFile.getProject().getFullPath()), monitor);
		}
		else if(_data.kindsOfProject == KindsOfProject.MAVEN){

			ClasspathHelper.addEntry(project, JavaCore.newProjectEntry(_data.ecoreIFile.getProject().getFullPath()), monitor);
			// TODO must update the pom.xml
		}

		
				 
	}

	
	public void updateDataFromOptions() {
		if(_data == null) initializeFields(hostWizard.getData());
		// for convenience, copy the appropriate values from the wizard options into the data 
		//_data.namePackage = (String) this.getValue(KEY_PACKAGE_NAME);
		
	}
}
