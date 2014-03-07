/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.mopp;

public class RobotMetaInformation implements robot.resource.robot.IRobotMetaInformation {
	
	public String getSyntaxName() {
		return "robot";
	}
	
	public String getURI() {
		return "http://robot/1.0";
	}
	
	public robot.resource.robot.IRobotTextScanner createLexer() {
		return new robot.resource.robot.mopp.RobotAntlrScanner(new robot.resource.robot.mopp.RobotLexer());
	}
	
	public robot.resource.robot.IRobotTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new robot.resource.robot.mopp.RobotParser().createInstance(inputStream, encoding);
	}
	
	public robot.resource.robot.IRobotTextPrinter createPrinter(java.io.OutputStream outputStream, robot.resource.robot.IRobotTextResource resource) {
		return new robot.resource.robot.mopp.RobotPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new robot.resource.robot.mopp.RobotSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new robot.resource.robot.mopp.RobotSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public robot.resource.robot.IRobotReferenceResolverSwitch getReferenceResolverSwitch() {
		return new robot.resource.robot.mopp.RobotReferenceResolverSwitch();
	}
	
	public robot.resource.robot.IRobotTokenResolverFactory getTokenResolverFactory() {
		return new robot.resource.robot.mopp.RobotTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "lego/metamodel/robot.cs";
	}
	
	public String[] getTokenNames() {
		return robot.resource.robot.mopp.RobotParser.tokenNames;
	}
	
	public robot.resource.robot.IRobotTokenStyle getDefaultTokenStyle(String tokenName) {
		return new robot.resource.robot.mopp.RobotTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<robot.resource.robot.IRobotBracketPair> getBracketPairs() {
		return new robot.resource.robot.mopp.RobotBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new robot.resource.robot.mopp.RobotFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new robot.resource.robot.mopp.RobotResourceFactory();
	}
	
	public robot.resource.robot.mopp.RobotNewFileContentProvider getNewFileContentProvider() {
		return new robot.resource.robot.mopp.RobotNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new robot.resource.robot.mopp.RobotResourceFactory());
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
		return "robot.resource.robot.ui.launchConfigurationType";
	}
	
	public robot.resource.robot.IRobotNameProvider createNameProvider() {
		return new robot.resource.robot.analysis.RobotDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		robot.resource.robot.mopp.RobotAntlrTokenHelper tokenHelper = new robot.resource.robot.mopp.RobotAntlrTokenHelper();
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
		highlightableTokens.add(robot.resource.robot.mopp.RobotTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
