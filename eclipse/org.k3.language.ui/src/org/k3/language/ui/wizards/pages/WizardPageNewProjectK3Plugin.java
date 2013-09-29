package org.k3.language.ui.wizards.pages;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.mapping.ecore2ecore.presentation.Ecore2EcoreEditorPlugin;
import org.k3.language.ui.tools.Context;
import org.k3.language.ui.tools.ErrorMessage;

public class WizardPageNewProjectK3Plugin extends WizardPage {

	protected Context		context;
	
	protected static final List<String> FILE_EXTENSIONS = Arrays.asList(new String [] { "ecore" });
	protected ErrorMessage[] errorMessage;
	protected boolean 	enableNext;
	
	protected Composite 	container;
	protected Label 		lblProjectName;
	protected Label 		lblTemplateEcore;
	protected Text 			txtProjectName;
	protected Text 			txtProjectLocation;
	protected Text 			txtPathEcore;
	protected Button		btnBrowseLocation;
	protected Button 		btnBrowseEcore;
	protected Button 		btnCheckLocation;
	protected Button 		btnCheckEcore;
	protected Button 		btnStandAlone;
	protected Button 		btnPlugIn;
	protected Button 		btnMaven;
	protected Combo 		combo;
	protected Group 		grpKindOfProject;
	protected Group 		grpFeatures;

	public WizardPageNewProjectK3Plugin(Context context){
		super("wizardPage");
		this.context = context;
		setTitle("New Kermeta project");
		setDescription("This wizard creates a new kermeta project");
		this.errorMessage =  new ErrorMessage[2];
		this.errorMessage[0] = new ErrorMessage("A project with this name already exist.", false);
		this.errorMessage[1] = new ErrorMessage("There is not ecore file selected.", false);
	}
	
	/**
	 * Constructor for KermetaNewWizardDashboard.
	 * @param pageName
	 */
	public WizardPageNewProjectK3Plugin(ISelection selection) {
		super("wizardPage");
		setTitle("New Kermeta project");
		setDescription("This wizard creates a new kermeta project");
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NULL);
		
		//-----------------------------------------------

		grpKindOfProject = new Group(container, SWT.NONE);
		grpKindOfProject.setText("Kinds of project");
		grpKindOfProject.setBounds(10, 1, 430, 52);
		
		btnStandAlone = new Button(grpKindOfProject, SWT.RADIO);
		btnStandAlone.setBounds(20, 25, 90, 16);
		btnStandAlone.setText("Stand alone");
		btnStandAlone.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				updateKindsOfProject(Context.KindsOfProject.STANDALONE);
			}
		});
		
		btnPlugIn = new Button(grpKindOfProject, SWT.RADIO);
		btnPlugIn.setBounds(160, 25, 90, 16);
		btnPlugIn.setText("Plug-in");
		btnPlugIn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				updateKindsOfProject(Context.KindsOfProject.PLUGIN);
			}
		});
		
		btnMaven = new Button(grpKindOfProject, SWT.RADIO);
		btnMaven.setBounds(299, 25, 90, 16);
		btnMaven.setText("Maven");
		btnMaven.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				updateKindsOfProject(Context.KindsOfProject.MAVEN);
			}
		});

		//-----------------------------------------------
		
		grpFeatures = new Group(container, SWT.NONE);
		grpFeatures.setText("Features");
		grpFeatures.setBounds(10, 60, 430, 230);
		
		txtProjectName = new Text(grpFeatures, SWT.BORDER);
		txtProjectName.setBounds(93, 16, 255, 21);
		txtProjectName.setText(this.context.nameProject);
				
		txtProjectName.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent arg0) {
				if (existNameProject()) {
					activErrorMessage (0, true);
					setPageComplete(false);
				}
				else {
	    			  activErrorMessage(0 , false);
	    			  setPageComplete(true);					
				}
				updateNameProject(txtProjectName.getText());
			}
		});
		
		lblProjectName = new Label(grpFeatures, SWT.NONE);
		lblProjectName.setBounds(10, 19, 98, 15);
		lblProjectName.setText("project name :");
		
		//-----------------------------------------------
		
		btnBrowseLocation = new Button(grpFeatures, SWT.NONE);
		btnBrowseLocation.setBounds(349, 75, 75, 25);
		btnBrowseLocation.setText("Browse...");
		
		btnBrowseLocation.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				txtProjectLocation.setText(locationDialog());
			}
		});
		
		txtProjectLocation = new Text(grpFeatures, SWT.BORDER);
		txtProjectLocation.setBounds(10, 77, 333, 21);
		txtProjectLocation.setText(this.context.locationProject);
		
		btnCheckLocation = new Button(grpFeatures, SWT.CHECK);
		btnCheckLocation.setText("use default location");
		btnCheckLocation.setBounds(10, 55, 218, 16);
		btnCheckLocation.setSelection(true);
		
		btnCheckLocation.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (btnCheckLocation.getSelection()) {
					txtProjectLocation.setEnabled(false);
					btnBrowseLocation.setEnabled(false);
				}
				else {
					txtProjectLocation.setEnabled(true);
					btnBrowseLocation.setEnabled(true);
				} 
			}
		});
		
		//-----------------------------------------------
		
		btnCheckEcore = new Button(grpFeatures, SWT.CHECK);
		btnCheckEcore.setBounds(10, 117, 218, 16);
		btnCheckEcore.setText("referencing an existing ecore file");
		
		btnCheckEcore.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (btnCheckEcore.getSelection()) {
					updateEcoreProject(true);
					btnBrowseEcore.setEnabled(true);
					txtPathEcore.setEnabled(true);
					lblTemplateEcore.setEnabled(true);
					combo.setEnabled(true);
					if ( txtPathEcore.getText().isEmpty()) {
						activErrorMessage(1, true);
						setPageComplete(false);
					}
				}
				else {
					updateEcoreProject(false);
					btnBrowseEcore.setEnabled(false);
					txtPathEcore.setEnabled(false);
					lblTemplateEcore.setEnabled(false);
					combo.setEnabled(false);
					combo.select(0);
					updateNextButton (false);
					setPageComplete(true);
					activErrorMessage(1, false);
				} 
			}
		});
		
		txtPathEcore = new Text(grpFeatures, SWT.READ_ONLY | SWT.BORDER);
		txtPathEcore.setBounds(10, 139, 333, 21);
		
		btnBrowseEcore = new Button(grpFeatures, SWT.NONE);
		btnBrowseEcore.setBounds(349, 137, 75, 25);
		btnBrowseEcore.setText("Browse...");
		
		btnBrowseEcore.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (workspaceDialog() || !txtPathEcore.getText().isEmpty()) {
					setPageComplete(true);
				}
			}
		});
		
		lblTemplateEcore = new Label(grpFeatures, SWT.NONE);
		lblTemplateEcore.setText("use template on ecore file");
		lblTemplateEcore.setBounds(10, 176, 218, 15);
		
		combo = new Combo(grpFeatures, SWT.NONE);
		combo.setItems(new String[] {"None", "Aspect class from ecore file", "Customize"});
		combo.setBounds(10, 197, 333, 23);
		combo.select(0);
		
		combo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(combo.getSelectionIndex() == 2) {
					updateNextButton (true);
				}
				else {
					updateNextButton (false);
				}
			}
		});
		
		//-----------------------------------------------
		
		//initialization of enabled state of controls
		txtProjectLocation.setEnabled(false);
		btnBrowseLocation.setEnabled(false);
		btnBrowseEcore.setEnabled(false);
		txtPathEcore.setEnabled(false);
		lblTemplateEcore.setEnabled(false);
		combo.setEnabled(false);
		btnStandAlone.setSelection(true);
		
		//analysis of the existing of the project name
		if (existNameProject()) {
			activErrorMessage (0, true);
			setPageComplete(false);
		}
		else {
			  activErrorMessage(0 , false);
			  setPageComplete(true);					
		}
		
		// Required to avoid an error in the system
		setControl(container);
		setPageComplete(true);
	}
	
	protected String locationDialog () {
		DirectoryDialog dirDialog = new DirectoryDialog(new Shell());
	    dirDialog.setText("Select location directory");
	    this.context.locationProject = dirDialog.open();
	    return this.context.locationProject;
	}
	  
	protected boolean workspaceDialog() {
		boolean bResult = false;
		
		final IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		Object selection = ((IStructuredSelection)workbenchWindow.getSelectionService().getSelection()).getFirstElement();
		final IFile selectedEcoreFile = 
				selection instanceof IFile && FILE_EXTENSIONS.contains(((IFile)selection).getFileExtension()) ? (IFile)selection : null;
		
		ViewerFilter viewerFilter = new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				if (element instanceof IFile) {
					IFile file = (IFile)element;
					return FILE_EXTENSIONS.contains	(file.getFileExtension()) &&
													(selectedEcoreFile == null ||
													!selectedEcoreFile.getFullPath().equals(file.getFullPath()));
				}
				return true;
			}
		};
		
		final IFile[] files = WorkspaceResourceDialog.openFileSelection	(workbenchWindow.getShell(), 
																		null, 
																		Ecore2EcoreEditorPlugin.INSTANCE.getString("_UI_SelectOutputEcoreModels_label"), 
																		true, 
																		null, 
																		Collections.singletonList(viewerFilter));
		if (files.length > 0) {
			for (int i = 0; i < files.length; i++) {
				this.context.ecoreIFile = files[i];				
				txtPathEcore.setText(files[i].getFullPath().toOSString());
				this.context.ecoreProjectPath = files[i].getProject().getFullPath().toOSString();
				activErrorMessage (1, false);
			}
			bResult = true;
		}
		return bResult;
	}
	
	protected void activErrorMessage (int index, boolean bActiv) {
		this.errorMessage[index].setActive(bActiv);
		setMessageError();
	}
	
	protected boolean existNameProject () {
		boolean bFinder = false;
		int i = 0;
		while (bFinder == false && i < ResourcesPlugin.getWorkspace().getRoot().getProjects().length) {
  		  if (ResourcesPlugin.getWorkspace().getRoot().getProjects()[i].getName().contentEquals(txtProjectName.getText())) {
  			  bFinder = true;
  		  }
  		  i++;
		}
		return bFinder;
	}
	
	protected void setMessageError () {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < this.errorMessage.length; i++) {
			if (this.errorMessage[i].isActive()) {
				result.append(this.errorMessage[i].getMessageError() + "\n");
			}
		}
		if (result.length() > 0) {
			setErrorMessage(result.toString());
		}
		else {
			setErrorMessage(null);
		}
	}
	
	protected void updateEcoreProject (boolean bState) {
		this.context.ecoreProject = bState;
	}
	
	protected void updateNameProject (String nameProject) {
		this.context.nameProject = nameProject;
	}
	
	protected void updateNextButton (boolean enable) {
		enableNext = enable;
		canFlipToNextPage();
		getWizard().getContainer().updateButtons();
		this.context.indexTransfomation = this.combo.getSelectionIndex();
	}
	
	protected void updateKindsOfProject (Context.KindsOfProject kindsOfProject) {
		this.context.kindsOfProject = kindsOfProject;
	}
	
	@Override
	public boolean canFlipToNextPage () {
		return enableNext;
	}
	
	public void setEcoreLoaded(IFile ecoreFile) {
		btnCheckEcore.setSelection(true);
		btnCheckEcore.setEnabled(false);
		updateEcoreProject(true);
		btnBrowseEcore.setEnabled(false);
		txtPathEcore.setEnabled(false);
		lblTemplateEcore.setEnabled(true);
		combo.setEnabled(true);
		txtPathEcore.setText(ecoreFile.getFullPath().toOSString());
		
		this.context.ecoreIFile = ecoreFile;
		this.context.ecoreProjectPath = ecoreFile.getProject().getFullPath().toOSString();
	}
}
