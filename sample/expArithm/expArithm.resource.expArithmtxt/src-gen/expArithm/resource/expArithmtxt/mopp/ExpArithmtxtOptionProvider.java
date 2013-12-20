/**
 * <copyright>
 * </copyright>
 *
 * 
 */
/**
 * This class can be used to configure options that must be used when resources
 * are loaded. This is similar to using the extension point
 * 'expArithm.resource.expArithmtxt.default_load_options' with the difference that
 * the options defined in this class are used even if no Eclipse platform is
 * running.
 */
package expArithm.resource.expArithmtxt.mopp;

public class ExpArithmtxtOptionProvider implements expArithm.resource.expArithmtxt.IExpArithmtxtOptionProvider {
	
	public java.util.Map<?,?> getOptions() {
		// create a map with static option providers here
		return java.util.Collections.emptyMap();
	}
	
}
