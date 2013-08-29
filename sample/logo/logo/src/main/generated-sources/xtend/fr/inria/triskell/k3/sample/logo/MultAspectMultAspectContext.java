package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.MultAspectMultAspectProperties;
import java.util.Map;
import kmLogo.ASM.Mult;

@SuppressWarnings("all")
public class MultAspectMultAspectContext {
  public final static MultAspectMultAspectContext INSTANCE = new MultAspectMultAspectContext();
  
  public static MultAspectMultAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<Mult,MultAspectMultAspectProperties> map = new java.util.HashMap<Mult, fr.inria.triskell.k3.sample.logo.MultAspectMultAspectProperties>();
  
  public Map<Mult,MultAspectMultAspectProperties> getMap() {
    return map;
  }
}
