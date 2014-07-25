package fr.inria.diverse.k3.ui.wizards;

import java.util.Iterator;
import java.util.List;

import org.eclipse.xtext.util.Strings;

public class XtendK3CreatorUtil {
	public static String createAspectClassContent(String typeName, String aspectizedClass, String superClass, 
			@SuppressWarnings("rawtypes") List superInterfaces, String indentation, String lineSeparator) {
		StringBuffer sb = new StringBuffer();
		sb.append("import fr.inria.diverse.k3.al.annotationprocessor.Aspect");		
		sb.append(lineSeparator);
		if(!Strings.isEmpty(superClass) && !superClass.equals("java.lang.Object")) {
			sb.append("import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod");		
			sb.append(lineSeparator);
		}
		sb.append(indentation);
		sb.append(lineSeparator);
		sb.append("import ");
		sb.append(aspectizedClass);
		sb.append(lineSeparator);
		sb.append(indentation);
		sb.append(lineSeparator);
		if(!Strings.isEmpty(aspectizedClass) && !aspectizedClass.equals("java.lang.Object")) {
			sb.append("@Aspect(className=");
			sb.append(stripPackage(aspectizedClass));
			sb.append(")");
			sb.append(lineSeparator);
		}
		sb.append("class ");
		sb.append(typeName);
		if(!Strings.isEmpty(superClass) && !superClass.equals("java.lang.Object")) {
			sb.append(" extends ");
			sb.append(stripPackage(superClass));
		}
		@SuppressWarnings("rawtypes")
		Iterator i = superInterfaces.iterator();
		if(i.hasNext()) {
			sb.append(" implements ");
			sb.append(stripPackage(i.next()));
			while (i.hasNext()) {
				sb.append(", ");
				sb.append(stripPackage(i.next()));
			}
		}
		sb.append(" {");
		sb.append(lineSeparator);
		sb.append(indentation);
		sb.append(lineSeparator);
		sb.append("}");
		return sb.toString();
	}
	private static Object stripPackage(Object superType) {
		return superType.toString().replaceAll("^(\\w+\\.)*", "") ;
	}
}
