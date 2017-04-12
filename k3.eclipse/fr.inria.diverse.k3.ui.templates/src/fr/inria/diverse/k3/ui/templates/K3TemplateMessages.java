/*******************************************************************************
 * Copyright (c) 2006, 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Code 9 Corporation - ongoing development
 *     Volker Wegert - bug 243087
 *******************************************************************************/
package fr.inria.diverse.k3.ui.templates;

import org.eclipse.osgi.util.NLS;

public class K3TemplateMessages extends NLS {
	private static final String BUNDLE_NAME = "fr.inria.diverse.k3.ui.templates.k3resources"; //$NON-NLS-1$

	static {
		// load message values from bundle file
		NLS.initializeMessages(BUNDLE_NAME, K3TemplateMessages.class);
	}
		
	// MiniAspectSample constants
	public static String MiniAspectSampleNewWizard_wtitle;
	public static String MiniAspectSampleTemplate_packageName;
	public static String MiniAspectSampleTemplate_className;
	public static String MiniAspectSampleTemplate_aspectClassName;
	public static String MiniAspectSampleTemplate_title;
	public static String MiniAspectSampleTemplate_desc;

	// MiniAspectSample constants
	public static String MiniEcoreAspectSampleNewWizard_wtitle;
	public static String MiniEcoreAspectSampleTemplate_packageName;
	public static String MiniEcoreAspectSampleTemplate_className;
	public static String MiniEcoreAspectSampleTemplate_aspectClassesPostfix;
	public static String MiniEcoreAspectSampleTemplate_title;
	public static String MiniEcoreAspectSampleTemplate_desc;
	
	// UserEcoreBasicAspect constants
	public static String UserEcoreBasicAspectTemplate_packageName;
	public static String UserEcoreBasicAspectTemplate_aspectBasePackageName;
	public static String UserEcoreBasicAspectTemplate_aspectPackagePostfix;
	public static String UserEcoreBasicAspectTemplate_aspectFileName;
	public static String UserEcoreBasicAspectTemplate_aspectClassPostfix;
	public static String UserEcoreBasicAspectTemplate_ecoreBasePackageName;
	public static String UserEcoreBasicAspectTemplate_ecoreFilePath;
	public static String UserEcoreBasicAspectTemplate_title;
	public static String UserEcoreBasicAspectTemplate_desc;
	public static String UserEcoreBasicAspectTemplate_wtitle;
	
	// UserEcoreBasicAspectWithMelange constants
	public static String UserEcoreBasicAspectWithMelangeTemplate_melangeFileName;
	public static String UserEcoreBasicAspectWithMelangeTemplate_melangeMetamodelName;
	public static String UserEcoreBasicAspectWithMelangeTemplate_title;
	public static String UserEcoreBasicAspectWithMelangeTemplate_desc;
	public static String UserEcoreBasicAspectWithMelangeTemplate_wtitle;
	

}