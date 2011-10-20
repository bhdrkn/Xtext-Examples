
package org.xtext.bhdrkn.function;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class FunctionStandaloneSetup extends FunctionStandaloneSetupGenerated{

	public static void doSetup() {
		new FunctionStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

