/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.ui;

public class ExpArithmtxtOutlinePageAutoExpandAction extends expArithm.resource.expArithmtxt.ui.AbstractExpArithmtxtOutlinePageAction {
	
	public ExpArithmtxtOutlinePageAutoExpandAction(expArithm.resource.expArithmtxt.ui.ExpArithmtxtOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Auto expand", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/auto_expand_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setAutoExpand(on);
		getTreeViewer().refresh();
	}
	
}
