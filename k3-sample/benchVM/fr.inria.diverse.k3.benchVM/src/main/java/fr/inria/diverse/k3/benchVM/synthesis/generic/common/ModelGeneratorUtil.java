/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel modified by Olivier Barais. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package fr.inria.diverse.k3.benchVM.synthesis.generic.common;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;

import fr.inria.diverse.k3.benchVM.synthesis.generic.common.attribute.AttributeHandler;
import fr.inria.diverse.k3.benchVM.synthesis.generic.common.attribute.IAttributeSetter;

/**
 * Utility class to generate and change Ecore models. All methods should be
 * accessed in a  way, therefore the constructor is not visible.
 */
public final class ModelGeneratorUtil {

	/**
	 * Set of all EClasses that are contained in EPackages that are currently
	 * registered in the EPackage registry.
	 * 
	 * @see #getAllEClasses()
	 */
	private  List<EClass> allEClasses;

	/**
	 * Set of all EPackages that are currently registered in the EPackage
	 * registry and not contained in any other package.
	 * 
	 * @see #getAllRootEPackages()
	 */
	private  Set<EPackage> rootModelPackages;

	/**
	 * Map that maps EPackages to a set of all their contained EClasses.
	 * 
	 * @see #getAllEClasses(EPackage)
	 */
	private  Map<EPackage, List<EClass>> packageToModelElementEClasses = new LinkedHashMap<EPackage, List<EClass>>();

	/**
	 * Map that maps EReferences to all possible EClasses that can be contained
	 * when using them.
	 * 
	 * @see #getAllEContainments(EReference)
	 */
	private  Map<EReference, List<EClass>> allEContainments = new LinkedHashMap<EReference, List<EClass>>();

	/**
	 * Map that maps EClasses to their subclasses.
	 * 
	 * @see #getAllSubEClasses(EClass)
	 */
	private  Map<EClass, List<EClass>> eClassToSubEClasses = new LinkedHashMap<EClass, List<EClass>>();


	/**
	 * Returns the EPackage to the specified <code>nsURI</code>.
	 * 
	 * @param nsURI
	 *            the NsUri of the EPackage to get
	 * @return the EPackage belonging to <code>nsURI</code>
	 * @see Registry#getEPackage(String)
	 */
	public  EPackage getEPackage(String nsURI) {
		return EPackage.Registry.INSTANCE.getEPackage(nsURI);
	}

	/**
	 * Returns all EPackages on the root level that are currently registered in
	 * the registry.
	 * 
	 * @return a Set of all root EPackages
	 * @see Registry
	 */
	public  Set<EPackage> getAllRootEPackages() {
		// were the root packages computed before?
		if (rootModelPackages != null) {
			return rootModelPackages;
		}
		rootModelPackages = new LinkedHashSet<EPackage>();
		Registry registry = EPackage.Registry.INSTANCE;

		for (Entry<String, Object> entry : registry.entrySet()) {
			EPackage ePackage = registry.getEPackage(entry.getKey());
			// is the current EPackage a root package?
			if (ePackage.getESuperPackage() == null) {
				rootModelPackages.add(ePackage);
			}
		}
		return rootModelPackages;
	}

	/**
	 * Retrieve all EClasses that are contained in <code>ePackage</code>.
	 * 
	 * @param ePackage
	 *            the package to get contained EClasses from
	 * @return a set of EClasses contained in <code>ePackage</code>
	 */
	public  List<EClass> getAllEClasses(EPackage ePackage) {
		if (packageToModelElementEClasses.containsKey(ePackage)) {
			return packageToModelElementEClasses.get(ePackage);
		}
		if (ePackage == null) {
			packageToModelElementEClasses.put(ePackage,
					new LinkedList<EClass>());
			return packageToModelElementEClasses.get(ePackage);
		}
		List<EClass> result = new LinkedList<EClass>();
		// obtain all EClasses from sub packages
		for (EPackage subPackage : ePackage.getESubpackages()) {
			result.addAll(getAllEClasses(subPackage));
		}
		// obtain all EClasses that are direct contents of the EPackage
		for (EClassifier classifier : ePackage.getEClassifiers()) {
			if (classifier instanceof EClass) {
				result.add((EClass) classifier);
			}
		}
		// save the result for upcoming method calls
		packageToModelElementEClasses.put(ePackage, result);
		return result;
	}

	/**
	 * Iterates over all registered EPackages in order to retrieve all available
	 * EClasses, excluding abstract classes and interfaces, and returns them as
	 * a Set.
	 * 
	 * @return a set of all EClasses that are contained in registered EPackages
	 * @see Registry
	 */
	public  List<EClass> getAllEClasses() {
		// were all EClasses computed before?
		if (allEClasses != null) {
			return allEClasses;
		}
		allEClasses = new LinkedList<EClass>();
		Registry registry = EPackage.Registry.INSTANCE;
		// for all registered EPackages
		for (Entry<String, Object> entry : registry.entrySet()) {
			EPackage ePackage = registry.getEPackage(entry.getKey());
			for (EClass eClass : getAllEClasses(ePackage)) {
				// no abstracts or interfaces
				if (canHaveInstance(eClass)) {
					allEClasses.add(eClass);
				}
			}
		}
		return allEClasses;
	}

	/**
	 * Returns all possible EClasses, excluding abstract classes and interfaces,
	 * that can be contained when using <code>reference</code>.
	 * 
	 * @param reference
	 *            the EReference to get containable EClasses for
	 * @return a set of all EClasses that can be contained when using
	 *         <code>reference</code>
	 */
	public  List<EClass> getAllEContainments(EReference reference) {
		if (allEContainments.containsKey(reference)) {
			return allEContainments.get(reference);
		}
		if (reference == null) {
			allEContainments.put(reference, new LinkedList<EClass>());
			return allEContainments.get(reference);
		}
		List<EClass> result = new LinkedList<EClass>();
		EClass referenceType = reference.getEReferenceType();
		// no abstracts or interfaces
		if (canHaveInstance(referenceType)) {
			result.add(referenceType);
		}
		// 'referenceType: EObject' allows all kinds of EObjects
		if (EcorePackage.eINSTANCE.getEObject().equals(referenceType)) {
			return getAllEClasses();
		}
		// all sub EClasses can be referenced as well
		result.addAll(getAllSubEClasses(referenceType));
		// save the result for upcoming method calls
		allEContainments.put(reference, result);
		return result;
	}

	/**
	 * Returns whether <code>eClass</code> can be instantiated or not. An EClass
	 * can be instantiated, if it is neither an interface nor abstract.
	 * 
	 * @param eClass
	 *            the EClass in question
	 * @return whether <code>eClass</code> can be instantiated or not.
	 */
	public  boolean canHaveInstance(EClass eClass) {
		return !eClass.isInterface() && !eClass.isAbstract();
	}

	/**
	 * Returns all subclasses of an EClass, excluding abstract classes and
	 * interfaces.
	 * 
	 * @param eClass
	 *            the EClass to get subclasses for
	 * @return all subclasses of <code>eClass</code>
	 */
	public  List<EClass> getAllSubEClasses(EClass eClass) {
		if (eClassToSubEClasses.containsKey(eClass)) {
			return eClassToSubEClasses.get(eClass);
		}
		if (eClass == null) {
			eClassToSubEClasses.put(eClass, new LinkedList<EClass>());
			return eClassToSubEClasses.get(eClass);
		}
		List<EClass> allEClasses = getAllEClasses();
		List<EClass> result = new LinkedList<EClass>();
		for (EClass possibleSubClass : allEClasses) {
			// is the EClass really a subClass, while not being abstract or an
			// interface?
			if (eClass.isSuperTypeOf(possibleSubClass)
					&& canHaveInstance(possibleSubClass)) {
				result.add(possibleSubClass);
			}
		}
		// save the result for upcoming method calls
		eClassToSubEClasses.put(eClass, result);
		return result;
	}

	/**
	 * Returns all containing references where <code>parentClass</code> is the
	 * container and <code>childClass</code> the containment.
	 * 
	 * @param childClass
	 *            the EClass which shall be contained
	 * @param parentClass
	 *            the EClass to get containment references from
	 * @return all possible container-references as a set
	 */
	public  Set<EReference> getAllPossibleContainingReferences(
			EClass childClass, EClass parentClass) {
		List<EReference> allReferences = parentClass.getEAllContainments();
		Set<EReference> result = new LinkedHashSet<EReference>();
		for (EReference reference : allReferences) {
			EClass referenceType = reference.getEReferenceType();
			if (referenceType == null) {
				continue;
			}
			// is the reference type a perfect match?
			if (referenceType.equals(childClass)) {
				result.add(reference);
				// is the reference type either EObject or a super type?
			} else if (referenceType
					.equals(EcorePackage.eINSTANCE.getEObject())
					|| referenceType.isSuperTypeOf(childClass)) {
				result.add(reference);
			}
		}
		return result;
	}

	/**
	 * Returns all direct and indirect contents of <code>rootObject</code> as a
	 * map. All EObjects that appear in these contents are mapped to their
	 * corresponding EClass.
	 * 
	 * @param rootObject
	 *            the EObject to get contents for
	 * @return all contents as a map from EClass to lists of EObjects
	 */
	public  Map<EClass, List<EObject>> getAllClassesAndObjects(
			EObject rootObject) {
		// initialize the computation process
		Map<EClass, List<EObject>> result = new LinkedHashMap<EClass, List<EObject>>();
		TreeIterator<EObject> allContents = rootObject.eAllContents();
		List<EObject> newList = new LinkedList<EObject>();
		newList.add(rootObject);
		result.put(rootObject.eClass(), newList);
		// iterate over all direct and indirect contents
		while (allContents.hasNext()) {
			EObject eObject = allContents.next();
			// did this EObject's EClass appear before?
			if (result.containsKey(eObject.eClass())) {
				result.get(eObject.eClass()).add(eObject);
			} else {
				newList = new LinkedList<EObject>();
				newList.add(eObject);
				result.put(eObject.eClass(), newList);
			}
		}
		return result;
	}

	/**
	 * Returns all valid references for an EObject. This excludes
	 * container/containment references. A reference is valid if it is neither
	 * derived nor volatile and if it is changeable and either many-valued or
	 * not already set.
	 * 
	 * @param eObject
	 *            the EObject to get references for
	 * @param exceptionLog
	 *            the current log of exceptions
	 * @param ignoreAndLog
	 *            should exceptions be ignored and added to
	 *            <code>exceptionLog</code>?
	 * @return all valid references as a list
	 */
	public  List<EReference> getValidReferences(EObject eObject,
			Set<RuntimeException> exceptionLog, boolean ignoreAndLog) {
		List<EReference> result = new LinkedList<EReference>();
		for (EReference reference : eObject.eClass().getEAllReferences()) {
			if (!reference.isContainer() && !reference.isContainment()
					&& isValid(reference, eObject, exceptionLog, ignoreAndLog)
					&& (reference.isMany() || !eObject.eIsSet(reference))) {
				if (!reference.getName().equals("eTypeArguments"))
					result.add(reference);
			} else {
				if (reference.getName().toLowerCase().equals("etype")) {
					result.add(reference);
					//System.err.println(reference.getName());
				}
			}
		}
		return result;
	}

	/**
	 * Returns whether an EStructuralFeature is valid for an EObject or not. A
	 * reference is valid, if it can be set or added to.
	 * 
	 * @param feature
	 *            the EStructuralFeature in question
	 * @param eObject
	 *            the EObject to check the feature for
	 * @param exceptionLog
	 *            the current log of exceptions
	 * @param ignoreAndLog
	 *            should exceptions be ignored and added to
	 *            <code>exceptionLog</code>?
	 * @return if the feature can be set or added to
	 */
	public  boolean isValid(EStructuralFeature feature, EObject eObject,
			Set<RuntimeException> exceptionLog, boolean ignoreAndLog) {
		boolean result = false;
		try {
			if (feature.isMany()) {
				// has the maximum amount of referenced objects been reached?
				Collection<?> referencedItems = (Collection<?>) eObject
						.eGet(feature);
				if (feature.getUpperBound() >= 0
						&& referencedItems.size() >= feature.getUpperBound()) {
					return false;
				}
			}
			// can the feature be changed reflectively?
			result = feature.isChangeable() /* && !feature.isVolatile() */
					&& !feature.isDerived();

			if (feature.getName().equals("eType"))
				result = true;
			if (feature.getName().equals("defaultValueLiteral"))
				result = false;

			/*
			 * else if (feature.getName().contains("instance")){
			 * System.err.println(result + " : "+ feature.getName());
			 * System.err.println( feature.isChangeable() + " "+
			 * !feature.isVolatile() + " "+ !feature.isDerived()); }
			 */

		} catch (RuntimeException e) {
			handle(e, exceptionLog, ignoreAndLog);
		}
		return result;
	}

	/**
	 * Handles <code>exception</code>, meaning it is thrown if
	 * <code>ignoreAndLog</code> is <code>false</code>. Otherwise
	 * <code>exception</code> is ignored and added to <code>exceptionLog</code>.
	 * 
	 * @param exception
	 *            the exception to handle
	 * @param exceptionLog
	 *            the current log of exceptions
	 * @param ignoreAndLog
	 *            should exceptions be ignored and added to
	 *            <code>exceptionLog</code>?
	 */
	private  void handle(RuntimeException exception,
			Set<RuntimeException> exceptionLog, boolean ignoreAndLog) {
		if (ignoreAndLog) {
			exceptionLog.add(exception);
		} else {
			throw exception;
		}
	}

	/**
	 * Sets a feature between <code>eObject</code> and <code>newValue</code>
	 * using a SetCommand. Exceptions are caught if <code>ignoreAndLog</code> is
	 * true, otherwise a RuntimeException might be thrown if the command fails.
	 * 
	 * @param eObject
	 *            the EObject for which <code>feature</code> shall be set
	 * @param feature
	 *            the EStructuralFeature that shall be set
	 * @param newValue
	 *            the Object that shall be set as a feature in
	 *            <code>parentEObject</code>
	 * @param exceptionLog
	 *            the current log of exceptions
	 * @param ignoreAndLog
	 *            should exceptions be ignored and added to
	 *            <code>exceptionLog</code>?
	 * @return <code>newValue</code> if the <code>SetCommand</code> was
	 *         performed successful or <code>null</code> if it failed
	 * @see SetCommand
	 */
	public  EObject setPerCommand(EObject eObject,
			EStructuralFeature feature, Object newValue,
			Set<RuntimeException> exceptionLog, boolean ignoreAndLog) {
		EditingDomain domain = AdapterFactoryEditingDomain
				.getEditingDomainFor(eObject);
		if (domain == null) {
			// System.err.println("no editing domain for " + eObject);
			// return null;
		} else {
			// System.err.println("editing domain for " + eObject + " " +
			// domain);
		}

		// no new value to set? -> unset the feature
		if (newValue == null) {
			newValue = SetCommand.UNSET_VALUE;
		}
		try {

			eObject.eSet(feature, newValue);
			// new SetCommand(domain, eObject, feature, newValue).doExecute();

			if (newValue instanceof EObject) {
				return (EObject) newValue;
			} else {
				return null;
			}
		} catch (RuntimeException e) {
			handle(e, exceptionLog, ignoreAndLog);
			return null;
		}
	}

	/**
	 * Adds <code>newValue</code> to the many-valued feature of
	 * <code>eObject</code> using an AddCommand. Exceptions are caught if
	 * <code>ignoreAndLog</code> is true, otherwise a RuntimeException might be
	 * thrown if the command fails.
	 * 
	 * @param eObject
	 *            the EObject to which <code>newObject</code> shall be added
	 * @param feature
	 *            the EStructuralFeature that <code>newObject</code> shall be
	 *            added to
	 * @param newValue
	 *            the Object that shall be added to <code>feature</code>
	 * @param exceptionLog
	 *            the current log of exceptions
	 * @param ignoreAndLog
	 *            should exceptions be ignored and added to
	 *            <code>exceptionLog</code>?
	 * @return <code>newValue</code> if the <code>AddCommand</code> was
	 *         performed successful or <code>null</code> if it failed
	 * @see AddCommand#AddCommand(EditingDomain, EObject, EStructuralFeature,
	 *      Object)
	 */
	public  EObject addPerCommand(EObject eObject,
			EStructuralFeature feature, Object newValue,
			Set<RuntimeException> exceptionLog, boolean ignoreAndLog) {
		EditingDomain domain = AdapterFactoryEditingDomain
				.getEditingDomainFor(eObject);
		try {
			if (feature.isUnique()
					&& ((Collection<?>) eObject.eGet(feature))
							.contains(newValue)) {
				// unique feature already contains object -> nothing to do
				return null;
			}
			new AddCommand(domain, eObject, feature, newValue).doExecute();
			if (newValue instanceof EObject) {
				return (EObject) newValue;
			} else {
				return null;
			}
		} catch (RuntimeException e) {
			handle(e, exceptionLog, ignoreAndLog);
			return null;
		}
	}

	/**
	 * Adds all <code>objects</code> to the many-valued feature of
	 * <code>eObject</code> using an AddCommand. Exceptions are caught if
	 * <code>ignoreAndLog</code> is true, otherwise a RuntimeException might be
	 * thrown if the command fails.
	 * 
	 * @param eObject
	 *            the EObject to which <code>objects</code> shall be added
	 * @param feature
	 *            the EReference that <code>objects</code> shall be added to
	 * @param objects
	 *            collection of objects that shall be added to
	 *            <code>feature</code>
	 * @param exceptionLog
	 *            the current log of exceptions
	 * @param ignoreAndLog
	 *            should exceptions be ignored and added to
	 *            <code>exceptionLog</code>?
	 */
	public  void addPerCommand(EObject eObject,
			EStructuralFeature feature, Collection<?> objects,
			Set<RuntimeException> exceptionLog, boolean ignoreAndLog) {
		EditingDomain domain = AdapterFactoryEditingDomain
				.getEditingDomainFor(eObject);
		try {
			for (Object object : objects) {
				if (feature.isUnique()
						&& ((Collection<?>) eObject.eGet(feature))
								.contains(object)) {
					// object already exists in unique feature, don't add it
					// again
					objects.remove(object);
				}
			}
			// no objects to add left
			if (objects.isEmpty()) {
				return;
			}
			new AddCommand(domain, eObject, feature, objects).doExecute();
		} catch (RuntimeException e) {
			handle(e, exceptionLog, ignoreAndLog);
		}
	}

	/**
	 * Removes <code>objects</code> from a feature of <code>eObject</code> using
	 * a RemoveCommand. Exceptions are caught if <code>ignoreAndLog</code> is
	 * true, otherwise a RuntimeException might be thrown if the command fails.
	 * 
	 * @param eObject
	 *            the EObject to remove <code>objects</code> from
	 * @param feature
	 *            the EStructuralFeature <code>objects</code> shall be removed
	 *            from
	 * @param objects
	 *            collection of Objects that shall be removed
	 * @param exceptionLog
	 *            the current log of exceptions
	 * @param ignoreAndLog
	 *            should exceptions be ignored and added to
	 *            <code>exceptionLog</code>?
	 * @see RemoveCommand
	 */
	public  void removePerCommand(EObject eObject,
			EStructuralFeature feature, Collection<?> objects,
			Set<RuntimeException> exceptionLog, boolean ignoreAndLog) {
		EditingDomain domain = AdapterFactoryEditingDomain
				.getEditingDomainFor(eObject);
		try {
			new RemoveCommand(domain, eObject, feature, objects).doExecute();
		} catch (RuntimeException e) {
			handle(e, exceptionLog, ignoreAndLog);
		}
	}

	/**
	 * Retrieves all EClasses from <code>allEClasses</code> that can possibly be
	 * referenced by <code>reference</code> and returns them as a list.
	 * 
	 * @param reference
	 *            the EReference to get EClasses for
	 * @param allEClasses
	 *            set of all possible EClasses
	 * @return list of all EClasses that can be referenced by
	 *         <code>reference</code>
	 */
	public  Set<EClass> getReferenceClasses(EReference reference,
			Set<EClass> allEClasses) {
		Set<EClass> result = new LinkedHashSet<EClass>();
		EClass referenceType = reference.getEReferenceType();
		// 'referenceType: EObject' allows all kinds of EObjects
		if (referenceType.equals(EcorePackage.eINSTANCE.getEObject())) {
			return allEClasses;
		}
		for (EClass eClass : allEClasses) {
			// can eClass be referenced by reference
			if (referenceType.equals(eClass)
					|| referenceType.isSuperTypeOf(eClass)) {
				result.add(eClass);
			}
		}
		return result;
	}

	/**
	 * Sets or adds to a reference for an EObject with any generated instance of
	 * <code>referenceClass</code> using SetCommand/AddCommand. If the reference
	 * is not required, <code>random</code> decides whether the reference is set
	 * or how many EObjects are added to it.
	 * 
	 * @param eObject
	 *            the EObject to set the reference for
	 * @param referenceClass
	 *            the EClass all referenced EObject shall be instances of
	 * @param reference
	 *            the reference to set
	 * @param random
	 *            the Random-object that randomizes EObjects and their amount
	 * @param exceptionLog
	 *            the current log of exceptions
	 * @param ignoreAndLog
	 *            should exceptions be ignored and added to
	 *            <code>exceptionLog</code>?
	 * @param allEObjects
	 *            all existing EObjects mapped to their EClass
	 * 
	 * @see #addPerCommand(EObject, EStructuralFeature, Collection, Set,
	 *      boolean)
	 * @see #addPerCommand(EObject, EStructuralFeature, Object, Set, boolean)
	 * @see #setPerCommand(EObject, EStructuralFeature, Object, Set, boolean)
	 */
	public  void setReference(EObject eObject, EClass referenceClass,
			EReference reference, Random random,
			Set<RuntimeException> exceptionLog, boolean ignoreAndLog,
			Map<EClass, List<EObject>> allEObjects) {
		List<EObject> possibleReferenceObjects = allEObjects
				.get(referenceClass);
		Collections.shuffle(possibleReferenceObjects, random);
		if (!possibleReferenceObjects.isEmpty()) {
			int index = 0;
			if (reference.isMany()) {
				int numberOfReferences = computeFeatureAmount(reference, random);
				for (int i = 0; i < numberOfReferences; i++) {

					EObject target = possibleReferenceObjects.get(index);
					if (reference.getName().equals("eSuperTypes")) {
						if (!target.equals(eObject)) {
							this.addPerCommand(eObject,
									reference,
									possibleReferenceObjects.get(index),
									exceptionLog, ignoreAndLog);
						} /*else
							System.err.println(numberOfReferences +  "  "+ possibleReferenceObjects.size()
									+ "do not generate super types for "
									+ target + " " + eObject);*/

					} else {
						this.addPerCommand(eObject, reference,
								possibleReferenceObjects.get(index),
								exceptionLog, ignoreAndLog);
					}
					// ensures every EObject is set at most once
					if (++index == possibleReferenceObjects.size()) {
						break;
					}
				}
				// Change of referencing
				// Delete reference.isRequired() in order to set 0..1 references
				// } else if (reference.isRequired() || random.nextBoolean()){
			} else {// if (random.nextBoolean()) {
				this.setPerCommand(eObject, reference,
						possibleReferenceObjects.get(index), exceptionLog,
						ignoreAndLog);
			}
		}
	}

	/**
	 * Sets all possible attributes of known types to random values using
	 * {@link IAttributeSetter} and SetCommands/AddCommands.
	 * 
	 * @param eObject
	 *            the EObject to set attributes for
	 * @param random
	 *            the Random object used to determine the creation of attributes
	 * @param exceptionLog
	 *            the current log of exceptions
	 * @param ignoreAndLog
	 *            should exceptions be ignored and added to
	 *            <code>exceptionLog</code>?
	 * @see IAttributeSetter
	 * @see AttributeHandler
	 * @see #addPerCommand(EObject, EStructuralFeature, Collection, Set,
	 *      boolean)
	 * @see #addPerCommand(EObject, EStructuralFeature, Object, Set, boolean)
	 * @see #setPerCommand(EObject, EStructuralFeature, Object, Set, boolean)
	 */
	
	public AttributeHandler attributeHandler = new AttributeHandler();
	public  void setEObjectAttributes(EObject eObject, Random random,
			Set<RuntimeException> exceptionLog, boolean ignoreAndLog) {
		Map<EClassifier, IAttributeSetter<?>> attributeSetters = attributeHandler
				.getAttributeSetters();

		for (EAttribute attribute : eObject.eClass().getEAllAttributes()) {
			EClassifier attributeType = attribute.getEAttributeType();

			if (!isValid(attribute, eObject, exceptionLog, ignoreAndLog)) {
				continue;
			}

			// the attribute setter used to create new attributes
			IAttributeSetter<?> attributeSetter = null;

			// is there a setter for this attribute?
			if (attributeSetters.containsKey(attributeType)) {
				attributeSetter = attributeSetters.get(attributeType);
			} else if (isEnum(attributeType)) {
				attributeSetter = attributeHandler
						.getEEnumSetter((EEnum) attributeType);
			}

			// was there a fitting attribute setter?
			if (attributeSetter != null) {
				if (attribute.isMany()) {
					int numberOfAttributes = computeFeatureAmount(attribute,
							random);
					addPerCommand(eObject, attribute,
							attributeSetter
									.createNewAttributes(numberOfAttributes),
							exceptionLog, ignoreAndLog);
				} else {
					setPerCommand(eObject, attribute,
							attributeSetter.createNewAttribute(), exceptionLog,
							ignoreAndLog);
				}
			}
		}
	}

	/**
	 * Returns whether <code>attributeType</code> is an instance of EEnum.
	 * 
	 * @param attributeType
	 *            the EClassifier in question
	 * @return is <code>attributeType</code> an instance of EEnum?
	 */
	private  boolean isEnum(EClassifier attributeType) {
		return EcorePackage.eINSTANCE.getEEnum().isInstance(attributeType);
	}

	/**
	 * Computes the random amount of objects to add to a feature.
	 * 
	 * @param feature
	 *            the feature to compute the amount of objects for
	 * @param random
	 *            the Random object used to obtain random values
	 * @return 1 if the feature is single valued,<br>
	 *         a random value from 0 to 10 if the feature is many-valued and has
	 *         no upper bound,<br>
	 *         a random value between the feature's lower and upper bound
	 *         otherwise
	 */
	private  int computeFeatureAmount(EStructuralFeature feature,
			Random random) {
		if (!feature.isMany()) {
			return 1;
		}
		if (feature.getUpperBound() < feature.getLowerBound()) {
			return random.nextInt(10);
		}
		return feature.getLowerBound()
				+ random.nextInt(feature.getUpperBound()
						- feature.getLowerBound() + 1);
	}

	/**
	 * Deletes an EObject, while exceptions are handled with the values
	 * specified.
	 * 
	 * @param eObject
	 *            the EObject to delete
	 * @param exceptionLog
	 *            the current log of exceptions
	 * @param ignoreAndLog
	 *            should exceptions be ignored and added to
	 *            <code>exceptionLog</code>?
	 * @see EcoreUtil#delete(EObject)
	 */
	public  void delete(EObject eObject,
			Set<RuntimeException> exceptionLog, boolean ignoreAndLog) {
		try {
			EcoreUtil.delete(eObject, true);

		} catch (RuntimeException e) {
			handle(e, exceptionLog, ignoreAndLog);
		}
	}
}
