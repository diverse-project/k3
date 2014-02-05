/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.ui;

public class ExpArithmtxtOutlinePageTypeSortingAction extends expArithm.resource.expArithmtxt.ui.AbstractExpArithmtxtOutlinePageAction {
	
	public ExpArithmtxtOutlinePageTypeSortingAction(expArithm.resource.expArithmtxt.ui.ExpArithmtxtOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Group types", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/group_types_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setGroupTypes(on);
		getTreeViewer().refresh();
	}
	
}
