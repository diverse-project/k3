package fr.inria.diverse.k3.ui.builder;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;

/**
 * Class used to detect if a java file exist for the given name
 *
 */
public class JavaAspectFinderResourceVisitor implements IResourceVisitor {
	protected String searchedJavaFile;
	protected boolean result = false;
	public JavaAspectFinderResourceVisitor(String searchedJavaFile){
		this.searchedJavaFile = searchedJavaFile;
	}
	public boolean visit(IResource resource) {
		if(resource instanceof IFile && resource.getName().endsWith(".java")){
			if(resource.getProjectRelativePath().toString().contains(searchedJavaFile)){
				result = true;
				return false;
			}
		}
		//return true to continue visiting children.
		// continue only if not found
		return !result;
	}
	public boolean getSearchResult(){return result;}
}
