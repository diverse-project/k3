/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package fr.inria.diverse.k3.benchVM.synthesis.generic.common.attribute;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * Class that grants access to the attribute setters in order to generate 
 * new attributes when generating or changing an Ecore model. These setters
 * can be accessed by {@link #getAttributeSetters()}.
 * 
 * @see IAttributeSetter
 */
public final class AttributeHandler {
	
	/**
	 * The Random-object corresponding to the current map of AttributeSetters.
	 * 
	 * @see #setRandom(Random)
	 */
	private  Random random;
	
	/**
	 * Map that maps every attributeType to an AttributeSetter.
	 * 
	 * @see #getAttributeSetters()
	 */
	private  Map<EClassifier, IAttributeSetter<?>> attributeSetters;

	
	/**
	 * Returns a map containing an AttributeSetter-instance for each 
	 * attribute type, granting access to all AttributeSetters.
	 *  
	 * @return the map that maps every attribute type to its attribute setter
	 * @see AttributeSetter
	 */
	public  Map<EClassifier, IAttributeSetter<?>> getAttributeSetters() {
		if(attributeSetters != null) {
			return attributeSetters;
		}
		EcorePackage ecoreInstance = EcorePackage.eINSTANCE;
		
		attributeSetters = new LinkedHashMap<EClassifier, IAttributeSetter<?>>();
		IAttributeSetter<?> oAttributeSetter;
		
		oAttributeSetter = new AttributeSetterEBoolean(random);
		attributeSetters.put(ecoreInstance.getEBoolean(), oAttributeSetter);
		attributeSetters.put(ecoreInstance.getEBooleanObject(), oAttributeSetter);
	
		attributeSetters.put(ecoreInstance.getEByteArray(), new AttributeSetterEByteArray(random, 100));
		
		attributeSetters.put(ecoreInstance.getEString(), new AttributSetterEString(random));
		
		oAttributeSetter = new AttributeSetterEInt(random);
		attributeSetters.put(ecoreInstance.getEInt(), oAttributeSetter);
		attributeSetters.put(ecoreInstance.getEIntegerObject(), oAttributeSetter);
		
		attributeSetters.put(ecoreInstance.getEDate(), new AttributeSetterEDate(random));
		
		oAttributeSetter = new AttributeSetterELong(random);
		attributeSetters.put(ecoreInstance.getELong(), oAttributeSetter);
		attributeSetters.put(ecoreInstance.getELongObject(), oAttributeSetter);
		
		oAttributeSetter = new AttributeSetterEByte(random);
		attributeSetters.put(ecoreInstance.getEByte(), oAttributeSetter);
		attributeSetters.put(ecoreInstance.getEByteObject(), oAttributeSetter);
		
		oAttributeSetter = new AttributeSetterEChar(random);
		attributeSetters.put(ecoreInstance.getEChar(), oAttributeSetter);
		attributeSetters.put(ecoreInstance.getECharacterObject(), oAttributeSetter);
		
		oAttributeSetter = new AttributeSetterEDouble(random);
		attributeSetters.put(ecoreInstance.getEDouble(), oAttributeSetter);
		attributeSetters.put(ecoreInstance.getEDoubleObject(), oAttributeSetter);
		
		oAttributeSetter = new AttributeSetterEFloat(random);
		attributeSetters.put(ecoreInstance.getEFloat(), oAttributeSetter);
		attributeSetters.put(ecoreInstance.getEFloatObject(), oAttributeSetter);
		
		oAttributeSetter = new AttributeSetterEShort(random);
		attributeSetters.put(ecoreInstance.getEShort(), oAttributeSetter);
		attributeSetters.put(ecoreInstance.getEShortObject(), oAttributeSetter);
		
		attributeSetters.put(ecoreInstance.getEBigInteger(),new AttributeSetterEBigInteger(random));
		
		attributeSetters.put(ecoreInstance.getEBigDecimal(),new AttributeSetterEBigDecimal(random));
		
		return attributeSetters;
		
	}
	
	/**
	 * Sets the current Random-object to <code>newRandom</code>.
	 * The {@link #attributeSetters}-map is set to <code>null</code>,
	 * as new AttributeSetters have to be created for the new random value.
	 *   
	 * @param newRandom the new value for <code>this.random</code>
	 */
	public  void setRandom(Random newRandom) {
		attributeSetters = null;
		random = newRandom;
	}

	/**
	 * Returns an instance of the EEnum AttributeSetter belonging to the 
	 * EEnum specified by eEnum.
	 * 
	 * @param eEnum the EEnum to create the AttributeSetter for
	 * @return a new AttributeSetterEEnum instance
	 */
	public  AttributeSetterEEnum getEEnumSetter(EEnum eEnum) {
		return new AttributeSetterEEnum(eEnum, random);
	}
}
