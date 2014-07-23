package fr.inria.diverse.k3.ui.tools;

import java.util.List;

public class K3FileTemplates {
	static String lineSeparator = System.getProperty("line.separator");
	
	
	public static String getK3SLEStub(String pkgName, String ecoreUri, String mmName) {
		StringBuffer buffer = new StringBuffer() ;

		buffer.append("package " + pkgName + "\n") ;
		buffer.append("\n") ;
		buffer.append("metamodel " + mmName + " {\n") ;
		buffer.append("\tecore \"" + ecoreUri + "\"\n") ;
		buffer.append("\texactType " + mmName + "MT\n") ;
		buffer.append("}\n") ;
		buffer.append("\n") ;
		buffer.append("@Main\n") ;
		buffer.append("transformation main() {\n") ;
		buffer.append("\tprintln(\"Hello, SLE!\")\n") ;
		buffer.append("}\n") ;

		return buffer.toString() ;
	}

	public static String manifestMFPlugin (String projectName, List<String> requiredBundles, List<String> exportedPackages) {

		StringBuffer buffer= new StringBuffer();
		buffer.append("Manifest-Version: 1.0" + lineSeparator);
		buffer.append("Bundle-ManifestVersion: 2" + lineSeparator);
		buffer.append("Bundle-Name: " + projectName + lineSeparator);
		buffer.append("Bundle-SymbolicName: " + projectName + "; singleton:=true" + lineSeparator);
		buffer.append("Bundle-Version: 1.0.0" + lineSeparator);
		buffer.append("Require-Bundle: ");
		buffer.append("fr.inria.diverse.k3.al.annotationprocessor.plugin;bundle-version=\"3.0.0\""+ lineSeparator);
	    buffer.append("Bundle-ClassPath: ." + lineSeparator);
	    buffer.append("Bundle-RequiredExecutionEnvironment: JavaSE-1.7"+lineSeparator);
	    
	    return buffer.toString();
    }
	
	public static String pluginbasisXML() {
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + "<?eclipse version=\"3.4\"?>\n" + "<plugin>\n" + "</plugin>";
	}
	
	public static String pluginXml(String nameProject) {
		StringBuffer buffer= new StringBuffer();
		
		buffer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		buffer.append("<?eclipse version=\"3.4\"?>\n");
		buffer.append("<plugin>\n\n");

		buffer.append("\t<extension\n");
		buffer.append("\t\t\tpoint=\"org.eclipse.ui.actionSets\">\n");
		buffer.append("\t\t<actionSet\n");
		buffer.append("\t\t\t\tlabel=\"Sample Action Set\"\n");
		buffer.append("\t\t\t\tvisible=\"true\"\n");
		buffer.append("\t\t\t\tid=\"" + nameProject + ".actionSet\">\n");
		buffer.append("\t\t\t<menu\n");
		buffer.append("\t\t\t\t\tlabel=\"Sample &amp;Menu\"\n");
		buffer.append("\t\t\t\t\tid=\"sampleMenu\">\n");
		buffer.append("\t\t\t\t<separator\n");
		buffer.append("\t\t\t\t\t\tname=\"sampleGroup\">\n");
		buffer.append("\t\t\t\t</separator>\n");
		buffer.append("\t\t\t</menu>\n");
		buffer.append("\t\t\t<action\n");
		buffer.append("\t\t\t\t\tlabel=\"&amp;Sample Action\"\n");
		buffer.append("\t\t\t\t\ticon=\"icons/sample.gif\"\n");
		buffer.append("\t\t\t\t\tclass=\"" + nameProject + ".actions.SampleAction\"\n");
		buffer.append("\t\t\t\t\ttooltip=\"Hello, Eclipse world\"\n");
		buffer.append("\t\t\t\t\tmenubarPath=\"sampleMenu/sampleGroup\"\n");
		buffer.append("\t\t\t\t\ttoolbarPath=\"sampleGroup\"\n");
		buffer.append("\t\t\t\t\tid=\"" + nameProject + ".actions.SampleAction\">\n");
		buffer.append("\t\t\t</action>\n");
		buffer.append("\t\t</actionSet>\n");
		buffer.append("\t</extension>\n\n");
		
		buffer.append("</plugin>");
		
		return buffer.toString();
		
	}
	
	public static String pomXmlK3(String nameProject, String groupID, String artifactID, String version) {
		StringBuffer buffer= new StringBuffer();
		
		buffer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		buffer.append("<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n");
		buffer.append("\txsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd\">\n");
		buffer.append("\t<modelVersion>4.0.0</modelVersion>\n");
		buffer.append("\t<groupId>"+ groupID + "</groupId>\n");
		buffer.append("\t<artifactId>"+ artifactID + "</artifactId>\n");
		buffer.append("\t<version>"+ version + "</version>\n");
		buffer.append("\t<name>"+ nameProject + "</name>\n");
		buffer.append("\t<properties>\n");
		buffer.append("\t\t<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>\n");
		buffer.append("\t\t<xtend.version>2.5.1</xtend.version>\n");
		buffer.append("\t</properties>\n");
		buffer.append("\t<build>\n");
		buffer.append("\t\t<plugins>\n");
		buffer.append("\t\t\t<plugin>\n");
		buffer.append("\t\t\t\t<groupId>org.eclipse.xtend</groupId>\n");
		buffer.append("\t\t\t\t<artifactId>xtend-maven-plugin</artifactId>\n");
		buffer.append("\t\t\t\t<version>${xtend.version}</version>\n");
		buffer.append("\t\t\t\t<executions>\n");
		buffer.append("\t\t\t\t\t<execution>\n");
		buffer.append("\t\t\t\t\t\t<goals>\n");
		buffer.append("\t\t\t\t\t\t\t<goal>compile</goal>\n");
		buffer.append("\t\t\t\t\t\t\t<goal>testCompile</goal>\n");
		buffer.append("\t\t\t\t\t\t\t<goal>xtend-install-debug-info</goal>\n");
		buffer.append("\t\t\t\t\t\t\t<goal>xtend-test-install-debug-info</goal>\n");
		buffer.append("\t\t\t\t\t\t</goals>\n");
		buffer.append("\t\t\t\t\t</execution>\n");
		buffer.append("\t\t\t\t</executions>\n");
		buffer.append("\t\t\t</plugin>\n");
		buffer.append("\t\t\t<plugin>\n");
		buffer.append("\t\t\t\t<artifactId>maven-compiler-plugin</artifactId>\n");
		buffer.append("\t\t\t\t<version>3.0</version>\n");
		buffer.append("\t\t\t\t<configuration>\n");
		buffer.append("\t\t\t\t\t<source>1.5</source>\n");
		buffer.append("\t\t\t\t\t<target>1.5</target>\n");
		buffer.append("\t\t\t\t</configuration>\n");
		buffer.append("\t\t\t</plugin>\n");
		buffer.append("\t\t</plugins>\n");
		buffer.append("\t</build>\n");
		buffer.append("\t<dependencies>\n");
		buffer.append("\t\t<dependency>\n");
		buffer.append("\t\t\t<groupId>org.eclipse.xtend</groupId>\n");
		buffer.append("\t\t\t<artifactId>org.eclipse.xtend.lib</artifactId>\n");
		buffer.append("\t\t\t<version>${xtend.version}</version>\n");
		buffer.append("\t\t</dependency>\n");
		buffer.append("\t\t<dependency>\n");
		buffer.append("\t\t\t<groupId>fr.inria.diverse.k3.al</groupId>\n");
		buffer.append("\t\t\t<artifactId>fr.inria.diverse.k3.al.annotationprocessor</artifactId>\n");
		buffer.append("\t\t\t<version>3.0.0-SNAPSHOT</version>\n");
		buffer.append("\t\t</dependency>\n");
		buffer.append("\t\t<dependency>\n");
		buffer.append("\t\t\t<groupId>org.eclipse.emf</groupId>\n");
		buffer.append("\t\t\t<artifactId>org.eclipse.emf.ecore.xmi</artifactId>\n");
		buffer.append("\t\t\t<version>2.8.0-v20120911-0500</version>\n");
		buffer.append("\t\t</dependency>\n");
		buffer.append("\t\t<dependency>\n");
		buffer.append("\t\t\t<groupId>org.eclipse.emf</groupId>\n");
		buffer.append("\t\t\t<artifactId>org.eclipse.emf.ecore</artifactId>\n");
		buffer.append("\t\t\t<version>2.8.0-v20120911-0500</version>\n");
		buffer.append("\t\t</dependency>\n");
		buffer.append("\t\t<dependency>\n");
		buffer.append("\t\t\t<groupId>org.eclipse.emf</groupId>\n");
		buffer.append("\t\t\t<artifactId>org.eclipse.emf.common</artifactId>\n");
		buffer.append("\t\t\t<version>2.8.0-v20120911-0500</version>\n");
		buffer.append("\t\t</dependency>\n");
		buffer.append("\t</dependencies>\n");
		buffer.append("\t<repositories>\n");
		buffer.append("\t\t<repository>\n");
		buffer.append("\t\t\t<id>mavenInriaSnapshot</id>\n");
		buffer.append("\t\t\t<name>http://maven.inria.fr-snapshots</name>\n");
		buffer.append("\t\t\t<url>http://maven.inria.fr/artifactory/public-snapshot</url>\n");
		buffer.append("\t\t</repository>\n");
		buffer.append("\t\t<repository>\n");
		buffer.append("\t\t\t<id>mavenInriaRelease</id>\n");
		buffer.append("\t\t\t<name>http://maven.inria.fr-releases</name>\n");
		buffer.append("\t\t\t<url>http://maven.inria.fr/artifactory/public-release</url>\n");
		buffer.append("\t\t</repository>\n");
		buffer.append("\t</repositories>\n");
		buffer.append("</project>\n");
		
		return buffer.toString();
	}
	
	public static String pomXmlK3Ecore(String nameProject, String groupID, String artifactID, String version, String eGroupID, String eArtifactID, String eVersion) {
		StringBuffer buffer= new StringBuffer();
		
		buffer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		buffer.append("<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n");
		buffer.append("\txsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd\">\n");
		buffer.append("\t<modelVersion>4.0.0</modelVersion>\n");
		buffer.append("\t<groupId>"+ groupID + "</groupId>\n");
		buffer.append("\t<artifactId>"+ artifactID + "</artifactId>\n");
		buffer.append("\t<version>"+ version + "</version>\n");
		buffer.append("\t<name>"+ nameProject + "</name>\n");
		buffer.append("\t<properties>\n");
		buffer.append("\t\t<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>\n");
		buffer.append("\t\t<xtend.version>2.4.3-SNAPSHOT</xtend.version>\n");
		buffer.append("\t</properties>\n");
		buffer.append("\t<dependencies>\n");
		buffer.append("\t\t<dependency>\n");
		buffer.append("\t\t\t<groupId>org.eclipse.xtend</groupId>\n");
		buffer.append("\t\t\t<artifactId>org.eclipse.xtend.lib</artifactId>\n");
		buffer.append("\t\t\t<version>${xtend.version}</version>\n");
		buffer.append("\t\t</dependency>\n");
		buffer.append("\t\t<dependency>\n");
		buffer.append("\t\t\t<groupId>fr.inria.diverse</groupId>\n");
		buffer.append("\t\t\t<artifactId>fr.inria.diverse.k3.core</artifactId>\n");
		buffer.append("\t\t\t<version>3.0-SNAPSHOT</version>\n");
		buffer.append("\t\t</dependency>\n");
		buffer.append("\t\t<dependency>\n");
		buffer.append("\t\t\t<groupId>" + eGroupID + "</groupId>\n");
		buffer.append("\t\t\t<artifactId>" + eArtifactID + "</artifactId>\n");
		buffer.append("\t\t\t<version>" + eVersion + "</version>\n");
		buffer.append("\t\t</dependency>\n");
		buffer.append("\t</dependencies>\n");
		buffer.append("\t<build>\n");
		buffer.append("\t\t<sourceDirectory>xtend-gen</sourceDirectory>\n");
		buffer.append("\t\t<resources>\n");
		buffer.append("\t\t\t<resource>\n");
		buffer.append("\t\t\t\t<directory>xtend-gen</directory>\n");
		buffer.append("\t\t\t\t<excludes>\n");
		buffer.append("\t\t\t\t\t<exclude>**/*.java</exclude>\n");
		buffer.append("\t\t\t\t</excludes>\n");
		buffer.append("\t\t\t</resource>\n");
		buffer.append("\t\t\t<resource>\n");
		buffer.append("\t\t\t\t<directory>src</directory>\n");
		buffer.append("\t\t\t\t<excludes>\n");
		buffer.append("\t\t\t\t\t<exclude>**/*.java</exclude>\n");
		buffer.append("\t\t\t\t</excludes>\n");
		buffer.append("\t\t\t</resource>\n");
		buffer.append("\t\t</resources>\n");
		buffer.append("\t\t<plugins>\n");
		buffer.append("\t\t\t<plugin>\n");
		buffer.append("\t\t\t\t<artifactId>maven-compiler-plugin</artifactId>\n");
		buffer.append("\t\t\t\t<version>3.0</version>\n");
		buffer.append("\t\t\t\t<configuration>\n");
		buffer.append("\t\t\t\t\t<source>1.7</source>\n");
		buffer.append("\t\t\t\t\t<target>1.7</target>\n");
		buffer.append("\t\t\t\t</configuration>\n");
		buffer.append("\t\t\t</plugin>\n");
		buffer.append("\t\t</plugins>\n");
		buffer.append("\t</build>\n");
		buffer.append("</project>\n");
		
		return buffer.toString();
	}
 
	public static String pomXmlMetamodel(String nameProject, String groupID, String artifactID, String version) {
		StringBuffer buffer= new StringBuffer();
		
		buffer.append("<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd\">\n");
		buffer.append("\t <modelVersion>4.0.0</modelVersion>\n");
		buffer.append("\t<groupId>"+ groupID + "</groupId>\n");
		buffer.append("\t<artifactId>"+ artifactID + "</artifactId>\n");
		buffer.append("\t<version>"+ version + "</version>\n");
		buffer.append("\t<name>"+ nameProject + "</name>\n");
		buffer.append("\t<build>\n");
		buffer.append("\t\t<sourceDirectory>src</sourceDirectory>\n");
		buffer.append("\t\t<plugins>\n");
		buffer.append("\t\t\t<plugin>\n");
		buffer.append("\t\t\t\t<artifactId>maven-compiler-plugin</artifactId>\n");
		buffer.append("\t\t\t\t<version>3.0</version>\n");
		buffer.append("\t\t\t\t<configuration>\n");
		buffer.append("\t\t\t\t\t<source/>\n");
		buffer.append("\t\t\t\t\t<target/>\n");
		buffer.append("\t\t\t\t</configuration>\n");
		buffer.append("\t\t\t</plugin>\n");
		buffer.append("\t\t</plugins>\n");
		buffer.append("\t</build>\n");
		buffer.append("\t<dependencies>\n");
		buffer.append("\t\t<dependency>\n");
		buffer.append("\t\t\t<groupId>org.eclipse.core</groupId>\n");
		buffer.append("\t\t\t<artifactId>org.eclipse.core.runtime</artifactId>\n");
		buffer.append("\t\t\t<version>3.6.0.v20100505</version>\n");
		buffer.append("\t\t</dependency>\n");
		buffer.append("\t\t<dependency>\n");
		buffer.append("\t\t\t<groupId>org.eclipse.emf</groupId>\n");
		buffer.append("\t\t\t<artifactId>org.eclipse.emf.ecore</artifactId>\n");
		buffer.append("\t\t\t<version>2.8.0-v20120911-0500</version>\n");
		buffer.append("\t\t</dependency>\n");
		buffer.append("\t\t<dependency>\n");
		buffer.append("\t\t\t<groupId>org.eclipse.emf</groupId>\n");
		buffer.append("\t\t\t<artifactId>org.eclipse.emf.common</artifactId>\n");
		buffer.append("\t\t\t<version>2.8.0-v20120911-0500</version>\n");
		buffer.append("\t\t</dependency>\n");
		buffer.append("\t</dependencies>\n");
		buffer.append("</project>\n");
		
		return buffer.toString();
	}

}
