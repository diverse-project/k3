/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.util;

/**
 * A utility class to inject/extract layout information into/from a model.
 */
public class ExpArithmtxtLayoutUtil {
	
	public final String LAYOUT_PACKAGE_NS_URI = "http://www.emftext.org/commons/layout";
	public final String LAYOUT_INFORMATION_ECLASS_NAME = "LayoutInformation";
	public final String ATTRIBUTE_LAYOUT_INFORMATION_ECLASS_NAME = "AttributeLayoutInformation";
	public final String REFERENCE_LAYOUT_INFORMATION_ECLASS_NAME = "ReferenceLayoutInformation";
	public final String KEYWORD_LAYOUT_INFORMATION_ECLASS_NAME = "KeywordLayoutInformation";
	
	public final String SYNTAX_ELEMENT_ID_EATTRIBUTE_NAME = "syntaxElementID";
	public final String OBJECT_EATTRIBUTE_NAME = "object";
	public final String VISIBLE_TOKEN_TEXT_EATTRIBUTE_NAME = "visibleTokenText";
	public final String HIDDEN_TOKEN_TEXT_EATTRIBUTE_NAME = "hiddenTokenText";
	public final String START_OFFSET_EATTRIBUTE_NAME = "startOffset";
	
	public void transferAllLayoutInformationToModel(org.eclipse.emf.ecore.EObject root) {
		transferLayoutInformationToModel(root);
		for (java.util.Iterator<org.eclipse.emf.ecore.EObject> i = root.eAllContents(); i.hasNext(); ) {
			transferLayoutInformationToModel(i.next());
		}
	}
	
	public void transferAllLayoutInformationFromModel(org.eclipse.emf.ecore.EObject root) {
		transferLayoutInformationFromModel(root);
		for (org.eclipse.emf.ecore.EObject next : new java.util.ArrayList<org.eclipse.emf.ecore.EObject>(root.eContents())) {
			transferAllLayoutInformationFromModel(next);
		}
	}
	
	public void transferLayoutInformationToModel(org.eclipse.emf.ecore.EObject element) {
		expArithm.resource.expArithmtxt.mopp.ExpArithmtxtLayoutInformationAdapter layoutInformationAdapter = getLayoutInformationAdapter(element);
		layoutInformationAdapter.getLayoutInformations();
		for (java.util.Iterator<expArithm.resource.expArithmtxt.mopp.ExpArithmtxtLayoutInformation> i = layoutInformationAdapter.getLayoutInformations().iterator(); i.hasNext(); ) {
			expArithm.resource.expArithmtxt.mopp.ExpArithmtxtLayoutInformation layoutInformation = i.next();
			org.eclipse.emf.ecore.EReference layoutReference = findLayoutReference(element.eClass());
			if (layoutReference != null) {
				org.eclipse.emf.ecore.EObject layoutInformationModelElement = createLayoutInformationModelElement(layoutInformation, layoutReference.getEType().getEPackage());
				if (layoutInformationModelElement != null) {
					@SuppressWarnings("unchecked")					
					java.util.List<org.eclipse.emf.ecore.EObject> list = (java.util.List<org.eclipse.emf.ecore.EObject>) element.eGet(layoutReference);
					list.add(layoutInformationModelElement);
					i.remove();
				}
			}
		}
	}
	
	public void transferLayoutInformationFromModel(org.eclipse.emf.ecore.EObject element) {
		org.eclipse.emf.ecore.EReference layoutReference = findLayoutReference(element.eClass());
		if (layoutReference != null) {
			expArithm.resource.expArithmtxt.mopp.ExpArithmtxtLayoutInformationAdapter layoutInformationAdapter = getLayoutInformationAdapter(element);
			@SuppressWarnings("unchecked")			
			java.util.List<org.eclipse.emf.ecore.EObject> list = (java.util.List<org.eclipse.emf.ecore.EObject>) element.eGet(layoutReference);
			for (java.util.Iterator<org.eclipse.emf.ecore.EObject> i = list.iterator(); i.hasNext(); ) {
				org.eclipse.emf.ecore.EObject layoutModelElement = i.next();
				expArithm.resource.expArithmtxt.mopp.ExpArithmtxtLayoutInformation layoutInformation = createLayoutInformation(layoutModelElement);
				if (layoutInformation != null) {
					layoutInformationAdapter.getLayoutInformations().add(layoutInformation);
					i.remove();
				}
			}
		}
	}
	
	public org.eclipse.emf.ecore.EObject createLayoutInformationModelElement(expArithm.resource.expArithmtxt.mopp.ExpArithmtxtLayoutInformation layoutInformation, org.eclipse.emf.ecore.EPackage layoutPackage) {
		org.eclipse.emf.ecore.EFactory factory = layoutPackage.getEFactoryInstance();
		Object object = layoutInformation.getObject(null, false);
		expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSyntaxElement syntaxElement = layoutInformation.getSyntaxElement();
		org.eclipse.emf.ecore.EClass layoutInformationEClass = null;
		org.eclipse.emf.ecore.EObject layoutInformationModelElement = null;
		if (object == null) {
			// keyword
			layoutInformationEClass = (org.eclipse.emf.ecore.EClass) layoutPackage.getEClassifier(KEYWORD_LAYOUT_INFORMATION_ECLASS_NAME);
			layoutInformationModelElement = factory.create(layoutInformationEClass);
		} else if (object instanceof org.eclipse.emf.ecore.EObject) {
			// reference
			layoutInformationEClass = (org.eclipse.emf.ecore.EClass) layoutPackage.getEClassifier(REFERENCE_LAYOUT_INFORMATION_ECLASS_NAME);
			layoutInformationModelElement = factory.create(layoutInformationEClass);
			layoutInformationModelElement.eSet(layoutInformationEClass.getEStructuralFeature(OBJECT_EATTRIBUTE_NAME), object);
		} else {
			// attribute
			layoutInformationEClass = (org.eclipse.emf.ecore.EClass) layoutPackage.getEClassifier(ATTRIBUTE_LAYOUT_INFORMATION_ECLASS_NAME);
			layoutInformationModelElement = factory.create(layoutInformationEClass);
		}
		layoutInformationModelElement.eSet(layoutInformationEClass.getEStructuralFeature(START_OFFSET_EATTRIBUTE_NAME), layoutInformation.getStartOffset());
		layoutInformationModelElement.eSet(layoutInformationEClass.getEStructuralFeature(HIDDEN_TOKEN_TEXT_EATTRIBUTE_NAME), layoutInformation.getHiddenTokenText());
		layoutInformationModelElement.eSet(layoutInformationEClass.getEStructuralFeature(VISIBLE_TOKEN_TEXT_EATTRIBUTE_NAME), layoutInformation.getVisibleTokenText());
		layoutInformationModelElement.eSet(layoutInformationEClass.getEStructuralFeature(SYNTAX_ELEMENT_ID_EATTRIBUTE_NAME), expArithm.resource.expArithmtxt.grammar.ExpArithmtxtGrammarInformationProvider.getSyntaxElementID(syntaxElement));
		return layoutInformationModelElement;
	}
	
	public expArithm.resource.expArithmtxt.mopp.ExpArithmtxtLayoutInformation createLayoutInformation(org.eclipse.emf.ecore.EObject layoutInformationModelElement) {
		Object object = null;
		org.eclipse.emf.ecore.EStructuralFeature objectFeature = layoutInformationModelElement.eClass().getEStructuralFeature(OBJECT_EATTRIBUTE_NAME);
		int startOffset = (Integer) layoutInformationModelElement.eGet(layoutInformationModelElement.eClass().getEStructuralFeature(START_OFFSET_EATTRIBUTE_NAME));
		String hiddenTokenText = (String) layoutInformationModelElement.eGet(layoutInformationModelElement.eClass().getEStructuralFeature(HIDDEN_TOKEN_TEXT_EATTRIBUTE_NAME));
		String visibleTokenText = (String) layoutInformationModelElement.eGet(layoutInformationModelElement.eClass().getEStructuralFeature(VISIBLE_TOKEN_TEXT_EATTRIBUTE_NAME));
		expArithm.resource.expArithmtxt.grammar.ExpArithmtxtSyntaxElement syntaxElement = expArithm.resource.expArithmtxt.grammar.ExpArithmtxtGrammarInformationProvider.getSyntaxElementByID((String) layoutInformationModelElement.eGet(layoutInformationModelElement.eClass().getEStructuralFeature(SYNTAX_ELEMENT_ID_EATTRIBUTE_NAME)));
		if (objectFeature != null) {
			object = layoutInformationModelElement.eGet(objectFeature);
		} else if (syntaxElement instanceof expArithm.resource.expArithmtxt.grammar.ExpArithmtxtPlaceholder) {
			expArithm.resource.expArithmtxt.grammar.ExpArithmtxtPlaceholder placeholder = (expArithm.resource.expArithmtxt.grammar.ExpArithmtxtPlaceholder) syntaxElement;
			expArithm.resource.expArithmtxt.IExpArithmtxtTokenResolver tokenResolver = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTokenResolverFactory().createTokenResolver(placeholder.getTokenName());
			expArithm.resource.expArithmtxt.IExpArithmtxtTokenResolveResult result = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTokenResolveResult();
			tokenResolver.resolve(visibleTokenText, placeholder.getFeature(), result);
			object = result.getResolvedToken();
		}
		return new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtLayoutInformation(syntaxElement, object, startOffset, hiddenTokenText, visibleTokenText);
	}
	
	public expArithm.resource.expArithmtxt.mopp.ExpArithmtxtLayoutInformationAdapter getLayoutInformationAdapter(org.eclipse.emf.ecore.EObject element) {
		for (org.eclipse.emf.common.notify.Adapter adapter : element.eAdapters()) {
			if (adapter instanceof expArithm.resource.expArithmtxt.mopp.ExpArithmtxtLayoutInformationAdapter) {
				return (expArithm.resource.expArithmtxt.mopp.ExpArithmtxtLayoutInformationAdapter) adapter;
			}
		}
		expArithm.resource.expArithmtxt.mopp.ExpArithmtxtLayoutInformationAdapter newAdapter = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtLayoutInformationAdapter();
		element.eAdapters().add(newAdapter);
		return newAdapter;
	}
	
	public org.eclipse.emf.ecore.EReference findLayoutReference(org.eclipse.emf.ecore.EClass eClass) {
		for (org.eclipse.emf.ecore.EReference ref : eClass.getEAllReferences()) {
			org.eclipse.emf.ecore.EClass type = ref.getEReferenceType();
			if (LAYOUT_PACKAGE_NS_URI.equals(type.getEPackage().getNsURI()) && ref.isMany() && LAYOUT_INFORMATION_ECLASS_NAME.equals(type.getName())) {
				return ref;
			}
		}
		return null;
	}
	
}
