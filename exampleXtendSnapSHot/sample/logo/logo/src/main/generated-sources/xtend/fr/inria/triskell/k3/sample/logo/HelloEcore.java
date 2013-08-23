package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.Context;
import fr.inria.triskell.k3.sample.logo.LogoProgramAspect;
import fr.inria.triskell.k3.sample.logo.Window;
import java.util.Map;
import kmLogo.ASM.LogoProgram;
import kmLogo.KmLogoPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class HelloEcore {
  public Window run() {
    Window _xblockexpression = null;
    {
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      XMIResourceFactoryImpl fact = _xMIResourceFactoryImpl;
      boolean _containsKey = Registry.INSTANCE.containsKey(KmLogoPackage.eNS_URI);
      boolean _not = (!_containsKey);
      if (_not) {
        Registry.INSTANCE.put(KmLogoPackage.eNS_URI, KmLogoPackage.eINSTANCE);
      }
      Map<String,Object> _extensionToFactoryMap = org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      _extensionToFactoryMap.put("*", fact);
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      ResourceSetImpl rs = _resourceSetImpl;
      URI uri = URI.createURI("hexa.logoasm");
      Resource res = rs.getResource(uri, true);
      EList<EObject> _contents = res.getContents();
      EObject _get = _contents.get(0);
      LogoProgram prog = ((LogoProgram) _get);
      Context _context = new Context();
      Context context = _context;
      LogoProgramAspect.eval(prog, context);
      Window _window = new Window(context.turtle);
      _xblockexpression = (_window);
    }
    return _xblockexpression;
  }
  
  public static void main(final String[] args) {
    InputOutput.<String>println("Hello Kermeta on top of Xtend!");
    HelloEcore _helloEcore = new HelloEcore();
    _helloEcore.run();
  }
}
