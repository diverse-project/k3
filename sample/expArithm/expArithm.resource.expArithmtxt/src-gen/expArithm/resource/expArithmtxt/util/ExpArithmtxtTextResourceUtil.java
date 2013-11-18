/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.util;

/**
 * Class ExpArithmtxtTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * expArithm.resource.expArithmtxt.util.ExpArithmtxtResourceUtil.
 */
public class ExpArithmtxtTextResourceUtil {
	
	/**
	 * Use expArithm.resource.expArithmtxt.util.ExpArithmtxtResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated	
	public static expArithm.resource.expArithmtxt.mopp.ExpArithmtxtResource getResource(org.eclipse.core.resources.IFile file) {
		return new expArithm.resource.expArithmtxt.util.ExpArithmtxtEclipseProxy().getResource(file);
	}
	
	/**
	 * Use expArithm.resource.expArithmtxt.util.ExpArithmtxtResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated	
	public static expArithm.resource.expArithmtxt.mopp.ExpArithmtxtResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return expArithm.resource.expArithmtxt.util.ExpArithmtxtResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use expArithm.resource.expArithmtxt.util.ExpArithmtxtResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated	
	public static expArithm.resource.expArithmtxt.mopp.ExpArithmtxtResource getResource(org.eclipse.emf.common.util.URI uri) {
		return expArithm.resource.expArithmtxt.util.ExpArithmtxtResourceUtil.getResource(uri);
	}
	
	/**
	 * Use expArithm.resource.expArithmtxt.util.ExpArithmtxtResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated	
	public static expArithm.resource.expArithmtxt.mopp.ExpArithmtxtResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return expArithm.resource.expArithmtxt.util.ExpArithmtxtResourceUtil.getResource(uri, options);
	}
	
}
