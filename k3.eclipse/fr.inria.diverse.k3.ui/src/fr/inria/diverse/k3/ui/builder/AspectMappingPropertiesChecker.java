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
package fr.inria.diverse.k3.ui.builder;

import java.io.IOException;
import java.util.Properties;
import java.util.Map.Entry;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

import fr.inria.diverse.k3.ui.builder.JavaAspectFinderResourceVisitor;

public class AspectMappingPropertiesChecker {

	protected K3Builder hostBuilder;
	
	
	public AspectMappingPropertiesChecker(K3Builder hostBuilder) {
		super();
		this.hostBuilder = hostBuilder;
	}




	void checkK3AspectMappingPropertiesForGeneratedJava(IResource resource) {
		
		// triggered when 
		if (resource instanceof IFile && resource.getName().endsWith(resource.getProject().getName()+".k3_aspect_mapping.properties")) {
			IFile file = (IFile) resource;
			hostBuilder.deleteMarkers(file);
			Properties properties = new Properties();
			try {
				// check that a java file exist for each of the mapping aspects
				properties.load(file.getContents());
				int mostProbableLine = 1;
				for (Entry<Object, Object> entrySet : properties.entrySet()) {
					mostProbableLine++;
					String[] values = entrySet.getValue().toString().split(", ");
					for (String value : values) {
						// search for a java class with that name in the project
						String searchedJavaFile = value.replaceAll("\\.", "/");
						JavaAspectFinderResourceVisitor finder = new JavaAspectFinderResourceVisitor(searchedJavaFile+".java");
						resource.getProject().accept(finder);
						
						if(!finder.getSearchResult()){
							hostBuilder.addMarker(file, "Aspect "+value+" not found, clean project recommanded", mostProbableLine, IMarker.SEVERITY_WARNING);
						}
						
					}
				}
				
			} catch (IOException e) {
				
			} catch (CoreException e) {
				
			}
			
		}
	}
}
