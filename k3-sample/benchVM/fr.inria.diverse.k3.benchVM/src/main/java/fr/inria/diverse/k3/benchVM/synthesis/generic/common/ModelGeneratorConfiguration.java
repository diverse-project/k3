/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel modified by Olivier Barais. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package fr.inria.diverse.k3.benchVM.synthesis.generic.common;

import java.util.Collection;
import java.util.LinkedHashSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * Configuration class, allowing to define the configurations for generating
 * Ecore models with the <code>ModelGenerator</code>.
 * All fields can be accessed by either constructors or getters and setters.
 */
public class ModelGeneratorConfiguration {
	
	/**
	 * The EPackage to receive EClasses from.
	 * NO default value available. 
	 */
	private EPackage modelPackage;
	
	/**
	 * The EObject that shall be the root of the generated model.
	 * NO default value available .
	 */
	private EObject rootEObject;
	
	/**
	 * Collection of EClasses, that shall not be instantiated during the generation process.
	 * All subclasses of the EClasses specified here will be ignored as well.
	 * Defaults to an empty set.
	 */
	private Collection<EClass> eClassesToIgnore;
	
	/**
	 * Seed-value used for Random.
	 * Defaults to {@link System#currentTimeMillis()}.
	 */
	private long seed;
	
	/**
	 * Maximum width of models to generate.
	 * Defaults to 3.
	 */
	private int width = 3;
	
	/**
	 * Maximum value of the generated model's hierarchy depth.
	 * Defaults to 3. 
	 */
	private int depth = 3;
	
	
	/**
	 * Should exceptions be ignored and logged during the generation process?
	 * Defaults to false.
	 */
	private boolean ignoreAndLog;
	
	/**
	 * Constructor that only takes an EPackage and an EObject.
	 * <code>seed, width, depth, ignoreAndLog</code> and <code>eClassesToIgnore</code>
	 * use default values.
	 * 
	 * @param modelPackage the EPackage to retrieve EClasses to generate from
	 * @param rootObject the EObject that shall be the root container of all generated EObjects
	 * @see #ModelGeneratorConfiguration(EPackage, EObject, int, int)
	 * @see #ModelGeneratorConfiguration(EPackage, EObject, Collection, long, int, int, boolean)
	 */
	public ModelGeneratorConfiguration(EPackage modelPackage, EObject rootObject) {
		this.modelPackage = modelPackage;
		this.rootEObject = rootObject;
		eClassesToIgnore = new LinkedHashSet<EClass>();
		seed = System.currentTimeMillis();
	}
	
	/**
	 * Constructor that takes an EPackage and an EObject as well as width and depth of the
	 * model to generate.
	 * <code>seed</code>, <code>ignoreAndLog</code> and <code>eClassesToIgnore</code> use default values.
	 * 
	 * @param modelPackage the EPackage to retrieve EClasses to generate from
	 * @param rootObject the EObject that shall be the root container of all generated EObjects
	 * @param width maximum number of children each EObject should have
	 * @param depth maximum hierarchy depth of the model
	 * @see #ModelGeneratorConfiguration(EPackage, EObject)
	 * @see #ModelGeneratorConfiguration(EPackage, EObject, Collection, long, int, int, boolean)
	 */
	public ModelGeneratorConfiguration(EPackage modelPackage, EObject rootObject, int width, int depth) {
		this.modelPackage = modelPackage;
		this.rootEObject = rootObject;
		eClassesToIgnore = new LinkedHashSet<EClass>();
		this.depth = depth;
		this.width = width;
		seed = System.currentTimeMillis();
	}
		
	/**
	 * Constructor that uses all possible fields. No default values are used.
	 * 
	 * @param modelPackage the EPackage to retrieve EClasses to generate from
	 * @param rootObject the EObject that shall be the root container of all generated EObjects
	 * @param eClassesToIgnore collection of EClasses that shall not be instantiated.
	 * 		  All subclasses of the EClasses specified here will be ignored as well.
	 * @param width maximum number of children each EObject should have
	 * @param depth maximum hierarchy depth of the model
	 * @param seed the seed to use for random values during the generation process 
	 * @param ignoreAndLog should exceptions be ignored and logged during the generation process?
	 * @see #ModelGeneratorConfiguration(EPackage, EObject)
	 * @see #ModelGeneratorConfiguration(EPackage, EObject, int, int)
	 */
	public ModelGeneratorConfiguration(EPackage modelPackage, EObject rootObject, 
		Collection<EClass> eClassesToIgnore, int width, int depth, long seed, boolean ignoreAndLog) {
		super();
		this.modelPackage = modelPackage;
		this.rootEObject = rootObject;
		this.eClassesToIgnore = eClassesToIgnore;
		this.width = width;
		this.depth = depth;
		this.seed = seed;
		this.ignoreAndLog = ignoreAndLog;
	}

	/**
	 * @return model's width of this configuration
	 * @see #width
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * Sets the width of this configuration to a new value.
	 * 
	 * @param width the new value of <code>this.width</code>
	 * @see #width
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	
	/**
	 * @return model's hierarchy depth of this configuration
	 * @see #depth
	 */
	public int getDepth() {
		return depth;
	}
	
	/**
	 * Sets the depth of this configuration to a new value.
	 * 
	 * @param depth the new value of <code>this.depth</code>
	 * @see #depth
	 */
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	/**
	 * @return the EObject that shall be used as the root
	 * @see #rootEObject
	 */
	public EObject getRootEObject() {
		return rootEObject;
	}
	
	/**
	 * Sets the root of this configuration to a new value.
	 * 
	 * @param rootEObject the new value of <code>this.rootEObject</code>
	 * @see #rootEObject
	 */
	public void setRootObject(EObject rootEObject) {
		this.rootEObject = rootEObject;
	}
	
	/**
	 * @return the EPackage to retrieve EClasses from
	 * @see #modelPackage
	 */
	public EPackage getModelPackage() {
		return modelPackage;
	}
	
	/**
	 * Sets the model package of this configuration to a new value.
	 * 
	 * @param modelPackage the new value of <code>this.modelPackage</code>
	 * @see #modelPackage
	 */
	public void setModelPackage(EPackage modelPackage) {
		this.modelPackage = modelPackage;
	}
	
	/**
	 * Sets the collection of EClasses to ignore to a new value.
	 * All subclasses of the EClasses specified here will be ignored as well.
	 * 
	 * @param eClassesToIgnore the new value of <code>this.eClassesToIgnore</code>
	 * @see #eClassesToIgnore
	 */
	public void setEClassesToIgnore(Collection<EClass> eClassesToIgnore) {
		this.eClassesToIgnore = eClassesToIgnore;
	}

	/**
	 * Returns all EClasses that will be ignored during the generation process.
	 * All subclasses of the EClasses specified here will be ignored as well.
	 * 
	 * @return the collection of EClasses to ignore
	 * @see #eClassesToIgnore
	 */
	public Collection<EClass> getEClassesToIgnore() {
		return eClassesToIgnore;
	}

	/**
	 * @return the seed value of this configuration
	 * @see #seed
	 */
	public long getSeed() {
		return seed;
	}

	/**
	 * Sets the seed of this configuration to a new value.
	 * 
	 * @param seed the new value of <code>this.seed</code>
	 * @see #seed
	 */
	public void setSeed(long seed) {
		this.seed = seed;
	}
	
	/**
	 * @return the ignoreAndLog value of this configuration
	 * @see #ignoreAndLog
	 */
	public boolean getIgnoreAndLog() {
		return ignoreAndLog;
	}
	
	/**
	 * Sets the <code>ignoreAndLog</code>-value of this configuration to a new value.
	 * 
	 * @param ignoreAndLog the new value of <code>ignoreAndLog</code>
	 * @see #ignoreAndLog
	 */
	public void setIgnoreAndLog(boolean ignoreAndLog) {
		this.ignoreAndLog = ignoreAndLog;
	}
}
