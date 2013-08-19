package k3.language.aspectgenerator

import java.util.List
import java.util.ArrayList

class Context {
	
	public List<String> 	packageCollection
	public List<String>		classCollection
	public Integer 			counterPackage
	public StringBuffer		kmtContent
	public String			projectName
	public String			projectPath
	public String			nameOperation
	public Boolean			isOverride
	
	new(String projectPath, String projectName, String nameOperation) {
		packageCollection = new ArrayList<String>
		classCollection = new ArrayList<String>
		counterPackage = 0
		kmtContent = new StringBuffer
		this.projectName = projectName
		this.projectPath = projectPath +"/" + projectName + "/src/main/java/"
		this.nameOperation = nameOperation
		isOverride = false
	}
	
	def public String comment_ForMultiInheritence() {
		var String result = ""
		result = result + "\t/*"
		result = result + "\n\t* BE CAREFUL :"
		result = result + "\n\t*"
		result = result + "\n\t* This class inherits of multi superclass"
		result = result + "\n\t* please specify which parent you want with the 'super' expected calling"
		result = result + "\n\t*\n\t*/\n\n"
		
		return result
	}
}