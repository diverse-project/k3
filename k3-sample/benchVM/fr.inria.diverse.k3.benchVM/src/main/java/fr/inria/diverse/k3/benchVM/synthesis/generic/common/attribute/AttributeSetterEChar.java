/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package fr.inria.diverse.k3.benchVM.synthesis.generic.common.attribute;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/**
 * Class for creating random Char values.
 * 
 * @see IAttributeSetter
 */
class AttributeSetterEChar implements IAttributeSetter<Character> {
	
	/**
	 * Random object that is used to determine values for attributes created 
	 * by {@link #createNewAttribute()} and {@link #createNewAttributes()}.
	 */
	private Random random;
	
	/**
	 * Creates a new AttributeSetter for Char attributes.
	 * 
	 * @param random Random object used to create attribute values
	 */
	AttributeSetterEChar(Random random) {
		this.random = random;
	}

	/**
	 * {@inheritDoc}
	 */
	public Character createNewAttribute() {
		return (char)(random.nextInt(94) + 33);
	}

	/**
	 * {@inheritDoc}
	 */
	public Collection<Character> createNewAttributes(int maxAmount) {
		List<Character> result = new ArrayList<Character>(maxAmount);
		for (int i=0; i<maxAmount; i++) {
			result.add(createNewAttribute());
		}
		return result;
	}
}
