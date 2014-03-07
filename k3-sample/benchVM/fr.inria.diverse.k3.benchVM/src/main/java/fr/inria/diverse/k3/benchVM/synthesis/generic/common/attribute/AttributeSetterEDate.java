/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package fr.inria.diverse.k3.benchVM.synthesis.generic.common.attribute;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Class for creating random Date values.
 * 
 * @see IAttributeSetter
 */
class AttributeSetterEDate implements IAttributeSetter<Date> {
	
	/**
	 * Random object that is used to determine values for attributes created 
	 * by {@link #createNewAttribute()} and {@link #createNewAttributes()}.
	 */
	private Random random;

	/**
	 * Creates a new AttributeSetter for Date attributes.
	 * 
	 * @param random Random object used to create attribute values
	 */
	AttributeSetterEDate(Random random) {
		this.random = random;
	}

	/**
	 * {@inheritDoc}
	 */
	public Date createNewAttribute() {
		long max = System.currentTimeMillis() + 1000000000000L;
		long min = System.currentTimeMillis() - 1000000000000L;
		long date = (long) (random.nextDouble() * (max-min)) + min;
		return new Date(date);
	}

	/**
	 * {@inheritDoc}
	 */
	public Collection<Date> createNewAttributes(int maxAmount) {
		List<Date> result = new ArrayList<Date>(maxAmount);
		for (int i=0; i<maxAmount; i++) {
			result.add(createNewAttribute());
		}
		return result;
	}

}
