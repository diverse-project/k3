package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.WhileAspectWhileAspectProperties;
import java.util.Map;
import kmLogo.ASM.While;

@SuppressWarnings("all")
public class WhileAspectWhileAspectContext {
  public final static WhileAspectWhileAspectContext INSTANCE = new WhileAspectWhileAspectContext();
  
  public static WhileAspectWhileAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<While,WhileAspectWhileAspectProperties> map = new java.util.HashMap<While, fr.inria.triskell.k3.sample.logo.WhileAspectWhileAspectProperties>();
  
  public Map<While,WhileAspectWhileAspectProperties> getMap() {
    return map;
  }
}
