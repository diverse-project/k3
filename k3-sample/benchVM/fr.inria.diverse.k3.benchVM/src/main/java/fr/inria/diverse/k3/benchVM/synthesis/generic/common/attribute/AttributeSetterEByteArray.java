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
 * Class for creating random Byte[] values.
 * 
 * @see IAttributeSetter
 */
class AttributeSetterEByteArray implements IAttributeSetter<byte[]> {

	/**
	 * Random object that is used to determine values for attributes created 
	 * by {@link #createNewAttribute()} and {@link #createNewAttributes()}.
	 */
	private Random random;
	
	/**
	 * Length of the Byte-array that is randomly filled.
	 */
	private int bytesize;
	
	/**
	 * Creates a new AttributeSetter for Byte[] attributes.
	 * 
	 * @param random Random object used to create attribute values
	 * @param bytesize length of the Byte-array
	 */
	AttributeSetterEByteArray(Random random, int bytesize) {
		this.random = random;
		this.bytesize = bytesize;
	}

	/**
	 * {@inheritDoc}
	 */
	public byte[] createNewAttribute() {
		byte[] bytes = new byte[bytesize];
		random.nextBytes(bytes);
		return bytes;
	}

	/**
	 * {@inheritDoc}
	 */
	public Collection<byte[]> createNewAttributes(int maxAmount) {
		List<byte[]> result = new ArrayList<byte[]>(maxAmount);
		for (int i=0; i<maxAmount; i++) {
			result.add(createNewAttribute());
		}
		return result;
	}

}
