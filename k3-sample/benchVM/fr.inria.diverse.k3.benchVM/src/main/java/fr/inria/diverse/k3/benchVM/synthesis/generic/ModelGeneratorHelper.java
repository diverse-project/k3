/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. modified by Olivier Barais All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package fr.inria.diverse.k3.benchVM.synthesis.generic;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.inria.diverse.k3.benchVM.synthesis.generic.common.ModelGeneratorConfiguration;
import fr.inria.diverse.k3.benchVM.synthesis.generic.common.ModelGeneratorUtil;
import fr.inria.diverse.k3.benchVM.synthesis.generic.common.attribute.AttributeHandler;

/**
 * Helper class that takes work from <code>ModelGenerator</code>.
 * With the help of this class, <code>ModelGenerator</code> only
 * has to be aware of its current configuration. All methods
 * should be accessed in a  way and <code>init()</code>
 * has to be called every time before starting a generation process. 
 * 
 * @see ModelGenerator
 * @see #init(ModelGeneratorConfiguration)
 */
public final class ModelGeneratorHelper {
	
	/**
	 * The configuration containing settings for the generation process.
	 * 
	 * @see ModelGeneratorConfiguration
	 */
	private  ModelGeneratorConfiguration configuration;
	
	/**
	 * A set of RuntimeExceptions that occurred during the last generation process.
	 * 
	 * @see #getExceptionLog()
	 */
	private  Set<RuntimeException> exceptionLog;

	/**
	 * All EClasses that shall be ignored during the generation process.
	 * These EClasses are specified in the configuration.
	 * 
	 * @see #getEClassesToIgnore()
	 */
	private  Set<EClass> eClassesToIgnore;

	/**
	 * Map that maps every EClass to its corresponding list of EClasses,
	 * that should be created during the generation process.
	 * 
	 * @see #getElementsToCreate(EReference)
	 */
	private  Map<EReference, List<EClass>> eClassToElementsToCreate;

	/**
	 * Map that saves the last used index for every EClass
	 * to prevent that every instance of that EClass contains
	 * the same EClasses as children.
	 * 
	 * @see #getStartingIndex(EClass)
	 */
	private  Map<EClass, Integer> eClassToLastUsedIndex;

	/**
	 * Random-object to compute random values for creating EObjects
	 * and setting their attributes and references.
	 */
	private  Random random;

	
	
	/**
	 * Initializes the helper for the next generation process.
	 * All private fields get new values, old ones are discarded.
	 * This also initializes <code>AttributeHandler</code>.
	 * 
	 * @param config the new configuration to use
	 * @see AttributeHandler#setRandom(Random)
	 */
	
	
	protected  void init(ModelGeneratorConfiguration config) {
		configuration = config;
		random = new Random(config.getSeed());
		exceptionLog = new LinkedHashSet<RuntimeException>();
		eClassesToIgnore = getEClassesToIgnore();
		eClassToElementsToCreate = new LinkedHashMap<EReference, List<EClass>>();
		eClassToLastUsedIndex = new LinkedHashMap<EClass, Integer>();
		modelGeneratorUtil.attributeHandler.setRandom(random);
	}
	
	/**
	 * Computes the total amount of work to do (in units) during the generation process.
	 * This number is used for the Progress Bar and is twice the number of all EObjects 
	 * that will be created (once for the creation, once for setting its references). 
	 * 
	 * @return the total amount of work in units as an integer
	 */
	protected  int computeAmountOfWork() {
		int result = 0;
		// compute number of all elements
		for(int i=1; i<=configuration.getDepth(); i++) {
			result += (int) Math.pow(configuration.getWidth(), i);
		}
		// return double of the computed amount, once for creation, once for setting references
		return result*2;
	}

	/**
	 * Creates a valid instance of <code>childClass</code> (includes setting attributes) and sets
	 * it as a child of <code>parentEObject</code> using AddCommand/SetCommand.
	 * 
	 * @param parentEObject the EObject that shall contain the new instance of <code>childClass</code>
	 * @param childClass the EClass of the child that shall be contained in <code>parentEObject</code>
	 * @param reference the containment reference
	 * @return the instance of <code>childClass</code> that is contained in <code>parentEObject</code>
	 * or <code>null</code> if the operation failed
	 * 
	 * @see ModelGeneratorUtil#addPerCommand(EObject, EStructuralFeature, Object, Set, boolean)
	 * @see ModelGeneratorUtil#setPerCommand(EObject, EStructuralFeature, Object, Set, boolean)
	 */
	
	ModelGeneratorUtil modelGeneratorUtil = new ModelGeneratorUtil();
	public ModelGeneratorUtil getModelGeneratorUtil() {
		return modelGeneratorUtil;
	}

	protected EObject setContainment(EObject parentEObject, EClass childClass, EReference reference) {
		// create and set attributes
		EObject newEObject = EcoreUtil.create(childClass);
		
		modelGeneratorUtil.setEObjectAttributes(newEObject, random,	exceptionLog, configuration.getIgnoreAndLog());
		// reference created EObject to the parent
		if(reference.isMany()) {
			return modelGeneratorUtil.addPerCommand(parentEObject, reference, newEObject,
				exceptionLog, configuration.getIgnoreAndLog());
		}
		else {
			return modelGeneratorUtil.setPerCommand(parentEObject, reference, newEObject,
				exceptionLog, configuration.getIgnoreAndLog());
		}
	}

	/**
	 * Validates <code>rootEObject</code> so the root is a valid EObject instance.
	 * If <code>rootEObject</code> is valid already, it is just returned. Otherwise, 
	 * if <code>rootEObject</code> is an EClass (not abstract, no interface), it is 
	 * instantiated and its attributes are set. If none of the above is true, null is returned.
	 * 
	 * @param rootEObject the EObject to validate
	 * @return <code>null</code> if <code>rootEObject</code> is <code>null</code> or an
	 * abstract EClass or interface,<br>
	 * <code>rootEObject</code> if the root is already valid,<br>
	 * a new instance of <code>rootEObject</code> if it is an EClass
	 */
	protected  EObject validateRoot(EObject rootEObject) {
		if(rootEObject == null) {
			throw new IllegalArgumentException("Root mustn't be null!");
		}
		if(rootEObject instanceof EClass) {
			EClass parentClass = (EClass) rootEObject;
			if(parentClass.isInterface() || parentClass.isAbstract()) {
				throw new IllegalArgumentException("Root mustn't be abstract or an interface!");
			}
			rootEObject = EcoreUtil.create(parentClass);
			modelGeneratorUtil.setEObjectAttributes(rootEObject, random, exceptionLog, configuration.getIgnoreAndLog());
		}
		return rootEObject;
	}

	/**
	 * Returns all EClasses that shall be excluded from the generation process,
	 * using the <code>eClassesToIgnore</code>-collection from the configuration.
	 * Every subclass of the specified EClasses is ignored as well.
	 * 
	 * @return all EClasses that shall be ignored as a set
	 */
	protected  Set<EClass> getEClassesToIgnore() {
		Set<EClass> result = new LinkedHashSet<EClass>();
		for(EClass eClass : configuration.getEClassesToIgnore()) {
			result.add(eClass);
			result.addAll(modelGeneratorUtil.getAllSubEClasses(eClass));
		}
		return result;
	}

	/**
	 * Returns all EClasses that can possibly be created as children for <code>reference</code>.
	 * The result is shuffled before it is returned, so different seeds return different results.
	 * Only EClasses that are also contained in the configuration's <code>modelPackage</code>
	 * and not in the <code>eClassesToIgnore</code>-collection are retained.
	 * 
	 * @param reference the EReference to compute the possible child EClasses for 
	 * @return all possible child-EClasses as a list
	 * @see ModelGeneratorUtil#getAllEContainments(EReference)
	 * @see ModelGeneratorUtil#getAllEClasses(EPackage)
	 * @see #eClassesToIgnore
	 */
	protected  List<EClass> getElementsToCreate(EReference reference) {
		if(eClassToElementsToCreate.containsKey(reference)) {
			return eClassToElementsToCreate.get(reference);
		} else {
			List<EClass> result = new LinkedList<EClass>(modelGeneratorUtil.getAllEContainments(reference));
			List<EClass> modelElementEClasses = modelGeneratorUtil.getAllEClasses(configuration.getModelPackage());
			// only retain EClasses that are not explicitly excluded and also appear in the specified EPackage
			result.retainAll(modelElementEClasses);
			result.removeAll(eClassesToIgnore);
			Collections.shuffle(result, random);
			// save the result for upcoming method-calls
			eClassToElementsToCreate.put(reference, result);
			return result;
		}
	}

	/**
	 * Stores the last used index of <code>eClass</code> in the 
	 * corresponding map for later use.
	 * 
	 * @param eClass the EClass to store the index for
	 * @param index the latest used index for that EClass
	 * @see #getStartingIndex(EClass)
	 */
	protected  void updateIndex(EClass eClass, int index) {
		eClassToLastUsedIndex.put(eClass, index);
	}
	
	/**
	 * Returns an index that hasn't been used before, if existent.
	 * This prevents that an EClass always contains the same EClasses as children,
	 * where <code>eClass</code> is the parentEObject's EClass.
	 * 
	 * @param eClass the EClass to get the index for 
	 * @return the last used index or 0 if this EClass hasn't been instantiated before
	 */
	protected  int getStartingIndex(EClass eClass) {
		if(eClassToLastUsedIndex.containsKey(eClass)) {
			return eClassToLastUsedIndex.get(eClass);
		} else {
			return 0;
		}
	}

	/**
	 * Gets the next valid EClass from a list of EClasses. A valid EClass is an
	 * EClass that is neither abstract nor an interface and can therefore be
	 * instantiated.
	 * 
	 * @param elementsToCreate the list of usable EClasses
	 * @param index the next index to use
	 * @return the next valid EClass or <code>null</code> if there is none
	 */
	protected  EClass getNextClassToCreate(List<EClass> elementsToCreate, int index) {
		if(elementsToCreate.isEmpty()) {
			return null;
		}
		index %= elementsToCreate.size();
		EClass result = elementsToCreate.get(index);
		// repeat until result can be instantiated
		while(!modelGeneratorUtil.canHaveInstance(result)) {
			// current result can't be instantiated -> remove it
			elementsToCreate.remove(result);
			if(elementsToCreate.isEmpty()) {
				return null;
			}
			// index might be out of bounds now
			index %= elementsToCreate.size();
			result = elementsToCreate.get(index);
		}
		return result;
	}
	
	/**
	 * Returns random valid reference if there is any.
	 *  
	 * @param eObject the EObject belonging to the EReference
	 * @param possibleReferences all possible references as a list
	 * @return a random valid EReference or <code>null</code> if there is none
	 */
	protected  EReference getRandomReference(EObject eObject, List<EReference> possibleReferences) {
		if(possibleReferences.isEmpty()) {
			return null;
		}
		Collections.shuffle(possibleReferences, random);
		EReference result = possibleReferences.get(0);
		// repeat until result is valid
		while(!isValid(eObject, result)) {
			// current result isn't valid -> remove it
			possibleReferences.remove(result);
			if(possibleReferences.isEmpty()) {
				return null;
			}
			result = possibleReferences.get(0);
		}
		return result;
	}

	/**
	 * Sets a reference, if it is valid,
	 * using {@link ModelGeneratorUtil#setReference}.
	 * 
	 * @param eObject the EObject to set the reference for
	 * @param referenceClass the EClass of EObjects that shall be referenced
	 * @param reference the EReference that shall be set
	 * @param allEObjects all possible EObjects that can be referenced
	 * @see ModelGeneratorUtil#setReference(EObject, EClass, EReference, Random, Set, boolean, Map)
	 */
	protected  void setReference(EObject eObject, EClass referenceClass, EReference reference,
		Map<EClass, List<EObject>> allEObjects) {
		
		if(!modelGeneratorUtil.isValid(reference, eObject, exceptionLog, configuration.getIgnoreAndLog())) {			
			return;
		}
		modelGeneratorUtil.setReference(eObject, referenceClass, reference, random,
			exceptionLog, configuration.getIgnoreAndLog(), allEObjects);
	}
	
	/**
	 * Returns the Exception-Log of the <code>ModelGenerator</code>.
	 * The log is cleared after every {@link #init(ModelGeneratorConfiguration)}-call,
	 * i.e. before every generation process.
	 * The log will be empty if no RuntimeException occurred or <code>ignoreAndLog</code>
	 * was set to <code>false</code> in the last configuration used.
	 * 
	 * @return a set of RuntimeExceptions that occurred during the last generation process
	 */
	protected  Set<RuntimeException> getExceptionLog() {
		return exceptionLog;
	}

	/**
	 * Returns all valid non-containment references for an EObject
	 * using {@link ModelGeneratorUtil#getValidReferences}.
	 * 
	 * @param eObject the EObject to retrieve valid EReferences for
	 * @return all valid non-containment references as a list
	 */
	protected  List<EReference> getValidReferences(EObject eObject) {
		return modelGeneratorUtil.getValidReferences(eObject, exceptionLog, configuration.getIgnoreAndLog());
	}

	/**
	 * Returns whether an EReference is valid for a given EObject or not. 
	 * This method uses {@link ModelGeneratorUtil#isValid}.
	 * 
	 * @param eObject the EObject <code>reference</code> belongs to
	 * @param reference the EReference in question
	 * @return whether <code>reference</code> is valid or not
	 */
	protected  boolean isValid(EObject eObject, EReference reference) {
		boolean result = reference.isMany() || eObject.eIsSet(reference);
		return result && modelGeneratorUtil.isValid(reference, eObject, exceptionLog, configuration.getIgnoreAndLog());
	}

}
