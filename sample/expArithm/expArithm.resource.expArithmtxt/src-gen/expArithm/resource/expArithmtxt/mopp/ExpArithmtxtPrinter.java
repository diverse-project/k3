/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.mopp;

public class ExpArithmtxtPrinter implements expArithm.resource.expArithmtxt.IExpArithmtxtTextPrinter {
	
	protected expArithm.resource.expArithmtxt.IExpArithmtxtTokenResolverFactory tokenResolverFactory = new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private expArithm.resource.expArithmtxt.IExpArithmtxtTextResource resource;
	
	private java.util.Map<?, ?> options;
	private String encoding = System.getProperty("file.encoding");
	
	public ExpArithmtxtPrinter(java.io.OutputStream outputStream, expArithm.resource.expArithmtxt.IExpArithmtxtTextResource resource) {
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
		
		if (element instanceof expArithm.ExpressionArithm) {
			print_expArithm_ExpressionArithm((expArithm.ExpressionArithm) element, globaltab, out);
			return;
		}
		if (element instanceof expArithm.Valeur) {
			print_expArithm_Valeur((expArithm.Valeur) element, globaltab, out);
			return;
		}
		if (element instanceof expArithm.Plus) {
			print_expArithm_Plus((expArithm.Plus) element, globaltab, out);
			return;
		}
		if (element instanceof expArithm.Mult) {
			print_expArithm_Mult((expArithm.Mult) element, globaltab, out);
			return;
		}
		if (element instanceof expArithm.Division) {
			print_expArithm_Division((expArithm.Division) element, globaltab, out);
			return;
		}
		if (element instanceof expArithm.Moins) {
			print_expArithm_Moins((expArithm.Moins) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected expArithm.resource.expArithmtxt.mopp.ExpArithmtxtReferenceResolverSwitch getReferenceResolverSwitch() {
		return (expArithm.resource.expArithmtxt.mopp.ExpArithmtxtReferenceResolverSwitch) new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		expArithm.resource.expArithmtxt.IExpArithmtxtTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new expArithm.resource.expArithmtxt.mopp.ExpArithmtxtProblem(errorMessage, expArithm.resource.expArithmtxt.ExpArithmtxtEProblemType.PRINT_PROBLEM, expArithm.resource.expArithmtxt.ExpArithmtxtEProblemSeverity.WARNING), cause);
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
	
	public expArithm.resource.expArithmtxt.IExpArithmtxtTextResource getResource() {
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
	
	public void print_expArithm_ExpressionArithm(expArithm.ExpressionArithm element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.EXPRESSION_ARITHM__RACINE));
		printCountingMap.put("racine", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("racine");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.EXPRESSION_ARITHM__RACINE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("racine", count - 1);
		}
	}
	
	
	public void print_expArithm_Valeur(expArithm.Valeur element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.VALEUR__VALEUR));
		printCountingMap.put("valeur", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("valeur");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.VALEUR__VALEUR));
			if (o != null) {
				expArithm.resource.expArithmtxt.IExpArithmtxtTokenResolver resolver = tokenResolverFactory.createTokenResolver("VALUE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.VALEUR__VALEUR), element));
				out.print(" ");
			}
			printCountingMap.put("valeur", count - 1);
		}
	}
	
	
	public void print_expArithm_Plus(expArithm.Plus element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.PLUS__ELT_GAUCHE));
		printCountingMap.put("EltGauche", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.PLUS__ELT_DROIT));
		printCountingMap.put("eltDroit", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("+");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("EltGauche");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.PLUS__ELT_GAUCHE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("EltGauche", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("eltDroit");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.PLUS__ELT_DROIT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("eltDroit", count - 1);
		}
	}
	
	
	public void print_expArithm_Mult(expArithm.Mult element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.MULT__ELT_GAUCHE));
		printCountingMap.put("EltGauche", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.MULT__ELT_DROIT));
		printCountingMap.put("eltDroit", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("*");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("EltGauche");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.MULT__ELT_GAUCHE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("EltGauche", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("eltDroit");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.MULT__ELT_DROIT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("eltDroit", count - 1);
		}
	}
	
	
	public void print_expArithm_Division(expArithm.Division element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.DIVISION__ELT_GAUCHE));
		printCountingMap.put("EltGauche", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.DIVISION__ELT_DROIT));
		printCountingMap.put("eltDroit", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("/");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("EltGauche");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.DIVISION__ELT_GAUCHE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("EltGauche", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("eltDroit");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.DIVISION__ELT_DROIT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("eltDroit", count - 1);
		}
	}
	
	
	public void print_expArithm_Moins(expArithm.Moins element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.MOINS__ELT_GAUCHE));
		printCountingMap.put("EltGauche", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.MOINS__ELT_DROIT));
		printCountingMap.put("eltDroit", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("-");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("EltGauche");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.MOINS__ELT_GAUCHE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("EltGauche", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("eltDroit");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(expArithm.ExpArithmPackage.MOINS__ELT_DROIT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("eltDroit", count - 1);
		}
	}
	
	
}
