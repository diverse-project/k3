/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.mopp;

public class ExpArithmtxtMetaInformation implements expArithm.resource.expArithmtxt.IExpArithmtxtMetaInformation {
	
	public String getSyntaxName() {
		return "expArithmtxt";
	}
	
	public String getURI() {
		return "http://expArithm";
	}
	
	public expArithm.resource.expArithmtxt.IExpArithmtxtTextScanner createLexer() {
		return new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtAntlrScanner(new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtLexer());
	}
	
	public expArithm.resource.expArithmtxt.IExpArithmtxtTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtParser().createInstance(inputStream, encoding);
	}
	
	public expArithm.resource.expArithmtxt.IExpArithmtxtTextPrinter createPrinter(java.io.OutputStream outputStream, expArithm.resource.expArithmtxt.IExpArithmtxtTextResource resource) {
		return new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public expArithm.resource.expArithmtxt.IExpArithmtxtReferenceResolverSwitch getReferenceResolverSwitch() {
		return new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtReferenceResolverSwitch();
	}
	
	public expArithm.resource.expArithmtxt.IExpArithmtxtTokenResolverFactory getTokenResolverFactory() {
		return new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "insa.expArithm/metamodel/expArithm.cs";
	}
	
	public String[] getTokenNames() {
		return expArithm.resource.expArithmtxt.mopp.ExpArithmtxtParser.tokenNames;
	}
	
	public expArithm.resource.expArithmtxt.IExpArithmtxtTokenStyle getDefaultTokenStyle(String tokenName) {
		return new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<expArithm.resource.expArithmtxt.IExpArithmtxtBracketPair> getBracketPairs() {
		return new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtResourceFactory();
	}
	
	public expArithm.resource.expArithmtxt.mopp.ExpArithmtxtNewFileContentProvider getNewFileContentProvider() {
		return new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtResourceFactory());
	}
	
	/**
	 * Returns the key of the option that can be used to register a preprocessor that
	 * is used as a pipe when loading resources. This key is language-specific. To
	 * register one preprocessor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getInputStreamPreprocessorProviderOptionKey() {
		return getSyntaxName() + "_" + "INPUT_STREAM_PREPROCESSOR_PROVIDER";
	}
	
	/**
	 * Returns the key of the option that can be used to register a post-processors
	 * that are invoked after loading resources. This key is language-specific. To
	 * register one post-processor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getResourcePostProcessorProviderOptionKey() {
		return getSyntaxName() + "_" + "RESOURCE_POSTPROCESSOR_PROVIDER";
	}
	
	public String getLaunchConfigurationType() {
		return "expArithm.resource.expArithmtxt.ui.launchConfigurationType";
	}
	
	public expArithm.resource.expArithmtxt.IExpArithmtxtNameProvider createNameProvider() {
		return new expArithm.resource.expArithmtxt.analysis.ExpArithmtxtDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		expArithm.resource.expArithmtxt.mopp.ExpArithmtxtAntlrTokenHelper tokenHelper = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtAntlrTokenHelper();
		java.util.List<String> highlightableTokens = new java.util.ArrayList<String>();
		String[] parserTokenNames = getTokenNames();
		for (int i = 0; i < parserTokenNames.length; i++) {
			// If ANTLR is used we need to normalize the token names
			if (!tokenHelper.canBeUsedForSyntaxHighlighting(i)) {
				continue;
			}
			String tokenName = tokenHelper.getTokenName(parserTokenNames, i);
			if (tokenName == null) {
				continue;
			}
			highlightableTokens.add(tokenName);
		}
		highlightableTokens.add(expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
