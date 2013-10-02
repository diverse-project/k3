package org.k3.language.ui.tools.classpath;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.k3.language.ui.Activator;

public class ManageClasspathStandAlone extends ManageClasspath {

	public ManageClasspathStandAlone() {
		super();
	}

	@Override
	public void setClasspath (IProject project, IProgressMonitor monitor) {
		
		try {
			IJavaProject javaProject = (IJavaProject)project.getNature(JavaCore.NATURE_ID);
			
			IFolder sourceFolder = project.getFolder("src");
			try {
				sourceFolder.create(true, true, monitor);
			} catch (Exception ex) {}
			IClasspathEntry[] newClassPath = new IClasspathEntry[9];
			IPackageFragmentRoot root = javaProject.getPackageFragmentRoot(sourceFolder);

			newClassPath[0] = JavaCore.newSourceEntry(root.getPath());
			newClassPath[1] = JavaCore.newContainerEntry(new Path("org.eclipse.jdt.launching.JRE_CONTAINER"));
			newClassPath[2] = JavaCore.newLibraryEntry(new Path(project.getLocation().toOSString() + "/resources/org.eclipse.xtend.lib-2.4.3-SNAPSHOT.jar"), null, null);
			newClassPath[3] = JavaCore.newLibraryEntry(new Path(project.getLocation().toOSString() + "/resources/org.eclipse.xtext.xbase.lib-2.4.3-SNAPSHOT.jar"), null, null);
			newClassPath[4] = JavaCore.newLibraryEntry(new Path(project.getLocation().toOSString() + "/resources/k3-3.0-SNAPSHOT.jar"), null, null);
			newClassPath[5] = JavaCore.newLibraryEntry(new Path(project.getLocation().toOSString() + "/resources/org.eclipse.emf.common-2.8.0-v20120911-0500.jar"), null, null);
			newClassPath[6] = JavaCore.newLibraryEntry(new Path(project.getLocation().toOSString() + "/resources/org.eclipse.emf.ecore.xmi-2.8.0-v20120911-0500.jar"), null, null);
			newClassPath[7] = JavaCore.newLibraryEntry(new Path(project.getLocation().toOSString() + "/resources/org.eclipse.emf.ecore-2.8.0-v20120911-0500.jar"), null, null);
			newClassPath[8] = JavaCore.newLibraryEntry(new Path(project.getLocation().toOSString() + "/resources/guava-15.0-rc1.jar"), null, null);
			
			javaProject.setRawClasspath(newClassPath, monitor);
			
		} catch (Exception e) {
			Activator.logErrorMessage(e.getMessage(), e);
		}
	}
}
