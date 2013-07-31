package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.ConstantAspectConstantAspectProperties;
import java.util.Map;
import kmLogo.ASM.Constant;

@SuppressWarnings("all")
public class ConstantAspectConstantAspectContext {
  public final static ConstantAspectConstantAspectContext INSTANCE = new ConstantAspectConstantAspectContext();
  
  public static ConstantAspectConstantAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<Constant,ConstantAspectConstantAspectProperties> map = new java.util.HashMap<Constant, fr.inria.triskell.k3.sample.logo.ConstantAspectConstantAspectProperties>();
  
  public Map<Constant,ConstantAspectConstantAspectProperties> getMap() {
    return map;
  }
}
