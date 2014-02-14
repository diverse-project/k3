package fr.inria.diverse.k3.ui.tools;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;

public class IFolderUtils {

	/**
	 * Recursively creates parent IFolder if required
	 * @param folder
	 * @param force
	 * @param local
	 * @param monitor
	 * @throws CoreException
	 */
	public static void create(IFolder folder, boolean force, boolean local, IProgressMonitor monitor) throws CoreException{
		if(folder.getParent() instanceof IFolder && !folder.getParent().exists()){
			create((IFolder) folder.getParent(), force, local, monitor);
		}
		folder.create(force, local, monitor);
	}
	
	public static void createFolder(String path, IProject project, IProgressMonitor monitor) throws CoreException {
		String[] strings = path.split("/");
		IContainer currentContainer = project;
		for ( String s : strings ) {
			IFolder folder = currentContainer.getFolder( new Path(s) );
			folder.create(true, true, monitor);
			currentContainer = folder;
		}
	}
}
