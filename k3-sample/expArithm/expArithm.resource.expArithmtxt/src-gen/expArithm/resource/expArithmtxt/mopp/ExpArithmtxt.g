grammar ExpArithmtxt;

options {
	superClass = ExpArithmtxtANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package expArithm.resource.expArithmtxt.mopp;
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
	package expArithm.resource.expArithmtxt.mopp;
}

@members{
	private expArithm.resource.expArithmtxt.IExpArithmtxtTokenResolverFactory tokenResolverFactory = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTokenResolverFactory();
	
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
	private java.util.List<expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectedTerminal> expectedElements = new java.util.ArrayList<expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectedTerminal>();
	
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
		postParseCommands.add(new expArithm.resource.expArithmtxt.IExpArithmtxtCommand<expArithm.resource.expArithmtxt.IExpArithmtxtTextResource>() {
			public boolean execute(expArithm.resource.expArithmtxt.IExpArithmtxtTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for code completion
					return true;
				}
				resource.addProblem(new expArithm.resource.expArithmtxt.IExpArithmtxtProblem() {
					public expArithm.resource.expArithmtxt.ExpArithmtxtEProblemSeverity getSeverity() {
						return expArithm.resource.expArithmtxt.ExpArithmtxtEProblemSeverity.ERROR;
					}
					public expArithm.resource.expArithmtxt.ExpArithmtxtEProblemType getType() {
						return expArithm.resource.expArithmtxt.ExpArithmtxtEProblemType.SYNTAX_ERROR;
					}
					public String getMessage() {
						return errorMessage;
					}
					public java.util.Collection<expArithm.resource.expArithmtxt.IExpArithmtxtQuickFix> getQuickFixes() {
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
		expArithm.resource.expArithmtxt.IExpArithmtxtExpectedElement terminal = expArithm.resource.expArithmtxt.grammar.ExpArithmtxtFollowSetProvider.TERMINALS[terminalID];
		expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[] containmentFeatures = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[ids.length - 2];
		for (int i = 2; i < ids.length; i++) {
			containmentFeatures[i - 2] = expArithm.resource.expArithmtxt.grammar.ExpArithmtxtFollowSetProvider.LINKS[ids[i]];
		}
		expArithm.resource.expArithmtxt.grammar.ExpArithmtxtContainmentTrace containmentTrace = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtContainmentTrace(eClass, containmentFeatures);
		org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
		expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectedTerminal expectedElement = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectedTerminal(container, terminal, followSetID, containmentTrace);
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
		postParseCommands.add(new expArithm.resource.expArithmtxt.IExpArithmtxtCommand<expArithm.resource.expArithmtxt.IExpArithmtxtTextResource>() {
			public boolean execute(expArithm.resource.expArithmtxt.IExpArithmtxtTextResource resource) {
				expArithm.resource.expArithmtxt.IExpArithmtxtLocationMap locationMap = resource.getLocationMap();
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
		postParseCommands.add(new expArithm.resource.expArithmtxt.IExpArithmtxtCommand<expArithm.resource.expArithmtxt.IExpArithmtxtTextResource>() {
			public boolean execute(expArithm.resource.expArithmtxt.IExpArithmtxtTextResource resource) {
				expArithm.resource.expArithmtxt.IExpArithmtxtLocationMap locationMap = resource.getLocationMap();
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
	protected void setLocalizationEnd(java.util.Collection<expArithm.resource.expArithmtxt.IExpArithmtxtCommand<expArithm.resource.expArithmtxt.IExpArithmtxtTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
		if (disableLocationMap) {
			return;
		}
		postParseCommands.add(new expArithm.resource.expArithmtxt.IExpArithmtxtCommand<expArithm.resource.expArithmtxt.IExpArithmtxtTextResource>() {
			public boolean execute(expArithm.resource.expArithmtxt.IExpArithmtxtTextResource resource) {
				expArithm.resource.expArithmtxt.IExpArithmtxtLocationMap locationMap = resource.getLocationMap();
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
	
	public expArithm.resource.expArithmtxt.IExpArithmtxtTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
		try {
			if (encoding == null) {
				return new ExpArithmtxtParser(new org.antlr.runtime3_4_0.CommonTokenStream(new ExpArithmtxtLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream))));
			} else {
				return new ExpArithmtxtParser(new org.antlr.runtime3_4_0.CommonTokenStream(new ExpArithmtxtLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream, encoding))));
			}
		} catch (java.io.IOException e) {
			new expArithm.resource.expArithmtxt.util.ExpArithmtxtRuntimeUtil().logError("Error while creating parser.", e);
			return null;
		}
	}
	
	/**
	 * This default constructor is only used to call createInstance() on it.
	 */
	public ExpArithmtxtParser() {
		super(null);
	}
	
	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_4_0.RecognitionException {
		this.lastPosition = 0;
		// required because the lexer class can not be subclassed
		((ExpArithmtxtLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
		((ExpArithmtxtLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
		Object typeObject = getTypeObject();
		if (typeObject == null) {
			return start();
		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
			if (type.getInstanceClass() == expArithm.ExpressionArithm.class) {
				return parse_expArithm_ExpressionArithm();
			}
			if (type.getInstanceClass() == expArithm.Valeur.class) {
				return parse_expArithm_Valeur();
			}
			if (type.getInstanceClass() == expArithm.Plus.class) {
				return parse_expArithm_Plus();
			}
			if (type.getInstanceClass() == expArithm.Mult.class) {
				return parse_expArithm_Mult();
			}
			if (type.getInstanceClass() == expArithm.Division.class) {
				return parse_expArithm_Division();
			}
			if (type.getInstanceClass() == expArithm.Moins.class) {
				return parse_expArithm_Moins();
			}
		}
		throw new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtUnexpectedContentTypeException(typeObject);
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
			typeObject = options.get(expArithm.resource.expArithmtxt.IExpArithmtxtOptions.RESOURCE_CONTENT_TYPE);
		}
		return typeObject;
	}
	
	/**
	 * Implementation that calls {@link #doParse()} and handles the thrown
	 * RecognitionExceptions.
	 */
	public expArithm.resource.expArithmtxt.IExpArithmtxtParseResult parse() {
		terminateParsing = false;
		postParseCommands = new java.util.ArrayList<expArithm.resource.expArithmtxt.IExpArithmtxtCommand<expArithm.resource.expArithmtxt.IExpArithmtxtTextResource>>();
		expArithm.resource.expArithmtxt.mopp.ExpArithmtxtParseResult parseResult = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtParseResult();
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
	
	public java.util.List<expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, expArithm.resource.expArithmtxt.IExpArithmtxtTextResource dummyResource, int cursorOffset) {
		this.rememberExpectedElements = true;
		this.parseToIndexTypeObject = type;
		this.cursorOffset = cursorOffset;
		this.lastStartIncludingHidden = -1;
		final org.antlr.runtime3_4_0.CommonTokenStream tokenStream = (org.antlr.runtime3_4_0.CommonTokenStream) getTokenStream();
		expArithm.resource.expArithmtxt.IExpArithmtxtParseResult result = parse();
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
			for (expArithm.resource.expArithmtxt.IExpArithmtxtCommand<expArithm.resource.expArithmtxt.IExpArithmtxtTextResource> command : result.getPostParseCommands()) {
				command.execute(dummyResource);
			}
		}
		// remove all expected elements that were added after the last complete element
		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
		java.util.Set<expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectedTerminal>();
		java.util.List<expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectedTerminal> newFollowSet = new java.util.ArrayList<expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectedTerminal>();
		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
			expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectedTerminal expectedElementI = expectedElements.get(i);
			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
				currentFollowSet.add(expectedElementI);
			} else {
				break;
			}
		}
		int followSetID = 15;
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
				for (expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectedTerminal nextFollow : newFollowSet) {
					lastTokenIndex = 0;
					setPosition(nextFollow, i);
				}
				newFollowSet.clear();
				// normal tokens do reduce the follow set - only elements that match the token are
				// kept
				for (expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectedTerminal nextFollow : currentFollowSet) {
					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
						// keep this one - it matches
						java.util.Collection<expArithm.resource.expArithmtxt.util.ExpArithmtxtPair<expArithm.resource.expArithmtxt.IExpArithmtxtExpectedElement, expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
						for (expArithm.resource.expArithmtxt.util.ExpArithmtxtPair<expArithm.resource.expArithmtxt.IExpArithmtxtExpectedElement, expArithm.resource.expArithmtxt.mopp.ExpArithmtxtContainedFeature[]> newFollowerPair : newFollowers) {
							expArithm.resource.expArithmtxt.IExpArithmtxtExpectedElement newFollower = newFollowerPair.getLeft();
							org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
							expArithm.resource.expArithmtxt.grammar.ExpArithmtxtContainmentTrace containmentTrace = new expArithm.resource.expArithmtxt.grammar.ExpArithmtxtContainmentTrace(null, newFollowerPair.getRight());
							expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectedTerminal newFollowTerminal = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectedTerminal(container, newFollower, followSetID, containmentTrace);
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
		for (expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectedTerminal nextFollow : newFollowSet) {
			lastTokenIndex = 0;
			setPosition(nextFollow, i);
		}
		return this.expectedElements;
	}
	
	public void setPosition(expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectedTerminal expectedElement, int tokenIndex) {
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
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getExpressionArithm(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[0]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getExpressionArithm(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[1]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getExpressionArithm(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[2]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getExpressionArithm(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[3]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getExpressionArithm(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[4]);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_expArithm_ExpressionArithm{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_expArithm_ExpressionArithm returns [expArithm.ExpressionArithm element = null]
@init{
}
:
	(
		(
			a0_0 = parse_expArithm_EltExp			{
				if (terminateParsing) {
					throw new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTerminateParsingException();
				}
				if (element == null) {
					element = expArithm.ExpArithmFactory.eINSTANCE.createExpressionArithm();
					startIncompleteElement(element);
				}
				if (a0_0 != null) {
					if (a0_0 != null) {
						Object value = a0_0;
						element.eSet(element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.EXPRESSION_ARITHM__RACINE), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, expArithm.resource.expArithmtxt.grammar.ExpArithmtxtGrammarInformationProvider.EXPARITHMTXT_0_0_0_0, a0_0, true);
					copyLocalizationInfos(a0_0, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
	}
	
;

parse_expArithm_Valeur returns [expArithm.Valeur element = null]
@init{
}
:
	(
		a0 = VALUE		
		{
			if (terminateParsing) {
				throw new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTerminateParsingException();
			}
			if (element == null) {
				element = expArithm.ExpArithmFactory.eINSTANCE.createValeur();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				expArithm.resource.expArithmtxt.IExpArithmtxtTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("VALUE");
				tokenResolver.setOptions(getOptions());
				expArithm.resource.expArithmtxt.IExpArithmtxtTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.VALEUR__VALEUR), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.Double resolved = (java.lang.Double) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.VALEUR__VALEUR), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, expArithm.resource.expArithmtxt.grammar.ExpArithmtxtGrammarInformationProvider.EXPARITHMTXT_1_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[5]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[6]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[7]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[8]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[9]);
	}
	
;

parse_expArithm_Plus returns [expArithm.Plus element = null]
@init{
}
:
	a0 = '+' {
		if (element == null) {
			element = expArithm.ExpArithmFactory.eINSTANCE.createPlus();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, expArithm.resource.expArithmtxt.grammar.ExpArithmtxtGrammarInformationProvider.EXPARITHMTXT_2_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[10]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[11]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[12]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[13]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[14]);
	}
	
	(
		a1_0 = parse_expArithm_EltExp		{
			if (terminateParsing) {
				throw new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTerminateParsingException();
			}
			if (element == null) {
				element = expArithm.ExpArithmFactory.eINSTANCE.createPlus();
				startIncompleteElement(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.PLUS__ELT_GAUCHE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, expArithm.resource.expArithmtxt.grammar.ExpArithmtxtGrammarInformationProvider.EXPARITHMTXT_2_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[15]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[16]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[17]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[18]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[19]);
	}
	
	(
		a2_0 = parse_expArithm_EltExp		{
			if (terminateParsing) {
				throw new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTerminateParsingException();
			}
			if (element == null) {
				element = expArithm.ExpArithmFactory.eINSTANCE.createPlus();
				startIncompleteElement(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.PLUS__ELT_DROIT), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, expArithm.resource.expArithmtxt.grammar.ExpArithmtxtGrammarInformationProvider.EXPARITHMTXT_2_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[20]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[21]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[22]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[23]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[24]);
	}
	
;

parse_expArithm_Mult returns [expArithm.Mult element = null]
@init{
}
:
	a0 = '*' {
		if (element == null) {
			element = expArithm.ExpArithmFactory.eINSTANCE.createMult();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, expArithm.resource.expArithmtxt.grammar.ExpArithmtxtGrammarInformationProvider.EXPARITHMTXT_3_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getMult(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[25]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getMult(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[26]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getMult(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[27]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getMult(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[28]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getMult(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[29]);
	}
	
	(
		a1_0 = parse_expArithm_EltExp		{
			if (terminateParsing) {
				throw new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTerminateParsingException();
			}
			if (element == null) {
				element = expArithm.ExpArithmFactory.eINSTANCE.createMult();
				startIncompleteElement(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.MULT__ELT_GAUCHE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, expArithm.resource.expArithmtxt.grammar.ExpArithmtxtGrammarInformationProvider.EXPARITHMTXT_3_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getMult(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[30]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getMult(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[31]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getMult(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[32]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getMult(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[33]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getMult(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[34]);
	}
	
	(
		a2_0 = parse_expArithm_EltExp		{
			if (terminateParsing) {
				throw new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTerminateParsingException();
			}
			if (element == null) {
				element = expArithm.ExpArithmFactory.eINSTANCE.createMult();
				startIncompleteElement(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.MULT__ELT_DROIT), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, expArithm.resource.expArithmtxt.grammar.ExpArithmtxtGrammarInformationProvider.EXPARITHMTXT_3_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[35]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[36]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[37]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[38]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[39]);
	}
	
;

parse_expArithm_Division returns [expArithm.Division element = null]
@init{
}
:
	a0 = '/' {
		if (element == null) {
			element = expArithm.ExpArithmFactory.eINSTANCE.createDivision();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, expArithm.resource.expArithmtxt.grammar.ExpArithmtxtGrammarInformationProvider.EXPARITHMTXT_4_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getDivision(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[40]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getDivision(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[41]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getDivision(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[42]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getDivision(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[43]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getDivision(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[44]);
	}
	
	(
		a1_0 = parse_expArithm_EltExp		{
			if (terminateParsing) {
				throw new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTerminateParsingException();
			}
			if (element == null) {
				element = expArithm.ExpArithmFactory.eINSTANCE.createDivision();
				startIncompleteElement(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.DIVISION__ELT_GAUCHE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, expArithm.resource.expArithmtxt.grammar.ExpArithmtxtGrammarInformationProvider.EXPARITHMTXT_4_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getDivision(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[45]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getDivision(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[46]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getDivision(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[47]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getDivision(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[48]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getDivision(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[49]);
	}
	
	(
		a2_0 = parse_expArithm_EltExp		{
			if (terminateParsing) {
				throw new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTerminateParsingException();
			}
			if (element == null) {
				element = expArithm.ExpArithmFactory.eINSTANCE.createDivision();
				startIncompleteElement(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.DIVISION__ELT_DROIT), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, expArithm.resource.expArithmtxt.grammar.ExpArithmtxtGrammarInformationProvider.EXPARITHMTXT_4_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[50]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[51]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[52]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[53]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[54]);
	}
	
;

parse_expArithm_Moins returns [expArithm.Moins element = null]
@init{
}
:
	a0 = '-' {
		if (element == null) {
			element = expArithm.ExpArithmFactory.eINSTANCE.createMoins();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, expArithm.resource.expArithmtxt.grammar.ExpArithmtxtGrammarInformationProvider.EXPARITHMTXT_5_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getMoins(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[55]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getMoins(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[56]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getMoins(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[57]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getMoins(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[58]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getMoins(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[59]);
	}
	
	(
		a1_0 = parse_expArithm_EltExp		{
			if (terminateParsing) {
				throw new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTerminateParsingException();
			}
			if (element == null) {
				element = expArithm.ExpArithmFactory.eINSTANCE.createMoins();
				startIncompleteElement(element);
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					Object value = a1_0;
					element.eSet(element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.MOINS__ELT_GAUCHE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, expArithm.resource.expArithmtxt.grammar.ExpArithmtxtGrammarInformationProvider.EXPARITHMTXT_5_0_0_1, a1_0, true);
				copyLocalizationInfos(a1_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getMoins(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[60]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getMoins(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[61]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getMoins(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[62]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getMoins(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[63]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getMoins(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[64]);
	}
	
	(
		a2_0 = parse_expArithm_EltExp		{
			if (terminateParsing) {
				throw new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTerminateParsingException();
			}
			if (element == null) {
				element = expArithm.ExpArithmFactory.eINSTANCE.createMoins();
				startIncompleteElement(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.MOINS__ELT_DROIT), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, expArithm.resource.expArithmtxt.grammar.ExpArithmtxtGrammarInformationProvider.EXPARITHMTXT_5_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[65]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[66]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[67]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[68]);
		addExpectedElement(expArithm.ExpArithmPackage.eINSTANCE.getPlus(), expArithm.resource.expArithmtxt.mopp.ExpArithmtxtExpectationConstants.EXPECTATIONS[69]);
	}
	
;

parse_expArithm_EltExp returns [expArithm.EltExp element = null]
:
	c0 = parse_expArithm_Valeur{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_expArithm_Plus{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_expArithm_Mult{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_expArithm_Division{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_expArithm_Moins{ element = c4; /* this is a subclass or primitive expression choice */ }
	
;

VALUE:
	(('0'..'9')+('.'('0'..'9')+)?)
;
LINEBREAK:
	(('\r\n'|'\r'|'\n'))
	{ _channel = 99; }
;
WHITESPACE:
	((' '|'\t'|'\f'))
	{ _channel = 99; }
;

