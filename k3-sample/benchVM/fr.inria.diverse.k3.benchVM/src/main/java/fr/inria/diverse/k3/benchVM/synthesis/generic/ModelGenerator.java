/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel . modified by Olivier Barais. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package fr.inria.diverse.k3.benchVM.synthesis.generic;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import fr.inria.diverse.k3.benchVM.synthesis.generic.common.ModelGeneratorConfiguration;

/**
 * Class for generating Ecore models,  methods only.
 * Generating a model includes:<br>
 * - creating EObjects from a certain model package<br>
 * - building up a hierarchy starting from a certain root EObject<br>
 * - setting random attributes for every created EObject<br>
 * - setting references between the EObjects
 *
 * @see #generateModel(EPackage, EObject)
 * @see #generateModel(ModelGeneratorConfiguration)
 * @see #generateModel(ModelGeneratorConfiguration, IProgressMonitor)
 */
public final class ModelGenerator {

	/**
	 * The configuration containing settings for the generation process.
	 * 
	 * @see ModelGeneratorConfiguration
	 */
	private  ModelGeneratorConfiguration config;
	
	
	/**
	 * Generates EObjects for a certain model indicated by <code>modelPackage</code> and adds them 
	 * as children to <code>rootEObject</code>, setting attributes and references. This method uses
	 * default values for <code>width, depth, seed</code> and <code>ignoreAndLog</code>.<p>
	 * This method call is equivalent to<br>
	 * <code>generateModel(new ModelGeneratorConfiguration(modelPackage, rootEObject))</code>.
	 * 
	 * @param modelPackage the EPackage to create new EObjects from
	 * @param rootEObject the EObject that shall be the root container for all generated EObjects
	 * @return the validated root EObject of the resulting Ecore hierarchy
	 */
	public  EObject generateModel(EPackage modelPackage, EObject rootEObject) {
		return generateModel(new ModelGeneratorConfiguration(modelPackage, rootEObject));
	}
	
	/**
	 * Generates EObjects using the settings specified in <code>config</code>.
	 * 
	 * @param configuration the ModelGeneratorConfiguration to use for generating EObjects
	 * @return the validated root EObject of the resulting Ecore hierarchy
	 * @see ModelGeneratorConfiguration
	 */
	
	ModelGeneratorHelper modelGeneratorHelper = new ModelGeneratorHelper();
	public ModelGeneratorHelper getModelGeneratorHelper() {
		return modelGeneratorHelper;
	}

	public  EObject generateModel(ModelGeneratorConfiguration configuration) {
		config = configuration;
		modelGeneratorHelper.init(config);
		EObject rootEObject = generateModel();
		Map<EClass, List<EObject>> allObjectsByEClass = modelGeneratorHelper.modelGeneratorUtil.getAllClassesAndObjects(rootEObject);
		for(EClass eClass : allObjectsByEClass.keySet()) {
			for(EObject generatedEObject : allObjectsByEClass.get(eClass)) {
				if (generatedEObject != null)
					generateReferences(generatedEObject, allObjectsByEClass);			
				else
					System.err.println("starnge");			
				
			}
		}
		return rootEObject;
	}
	
	
	
	/**
	 * The method that actually performs the generation. This can only be
	 * accessed by calling {@link #generateModel(EPackage, EObject)} or
	 * {@link #generateModel(ModelGeneratorConfiguration)}
	 * 
	 * @return the valid root EObject used for generating the model
	 * @see #generateModel(EPackage, EObject)
	 * @see #generateModel(ModelGeneratorConfiguration)
	 */
	private  EObject generateModel() {
		EObject rootEObject = modelGeneratorHelper.validateRoot(config.getRootEObject());
		Map<Integer, List<EObject>> depthToParentObjects = new LinkedHashMap<Integer, List<EObject>>();
		List<EObject> parentsInThisDepth = new LinkedList<EObject>();
		parentsInThisDepth.add(rootEObject);
		int currentDepth = 1;
		depthToParentObjects.put(2, new LinkedList<EObject>());
		while(currentDepth <= config.getDepth()) {
			// for all parent EObjects in this depth
			for(EObject nextParentEObject : parentsInThisDepth) {
				List<EObject> children = generateChildren(nextParentEObject); 
				// will the just created EObjects have children?
				if(currentDepth < config.getDepth()) {
					depthToParentObjects.get(currentDepth+1).addAll(children);
				}
			}
			// proceed to the next level
			currentDepth++;
			parentsInThisDepth = depthToParentObjects.get(currentDepth);
			depthToParentObjects.put((currentDepth+1), new LinkedList<EObject>());
		}
		return rootEObject;
	}
	

	
	/**
	 * Generates children for a certain parent EObject. Generation includes
	 * setting containment references and attributes. All required references
	 * are set first, thus the specified width might be exceeded.
	 * 
	 * @param parentEObject the EObject to generate children for
	 * @return all generated children as a list
	 * @see #generateContainments(EObject, EReference, int)
	 */
	private  List<EObject> generateChildren(EObject parentEObject) {
		List<EObject> result = new LinkedList<EObject>();
		// set all valid required references
		for(EReference reference : parentEObject.eClass().getEAllContainments()) {
			if(!modelGeneratorHelper.isValid(parentEObject, reference)) {
				continue;
			}
			// reference's lowerBound is the maximum amount -> only necessary EObjects are created
			result.addAll(generateContainments(parentEObject, reference, reference.getLowerBound()));
		}
		List<EReference> possibleReferences = new LinkedList<EReference>(parentEObject.eClass().getEAllContainments()); 
		// set all possible references until width EObjects are created
		for(int i=result.size(); i<config.getWidth() && !possibleReferences.isEmpty(); i++) {
			EReference reference = modelGeneratorHelper.getRandomReference(parentEObject, possibleReferences);
			if(reference==null) {
				possibleReferences.remove(reference);
				i--;
				continue;
			}
			// create only one child to guarantee variety
			List<EObject> newChildren = generateContainments(parentEObject, reference, 1);
			if(newChildren.isEmpty()) {
				possibleReferences.remove(reference);
				i--;
			}
			result.addAll(newChildren);
		}
		return result;
	}
	
	/**
	 * Creates <code>maxAmount</code> EObjects, if possible, and adds them as children
	 * to <code>parentEObject</code>.
	 * 
	 * @param parentEObject the EObject to add the created children to
	 * @param reference the reference used to add the created children
	 * @param maxAmount the maxAmount of EObjects to create as children
	 * @return all created children as a list
	 */
	private  List<EObject> generateContainments(EObject parentEObject, 
			EReference reference, int maxAmount) {
		// initialize the generation process
		List<EObject> result = new LinkedList<EObject>();
		int index = modelGeneratorHelper.getStartingIndex(parentEObject.eClass());
		List<EClass> elementsToCreate = modelGeneratorHelper.getElementsToCreate(reference);
		// repeat maxAmount times
		for(int i=0; i<maxAmount; i++) {
			EClass currentChildClass = modelGeneratorHelper.getNextClassToCreate(elementsToCreate, index++);
			if(currentChildClass==null) {
				// no possible child left -> cancel the process
				break;
			}
			// create child and add it to parentEObject
			EObject newChild = modelGeneratorHelper.setContainment(parentEObject, currentChildClass, reference);
			// was creating the child successful?
			if(newChild!=null) {
				result.add(newChild);
			}
		}
		// save index for later use
		modelGeneratorHelper.updateIndex(parentEObject.eClass(), index);
		return result;
	}

	/**
	 * Returns the Exception-Log for the last {@link #generateModel()}-call.
	 * The log is empty if no RuntimeException occurred or <code>ignoreAndLog</code>
	 * was set to <code>false</code> in the last configuration used.
	 * 
	 * @return a set of RuntimeExceptions that occurred during the last generation process
	 */
	public  Set<RuntimeException> getLog() {
		return modelGeneratorHelper.getExceptionLog();
	}

	/**
	 * Generates references (no containment references) for an EObject.
	 * All valid references are set with EObjects generated during the generation process.
	 * 
	 * @param eObject the EObject to set references for
	 * @param allObjectsByEClass all possible EObjects that can be referenced, mapped to their EClass 
	 * @see ModelGeneratorHelper#setReference(EObject, EClass, EReference, Map)
	 */
	private  void generateReferences(EObject eObject, Map<EClass, List<EObject>> allObjectsByEClass) {
		for(EReference reference : modelGeneratorHelper.getValidReferences(eObject)) {
			for(EClass nextReferenceClass : modelGeneratorHelper.modelGeneratorUtil.getReferenceClasses(reference, allObjectsByEClass.keySet())) {
				modelGeneratorHelper.setReference(eObject, nextReferenceClass, reference, allObjectsByEClass);
			}
		}
	}
}
