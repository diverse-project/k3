
package org.kermeta.language.sample.cellularautomata.rules;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CoreStandaloneSetup extends CoreStandaloneSetupGenerated{

	public static void doSetup() {
		new CoreStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

