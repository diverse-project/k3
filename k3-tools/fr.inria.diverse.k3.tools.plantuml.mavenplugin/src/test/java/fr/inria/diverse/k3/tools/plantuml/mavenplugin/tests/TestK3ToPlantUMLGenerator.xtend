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
		
	}
}
 






