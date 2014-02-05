
package org.kermeta.language.sample.cellularautomata.rules;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class EvolStandaloneSetup extends EvolStandaloneSetupGenerated{

	public static void doSetup() {
		new EvolStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

