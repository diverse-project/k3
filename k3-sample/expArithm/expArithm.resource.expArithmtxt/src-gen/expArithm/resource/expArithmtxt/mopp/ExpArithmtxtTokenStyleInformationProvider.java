/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.mopp;

public class ExpArithmtxtTokenStyleInformationProvider {
	
	public static String TASK_ITEM_TOKEN_NAME = "TASK_ITEM";
	
	public expArithm.resource.expArithmtxt.IExpArithmtxtTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("+".equals(tokenName)) {
			return new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTokenStyle(new int[] {0x00, 0x00, 0x80}, null, true, false, false, false);
		}
		if ("-".equals(tokenName)) {
			return new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTokenStyle(new int[] {0x00, 0x00, 0x80}, null, true, false, false, false);
		}
		if ("*".equals(tokenName)) {
			return new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTokenStyle(new int[] {0x00, 0x00, 0x80}, null, true, false, false, false);
		}
		if ("/".equals(tokenName)) {
			return new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTokenStyle(new int[] {0x00, 0x00, 0x80}, null, true, false, false, false);
		}
		if ("TASK_ITEM".equals(tokenName)) {
			return new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTokenStyle(new int[] {0x7F, 0x9F, 0xBF}, null, true, false, false, false);
		}
		return null;
	}
	
}
