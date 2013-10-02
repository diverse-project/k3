package org.k3.language.ui.tools;

import java.io.*;
import java.net.URL;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.k3.language.ui.Activator;

public class FileUtils {
	
	static String lineSeparator = System.getProperty("line.separator");
	
	public static String getFileTypeK3(String namePackage, String nameClass) {
		StringBuffer buffer= new StringBuffer();
		
		buffer.append("package " + namePackage + "\n");
		buffer.append("\n");
		buffer.append("import org.eclipse.emf.ecore.EPackage\n");
		buffer.append("import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl\n");
		buffer.append("import org.eclipse.emf.ecore.EcorePackage\n");
		buffer.append("import org.eclipse.emf.ecore.resource.Resource\n");
		buffer.append("import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl\n");
		buffer.append("import org.eclipse.emf.common.util.URI\n");
		buffer.append("\n");
		buffer.append("class " + nameClass +  "{ \n\n");
		buffer.append("\tpublic def run(String modelPath) {\n");
		buffer.append("\t\t//Load Ecore Model\n");
		buffer.append("\t\tvar fact = new EcoreResourceFactoryImpl\n");
		buffer.append("\t\tif (!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI)) {\n");
		buffer.append("\t\t\tEPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);\n");
		buffer.append("\t\t}\n");
		buffer.append("\t\tResource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(\"ecore\", fact);\n");
		buffer.append("\t\tvar rs = new ResourceSetImpl()\n");
		buffer.append("\t\tvar uri = URI.createURI(modelPath);\n");
		buffer.append("\t\tvar res = rs.getResource(uri, true);\n");
		buffer.append("\n");
		buffer.append("\t\tvar EPackage p = res.contents.get(0) as EPackage\n");
		buffer.append("\t\t//properties are shared between instances\n");
		buffer.append("\t\t//Add the expected behavior\n");
		buffer.append("\t}\n");
		buffer.append("\n");
		buffer.append("\tdef static void main(String[] args) {\n");
		buffer.append("\t\tprintln('Hello Kermeta on top of Xtend!')\n");
		buffer.append("\t\tnew " + nameClass + "().run(\"model\")\n");
		buffer.append("\t\tval String s = '''  '''\n");
		buffer.append("\t}\n");
		buffer.append("}\n");

		return buffer.toString();
	}
	
	public static String manifestMFPlugin (String projectName, List<String> requiredBundles, List<String> exportedPackages) {

		StringBuffer buffer= new StringBuffer();
		buffer.append("Manifest-Version: 1.0" + lineSeparator);
		buffer.append("Bundle-ManifestVersion: 2" + lineSeparator);
		buffer.append("Bundle-Name: " + projectName + lineSeparator);
		buffer.append("Bundle-SymbolicName: " + projectName + "; singleton:=true" + lineSeparator);
		buffer.append("Bundle-Version: 1.0.0" + lineSeparator);
		buffer.append("Require-Bundle: ");
		buffer.append("org.k3.core.plugin;bundle-version=\"1.0.0\""+ lineSeparator);
	    buffer.append("Bundle-ClassPath: .,");
	    buffer.append("resources/k3-3.0-SNAPSHOT.jar,");
	    buffer.append("resources/org.eclipse.xtend.lib-2.4.3-SNAPSHOT.jar,");
	    buffer.append("resources/org.eclipse.xtext.xbase.lib-2.4.3-SNAPSHOT.jar" + lineSeparator);
	    
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
	
	public static String buildProperties () {
		
		StringBuffer buffer= new StringBuffer();
		
		buffer.append("source.. = src/"+lineSeparator);
		buffer.append("output.. = bin/"+lineSeparator);
		buffer.append("bin.includes = plugin.xml,\\"+lineSeparator);
		buffer.append("\t\t\t\tMETA-INF/,\\"+lineSeparator);
		buffer.append("\t\t\t\t.,\\"+lineSeparator);
		buffer.append("\t\t\t\tlibrary/k3-3.0-SNAPSHOT.jar,\\"+lineSeparator);
		buffer.append("\t\t\t\tlibrary/org.eclipse.xtend.lib-2.4.3-SNAPSHOT.jar,\\"+lineSeparator);
		buffer.append("\t\t\t\tlibrary/org.eclipse.xtext.xbase.lib-2.4.3-SNAPSHOT.jar"+lineSeparator);
		
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
		buffer.append("\t\t<xtend.version>2.4.3-SNAPSHOT</xtend.version>\n");
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
		buffer.append("\t\t\t<groupId>fr.inria.triskell</groupId>\n");
		buffer.append("\t\t\t<artifactId>k3</artifactId>\n");
		buffer.append("\t\t\t<version>3.0-SNAPSHOT</version>\n");
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
		buffer.append("\t\t\t<id>xtext.snapshots</id>\n");
		buffer.append("\t\t\t<url>http://dev.nightlabs.org/maven-repository/repo/</url>\n");
		buffer.append("\t\t</repository>\n");
		buffer.append("\t</repositories>\n");
		buffer.append("\t<pluginRepositories>\n");
		buffer.append("\t\t<pluginRepository>\n");
		buffer.append("\t\t\t<id>xtext.oss.snapshots</id>\n");
		buffer.append("\t\t\t<url>http://dev.nightlabs.org/maven-repository/repo/</url>\n");
		buffer.append("\t\t</pluginRepository>\n");
		buffer.append("\t</pluginRepositories>\n");
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
		buffer.append("\t\t\t<groupId>fr.inria.triskell</groupId>\n");
		buffer.append("\t\t\t<artifactId>k3</artifactId>\n");
		buffer.append("\t\t\t<version>3.0-SNAPSHOT</version>\n");
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
		buffer.append("\t\t<dependency>\n");
		buffer.append("\t\t\t<groupId>" + eGroupID + "</groupId>\n");
		buffer.append("\t\t\t<artifactId>" + eArtifactID + "</artifactId>\n");
		buffer.append("\t\t\t<version>" + eVersion + "</version>\n");
		buffer.append("\t\t</dependency>\n");
		buffer.append("\t</dependencies>\n");
		buffer.append("\t<repositories>\n");
		buffer.append("\t\t<repository>\n");
		buffer.append("\t\t\t<id>xtext.snapshots</id>\n");
		buffer.append("\t\t\t<url>http://dev.nightlabs.org/maven-repository/repo/</url>\n");
		buffer.append("\t\t</repository>\n");
		buffer.append("\t</repositories>\n");
		buffer.append("\t<pluginRepositories>\n");
		buffer.append("\t\t<pluginRepository>\n");
		buffer.append("\t\t\t<id>xtext.oss.snapshots</id>\n");
		buffer.append("\t\t\t<url>http://dev.nightlabs.org/maven-repository/repo/</url>\n");
		buffer.append("\t\t</pluginRepository>\n");
		buffer.append("\t</pluginRepositories>\n");
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
	
	public static void copy(final InputStream inStream, final OutputStream outStream, final int bufferSize) throws IOException {
		final byte[] buffer = new byte[bufferSize];
		int nbRead;
		while ((nbRead = inStream.read(buffer)) != -1) {
			outStream.write(buffer, 0, nbRead);
		}
	}
	   
	public static void copyDirectory(final File from, final File to) throws IOException {
		if (! to.exists()) {
			to.mkdir();
		}
		final File[] inDir = from.listFiles();
		for (int i = 0; i < inDir.length; i++) {
			final File file = inDir[i];
			copy(file, new File(to, file.getName()));
		}
	}
	
	public static void copyFile(final File from, final File to) throws IOException {
		final InputStream inStream = new FileInputStream(from);
		final OutputStream outStream = new FileOutputStream(to);
		copy(inStream, outStream, (int) Math.min(from.length(), 4*1024));
		inStream.close();
		outStream.close();
	}
	
	public static void copy(final File from, final File to) throws IOException {
		if (from.isFile()) {
			copyFile(from, to);
		} else if (from.isDirectory()){
			copyDirectory(from, to);
		} else {
			throw new FileNotFoundException(from.toString() + " does not exist" );
		}
	}
	
	public static void unZip(IProject project, ProjectDescriptor projectDesc) {

		
		try {
			
			URL interpreterZipUrl = FileLocator.find(Platform.getBundle(projectDesc.getBundleName()), new Path(projectDesc.getZipLocation()), null);
			// We make sure that the project is created from this point forward.
			
			ZipInputStream zipFileStream = new ZipInputStream(interpreterZipUrl.openStream());
			ZipEntry zipEntry = zipFileStream.getNextEntry();
			
			// We derive a regexedProjectName so that the dots don't end up being
			//  interpreted as the dot operator in the regular expression language.
			//String regexedProjectName = projectName.replaceAll("\\.", "\\."); //$NON-NLS-1$ //$NON-NLS-2$
			
			while (zipEntry != null) {
				// We will construct the new file but we will strip off the project
				//  directory from the beginning of the path because we have already
				//  created the destination project for this zip.
				File file = new File(project.getLocation().toString(), zipEntry.getName());

				if (false == zipEntry.isDirectory()) {

					/*
					 * Copy files (and make sure parent directory exist)
					 */
					File parentFile = file.getParentFile();
					if (null != parentFile && false == parentFile.exists()) {
						parentFile.mkdirs();
					}
						OutputStream os = null;

						try {
							os = new FileOutputStream(file);

							byte[] buffer = new byte[102400];
							while (true) {
								int len = zipFileStream.read(buffer);
								if (zipFileStream.available() == 0)
									break;
								os.write(buffer, 0, len);
							}
						} finally {
							if (null != os) {
								os.close();
							}
						}
				}
				
				zipFileStream.closeEntry();
				zipEntry = zipFileStream.getNextEntry();
			}
		} catch (IOException exception) {
			Activator.logErrorMessage(exception.getMessage(), exception);
		}
	}

}
	