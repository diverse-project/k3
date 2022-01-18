/*******************************************************************************
 * Copyright (c) 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package fr.inria.diverse.k3.al.annotationprocessor.stepmanager

import java.util.Set
import java.util.HashSet
import java.util.Collections

class StepManagerRegistry {

	static var StepManagerRegistry instance;

	Set<IStepManager> registeredManagers;

	private new() {
		this.registeredManagers = Collections.synchronizedSet(new HashSet<IStepManager>());
	}

	static def StepManagerRegistry getInstance() {
		if (instance === null)
			instance = new StepManagerRegistry()
		return instance
	}

	def void registerManager(IStepManager manager) {
		if (manager !== null)
			registeredManagers.add(manager)
	}

	def void unregisterManager(IStepManager manager) {
		if (manager !== null)
			registeredManagers.remove(manager)
	}

	def IStepManager findStepManager(Object caller) {
		synchronized (registeredManagers) {
			return registeredManagers.findFirst[m|m.canHandle(caller)];
		}
	}

}
