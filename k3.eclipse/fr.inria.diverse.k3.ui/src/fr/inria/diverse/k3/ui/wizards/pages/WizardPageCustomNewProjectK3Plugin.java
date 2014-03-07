package fr.inria.diverse.k3.ui.wizards.pages;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import fr.inria.diverse.k3.ui.tools.Context;

public class WizardPageCustomNewProjectK3Plugin extends WizardPage {
	
	private Context		context;
	
	protected Composite 	container;
	protected Group 		grpOperationFeatures;
	protected Group 		grpParameterFeature;
	protected Group 		grpListOfParameters;
	protected Label 		lblOperationName;
	protected Label 		lblReturnType;
	protected Label 		lblParameterName;
	protected Label 		lblParameterType;
	protected Text 			txtOperationName;
	protected Text 			txtReturnType;
	protected Text 			txtParameterName;
	protected Text 			txtParameterType;
	protected Button 		btnCheckCreateClass;
	protected Table			table;
	protected TableColumn	colClassCreation;
	protected TableColumn	colParamName;
	protected TableColumn	colParamType;
	protected TableItem 	item;
	protected Button 		btnAdd;
	protected Button 		btnRemove;
	protected String[] 		tabItem =  {"yes", "context", "Context"};
	
	public WizardPageCustomNewProjectK3Plugin (Context context){
		super("wizardPage");
		this.context = context;
		setTitle("Custom Operation for New Kermeta project");
		setDescription("This wizard configures the operation which has to add at the aspect files at the new kermeta project");
		setPageComplete(true);
	}
	
	/**
	 * Constructor for KermetaNewWizardDashboard.
	 * @param pageName
	 */
	public WizardPageCustomNewProjectK3Plugin (ISelection selection) {
		super("wizardPage");
		setTitle("Custom Operation for New Kermeta project");
		setDescription("This wizard configures the operation which has to add at the aspect files at the new kermeta project");
	}
	
	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NULL);
		container.setLayout(new FillLayout(SWT.VERTICAL));
		
		//-----------------------------------------------
		
		grpOperationFeatures = new Group(container, SWT.NONE);
		grpOperationFeatures.setText("Operation features");
		grpOperationFeatures.setLayout(new GridLayout(2, false));
		
		lblOperationName = new Label(grpOperationFeatures, SWT.NONE);
		lblOperationName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblOperationName.setText("Operation name");
		
		txtOperationName = new Text(grpOperationFeatures, SWT.BORDER);
		txtOperationName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txtOperationName.setText("customize");
		
		txtOperationName.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent arg0) {
				
				updateNameOperation(txtOperationName.getText());
			}
		});
		
		lblReturnType = new Label(grpOperationFeatures, SWT.NONE);
		lblReturnType.setText("Return type ");
		
		txtReturnType = new Text(grpOperationFeatures, SWT.BORDER);
		txtReturnType.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txtReturnType.setText("void");
		
		txtReturnType.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent arg0) {
				
				updateReturnType(txtReturnType.getText());
			}
		});
		
		grpParameterFeature = new Group(container, SWT.NONE);
		grpParameterFeature.setText("Parameter features");
		grpParameterFeature.setLayout(new GridLayout(2, false));
		
		lblParameterName = new Label(grpParameterFeature, SWT.NONE);
		lblParameterName.setText("Parameter name");
		
		txtParameterName = new Text(grpParameterFeature, SWT.BORDER);
		txtParameterName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		lblParameterType = new Label(grpParameterFeature, SWT.NONE);
		lblParameterType.setText("Parameter type");
		
		txtParameterType = new Text(grpParameterFeature, SWT.BORDER);
		txtParameterType.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		btnCheckCreateClass = new Button(grpParameterFeature, SWT.CHECK);
		btnCheckCreateClass.setText("create class for ");
		
		btnAdd = new Button(grpParameterFeature, SWT.NONE);
		btnAdd.setText("Add");
		
		btnAdd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				addParameter();
			}
		});
		
		grpListOfParameters = new Group(container, SWT.NONE);
		grpListOfParameters.setText("List of parameters");
		grpListOfParameters.setLayout(new RowLayout(SWT.HORIZONTAL));
		
		table = new Table(grpListOfParameters, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		table.setLayoutData(new RowData(436, 101));
		
		colClassCreation = new TableColumn(table, SWT.LEFT);
		colClassCreation.setText("new class for");
		colClassCreation.setWidth(100);
		colParamName = new TableColumn(table, SWT.LEFT);
		colParamName.setText("parameter name");
		colParamName.setWidth(100);
		colParamType = new TableColumn(table, SWT.LEFT);
		colParamType.setText("parameter type");
		colParamType.setWidth(100);
		
		item = new TableItem(table, SWT.LEFT);
		item.setText(tabItem);

		registerParameter (tabItem[1], tabItem[2]);
		registerNewClass(tabItem[2]);
		
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		btnRemove = new Button(grpListOfParameters, SWT.NONE);
		btnRemove.setText("Remove");
		
		btnRemove.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				removeParameter();
			}
		});
		
		// Required to avoid an error in the system
		setControl(container);
		setPageComplete(true);
	}
	
	protected void addParameter () {
		if (!txtParameterName.getText().isEmpty() && !txtParameterType.getText().isEmpty() && !existParameter()) {
			TableItem 	newItem 		= new TableItem(table, SWT.LEFT);
			String [] 	tabNewItem 		= new String[3];
			String 		sCreateClass 	= "No";
			
			if (btnCheckCreateClass.getSelection()) {
				sCreateClass = "Yes";
				registerNewClass (txtParameterType.getText());
			}
			tabNewItem[0] = sCreateClass;
			tabNewItem[1] = txtParameterName.getText();
			tabNewItem[2] = txtParameterType.getText();
			newItem.setText(tabNewItem);
			registerParameter (txtParameterName.getText(), txtParameterType.getText());
		}
		table.redraw();
		this.btnCheckCreateClass.setSelection(false);
		this.txtParameterName.setText("");
		this.txtParameterType.setText("");
	}
	
	protected void removeParameter () {
		if (table.getSelectionIndices().length > 0) {
			for(int i = table.getSelectionIndices().length - 1; i >= 0; i--) {
				unregisterParameter(table.getSelectionIndices()[i]); 
				if (table.getItems()[table.getSelectionIndices()[i]].getText(0) == "yes") {
					unregisterNewClass(table.getItems()[table.getSelectionIndices()[i]].getText(2));
				}
			}
			
	        table.remove(table.getSelectionIndices());
	        table.redraw();
        }
	}
	
	protected void updateNameOperation (String operationName) {
		this.context.operationName = operationName;
	}
	
	protected void updateReturnType (String returnType) {
		this.context.operationReturnType = returnType;
	}
	
	protected void registerParameter (String nameParameter, String typeParameter) {
		this.context.operationParams.add(typeParameter + " " + nameParameter);
	}
	
	protected void registerNewClass (String newClass) {
		if(!this.context.listNewClass.contains(newClass)) {
			this.context.listNewClass.add(newClass);
		}
	}
	
	protected void unregisterNewClass (String newClass) {
		this.context.listNewClass.remove(newClass);
	}
	
	protected void unregisterParameter (int iIndex) {
		this.context.operationParams.remove(iIndex);
	}
	
	protected boolean existParameter () {
		boolean result = false;
		String nameParameter = txtParameterName.getText();
		String typeParameter = txtParameterType.getText();
		
		setErrorMessage(null);
		for (int i = 0; i < table.getItems().length; i++) {
			if (table.getItem(i).getText(1).endsWith(nameParameter) && table.getItem(i).getText(2).equals(typeParameter)) {
				result = true;
				setErrorMessage("This parameter already exists.");
			}
		}
		return result;
	}
	
}
