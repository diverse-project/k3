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

import java.util.Collections
import java.util.List

abstract class StepCommand {

	List<Object> result = Collections.emptyList();

	def void execute() ;

	protected def void addToResult(Object o) {
		result = Collections.singletonList(o)
	}

	/**
	 * Get the single result of an executed step command.
	 * Possible values are:
	 * - an empty list, if the step command was 'void' and thus did not return a value,
	 * - a singleton list with the (possibly null) returned value, if the step command was not 'void'.
	 */
	def List<Object> getResult() {
		return result;
	}

}
