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
package fr.inria.diverse.k3.ui.tools;

import java.util.List;

public class K3FileTemplates {
	static String lineSeparator = System.getProperty("line.separator");
	
	public static String manifestMFPlugin (String projectName, List<String> requiredBundles, List<String> exportedPackages) {

		StringBuffer buffer= new StringBuffer();
		buffer.append("Manifest-Version: 1.0" + lineSeparator);
		buffer.append("Bundle-ManifestVersion: 2" + lineSeparator);
		buffer.append("Automatic-Module-Name: " + projectName + lineSeparator);
		buffer.append("Bundle-Name: " + projectName + lineSeparator);
		buffer.append("Bundle-SymbolicName: " + projectName + "; singleton:=true" + lineSeparator);
		buffer.append("Bundle-Version: 1.0.0" + lineSeparator);
		buffer.append("Require-Bundle: ");
		buffer.append("fr.inria.diverse.k3.al.annotationprocessor.plugin;bundle-version=\"4.0.0\";visibility:=\"reexport\""+ lineSeparator);
	    buffer.append("Bundle-ClassPath: ." + lineSeparator);
	    buffer.append("Bundle-RequiredExecutionEnvironment: JavaSE-17"+lineSeparator);
	    
	    return buffer.toString();
    }
	
	public static String pluginbasisXML() {
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + "<?eclipse version=\"3.4\"?>\n" + "<plugin>\n" + "</plugin>";
	}
	
	
	

	
	

}
