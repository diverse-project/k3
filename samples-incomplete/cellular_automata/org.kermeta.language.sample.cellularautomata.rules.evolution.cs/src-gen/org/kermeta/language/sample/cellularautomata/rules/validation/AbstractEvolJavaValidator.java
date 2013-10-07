package org.kermeta.language.sample.cellularautomata.rules.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.kermeta.language.sample.cellularautomata.rules.validation.CoreJavaValidator;

public class AbstractEvolJavaValidator extends CoreJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://rules/evol/1.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://rules/core/1.0"));
		return result;
	}

}
