package insa.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class ExpHighlightingConfiguration implements IHighlightingConfiguration {
	public static final String EXP_ELT = "exp";
	
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		addType(acceptor, "exp");
	}
	
	 public void addType( IHighlightingConfigurationAcceptor acceptor, String s)  {
		 TextStyle textStyle = new TextStyle();
		 textStyle.setBackgroundColor(new RGB(255, 255, 255));
		 textStyle.setColor(new RGB(50, 0, 0));
		 textStyle.setStyle(SWT.BOLD);
		 acceptor.acceptDefaultHighlighting(s, s, textStyle);
	 }
} 
