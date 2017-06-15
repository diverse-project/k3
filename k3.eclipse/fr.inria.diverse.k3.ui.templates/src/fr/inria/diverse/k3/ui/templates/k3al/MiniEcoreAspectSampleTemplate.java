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

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;

import org.eclipse.gemoc.commons.eclipse.pde.wizards.pages.pde.ui.BaseProjectWizardFields;
import fr.inria.diverse.k3.ui.templates.IHelpContextIds;
import fr.inria.diverse.k3.ui.templates.K3TemplateMessages;
import fr.inria.diverse.k3.ui.templates.K3TemplateSection;
import fr.inria.diverse.k3.ui.wizards.pages.NewK3ProjectWizardFields;

public class MiniEcoreAspectSampleTemplate extends K3TemplateSection {
	public static final String KEY_CLASS_NAME = "className"; //$NON-NLS-1$
	public static final String KEY_ASPECTCLASS_POSTFIX = "aspectClassPostfix"; //$NON-NLS-1$
	public static final String CLASS_NAME = "SampleEcoreMain"; //$NON-NLS-1$
	public static final String ASPECTCLASS_POSTFIX = "Aspect"; //$NON-NLS-1$

	/**
	 * Constructor for HelloWorldTemplate.
	 */
	public MiniEcoreAspectSampleTemplate() {
		setPageCount(1);
		createOptions();
	}

	/** 
	 * used to retrieve the template folder
	 */
	public String getSectionId() {
		return "miniEcoreAspectSample"; //$NON-NLS-1$
	}

	/*
	 * @see ITemplateSection#getNumberOfWorkUnits()
	 */
	public int getNumberOfWorkUnits() {
		return super.getNumberOfWorkUnits() + 1;
	}

	private void createOptions() {
		addOption(KEY_PACKAGE_NAME, K3TemplateMessages.MiniEcoreAspectSampleTemplate_packageName, (String) null, 0);
		addOption(KEY_CLASS_NAME, K3TemplateMessages.MiniEcoreAspectSampleTemplate_className, CLASS_NAME, 0);
		addOption(KEY_ASPECTCLASS_POSTFIX, K3TemplateMessages.MiniEcoreAspectSampleTemplate_aspectClassesPostfix, ASPECTCLASS_POSTFIX, 0);
	}

	public void addPages(Wizard wizard) {
		WizardPage page = createPage(0, IHelpContextIds.TEMPLATE_MINI_ECORE_ASPECT_SAMPLE);
		page.setTitle(K3TemplateMessages.MiniEcoreAspectSampleTemplate_title);
		page.setDescription(K3TemplateMessages.MiniEcoreAspectSampleTemplate_desc);
		wizard.addPage(page);
		markPagesAdded();
	}

	public boolean isDependentOnParentWizard() {
		return true;
	}

	protected void initializeFields(BaseProjectWizardFields data) {
		String packageName = getFormattedPackageName(((NewK3ProjectWizardFields)data).projectName);
		initializeOption(KEY_PACKAGE_NAME, packageName);
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

}
