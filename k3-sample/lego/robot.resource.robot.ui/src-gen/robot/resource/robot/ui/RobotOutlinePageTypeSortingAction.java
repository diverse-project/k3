/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.ui;

public class RobotOutlinePageTypeSortingAction extends robot.resource.robot.ui.AbstractRobotOutlinePageAction {
	
	public RobotOutlinePageTypeSortingAction(robot.resource.robot.ui.RobotOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Group types", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/group_types_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setGroupTypes(on);
		getTreeViewer().refresh();
	}
	
}
