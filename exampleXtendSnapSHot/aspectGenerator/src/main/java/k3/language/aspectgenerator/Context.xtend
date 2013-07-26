package k3.language.aspectgenerator

import java.util.List
import java.util.ArrayList

class Context {
	
	public List<String> 	packageCollection
	public List<String>		classCollection
	public Integer 			counterPackage
	public StringBuffer		kmtContent
	public String			projectPath
	public String			currentPath
	
	new() {
		packageCollection = new ArrayList<String>
		classCollection = new ArrayList<String>
		counterPackage = 0
		kmtContent = new StringBuffer
		projectPath = System.getProperty("user.dir") + "/target/"
		currentPath = projectPath
	}
}