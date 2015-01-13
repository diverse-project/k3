package insa.ui;

import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

public class ExpHighlightingCalculator implements ISemanticHighlightingCalculator{
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor ) {
		if(resource == null || resource.getParseResult()==null) return;
		
//		INode root = resource.getParseResult().getRootNode();
//		BidiTreeIterator<INode> it = root.getAsTreeIterable().iterator();
		
//		while(it.hasNext()) {
//			INode node = it.next();
//			if(node instanceof CompositeNodeWithSemanticElement && node.getSemanticElement() instanceof OperateurBinaire) {
//				OperateurBinaire bin = (OperateurBinaire) node.getSemanticElement();
//				acceptor.addPosition(0, 1, ExpHighlightingConfiguration.EXP_ELT);
//				provideHighlightingFor()
//			}
//		}
	}
}
 
