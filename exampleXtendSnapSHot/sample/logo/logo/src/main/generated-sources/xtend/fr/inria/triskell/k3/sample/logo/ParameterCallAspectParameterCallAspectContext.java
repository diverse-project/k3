package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.ParameterCallAspectParameterCallAspectProperties;
import java.util.Map;
import kmLogo.ASM.ParameterCall;

@SuppressWarnings("all")
public class ParameterCallAspectParameterCallAspectContext {
  public final static ParameterCallAspectParameterCallAspectContext INSTANCE = new ParameterCallAspectParameterCallAspectContext();
  
  public static ParameterCallAspectParameterCallAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<ParameterCall,ParameterCallAspectParameterCallAspectProperties> map = new java.util.HashMap<ParameterCall, fr.inria.triskell.k3.sample.logo.ParameterCallAspectParameterCallAspectProperties>();
  
  public Map<ParameterCall,ParameterCallAspectParameterCallAspectProperties> getMap() {
    return map;
  }
}
