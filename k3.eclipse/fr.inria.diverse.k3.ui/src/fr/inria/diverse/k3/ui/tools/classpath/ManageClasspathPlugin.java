package fr.inria.diverse.k3.ui.tools.classpath;

import java.util.ArrayList;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry; 
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;

import fr.inria.diverse.k3.ui.Activator;

public class ManageClasspathPlugin extends ManageClasspath {
	private boolean useSLE;

	public ManageClasspathPlugin(boolean useSLE) {
		super();
		this.useSLE = useSLE;
	}

	@Override
	public void setClasspath (IProject project, IProgressMonitor monitor) {
		
		try {
			
			IJavaProject javaProject = (IJavaProject)project.getNature(JavaCore.NATURE_ID);
			
			IFolder sourceFolder = project.getFolder("src");
			try {
				sourceFolder.create(true, true, monitor);
			} catch (Exception ex) {}
			
			ArrayList<IClasspathEntry> newClassPathArrayList = new ArrayList<IClasspathEntry>();
			
			IPackageFragmentRoot root = javaProject.getPackageFragmentRoot(sourceFolder);

			newClassPathArrayList.add( JavaCore.newSourceEntry(root.getPath()));
			newClassPathArrayList.add(JavaCore.newContainerEntry(new Path("org.eclipse.jdt.launching.JRE_CONTAINER")));
			newClassPathArrayList.add(JavaCore.newContainerEntry(new Path("org.eclipse.pde.core.requiredPlugins")));
			if (useSLE)
				newClassPathArrayList.add(JavaCore.newSourceEntry(javaProject.getPackageFragmentRoot(project.getFolder("src-gen")).getPath()));

			// convert the array to the appropriate table
			IClasspathEntry[] newClassPath = new IClasspathEntry[newClassPathArrayList.size()];
			javaProject.setRawClasspath(newClassPathArrayList.toArray(newClassPath), monitor);
		} catch (Exception e) {
			Activator.logErrorMessage(e.getMessage(), e);	
		}
		
	}
}
