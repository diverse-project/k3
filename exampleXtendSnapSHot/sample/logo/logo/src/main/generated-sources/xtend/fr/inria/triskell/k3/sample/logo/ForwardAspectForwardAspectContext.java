package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.ForwardAspectForwardAspectProperties;
import java.util.Map;
import kmLogo.ASM.Forward;

@SuppressWarnings("all")
public class ForwardAspectForwardAspectContext {
  public final static ForwardAspectForwardAspectContext INSTANCE = new ForwardAspectForwardAspectContext();
  
  public static ForwardAspectForwardAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<Forward,ForwardAspectForwardAspectProperties> map = new java.util.HashMap<Forward, fr.inria.triskell.k3.sample.logo.ForwardAspectForwardAspectProperties>();
  
  public Map<Forward,ForwardAspectForwardAspectProperties> getMap() {
    return map;
  }
}
