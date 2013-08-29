package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.sample.logo.Context;
import fr.inria.triskell.k3.sample.logo.ParameterAspectParameterAspectProperties;
import java.util.Hashtable;
import kmLogo.ASM.Parameter;

@Aspect(className = Parameter.class)
@SuppressWarnings("all")
public class ParameterAspect {
  public static int eval(final Parameter _self, final Context context) {
    fr.inria.triskell.k3.sample.logo.ParameterAspectParameterAspectContext _instance = fr.inria.triskell.k3.sample.logo.ParameterAspectParameterAspectContext.getInstance();
    						    java.util.Map<Parameter,fr.inria.triskell.k3.sample.logo.ParameterAspectParameterAspectProperties> selfProp = _instance.getMap();
        						boolean _containsKey = selfProp.containsKey(_self);
    						    boolean _not = (!_containsKey);
    						    if (_not) {
          						fr.inria.triskell.k3.sample.logo.ParameterAspectParameterAspectProperties prop = new fr.inria.triskell.k3.sample.logo.ParameterAspectParameterAspectProperties();
       						   selfProp.put(_self, prop);
    					    }
    					     _self_ = selfProp.get(_self);
    					     return priveval(_self,context); 
    
  }
  
  public static ParameterAspectParameterAspectProperties _self_;
  
  protected static int priveval(final Parameter _self, final Context context) {
    Hashtable<String,Integer> _peek = context.peek();
    String _name = _self.getName();
    return (_peek.get(_name)).intValue();
  }
}
