
package org.xtext.bhdrkn;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class FouroperationStandaloneSetup extends FouroperationStandaloneSetupGenerated{

	public static void doSetup() {
		new FouroperationStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

