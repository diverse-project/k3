// $ANTLR 3.4

	package robot.resource.robot.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class RobotParser extends RobotANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BOOLEAN_LITERAL", "INT_LITERAL", "LINEBREAK", "STRING_LITERAL", "TEXT", "WHITESPACE", "'('", "')'", "','", "'='", "'and'", "'angle'", "'bip'", "'col'", "'display'", "'distance'", "'do'", "'duration'", "'else'", "'end'", "'hasTurned'", "'if'", "'line'", "'move'", "'msg'", "'not'", "'obstacle'", "'power'", "'repeat'", "'setTurnAngle'", "'stopEngine'", "'stopProgram'", "'then'", "'turn'", "'while'"
    };

    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int BOOLEAN_LITERAL=4;
    public static final int INT_LITERAL=5;
    public static final int LINEBREAK=6;
    public static final int STRING_LITERAL=7;
    public static final int TEXT=8;
    public static final int WHITESPACE=9;

    // delegates
    public RobotANTLRParserBase[] getDelegates() {
        return new RobotANTLRParserBase[] {};
    }

    // delegators


    public RobotParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public RobotParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.initializeRuleMemo(36 + 1);
         

    }

    public String[] getTokenNames() { return RobotParser.tokenNames; }
    public String getGrammarFileName() { return "Robot.g"; }


    	private robot.resource.robot.IRobotTokenResolverFactory tokenResolverFactory = new robot.resource.robot.mopp.RobotTokenResolverFactory();
    	
    	/**
    	 * the index of the last token that was handled by collectHiddenTokens()
    	 */
    	private int lastPosition;
    	
    	/**
    	 * A flag that indicates whether the parser should remember all expected elements.
    	 * This flag is set to true when using the parse for code completion. Otherwise it
    	 * is set to false.
    	 */
    	private boolean rememberExpectedElements = false;
    	
    	private Object parseToIndexTypeObject;
    	private int lastTokenIndex = 0;
    	
    	/**
    	 * A list of expected elements the were collected while parsing the input stream.
    	 * This list is only filled if <code>rememberExpectedElements</code> is set to
    	 * true.
    	 */
    	private java.util.List<robot.resource.robot.mopp.RobotExpectedTerminal> expectedElements = new java.util.ArrayList<robot.resource.robot.mopp.RobotExpectedTerminal>();
    	
    	private int mismatchedTokenRecoveryTries = 0;
    	/**
    	 * A helper list to allow a lexer to pass errors to its parser
    	 */
    	protected java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>());
    	
    	/**
    	 * Another helper list to allow a lexer to pass positions of errors to its parser
    	 */
    	protected java.util.List<Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<Integer>());
    	
    	/**
    	 * A stack for incomplete objects. This stack is used filled when the parser is
    	 * used for code completion. Whenever the parser starts to read an object it is
    	 * pushed on the stack. Once the element was parser completely it is popped from
    	 * the stack.
    	 */
    	java.util.List<org.eclipse.emf.ecore.EObject> incompleteObjects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
    	
    	private int stopIncludingHiddenTokens;
    	private int stopExcludingHiddenTokens;
    	private int tokenIndexOfLastCompleteElement;
    	
    	private int expectedElementsIndexOfLastCompleteElement;
    	
    	/**
    	 * The offset indicating the cursor position when the parser is used for code
    	 * completion by calling parseToExpectedElements().
    	 */
    	private int cursorOffset;
    	
    	/**
    	 * The offset of the first hidden token of the last expected element. This offset
    	 * is used to discard expected elements, which are not needed for code completion.
    	 */
    	private int lastStartIncludingHidden;
    	
    	protected void addErrorToResource(final String errorMessage, final int column, final int line, final int startIndex, final int stopIndex) {
    		postParseCommands.add(new robot.resource.robot.IRobotCommand<robot.resource.robot.IRobotTextResource>() {
    			public boolean execute(robot.resource.robot.IRobotTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for code completion
    					return true;
    				}
    				resource.addProblem(new robot.resource.robot.IRobotProblem() {
    					public robot.resource.robot.RobotEProblemSeverity getSeverity() {
    						return robot.resource.robot.RobotEProblemSeverity.ERROR;
    					}
    					public robot.resource.robot.RobotEProblemType getType() {
    						return robot.resource.robot.RobotEProblemType.SYNTAX_ERROR;
    					}
    					public String getMessage() {
    						return errorMessage;
    					}
    					public java.util.Collection<robot.resource.robot.IRobotQuickFix> getQuickFixes() {
    						return null;
    					}
    				}, column, line, startIndex, stopIndex);
    				return true;
    			}
    		});
    	}
    	
    	public void addExpectedElement(org.eclipse.emf.ecore.EClass eClass, int[] ids) {
    		if (!this.rememberExpectedElements) {
    			return;
    		}
    		int terminalID = ids[0];
    		int followSetID = ids[1];
    		robot.resource.robot.IRobotExpectedElement terminal = robot.resource.robot.grammar.RobotFollowSetProvider.TERMINALS[terminalID];
    		robot.resource.robot.mopp.RobotContainedFeature[] containmentFeatures = new robot.resource.robot.mopp.RobotContainedFeature[ids.length - 2];
    		for (int i = 2; i < ids.length; i++) {
    			containmentFeatures[i - 2] = robot.resource.robot.grammar.RobotFollowSetProvider.LINKS[ids[i]];
    		}
    		robot.resource.robot.grammar.RobotContainmentTrace containmentTrace = new robot.resource.robot.grammar.RobotContainmentTrace(eClass, containmentFeatures);
    		org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
    		robot.resource.robot.mopp.RobotExpectedTerminal expectedElement = new robot.resource.robot.mopp.RobotExpectedTerminal(container, terminal, followSetID, containmentTrace);
    		setPosition(expectedElement, input.index());
    		int startIncludingHiddenTokens = expectedElement.getStartIncludingHiddenTokens();
    		if (lastStartIncludingHidden >= 0 && lastStartIncludingHidden < startIncludingHiddenTokens && cursorOffset > startIncludingHiddenTokens) {
    			// clear list of expected elements
    			this.expectedElements.clear();
    			this.expectedElementsIndexOfLastCompleteElement = 0;
    		}
    		lastStartIncludingHidden = startIncludingHiddenTokens;
    		this.expectedElements.add(expectedElement);
    	}
    	
    	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
    	}
    	
    	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new robot.resource.robot.IRobotCommand<robot.resource.robot.IRobotTextResource>() {
    			public boolean execute(robot.resource.robot.IRobotTextResource resource) {
    				robot.resource.robot.IRobotLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharStart(target, locationMap.getCharStart(source));
    				locationMap.setCharEnd(target, locationMap.getCharEnd(source));
    				locationMap.setColumn(target, locationMap.getColumn(source));
    				locationMap.setLine(target, locationMap.getLine(source));
    				return true;
    			}
    		});
    	}
    	
    	protected void copyLocalizationInfos(final org.antlr.runtime3_4_0.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new robot.resource.robot.IRobotCommand<robot.resource.robot.IRobotTextResource>() {
    			public boolean execute(robot.resource.robot.IRobotTextResource resource) {
    				robot.resource.robot.IRobotLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				if (source == null) {
    					return true;
    				}
    				locationMap.setCharStart(target, source.getStartIndex());
    				locationMap.setCharEnd(target, source.getStopIndex());
    				locationMap.setColumn(target, source.getCharPositionInLine());
    				locationMap.setLine(target, source.getLine());
    				return true;
    			}
    		});
    	}
    	
    	/**
    	 * Sets the end character index and the last line for the given object in the
    	 * location map.
    	 */
    	protected void setLocalizationEnd(java.util.Collection<robot.resource.robot.IRobotCommand<robot.resource.robot.IRobotTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new robot.resource.robot.IRobotCommand<robot.resource.robot.IRobotTextResource>() {
    			public boolean execute(robot.resource.robot.IRobotTextResource resource) {
    				robot.resource.robot.IRobotLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharEnd(object, endChar);
    				locationMap.setLine(object, endLine);
    				return true;
    			}
    		});
    	}
    	
    	public robot.resource.robot.IRobotTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
    		try {
    			if (encoding == null) {
    				return new RobotParser(new org.antlr.runtime3_4_0.CommonTokenStream(new RobotLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new RobotParser(new org.antlr.runtime3_4_0.CommonTokenStream(new RobotLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (java.io.IOException e) {
    			new robot.resource.robot.util.RobotRuntimeUtil().logError("Error while creating parser.", e);
    			return null;
    		}
    	}
    	
    	/**
    	 * This default constructor is only used to call createInstance() on it.
    	 */
    	public RobotParser() {
    		super(null);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_4_0.RecognitionException {
    		this.lastPosition = 0;
    		// required because the lexer class can not be subclassed
    		((RobotLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((RobotLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
    		Object typeObject = getTypeObject();
    		if (typeObject == null) {
    			return start();
    		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
    			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
    			if (type.getInstanceClass() == robot.FlotCtrl.ProgramUnit.class) {
    				return parse_robot_FlotCtrl_ProgramUnit();
    			}
    		}
    		throw new robot.resource.robot.mopp.RobotUnexpectedContentTypeException(typeObject);
    	}
    	
    	public int getMismatchedTokenRecoveryTries() {
    		return mismatchedTokenRecoveryTries;
    	}
    	
    	public Object getMissingSymbol(org.antlr.runtime3_4_0.IntStream arg0, org.antlr.runtime3_4_0.RecognitionException arg1, int arg2, org.antlr.runtime3_4_0.BitSet arg3) {
    		mismatchedTokenRecoveryTries++;
    		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
    	}
    	
    	public Object getParseToIndexTypeObject() {
    		return parseToIndexTypeObject;
    	}
    	
    	protected Object getTypeObject() {
    		Object typeObject = getParseToIndexTypeObject();
    		if (typeObject != null) {
    			return typeObject;
    		}
    		java.util.Map<?,?> options = getOptions();
    		if (options != null) {
    			typeObject = options.get(robot.resource.robot.IRobotOptions.RESOURCE_CONTENT_TYPE);
    		}
    		return typeObject;
    	}
    	
    	/**
    	 * Implementation that calls {@link #doParse()} and handles the thrown
    	 * RecognitionExceptions.
    	 */
    	public robot.resource.robot.IRobotParseResult parse() {
    		terminateParsing = false;
    		postParseCommands = new java.util.ArrayList<robot.resource.robot.IRobotCommand<robot.resource.robot.IRobotTextResource>>();
    		robot.resource.robot.mopp.RobotParseResult parseResult = new robot.resource.robot.mopp.RobotParseResult();
    		try {
    			org.eclipse.emf.ecore.EObject result =  doParse();
    			if (lexerExceptions.isEmpty()) {
    				parseResult.setRoot(result);
    			}
    		} catch (org.antlr.runtime3_4_0.RecognitionException re) {
    			reportError(re);
    		} catch (java.lang.IllegalArgumentException iae) {
    			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
    				// can be caused if a null is set on EMF models where not allowed. this will just
    				// happen if other errors occurred before
    			} else {
    				iae.printStackTrace();
    			}
    		}
    		for (org.antlr.runtime3_4_0.RecognitionException re : lexerExceptions) {
    			reportLexicalError(re);
    		}
    		parseResult.getPostParseCommands().addAll(postParseCommands);
    		return parseResult;
    	}
    	
    	public java.util.List<robot.resource.robot.mopp.RobotExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, robot.resource.robot.IRobotTextResource dummyResource, int cursorOffset) {
    		this.rememberExpectedElements = true;
    		this.parseToIndexTypeObject = type;
    		this.cursorOffset = cursorOffset;
    		this.lastStartIncludingHidden = -1;
    		final org.antlr.runtime3_4_0.CommonTokenStream tokenStream = (org.antlr.runtime3_4_0.CommonTokenStream) getTokenStream();
    		robot.resource.robot.IRobotParseResult result = parse();
    		for (org.eclipse.emf.ecore.EObject incompleteObject : incompleteObjects) {
    			org.antlr.runtime3_4_0.Lexer lexer = (org.antlr.runtime3_4_0.Lexer) tokenStream.getTokenSource();
    			int endChar = lexer.getCharIndex();
    			int endLine = lexer.getLine();
    			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
    		}
    		if (result != null) {
    			org.eclipse.emf.ecore.EObject root = result.getRoot();
    			if (root != null) {
    				dummyResource.getContentsInternal().add(root);
    			}
    			for (robot.resource.robot.IRobotCommand<robot.resource.robot.IRobotTextResource> command : result.getPostParseCommands()) {
    				command.execute(dummyResource);
    			}
    		}
    		// remove all expected elements that were added after the last complete element
    		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
    		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
    		java.util.Set<robot.resource.robot.mopp.RobotExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<robot.resource.robot.mopp.RobotExpectedTerminal>();
    		java.util.List<robot.resource.robot.mopp.RobotExpectedTerminal> newFollowSet = new java.util.ArrayList<robot.resource.robot.mopp.RobotExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			robot.resource.robot.mopp.RobotExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 85;
    		int i;
    		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
    			org.antlr.runtime3_4_0.CommonToken nextToken = (org.antlr.runtime3_4_0.CommonToken) tokenStream.get(i);
    			if (nextToken.getType() < 0) {
    				break;
    			}
    			if (nextToken.getChannel() == 99) {
    				// hidden tokens do not reduce the follow set
    			} else {
    				// now that we have found the next visible token the position for that expected
    				// terminals can be set
    				for (robot.resource.robot.mopp.RobotExpectedTerminal nextFollow : newFollowSet) {
    					lastTokenIndex = 0;
    					setPosition(nextFollow, i);
    				}
    				newFollowSet.clear();
    				// normal tokens do reduce the follow set - only elements that match the token are
    				// kept
    				for (robot.resource.robot.mopp.RobotExpectedTerminal nextFollow : currentFollowSet) {
    					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
    						// keep this one - it matches
    						java.util.Collection<robot.resource.robot.util.RobotPair<robot.resource.robot.IRobotExpectedElement, robot.resource.robot.mopp.RobotContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (robot.resource.robot.util.RobotPair<robot.resource.robot.IRobotExpectedElement, robot.resource.robot.mopp.RobotContainedFeature[]> newFollowerPair : newFollowers) {
    							robot.resource.robot.IRobotExpectedElement newFollower = newFollowerPair.getLeft();
    							org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
    							robot.resource.robot.grammar.RobotContainmentTrace containmentTrace = new robot.resource.robot.grammar.RobotContainmentTrace(null, newFollowerPair.getRight());
    							robot.resource.robot.mopp.RobotExpectedTerminal newFollowTerminal = new robot.resource.robot.mopp.RobotExpectedTerminal(container, newFollower, followSetID, containmentTrace);
    							newFollowSet.add(newFollowTerminal);
    							expectedElements.add(newFollowTerminal);
    						}
    					}
    				}
    				currentFollowSet.clear();
    				currentFollowSet.addAll(newFollowSet);
    			}
    			followSetID++;
    		}
    		// after the last token in the stream we must set the position for the elements
    		// that were added during the last iteration of the loop
    		for (robot.resource.robot.mopp.RobotExpectedTerminal nextFollow : newFollowSet) {
    			lastTokenIndex = 0;
    			setPosition(nextFollow, i);
    		}
    		return this.expectedElements;
    	}
    	
    	public void setPosition(robot.resource.robot.mopp.RobotExpectedTerminal expectedElement, int tokenIndex) {
    		int currentIndex = Math.max(0, tokenIndex);
    		for (int index = lastTokenIndex; index < currentIndex; index++) {
    			if (index >= input.size()) {
    				break;
    			}
    			org.antlr.runtime3_4_0.CommonToken tokenAtIndex = (org.antlr.runtime3_4_0.CommonToken) input.get(index);
    			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			if (tokenAtIndex.getChannel() != 99 && !anonymousTokens.contains(tokenAtIndex)) {
    				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			}
    		}
    		lastTokenIndex = Math.max(0, currentIndex);
    		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
    	}
    	
    	public Object recoverFromMismatchedToken(org.antlr.runtime3_4_0.IntStream input, int ttype, org.antlr.runtime3_4_0.BitSet follow) throws org.antlr.runtime3_4_0.RecognitionException {
    		if (!rememberExpectedElements) {
    			return super.recoverFromMismatchedToken(input, ttype, follow);
    		} else {
    			return null;
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the parser into human readable messages.
    	 */
    	public void reportError(final org.antlr.runtime3_4_0.RecognitionException e)  {
    		String message = e.getMessage();
    		if (e instanceof org.antlr.runtime3_4_0.MismatchedTokenException) {
    			org.antlr.runtime3_4_0.MismatchedTokenException mte = (org.antlr.runtime3_4_0.MismatchedTokenException) e;
    			String expectedTokenName = formatTokenName(mte.expecting);
    			String actualTokenName = formatTokenName(e.token.getType());
    			message = "Syntax error on token \"" + e.token.getText() + " (" + actualTokenName + ")\", \"" + expectedTokenName + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedTreeNodeException) {
    			org.antlr.runtime3_4_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_4_0.MismatchedTreeNodeException) e;
    			String expectedTokenName = formatTokenName(mtne.expecting);
    			message = "mismatched tree node: " + "xxx" + "; tokenName " + expectedTokenName;
    		} else if (e instanceof org.antlr.runtime3_4_0.NoViableAltException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
    		} else if (e instanceof org.antlr.runtime3_4_0.EarlyExitException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedSetException) {
    			org.antlr.runtime3_4_0.MismatchedSetException mse = (org.antlr.runtime3_4_0.MismatchedSetException) e;
    			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedNotSetException) {
    			org.antlr.runtime3_4_0.MismatchedNotSetException mse = (org.antlr.runtime3_4_0.MismatchedNotSetException) e;
    			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.FailedPredicateException) {
    			org.antlr.runtime3_4_0.FailedPredicateException fpe = (org.antlr.runtime3_4_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText + "}?";
    		}
    		// the resource may be null if the parser is used for code completion
    		final String finalMessage = message;
    		if (e.token instanceof org.antlr.runtime3_4_0.CommonToken) {
    			final org.antlr.runtime3_4_0.CommonToken ct = (org.antlr.runtime3_4_0.CommonToken) e.token;
    			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
    		} else {
    			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the lexer into human readable messages.
    	 */
    	public void reportLexicalError(final org.antlr.runtime3_4_0.RecognitionException e)  {
    		String message = "";
    		if (e instanceof org.antlr.runtime3_4_0.MismatchedTokenException) {
    			org.antlr.runtime3_4_0.MismatchedTokenException mte = (org.antlr.runtime3_4_0.MismatchedTokenException) e;
    			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_4_0.NoViableAltException) {
    			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_4_0.EarlyExitException) {
    			org.antlr.runtime3_4_0.EarlyExitException eee = (org.antlr.runtime3_4_0.EarlyExitException) e;
    			message = "required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedSetException) {
    			org.antlr.runtime3_4_0.MismatchedSetException mse = (org.antlr.runtime3_4_0.MismatchedSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedNotSetException) {
    			org.antlr.runtime3_4_0.MismatchedNotSetException mse = (org.antlr.runtime3_4_0.MismatchedNotSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedRangeException) {
    			org.antlr.runtime3_4_0.MismatchedRangeException mre = (org.antlr.runtime3_4_0.MismatchedRangeException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
    		} else if (e instanceof org.antlr.runtime3_4_0.FailedPredicateException) {
    			org.antlr.runtime3_4_0.FailedPredicateException fpe = (org.antlr.runtime3_4_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
    		}
    		addErrorToResource(message, e.charPositionInLine, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
    	}
    	
    	private void startIncompleteElement(Object object) {
    		if (object instanceof org.eclipse.emf.ecore.EObject) {
    			this.incompleteObjects.add((org.eclipse.emf.ecore.EObject) object);
    		}
    	}
    	
    	private void completedElement(Object object, boolean isContainment) {
    		if (isContainment && !this.incompleteObjects.isEmpty()) {
    			boolean exists = this.incompleteObjects.remove(object);
    			if (!exists) {
    			}
    		}
    		if (object instanceof org.eclipse.emf.ecore.EObject) {
    			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
    			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
    		}
    	}
    	
    	private org.eclipse.emf.ecore.EObject getLastIncompleteElement() {
    		if (incompleteObjects.isEmpty()) {
    			return null;
    		}
    		return incompleteObjects.get(incompleteObjects.size() - 1);
    	}
    	



    // $ANTLR start "start"
    // Robot.g:499:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_robot_FlotCtrl_ProgramUnit ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;

        int start_StartIndex = input.index();

        robot.FlotCtrl.ProgramUnit c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // Robot.g:500:2: ( (c0= parse_robot_FlotCtrl_ProgramUnit ) EOF )
            // Robot.g:501:2: (c0= parse_robot_FlotCtrl_ProgramUnit ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[0]);
            		addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[1]);
            		addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[2]);
            		addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[3]);
            		addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[4]);
            		addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[5]);
            		addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[6]);
            		addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[7]);
            		addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[8]);
            		addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[9]);
            		addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[10]);
            		addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[11]);
            		expectedElementsIndexOfLastCompleteElement = 0;
            	}

            // Robot.g:517:2: (c0= parse_robot_FlotCtrl_ProgramUnit )
            // Robot.g:518:3: c0= parse_robot_FlotCtrl_ProgramUnit
            {
            pushFollow(FOLLOW_parse_robot_FlotCtrl_ProgramUnit_in_start82);
            c0=parse_robot_FlotCtrl_ProgramUnit();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c0; }

            }


            match(input,EOF,FOLLOW_EOF_in_start89); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		retrieveLayoutInformation(element, null, null, false);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, start_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "start"



    // $ANTLR start "parse_robot_FlotCtrl_ProgramUnit"
    // Robot.g:526:1: parse_robot_FlotCtrl_ProgramUnit returns [robot.FlotCtrl.ProgramUnit element = null] : ( (a0_0= parse_robot_FlotCtrl_Expression ) )* ;
    public final robot.FlotCtrl.ProgramUnit parse_robot_FlotCtrl_ProgramUnit() throws RecognitionException {
        robot.FlotCtrl.ProgramUnit element =  null;

        int parse_robot_FlotCtrl_ProgramUnit_StartIndex = input.index();

        robot.FlotCtrl.Expression a0_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }

            // Robot.g:529:2: ( ( (a0_0= parse_robot_FlotCtrl_Expression ) )* )
            // Robot.g:530:2: ( (a0_0= parse_robot_FlotCtrl_Expression ) )*
            {
            // Robot.g:530:2: ( (a0_0= parse_robot_FlotCtrl_Expression ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16||LA1_0==18||LA1_0==25||LA1_0==27||(LA1_0 >= 33 && LA1_0 <= 35)||(LA1_0 >= 37 && LA1_0 <= 38)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Robot.g:531:3: (a0_0= parse_robot_FlotCtrl_Expression )
            	    {
            	    // Robot.g:531:3: (a0_0= parse_robot_FlotCtrl_Expression )
            	    // Robot.g:532:4: a0_0= parse_robot_FlotCtrl_Expression
            	    {
            	    pushFollow(FOLLOW_parse_robot_FlotCtrl_Expression_in_parse_robot_FlotCtrl_ProgramUnit124);
            	    a0_0=parse_robot_FlotCtrl_Expression();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (terminateParsing) {
            	    					throw new robot.resource.robot.mopp.RobotTerminateParsingException();
            	    				}
            	    				if (element == null) {
            	    					element = robot.FlotCtrl.FlotCtrlFactory.eINSTANCE.createProgramUnit();
            	    					startIncompleteElement(element);
            	    				}
            	    				if (a0_0 != null) {
            	    					if (a0_0 != null) {
            	    						Object value = a0_0;
            	    						addObjectToList(element, robot.FlotCtrl.FlotCtrlPackage.PROGRAM_UNIT__BLOCK, value);
            	    						completedElement(value, true);
            	    					}
            	    					collectHiddenTokens(element);
            	    					retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_0_0_0_0, a0_0, true);
            	    					copyLocalizationInfos(a0_0, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[12]);
            		addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[13]);
            		addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[14]);
            		addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[15]);
            		addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[16]);
            		addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[17]);
            		addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[18]);
            		addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[19]);
            		addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[20]);
            		addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[21]);
            		addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[22]);
            		addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[23]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, parse_robot_FlotCtrl_ProgramUnit_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_robot_FlotCtrl_ProgramUnit"



    // $ANTLR start "parseop_BoolExp_level_1"
    // Robot.g:571:1: parseop_BoolExp_level_1 returns [robot.FlotCtrl.BoolExp element = null] : leftArg= parseop_BoolExp_level_2 ( ( () a0= 'and' rightArg= parseop_BoolExp_level_2 )+ |) ;
    public final robot.FlotCtrl.BoolExp parseop_BoolExp_level_1() throws RecognitionException {
        robot.FlotCtrl.BoolExp element =  null;

        int parseop_BoolExp_level_1_StartIndex = input.index();

        Token a0=null;
        robot.FlotCtrl.BoolExp leftArg =null;

        robot.FlotCtrl.BoolExp rightArg =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }

            // Robot.g:574:2: (leftArg= parseop_BoolExp_level_2 ( ( () a0= 'and' rightArg= parseop_BoolExp_level_2 )+ |) )
            // Robot.g:575:2: leftArg= parseop_BoolExp_level_2 ( ( () a0= 'and' rightArg= parseop_BoolExp_level_2 )+ |)
            {
            pushFollow(FOLLOW_parseop_BoolExp_level_2_in_parseop_BoolExp_level_1165);
            leftArg=parseop_BoolExp_level_2();

            state._fsp--;
            if (state.failed) return element;

            // Robot.g:575:36: ( ( () a0= 'and' rightArg= parseop_BoolExp_level_2 )+ |)
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==20||LA3_0==36) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // Robot.g:575:37: ( () a0= 'and' rightArg= parseop_BoolExp_level_2 )+
                    {
                    // Robot.g:575:37: ( () a0= 'and' rightArg= parseop_BoolExp_level_2 )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==14) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // Robot.g:576:3: () a0= 'and' rightArg= parseop_BoolExp_level_2
                    	    {
                    	    // Robot.g:576:3: ()
                    	    // Robot.g:576:4: 
                    	    {
                    	    }


                    	    if ( state.backtracking==0 ) { element = null; }

                    	    a0=(Token)match(input,14,FOLLOW_14_in_parseop_BoolExp_level_1185); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    			if (element == null) {
                    	    				element = robot.FlotCtrl.FlotCtrlFactory.eINSTANCE.createAndExp();
                    	    				startIncompleteElement(element);
                    	    			}
                    	    			collectHiddenTokens(element);
                    	    			retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_1_0_0_1, null, true);
                    	    			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    	    		}

                    	    if ( state.backtracking==0 ) {
                    	    			// expected elements (follow set)
                    	    			addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getAndExp(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[24]);
                    	    			addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getAndExp(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[25]);
                    	    			addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getAndExp(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[26]);
                    	    		}

                    	    pushFollow(FOLLOW_parseop_BoolExp_level_2_in_parseop_BoolExp_level_1202);
                    	    rightArg=parseop_BoolExp_level_2();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    			if (terminateParsing) {
                    	    				throw new robot.resource.robot.mopp.RobotTerminateParsingException();
                    	    			}
                    	    			if (element == null) {
                    	    				element = robot.FlotCtrl.FlotCtrlFactory.eINSTANCE.createAndExp();
                    	    				startIncompleteElement(element);
                    	    			}
                    	    			if (leftArg != null) {
                    	    				if (leftArg != null) {
                    	    					Object value = leftArg;
                    	    					element.eSet(element.eClass().getEStructuralFeature(robot.FlotCtrl.FlotCtrlPackage.AND_EXP__LEFT_EXP), value);
                    	    					completedElement(value, true);
                    	    				}
                    	    				collectHiddenTokens(element);
                    	    				retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_1_0_0_0, leftArg, true);
                    	    				copyLocalizationInfos(leftArg, element);
                    	    			}
                    	    		}

                    	    if ( state.backtracking==0 ) {
                    	    			if (terminateParsing) {
                    	    				throw new robot.resource.robot.mopp.RobotTerminateParsingException();
                    	    			}
                    	    			if (element == null) {
                    	    				element = robot.FlotCtrl.FlotCtrlFactory.eINSTANCE.createAndExp();
                    	    				startIncompleteElement(element);
                    	    			}
                    	    			if (rightArg != null) {
                    	    				if (rightArg != null) {
                    	    					Object value = rightArg;
                    	    					element.eSet(element.eClass().getEStructuralFeature(robot.FlotCtrl.FlotCtrlPackage.AND_EXP__RIGHT_EXP), value);
                    	    					completedElement(value, true);
                    	    				}
                    	    				collectHiddenTokens(element);
                    	    				retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_1_0_0_2, rightArg, true);
                    	    				copyLocalizationInfos(rightArg, element);
                    	    			}
                    	    		}

                    	    if ( state.backtracking==0 ) { leftArg = element; /* this may become an argument in the next iteration */ }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                    	    if (state.backtracking>0) {state.failed=true; return element;}
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // Robot.g:633:21: 
                    {
                    if ( state.backtracking==0 ) { element = leftArg; }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, parseop_BoolExp_level_1_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parseop_BoolExp_level_1"



    // $ANTLR start "parseop_BoolExp_level_2"
    // Robot.g:638:1: parseop_BoolExp_level_2 returns [robot.FlotCtrl.BoolExp element = null] : (a0= 'not' arg= parseop_BoolExp_level_3 |arg= parseop_BoolExp_level_3 );
    public final robot.FlotCtrl.BoolExp parseop_BoolExp_level_2() throws RecognitionException {
        robot.FlotCtrl.BoolExp element =  null;

        int parseop_BoolExp_level_2_StartIndex = input.index();

        Token a0=null;
        robot.FlotCtrl.BoolExp arg =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }

            // Robot.g:641:0: (a0= 'not' arg= parseop_BoolExp_level_3 |arg= parseop_BoolExp_level_3 )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            else if ( (LA4_0==24||LA4_0==30) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // Robot.g:642:0: a0= 'not' arg= parseop_BoolExp_level_3
                    {
                    a0=(Token)match(input,29,FOLLOW_29_in_parseop_BoolExp_level_2248); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    	if (element == null) {
                    		element = robot.FlotCtrl.FlotCtrlFactory.eINSTANCE.createNegExp();
                    		startIncompleteElement(element);
                    	}
                    	collectHiddenTokens(element);
                    	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_2_0_0_0, null, true);
                    	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    }

                    if ( state.backtracking==0 ) {
                    	// expected elements (follow set)
                    	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getNegExp(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[27]);
                    	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getNegExp(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[28]);
                    	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getNegExp(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[29]);
                    }

                    pushFollow(FOLLOW_parseop_BoolExp_level_3_in_parseop_BoolExp_level_2259);
                    arg=parseop_BoolExp_level_3();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    	if (terminateParsing) {
                    		throw new robot.resource.robot.mopp.RobotTerminateParsingException();
                    	}
                    	if (element == null) {
                    		element = robot.FlotCtrl.FlotCtrlFactory.eINSTANCE.createNegExp();
                    		startIncompleteElement(element);
                    	}
                    	if (arg != null) {
                    		if (arg != null) {
                    			Object value = arg;
                    			element.eSet(element.eClass().getEStructuralFeature(robot.FlotCtrl.FlotCtrlPackage.NEG_EXP__EXP), value);
                    			completedElement(value, true);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_2_0_0_1, arg, true);
                    		copyLocalizationInfos(arg, element);
                    	}
                    }

                    }
                    break;
                case 2 :
                    // Robot.g:679:5: arg= parseop_BoolExp_level_3
                    {
                    pushFollow(FOLLOW_parseop_BoolExp_level_3_in_parseop_BoolExp_level_2269);
                    arg=parseop_BoolExp_level_3();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = arg; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, parseop_BoolExp_level_2_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parseop_BoolExp_level_2"



    // $ANTLR start "parseop_BoolExp_level_3"
    // Robot.g:682:1: parseop_BoolExp_level_3 returns [robot.FlotCtrl.BoolExp element = null] : (c0= parse_robot_robot_HasTurnedCmd |c1= parse_robot_robot_ObstacleCmd );
    public final robot.FlotCtrl.BoolExp parseop_BoolExp_level_3() throws RecognitionException {
        robot.FlotCtrl.BoolExp element =  null;

        int parseop_BoolExp_level_3_StartIndex = input.index();

        robot.robot.HasTurnedCmd c0 =null;

        robot.robot.ObstacleCmd c1 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }

            // Robot.g:685:0: (c0= parse_robot_robot_HasTurnedCmd |c1= parse_robot_robot_ObstacleCmd )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            else if ( (LA5_0==30) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // Robot.g:686:0: c0= parse_robot_robot_HasTurnedCmd
                    {
                    pushFollow(FOLLOW_parse_robot_robot_HasTurnedCmd_in_parseop_BoolExp_level_3291);
                    c0=parse_robot_robot_HasTurnedCmd();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Robot.g:687:2: c1= parse_robot_robot_ObstacleCmd
                    {
                    pushFollow(FOLLOW_parse_robot_robot_ObstacleCmd_in_parseop_BoolExp_level_3299);
                    c1=parse_robot_robot_ObstacleCmd();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, parseop_BoolExp_level_3_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parseop_BoolExp_level_3"



    // $ANTLR start "parse_robot_robot_HasTurnedCmd"
    // Robot.g:690:1: parse_robot_robot_HasTurnedCmd returns [robot.robot.HasTurnedCmd element = null] : a0= 'hasTurned' a1= '(' a2= 'angle' a3= '=' (a4= INT_LITERAL ) a5= ')' ;
    public final robot.robot.HasTurnedCmd parse_robot_robot_HasTurnedCmd() throws RecognitionException {
        robot.robot.HasTurnedCmd element =  null;

        int parse_robot_robot_HasTurnedCmd_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }

            // Robot.g:693:4: (a0= 'hasTurned' a1= '(' a2= 'angle' a3= '=' (a4= INT_LITERAL ) a5= ')' )
            // Robot.g:694:4: a0= 'hasTurned' a1= '(' a2= 'angle' a3= '=' (a4= INT_LITERAL ) a5= ')'
            {
            a0=(Token)match(input,24,FOLLOW_24_in_parse_robot_robot_HasTurnedCmd321); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createHasTurnedCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_3_0_0_0, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[30]);
            }

            a1=(Token)match(input,10,FOLLOW_10_in_parse_robot_robot_HasTurnedCmd332); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createHasTurnedCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_3_0_0_1, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[31]);
            }

            a2=(Token)match(input,15,FOLLOW_15_in_parse_robot_robot_HasTurnedCmd343); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createHasTurnedCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_3_0_0_2, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[32]);
            }

            a3=(Token)match(input,13,FOLLOW_13_in_parse_robot_robot_HasTurnedCmd354); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createHasTurnedCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_3_0_0_3, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[33]);
            }

            // Robot.g:750:2: (a4= INT_LITERAL )
            // Robot.g:751:2: a4= INT_LITERAL
            {
            a4=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_parse_robot_robot_HasTurnedCmd368); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (terminateParsing) {
            			throw new robot.resource.robot.mopp.RobotTerminateParsingException();
            		}
            		if (element == null) {
            			element = robot.robot.RobotFactory.eINSTANCE.createHasTurnedCmd();
            			startIncompleteElement(element);
            		}
            		if (a4 != null) {
            			robot.resource.robot.IRobotTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INT_LITERAL");
            			tokenResolver.setOptions(getOptions());
            			robot.resource.robot.IRobotTokenResolveResult result = getFreshTokenResolveResult();
            			tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(robot.robot.RobotPackage.HAS_TURNED_CMD__ANGLE), result);
            			Object resolvedObject = result.getResolvedToken();
            			if (resolvedObject == null) {
            				addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
            			}
            			java.lang.Double resolved = (java.lang.Double) resolvedObject;
            			if (resolved != null) {
            				Object value = resolved;
            				element.eSet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.HAS_TURNED_CMD__ANGLE), value);
            				completedElement(value, false);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_3_0_0_4, resolved, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
            		}
            	}

            }


            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[34]);
            }

            a5=(Token)match(input,11,FOLLOW_11_in_parse_robot_robot_HasTurnedCmd383); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createHasTurnedCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_3_0_0_5, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[35]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[36]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[37]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[38]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[39]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[40]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[41]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[42]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[43]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[44]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[45]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[46]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[47]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[48]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[49]);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, parse_robot_robot_HasTurnedCmd_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_robot_robot_HasTurnedCmd"



    // $ANTLR start "parse_robot_robot_ObstacleCmd"
    // Robot.g:816:1: parse_robot_robot_ObstacleCmd returns [robot.robot.ObstacleCmd element = null] : a0= 'obstacle' a1= '(' a2= 'distance' a3= '=' (a4= INT_LITERAL ) a5= ')' ;
    public final robot.robot.ObstacleCmd parse_robot_robot_ObstacleCmd() throws RecognitionException {
        robot.robot.ObstacleCmd element =  null;

        int parse_robot_robot_ObstacleCmd_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }

            // Robot.g:819:4: (a0= 'obstacle' a1= '(' a2= 'distance' a3= '=' (a4= INT_LITERAL ) a5= ')' )
            // Robot.g:820:4: a0= 'obstacle' a1= '(' a2= 'distance' a3= '=' (a4= INT_LITERAL ) a5= ')'
            {
            a0=(Token)match(input,30,FOLLOW_30_in_parse_robot_robot_ObstacleCmd409); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createObstacleCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_4_0_0_0, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[50]);
            }

            a1=(Token)match(input,10,FOLLOW_10_in_parse_robot_robot_ObstacleCmd420); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createObstacleCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_4_0_0_1, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[51]);
            }

            a2=(Token)match(input,19,FOLLOW_19_in_parse_robot_robot_ObstacleCmd431); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createObstacleCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_4_0_0_2, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[52]);
            }

            a3=(Token)match(input,13,FOLLOW_13_in_parse_robot_robot_ObstacleCmd442); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createObstacleCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_4_0_0_3, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[53]);
            }

            // Robot.g:876:2: (a4= INT_LITERAL )
            // Robot.g:877:2: a4= INT_LITERAL
            {
            a4=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_parse_robot_robot_ObstacleCmd456); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (terminateParsing) {
            			throw new robot.resource.robot.mopp.RobotTerminateParsingException();
            		}
            		if (element == null) {
            			element = robot.robot.RobotFactory.eINSTANCE.createObstacleCmd();
            			startIncompleteElement(element);
            		}
            		if (a4 != null) {
            			robot.resource.robot.IRobotTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INT_LITERAL");
            			tokenResolver.setOptions(getOptions());
            			robot.resource.robot.IRobotTokenResolveResult result = getFreshTokenResolveResult();
            			tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(robot.robot.RobotPackage.OBSTACLE_CMD__DISTANCE), result);
            			Object resolvedObject = result.getResolvedToken();
            			if (resolvedObject == null) {
            				addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
            			}
            			java.lang.Double resolved = (java.lang.Double) resolvedObject;
            			if (resolved != null) {
            				Object value = resolved;
            				element.eSet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.OBSTACLE_CMD__DISTANCE), value);
            				completedElement(value, false);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_4_0_0_4, resolved, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
            		}
            	}

            }


            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[54]);
            }

            a5=(Token)match(input,11,FOLLOW_11_in_parse_robot_robot_ObstacleCmd471); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createObstacleCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_4_0_0_5, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[55]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[56]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[57]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[58]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[59]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[60]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[61]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[62]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[63]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[64]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[65]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[66]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[67]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[68]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[69]);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, parse_robot_robot_ObstacleCmd_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_robot_robot_ObstacleCmd"



    // $ANTLR start "parseop_Expression_level_3"
    // Robot.g:942:1: parseop_Expression_level_3 returns [robot.FlotCtrl.Expression element = null] : (c0= parse_robot_FlotCtrl_WhileLoop |c1= parse_robot_FlotCtrl_IfBlock |c2= parse_robot_robot_Bip |c3= parse_robot_robot_MoveCmd |c4= parse_robot_robot_PrintCmd |c5= parse_robot_robot_SetTurnAngleCmd |c6= parse_robot_robot_StopEngineCmd |c7= parse_robot_robot_StopProgramCmd |c8= parse_robot_robot_TurnCmd );
    public final robot.FlotCtrl.Expression parseop_Expression_level_3() throws RecognitionException {
        robot.FlotCtrl.Expression element =  null;

        int parseop_Expression_level_3_StartIndex = input.index();

        robot.FlotCtrl.WhileLoop c0 =null;

        robot.FlotCtrl.IfBlock c1 =null;

        robot.robot.Bip c2 =null;

        robot.robot.MoveCmd c3 =null;

        robot.robot.PrintCmd c4 =null;

        robot.robot.SetTurnAngleCmd c5 =null;

        robot.robot.StopEngineCmd c6 =null;

        robot.robot.StopProgramCmd c7 =null;

        robot.robot.TurnCmd c8 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }

            // Robot.g:945:0: (c0= parse_robot_FlotCtrl_WhileLoop |c1= parse_robot_FlotCtrl_IfBlock |c2= parse_robot_robot_Bip |c3= parse_robot_robot_MoveCmd |c4= parse_robot_robot_PrintCmd |c5= parse_robot_robot_SetTurnAngleCmd |c6= parse_robot_robot_StopEngineCmd |c7= parse_robot_robot_StopProgramCmd |c8= parse_robot_robot_TurnCmd )
            int alt6=9;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt6=1;
                }
                break;
            case 25:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            case 27:
                {
                alt6=4;
                }
                break;
            case 18:
                {
                alt6=5;
                }
                break;
            case 33:
                {
                alt6=6;
                }
                break;
            case 34:
                {
                alt6=7;
                }
                break;
            case 35:
                {
                alt6=8;
                }
                break;
            case 37:
                {
                alt6=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // Robot.g:946:0: c0= parse_robot_FlotCtrl_WhileLoop
                    {
                    pushFollow(FOLLOW_parse_robot_FlotCtrl_WhileLoop_in_parseop_Expression_level_3497);
                    c0=parse_robot_FlotCtrl_WhileLoop();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Robot.g:947:2: c1= parse_robot_FlotCtrl_IfBlock
                    {
                    pushFollow(FOLLOW_parse_robot_FlotCtrl_IfBlock_in_parseop_Expression_level_3505);
                    c1=parse_robot_FlotCtrl_IfBlock();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Robot.g:948:2: c2= parse_robot_robot_Bip
                    {
                    pushFollow(FOLLOW_parse_robot_robot_Bip_in_parseop_Expression_level_3513);
                    c2=parse_robot_robot_Bip();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 4 :
                    // Robot.g:949:2: c3= parse_robot_robot_MoveCmd
                    {
                    pushFollow(FOLLOW_parse_robot_robot_MoveCmd_in_parseop_Expression_level_3521);
                    c3=parse_robot_robot_MoveCmd();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c3; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 5 :
                    // Robot.g:950:2: c4= parse_robot_robot_PrintCmd
                    {
                    pushFollow(FOLLOW_parse_robot_robot_PrintCmd_in_parseop_Expression_level_3529);
                    c4=parse_robot_robot_PrintCmd();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c4; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 6 :
                    // Robot.g:951:2: c5= parse_robot_robot_SetTurnAngleCmd
                    {
                    pushFollow(FOLLOW_parse_robot_robot_SetTurnAngleCmd_in_parseop_Expression_level_3537);
                    c5=parse_robot_robot_SetTurnAngleCmd();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c5; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 7 :
                    // Robot.g:952:2: c6= parse_robot_robot_StopEngineCmd
                    {
                    pushFollow(FOLLOW_parse_robot_robot_StopEngineCmd_in_parseop_Expression_level_3545);
                    c6=parse_robot_robot_StopEngineCmd();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c6; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 8 :
                    // Robot.g:953:2: c7= parse_robot_robot_StopProgramCmd
                    {
                    pushFollow(FOLLOW_parse_robot_robot_StopProgramCmd_in_parseop_Expression_level_3553);
                    c7=parse_robot_robot_StopProgramCmd();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c7; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 9 :
                    // Robot.g:954:2: c8= parse_robot_robot_TurnCmd
                    {
                    pushFollow(FOLLOW_parse_robot_robot_TurnCmd_in_parseop_Expression_level_3561);
                    c8=parse_robot_robot_TurnCmd();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c8; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, parseop_Expression_level_3_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parseop_Expression_level_3"



    // $ANTLR start "parse_robot_FlotCtrl_WhileLoop"
    // Robot.g:957:1: parse_robot_FlotCtrl_WhileLoop returns [robot.FlotCtrl.WhileLoop element = null] : a0= 'while' (a1_0= parse_robot_FlotCtrl_BoolExp ) a2= 'do' ( (a3_0= parse_robot_FlotCtrl_Expression ) )* a4= 'end' ;
    public final robot.FlotCtrl.WhileLoop parse_robot_FlotCtrl_WhileLoop() throws RecognitionException {
        robot.FlotCtrl.WhileLoop element =  null;

        int parse_robot_FlotCtrl_WhileLoop_StartIndex = input.index();

        Token a0=null;
        Token a2=null;
        Token a4=null;
        robot.FlotCtrl.BoolExp a1_0 =null;

        robot.FlotCtrl.Expression a3_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }

            // Robot.g:960:4: (a0= 'while' (a1_0= parse_robot_FlotCtrl_BoolExp ) a2= 'do' ( (a3_0= parse_robot_FlotCtrl_Expression ) )* a4= 'end' )
            // Robot.g:961:4: a0= 'while' (a1_0= parse_robot_FlotCtrl_BoolExp ) a2= 'do' ( (a3_0= parse_robot_FlotCtrl_Expression ) )* a4= 'end'
            {
            a0=(Token)match(input,38,FOLLOW_38_in_parse_robot_FlotCtrl_WhileLoop583); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.FlotCtrl.FlotCtrlFactory.eINSTANCE.createWhileLoop();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_5_0_0_0, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[70]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[71]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[72]);
            }

            // Robot.g:977:2: (a1_0= parse_robot_FlotCtrl_BoolExp )
            // Robot.g:978:2: a1_0= parse_robot_FlotCtrl_BoolExp
            {
            pushFollow(FOLLOW_parse_robot_FlotCtrl_BoolExp_in_parse_robot_FlotCtrl_WhileLoop597);
            a1_0=parse_robot_FlotCtrl_BoolExp();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (terminateParsing) {
            			throw new robot.resource.robot.mopp.RobotTerminateParsingException();
            		}
            		if (element == null) {
            			element = robot.FlotCtrl.FlotCtrlFactory.eINSTANCE.createWhileLoop();
            			startIncompleteElement(element);
            		}
            		if (a1_0 != null) {
            			if (a1_0 != null) {
            				Object value = a1_0;
            				element.eSet(element.eClass().getEStructuralFeature(robot.FlotCtrl.FlotCtrlPackage.WHILE_LOOP__LOOP_COND), value);
            				completedElement(value, true);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_5_0_0_1, a1_0, true);
            			copyLocalizationInfos(a1_0, element);
            		}
            	}

            }


            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[73]);
            }

            a2=(Token)match(input,20,FOLLOW_20_in_parse_robot_FlotCtrl_WhileLoop610); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.FlotCtrl.FlotCtrlFactory.eINSTANCE.createWhileLoop();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_5_0_0_2, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[74]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[75]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[76]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[77]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[78]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[79]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[80]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[81]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[82]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[83]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[84]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[85]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[86]);
            }

            // Robot.g:1029:2: ( (a3_0= parse_robot_FlotCtrl_Expression ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16||LA7_0==18||LA7_0==25||LA7_0==27||(LA7_0 >= 33 && LA7_0 <= 35)||(LA7_0 >= 37 && LA7_0 <= 38)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Robot.g:1030:2: (a3_0= parse_robot_FlotCtrl_Expression )
            	    {
            	    // Robot.g:1030:2: (a3_0= parse_robot_FlotCtrl_Expression )
            	    // Robot.g:1031:3: a3_0= parse_robot_FlotCtrl_Expression
            	    {
            	    pushFollow(FOLLOW_parse_robot_FlotCtrl_Expression_in_parse_robot_FlotCtrl_WhileLoop628);
            	    a3_0=parse_robot_FlotCtrl_Expression();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    			if (terminateParsing) {
            	    				throw new robot.resource.robot.mopp.RobotTerminateParsingException();
            	    			}
            	    			if (element == null) {
            	    				element = robot.FlotCtrl.FlotCtrlFactory.eINSTANCE.createWhileLoop();
            	    				startIncompleteElement(element);
            	    			}
            	    			if (a3_0 != null) {
            	    				if (a3_0 != null) {
            	    					Object value = a3_0;
            	    					addObjectToList(element, robot.FlotCtrl.FlotCtrlPackage.WHILE_LOOP__BLOCK, value);
            	    					completedElement(value, true);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_5_0_0_3, a3_0, true);
            	    				copyLocalizationInfos(a3_0, element);
            	    			}
            	    		}

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[87]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[88]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[89]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[90]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[91]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[92]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[93]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[94]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[95]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[96]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[97]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[98]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[99]);
            }

            a4=(Token)match(input,23,FOLLOW_23_in_parse_robot_FlotCtrl_WhileLoop647); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.FlotCtrl.FlotCtrlFactory.eINSTANCE.createWhileLoop();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_5_0_0_4, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[100]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[101]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[102]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[103]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[104]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[105]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[106]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[107]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[108]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[109]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[110]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[111]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[112]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[113]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[114]);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, parse_robot_FlotCtrl_WhileLoop_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_robot_FlotCtrl_WhileLoop"



    // $ANTLR start "parse_robot_FlotCtrl_IfBlock"
    // Robot.g:1099:1: parse_robot_FlotCtrl_IfBlock returns [robot.FlotCtrl.IfBlock element = null] : a0= 'if' (a1_0= parse_robot_FlotCtrl_BoolExp ) a2= 'then' ( (a3_0= parse_robot_FlotCtrl_Expression ) )+ ( (a4= 'else' ( (a5_0= parse_robot_FlotCtrl_Expression ) )* ) )? a6= 'end' ;
    public final robot.FlotCtrl.IfBlock parse_robot_FlotCtrl_IfBlock() throws RecognitionException {
        robot.FlotCtrl.IfBlock element =  null;

        int parse_robot_FlotCtrl_IfBlock_StartIndex = input.index();

        Token a0=null;
        Token a2=null;
        Token a4=null;
        Token a6=null;
        robot.FlotCtrl.BoolExp a1_0 =null;

        robot.FlotCtrl.Expression a3_0 =null;

        robot.FlotCtrl.Expression a5_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }

            // Robot.g:1102:4: (a0= 'if' (a1_0= parse_robot_FlotCtrl_BoolExp ) a2= 'then' ( (a3_0= parse_robot_FlotCtrl_Expression ) )+ ( (a4= 'else' ( (a5_0= parse_robot_FlotCtrl_Expression ) )* ) )? a6= 'end' )
            // Robot.g:1103:4: a0= 'if' (a1_0= parse_robot_FlotCtrl_BoolExp ) a2= 'then' ( (a3_0= parse_robot_FlotCtrl_Expression ) )+ ( (a4= 'else' ( (a5_0= parse_robot_FlotCtrl_Expression ) )* ) )? a6= 'end'
            {
            a0=(Token)match(input,25,FOLLOW_25_in_parse_robot_FlotCtrl_IfBlock673); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.FlotCtrl.FlotCtrlFactory.eINSTANCE.createIfBlock();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_6_0_0_0, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[115]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[116]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[117]);
            }

            // Robot.g:1119:2: (a1_0= parse_robot_FlotCtrl_BoolExp )
            // Robot.g:1120:2: a1_0= parse_robot_FlotCtrl_BoolExp
            {
            pushFollow(FOLLOW_parse_robot_FlotCtrl_BoolExp_in_parse_robot_FlotCtrl_IfBlock687);
            a1_0=parse_robot_FlotCtrl_BoolExp();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (terminateParsing) {
            			throw new robot.resource.robot.mopp.RobotTerminateParsingException();
            		}
            		if (element == null) {
            			element = robot.FlotCtrl.FlotCtrlFactory.eINSTANCE.createIfBlock();
            			startIncompleteElement(element);
            		}
            		if (a1_0 != null) {
            			if (a1_0 != null) {
            				Object value = a1_0;
            				element.eSet(element.eClass().getEStructuralFeature(robot.FlotCtrl.FlotCtrlPackage.IF_BLOCK__CONDITION), value);
            				completedElement(value, true);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_6_0_0_1, a1_0, true);
            			copyLocalizationInfos(a1_0, element);
            		}
            	}

            }


            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[118]);
            }

            a2=(Token)match(input,36,FOLLOW_36_in_parse_robot_FlotCtrl_IfBlock700); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.FlotCtrl.FlotCtrlFactory.eINSTANCE.createIfBlock();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_6_0_0_2, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[119]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[120]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[121]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[122]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[123]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[124]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[125]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[126]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[127]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[128]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[129]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[130]);
            }

            // Robot.g:1170:2: ( (a3_0= parse_robot_FlotCtrl_Expression ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16||LA8_0==18||LA8_0==25||LA8_0==27||(LA8_0 >= 33 && LA8_0 <= 35)||(LA8_0 >= 37 && LA8_0 <= 38)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Robot.g:1171:2: (a3_0= parse_robot_FlotCtrl_Expression )
            	    {
            	    // Robot.g:1171:2: (a3_0= parse_robot_FlotCtrl_Expression )
            	    // Robot.g:1172:3: a3_0= parse_robot_FlotCtrl_Expression
            	    {
            	    pushFollow(FOLLOW_parse_robot_FlotCtrl_Expression_in_parse_robot_FlotCtrl_IfBlock718);
            	    a3_0=parse_robot_FlotCtrl_Expression();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    			if (terminateParsing) {
            	    				throw new robot.resource.robot.mopp.RobotTerminateParsingException();
            	    			}
            	    			if (element == null) {
            	    				element = robot.FlotCtrl.FlotCtrlFactory.eINSTANCE.createIfBlock();
            	    				startIncompleteElement(element);
            	    			}
            	    			if (a3_0 != null) {
            	    				if (a3_0 != null) {
            	    					Object value = a3_0;
            	    					addObjectToList(element, robot.FlotCtrl.FlotCtrlPackage.IF_BLOCK__THEN_BLOCK, value);
            	    					completedElement(value, true);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_6_0_0_3, a3_0, true);
            	    				copyLocalizationInfos(a3_0, element);
            	    			}
            	    		}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[131]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[132]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[133]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[134]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[135]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[136]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[137]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[138]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[139]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[140]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[141]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[142]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[143]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[144]);
            }

            // Robot.g:1211:2: ( (a4= 'else' ( (a5_0= parse_robot_FlotCtrl_Expression ) )* ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // Robot.g:1212:2: (a4= 'else' ( (a5_0= parse_robot_FlotCtrl_Expression ) )* )
                    {
                    // Robot.g:1212:2: (a4= 'else' ( (a5_0= parse_robot_FlotCtrl_Expression ) )* )
                    // Robot.g:1213:3: a4= 'else' ( (a5_0= parse_robot_FlotCtrl_Expression ) )*
                    {
                    a4=(Token)match(input,22,FOLLOW_22_in_parse_robot_FlotCtrl_IfBlock744); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    			if (element == null) {
                    				element = robot.FlotCtrl.FlotCtrlFactory.eINSTANCE.createIfBlock();
                    				startIncompleteElement(element);
                    			}
                    			collectHiddenTokens(element);
                    			retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_6_0_0_4_0_0_0, null, true);
                    			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
                    		}

                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[145]);
                    			addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[146]);
                    			addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[147]);
                    			addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[148]);
                    			addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[149]);
                    			addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[150]);
                    			addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[151]);
                    			addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[152]);
                    			addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[153]);
                    			addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[154]);
                    			addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[155]);
                    			addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[156]);
                    			addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[157]);
                    		}

                    // Robot.g:1239:3: ( (a5_0= parse_robot_FlotCtrl_Expression ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==16||LA9_0==18||LA9_0==25||LA9_0==27||(LA9_0 >= 33 && LA9_0 <= 35)||(LA9_0 >= 37 && LA9_0 <= 38)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // Robot.g:1240:4: (a5_0= parse_robot_FlotCtrl_Expression )
                    	    {
                    	    // Robot.g:1240:4: (a5_0= parse_robot_FlotCtrl_Expression )
                    	    // Robot.g:1241:5: a5_0= parse_robot_FlotCtrl_Expression
                    	    {
                    	    pushFollow(FOLLOW_parse_robot_FlotCtrl_Expression_in_parse_robot_FlotCtrl_IfBlock772);
                    	    a5_0=parse_robot_FlotCtrl_Expression();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    					if (terminateParsing) {
                    	    						throw new robot.resource.robot.mopp.RobotTerminateParsingException();
                    	    					}
                    	    					if (element == null) {
                    	    						element = robot.FlotCtrl.FlotCtrlFactory.eINSTANCE.createIfBlock();
                    	    						startIncompleteElement(element);
                    	    					}
                    	    					if (a5_0 != null) {
                    	    						if (a5_0 != null) {
                    	    							Object value = a5_0;
                    	    							addObjectToList(element, robot.FlotCtrl.FlotCtrlPackage.IF_BLOCK__ELSE_BLOCK, value);
                    	    							completedElement(value, true);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_6_0_0_4_0_0_1, a5_0, true);
                    	    						copyLocalizationInfos(a5_0, element);
                    	    					}
                    	    				}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    			// expected elements (follow set)
                    			addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[158]);
                    			addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[159]);
                    			addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[160]);
                    			addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[161]);
                    			addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[162]);
                    			addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[163]);
                    			addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[164]);
                    			addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[165]);
                    			addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[166]);
                    			addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[167]);
                    			addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[168]);
                    			addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[169]);
                    			addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[170]);
                    		}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[171]);
            }

            a6=(Token)match(input,23,FOLLOW_23_in_parse_robot_FlotCtrl_IfBlock813); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.FlotCtrl.FlotCtrlFactory.eINSTANCE.createIfBlock();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_6_0_0_5, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[172]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[173]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[174]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[175]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[176]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[177]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[178]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[179]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[180]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[181]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[182]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[183]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[184]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[185]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[186]);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, parse_robot_FlotCtrl_IfBlock_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_robot_FlotCtrl_IfBlock"



    // $ANTLR start "parse_robot_robot_Bip"
    // Robot.g:1316:1: parse_robot_robot_Bip returns [robot.robot.Bip element = null] : a0= 'bip' a1= '(' a2= 'duration' a3= '=' (a4= INT_LITERAL ) a5= ',' a6= 'power' a7= '=' (a8= INT_LITERAL ) a9= ',' a10= 'repeat' a11= '=' (a12= BOOLEAN_LITERAL ) a13= ')' ;
    public final robot.robot.Bip parse_robot_robot_Bip() throws RecognitionException {
        robot.robot.Bip element =  null;

        int parse_robot_robot_Bip_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;
        Token a13=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }

            // Robot.g:1319:4: (a0= 'bip' a1= '(' a2= 'duration' a3= '=' (a4= INT_LITERAL ) a5= ',' a6= 'power' a7= '=' (a8= INT_LITERAL ) a9= ',' a10= 'repeat' a11= '=' (a12= BOOLEAN_LITERAL ) a13= ')' )
            // Robot.g:1320:4: a0= 'bip' a1= '(' a2= 'duration' a3= '=' (a4= INT_LITERAL ) a5= ',' a6= 'power' a7= '=' (a8= INT_LITERAL ) a9= ',' a10= 'repeat' a11= '=' (a12= BOOLEAN_LITERAL ) a13= ')'
            {
            a0=(Token)match(input,16,FOLLOW_16_in_parse_robot_robot_Bip839); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createBip();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_7_0_0_0, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[187]);
            }

            a1=(Token)match(input,10,FOLLOW_10_in_parse_robot_robot_Bip850); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createBip();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_7_0_0_1, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[188]);
            }

            a2=(Token)match(input,21,FOLLOW_21_in_parse_robot_robot_Bip861); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createBip();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_7_0_0_2, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[189]);
            }

            a3=(Token)match(input,13,FOLLOW_13_in_parse_robot_robot_Bip872); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createBip();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_7_0_0_3, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[190]);
            }

            // Robot.g:1376:2: (a4= INT_LITERAL )
            // Robot.g:1377:2: a4= INT_LITERAL
            {
            a4=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_parse_robot_robot_Bip886); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (terminateParsing) {
            			throw new robot.resource.robot.mopp.RobotTerminateParsingException();
            		}
            		if (element == null) {
            			element = robot.robot.RobotFactory.eINSTANCE.createBip();
            			startIncompleteElement(element);
            		}
            		if (a4 != null) {
            			robot.resource.robot.IRobotTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INT_LITERAL");
            			tokenResolver.setOptions(getOptions());
            			robot.resource.robot.IRobotTokenResolveResult result = getFreshTokenResolveResult();
            			tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(robot.robot.RobotPackage.BIP__DURATION), result);
            			Object resolvedObject = result.getResolvedToken();
            			if (resolvedObject == null) {
            				addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
            			}
            			java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
            			if (resolved != null) {
            				Object value = resolved;
            				element.eSet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.BIP__DURATION), value);
            				completedElement(value, false);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_7_0_0_4, resolved, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
            		}
            	}

            }


            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[191]);
            }

            a5=(Token)match(input,12,FOLLOW_12_in_parse_robot_robot_Bip901); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createBip();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_7_0_0_5, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[192]);
            }

            a6=(Token)match(input,31,FOLLOW_31_in_parse_robot_robot_Bip912); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createBip();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_7_0_0_6, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[193]);
            }

            a7=(Token)match(input,13,FOLLOW_13_in_parse_robot_robot_Bip923); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createBip();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_7_0_0_7, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[194]);
            }

            // Robot.g:1454:2: (a8= INT_LITERAL )
            // Robot.g:1455:2: a8= INT_LITERAL
            {
            a8=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_parse_robot_robot_Bip937); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (terminateParsing) {
            			throw new robot.resource.robot.mopp.RobotTerminateParsingException();
            		}
            		if (element == null) {
            			element = robot.robot.RobotFactory.eINSTANCE.createBip();
            			startIncompleteElement(element);
            		}
            		if (a8 != null) {
            			robot.resource.robot.IRobotTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INT_LITERAL");
            			tokenResolver.setOptions(getOptions());
            			robot.resource.robot.IRobotTokenResolveResult result = getFreshTokenResolveResult();
            			tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(robot.robot.RobotPackage.BIP__POWER), result);
            			Object resolvedObject = result.getResolvedToken();
            			if (resolvedObject == null) {
            				addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStopIndex());
            			}
            			java.lang.Double resolved = (java.lang.Double) resolvedObject;
            			if (resolved != null) {
            				Object value = resolved;
            				element.eSet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.BIP__POWER), value);
            				completedElement(value, false);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_7_0_0_8, resolved, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a8, element);
            		}
            	}

            }


            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[195]);
            }

            a9=(Token)match(input,12,FOLLOW_12_in_parse_robot_robot_Bip952); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createBip();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_7_0_0_9, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[196]);
            }

            a10=(Token)match(input,32,FOLLOW_32_in_parse_robot_robot_Bip963); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createBip();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_7_0_0_10, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[197]);
            }

            a11=(Token)match(input,13,FOLLOW_13_in_parse_robot_robot_Bip974); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createBip();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_7_0_0_11, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[198]);
            }

            // Robot.g:1532:2: (a12= BOOLEAN_LITERAL )
            // Robot.g:1533:2: a12= BOOLEAN_LITERAL
            {
            a12=(Token)match(input,BOOLEAN_LITERAL,FOLLOW_BOOLEAN_LITERAL_in_parse_robot_robot_Bip988); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (terminateParsing) {
            			throw new robot.resource.robot.mopp.RobotTerminateParsingException();
            		}
            		if (element == null) {
            			element = robot.robot.RobotFactory.eINSTANCE.createBip();
            			startIncompleteElement(element);
            		}
            		if (a12 != null) {
            			robot.resource.robot.IRobotTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("BOOLEAN_LITERAL");
            			tokenResolver.setOptions(getOptions());
            			robot.resource.robot.IRobotTokenResolveResult result = getFreshTokenResolveResult();
            			tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(robot.robot.RobotPackage.BIP__REPET), result);
            			Object resolvedObject = result.getResolvedToken();
            			if (resolvedObject == null) {
            				addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a12).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a12).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a12).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a12).getStopIndex());
            			}
            			java.lang.Boolean resolved = (java.lang.Boolean) resolvedObject;
            			if (resolved != null) {
            				Object value = resolved;
            				element.eSet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.BIP__REPET), value);
            				completedElement(value, false);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_7_0_0_12, resolved, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a12, element);
            		}
            	}

            }


            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[199]);
            }

            a13=(Token)match(input,11,FOLLOW_11_in_parse_robot_robot_Bip1003); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createBip();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_7_0_0_13, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[200]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[201]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[202]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[203]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[204]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[205]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[206]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[207]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[208]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[209]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[210]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[211]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[212]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[213]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[214]);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, parse_robot_robot_Bip_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_robot_robot_Bip"



    // $ANTLR start "parse_robot_robot_MoveCmd"
    // Robot.g:1598:1: parse_robot_robot_MoveCmd returns [robot.robot.MoveCmd element = null] : a0= 'move' a1= '(' a2= 'power' a3= '=' (a4= INT_LITERAL ) a5= ')' ;
    public final robot.robot.MoveCmd parse_robot_robot_MoveCmd() throws RecognitionException {
        robot.robot.MoveCmd element =  null;

        int parse_robot_robot_MoveCmd_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }

            // Robot.g:1601:4: (a0= 'move' a1= '(' a2= 'power' a3= '=' (a4= INT_LITERAL ) a5= ')' )
            // Robot.g:1602:4: a0= 'move' a1= '(' a2= 'power' a3= '=' (a4= INT_LITERAL ) a5= ')'
            {
            a0=(Token)match(input,27,FOLLOW_27_in_parse_robot_robot_MoveCmd1029); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createMoveCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_8_0_0_0, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[215]);
            }

            a1=(Token)match(input,10,FOLLOW_10_in_parse_robot_robot_MoveCmd1040); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createMoveCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_8_0_0_1, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[216]);
            }

            a2=(Token)match(input,31,FOLLOW_31_in_parse_robot_robot_MoveCmd1051); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createMoveCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_8_0_0_2, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[217]);
            }

            a3=(Token)match(input,13,FOLLOW_13_in_parse_robot_robot_MoveCmd1062); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createMoveCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_8_0_0_3, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[218]);
            }

            // Robot.g:1658:2: (a4= INT_LITERAL )
            // Robot.g:1659:2: a4= INT_LITERAL
            {
            a4=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_parse_robot_robot_MoveCmd1076); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (terminateParsing) {
            			throw new robot.resource.robot.mopp.RobotTerminateParsingException();
            		}
            		if (element == null) {
            			element = robot.robot.RobotFactory.eINSTANCE.createMoveCmd();
            			startIncompleteElement(element);
            		}
            		if (a4 != null) {
            			robot.resource.robot.IRobotTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INT_LITERAL");
            			tokenResolver.setOptions(getOptions());
            			robot.resource.robot.IRobotTokenResolveResult result = getFreshTokenResolveResult();
            			tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(robot.robot.RobotPackage.MOVE_CMD__POWER), result);
            			Object resolvedObject = result.getResolvedToken();
            			if (resolvedObject == null) {
            				addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
            			}
            			java.lang.Double resolved = (java.lang.Double) resolvedObject;
            			if (resolved != null) {
            				Object value = resolved;
            				element.eSet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.MOVE_CMD__POWER), value);
            				completedElement(value, false);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_8_0_0_4, resolved, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
            		}
            	}

            }


            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[219]);
            }

            a5=(Token)match(input,11,FOLLOW_11_in_parse_robot_robot_MoveCmd1091); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createMoveCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_8_0_0_5, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[220]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[221]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[222]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[223]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[224]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[225]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[226]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[227]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[228]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[229]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[230]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[231]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[232]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[233]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[234]);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, parse_robot_robot_MoveCmd_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_robot_robot_MoveCmd"



    // $ANTLR start "parse_robot_robot_PrintCmd"
    // Robot.g:1724:1: parse_robot_robot_PrintCmd returns [robot.robot.PrintCmd element = null] : a0= 'display' a1= '(' a2= 'msg' a3= '=' (a4= STRING_LITERAL ) a5= ',' a6= 'duration' a7= '=' (a8= INT_LITERAL ) a9= ',' a10= 'line' a11= '=' (a12= INT_LITERAL ) a13= ',' a14= 'col' a15= '=' (a16= INT_LITERAL ) a17= ')' ;
    public final robot.robot.PrintCmd parse_robot_robot_PrintCmd() throws RecognitionException {
        robot.robot.PrintCmd element =  null;

        int parse_robot_robot_PrintCmd_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;
        Token a10=null;
        Token a11=null;
        Token a12=null;
        Token a13=null;
        Token a14=null;
        Token a15=null;
        Token a16=null;
        Token a17=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }

            // Robot.g:1727:4: (a0= 'display' a1= '(' a2= 'msg' a3= '=' (a4= STRING_LITERAL ) a5= ',' a6= 'duration' a7= '=' (a8= INT_LITERAL ) a9= ',' a10= 'line' a11= '=' (a12= INT_LITERAL ) a13= ',' a14= 'col' a15= '=' (a16= INT_LITERAL ) a17= ')' )
            // Robot.g:1728:4: a0= 'display' a1= '(' a2= 'msg' a3= '=' (a4= STRING_LITERAL ) a5= ',' a6= 'duration' a7= '=' (a8= INT_LITERAL ) a9= ',' a10= 'line' a11= '=' (a12= INT_LITERAL ) a13= ',' a14= 'col' a15= '=' (a16= INT_LITERAL ) a17= ')'
            {
            a0=(Token)match(input,18,FOLLOW_18_in_parse_robot_robot_PrintCmd1117); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_0, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[235]);
            }

            a1=(Token)match(input,10,FOLLOW_10_in_parse_robot_robot_PrintCmd1128); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_1, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[236]);
            }

            a2=(Token)match(input,28,FOLLOW_28_in_parse_robot_robot_PrintCmd1139); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_2, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[237]);
            }

            a3=(Token)match(input,13,FOLLOW_13_in_parse_robot_robot_PrintCmd1150); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_3, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[238]);
            }

            // Robot.g:1784:2: (a4= STRING_LITERAL )
            // Robot.g:1785:2: a4= STRING_LITERAL
            {
            a4=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parse_robot_robot_PrintCmd1164); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (terminateParsing) {
            			throw new robot.resource.robot.mopp.RobotTerminateParsingException();
            		}
            		if (element == null) {
            			element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
            			startIncompleteElement(element);
            		}
            		if (a4 != null) {
            			robot.resource.robot.IRobotTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
            			tokenResolver.setOptions(getOptions());
            			robot.resource.robot.IRobotTokenResolveResult result = getFreshTokenResolveResult();
            			tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(robot.robot.RobotPackage.PRINT_CMD__MSG), result);
            			Object resolvedObject = result.getResolvedToken();
            			if (resolvedObject == null) {
            				addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
            			}
            			java.lang.String resolved = (java.lang.String) resolvedObject;
            			if (resolved != null) {
            				Object value = resolved;
            				element.eSet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.PRINT_CMD__MSG), value);
            				completedElement(value, false);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_4, resolved, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
            		}
            	}

            }


            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[239]);
            }

            a5=(Token)match(input,12,FOLLOW_12_in_parse_robot_robot_PrintCmd1179); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_5, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[240]);
            }

            a6=(Token)match(input,21,FOLLOW_21_in_parse_robot_robot_PrintCmd1190); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_6, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[241]);
            }

            a7=(Token)match(input,13,FOLLOW_13_in_parse_robot_robot_PrintCmd1201); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_7, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[242]);
            }

            // Robot.g:1862:2: (a8= INT_LITERAL )
            // Robot.g:1863:2: a8= INT_LITERAL
            {
            a8=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_parse_robot_robot_PrintCmd1215); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (terminateParsing) {
            			throw new robot.resource.robot.mopp.RobotTerminateParsingException();
            		}
            		if (element == null) {
            			element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
            			startIncompleteElement(element);
            		}
            		if (a8 != null) {
            			robot.resource.robot.IRobotTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INT_LITERAL");
            			tokenResolver.setOptions(getOptions());
            			robot.resource.robot.IRobotTokenResolveResult result = getFreshTokenResolveResult();
            			tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(robot.robot.RobotPackage.PRINT_CMD__DURATION), result);
            			Object resolvedObject = result.getResolvedToken();
            			if (resolvedObject == null) {
            				addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStopIndex());
            			}
            			java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
            			if (resolved != null) {
            				Object value = resolved;
            				element.eSet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.PRINT_CMD__DURATION), value);
            				completedElement(value, false);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_8, resolved, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a8, element);
            		}
            	}

            }


            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[243]);
            }

            a9=(Token)match(input,12,FOLLOW_12_in_parse_robot_robot_PrintCmd1230); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_9, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[244]);
            }

            a10=(Token)match(input,26,FOLLOW_26_in_parse_robot_robot_PrintCmd1241); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_10, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[245]);
            }

            a11=(Token)match(input,13,FOLLOW_13_in_parse_robot_robot_PrintCmd1252); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_11, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[246]);
            }

            // Robot.g:1940:2: (a12= INT_LITERAL )
            // Robot.g:1941:2: a12= INT_LITERAL
            {
            a12=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_parse_robot_robot_PrintCmd1266); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (terminateParsing) {
            			throw new robot.resource.robot.mopp.RobotTerminateParsingException();
            		}
            		if (element == null) {
            			element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
            			startIncompleteElement(element);
            		}
            		if (a12 != null) {
            			robot.resource.robot.IRobotTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INT_LITERAL");
            			tokenResolver.setOptions(getOptions());
            			robot.resource.robot.IRobotTokenResolveResult result = getFreshTokenResolveResult();
            			tokenResolver.resolve(a12.getText(), element.eClass().getEStructuralFeature(robot.robot.RobotPackage.PRINT_CMD__LINE), result);
            			Object resolvedObject = result.getResolvedToken();
            			if (resolvedObject == null) {
            				addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a12).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a12).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a12).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a12).getStopIndex());
            			}
            			java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
            			if (resolved != null) {
            				Object value = resolved;
            				element.eSet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.PRINT_CMD__LINE), value);
            				completedElement(value, false);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_12, resolved, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a12, element);
            		}
            	}

            }


            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[247]);
            }

            a13=(Token)match(input,12,FOLLOW_12_in_parse_robot_robot_PrintCmd1281); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_13, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[248]);
            }

            a14=(Token)match(input,17,FOLLOW_17_in_parse_robot_robot_PrintCmd1292); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_14, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[249]);
            }

            a15=(Token)match(input,13,FOLLOW_13_in_parse_robot_robot_PrintCmd1303); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_15, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[250]);
            }

            // Robot.g:2018:2: (a16= INT_LITERAL )
            // Robot.g:2019:2: a16= INT_LITERAL
            {
            a16=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_parse_robot_robot_PrintCmd1317); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (terminateParsing) {
            			throw new robot.resource.robot.mopp.RobotTerminateParsingException();
            		}
            		if (element == null) {
            			element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
            			startIncompleteElement(element);
            		}
            		if (a16 != null) {
            			robot.resource.robot.IRobotTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INT_LITERAL");
            			tokenResolver.setOptions(getOptions());
            			robot.resource.robot.IRobotTokenResolveResult result = getFreshTokenResolveResult();
            			tokenResolver.resolve(a16.getText(), element.eClass().getEStructuralFeature(robot.robot.RobotPackage.PRINT_CMD__COL), result);
            			Object resolvedObject = result.getResolvedToken();
            			if (resolvedObject == null) {
            				addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a16).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a16).getStopIndex());
            			}
            			java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
            			if (resolved != null) {
            				Object value = resolved;
            				element.eSet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.PRINT_CMD__COL), value);
            				completedElement(value, false);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_16, resolved, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a16, element);
            		}
            	}

            }


            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[251]);
            }

            a17=(Token)match(input,11,FOLLOW_11_in_parse_robot_robot_PrintCmd1332); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_17, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[252]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[253]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[254]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[255]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[256]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[257]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[258]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[259]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[260]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[261]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[262]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[263]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[264]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[265]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[266]);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, parse_robot_robot_PrintCmd_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_robot_robot_PrintCmd"



    // $ANTLR start "parse_robot_robot_SetTurnAngleCmd"
    // Robot.g:2084:1: parse_robot_robot_SetTurnAngleCmd returns [robot.robot.SetTurnAngleCmd element = null] : a0= 'setTurnAngle' a1= '(' a2= 'angle' a3= '=' (a4= INT_LITERAL ) a5= ')' ;
    public final robot.robot.SetTurnAngleCmd parse_robot_robot_SetTurnAngleCmd() throws RecognitionException {
        robot.robot.SetTurnAngleCmd element =  null;

        int parse_robot_robot_SetTurnAngleCmd_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }

            // Robot.g:2087:4: (a0= 'setTurnAngle' a1= '(' a2= 'angle' a3= '=' (a4= INT_LITERAL ) a5= ')' )
            // Robot.g:2088:4: a0= 'setTurnAngle' a1= '(' a2= 'angle' a3= '=' (a4= INT_LITERAL ) a5= ')'
            {
            a0=(Token)match(input,33,FOLLOW_33_in_parse_robot_robot_SetTurnAngleCmd1358); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createSetTurnAngleCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_10_0_0_0, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[267]);
            }

            a1=(Token)match(input,10,FOLLOW_10_in_parse_robot_robot_SetTurnAngleCmd1369); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createSetTurnAngleCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_10_0_0_1, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[268]);
            }

            a2=(Token)match(input,15,FOLLOW_15_in_parse_robot_robot_SetTurnAngleCmd1380); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createSetTurnAngleCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_10_0_0_2, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[269]);
            }

            a3=(Token)match(input,13,FOLLOW_13_in_parse_robot_robot_SetTurnAngleCmd1391); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createSetTurnAngleCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_10_0_0_3, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[270]);
            }

            // Robot.g:2144:2: (a4= INT_LITERAL )
            // Robot.g:2145:2: a4= INT_LITERAL
            {
            a4=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_parse_robot_robot_SetTurnAngleCmd1405); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (terminateParsing) {
            			throw new robot.resource.robot.mopp.RobotTerminateParsingException();
            		}
            		if (element == null) {
            			element = robot.robot.RobotFactory.eINSTANCE.createSetTurnAngleCmd();
            			startIncompleteElement(element);
            		}
            		if (a4 != null) {
            			robot.resource.robot.IRobotTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INT_LITERAL");
            			tokenResolver.setOptions(getOptions());
            			robot.resource.robot.IRobotTokenResolveResult result = getFreshTokenResolveResult();
            			tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(robot.robot.RobotPackage.SET_TURN_ANGLE_CMD__ANGLE), result);
            			Object resolvedObject = result.getResolvedToken();
            			if (resolvedObject == null) {
            				addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
            			}
            			java.lang.Double resolved = (java.lang.Double) resolvedObject;
            			if (resolved != null) {
            				Object value = resolved;
            				element.eSet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.SET_TURN_ANGLE_CMD__ANGLE), value);
            				completedElement(value, false);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_10_0_0_4, resolved, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
            		}
            	}

            }


            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[271]);
            }

            a5=(Token)match(input,11,FOLLOW_11_in_parse_robot_robot_SetTurnAngleCmd1420); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createSetTurnAngleCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_10_0_0_5, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[272]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[273]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[274]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[275]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[276]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[277]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[278]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[279]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[280]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[281]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[282]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[283]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[284]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[285]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[286]);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, parse_robot_robot_SetTurnAngleCmd_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_robot_robot_SetTurnAngleCmd"



    // $ANTLR start "parse_robot_robot_StopEngineCmd"
    // Robot.g:2210:1: parse_robot_robot_StopEngineCmd returns [robot.robot.StopEngineCmd element = null] : a0= 'stopEngine' ;
    public final robot.robot.StopEngineCmd parse_robot_robot_StopEngineCmd() throws RecognitionException {
        robot.robot.StopEngineCmd element =  null;

        int parse_robot_robot_StopEngineCmd_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }

            // Robot.g:2213:4: (a0= 'stopEngine' )
            // Robot.g:2214:4: a0= 'stopEngine'
            {
            a0=(Token)match(input,34,FOLLOW_34_in_parse_robot_robot_StopEngineCmd1446); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createStopEngineCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_11_0_0_0, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[287]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[288]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[289]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[290]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[291]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[292]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[293]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[294]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[295]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[296]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[297]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[298]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[299]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[300]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[301]);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, parse_robot_robot_StopEngineCmd_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_robot_robot_StopEngineCmd"



    // $ANTLR start "parse_robot_robot_StopProgramCmd"
    // Robot.g:2244:1: parse_robot_robot_StopProgramCmd returns [robot.robot.StopProgramCmd element = null] : a0= 'stopProgram' ;
    public final robot.robot.StopProgramCmd parse_robot_robot_StopProgramCmd() throws RecognitionException {
        robot.robot.StopProgramCmd element =  null;

        int parse_robot_robot_StopProgramCmd_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }

            // Robot.g:2247:4: (a0= 'stopProgram' )
            // Robot.g:2248:4: a0= 'stopProgram'
            {
            a0=(Token)match(input,35,FOLLOW_35_in_parse_robot_robot_StopProgramCmd1472); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createStopProgramCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_12_0_0_0, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[302]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[303]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[304]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[305]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[306]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[307]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[308]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[309]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[310]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[311]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[312]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[313]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[314]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[315]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[316]);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, parse_robot_robot_StopProgramCmd_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_robot_robot_StopProgramCmd"



    // $ANTLR start "parse_robot_robot_TurnCmd"
    // Robot.g:2278:1: parse_robot_robot_TurnCmd returns [robot.robot.TurnCmd element = null] : a0= 'turn' a1= '(' a2= 'power' a3= '=' (a4= INT_LITERAL ) a5= ',' a6= 'angle' a7= '=' (a8= INT_LITERAL ) a9= ')' ;
    public final robot.robot.TurnCmd parse_robot_robot_TurnCmd() throws RecognitionException {
        robot.robot.TurnCmd element =  null;

        int parse_robot_robot_TurnCmd_StartIndex = input.index();

        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a7=null;
        Token a8=null;
        Token a9=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }

            // Robot.g:2281:4: (a0= 'turn' a1= '(' a2= 'power' a3= '=' (a4= INT_LITERAL ) a5= ',' a6= 'angle' a7= '=' (a8= INT_LITERAL ) a9= ')' )
            // Robot.g:2282:4: a0= 'turn' a1= '(' a2= 'power' a3= '=' (a4= INT_LITERAL ) a5= ',' a6= 'angle' a7= '=' (a8= INT_LITERAL ) a9= ')'
            {
            a0=(Token)match(input,37,FOLLOW_37_in_parse_robot_robot_TurnCmd1498); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createTurnCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_13_0_0_0, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[317]);
            }

            a1=(Token)match(input,10,FOLLOW_10_in_parse_robot_robot_TurnCmd1509); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createTurnCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_13_0_0_1, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[318]);
            }

            a2=(Token)match(input,31,FOLLOW_31_in_parse_robot_robot_TurnCmd1520); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createTurnCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_13_0_0_2, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[319]);
            }

            a3=(Token)match(input,13,FOLLOW_13_in_parse_robot_robot_TurnCmd1531); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createTurnCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_13_0_0_3, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[320]);
            }

            // Robot.g:2338:2: (a4= INT_LITERAL )
            // Robot.g:2339:2: a4= INT_LITERAL
            {
            a4=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_parse_robot_robot_TurnCmd1545); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (terminateParsing) {
            			throw new robot.resource.robot.mopp.RobotTerminateParsingException();
            		}
            		if (element == null) {
            			element = robot.robot.RobotFactory.eINSTANCE.createTurnCmd();
            			startIncompleteElement(element);
            		}
            		if (a4 != null) {
            			robot.resource.robot.IRobotTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INT_LITERAL");
            			tokenResolver.setOptions(getOptions());
            			robot.resource.robot.IRobotTokenResolveResult result = getFreshTokenResolveResult();
            			tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(robot.robot.RobotPackage.TURN_CMD__POWER), result);
            			Object resolvedObject = result.getResolvedToken();
            			if (resolvedObject == null) {
            				addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a4).getStopIndex());
            			}
            			java.lang.Double resolved = (java.lang.Double) resolvedObject;
            			if (resolved != null) {
            				Object value = resolved;
            				element.eSet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.TURN_CMD__POWER), value);
            				completedElement(value, false);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_13_0_0_4, resolved, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a4, element);
            		}
            	}

            }


            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[321]);
            }

            a5=(Token)match(input,12,FOLLOW_12_in_parse_robot_robot_TurnCmd1560); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createTurnCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_13_0_0_5, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[322]);
            }

            a6=(Token)match(input,15,FOLLOW_15_in_parse_robot_robot_TurnCmd1571); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createTurnCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_13_0_0_6, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[323]);
            }

            a7=(Token)match(input,13,FOLLOW_13_in_parse_robot_robot_TurnCmd1582); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createTurnCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_13_0_0_7, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[324]);
            }

            // Robot.g:2416:2: (a8= INT_LITERAL )
            // Robot.g:2417:2: a8= INT_LITERAL
            {
            a8=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_parse_robot_robot_TurnCmd1596); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (terminateParsing) {
            			throw new robot.resource.robot.mopp.RobotTerminateParsingException();
            		}
            		if (element == null) {
            			element = robot.robot.RobotFactory.eINSTANCE.createTurnCmd();
            			startIncompleteElement(element);
            		}
            		if (a8 != null) {
            			robot.resource.robot.IRobotTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INT_LITERAL");
            			tokenResolver.setOptions(getOptions());
            			robot.resource.robot.IRobotTokenResolveResult result = getFreshTokenResolveResult();
            			tokenResolver.resolve(a8.getText(), element.eClass().getEStructuralFeature(robot.robot.RobotPackage.TURN_CMD__ANGLE), result);
            			Object resolvedObject = result.getResolvedToken();
            			if (resolvedObject == null) {
            				addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a8).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a8).getStopIndex());
            			}
            			java.lang.Double resolved = (java.lang.Double) resolvedObject;
            			if (resolved != null) {
            				Object value = resolved;
            				element.eSet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.TURN_CMD__ANGLE), value);
            				completedElement(value, false);
            			}
            			collectHiddenTokens(element);
            			retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_13_0_0_8, resolved, true);
            			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a8, element);
            		}
            	}

            }


            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[325]);
            }

            a9=(Token)match(input,11,FOLLOW_11_in_parse_robot_robot_TurnCmd1611); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            	if (element == null) {
            		element = robot.robot.RobotFactory.eINSTANCE.createTurnCmd();
            		startIncompleteElement(element);
            	}
            	collectHiddenTokens(element);
            	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_13_0_0_9, null, true);
            	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            }

            if ( state.backtracking==0 ) {
            	// expected elements (follow set)
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[326]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[327]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[328]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[329]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[330]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[331]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[332]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[333]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[334]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[335]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[336]);
            	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[337]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[338]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[339]);
            	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[340]);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, parse_robot_robot_TurnCmd_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_robot_robot_TurnCmd"



    // $ANTLR start "parse_robot_FlotCtrl_Expression"
    // Robot.g:2482:1: parse_robot_FlotCtrl_Expression returns [robot.FlotCtrl.Expression element = null] : c= parseop_Expression_level_3 ;
    public final robot.FlotCtrl.Expression parse_robot_FlotCtrl_Expression() throws RecognitionException {
        robot.FlotCtrl.Expression element =  null;

        int parse_robot_FlotCtrl_Expression_StartIndex = input.index();

        robot.FlotCtrl.Expression c =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }

            // Robot.g:2483:3: (c= parseop_Expression_level_3 )
            // Robot.g:2484:3: c= parseop_Expression_level_3
            {
            pushFollow(FOLLOW_parseop_Expression_level_3_in_parse_robot_FlotCtrl_Expression1633);
            c=parseop_Expression_level_3();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c; /* this rule is an expression root */ }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, parse_robot_FlotCtrl_Expression_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_robot_FlotCtrl_Expression"



    // $ANTLR start "parse_robot_FlotCtrl_BoolExp"
    // Robot.g:2488:1: parse_robot_FlotCtrl_BoolExp returns [robot.FlotCtrl.BoolExp element = null] : c= parseop_BoolExp_level_1 ;
    public final robot.FlotCtrl.BoolExp parse_robot_FlotCtrl_BoolExp() throws RecognitionException {
        robot.FlotCtrl.BoolExp element =  null;

        int parse_robot_FlotCtrl_BoolExp_StartIndex = input.index();

        robot.FlotCtrl.BoolExp c =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return element; }

            // Robot.g:2489:3: (c= parseop_BoolExp_level_1 )
            // Robot.g:2490:3: c= parseop_BoolExp_level_1
            {
            pushFollow(FOLLOW_parseop_BoolExp_level_1_in_parse_robot_FlotCtrl_BoolExp1652);
            c=parseop_BoolExp_level_1();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c; /* this rule is an expression root */ }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, parse_robot_FlotCtrl_BoolExp_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_robot_FlotCtrl_BoolExp"

    // Delegated rules


 

    public static final BitSet FOLLOW_parse_robot_FlotCtrl_ProgramUnit_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_robot_FlotCtrl_Expression_in_parse_robot_FlotCtrl_ProgramUnit124 = new BitSet(new long[]{0x0000006E0A050002L});
    public static final BitSet FOLLOW_parseop_BoolExp_level_2_in_parseop_BoolExp_level_1165 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_parseop_BoolExp_level_1185 = new BitSet(new long[]{0x0000000061000000L});
    public static final BitSet FOLLOW_parseop_BoolExp_level_2_in_parseop_BoolExp_level_1202 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_29_in_parseop_BoolExp_level_2248 = new BitSet(new long[]{0x0000000041000000L});
    public static final BitSet FOLLOW_parseop_BoolExp_level_3_in_parseop_BoolExp_level_2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parseop_BoolExp_level_3_in_parseop_BoolExp_level_2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_robot_robot_HasTurnedCmd_in_parseop_BoolExp_level_3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_robot_robot_ObstacleCmd_in_parseop_BoolExp_level_3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_parse_robot_robot_HasTurnedCmd321 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_robot_robot_HasTurnedCmd332 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_robot_robot_HasTurnedCmd343 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_robot_robot_HasTurnedCmd354 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_LITERAL_in_parse_robot_robot_HasTurnedCmd368 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_robot_robot_HasTurnedCmd383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_parse_robot_robot_ObstacleCmd409 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_robot_robot_ObstacleCmd420 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_parse_robot_robot_ObstacleCmd431 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_robot_robot_ObstacleCmd442 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_LITERAL_in_parse_robot_robot_ObstacleCmd456 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_robot_robot_ObstacleCmd471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_robot_FlotCtrl_WhileLoop_in_parseop_Expression_level_3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_robot_FlotCtrl_IfBlock_in_parseop_Expression_level_3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_robot_robot_Bip_in_parseop_Expression_level_3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_robot_robot_MoveCmd_in_parseop_Expression_level_3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_robot_robot_PrintCmd_in_parseop_Expression_level_3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_robot_robot_SetTurnAngleCmd_in_parseop_Expression_level_3537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_robot_robot_StopEngineCmd_in_parseop_Expression_level_3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_robot_robot_StopProgramCmd_in_parseop_Expression_level_3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_robot_robot_TurnCmd_in_parseop_Expression_level_3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_parse_robot_FlotCtrl_WhileLoop583 = new BitSet(new long[]{0x0000000061000000L});
    public static final BitSet FOLLOW_parse_robot_FlotCtrl_BoolExp_in_parse_robot_FlotCtrl_WhileLoop597 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_parse_robot_FlotCtrl_WhileLoop610 = new BitSet(new long[]{0x0000006E0A850000L});
    public static final BitSet FOLLOW_parse_robot_FlotCtrl_Expression_in_parse_robot_FlotCtrl_WhileLoop628 = new BitSet(new long[]{0x0000006E0A850000L});
    public static final BitSet FOLLOW_23_in_parse_robot_FlotCtrl_WhileLoop647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_parse_robot_FlotCtrl_IfBlock673 = new BitSet(new long[]{0x0000000061000000L});
    public static final BitSet FOLLOW_parse_robot_FlotCtrl_BoolExp_in_parse_robot_FlotCtrl_IfBlock687 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_parse_robot_FlotCtrl_IfBlock700 = new BitSet(new long[]{0x0000006E0A050000L});
    public static final BitSet FOLLOW_parse_robot_FlotCtrl_Expression_in_parse_robot_FlotCtrl_IfBlock718 = new BitSet(new long[]{0x0000006E0AC50000L});
    public static final BitSet FOLLOW_22_in_parse_robot_FlotCtrl_IfBlock744 = new BitSet(new long[]{0x0000006E0A850000L});
    public static final BitSet FOLLOW_parse_robot_FlotCtrl_Expression_in_parse_robot_FlotCtrl_IfBlock772 = new BitSet(new long[]{0x0000006E0A850000L});
    public static final BitSet FOLLOW_23_in_parse_robot_FlotCtrl_IfBlock813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_parse_robot_robot_Bip839 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_robot_robot_Bip850 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_robot_robot_Bip861 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_robot_robot_Bip872 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_LITERAL_in_parse_robot_robot_Bip886 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_robot_robot_Bip901 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_robot_robot_Bip912 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_robot_robot_Bip923 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_LITERAL_in_parse_robot_robot_Bip937 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_robot_robot_Bip952 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_parse_robot_robot_Bip963 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_robot_robot_Bip974 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_BOOLEAN_LITERAL_in_parse_robot_robot_Bip988 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_robot_robot_Bip1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_parse_robot_robot_MoveCmd1029 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_robot_robot_MoveCmd1040 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_robot_robot_MoveCmd1051 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_robot_robot_MoveCmd1062 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_LITERAL_in_parse_robot_robot_MoveCmd1076 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_robot_robot_MoveCmd1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_parse_robot_robot_PrintCmd1117 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_robot_robot_PrintCmd1128 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_parse_robot_robot_PrintCmd1139 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_robot_robot_PrintCmd1150 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parse_robot_robot_PrintCmd1164 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_robot_robot_PrintCmd1179 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_robot_robot_PrintCmd1190 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_robot_robot_PrintCmd1201 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_LITERAL_in_parse_robot_robot_PrintCmd1215 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_robot_robot_PrintCmd1230 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_parse_robot_robot_PrintCmd1241 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_robot_robot_PrintCmd1252 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_LITERAL_in_parse_robot_robot_PrintCmd1266 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_robot_robot_PrintCmd1281 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_robot_robot_PrintCmd1292 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_robot_robot_PrintCmd1303 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_LITERAL_in_parse_robot_robot_PrintCmd1317 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_robot_robot_PrintCmd1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_parse_robot_robot_SetTurnAngleCmd1358 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_robot_robot_SetTurnAngleCmd1369 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_robot_robot_SetTurnAngleCmd1380 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_robot_robot_SetTurnAngleCmd1391 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_LITERAL_in_parse_robot_robot_SetTurnAngleCmd1405 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_robot_robot_SetTurnAngleCmd1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_parse_robot_robot_StopEngineCmd1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_parse_robot_robot_StopProgramCmd1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_parse_robot_robot_TurnCmd1498 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_parse_robot_robot_TurnCmd1509 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_robot_robot_TurnCmd1520 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_robot_robot_TurnCmd1531 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_LITERAL_in_parse_robot_robot_TurnCmd1545 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_robot_robot_TurnCmd1560 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_robot_robot_TurnCmd1571 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_robot_robot_TurnCmd1582 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_LITERAL_in_parse_robot_robot_TurnCmd1596 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parse_robot_robot_TurnCmd1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parseop_Expression_level_3_in_parse_robot_FlotCtrl_Expression1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parseop_BoolExp_level_1_in_parse_robot_FlotCtrl_BoolExp1652 = new BitSet(new long[]{0x0000000000000002L});

}