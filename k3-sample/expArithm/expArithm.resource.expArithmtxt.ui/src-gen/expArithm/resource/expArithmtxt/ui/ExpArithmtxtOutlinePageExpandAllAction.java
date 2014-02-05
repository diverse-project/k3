/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.ui;

public class ExpArithmtxtOutlinePageExpandAllAction extends expArithm.resource.expArithmtxt.ui.AbstractExpArithmtxtOutlinePageAction {
	
	public ExpArithmtxtOutlinePageExpandAllAction(expArithm.resource.expArithmtxt.ui.ExpArithmtxtOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Expand all", org.eclipse.jface.action.IAction.AS_PUSH_BUTTON);
		initialize("icons/expand_all_icon.gif");
	}
	
	public void runInternal(boolean on) {
		if (on) {
			getTreeViewer().expandAll();
		}
	}
	
	public boolean keepState() {
		return false;
	}
	
}
