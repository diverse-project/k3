package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.BinaryExpAspectBinaryExpAspectProperties;
import java.util.Map;
import kmLogo.ASM.BinaryExp;

@SuppressWarnings("all")
public class BinaryExpAspectBinaryExpAspectContext {
  public final static BinaryExpAspectBinaryExpAspectContext INSTANCE = new BinaryExpAspectBinaryExpAspectContext();
  
  public static BinaryExpAspectBinaryExpAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<BinaryExp,BinaryExpAspectBinaryExpAspectProperties> map = new java.util.HashMap<BinaryExp, fr.inria.triskell.k3.sample.logo.BinaryExpAspectBinaryExpAspectProperties>();
  
  public Map<BinaryExp,BinaryExpAspectBinaryExpAspectProperties> getMap() {
    return map;
  }
}
