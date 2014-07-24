package fr.inria.diverse.k3.ui.tools

class K3SampleFilesTemplates {
	def public static String getFileTypeK3(String namePackage, String nameClass) {
		return '''package  «namePackage» 
	
	import org.eclipse.emf.ecore.EPackage
	import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
	import org.eclipse.emf.ecore.EcorePackage
	import org.eclipse.emf.ecore.resource.Resource
	import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
	import org.eclipse.emf.common.util.URI
	
	class «nameClass»{ 
	
	
		public def run(String modelPath) {
			//Load Ecore Model
			var fact = new EcoreResourceFactoryImpl
			if (!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI)) {
				EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
			}
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", fact);
			var rs = new ResourceSetImpl()
			var uri = URI.createURI(modelPath);
			var res = rs.getResource(uri, true);
		
			var EPackage p = res.contents.get(0) as EPackage
			//properties are shared between instances
			//Add the expected behavior
		}
		
		def static void main(String[] args) {
			println('Hello Kermeta on top of Xtend!')
			new «nameClass»().run(\"model\")
			val String s = '''+"'''"+'''  '''+"'''"+'''
	}
}
'''
	}
	
	def public static String get_MiniAspectSample_SampleMain_xtend(String namePackage) {
		return '''package  «namePackage»

import java.io.File

import static extension «namePackage».SampleXMLFileAspect.*

class SampleMain{ 

	def static void main(String[] args) {
		println('Hello Kermeta on top of Xtend!')		
		
		val myFile = new File("sample.txt")
		
		// fill the attribute 'content' of the aspectized File with the evaluation of a template
		myFile.contentType = "color"
		myFile.contentArrayList = newArrayList("red", "green", "blue") 
		
		// write the file on disk
		myFile.writeXML
		
		
		println('file written (please refresh project to see it)')
	}
}
'''
	}
	
	def public static String get_MiniAspectSample_SampleXMLFileAspect_xtend(String namePackage) {
		return '''package  «namePackage»

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import java.io.PrintWriter
import java.util.ArrayList

/**
 * Sample aspect that gives java.io.File the ability to store Text content and save it to disk
 */
@Aspect(className=java.io.File)
class SampleXMLFileAspect {
	
	var String contentType = ""
	
	var ArrayList<String> contentArrayList = newArrayList("")
	
	public def void writeXML(){		
		var PrintWriter writer = new PrintWriter(_self, "UTF-8");
		// compute content String by using template
		val content = '''+"'''"+''' <xml>
	<'''+"«_self.contentType»"+'''s>	
		'''+"«FOR contentItem : _self.contentArrayList »<color>«contentItem»</color> «ENDFOR»"+'''
	</'''+"«_self.contentType»"+'''s>
</xml>'''+"'''"+'''
		writer.println(content);
		writer.close();
	}
	
}
'''
	}

	
	def public static String get_MiniAspectSample_SampleEcoreMain_xtend(String namePackage) {
		return '''package  «namePackage»

import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI

import static extension sample.EPackageAspect.*
import java.util.HashMap

class SampleEcoreMain{ 

	public def run(String modelPath, String resultModelPath) {
		//Load Ecore Model
		var fact = new EcoreResourceFactoryImpl
		if (!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", fact);
		var rs = new ResourceSetImpl()
		var uri = URI.createURI(modelPath);
		var res = rs.getResource(uri, true);

		// apply transformation
		res.contents.filter(EPackage).forEach[ pack | pack.annotate]
		
		// save the modified model in a new file
		val resSet2 = new  ResourceSetImpl()
		val res2 = resSet2.createResource(URI.createURI(resultModelPath))
		// move content to new resource
		res2.contents.addAll(res.contents)
		res2.save(new HashMap()) 
	}

	def static void main(String[] args) {
		println('Hello Kermeta on top of Xtend! (please create a My.ecore file to test this sample program)')
		new SampleEcoreMain().run("My.ecore", "My_annotated.ecore")
		println('file written (please refresh project to see it)')
	}
	
}

'''
	}
	
	def public static String get_MiniAspectSample_SampleAnnotateEcoreAspect_xtend(String namePackage) {
		return '''package  «namePackage»

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EModelElement
import org.eclipse.emf.ecore.EAnnotation
import org.eclipse.emf.ecore.EcoreFactory

import static extension sample.EPackageAspect.*
import static extension sample.EClassAspect.*
import static extension sample.EClassifierAspect.*
import static extension sample.EModelElementAspect.*

/*
 * 
 * Simple Ecore extension allowing to annotate all classes of an ecore model by adding 
 * an annotation containing the list of all super classes (flat)  
 */
 
 
@Aspect(className=EPackage)
class EPackageAspect extends EModelElementAspect{
	
	public def void annotate(){
		// traverse the model to annotate all classes
		_self.ESubpackages.forEach[subPackage | subPackage.annotate]
		_self.EClassifiers.forEach[EClassifier classifier | classifier.annotate ] 
	}
}

@Aspect(className=EClassifier)
class EClassifierAspect extends EModelElementAspect{
	public def void annotate(){
		// do nothing in the general case
	}
}

@Aspect(className=EClass)
class EClassAspect extends EClassifierAspect{
	
	@OverrideAspectMethod
	public def void annotate(){
		// compute the string for the annotation and add it to the class
		_self.addAnnotation("http://www.eclipse.org/emf/2002/GenModel", "documentation", _self.flat(""))
	}
	
	public def String flat(String tabStr){
		val StringBuilder returnedString = new StringBuilder
		returnedString.append(tabStr + _self.name + " :")
		
		_self.ESuperTypes.forEach[eSuperClass | 
			returnedString.append("\n" + eSuperClass.flat( tabStr + "\t"))
		]
		
		return returnedString.toString
	}	
}


@Aspect(className=EModelElement)
class EModelElementAspect{
	public def EAnnotation addAnnotation(String source, String detailKey, String detailValue) {
    	// create annotation on the model element only if not already there
		var EAnnotation theAnnotation =	_self.EAnnotations.findFirst[annot | annot.source.equals(source)]
		if (theAnnotation == null){
			theAnnotation = EcoreFactory.eINSTANCE.createEAnnotation
			theAnnotation.source = source
			_self.EAnnotations.add(theAnnotation)
		}
		
		theAnnotation.details.put(detailKey, detailValue)
		return theAnnotation
    }
}
'''
	}
	
	def public static String buildProperties () {
		return '''source.. = src/,\
           xtend-gen/
output.. = bin/
bin.includes = plugin.xml,\
           META-INF/,\
           .
'''
	}

	
	def public static String getK3SLEStub(String pkgName, String ecoreUri, String mmName) {
		return '''package «pkgName»
		
metamodel «mmName» {
	ecore «ecoreUri»
	exactType «mmName»MT
}

@Main
transformation main() {
	println("Hello, SLE!")
}
'''
	}
	
	def public static String pomXmlMetamodel(String nameProject, String groupID, String artifactID, String version) {
		return '''<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>«groupID»</groupId>
	<artifactId>«artifactID»</artifactId>
	<version>«version»</version>
	<name>«nameProject»</name>
	<build>
		<sourceDirectory>src</sourceDirectory>
		<plugins>
			<plugin>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.0</version>
				<configuration>
					<source/>
					<target/>
				</configuration>
			</plugin>
		</plugins>
	</build>
	<dependencies>
		<dependency>
			<groupId>org.eclipse.core</groupId>
			<artifactId>org.eclipse.core.runtime</artifactId>
			<version>3.6.0.v20100505</version>
		</dependency>
		<dependency>
			<groupId>org.eclipse.emf</groupId>
			<artifactId>org.eclipse.emf.ecore</artifactId>
			<version>2.8.0-v20120911-0500</version>
		</dependency>
		<dependency>
			<groupId>org.eclipse.emf</groupId>
			<artifactId>org.eclipse.emf.common</artifactId>
			<version>2.8.0-v20120911-0500</version>
		</dependency>
	</dependencies>
</project>'''
	}
	
	
	def public static String pomXmlK3Ecore(String nameProject, String groupID, String artifactID, String version, String eGroupID, String eArtifactID, String eVersion) {
		return '''<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>«groupID»</groupId>
	<artifactId>«artifactID»</artifactId>
	<version>«version»</version>
	<name>«nameProject»</name>
	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<xtend.version>2.4.3-SNAPSHOT</xtend.version>
	</properties>
	<dependencies>
		<dependency>
			<groupId>org.eclipse.xtend</groupId>
			<artifactId>org.eclipse.xtend.lib</artifactId>
			<version>${xtend.version}</version>
		</dependency>
		<dependency>
			<groupId>fr.inria.diverse</groupId>
			<artifactId>fr.inria.diverse.k3.core</artifactId>
			<version>3.0-SNAPSHOT</version>
		</dependency>
		<dependency>
			<groupId>«eGroupID»</groupId>
			<artifactId>«eArtifactID»</artifactId>
			<version>«eVersion»</version>
		</dependency>
	</dependencies>
	<build>
		<sourceDirectory>xtend-gen</sourceDirectory>
		<resources>
			<resource>
				<directory>xtend-gen</directory>
				<excludes>
					<exclude>**/*.java</exclude>
				</excludes>
			</resource>
			<resource>
				<directory>src</directory>
				<excludes>
					<exclude>**/*.java</exclude>
				</excludes>
			</resource>
		</resources>
		<plugins>
			<plugin>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.0</version>
				<configuration>
					<source>1.7</source>
					<target>1.7</target>
				</configuration>
			</plugin>
		</plugins>
	</build>
</project>'''
	}
	
	def	public static String pomXmlK3(String nameProject, String groupID, String artifactID, String version) {
		return '''<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>«groupID»</groupId>
	<artifactId>«artifactID»</artifactId>
	<version>«version»</version>
	<name>«nameProject»</name>
	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<xtend.version>2.6.0</xtend.version>
	</properties>
	<build>
		<plugins>
			<plugin>
				<groupId>org.eclipse.xtend</groupId>
				<artifactId>xtend-maven-plugin</artifactId>
				<version>${xtend.version}</version>
				<executions>
					<execution>
						<goals>
							<goal>compile</goal>
							<goal>testCompile</goal>
							<goal>xtend-install-debug-info</goal>
							<goal>xtend-test-install-debug-info</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
			<plugin>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.0</version>
				<configuration>
					<source>1.5</source>
					<target>1.5</target>
				</configuration>
			</plugin>
		</plugins>
	</build>
	<dependencies>
		<dependency>
			<groupId>org.eclipse.xtend</groupId>
			<artifactId>org.eclipse.xtend.lib</artifactId>
			<version>${xtend.version}</version>
		</dependency>
		<dependency>
			<groupId>fr.inria.diverse.k3.al</groupId>
			<artifactId>fr.inria.diverse.k3.al.annotationprocessor</artifactId>
			<version>3.0.0-SNAPSHOT</version>
		</dependency>
		<dependency>
			<groupId>org.eclipse.emf</groupId>
			<artifactId>org.eclipse.emf.ecore.xmi</artifactId>
			<version>2.8.0-v20120911-0500</version>
		</dependency>
		<dependency>
			<groupId>org.eclipse.emf</groupId>
			<artifactId>org.eclipse.emf.ecore</artifactId>
			<version>2.8.0-v20120911-0500</version>
		</dependency>
		<dependency>
			<groupId>org.eclipse.emf</groupId>
			<artifactId>org.eclipse.emf.common</artifactId>
			<version>2.8.0-v20120911-0500</version>
		</dependency>
	</dependencies>
	<repositories>
		<repository>
			<id>mavenInriaSnapshot</id>
			<name>http://maven.inria.fr-snapshots</name>
			<url>http://maven.inria.fr/artifactory/public-snapshot</url>
		</repository>
		<repository>
			<id>mavenInriaRelease</id>
			<name>http://maven.inria.fr-releases</name>
			<url>http://maven.inria.fr/artifactory/public-release</url>
		</repository>
	</repositories>
</project>'''
	}
	
	
}