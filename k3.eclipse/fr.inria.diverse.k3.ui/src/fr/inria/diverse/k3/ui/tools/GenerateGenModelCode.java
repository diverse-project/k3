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
package fr.inria.diverse.k3.ui.tools;

import java.io.File;
import java.util.Collections;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenModelGeneratorAdapterFactory;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import fr.inria.diverse.k3.ui.wizards.pages.NewK3ProjectWizardFields;

public class GenerateGenModelCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GenerateGenModelCode t = new GenerateGenModelCode();
		t.createGenModel("My.ecore", "TEST");
	}

	org.eclipse.emf.codegen.ecore.Generator generator;
	
	public Boolean existGenModel (NewK3ProjectWizardFields context) {
		int i = 0;
		Boolean bRet = false;
		int endIndex = context.ecoreIFile.getLocation().toOSString().length();
		int beginIndex = endIndex - context.ecoreIFile.getName().length();
		String pathFolder = context.ecoreIFile.getLocation().toOSString().substring(0, beginIndex);
		
		File folder = new File(pathFolder);
		
		for(i=0 ; i < folder.list().length ; i++){ 
			if(folder.list()[i].endsWith(".genmodel") == true){
				context.genModelFile = folder.listFiles()[i].getPath();
				bRet = true;
			}
		}
		
		return bRet;
	}

	public String getBasePackage(String genModelFile) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"genmodel",
				new org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl());
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getURIConverter().getURIMap()
		.putAll(EcorePlugin.computePlatformURIMap(true));
		URI genModelURI = URI.createFileURI(genModelFile);
		Resource resource = resourceSet.getResource(genModelURI, true);
		GenModel eltGenModel = (GenModel)resource.getContents().get(0);
		
		return eltGenModel.getGenPackages().get(0).getBasePackage();
	}
	
	public void createGenModel(String ecorepath, String outputPath) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"ecore",
				new org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"genmodel",
				new org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl());

		IPath ecorePath = new Path(ecorepath);
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getURIConverter().getURIMap()
				.putAll(EcorePlugin.computePlatformURIMap(true));
		URI ecoreURI = URI.createFileURI(ecorePath.toString());
		Resource resource = resourceSet.getResource(ecoreURI, true);
		EPackage ePackage = (EPackage) resource.getContents().get(0);

		IPath genModelPath = ecorePath.removeFileExtension().addFileExtension(
				"genmodel");

		URI genModelURI = URI.createFileURI(genModelPath.toString());
		Resource genModelResource = Resource.Factory.Registry.INSTANCE
				.getFactory(genModelURI).createResource(genModelURI);

		GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
		genModelResource.getContents().add(genModel);
		resourceSet.getResources().add(genModelResource);
		genModel.setModelDirectory("/" + outputPath + "/src");
		genModel.getForeignModel().add(ecorePath.toString());
		genModel.initialize(Collections.singleton(ePackage));
		GenPackage genPackage = (GenPackage) genModel.getGenPackages().get(0);
		genModel.setModelName(genModelURI.trimFileExtension().lastSegment());

		genPackage.setPrefix(genPackage.getNSName());
		genPackage.setBasePackage("");

		File f = new File(outputPath);
		deleteDirectory(f);
		f.mkdir();
		EcorePlugin.getPlatformResourceMap().put(outputPath,
				URI.createFileURI(f.getAbsolutePath() + "/"));
		this.generate(genModel);
	}

	public void generate(GenModel genModel) {
		// Generate Code

		genModel.setCanGenerate(true);
		GeneratorAdapterFactory.Descriptor.Registry.INSTANCE.addDescriptor(
				GenModelPackage.eNS_URI,
				GenModelGeneratorAdapterFactory.DESCRIPTOR);

		// Create the generator and set the model-level input object.
		Generator generator = new Generator();
		generator.setInput(genModel);

		// Generator model code.
		Diagnostic d = generator.generate(genModel,
				GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE,
				new BasicMonitor.Printing(System.out));
		System.out.println(d.getMessage());

	}

	public boolean deleteDirectory(File path) {
		if (path.exists()) {
			File[] files = path.listFiles();
			for (int i = 0; i < files.length; i++) {
				if (files[i].isDirectory()) {
					deleteDirectory(files[i]);
				} else {
					files[i].delete();
				}
			}
		}
		return (path.delete());
	}

}
