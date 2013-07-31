package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.PlusAspectPlusAspectProperties;
import java.util.Map;
import kmLogo.ASM.Plus;

@SuppressWarnings("all")
public class PlusAspectPlusAspectContext {
  public final static PlusAspectPlusAspectContext INSTANCE = new PlusAspectPlusAspectContext();
  
  public static PlusAspectPlusAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<Plus,PlusAspectPlusAspectProperties> map = new java.util.HashMap<Plus, fr.inria.triskell.k3.sample.logo.PlusAspectPlusAspectProperties>();
  
  public Map<Plus,PlusAspectPlusAspectProperties> getMap() {
    return map;
  }
}
