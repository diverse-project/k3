package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.RightAspectRightAspectProperties;
import java.util.Map;
import kmLogo.ASM.Right;

@SuppressWarnings("all")
public class RightAspectRightAspectContext {
  public final static RightAspectRightAspectContext INSTANCE = new RightAspectRightAspectContext();
  
  public static RightAspectRightAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<Right,RightAspectRightAspectProperties> map = new java.util.HashMap<Right, fr.inria.triskell.k3.sample.logo.RightAspectRightAspectProperties>();
  
  public Map<Right,RightAspectRightAspectProperties> getMap() {
    return map;
  }
}
