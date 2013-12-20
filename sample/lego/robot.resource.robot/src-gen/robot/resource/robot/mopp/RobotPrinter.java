/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package robot.resource.robot.mopp;

public class RobotPrinter implements robot.resource.robot.IRobotTextPrinter {
	
	protected robot.resource.robot.IRobotTokenResolverFactory tokenResolverFactory = new robot.resource.robot.mopp.RobotTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private robot.resource.robot.IRobotTextResource resource;
	
	private java.util.Map<?, ?> options;
	private String encoding = System.getProperty("file.encoding");
	
	public RobotPrinter(java.io.OutputStream outputStream, robot.resource.robot.IRobotTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected int matchCount(java.util.Map<String, Integer> featureCounter, java.util.Collection<String> needed) {
		int pos = 0;
		int neg = 0;
		
		for (String featureName : featureCounter.keySet()) {
			if (needed.contains(featureName)) {
				int value = featureCounter.get(featureName);
				if (value == 0) {
					neg += 1;
				} else {
					pos += 1;
				}
			}
		}
		return neg > 0 ? -neg : pos;
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.io.PrintWriter out, String globaltab) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof robot.robot.ProgramUnit) {
			print_robot_robot_ProgramUnit((robot.robot.ProgramUnit) element, globaltab, out);
			return;
		}
		if (element instanceof robot.FlotCtrl.AndExp) {
			print_robot_FlotCtrl_AndExp((robot.FlotCtrl.AndExp) element, globaltab, out);
			return;
		}
		if (element instanceof robot.FlotCtrl.NegExp) {
			print_robot_FlotCtrl_NegExp((robot.FlotCtrl.NegExp) element, globaltab, out);
			return;
		}
		if (element instanceof robot.robot.HasTurnedCmd) {
			print_robot_robot_HasTurnedCmd((robot.robot.HasTurnedCmd) element, globaltab, out);
			return;
		}
		if (element instanceof robot.robot.ObstacleCmd) {
			print_robot_robot_ObstacleCmd((robot.robot.ObstacleCmd) element, globaltab, out);
			return;
		}
		if (element instanceof robot.FlotCtrl.WhileLoop) {
			print_robot_FlotCtrl_WhileLoop((robot.FlotCtrl.WhileLoop) element, globaltab, out);
			return;
		}
		if (element instanceof robot.FlotCtrl.IfBlock) {
			print_robot_FlotCtrl_IfBlock((robot.FlotCtrl.IfBlock) element, globaltab, out);
			return;
		}
		if (element instanceof robot.robot.Bip) {
			print_robot_robot_Bip((robot.robot.Bip) element, globaltab, out);
			return;
		}
		if (element instanceof robot.robot.MoveCmd) {
			print_robot_robot_MoveCmd((robot.robot.MoveCmd) element, globaltab, out);
			return;
		}
		if (element instanceof robot.robot.PrintCmd) {
			print_robot_robot_PrintCmd((robot.robot.PrintCmd) element, globaltab, out);
			return;
		}
		if (element instanceof robot.robot.SetTurnAngleCmd) {
			print_robot_robot_SetTurnAngleCmd((robot.robot.SetTurnAngleCmd) element, globaltab, out);
			return;
		}
		if (element instanceof robot.robot.StopEngineCmd) {
			print_robot_robot_StopEngineCmd((robot.robot.StopEngineCmd) element, globaltab, out);
			return;
		}
		if (element instanceof robot.robot.StopProgramCmd) {
			print_robot_robot_StopProgramCmd((robot.robot.StopProgramCmd) element, globaltab, out);
			return;
		}
		if (element instanceof robot.robot.TurnCmd) {
			print_robot_robot_TurnCmd((robot.robot.TurnCmd) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected robot.resource.robot.mopp.RobotReferenceResolverSwitch getReferenceResolverSwitch() {
		return (robot.resource.robot.mopp.RobotReferenceResolverSwitch) new robot.resource.robot.mopp.RobotMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		robot.resource.robot.IRobotTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new robot.resource.robot.mopp.RobotProblem(errorMessage, robot.resource.robot.RobotEProblemType.PRINT_PROBLEM, robot.resource.robot.RobotEProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public void setEncoding(String encoding) {
		if (encoding != null) {
			this.encoding = encoding;
		}
	}
	
	public String getEncoding() {
		return encoding;
	}
	
	public robot.resource.robot.IRobotTextResource getResource() {
		return resource;
	}
	
	/**
	 * Calls {@link #doPrint(EObject, PrintWriter, String)} and writes the result to
	 * the underlying output stream.
	 */
	public void print(org.eclipse.emf.ecore.EObject element) throws java.io.IOException {
		java.io.PrintWriter out = new java.io.PrintWriter(new java.io.OutputStreamWriter(new java.io.BufferedOutputStream(outputStream), encoding));
		doPrint(element, out, "");
		out.flush();
		out.close();
	}
	
	public void print_robot_robot_ProgramUnit(robot.robot.ProgramUnit element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.PROGRAM_UNIT__BLOCK));
		printCountingMap.put("block", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("block");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.PROGRAM_UNIT__BLOCK));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("block", 0);
		}
	}
	
	
	public void print_robot_FlotCtrl_AndExp(robot.FlotCtrl.AndExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(robot.FlotCtrl.FlotCtrlPackage.AND_EXP__LEFT_EXP));
		printCountingMap.put("leftExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(robot.FlotCtrl.FlotCtrlPackage.AND_EXP__RIGHT_EXP));
		printCountingMap.put("rightExp", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("leftExp");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(robot.FlotCtrl.FlotCtrlPackage.AND_EXP__LEFT_EXP));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("leftExp", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("and");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("rightExp");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(robot.FlotCtrl.FlotCtrlPackage.AND_EXP__RIGHT_EXP));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("rightExp", count - 1);
		}
	}
	
	
	public void print_robot_FlotCtrl_NegExp(robot.FlotCtrl.NegExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(robot.FlotCtrl.FlotCtrlPackage.NEG_EXP__EXP));
		printCountingMap.put("exp", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("not");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("exp");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(robot.FlotCtrl.FlotCtrlPackage.NEG_EXP__EXP));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("exp", count - 1);
		}
	}
	
	
	public void print_robot_robot_HasTurnedCmd(robot.robot.HasTurnedCmd element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.HAS_TURNED_CMD__ANGLE));
		printCountingMap.put("angle", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("hasTurned");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("angle");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("angle");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.HAS_TURNED_CMD__ANGLE));
			if (o != null) {
				robot.resource.robot.IRobotTokenResolver resolver = tokenResolverFactory.createTokenResolver("INT_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(robot.robot.RobotPackage.HAS_TURNED_CMD__ANGLE), element));
				out.print(" ");
			}
			printCountingMap.put("angle", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_robot_robot_ObstacleCmd(robot.robot.ObstacleCmd element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.OBSTACLE_CMD__DISTANCE));
		printCountingMap.put("distance", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("obstacle");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("distance");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("distance");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.OBSTACLE_CMD__DISTANCE));
			if (o != null) {
				robot.resource.robot.IRobotTokenResolver resolver = tokenResolverFactory.createTokenResolver("INT_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(robot.robot.RobotPackage.OBSTACLE_CMD__DISTANCE), element));
				out.print(" ");
			}
			printCountingMap.put("distance", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_robot_FlotCtrl_WhileLoop(robot.FlotCtrl.WhileLoop element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(robot.FlotCtrl.FlotCtrlPackage.WHILE_LOOP__LOOP_COND));
		printCountingMap.put("loopCond", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(robot.FlotCtrl.FlotCtrlPackage.WHILE_LOOP__BLOCK));
		printCountingMap.put("block", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("while");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("loopCond");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(robot.FlotCtrl.FlotCtrlPackage.WHILE_LOOP__LOOP_COND));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("loopCond", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("do");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("block");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(robot.FlotCtrl.FlotCtrlPackage.WHILE_LOOP__BLOCK));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("block", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("end");
		out.print(" ");
	}
	
	
	public void print_robot_FlotCtrl_IfBlock(robot.FlotCtrl.IfBlock element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(robot.FlotCtrl.FlotCtrlPackage.IF_BLOCK__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(robot.FlotCtrl.FlotCtrlPackage.IF_BLOCK__THEN_BLOCK));
		printCountingMap.put("thenBlock", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(robot.FlotCtrl.FlotCtrlPackage.IF_BLOCK__ELSE_BLOCK));
		printCountingMap.put("elseBlock", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("if");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(robot.FlotCtrl.FlotCtrlPackage.IF_BLOCK__CONDITION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("then");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("thenBlock");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(robot.FlotCtrl.FlotCtrlPackage.IF_BLOCK__THEN_BLOCK));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("thenBlock", 0);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_robot_FlotCtrl_IfBlock_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("end");
		out.print(" ");
	}
	
	public void print_robot_FlotCtrl_IfBlock_0(robot.FlotCtrl.IfBlock element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("else");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elseBlock");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(robot.FlotCtrl.FlotCtrlPackage.IF_BLOCK__ELSE_BLOCK));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elseBlock", 0);
		}
	}
	
	
	public void print_robot_robot_Bip(robot.robot.Bip element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.BIP__DURATION));
		printCountingMap.put("duration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.BIP__POWER));
		printCountingMap.put("power", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.BIP__REPET));
		printCountingMap.put("repet", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("bip");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("duration");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("duration");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.BIP__DURATION));
			if (o != null) {
				robot.resource.robot.IRobotTokenResolver resolver = tokenResolverFactory.createTokenResolver("INT_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(robot.robot.RobotPackage.BIP__DURATION), element));
				out.print(" ");
			}
			printCountingMap.put("duration", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("power");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("power");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.BIP__POWER));
			if (o != null) {
				robot.resource.robot.IRobotTokenResolver resolver = tokenResolverFactory.createTokenResolver("INT_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(robot.robot.RobotPackage.BIP__POWER), element));
				out.print(" ");
			}
			printCountingMap.put("power", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("repeat");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("repet");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.BIP__REPET));
			if (o != null) {
				robot.resource.robot.IRobotTokenResolver resolver = tokenResolverFactory.createTokenResolver("BOOLEAN_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(robot.robot.RobotPackage.BIP__REPET), element));
				out.print(" ");
			}
			printCountingMap.put("repet", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_robot_robot_MoveCmd(robot.robot.MoveCmd element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.MOVE_CMD__POWER));
		printCountingMap.put("power", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("move");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("power");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("power");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.MOVE_CMD__POWER));
			if (o != null) {
				robot.resource.robot.IRobotTokenResolver resolver = tokenResolverFactory.createTokenResolver("INT_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(robot.robot.RobotPackage.MOVE_CMD__POWER), element));
				out.print(" ");
			}
			printCountingMap.put("power", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_robot_robot_PrintCmd(robot.robot.PrintCmd element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.PRINT_CMD__MSG));
		printCountingMap.put("msg", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.PRINT_CMD__DURATION));
		printCountingMap.put("duration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.PRINT_CMD__LINE));
		printCountingMap.put("line", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.PRINT_CMD__COL));
		printCountingMap.put("col", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("display");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("msg");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("msg");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.PRINT_CMD__MSG));
			if (o != null) {
				robot.resource.robot.IRobotTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRING_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(robot.robot.RobotPackage.PRINT_CMD__MSG), element));
				out.print(" ");
			}
			printCountingMap.put("msg", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("duration");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("duration");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.PRINT_CMD__DURATION));
			if (o != null) {
				robot.resource.robot.IRobotTokenResolver resolver = tokenResolverFactory.createTokenResolver("INT_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(robot.robot.RobotPackage.PRINT_CMD__DURATION), element));
				out.print(" ");
			}
			printCountingMap.put("duration", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("line");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("line");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.PRINT_CMD__LINE));
			if (o != null) {
				robot.resource.robot.IRobotTokenResolver resolver = tokenResolverFactory.createTokenResolver("INT_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(robot.robot.RobotPackage.PRINT_CMD__LINE), element));
				out.print(" ");
			}
			printCountingMap.put("line", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("col");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("col");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.PRINT_CMD__COL));
			if (o != null) {
				robot.resource.robot.IRobotTokenResolver resolver = tokenResolverFactory.createTokenResolver("INT_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(robot.robot.RobotPackage.PRINT_CMD__COL), element));
				out.print(" ");
			}
			printCountingMap.put("col", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_robot_robot_SetTurnAngleCmd(robot.robot.SetTurnAngleCmd element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.SET_TURN_ANGLE_CMD__ANGLE));
		printCountingMap.put("angle", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("setTurnAngle");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("angle");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("angle");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.SET_TURN_ANGLE_CMD__ANGLE));
			if (o != null) {
				robot.resource.robot.IRobotTokenResolver resolver = tokenResolverFactory.createTokenResolver("INT_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(robot.robot.RobotPackage.SET_TURN_ANGLE_CMD__ANGLE), element));
				out.print(" ");
			}
			printCountingMap.put("angle", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_robot_robot_StopEngineCmd(robot.robot.StopEngineCmd element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("stopEngine");
		out.print(" ");
	}
	
	
	public void print_robot_robot_StopProgramCmd(robot.robot.StopProgramCmd element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("stopProgram");
		out.print(" ");
	}
	
	
	public void print_robot_robot_TurnCmd(robot.robot.TurnCmd element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.TURN_CMD__POWER));
		printCountingMap.put("power", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.TURN_CMD__ANGLE));
		printCountingMap.put("angle", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("turn");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("power");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("power");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.TURN_CMD__POWER));
			if (o != null) {
				robot.resource.robot.IRobotTokenResolver resolver = tokenResolverFactory.createTokenResolver("INT_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(robot.robot.RobotPackage.TURN_CMD__POWER), element));
				out.print(" ");
			}
			printCountingMap.put("power", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("angle");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("angle");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(robot.robot.RobotPackage.TURN_CMD__ANGLE));
			if (o != null) {
				robot.resource.robot.IRobotTokenResolver resolver = tokenResolverFactory.createTokenResolver("INT_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(robot.robot.RobotPackage.TURN_CMD__ANGLE), element));
				out.print(" ");
			}
			printCountingMap.put("angle", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
}
