package fr.inria.diverse.k3.sle ;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider;

import com.google.inject.Inject;

import fr.inria.diverse.k3.sle.metamodel.k3sle.Element;
import fr.inria.diverse.k3.sle.metamodel.k3sle.MegamodelRoot;
import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel;
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType;
import fr.inria.diverse.k3.sle.metamodel.k3sle.PackageDecl;
import fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation;

class K3SLEQualifiedNameProvider extends XbaseQualifiedNameProvider
{
	@Inject
	private IQualifiedNameConverter qnConverter ;

	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		if (obj instanceof Element) {
			MegamodelRoot root = (MegamodelRoot) obj.eContainer() ;
			PackageDecl pkg = root.getPackage() ;
			//String type = "" ;

			//if (obj instanceof Metamodel) type = "metamodels";
			//else if (obj instanceof ModelType) type = "modeltypes";
			//else if (obj instanceof Transformation) type = "transformations";

			//final String fqn = String.format("%s.%s.%s", pkg.getName(), type, ((Element) obj).getName()) ;
			final String fqn = String.format("%s.%s", pkg.getName(), ((Element) obj).getName()) ;

			if (fqn == null)
				return null ;
			else
				return qnConverter.toQualifiedName(fqn) ;
		} else if (obj instanceof EPackage) {
			return qnConverter.toQualifiedName(((EPackage) obj).getName()) ;
		}

		return super.getFullyQualifiedName(obj) ;
	}
}
