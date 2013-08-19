package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.ParameterAspectParameterAspectProperties;
import java.util.Map;
import kmLogo.ASM.Parameter;

@SuppressWarnings("all")
public class ParameterAspectParameterAspectContext {
  public final static ParameterAspectParameterAspectContext INSTANCE = new ParameterAspectParameterAspectContext();
  
  public static ParameterAspectParameterAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<Parameter,ParameterAspectParameterAspectProperties> map = new java.util.HashMap<Parameter, fr.inria.triskell.k3.sample.logo.ParameterAspectParameterAspectProperties>();
  
  public Map<Parameter,ParameterAspectParameterAspectProperties> getMap() {
    return map;
  }
}
