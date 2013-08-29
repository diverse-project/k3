package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.PrimitiveAspectPrimitiveAspectProperties;
import java.util.Map;
import kmLogo.ASM.Primitive;

@SuppressWarnings("all")
public class PrimitiveAspectPrimitiveAspectContext {
  public final static PrimitiveAspectPrimitiveAspectContext INSTANCE = new PrimitiveAspectPrimitiveAspectContext();
  
  public static PrimitiveAspectPrimitiveAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<Primitive,PrimitiveAspectPrimitiveAspectProperties> map = new java.util.HashMap<Primitive, fr.inria.triskell.k3.sample.logo.PrimitiveAspectPrimitiveAspectProperties>();
  
  public Map<Primitive,PrimitiveAspectPrimitiveAspectProperties> getMap() {
    return map;
  }
}
