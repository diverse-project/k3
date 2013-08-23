package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.IfAspectIfAspectProperties;
import java.util.Map;
import kmLogo.ASM.If;

@SuppressWarnings("all")
public class IfAspectIfAspectContext {
  public final static IfAspectIfAspectContext INSTANCE = new IfAspectIfAspectContext();
  
  public static IfAspectIfAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<If,IfAspectIfAspectProperties> map = new java.util.HashMap<If, fr.inria.triskell.k3.sample.logo.IfAspectIfAspectProperties>();
  
  public Map<If,IfAspectIfAspectProperties> getMap() {
    return map;
  }
}
