package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.DivAspectDivAspectProperties;
import java.util.Map;
import kmLogo.ASM.Div;

@SuppressWarnings("all")
public class DivAspectDivAspectContext {
  public final static DivAspectDivAspectContext INSTANCE = new DivAspectDivAspectContext();
  
  public static DivAspectDivAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<Div,DivAspectDivAspectProperties> map = new java.util.HashMap<Div, fr.inria.triskell.k3.sample.logo.DivAspectDivAspectProperties>();
  
  public Map<Div,DivAspectDivAspectProperties> getMap() {
    return map;
  }
}
