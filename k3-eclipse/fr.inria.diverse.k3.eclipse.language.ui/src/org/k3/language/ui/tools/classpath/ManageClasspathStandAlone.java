package org.k3.language.ui.tools.classpath;

import java.util.ArrayList;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.k3.language.ui.Activator;

public class ManageClasspathStandAlone extends ManageClasspath {

	String additionalLibFolderName = null;
	
	/**
	 * 
	 * @param additionalLibFolderName name of the folder containing jars for standalone mode, set to null if no folder should be added 
	 */
	public ManageClasspathStandAlone(String additionalLibFolderName) {
		super();
		this.additionalLibFolderName = additionalLibFolderName;
	}

	@Override
	public void setClasspath (IProject project, IProgressMonitor monitor) {
		
		try {
			project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
			IJavaProject javaProject = (IJavaProject)project.getNature(JavaCore.NATURE_ID);
			
			IFolder sourceFolder = project.getFolder("src");
			try {
				sourceFolder.create(true, true, monitor);
			} catch (Exception ex) {}
			
			ArrayList<IClasspathEntry> newClassPathList = new ArrayList<IClasspathEntry>();
			
			IPackageFragmentRoot root = javaProject.getPackageFragmentRoot(sourceFolder);
						
			newClassPathList.add(JavaCore.newSourceEntry(root.getPath()));
			newClassPathList.add(JavaCore.newContainerEntry(new Path("org.eclipse.jdt.launching.JRE_CONTAINER")));
			// add the jar that are present in the defined lib folder
			if(additionalLibFolderName != null){
				for(IResource res : project.getFolder(additionalLibFolderName).members()){
					if(res.getFileExtension().equals("jar"))
						newClassPathList.add(JavaCore.newLibraryEntry(new Path(res.getLocation().toString()), null, null));
				}
			}
			
			newClassPathList.toArray(new IClasspathEntry[newClassPathList.size()]);
			
			javaProject.setRawClasspath(newClassPathList.toArray(new IClasspathEntry[newClassPathList.size()]), monitor);
			
		} catch (Exception e) {
			Activator.logErrorMessage(e.getMessage(), e);
		}
	}
}
