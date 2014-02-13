
package org.kermeta.language.sample.cellularautomata.rules;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class InitStandaloneSetup extends InitStandaloneSetupGenerated{

	public static void doSetup() {
		new InitStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

