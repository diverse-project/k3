package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.BackAspectBackAspectProperties;
import java.util.Map;
import kmLogo.ASM.Back;

@SuppressWarnings("all")
public class BackAspectBackAspectContext {
  public final static BackAspectBackAspectContext INSTANCE = new BackAspectBackAspectContext();
  
  public static BackAspectBackAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<Back,BackAspectBackAspectProperties> map = new java.util.HashMap<Back, fr.inria.triskell.k3.sample.logo.BackAspectBackAspectProperties>();
  
  public Map<Back,BackAspectBackAspectProperties> getMap() {
    return map;
  }
}
