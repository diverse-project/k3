/*******************************************************************************
 * Copyright (c) 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package k3.language.aspectgenerator

import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter

class FileManager {

	def static void writeFile(String pathProject, String nameFile, String packageQualifiedName, String content) {

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

	def static String writePackage(String pathProject, String packageQualifiedName) {

		var String currentPath = pathProject + "/"
		for (pack : packageQualifiedName.split("\\.")) {
			currentPath = currentPath + "/" + pack
			var File dir = new File(currentPath);
			dir.mkdirs
		}
		currentPath = currentPath + "/"
		println("currentPath = " + currentPath);
		return currentPath
	}

}
