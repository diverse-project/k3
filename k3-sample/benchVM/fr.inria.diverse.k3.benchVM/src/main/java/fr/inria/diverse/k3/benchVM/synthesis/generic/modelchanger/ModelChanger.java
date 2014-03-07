/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel modified by Olivier Barais. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package fr.inria.diverse.k3.benchVM.synthesis.generic.modelchanger;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * Class for changing Ecore models automatically,  methods only.
 * Changing a model includes:<br>
 * - deleting random EObjects and all their children<br>
 * - replace attributes by new random values<br>
 * - replace references (no containment references) by new random values
 *
 * @see #generateChanges(EObject)
 * @see #generateChanges(EObject, long, boolean)
 */
public final class ModelChanger {
	
	/**
	 * Private constructor.
	 */
	private ModelChanger() {
		// all methods should be accessed in a  way
	}
	
	/**
	 * Generates changes for the specified root and all its direct and indirect contents 
	 * using default values for <code>seed</code> and <code>ignoreAndLog</code>. 
	 * Changing includes deleting EObjects and their children and replacing all set
	 * attributes and references (no containment-references) with new values.
	 * 
	 * @param rootObject the root EObject
	 * @see #generateChanges(EObject, long, boolean)
	 * @see #generateChanges(EObject, long, boolean, IProgressMonitor)
	 */
	public  void generateChanges(EObject rootObject) {
		generateChanges(rootObject, System.currentTimeMillis(), false);
	}
	
	/**
	 * Generates changes for the specified root and all its direct and indirect contents
	 * using <code>seed</code> to determine random values and <code>ignoreAndLog</code>
	 * to decide whether occurring RuntimeExceptions shall be thrown or logged only.
	 * Changing includes deleting EObjects and their children and replacing all set
	 * attributes and references (no containment-references) with new values. 
	 * 
	 * @param rootObject the root EObject
	 * @param seed value to determine randomness
	 * @param ignoreAndLog should exceptions be ignored and added to the log?
	 * @see #generateChanges(EObject, long, boolean, IProgressMonitor)
	 */
	
	ModelChangerHelper modelChangerHelper = new ModelChangerHelper();
	public  void generateChanges(EObject rootObject, long seed, boolean ignoreAndLog) {
		modelChangerHelper.init(seed, ignoreAndLog);
		Set<EObject> allChildren = modelChangerHelper.getAllChildren(rootObject); 
		deleteRandomEObjects(allChildren,rootObject);
//		changeAttributesAndReferences(rootObject);
	}
	


	
	/**
	 * Randomly deletes EObjects and their children from a set of EObjects.
	 * <code>allChildren</code> shouldn't contain the rootObject, so the
	 * root (and therefore ALL contained EObjects) doesn't get deleted.
	 * 
	 * @param allChildren set of EObjects from which EObjects are selected to be deleted
	 * @see #deleteAllChildren(Set)
	 * @see #deleteRandomEObjects(Set, IProgressMonitor)
	 */
	private  void deleteRandomEObjects(Set<EObject> allChildren,EObject parent) {
		Set<EObject> deletedChildren = new LinkedHashSet<EObject>();
		for(EObject eObject : allChildren) {
//			deleteRandomEObjects(ModelChangerHelper.getAllChildren(eObject), eObject);
			// was the EObject already deleted?
			if(deletedChildren.contains(eObject)) {
				continue;
			}
			
			if(modelChangerHelper.randomDelete()) {//
				
				// copy all children first to prevent concurrent modifications when deleting
				Set<EObject> contentCopy = new LinkedHashSet<EObject>(eObject.eContents());	
				deletedChildren.addAll(deleteAllChildren(contentCopy));
//				if(deleteUsingCommand)
				System.out.println(eObject.toString());
					modelChangerHelper.delete(eObject);
//				else
//					EcoreUtil.delete(eObject,true);
//				
			}
		}
	}
	
	/**
	 * Deletes a list of EObjects and all their direct and indirect contents
	 * recursively.
	 * 
	 * @param children all children that should be deleted
	 * @return all deleted EObjects and all their direct and indirect contents
	 * @see #deleteRandomEObjects(Set)
	 */
	private  Set<EObject> deleteAllChildren(Set<EObject> children) {
		Set<EObject> allDeletedChildren = new LinkedHashSet<EObject>();
		for(EObject child : children) {
			// copy all children first to prevent concurrent modifications when deleting
			Set<EObject> contentCopy = new LinkedHashSet<EObject>(child.eContents());
			allDeletedChildren.addAll(deleteAllChildren(contentCopy));
			modelChangerHelper.delete(child);
			allDeletedChildren.add(child);
		}
		return allDeletedChildren;
	}

	/**
	 * Changes all attributes and references for every child (direct and indirect)
	 * of <code>root</code>.
	 * 
	 * @param root the root EObject of the hierarchy that shall be changed
	 * @see #changeAttributesAndReferences(EObject, IProgressMonitor)
	 * @see #changeEObjectAttributes(EObject)
	 * @see #changeEObjectReferences(EObject, Map)
	 */
	private  void changeAttributesAndReferences(EObject root) {
		Map<EClass, List<EObject>> allObjectsByEClass = modelChangerHelper.modelGeneratorUtil.getAllClassesAndObjects(root);
		for(EClass eClass : allObjectsByEClass.keySet()) {
			for(EObject eObject : allObjectsByEClass.get(eClass)) {
				changeEObjectAttributes(eObject);
				changeEObjectReferences(eObject, allObjectsByEClass);
			}
		}
	}
	

	


	
	/**
	 * Sets all of <code>eObject</code>'s attributes to new values, discarding old ones.
	 * Therefore all values from many-valued attributes are removed using a RemoveCommand.
	 * Single-valued attributes are simply replaced.
	 * 
	 * @param eObject the EObject to change attributes for
	 * @see ModelChangerHelper#clear(EObject, org.eclipse.emf.ecore.EStructuralFeature)
	 * @see ModelChangerHelper#setEObjectAttributes(EObject)
	 */
	private  void changeEObjectAttributes(EObject eObject) {
		// remove all values from currently set attributes
		for(EAttribute attribute : eObject.eClass().getEAllAttributes()) {
			if(modelChangerHelper.isValid(eObject, attribute)) {
				modelChangerHelper.clear(eObject, attribute);
			}
		}
		modelChangerHelper.setEObjectAttributes(eObject);
	}

	/**
	 * Sets all of <code>eObject</code>'s references to new values, discarding old ones.
	 * Therefore all values from many-valued references are removed using a RemoveCommand.
	 * Single-valued references are simply replaced.
	 * 
	 * @param eObject the EObject to change references for
	 * @see ModelChangerHelper#clear(EObject, org.eclipse.emf.ecore.EStructuralFeature)
	 * @see ModelChangerHelper#setReference(EObject, EClass, EReference, Map)
	 */
	private  void changeEObjectReferences(EObject eObject, Map<EClass, List<EObject>> allObjectsByEClass) {
		for(EReference reference : modelChangerHelper.getValidReferences(eObject)) {
			if(modelChangerHelper.isValid(eObject, reference)) {
				modelChangerHelper.clear(eObject, reference);
			}
			for(EClass nextReferenceClass : modelChangerHelper.modelGeneratorUtil.getReferenceClasses(reference, allObjectsByEClass.keySet())) {
				modelChangerHelper.setReference(eObject, nextReferenceClass, reference, allObjectsByEClass);
			}
		}
	}
	
	/**
	 * Returns the Exception-Log for the last {@link #generateChanges()}-call.
	 * The log is empty if no RuntimeException occurred or <code>ignoreAndLog</code>
	 * was set to <code>false</code>.
	 * 
	 * @return a set of RuntimeExceptions that occurred during the last changing process
	 */
	public  Set<RuntimeException> getLog() {
		return modelChangerHelper.getExceptionLog();
	}
}
