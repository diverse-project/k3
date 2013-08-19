package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.PenUpAspectPenUpAspectProperties;
import java.util.Map;
import kmLogo.ASM.PenUp;

@SuppressWarnings("all")
public class PenUpAspectPenUpAspectContext {
  public final static PenUpAspectPenUpAspectContext INSTANCE = new PenUpAspectPenUpAspectContext();
  
  public static PenUpAspectPenUpAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<PenUp,PenUpAspectPenUpAspectProperties> map = new java.util.HashMap<PenUp, fr.inria.triskell.k3.sample.logo.PenUpAspectPenUpAspectProperties>();
  
  public Map<PenUp,PenUpAspectPenUpAspectProperties> getMap() {
    return map;
  }
}
