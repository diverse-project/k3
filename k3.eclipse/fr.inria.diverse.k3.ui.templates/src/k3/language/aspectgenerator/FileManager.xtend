package k3.language.aspectgenerator

import java.io.BufferedWriter
import java.io.FileWriter
import java.io.File
import java.util.List

class FileManager {
	
	def public static void writeFile(String pathProject, String nameFile, String packageQualifiedName, String content) {
		
		println("projectPath = " + pathProject);
		println("nameFile = " + nameFile);
		println("packageQualifiedName = " + packageQualifiedName);
		println("content = " + content);
		
		
		val String pathCurrent = writePackage(pathProject, packageQualifiedName)
		println("pathCurrent = " + pathCurrent);
		
		val BufferedWriter buffer = new BufferedWriter(new FileWriter(pathCurrent + nameFile + ".xtend"))
		
		buffer.write(content)
		buffer.flush
		buffer.close
	}
	
	def public static String writePackage(String pathProject, String packageQualifiedName) {
		
		var String currentPath = pathProject + "/"
		for(pack : packageQualifiedName.split("\\.")) {
			currentPath = currentPath + "/" + pack
			var File dir =  new File(currentPath);
			dir.mkdirs
		}
		currentPath = currentPath + "/"
		println("currentPath = " + currentPath);
		return currentPath
	}
	
}
