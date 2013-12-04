grammar Robot;

options {
	superClass = RobotANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package robot.resource.robot.mopp;
}

@lexer::members {
	public java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>();
	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
	
	public void reportError(org.antlr.runtime3_4_0.RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionsPosition.add(((org.antlr.runtime3_4_0.ANTLRStringStream) input).index());
	}
}
@header{
	package robot.resource.robot.mopp;
}

@members{
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
			if (type.getInstanceClass() == robot.robot.ProgramUnit.class) {
				return parse_robot_robot_ProgramUnit();
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
	
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[0]);
		addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[1]);
		addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[2]);
		addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[3]);
		addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[4]);
		addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[5]);
		addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[6]);
		addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[7]);
		addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[8]);
		addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[9]);
		addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[10]);
		addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[11]);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_robot_robot_ProgramUnit{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_robot_robot_ProgramUnit returns [robot.robot.ProgramUnit element = null]
@init{
}
:
	(
		(
			a0_0 = parse_robot_FlotCtrl_Expression			{
				if (terminateParsing) {
					throw new robot.resource.robot.mopp.RobotTerminateParsingException();
				}
				if (element == null) {
					element = robot.robot.RobotFactory.eINSTANCE.createProgramUnit();
					startIncompleteElement(element);
				}
				if (a0_0 != null) {
					if (a0_0 != null) {
						Object value = a0_0;
						addObjectToList(element, robot.robot.RobotPackage.PROGRAM_UNIT__BLOCK, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_0_0_0_0, a0_0, true);
					copyLocalizationInfos(a0_0, element);
				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[12]);
		addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[13]);
		addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[14]);
		addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[15]);
		addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[16]);
		addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[17]);
		addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[18]);
		addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[19]);
		addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[20]);
		addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[21]);
		addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[22]);
		addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[23]);
	}
	
;

parseop_BoolExp_level_1 returns [robot.FlotCtrl.BoolExp element = null]
@init{
}
:
	leftArg = parseop_BoolExp_level_2	((
		()
		{ element = null; }
		a0 = 'and' {
			if (element == null) {
				element = robot.FlotCtrl.FlotCtrlFactory.eINSTANCE.createAndExp();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_1_0_0_1, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getAndExp(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[24]);
			addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getAndExp(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[25]);
			addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getAndExp(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[26]);
		}
		
		rightArg = parseop_BoolExp_level_2		{
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
		{
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
		{ leftArg = element; /* this may become an argument in the next iteration */ }
	)+ | /* epsilon */ { element = leftArg; }
	
)
;

parseop_BoolExp_level_2 returns [robot.FlotCtrl.BoolExp element = null]
@init{
}
:
a0 = 'not' {
	if (element == null) {
		element = robot.FlotCtrl.FlotCtrlFactory.eINSTANCE.createNegExp();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_2_0_0_0, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
	// expected elements (follow set)
	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getNegExp(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[27]);
	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getNegExp(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[28]);
	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getNegExp(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[29]);
}

arg = parseop_BoolExp_level_3{
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
|

arg = parseop_BoolExp_level_3{ element = arg; }
;

parseop_BoolExp_level_3 returns [robot.FlotCtrl.BoolExp element = null]
@init{
}
:
c0 = parse_robot_robot_HasTurnedCmd{ element = c0; /* this is a subclass or primitive expression choice */ }
|c1 = parse_robot_robot_ObstacleCmd{ element = c1; /* this is a subclass or primitive expression choice */ }
;

parse_robot_robot_HasTurnedCmd returns [robot.robot.HasTurnedCmd element = null]
@init{
}
:
a0 = 'hasTurned' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createHasTurnedCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_3_0_0_0, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[30]);
}

a1 = '(' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createHasTurnedCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_3_0_0_1, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[31]);
}

a2 = 'angle' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createHasTurnedCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_3_0_0_2, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[32]);
}

a3 = '=' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createHasTurnedCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_3_0_0_3, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[33]);
}

(
	a4 = INT_LITERAL	
	{
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
)
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[34]);
}

a5 = ')' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createHasTurnedCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_3_0_0_5, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
}
{
	// expected elements (follow set)
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[35]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[36]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[37]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[38]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[39]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[40]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[41]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[42]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[43]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[44]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[45]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[46]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[47]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[48]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[49]);
}

;

parse_robot_robot_ObstacleCmd returns [robot.robot.ObstacleCmd element = null]
@init{
}
:
a0 = 'obstacle' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createObstacleCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_4_0_0_0, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[50]);
}

a1 = '(' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createObstacleCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_4_0_0_1, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[51]);
}

a2 = 'distance' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createObstacleCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_4_0_0_2, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[52]);
}

a3 = '=' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createObstacleCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_4_0_0_3, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[53]);
}

(
	a4 = INT_LITERAL	
	{
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
)
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[54]);
}

a5 = ')' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createObstacleCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_4_0_0_5, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
}
{
	// expected elements (follow set)
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[55]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[56]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[57]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[58]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[59]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[60]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[61]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[62]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[63]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[64]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[65]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[66]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[67]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[68]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[69]);
}

;

parseop_Expression_level_3 returns [robot.FlotCtrl.Expression element = null]
@init{
}
:
c0 = parse_robot_FlotCtrl_WhileLoop{ element = c0; /* this is a subclass or primitive expression choice */ }
|c1 = parse_robot_FlotCtrl_IfBlock{ element = c1; /* this is a subclass or primitive expression choice */ }
|c2 = parse_robot_robot_Bip{ element = c2; /* this is a subclass or primitive expression choice */ }
|c3 = parse_robot_robot_MoveCmd{ element = c3; /* this is a subclass or primitive expression choice */ }
|c4 = parse_robot_robot_PrintCmd{ element = c4; /* this is a subclass or primitive expression choice */ }
|c5 = parse_robot_robot_SetTurnAngleCmd{ element = c5; /* this is a subclass or primitive expression choice */ }
|c6 = parse_robot_robot_StopEngineCmd{ element = c6; /* this is a subclass or primitive expression choice */ }
|c7 = parse_robot_robot_StopProgramCmd{ element = c7; /* this is a subclass or primitive expression choice */ }
|c8 = parse_robot_robot_TurnCmd{ element = c8; /* this is a subclass or primitive expression choice */ }
;

parse_robot_FlotCtrl_WhileLoop returns [robot.FlotCtrl.WhileLoop element = null]
@init{
}
:
a0 = 'while' {
	if (element == null) {
		element = robot.FlotCtrl.FlotCtrlFactory.eINSTANCE.createWhileLoop();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_5_0_0_0, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
	// expected elements (follow set)
	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[70]);
	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[71]);
	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getWhileLoop(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[72]);
}

(
	a1_0 = parse_robot_FlotCtrl_BoolExp	{
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
)
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[73]);
}

a2 = 'do' {
	if (element == null) {
		element = robot.FlotCtrl.FlotCtrlFactory.eINSTANCE.createWhileLoop();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_5_0_0_2, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
}
{
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

(
	(
		a3_0 = parse_robot_FlotCtrl_Expression		{
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
	)
	
)*{
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

a4 = 'end' {
	if (element == null) {
		element = robot.FlotCtrl.FlotCtrlFactory.eINSTANCE.createWhileLoop();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_5_0_0_4, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
}
{
	// expected elements (follow set)
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[100]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[101]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[102]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[103]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[104]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[105]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[106]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[107]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[108]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[109]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[110]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[111]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[112]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[113]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[114]);
}

;

parse_robot_FlotCtrl_IfBlock returns [robot.FlotCtrl.IfBlock element = null]
@init{
}
:
a0 = 'if' {
	if (element == null) {
		element = robot.FlotCtrl.FlotCtrlFactory.eINSTANCE.createIfBlock();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_6_0_0_0, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
	// expected elements (follow set)
	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[115]);
	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[116]);
	addExpectedElement(robot.FlotCtrl.FlotCtrlPackage.eINSTANCE.getIfBlock(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[117]);
}

(
	a1_0 = parse_robot_FlotCtrl_BoolExp	{
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
)
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[118]);
}

a2 = 'then' {
	if (element == null) {
		element = robot.FlotCtrl.FlotCtrlFactory.eINSTANCE.createIfBlock();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_6_0_0_2, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
}
{
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

(
	(
		a3_0 = parse_robot_FlotCtrl_Expression		{
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
	)
	
)+{
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

(
	(
		a4 = 'else' {
			if (element == null) {
				element = robot.FlotCtrl.FlotCtrlFactory.eINSTANCE.createIfBlock();
				startIncompleteElement(element);
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_6_0_0_4_0_0_0, null, true);
			copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
		}
		{
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
		
		(
			(
				a5_0 = parse_robot_FlotCtrl_Expression				{
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
			)
			
		)*		{
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
		
	)
	
)?{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[171]);
}

a6 = 'end' {
	if (element == null) {
		element = robot.FlotCtrl.FlotCtrlFactory.eINSTANCE.createIfBlock();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_6_0_0_5, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
}
{
	// expected elements (follow set)
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[172]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[173]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[174]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[175]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[176]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[177]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[178]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[179]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[180]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[181]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[182]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[183]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[184]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[185]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[186]);
}

;

parse_robot_robot_Bip returns [robot.robot.Bip element = null]
@init{
}
:
a0 = 'bip' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createBip();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_7_0_0_0, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[187]);
}

a1 = '(' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createBip();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_7_0_0_1, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[188]);
}

a2 = 'duration' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createBip();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_7_0_0_2, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[189]);
}

a3 = '=' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createBip();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_7_0_0_3, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[190]);
}

(
	a4 = INT_LITERAL	
	{
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
)
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[191]);
}

a5 = ',' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createBip();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_7_0_0_5, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[192]);
}

a6 = 'power' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createBip();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_7_0_0_6, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[193]);
}

a7 = '=' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createBip();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_7_0_0_7, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[194]);
}

(
	a8 = INT_LITERAL	
	{
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
)
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[195]);
}

a9 = ',' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createBip();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_7_0_0_9, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[196]);
}

a10 = 'repeat' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createBip();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_7_0_0_10, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[197]);
}

a11 = '=' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createBip();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_7_0_0_11, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[198]);
}

(
	a12 = BOOLEAN_LITERAL	
	{
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
)
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[199]);
}

a13 = ')' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createBip();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_7_0_0_13, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
}
{
	// expected elements (follow set)
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[200]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[201]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[202]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[203]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[204]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[205]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[206]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[207]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[208]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[209]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[210]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[211]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[212]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[213]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[214]);
}

;

parse_robot_robot_MoveCmd returns [robot.robot.MoveCmd element = null]
@init{
}
:
a0 = 'move' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createMoveCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_8_0_0_0, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[215]);
}

a1 = '(' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createMoveCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_8_0_0_1, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[216]);
}

a2 = 'power' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createMoveCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_8_0_0_2, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[217]);
}

a3 = '=' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createMoveCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_8_0_0_3, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[218]);
}

(
	a4 = INT_LITERAL	
	{
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
)
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[219]);
}

a5 = ')' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createMoveCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_8_0_0_5, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
}
{
	// expected elements (follow set)
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[220]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[221]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[222]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[223]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[224]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[225]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[226]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[227]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[228]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[229]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[230]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[231]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[232]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[233]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[234]);
}

;

parse_robot_robot_PrintCmd returns [robot.robot.PrintCmd element = null]
@init{
}
:
a0 = 'display' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_0, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[235]);
}

a1 = '(' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_1, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[236]);
}

a2 = 'msg' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_2, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[237]);
}

a3 = '=' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_3, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[238]);
}

(
	a4 = STRING_LITERAL	
	{
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
)
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[239]);
}

a5 = ',' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_5, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[240]);
}

a6 = 'duration' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_6, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[241]);
}

a7 = '=' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_7, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[242]);
}

(
	a8 = INT_LITERAL	
	{
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
)
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[243]);
}

a9 = ',' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_9, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[244]);
}

a10 = 'line' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_10, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[245]);
}

a11 = '=' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_11, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[246]);
}

(
	a12 = INT_LITERAL	
	{
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
)
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[247]);
}

a13 = ',' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_13, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a13, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[248]);
}

a14 = 'col' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_14, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a14, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[249]);
}

a15 = '=' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_15, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a15, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[250]);
}

(
	a16 = INT_LITERAL	
	{
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
)
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[251]);
}

a17 = ')' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createPrintCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_9_0_0_17, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a17, element);
}
{
	// expected elements (follow set)
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[252]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[253]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[254]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[255]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[256]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[257]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[258]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[259]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[260]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[261]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[262]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[263]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[264]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[265]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[266]);
}

;

parse_robot_robot_SetTurnAngleCmd returns [robot.robot.SetTurnAngleCmd element = null]
@init{
}
:
a0 = 'setTurnAngle' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createSetTurnAngleCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_10_0_0_0, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[267]);
}

a1 = '(' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createSetTurnAngleCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_10_0_0_1, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[268]);
}

a2 = 'angle' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createSetTurnAngleCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_10_0_0_2, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[269]);
}

a3 = '=' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createSetTurnAngleCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_10_0_0_3, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[270]);
}

(
	a4 = INT_LITERAL	
	{
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
)
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[271]);
}

a5 = ')' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createSetTurnAngleCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_10_0_0_5, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
}
{
	// expected elements (follow set)
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[272]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[273]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[274]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[275]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[276]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[277]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[278]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[279]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[280]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[281]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[282]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[283]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[284]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[285]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[286]);
}

;

parse_robot_robot_StopEngineCmd returns [robot.robot.StopEngineCmd element = null]
@init{
}
:
a0 = 'stopEngine' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createStopEngineCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_11_0_0_0, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
	// expected elements (follow set)
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[287]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[288]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[289]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[290]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[291]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[292]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[293]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[294]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[295]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[296]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[297]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[298]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[299]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[300]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[301]);
}

;

parse_robot_robot_StopProgramCmd returns [robot.robot.StopProgramCmd element = null]
@init{
}
:
a0 = 'stopProgram' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createStopProgramCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_12_0_0_0, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
	// expected elements (follow set)
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[302]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[303]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[304]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[305]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[306]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[307]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[308]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[309]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[310]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[311]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[312]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[313]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[314]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[315]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[316]);
}

;

parse_robot_robot_TurnCmd returns [robot.robot.TurnCmd element = null]
@init{
}
:
a0 = 'turn' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createTurnCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_13_0_0_0, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[317]);
}

a1 = '(' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createTurnCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_13_0_0_1, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[318]);
}

a2 = 'power' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createTurnCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_13_0_0_2, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[319]);
}

a3 = '=' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createTurnCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_13_0_0_3, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[320]);
}

(
	a4 = INT_LITERAL	
	{
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
)
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[321]);
}

a5 = ',' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createTurnCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_13_0_0_5, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[322]);
}

a6 = 'angle' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createTurnCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_13_0_0_6, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[323]);
}

a7 = '=' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createTurnCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_13_0_0_7, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a7, element);
}
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[324]);
}

(
	a8 = INT_LITERAL	
	{
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
)
{
	// expected elements (follow set)
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[325]);
}

a9 = ')' {
	if (element == null) {
		element = robot.robot.RobotFactory.eINSTANCE.createTurnCmd();
		startIncompleteElement(element);
	}
	collectHiddenTokens(element);
	retrieveLayoutInformation(element, robot.resource.robot.grammar.RobotGrammarInformationProvider.ROBOT_13_0_0_9, null, true);
	copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
}
{
	// expected elements (follow set)
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[326]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[327]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[328]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[329]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[330]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[331]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[332]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[333]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[334]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[335]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[336]);
	addExpectedElement(robot.robot.RobotPackage.eINSTANCE.getProgramUnit(), robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[337]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[338]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[339]);
	addExpectedElement(null, robot.resource.robot.mopp.RobotExpectationConstants.EXPECTATIONS[340]);
}

;

parse_robot_FlotCtrl_Expression returns [robot.FlotCtrl.Expression element = null]
:
c = parseop_Expression_level_3{ element = c; /* this rule is an expression root */ }

;

parse_robot_FlotCtrl_BoolExp returns [robot.FlotCtrl.BoolExp element = null]
:
c = parseop_BoolExp_level_1{ element = c; /* this rule is an expression root */ }

;

BOOLEAN_LITERAL:
('true'|'false')
;
STRING_LITERAL:
('"'('\\'('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')|('\\''u'('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F'))|'\\'('0'..'7')|~('\\'|'"'))*'"')
;
INT_LITERAL:
(('0'|'1'..'9''0'..'9'*))
;
TEXT:
(('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+)
{ _channel = 99; }
;
WHITESPACE:
((' ' | '\t' | '\f'))
{ _channel = 99; }
;
LINEBREAK:
(('\r\n' | '\r' | '\n'))
{ _channel = 99; }
;

