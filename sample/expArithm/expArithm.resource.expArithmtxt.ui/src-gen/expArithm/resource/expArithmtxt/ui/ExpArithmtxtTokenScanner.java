/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.ui;

/**
 * An adapter from the Eclipse
 * <code>org.eclipse.jface.text.rules.ITokenScanner</code> interface to the
 * generated lexer.
 */
public class ExpArithmtxtTokenScanner implements org.eclipse.jface.text.rules.ITokenScanner {
	
	private expArithm.resource.expArithmtxt.IExpArithmtxtTextScanner lexer;
	private expArithm.resource.expArithmtxt.IExpArithmtxtTextToken currentToken;
	private java.util.List<expArithm.resource.expArithmtxt.IExpArithmtxtTextToken> nextTokens;
	private int offset;
	private String languageId;
	private org.eclipse.jface.preference.IPreferenceStore store;
	private expArithm.resource.expArithmtxt.ui.ExpArithmtxtColorManager colorManager;
	private expArithm.resource.expArithmtxt.IExpArithmtxtTextResource resource;
	
	/**
	 * 
	 * @param colorManager A manager to obtain color objects
	 */
	public ExpArithmtxtTokenScanner(expArithm.resource.expArithmtxt.IExpArithmtxtTextResource resource, expArithm.resource.expArithmtxt.ui.ExpArithmtxtColorManager colorManager) {
		this.resource = resource;
		this.colorManager = colorManager;
		this.lexer = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtMetaInformation().createLexer();
		this.languageId = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtMetaInformation().getSyntaxName();
		expArithm.resource.expArithmtxt.ui.ExpArithmtxtUIPlugin plugin = expArithm.resource.expArithmtxt.ui.ExpArithmtxtUIPlugin.getDefault();
		if (plugin != null) {
			this.store = plugin.getPreferenceStore();
		}
		this.nextTokens = new java.util.ArrayList<expArithm.resource.expArithmtxt.IExpArithmtxtTextToken>();
	}
	
	public int getTokenLength() {
		return currentToken.getLength();
	}
	
	public int getTokenOffset() {
		return offset + currentToken.getOffset();
	}
	
	public org.eclipse.jface.text.rules.IToken nextToken() {
		boolean isOriginalToken = true;
		if (!nextTokens.isEmpty()) {
			currentToken = nextTokens.remove(0);
			isOriginalToken = false;
		} else {
			currentToken = lexer.getNextToken();
		}
		if (currentToken == null || !currentToken.canBeUsedForSyntaxHighlighting()) {
			return org.eclipse.jface.text.rules.Token.EOF;
		}
		
		if (isOriginalToken) {
			splitCurrentToken();
		}
		
		org.eclipse.jface.text.TextAttribute textAttribute = null;
		String tokenName = currentToken.getName();
		if (tokenName != null) {
			expArithm.resource.expArithmtxt.IExpArithmtxtTokenStyle staticStyle = getStaticTokenStyle();
			// now call dynamic token styler to allow to apply modifications to the static
			// style
			expArithm.resource.expArithmtxt.IExpArithmtxtTokenStyle dynamicStyle = getDynamicTokenStyle(staticStyle);
			if (dynamicStyle != null) {
				textAttribute = getTextAttribute(dynamicStyle);
			}
		}
		
		return new org.eclipse.jface.text.rules.Token(textAttribute);
	}
	
	public void setRange(org.eclipse.jface.text.IDocument document, int offset, int length) {
		this.offset = offset;
		try {
			lexer.setText(document.get(offset, length));
		} catch (org.eclipse.jface.text.BadLocationException e) {
			// ignore this error. It might occur during editing when locations are outdated
			// quickly.
		}
	}
	
	public String getTokenText() {
		return currentToken.getText();
	}
	
	public int[] convertToIntArray(org.eclipse.swt.graphics.RGB rgb) {
		if (rgb == null) {
			return null;
		}
		return new int[] {rgb.red, rgb.green, rgb.blue};
	}
	
	public expArithm.resource.expArithmtxt.IExpArithmtxtTokenStyle getStaticTokenStyle() {
		expArithm.resource.expArithmtxt.IExpArithmtxtTokenStyle staticStyle = null;
		String tokenName = currentToken.getName();
		String enableKey = expArithm.resource.expArithmtxt.ui.ExpArithmtxtSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, expArithm.resource.expArithmtxt.ui.ExpArithmtxtSyntaxColoringHelper.StyleProperty.ENABLE);
		boolean enabled = store.getBoolean(enableKey);
		if (enabled) {
			String colorKey = expArithm.resource.expArithmtxt.ui.ExpArithmtxtSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, expArithm.resource.expArithmtxt.ui.ExpArithmtxtSyntaxColoringHelper.StyleProperty.COLOR);
			org.eclipse.swt.graphics.RGB foregroundRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(store, colorKey);
			org.eclipse.swt.graphics.RGB backgroundRGB = null;
			boolean bold = store.getBoolean(expArithm.resource.expArithmtxt.ui.ExpArithmtxtSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, expArithm.resource.expArithmtxt.ui.ExpArithmtxtSyntaxColoringHelper.StyleProperty.BOLD));
			boolean italic = store.getBoolean(expArithm.resource.expArithmtxt.ui.ExpArithmtxtSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, expArithm.resource.expArithmtxt.ui.ExpArithmtxtSyntaxColoringHelper.StyleProperty.ITALIC));
			boolean strikethrough = store.getBoolean(expArithm.resource.expArithmtxt.ui.ExpArithmtxtSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, expArithm.resource.expArithmtxt.ui.ExpArithmtxtSyntaxColoringHelper.StyleProperty.STRIKETHROUGH));
			boolean underline = store.getBoolean(expArithm.resource.expArithmtxt.ui.ExpArithmtxtSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, expArithm.resource.expArithmtxt.ui.ExpArithmtxtSyntaxColoringHelper.StyleProperty.UNDERLINE));
			staticStyle = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTokenStyle(convertToIntArray(foregroundRGB), convertToIntArray(backgroundRGB), bold, italic, strikethrough, underline);
		}
		return staticStyle;
	}
	
	public expArithm.resource.expArithmtxt.IExpArithmtxtTokenStyle getDynamicTokenStyle(expArithm.resource.expArithmtxt.IExpArithmtxtTokenStyle staticStyle) {
		expArithm.resource.expArithmtxt.mopp.ExpArithmtxtDynamicTokenStyler dynamicTokenStyler = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtDynamicTokenStyler();
		expArithm.resource.expArithmtxt.IExpArithmtxtTokenStyle dynamicStyle = dynamicTokenStyler.getDynamicTokenStyle(resource, currentToken, staticStyle);
		return dynamicStyle;
	}
	
	public org.eclipse.jface.text.TextAttribute getTextAttribute(expArithm.resource.expArithmtxt.IExpArithmtxtTokenStyle tokeStyle) {
		int[] foregroundColorArray = tokeStyle.getColorAsRGB();
		org.eclipse.swt.graphics.Color foregroundColor = null;
		if (colorManager != null) {
			foregroundColor = colorManager.getColor(new org.eclipse.swt.graphics.RGB(foregroundColorArray[0], foregroundColorArray[1], foregroundColorArray[2]));
		}
		int[] backgroundColorArray = tokeStyle.getBackgroundColorAsRGB();
		org.eclipse.swt.graphics.Color backgroundColor = null;
		if (backgroundColorArray != null) {
			org.eclipse.swt.graphics.RGB backgroundRGB = new org.eclipse.swt.graphics.RGB(backgroundColorArray[0], backgroundColorArray[1], backgroundColorArray[2]);
			if (colorManager != null) {
				backgroundColor = colorManager.getColor(backgroundRGB);
			}
		}
		int style = org.eclipse.swt.SWT.NORMAL;
		if (tokeStyle.isBold()) {
			style = style | org.eclipse.swt.SWT.BOLD;
		}
		if (tokeStyle.isItalic()) {
			style = style | org.eclipse.swt.SWT.ITALIC;
		}
		if (tokeStyle.isStrikethrough()) {
			style = style | org.eclipse.jface.text.TextAttribute.STRIKETHROUGH;
		}
		if (tokeStyle.isUnderline()) {
			style = style | org.eclipse.jface.text.TextAttribute.UNDERLINE;
		}
		return new org.eclipse.jface.text.TextAttribute(foregroundColor, backgroundColor, style);
	}
	
	/**
	 * Tries to split the current token if it contains task items.
	 */
	public void splitCurrentToken() {
		final String text = currentToken.getText();
		final String name = currentToken.getName();
		final int line = currentToken.getLine();
		final int charStart = currentToken.getOffset();
		final int column = currentToken.getColumn();
		
		java.util.List<expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTaskItem> taskItems = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTaskItemDetector().findTaskItems(text, line, charStart);
		
		// this is the offset for the next token to be added
		int offset = charStart;
		int itemBeginRelative;
		java.util.List<expArithm.resource.expArithmtxt.IExpArithmtxtTextToken> newItems = new java.util.ArrayList<expArithm.resource.expArithmtxt.IExpArithmtxtTextToken>();
		for (expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTaskItem taskItem : taskItems) {
			int itemBegin = taskItem.getCharStart();
			int itemLine = taskItem.getLine();
			int itemColumn = 0;
			
			itemBeginRelative = itemBegin - charStart;
			// create token before task item (TODO if required)
			String textBefore = text.substring(offset - charStart, itemBeginRelative);
			int textBeforeLength = textBefore.length();
			newItems.add(new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTextToken(name, textBefore, offset, textBeforeLength, line, column, true));
			
			// create token for the task item itself
			offset = offset + textBeforeLength;
			String itemText = taskItem.getKeyword();
			int itemTextLength = itemText.length();
			newItems.add(new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTextToken(expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME, itemText, offset, itemTextLength, itemLine, itemColumn, true));
			
			offset = offset + itemTextLength;
		}
		
		if (!taskItems.isEmpty()) {
			// create token after last task item (TODO if required)
			String textAfter = text.substring(offset - charStart);
			newItems.add(new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTextToken(name, textAfter, offset, textAfter.length(), line, column, true));
		}
		
		if (!newItems.isEmpty()) {
			// replace tokens
			currentToken = newItems.remove(0);
			nextTokens = newItems;
		}
		
	}
}
