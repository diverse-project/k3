package fr.inria.diverse.k3.ui.tools.classpath;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;

import org.eclipse.gemoc.commons.eclipse.core.resources.IFolderUtils;
import fr.inria.diverse.k3.ui.Activator;

public class ManageClasspathMaven extends ManageClasspath {

	public ManageClasspathMaven() {
		super();
	}

	@Override
	public void setClasspath (IProject project, IProgressMonitor monitor) {
		
		try {
			
			IJavaProject javaProject = (IJavaProject)project.getNature(JavaCore.NATURE_ID);
			
			IFolder sourceFolder = project.getFolder("src/main/java");
			try {
				IFolderUtils.create(sourceFolder,true, true, monitor);
			} catch (Exception ex) {}
			IClasspathEntry[] newClassPath = new IClasspathEntry[3];
			IPackageFragmentRoot root = javaProject.getPackageFragmentRoot(sourceFolder);

			newClassPath[0] = JavaCore.newSourceEntry(root.getPath());
			newClassPath[1] = JavaCore.newContainerEntry(new Path("org.eclipse.jdt.launching.JRE_CONTAINER"));
			newClassPath[2] = JavaCore.newContainerEntry(new Path("org.eclipse.m2e.MAVEN2_CLASSPATH_CONTAINER"));
			
		
			javaProject.setRawClasspath(newClassPath, monitor);
			IFolder outputFolder = project.getFolder("target/classes");
			try {
				IFolderUtils.create(outputFolder,true, true, monitor);
			} catch (Exception ex) {}
			javaProject.setOutputLocation(outputFolder.getFullPath(), monitor);
		} catch (Exception e) {
			Activator.logErrorMessage(e.getMessage(), e);	
		}
	}
}
