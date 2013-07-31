package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.MinusAspectMinusAspectProperties;
import java.util.Map;
import kmLogo.ASM.Minus;

@SuppressWarnings("all")
public class MinusAspectMinusAspectContext {
  public final static MinusAspectMinusAspectContext INSTANCE = new MinusAspectMinusAspectContext();
  
  public static MinusAspectMinusAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<Minus,MinusAspectMinusAspectProperties> map = new java.util.HashMap<Minus, fr.inria.triskell.k3.sample.logo.MinusAspectMinusAspectProperties>();
  
  public Map<Minus,MinusAspectMinusAspectProperties> getMap() {
    return map;
  }
}
