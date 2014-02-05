/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.ui;

/**
 * A text editor for 'expArithmtxt' models.
 * <p>
 * This editor has id
 * <code>expArithm.resource.expArithmtxt.ui.ExpArithmtxtEditor</code>
 * The editor's context menu has id
 * <code>expArithm.resource.expArithmtxt.EditorContext</code>.
 * The editor's ruler context menu has id
 * <code>expArithm.resource.expArithmtxt.EditorRuler</code>.
 * </p>
 */
public class ExpArithmtxtEditor extends org.eclipse.ui.editors.text.TextEditor implements org.eclipse.emf.edit.domain.IEditingDomainProvider, org.eclipse.jface.viewers.ISelectionProvider, org.eclipse.jface.viewers.ISelectionChangedListener, org.eclipse.emf.common.ui.viewer.IViewerProvider, expArithm.resource.expArithmtxt.IExpArithmtxtResourceProvider, expArithm.resource.expArithmtxt.ui.IExpArithmtxtBracketHandlerProvider, expArithm.resource.expArithmtxt.ui.IExpArithmtxtAnnotationModelProvider {
	
	private expArithm.resource.expArithmtxt.ui.ExpArithmtxtHighlighting highlighting;
	private org.eclipse.jface.text.source.projection.ProjectionSupport projectionSupport;
	private expArithm.resource.expArithmtxt.ui.ExpArithmtxtCodeFoldingManager codeFoldingManager;
	private expArithm.resource.expArithmtxt.ui.ExpArithmtxtBackgroundParsingStrategy bgParsingStrategy = new expArithm.resource.expArithmtxt.ui.ExpArithmtxtBackgroundParsingStrategy();
	private java.util.Collection<expArithm.resource.expArithmtxt.IExpArithmtxtBackgroundParsingListener> bgParsingListeners = new java.util.ArrayList<expArithm.resource.expArithmtxt.IExpArithmtxtBackgroundParsingListener>();
	private expArithm.resource.expArithmtxt.ui.ExpArithmtxtColorManager colorManager = new expArithm.resource.expArithmtxt.ui.ExpArithmtxtColorManager();
	private expArithm.resource.expArithmtxt.ui.ExpArithmtxtOutlinePage outlinePage;
	private expArithm.resource.expArithmtxt.IExpArithmtxtTextResource resource;
	private org.eclipse.core.resources.IResourceChangeListener resourceChangeListener = new ModelResourceChangeListener();
	private expArithm.resource.expArithmtxt.ui.ExpArithmtxtPropertySheetPage propertySheetPage;
	private org.eclipse.emf.edit.domain.EditingDomain editingDomain;
	private org.eclipse.emf.edit.provider.ComposedAdapterFactory adapterFactory;
	private expArithm.resource.expArithmtxt.ui.IExpArithmtxtBracketHandler bracketHandler;
	private java.util.List<org.eclipse.jface.viewers.ISelectionChangedListener> selectionChangedListeners = new java.util.LinkedList<org.eclipse.jface.viewers.ISelectionChangedListener>();
	private org.eclipse.jface.viewers.ISelection editorSelection;
	
	public ExpArithmtxtEditor() {
		super();
		setSourceViewerConfiguration(new expArithm.resource.expArithmtxt.ui.ExpArithmtxtSourceViewerConfiguration(this, this, this, colorManager));
		initializeEditingDomain();
		org.eclipse.core.resources.ResourcesPlugin.getWorkspace().addResourceChangeListener(resourceChangeListener, org.eclipse.core.resources.IResourceChangeEvent.POST_CHANGE);
		addSelectionChangedListener(this);
	}
	
	/**
	 * A custom document listener that triggers background parsing if needed.
	 */
	private final class DocumentListener implements org.eclipse.jface.text.IDocumentListener {
		
		public void documentAboutToBeChanged(org.eclipse.jface.text.DocumentEvent event) {
		}
		
		public void documentChanged(org.eclipse.jface.text.DocumentEvent event) {
			bgParsingStrategy.parse(event, getResource(), ExpArithmtxtEditor.this);
		}
	}
	
	/**
	 * Reacts to changes of the text resource displayed in the editor and resources
	 * cross-referenced by it. Cross-referenced resources are unloaded, the displayed
	 * resource is reloaded. An attempt to resolve all proxies in the displayed
	 * resource is made after each change.
	 * The code pretty much corresponds to what EMF generates for a tree editor.
	 */
	private class ModelResourceChangeListener implements org.eclipse.core.resources.IResourceChangeListener {
		public void resourceChanged(org.eclipse.core.resources.IResourceChangeEvent event) {
			org.eclipse.core.resources.IResourceDelta delta = event.getDelta();
			try {
				class ResourceDeltaVisitor implements org.eclipse.core.resources.IResourceDeltaVisitor {
					protected org.eclipse.emf.ecore.resource.ResourceSet resourceSet = editingDomain.getResourceSet();
					
					public boolean visit(org.eclipse.core.resources.IResourceDelta delta) {
						if (delta.getResource().getType() != org.eclipse.core.resources.IResource.FILE) {
							return true;
						}
						int deltaKind = delta.getKind();
						if (deltaKind == org.eclipse.core.resources.IResourceDelta.CHANGED && delta.getFlags() != org.eclipse.core.resources.IResourceDelta.MARKERS) {
							org.eclipse.emf.ecore.resource.Resource changedResource = resourceSet.getResource(org.eclipse.emf.common.util.URI.createURI(delta.getFullPath().toString()), false);
							if (changedResource != null) {
								changedResource.unload();
								expArithm.resource.expArithmtxt.IExpArithmtxtTextResource currentResource = getResource();
								if (changedResource.equals(currentResource)) {
									// reload the resource displayed in the editor
									resourceSet.getResource(currentResource.getURI(), true);
								}
								if (currentResource != null && currentResource.getErrors().isEmpty()) {
									org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(currentResource);
								}
								// reset the selected element in outline and properties by text position
								if (highlighting != null) {
									highlighting.setEObjectSelection();
								}
							}
						}
						
						return true;
					}
				}
				
				ResourceDeltaVisitor visitor = new ResourceDeltaVisitor();
				delta.accept(visitor);
			} catch (org.eclipse.core.runtime.CoreException exception) {
				expArithm.resource.expArithmtxt.ui.ExpArithmtxtUIPlugin.logError("Unexpected Error: ", exception);
			}
		}
	}
	
	public void initializeEditor() {
		super.initializeEditor();
		setEditorContextMenuId("expArithm.resource.expArithmtxt.EditorContext");
		setRulerContextMenuId("expArithm.resource.expArithmtxt.EditorRuler");
	}
	
	public Object getAdapter(@SuppressWarnings("rawtypes") Class required) {
		if (org.eclipse.ui.views.contentoutline.IContentOutlinePage.class.equals(required)) {
			return getOutlinePage();
		} else if (required.equals(org.eclipse.ui.views.properties.IPropertySheetPage.class)) {
			return getPropertySheetPage();
		}
		return super.getAdapter(required);
	}
	
	public void createPartControl(org.eclipse.swt.widgets.Composite parent) {
		super.createPartControl(parent);
		
		// Code Folding
		org.eclipse.jface.text.source.projection.ProjectionViewer viewer = (org.eclipse.jface.text.source.projection.ProjectionViewer) getSourceViewer();
		// Occurrence initiation, need ITextResource and ISourceViewer.
		highlighting = new expArithm.resource.expArithmtxt.ui.ExpArithmtxtHighlighting(getResource(), viewer, colorManager, this);
		
		projectionSupport = new org.eclipse.jface.text.source.projection.ProjectionSupport(viewer, getAnnotationAccess(), getSharedColors());
		projectionSupport.install();
		
		// turn projection mode on
		viewer.doOperation(org.eclipse.jface.text.source.projection.ProjectionViewer.TOGGLE);
		codeFoldingManager = new expArithm.resource.expArithmtxt.ui.ExpArithmtxtCodeFoldingManager(viewer, this);
	}
	
	protected void doSetInput(org.eclipse.ui.IEditorInput editorInput) throws org.eclipse.core.runtime.CoreException {
		super.doSetInput(editorInput);
		initializeResourceObject(editorInput);
		org.eclipse.jface.text.IDocument document = getDocumentProvider().getDocument(getEditorInput());
		document.addDocumentListener(new DocumentListener());
	}
	
	private void initializeResourceObject(org.eclipse.ui.IEditorInput editorInput) {
		org.eclipse.ui.part.FileEditorInput input = (org.eclipse.ui.part.FileEditorInput) editorInput;
		org.eclipse.core.resources.IFile inputFile = input.getFile();
		expArithm.resource.expArithmtxt.mopp.ExpArithmtxtNature.activate(inputFile.getProject());
		String path = inputFile.getFullPath().toString();
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createPlatformResourceURI(path, true);
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = editingDomain.getResourceSet();
		expArithm.resource.expArithmtxt.IExpArithmtxtTextResource loadedResource = (expArithm.resource.expArithmtxt.IExpArithmtxtTextResource) resourceSet.getResource(uri, false);
		if (loadedResource == null) {
			try {
				org.eclipse.emf.ecore.resource.Resource demandLoadedResource = null;
				// here we do not use getResource(), because 'resource' might be null, which is ok
				// when initializing the resource object
				expArithm.resource.expArithmtxt.IExpArithmtxtTextResource currentResource = this.resource;
				if (currentResource != null && !currentResource.getURI().fileExtension().equals(uri.fileExtension())) {
					// do not attempt to load if file extension has changed in a 'save as' operation	
				}
				else {
					demandLoadedResource = resourceSet.getResource(uri, true);
				}
				if (demandLoadedResource instanceof expArithm.resource.expArithmtxt.IExpArithmtxtTextResource) {
					setResource((expArithm.resource.expArithmtxt.IExpArithmtxtTextResource) demandLoadedResource);
				} else {
					// the resource was not loaded by an EMFText resource, but some other EMF resource
					expArithm.resource.expArithmtxt.ui.ExpArithmtxtUIPlugin.showErrorDialog("No EMFText resource.", "The file '" + uri.lastSegment() + "' of type '" + uri.fileExtension() + "' can not be handled by the ExpArithmtxtEditor.");
					// close this editor because it can not present the resource
					close(false);
				}
			} catch (Exception e) {
				expArithm.resource.expArithmtxt.ui.ExpArithmtxtUIPlugin.logError("Exception while loading resource in " + this.getClass().getSimpleName() + ".", e);
			}
		} else {
			setResource(loadedResource);
		}
	}
	
	public void dispose() {
		colorManager.dispose();
		org.eclipse.core.resources.ResourcesPlugin.getWorkspace().removeResourceChangeListener(resourceChangeListener);
		super.dispose();
	}
	
	protected void performSave(boolean overwrite, org.eclipse.core.runtime.IProgressMonitor progressMonitor) {
		
		super.performSave(overwrite, progressMonitor);
		
		// Save code folding state
		codeFoldingManager.saveCodeFoldingStateFile(getResource().getURI().toString());
	}
	
	public void registerTextPresentationListener(org.eclipse.jface.text.ITextPresentationListener listener) {
		org.eclipse.jface.text.source.ISourceViewer viewer = getSourceViewer();
		if (viewer instanceof org.eclipse.jface.text.TextViewer) {
			((org.eclipse.jface.text.TextViewer) viewer).addTextPresentationListener(listener);
		}
	}
	
	public void invalidateTextRepresentation() {
		org.eclipse.jface.text.source.ISourceViewer viewer = getSourceViewer();
		if (viewer != null) {
			viewer.invalidateTextPresentation();
		}
		highlighting.resetValues();
	}
	
	public void setFocus() {
		super.setFocus();
		this.invalidateTextRepresentation();
		// Parse the document again to remove errors that stem from unresolvable proxy
		// objects
		bgParsingStrategy.parse(getSourceViewer().getDocument(), resource, this, 10);
	}
	
	protected void performSaveAs(org.eclipse.core.runtime.IProgressMonitor progressMonitor) {
		org.eclipse.ui.part.FileEditorInput input = (org.eclipse.ui.part.FileEditorInput) getEditorInput();
		String path = input.getFile().getFullPath().toString();
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = editingDomain.getResourceSet();
		org.eclipse.emf.common.util.URI platformURI = org.eclipse.emf.common.util.URI.createPlatformResourceURI(path, true);
		org.eclipse.emf.ecore.resource.Resource oldFile = resourceSet.getResource(platformURI, true);
		
		super.performSaveAs(progressMonitor);
		
		// load and resave - input has been changed to new path by super
		org.eclipse.ui.part.FileEditorInput newInput = (org.eclipse.ui.part.FileEditorInput) getEditorInput();
		String newPath = newInput.getFile().getFullPath().toString();
		org.eclipse.emf.common.util.URI newPlatformURI = org.eclipse.emf.common.util.URI.createPlatformResourceURI(newPath, true);
		org.eclipse.emf.ecore.resource.Resource newFile = resourceSet.createResource(newPlatformURI);
		// if the extension is the same, saving was already performed by super by saving
		// the plain text
		if (platformURI.fileExtension().equals(newPlatformURI.fileExtension())) {
			oldFile.unload();
			// save code folding state, is it possible with a new name
			codeFoldingManager.saveCodeFoldingStateFile(getResource().getURI().toString());
		}
		else {
			newFile.getContents().clear();
			newFile.getContents().addAll(oldFile.getContents());
			try {
				oldFile.unload();
				if (newFile.getErrors().isEmpty()) {
					newFile.save(null);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public org.eclipse.emf.ecore.resource.ResourceSet getResourceSet() {
		return editingDomain.getResourceSet();
	}
	
	public expArithm.resource.expArithmtxt.IExpArithmtxtTextResource getResource() {
		return resource;
	}
	
	private void setResource(expArithm.resource.expArithmtxt.IExpArithmtxtTextResource resource) {
		assert resource != null;
		this.resource = resource;
		if (this.resource.getErrors().isEmpty()) {
			org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(this.resource);
		}
	}
	
	private Object getOutlinePage() {
		if (outlinePage == null) {
			outlinePage = new expArithm.resource.expArithmtxt.ui.ExpArithmtxtOutlinePage(this);
			outlinePage.addSelectionChangedListener(highlighting);
			highlighting.addSelectionChangedListener(outlinePage);
		}
		return outlinePage;
	}
	
	public org.eclipse.ui.views.properties.IPropertySheetPage getPropertySheetPage() {
		if (propertySheetPage == null) {
			propertySheetPage = new expArithm.resource.expArithmtxt.ui.ExpArithmtxtPropertySheetPage();
			// add a slightly modified adapter factory that does not return any editors for
			// properties. this way, a model can never be modified through the properties view.
			propertySheetPage.setPropertySourceProvider(new org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider(adapterFactory) {
				protected org.eclipse.ui.views.properties.IPropertySource createPropertySource(Object object, org.eclipse.emf.edit.provider.IItemPropertySource itemPropertySource) {
					return new org.eclipse.emf.edit.ui.provider.PropertySource(object, itemPropertySource) {
						protected org.eclipse.ui.views.properties.IPropertyDescriptor createPropertyDescriptor(org.eclipse.emf.edit.provider.IItemPropertyDescriptor itemPropertyDescriptor) {
							return new org.eclipse.emf.edit.ui.provider.PropertyDescriptor(object, itemPropertyDescriptor) {
								public org.eclipse.jface.viewers.CellEditor createPropertyEditor(org.eclipse.swt.widgets.Composite composite) {
									return null;
								}
							};
						}
					};
				}
			});
			highlighting.addSelectionChangedListener(propertySheetPage);
		}
		return propertySheetPage;
	}
	
	public org.eclipse.emf.edit.domain.EditingDomain getEditingDomain() {
		return editingDomain;
	}
	
	private void initializeEditingDomain() {
		adapterFactory = new org.eclipse.emf.edit.provider.ComposedAdapterFactory(org.eclipse.emf.edit.provider.ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory());
		
		org.eclipse.emf.common.command.BasicCommandStack commandStack = new org.eclipse.emf.common.command.BasicCommandStack();
		// CommandStackListeners can listen for changes. Not sure whether this is needed.
		
		editingDomain = new org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain(adapterFactory, commandStack, new java.util.LinkedHashMap<org.eclipse.emf.ecore.resource.Resource, Boolean>());
	}
	
	/**
	 * Sets the caret to the offset of the given element.
	 * 
	 * @param element has to be contained in the resource of this editor.
	 */
	public void setCaret(org.eclipse.emf.ecore.EObject element, String text) {
		try {
			if (element == null || text == null || text.equals("")) {
				return;
			}
			org.eclipse.jface.text.source.ISourceViewer viewer = getSourceViewer();
			expArithm.resource.expArithmtxt.IExpArithmtxtTextResource textResource = (expArithm.resource.expArithmtxt.IExpArithmtxtTextResource) element.eResource();
			expArithm.resource.expArithmtxt.IExpArithmtxtLocationMap locationMap = textResource.getLocationMap();
			int destination = locationMap.getCharStart(element);
			int length = locationMap.getCharEnd(element) + 1 - destination;
			
			expArithm.resource.expArithmtxt.IExpArithmtxtTextScanner lexer = getResource().getMetaInformation().createLexer();
			try {
				lexer.setText(viewer.getDocument().get(destination, length));
				expArithm.resource.expArithmtxt.IExpArithmtxtTextToken token = lexer.getNextToken();
				String tokenText = token.getText();
				while (tokenText != null) {
					if (token.getText().equals(text)) {
						destination += token.getOffset();
						break;
					}
					token = lexer.getNextToken();
					if (token == null) {
						break;
					}
					tokenText = token.getText();
				}
			} catch (org.eclipse.jface.text.BadLocationException e) {
			}
			destination = ((org.eclipse.jface.text.source.projection.ProjectionViewer) viewer).modelOffset2WidgetOffset(destination);
			if (destination < 0) {
				destination = 0;
			}
			viewer.getTextWidget().setSelection(destination);
		} catch (Exception e) {
			expArithm.resource.expArithmtxt.ui.ExpArithmtxtUIPlugin.logError("Exception in setCaret()", e);
		}
	}
	
	protected org.eclipse.jface.text.source.ISourceViewer createSourceViewer(org.eclipse.swt.widgets.Composite parent, org.eclipse.jface.text.source.IVerticalRuler ruler, int styles) {
		org.eclipse.jface.text.source.ISourceViewer viewer = new org.eclipse.jface.text.source.projection.ProjectionViewer(parent, ruler, getOverviewRuler(), isOverviewRulerVisible(), styles) {
			
			public void setSelection(org.eclipse.jface.viewers.ISelection selection, boolean reveal) {
				if (!ExpArithmtxtEditor.this.setSelection(selection, reveal)) {
					super.setSelection(selection, reveal);
				}
			}
			
		};
		// ensure decoration support has been created and configured.
		getSourceViewerDecorationSupport(viewer);
		return viewer;
	}
	
	public void addBackgroundParsingListener(expArithm.resource.expArithmtxt.IExpArithmtxtBackgroundParsingListener listener) {
		bgParsingListeners.add(listener);
	}
	
	public void notifyBackgroundParsingFinished() {
		for (expArithm.resource.expArithmtxt.IExpArithmtxtBackgroundParsingListener listener : bgParsingListeners) {
			listener.parsingCompleted(getResource());
		}
	}
	
	public expArithm.resource.expArithmtxt.ui.IExpArithmtxtBracketHandler getBracketHandler() {
		return bracketHandler;
	}
	
	public void setBracketHandler(expArithm.resource.expArithmtxt.ui.IExpArithmtxtBracketHandler bracketHandler) {
		this.bracketHandler = bracketHandler;
	}
	
	public void createActions() {
		super.createActions();
		java.util.ResourceBundle resourceBundle = new java.util.ResourceBundle() {
			public java.util.Enumeration<String> getKeys() {
				java.util.List<String> keys = new java.util.ArrayList<String>(3);
				keys.add("SelectAnnotationRulerAction.QuickFix.label");
				keys.add("SelectAnnotationRulerAction.QuickFix.tooltip");
				keys.add("SelectAnnotationRulerAction.QuickFix.description");
				return java.util.Collections.enumeration(keys);
			}
			public Object handleGetObject(String key) {
				if (key.equals("SelectAnnotationRulerAction.QuickFix.label")) return "&Quick Fix";
				if (key.equals("SelectAnnotationRulerAction.QuickFix.tooltip")) return "Quick Fix";
				if (key.equals("SelectAnnotationRulerAction.QuickFix.description")) return "Runs Quick Fix on the annotation's line";
				return null;
			}
		};
		setAction(org.eclipse.ui.texteditor.ITextEditorActionConstants.RULER_CLICK, new org.eclipse.ui.texteditor.SelectMarkerRulerAction(resourceBundle, "SelectAnnotationRulerAction.", this, getVerticalRuler()) {
			public void run() {
				runWithEvent(null);
			}
			
			public void runWithEvent(org.eclipse.swt.widgets.Event event) {
				org.eclipse.jface.text.ITextOperationTarget operation = (org.eclipse.jface.text.ITextOperationTarget) getAdapter(org.eclipse.jface.text.ITextOperationTarget.class);
				final int opCode = org.eclipse.jface.text.source.ISourceViewer.QUICK_ASSIST;
				if (operation != null && operation.canDoOperation(opCode)) {
					org.eclipse.jface.text.Position position = getPosition();
					if (position != null) {
						selectAndReveal(position.getOffset(), position.getLength());
					}
					operation.doOperation(opCode);
				}
			}
			
			private org.eclipse.jface.text.Position getPosition() {
				org.eclipse.ui.texteditor.AbstractMarkerAnnotationModel model = getAnnotationModel();
				org.eclipse.jface.text.source.IAnnotationAccessExtension  annotationAccess = getAnnotationAccessExtension();
				
				org.eclipse.jface.text.IDocument document = getDocument();
				if (model == null) {
					return null;
				}
				
				java.util.Iterator<?> iter = model.getAnnotationIterator();
				int layer = Integer.MIN_VALUE;
				
				while (iter.hasNext()) {
					org.eclipse.jface.text.source.Annotation annotation = (org.eclipse.jface.text.source.Annotation) iter.next();
					if (annotation.isMarkedDeleted()) {
						continue;
					}
					
					if (annotationAccess != null) {
						int annotationLayer = annotationAccess.getLayer(annotation);
						if (annotationLayer < layer) {
							continue;
						}
					}
					
					org.eclipse.jface.text.Position position = model.getPosition(annotation);
					if (!includesRulerLine(position, document)) {
						continue;
					}
					
					return position;
				}
				return null;
			}
			
		});
	}
	
	public org.eclipse.jface.text.source.IAnnotationModel getAnnotationModel() {
		return getDocumentProvider().getAnnotationModel(getEditorInput());
	}
	
	public void addSelectionChangedListener(org.eclipse.jface.viewers.ISelectionChangedListener listener) {
		selectionChangedListeners.add(listener);
	}
	
	public org.eclipse.jface.viewers.ISelection getSelection() {
		return editorSelection;
	}
	
	public void removeSelectionChangedListener(org.eclipse.jface.viewers.ISelectionChangedListener listener) {
		selectionChangedListeners.remove(listener);
	}
	
	public void selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent event) {
		org.eclipse.jface.viewers.ISelection selection = event.getSelection();
		setSelection(selection, true);
	}
	
	public void setSelection(org.eclipse.jface.viewers.ISelection selection) {
		editorSelection = selection;
		for (org.eclipse.jface.viewers.ISelectionChangedListener listener : selectionChangedListeners) {
			listener.selectionChanged(new org.eclipse.jface.viewers.SelectionChangedEvent(this, selection));
		}
	}
	
	private boolean setSelection(org.eclipse.jface.viewers.ISelection selection, boolean reveal) {
		if (selection instanceof org.eclipse.jface.viewers.IStructuredSelection) {
			org.eclipse.jface.viewers.IStructuredSelection structuredSelection = (org.eclipse.jface.viewers.IStructuredSelection) selection;
			Object object = structuredSelection.getFirstElement();
			if (object instanceof org.eclipse.emf.ecore.EObject) {
				org.eclipse.emf.ecore.EObject element = (org.eclipse.emf.ecore.EObject) object;
				org.eclipse.emf.ecore.resource.Resource resource = element.eResource();
				if (resource == null) {
					return false;
				}
				if (!(resource instanceof expArithm.resource.expArithmtxt.IExpArithmtxtTextResource)) {
					return false;
				}
				expArithm.resource.expArithmtxt.IExpArithmtxtTextResource textResource = (expArithm.resource.expArithmtxt.IExpArithmtxtTextResource) resource;
				expArithm.resource.expArithmtxt.IExpArithmtxtLocationMap locationMap = textResource.getLocationMap();
				int destination = locationMap.getCharStart(element);
				if (destination < 0) {
					destination = 0;
				}
				selectAndReveal(destination, 0);
				int length = locationMap.getCharEnd(element) - destination + 1;
				getSourceViewer().setRangeIndication(destination, length, true);
				getSourceViewer().setSelectedRange(destination, length);
				return true;
			}
		}
		return false;
	}
	
	public org.eclipse.jface.viewers.Viewer getViewer() {
		return (org.eclipse.jface.text.source.projection.ProjectionViewer) getSourceViewer();
	}
	
}
