package $packageName$;

import java.io.File

import static extension $packageName$.$aspectClassName$.*

class $className$ { 

	def static void main(String[] args) {
		println('Hello Kermeta on top of Xtend!')		
		
		val myFile = new File("sample.txt")
		
		// fill the attribute 'content' of the aspectized File with the evaluation of a template
		myFile.contentType = "color"
		myFile.contentArrayList = newArrayList("red", "green", "blue") 
		
		// write the file on disk
		myFile.writeXML
		
		
		println('file written (in eclipse, please refresh project to see it)')
	}
}