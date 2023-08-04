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
package fr.inria.diverse.k3.ui.xtend.ide.support;

import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IExecutableExtensionFactory;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.xtend.ide.internal.XtendActivator;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import fr.inria.diverse.k3.ui.Activator;

public class K3XtendExecutableExtensionFactory implements IExecutableExtensionFactory, IExecutableExtension {
	public static final String GUICEKEY = "guicekey";
	protected String clazzName;
	protected IConfigurationElement config;

	@SuppressWarnings({ "unchecked" })
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data)
		throws CoreException {
		if (data instanceof String) {
			clazzName = (String) data;
		} else if (data instanceof Map<?, ?>) {
			clazzName = ((Map<String, String>)data).get(GUICEKEY);
		}
		if (clazzName == null) {
			throw new IllegalArgumentException("couldn't handle passed data : "+data);
		}
		this.config = config;
	}
	
	public Object create() throws CoreException {
		try {
			final Class<?> clazz = getBundle().loadClass(clazzName);
			final Injector injector = getInjector();
			final Object result = injector.getInstance(clazz);
			if (result instanceof IExecutableExtension)
				((IExecutableExtension) result).setInitializationData(config, null, null);
			return result;
		}
		catch (Exception e) {
			Activator.logErrorMessage(e.getMessage(), e);
			throw new CoreException(new Status(IStatus.ERROR, getBundle().getSymbolicName(), e.getMessage() + " ExtensionFactory: "+ getClass().getName(), e));
		}
	}
	
	
	
	protected Bundle getBundle() {
		return Activator.getDefault().getBundle();
	}
	
	
	protected Injector getInjector() {
		return XtendActivator.getInstance().getInjector(XtendActivator.ORG_ECLIPSE_XTEND_CORE_XTEND);
	}

}
