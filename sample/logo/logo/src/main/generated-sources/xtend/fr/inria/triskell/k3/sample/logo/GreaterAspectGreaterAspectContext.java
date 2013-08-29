package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.GreaterAspectGreaterAspectProperties;
import java.util.Map;
import kmLogo.ASM.Greater;

@SuppressWarnings("all")
public class GreaterAspectGreaterAspectContext {
  public final static GreaterAspectGreaterAspectContext INSTANCE = new GreaterAspectGreaterAspectContext();
  
  public static GreaterAspectGreaterAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<Greater,GreaterAspectGreaterAspectProperties> map = new java.util.HashMap<Greater, fr.inria.triskell.k3.sample.logo.GreaterAspectGreaterAspectProperties>();
  
  public Map<Greater,GreaterAspectGreaterAspectProperties> getMap() {
    return map;
  }
}
