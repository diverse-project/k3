/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package fr.inria.diverse.k3.benchVM.synthesis.generic.common.attribute;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;

/**
 * Class for creating random Enumerator values.
 * 
 * @see IAttributeSetter
 */
class AttributeSetterEEnum implements IAttributeSetter<Enumerator> {
	
	/**
	 * Random object that is used to determine values for attributes created 
	 * by {@link #createNewAttribute()} and {@link #createNewAttributes()}.
	 */
	private Random random;
	
	/**
	 * The EEnum for which the Enumerators shall be created.
	 */
	private EEnum eEnum;
	
	/**
	 * Creates a new AttributeSetter for Enumerator attributes.
	 * 
	 * @param eEnum the EEnum this attribute setter will create Enumerators for
	 * @param random Random object used to create attribute values
	 */
	AttributeSetterEEnum(EEnum eEnum, Random random) {
		this.eEnum = eEnum;
		this.random = random;
	}
	
	/** 
	 * {@inheritDoc}
	 */
	public Enumerator createNewAttribute() {
		List<EEnumLiteral> literals = new ArrayList<EEnumLiteral>(eEnum.getELiterals());
		if(literals.isEmpty()) {
			return null;
		}
		Collections.shuffle(literals, random);
		return literals.get(0).getInstance();
	}

	/** 
	 * {@inheritDoc}
	 */
	public Collection<Enumerator> createNewAttributes(int maxAmount) {
		List<Enumerator> result = new ArrayList<Enumerator>(maxAmount);
		// add instances of all possible literals
		for(EEnumLiteral literal : eEnum.getELiterals()) {
			result.add(literal.getInstance());
		}
		Collections.shuffle(result, random);
		// remove random Enumerators until at most maxObjects are returned
		while(result.size() > maxAmount) {
			result.remove(0);
		}
		return result;
	}

}