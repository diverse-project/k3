package fr.inria.diverse.k3.benchVM.synthesis.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.Diagnostician;

import fr.inria.diverse.k3.benchVM.synthesis.generic.common.ModelGeneratorConfiguration;

public class Main {

	/**
	 * @param args
	 */
	
	
	/*public static void main(String[] args) {

		boolean stop = false;
		int i = 0;
		
		ResourceSet resourceSet = new ResourceSetImpl();

		// IEditingDomainProvider s;
		// resourceSet.get

		// Register the default resource factory -- only needed for stand-alone!
		EcoreResourceFactoryImpl fact = new EcoreResourceFactoryImpl();

		UMLResourceFactoryImpl fact1 = new UMLResourceFactoryImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("ecore", fact);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
		.put("uml", fact1);

		// Register the package -- only needed for stand-alone!

		// Get the URI of the model file.
		URI fileURI = URI.createFileURI(new File("my.uml").getAbsolutePath());

		// Demand load the resource for this file.
		Resource resource = resourceSet.createResource(fileURI);

		int width = 4;
		int depth = 4;
		
		while (!stop){
		try {
			i++;
			resource.getContents().add(new Main().generateUMLPackage(width,depth));
			stop = true;
		} catch (InvalidModelExceptionFromDiagronstic e1) {
			//for (Diagnostic d :e1.getDiagnostic().getChildren()){
				//System.err.println(d.getMessage());
				
			//}
			}
		}
		
		
		System.err.println(i);
		try {

			resource.save(Collections.EMPTY_MAP);

			// resource.save(System.out, Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();

		}

	}
	
*/
	
	ModelGenerator modelGenerator = new ModelGenerator();
	public ModelGenerator getModelGenerator() {
		return modelGenerator;
	}

	public EPackage generatePackage(int width,
	int depth) throws InvalidModelExceptionFromDiagronstic{
		
		EcorePackage ecorePackage = EcorePackage.eINSTANCE;

		// Print the contents of the resource to System.out.

		
		String modelKey = "http://www.eclipse.org/emf/2002/Ecore";
		
		EObject root = ecorePackage.getEClassifier("EPackage");
		ModelGeneratorConfiguration config = new ModelGeneratorConfiguration(
				ecorePackage, root, width, depth);

		config.getEClassesToIgnore().add(ecorePackage.getEAnnotation());
		config.getEClassesToIgnore().add(ecorePackage.getETypeParameter());
		config.getEClassesToIgnore().add(ecorePackage.getEGenericType());

		EObject result = modelGenerator.generateModel(config);
		

		Map<EClass, List<EObject>> list = modelGenerator.modelGeneratorHelper.modelGeneratorUtil
				.getAllClassesAndObjects(result);

		
		List<ETypedElement> toCheck = new ArrayList<ETypedElement>();

		if (list.get(ecorePackage.getEOperation()) != null)
			toCheck.addAll((Collection<? extends ETypedElement>) list
					.get(ecorePackage.getEOperation()));
		if (list.get(ecorePackage.getEParameter()) != null)
			toCheck.addAll((Collection<? extends ETypedElement>) list
					.get(ecorePackage.getEParameter()));
		if (list.get(ecorePackage.getEAttribute()) != null)
			toCheck.addAll((Collection<? extends ETypedElement>) list
					.get(ecorePackage.getEAttribute()));
		if (list.get(ecorePackage.getEReference()) != null)
			toCheck.addAll((Collection<? extends ETypedElement>) list
					.get(ecorePackage.getEReference()));
		
		for (ETypedElement e : toCheck){
			if (e.getLowerBound() > e.getUpperBound() )
			{
				int old = e.getLowerBound() ;
				e.setLowerBound(e.getUpperBound());
				e.setUpperBound(old);
			}
		}

		List<EObject> toCheck1 = list.get(ecorePackage.getEClass());
		if (toCheck1!=null){
			for (EObject e : toCheck1){
				if (((EClass)e).isInterface())
					((EClass)e).setAbstract(true);
				
			}
		}
		Diagnostic c = Diagnostician.INSTANCE.validate(result);
		if (c.getChildren().size()>0){
			throw new InvalidModelExceptionFromDiagronstic(c);
		}
		else return (EPackage) result;

		
		
	}
	
	/*public  org.eclipse.uml2.uml.Package generateUMLPackage(int width,
	int depth) throws InvalidModelExceptionFromDiagronstic{
		
		UMLPackage umlPackage = UMLPackage.eINSTANCE;

		
		// Print the contents of the resource to System.out.

		
			//String modelKey = "http://www.eclipse.org/emf/2002/Ecore";
			
			//Model
			EObject root = umlPackage.getEClassifier("Package");
			
			
			
			ModelGeneratorConfiguration config = new ModelGeneratorConfiguration(
					umlPackage, root, width, depth);
	
			//config.getEClassesToIgnore().add(umlPackage.getEAnnotation());
			//config.getEClassesToIgnore().add(umlPackage.getETypeParameter());
			//config.getEClassesToIgnore().add(umlPackage.getEGenericType());
	
			
			
			config.getEClassesToIgnore().add(umlPackage.getComment());
			config.getEClassesToIgnore().add(umlPackage.getPackageMerge());
			config.getEClassesToIgnore().add(umlPackage.getPackageImport());
			
			
			EObject result =null;
			try{
			 result = modelGenerator.generateModel(config);
			}catch(java.lang.Exception e ){
				throw new InvalidModelExceptionFromDiagronstic(null);
			}
	
			//Map<EClass, List<EObject>> list = ModelGeneratorUtil
			//		.getAllClassesAndObjects(result);
	
			
		
		Diagnostic c = Diagnostician.INSTANCE.validate(result);
		if (c.getChildren().size()>0){
			throw new InvalidModelExceptionFromDiagronstic(c);
		}
		else return (org.eclipse.uml2.uml.Package ) result;

		
		
	}*/

}
