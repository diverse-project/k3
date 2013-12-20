/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.ui;

public class ExpArithmtxtOutlinePageActionProvider {
	
	public java.util.List<org.eclipse.jface.action.IAction> getActions(expArithm.resource.expArithmtxt.ui.ExpArithmtxtOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		java.util.List<org.eclipse.jface.action.IAction> defaultActions = new java.util.ArrayList<org.eclipse.jface.action.IAction>();
		defaultActions.add(new expArithm.resource.expArithmtxt.ui.ExpArithmtxtOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new expArithm.resource.expArithmtxt.ui.ExpArithmtxtOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new expArithm.resource.expArithmtxt.ui.ExpArithmtxtOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new expArithm.resource.expArithmtxt.ui.ExpArithmtxtOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new expArithm.resource.expArithmtxt.ui.ExpArithmtxtOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new expArithm.resource.expArithmtxt.ui.ExpArithmtxtOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
