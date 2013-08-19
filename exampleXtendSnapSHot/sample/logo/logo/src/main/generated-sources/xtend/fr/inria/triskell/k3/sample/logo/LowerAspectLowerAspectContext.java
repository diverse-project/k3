package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.LowerAspectLowerAspectProperties;
import java.util.Map;
import kmLogo.ASM.Lower;

@SuppressWarnings("all")
public class LowerAspectLowerAspectContext {
  public final static LowerAspectLowerAspectContext INSTANCE = new LowerAspectLowerAspectContext();
  
  public static LowerAspectLowerAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<Lower,LowerAspectLowerAspectProperties> map = new java.util.HashMap<Lower, fr.inria.triskell.k3.sample.logo.LowerAspectLowerAspectProperties>();
  
  public Map<Lower,LowerAspectLowerAspectProperties> getMap() {
    return map;
  }
}
