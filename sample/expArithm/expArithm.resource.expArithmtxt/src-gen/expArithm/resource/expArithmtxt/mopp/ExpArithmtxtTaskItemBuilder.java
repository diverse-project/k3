/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.mopp;

/**
 * The ExpArithmtxtTaskItemBuilder is used to find task items in text documents.
 * The current implementation uses the generated lexer and the TaskItemDetector to
 * detect task items. This class is called by the BuilderAdapter, which runs both
 * this builder and the default builder that is intended to be customized.
 */
public class ExpArithmtxtTaskItemBuilder {
	
	public void build(org.eclipse.core.resources.IFile resource, org.eclipse.emf.ecore.resource.ResourceSet resourceSet, org.eclipse.core.runtime.IProgressMonitor monitor) {
		monitor.setTaskName("Searching for task items");
		new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtMarkerHelper().removeAllMarkers(resource, org.eclipse.core.resources.IMarker.TASK);
		if (isInBinFolder(resource)) {
			return;
		}
		java.util.List<expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTaskItem> taskItems = new java.util.ArrayList<expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTaskItem>();
		expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTaskItemDetector taskItemDetector = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTaskItemDetector();
		try {
			java.io.InputStream inputStream = resource.getContents();
			String content = expArithm.resource.expArithmtxt.util.ExpArithmtxtStreamUtil.getContent(inputStream);
			expArithm.resource.expArithmtxt.IExpArithmtxtTextScanner lexer = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtMetaInformation().createLexer();
			lexer.setText(content);
			
			expArithm.resource.expArithmtxt.IExpArithmtxtTextToken nextToken = lexer.getNextToken();
			while (nextToken != null) {
				String text = nextToken.getText();
				taskItems.addAll(taskItemDetector.findTaskItems(text, nextToken.getLine(), nextToken.getOffset()));
				nextToken = lexer.getNextToken();
			}
		} catch (java.io.IOException e) {
			expArithm.resource.expArithmtxt.mopp.ExpArithmtxtPlugin.logError("Exception while searching for task items", e);
		} catch (org.eclipse.core.runtime.CoreException e) {
			expArithm.resource.expArithmtxt.mopp.ExpArithmtxtPlugin.logError("Exception while searching for task items", e);
		}
		
		for (expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTaskItem taskItem : taskItems) {
			java.util.Map<String, Object> markerAttributes = new java.util.LinkedHashMap<String, Object>();
			markerAttributes.put(org.eclipse.core.resources.IMarker.USER_EDITABLE, false);
			markerAttributes.put(org.eclipse.core.resources.IMarker.DONE, false);
			markerAttributes.put(org.eclipse.core.resources.IMarker.LINE_NUMBER, taskItem.getLine());
			markerAttributes.put(org.eclipse.core.resources.IMarker.CHAR_START, taskItem.getCharStart());
			markerAttributes.put(org.eclipse.core.resources.IMarker.CHAR_END, taskItem.getCharEnd());
			markerAttributes.put(org.eclipse.core.resources.IMarker.MESSAGE, taskItem.getMessage());
			new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtMarkerHelper().createMarker(resource, org.eclipse.core.resources.IMarker.TASK, markerAttributes);
		}
	}
	
	public String getBuilderMarkerId() {
		return org.eclipse.core.resources.IMarker.TASK;
	}
	
	public boolean isInBinFolder(org.eclipse.core.resources.IFile resource) {
		org.eclipse.core.resources.IContainer parent = resource.getParent();
		while (parent != null) {
			if ("bin".equals(parent.getName())) {
				return true;
			}
			parent = parent.getParent();
		}
		return false;
	}
	
}
