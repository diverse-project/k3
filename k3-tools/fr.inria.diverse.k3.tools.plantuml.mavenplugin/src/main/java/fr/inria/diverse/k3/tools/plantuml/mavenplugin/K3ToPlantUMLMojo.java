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
     *
     * @parameter
     * @required
     */
    private File input;
    /**
     * Output plantuml file
     *
     * @parameter
     * @required
     */
    private File outputFile;


    /**
     * base package name
     * base package name will be removed from generated diagram
     * Default is ""
     *
     * @parameter expression=""
     * @required
     */
    private String basePackageName;
    
    
   
    public void execute() throws MojoExecutionException, MojoFailureException {

        //org.apache.log4j.BasicConfigurator.configure();
        //System.out.println("K2CompilerMojo.execute");
    	this.getLog().info("generate a plantUML file "+outputFile.getAbsolutePath()+" from "+input.getAbsolutePath()+" using base package name "+basePackageName);
        /* CHECK IF GENERATION IF OK */
        
        checkFile(input.getAbsolutePath().toString());
        try {
        	K3ToPlantUMLGenerator generator = new K3ToPlantUMLGenerator();
        	
        	if(input.isDirectory()){
        		generator.generatePlantUMLForFolder(input.getPath(), basePackageName, outputFile.getPath());
        	} else {
        		generator.generatePlantUMLForFile(input.getPath(), basePackageName, outputFile.getPath());
        	}
		} catch (Exception e) {
			this.getLog().error(e.getMessage(),e);
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
