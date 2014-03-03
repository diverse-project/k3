/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package fr.inria.diverse.k3.benchVM.synthesis.generic.common.attribute;

import java.util.Collection;

/**
 * Interface that defines methods for creating attributes in order
 * to generate or change Ecore models. Attributes are created
 * using a Random object.
 * 
 * @param <E> the attribute type of the attributes to create 
 */
public interface IAttributeSetter<E> {
	
	/**
	 * Creates one attribute of type <code>E</code>.
	 * The result is determined by <code>random</code>.
	 * 
	 * @return the created attribute
	 */
	E createNewAttribute();

	/**
	 * Creates a collection of attributes of type <code>E</code>. 
	 * The result is determined by <code>random</code>.
	 * 
	 * @param maxAmount the maximum amount of attributes to create
	 * @return all created attributes as a collection
	 */
	Collection<E> createNewAttributes(int maxAmount);

}