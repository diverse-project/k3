package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.LeftAspectLeftAspectProperties;
import java.util.Map;
import kmLogo.ASM.Left;

@SuppressWarnings("all")
public class LeftAspectLeftAspectContext {
  public final static LeftAspectLeftAspectContext INSTANCE = new LeftAspectLeftAspectContext();
  
  public static LeftAspectLeftAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<Left,LeftAspectLeftAspectProperties> map = new java.util.HashMap<Left, fr.inria.triskell.k3.sample.logo.LeftAspectLeftAspectProperties>();
  
  public Map<Left,LeftAspectLeftAspectProperties> getMap() {
    return map;
  }
}
