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

interface IStepManager {

	def void executeStep(Object caller, StepCommand command, String className, String methodName)

	def void executeStep(Object caller, Object[] parameters, StepCommand command, String className, String methodName)

	def boolean canHandle(Object caller)

}
