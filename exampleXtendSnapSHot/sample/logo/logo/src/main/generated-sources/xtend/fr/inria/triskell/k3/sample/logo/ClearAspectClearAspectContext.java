package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.ClearAspectClearAspectProperties;
import java.util.Map;
import kmLogo.ASM.Clear;

@SuppressWarnings("all")
public class ClearAspectClearAspectContext {
  public final static ClearAspectClearAspectContext INSTANCE = new ClearAspectClearAspectContext();
  
  public static ClearAspectClearAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<Clear,ClearAspectClearAspectProperties> map = new java.util.HashMap<Clear, fr.inria.triskell.k3.sample.logo.ClearAspectClearAspectProperties>();
  
  public Map<Clear,ClearAspectClearAspectProperties> getMap() {
    return map;
  }
}
