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
import java.util.ArrayList;
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
     * @parameter
     * @required
     */
    private File input;
    
    /**
     * Input xtend file or folder containing xtend files that are used as base for K3 aspects
     * if processIndividually is set to true, a matching based on name will be applied to associate the content from  input and inputCompanionBase.
     * works only if input and inputCompanionBase are folders.
     * @parameter
     */
    private File inputCompanionBase;
    
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
     * base package name will be removed from generated diagram
     * Default is ""
     *
     * @parameter default-value=""
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
    	this.getLog().info("K3 to plantuml output: "+output.getAbsolutePath());
        /* CHECK IF GENERATION IF OK */
        
        checkFile(input.getAbsolutePath().toString());
        if(processIndividually){
        	if(input.isDirectory() && output.isDirectory()){
        		for(File f :input.listFiles()){
        	    	this.getLog().info("Processing "+input.getAbsolutePath()+" using base package name "+basePackageName);
        			K3ToPlantUMLGenerator generator = new K3ToPlantUMLGenerator();
        			String outputPathForItem =output.getPath() +File.separator;
        			if(f.isDirectory()){
        				List<String> inputFolderPathes = new ArrayList<String>();
        				inputFolderPathes.add(f.getPath());
        				if(inputCompanionBase != null && inputCompanionBase.isDirectory()){
        					// look for a possible companion folder
        					for(File companionFile : inputCompanionBase.listFiles()){
        						if(companionFile.getName().equals(f.getName())){
        							this.getLog().info("Found companion folder "+companionFile.getAbsolutePath());
        							inputFolderPathes.add(companionFile.getPath());
        							break;
        						}
        					}
        				} 
    	        		generator.generatePlantUMLForFolders(inputFolderPathes, 
    	        				basePackageName, 
    	        				outputPathForItem + f.getName() + File.separator + genSubFolder + File.separator + f.getName() +".plantuml");
    	        	} else if(f.getName().endsWith(".xtend")){
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
    	    	this.getLog().info("Processing "+input.getAbsolutePath()+" using base package name "+basePackageName);
	        	K3ToPlantUMLGenerator generator = new K3ToPlantUMLGenerator();
	        	
	        	if(input.isDirectory()){
	        		List<String> inputFolderPathes = new ArrayList<String>();
    				inputFolderPathes.add(input.getPath());
	        		if(inputCompanionBase != null && inputCompanionBase.isDirectory()){
    					// look for a possible companion folder
    					for(File companionFile : inputCompanionBase.listFiles()){
    						if(companionFile.getName().equals(input.getName())){
    							this.getLog().info("Found companion folder "+companionFile.getAbsolutePath());
    							inputFolderPathes.add(companionFile.getPath());
    							break;
    						}
    					}
    				}
	        		generator.generatePlantUMLForFolders(inputFolderPathes, basePackageName, output.getPath());
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
