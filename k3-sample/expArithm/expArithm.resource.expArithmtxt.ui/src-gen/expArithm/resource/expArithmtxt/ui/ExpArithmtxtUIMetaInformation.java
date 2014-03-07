/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.ui;

public class ExpArithmtxtUIMetaInformation extends expArithm.resource.expArithmtxt.mopp.ExpArithmtxtMetaInformation {
	
	public expArithm.resource.expArithmtxt.IExpArithmtxtHoverTextProvider getHoverTextProvider() {
		return new expArithm.resource.expArithmtxt.ui.ExpArithmtxtHoverTextProvider();
	}
	
	public expArithm.resource.expArithmtxt.ui.ExpArithmtxtImageProvider getImageProvider() {
		return expArithm.resource.expArithmtxt.ui.ExpArithmtxtImageProvider.INSTANCE;
	}
	
	public expArithm.resource.expArithmtxt.ui.ExpArithmtxtColorManager createColorManager() {
		return new expArithm.resource.expArithmtxt.ui.ExpArithmtxtColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(expArithm.resource.expArithmtxt.IExpArithmtxtTextResource,
	 * expArithm.resource.expArithmtxt.ui.ExpArithmtxtColorManager) instead.
	 */
	public expArithm.resource.expArithmtxt.ui.ExpArithmtxtTokenScanner createTokenScanner(expArithm.resource.expArithmtxt.ui.ExpArithmtxtColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public expArithm.resource.expArithmtxt.ui.ExpArithmtxtTokenScanner createTokenScanner(expArithm.resource.expArithmtxt.IExpArithmtxtTextResource resource, expArithm.resource.expArithmtxt.ui.ExpArithmtxtColorManager colorManager) {
		return new expArithm.resource.expArithmtxt.ui.ExpArithmtxtTokenScanner(resource, colorManager);
	}
	
	public expArithm.resource.expArithmtxt.ui.ExpArithmtxtCodeCompletionHelper createCodeCompletionHelper() {
		return new expArithm.resource.expArithmtxt.ui.ExpArithmtxtCodeCompletionHelper();
	}
	
}
