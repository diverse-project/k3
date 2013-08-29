package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.EqualsAspectEqualsAspectProperties;
import java.util.Map;
import kmLogo.ASM.Equals;

@SuppressWarnings("all")
public class EqualsAspectEqualsAspectContext {
  public final static EqualsAspectEqualsAspectContext INSTANCE = new EqualsAspectEqualsAspectContext();
  
  public static EqualsAspectEqualsAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<Equals,EqualsAspectEqualsAspectProperties> map = new java.util.HashMap<Equals, fr.inria.triskell.k3.sample.logo.EqualsAspectEqualsAspectProperties>();
  
  public Map<Equals,EqualsAspectEqualsAspectProperties> getMap() {
    return map;
  }
}
