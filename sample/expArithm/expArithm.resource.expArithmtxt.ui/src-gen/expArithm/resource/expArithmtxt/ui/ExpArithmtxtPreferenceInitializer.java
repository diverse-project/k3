/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.ui;

/**
 * A class used to initialize default preference values.
 */
public class ExpArithmtxtPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = expArithm.resource.expArithmtxt.ui.ExpArithmtxtUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(expArithm.resource.expArithmtxt.ui.ExpArithmtxtPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(expArithm.resource.expArithmtxt.ui.ExpArithmtxtPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = expArithm.resource.expArithmtxt.ui.ExpArithmtxtUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = expArithm.resource.expArithmtxt.ui.ExpArithmtxtUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, expArithm.resource.expArithmtxt.IExpArithmtxtMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		expArithm.resource.expArithmtxt.ui.ExpArithmtxtBracketSet bracketSet = new expArithm.resource.expArithmtxt.ui.ExpArithmtxtBracketSet(null, null);
		final java.util.Collection<expArithm.resource.expArithmtxt.IExpArithmtxtBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (expArithm.resource.expArithmtxt.IExpArithmtxtBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + expArithm.resource.expArithmtxt.ui.ExpArithmtxtPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, expArithm.resource.expArithmtxt.mopp.ExpArithmtxtMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getSyntaxHighlightableTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			String tokenName = tokenNames[i];
			expArithm.resource.expArithmtxt.IExpArithmtxtTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(expArithm.resource.expArithmtxt.ui.ExpArithmtxtSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, expArithm.resource.expArithmtxt.ui.ExpArithmtxtSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(expArithm.resource.expArithmtxt.ui.ExpArithmtxtSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, expArithm.resource.expArithmtxt.ui.ExpArithmtxtSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(expArithm.resource.expArithmtxt.ui.ExpArithmtxtSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, expArithm.resource.expArithmtxt.ui.ExpArithmtxtSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(expArithm.resource.expArithmtxt.ui.ExpArithmtxtSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, expArithm.resource.expArithmtxt.ui.ExpArithmtxtSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(expArithm.resource.expArithmtxt.ui.ExpArithmtxtSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, expArithm.resource.expArithmtxt.ui.ExpArithmtxtSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(expArithm.resource.expArithmtxt.ui.ExpArithmtxtSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, expArithm.resource.expArithmtxt.ui.ExpArithmtxtSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
	}
	
	private String getColorString(int[] colorAsRGB) {
		if (colorAsRGB == null) {
			return "0,0,0";
		}
		if (colorAsRGB.length != 3) {
			return "0,0,0";
		}
		return colorAsRGB[0] + "," +colorAsRGB[1] + ","+ colorAsRGB[2];
	}
}
