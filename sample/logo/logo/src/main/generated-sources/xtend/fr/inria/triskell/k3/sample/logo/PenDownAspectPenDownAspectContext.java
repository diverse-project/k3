package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.PenDownAspectPenDownAspectProperties;
import java.util.Map;
import kmLogo.ASM.PenDown;

@SuppressWarnings("all")
public class PenDownAspectPenDownAspectContext {
  public final static PenDownAspectPenDownAspectContext INSTANCE = new PenDownAspectPenDownAspectContext();
  
  public static PenDownAspectPenDownAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<PenDown,PenDownAspectPenDownAspectProperties> map = new java.util.HashMap<PenDown, fr.inria.triskell.k3.sample.logo.PenDownAspectPenDownAspectProperties>();
  
  public Map<PenDown,PenDownAspectPenDownAspectProperties> getMap() {
    return map;
  }
}
