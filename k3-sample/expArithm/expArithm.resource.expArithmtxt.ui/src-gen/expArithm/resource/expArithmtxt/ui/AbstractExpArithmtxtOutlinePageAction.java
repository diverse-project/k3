/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.ui;

public abstract class AbstractExpArithmtxtOutlinePageAction extends org.eclipse.jface.action.Action {
	
	private String preferenceKey = this.getClass().getSimpleName() + ".isChecked";
	
	private expArithm.resource.expArithmtxt.ui.ExpArithmtxtOutlinePageTreeViewer treeViewer;
	
	public AbstractExpArithmtxtOutlinePageAction(expArithm.resource.expArithmtxt.ui.ExpArithmtxtOutlinePageTreeViewer treeViewer, String text, int style) {
		super(text, style);
		this.treeViewer = treeViewer;
	}
	
	public void initialize(String imagePath) {
		org.eclipse.jface.resource.ImageDescriptor descriptor = expArithm.resource.expArithmtxt.ui.ExpArithmtxtImageProvider.INSTANCE.getImageDescriptor(imagePath);
		setDisabledImageDescriptor(descriptor);
		setImageDescriptor(descriptor);
		setHoverImageDescriptor(descriptor);
		boolean checked = expArithm.resource.expArithmtxt.ui.ExpArithmtxtUIPlugin.getDefault().getPreferenceStore().getBoolean(preferenceKey);
		valueChanged(checked, false);
	}
	
	@Override	
	public void run() {
		if (keepState()) {
			valueChanged(isChecked(), true);
		} else {
			runBusy(true);
		}
	}
	
	public void runBusy(final boolean on) {
		org.eclipse.swt.custom.BusyIndicator.showWhile(org.eclipse.swt.widgets.Display.getCurrent(), new Runnable() {
			public void run() {
				runInternal(on);
			}
		});
	}
	
	public abstract void runInternal(boolean on);
	
	private void valueChanged(boolean on, boolean store) {
		setChecked(on);
		runBusy(on);
		if (store) {
			expArithm.resource.expArithmtxt.ui.ExpArithmtxtUIPlugin.getDefault().getPreferenceStore().setValue(preferenceKey, on);
		}
	}
	
	public boolean keepState() {
		return true;
	}
	
	public expArithm.resource.expArithmtxt.ui.ExpArithmtxtOutlinePageTreeViewer getTreeViewer() {
		return treeViewer;
	}
	
	public expArithm.resource.expArithmtxt.ui.ExpArithmtxtOutlinePageTreeViewerComparator getTreeViewerComparator() {
		return (expArithm.resource.expArithmtxt.ui.ExpArithmtxtOutlinePageTreeViewerComparator) treeViewer.getComparator();
	}
	
}
