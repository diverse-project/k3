/* $Id:$ 
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Francois Fouquet
 *            Didier Vojtisek
 * 
 */
package fr.inria.diverse.k3.tools.plantuml.mavenplugin;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Properties;

import javax.imageio.ImageIO;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.project.MavenProject;

/**
 * This class implement a maven plugin that generate a plantuml file for a given K3/xtend file
 *  
 * @goal generate
 * @phase generate-sources
 * @author <a href="mailto:didier.vojtisek@inria.fr">Didier Vojtisek</a>
 * @version $Id$
 *
 */
public class K3ToPlantUMLMojo extends AbstractMojo {

    /**
     * List of Remote Repositories used by the resolver
     *
     * @parameter expression="${project.remoteArtifactRepositories}"
     * @readonly
     * @required
     */
    protected java.util.List remoteRepos;
    /**
     * Location of the local repository.
     *
     * @parameter expression="${localRepository}"
     * @readonly
     * @required
     */
    protected org.apache.maven.artifact.repository.ArtifactRepository local;
    /**
     * POM
     *
     * @parameter expression="${project}"
     * @readonly
     * @required
     */
    protected MavenProject project;
    /**
     * Input K3 file or folder containing K3 files
     * if 
     * @parameter
     * @required
     */
    private File input;
    /**
     * Output plantuml file
     * if not set, will compute a name from input name
     * @parameter
     * @required
     */
    private File output;

    /**
     * if set to true, and if the input is a folder, all the content of the folder will be process individually
     * in that case the output must be a folder, the plantuml file names will be computed from folder content name and genSubFolder parameter
     * Default is "false"
     *
     * @parameter expression="false"
     * @required
     */
    private boolean processIndividually;

    /**
     * base package name
     * base package name will be removed from generated diagram
     * Default is ""
     *
     * @parameter expression=""
     * @required
     */
    private String basePackageName;
    
    /**
     * genSubFolder
     * if processIndividually is set to true the plantuml file will be generated in a sub folder 
     * Default is "gen-plantuml"
     *
     * @parameter default-value="gen-plantuml"
     */
    private String genSubFolder;
    
    
   
    public void execute() throws MojoExecutionException, MojoFailureException {

        //org.apache.log4j.BasicConfigurator.configure();
        //System.out.println("K2CompilerMojo.execute");
    	this.getLog().info("generate a plantUML file "+output.getAbsolutePath()+" from "+input.getAbsolutePath()+" using base package name "+basePackageName);
        /* CHECK IF GENERATION IF OK */
        
        checkFile(input.getAbsolutePath().toString());
        if(processIndividually){
        	if(input.isDirectory() && output.isDirectory()){
        		for(File f :input.listFiles()){
        			K3ToPlantUMLGenerator generator = new K3ToPlantUMLGenerator();
        			String outputPathForItem =output.getPath() +File.separator;
        			if(f.isDirectory()){
    	        		generator.generatePlantUMLForFolder(f.getPath(), 
    	        				basePackageName, 
    	        				outputPathForItem + f.getName() + File.separator + genSubFolder + File.separator + f.getName() +".plantuml");
    	        	} else {
    	        		generator.generatePlantUMLForFile(f.getPath(), 
    	        				basePackageName, 
    	        				outputPathForItem + genSubFolder + File.separator + f.getName().replace(".xtend", ".plantuml"));
    	        	}
        		}
        	} else {
        		this.getLog().error("input and output must be folder is the option processIndividually is set to true");
        	}
        }
        else {
	        try {
	        	K3ToPlantUMLGenerator generator = new K3ToPlantUMLGenerator();
	        	
	        	if(input.isDirectory()){
	        		generator.generatePlantUMLForFolder(input.getPath(), basePackageName, output.getPath());
	        	} else {
	        		generator.generatePlantUMLForFile(input.getPath(), basePackageName, output.getPath());
	        	}
			} catch (Exception e) {
				this.getLog().error(e.getMessage(),e);
			}
        }
    }

    protected boolean checkFile(String filePath) throws MojoExecutionException {
        File file = new File(filePath);
        if (!file.exists()) {
            this.getLog().error("File not found : " + filePath);
            throw new MojoExecutionException("File not found : " + filePath);

        }
        return true;
    }       
}
