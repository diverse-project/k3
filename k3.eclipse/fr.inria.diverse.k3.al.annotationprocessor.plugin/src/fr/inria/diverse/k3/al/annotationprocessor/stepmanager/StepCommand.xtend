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

import java.util.Optional

abstract class StepCommand {

	private Optional<Object> result = Optional.empty

	public def void execute() ;
	
	protected def void addToResult(Object o) {
		result = Optional.of(o);
	}

	public def Optional<Object> getResult() {
		return result;
	}

}
