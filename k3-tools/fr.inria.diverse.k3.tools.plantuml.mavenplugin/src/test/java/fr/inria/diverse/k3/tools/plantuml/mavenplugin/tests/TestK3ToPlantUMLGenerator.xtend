package fr.inria.diverse.k3.tools.plantuml.mavenplugin.tests


import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtend.core.XtendStandaloneSetup
import org.eclipse.xtend.core.xtend.XtendField
import org.eclipse.xtend.core.xtend.XtendFile

import org.junit.Test

import static org.junit.Assert.*
import fr.inria.diverse.k3.tools.plantuml.mavenplugin.K3ToPlantUMLGenerator
import org.eclipse.xtext.util.Files
import java.util.List
import org.junit.Assert
import java.util.ArrayList

class TestK3ToPlantUMLGenerator {
	@Test
	def void testK3File_Simple() {
		val K3ToPlantUMLGenerator generator = new K3ToPlantUMLGenerator() 
		val plantumlFileName = "target/test-output/TestSimple.plantuml"
		
		generator.generatePlantUMLForFile("src/test/resources/TestSimple.xtend", "test.", plantumlFileName)
		
		val fileContent = Files.readFileIntoString(plantumlFileName)
		
		assertTrue(fileContent.contains("class	TestSimple {"))
		assertTrue(fileContent.contains("class	B {"))
		assertTrue(fileContent.contains("class	AspectB << (@,#FF7700) Aspect >>"))
		assertFalse(fileContent.contains("void .."))
		assertFalse(fileContent.contains("void <|--"))
	}
	
	@Test
	def void testK3File_MultipleInheritance() {
		val K3ToPlantUMLGenerator generator = new K3ToPlantUMLGenerator() 
		val plantumlFileName = "target/test-output/TestMultipleInheritance.plantuml"
		
		generator.generatePlantUMLForFile("src/test/resources/TestMultipleInheritance.xtend", "test.", plantumlFileName)
		
		val fileContent = Files.readFileIntoString(plantumlFileName)
		
		assertTrue(fileContent.contains("class	AImpl {"))
		assertTrue(fileContent.contains("interface	B {"))
		assertTrue(fileContent.contains("class	AAspect << (@,#FF7700) Aspect >>"))
		assertFalse(fileContent.contains("void .."))
		assertFalse(fileContent.contains("void <|--"))
	}
	
	
	@Test
	def void testK3Folder() {
		val K3ToPlantUMLGenerator generator = new K3ToPlantUMLGenerator() 
		val plantumlFileName = "target/test-output/TestFolder.plantuml"
		
		generator.generatePlantUMLForFolder("src/test/resources/test_folders", "test.", plantumlFileName)
		
		val fileContent = Files.readFileIntoString(plantumlFileName)
		
		assertTrue(fileContent.contains("class	TestSimple {"))
		assertTrue(fileContent.contains("class	B {"))
		assertTrue(fileContent.contains("class	AspectB << (@,#FF7700) Aspect >>"))
		assertTrue(fileContent.contains("class	X8Aspect << (@,#FF7700) Aspect >>"))
		assertFalse(fileContent.contains("void .."))
		assertFalse(fileContent.contains("void <|--"))
		
	}
	
	
	@Test
    def void testK3FolderAndCompanion() {
    	val K3ToPlantUMLGenerator generator = new K3ToPlantUMLGenerator() 
		val plantumlFileName = "target/test-output/TestK3FolderAndCompanion.plantuml"
		
		val List<String> folderList = #["src/test/resources/test_companion/k3","src/test/resources/test_companion/xtend_companion"]
		
		generator.generatePlantUMLForFolders(folderList, "test.", plantumlFileName)
		
		val fileContent = Files.readFileIntoString(plantumlFileName)
		
		assertTrue(fileContent.contains("interface	Top1 {"))
		assertTrue(fileContent.contains("class	TestParentOnlyAspects {"))
		assertTrue(fileContent.contains("class	Top1Aspect << (@,#FF7700) Aspect >>"))
		assertTrue(fileContent.contains("Top1 .. Top1Aspect : <"))
		assertFalse(fileContent.contains("void .."))
		assertFalse(fileContent.contains("void <|--"))
    	
	}
	
	
	@Test
	def void testK3FolderMultiFiles() {
		val K3ToPlantUMLGenerator generator = new K3ToPlantUMLGenerator() 
		val plantumlFileName = "target/test-output/TestK3FolderMultiFiles.plantuml"
		
		generator.generatePlantUMLForFolder("src/test/resources/test_multifiles", "test.", plantumlFileName)
		
		val fileContent = Files.readFileIntoString(plantumlFileName)
		
//		assertTrue(fileContent.contains("class	TestSimple {"))
//		assertTrue(fileContent.contains("class	B {"))
//		assertTrue(fileContent.contains("class	AspectB << (@,#FF7700) Aspect >>"))
//		assertTrue(fileContent.contains("class	X8Aspect << (@,#FF7700) Aspect >>"))
		assertFalse(fileContent.contains("void .."))
//		assertFalse(fileContent.contains("void <|--"))
		
	}
}
 






