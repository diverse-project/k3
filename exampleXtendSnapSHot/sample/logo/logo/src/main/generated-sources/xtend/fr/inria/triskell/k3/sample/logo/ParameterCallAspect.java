package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import fr.inria.triskell.k3.sample.logo.Context;
import fr.inria.triskell.k3.sample.logo.ExpressionAspect;
import fr.inria.triskell.k3.sample.logo.ParameterAspect;
import fr.inria.triskell.k3.sample.logo.ParameterCallAspectParameterCallAspectProperties;
import kmLogo.ASM.Parameter;
import kmLogo.ASM.ParameterCall;

@Aspect(className = ParameterCall.class)
@SuppressWarnings("all")
public class ParameterCallAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static int eval(final ParameterCall _self, final Context context) {
    fr.inria.triskell.k3.sample.logo.ParameterCallAspectParameterCallAspectContext _instance = fr.inria.triskell.k3.sample.logo.ParameterCallAspectParameterCallAspectContext.getInstance();
    						    java.util.Map<ParameterCall,fr.inria.triskell.k3.sample.logo.ParameterCallAspectParameterCallAspectProperties> selfProp = _instance.getMap();
        						boolean _containsKey = selfProp.containsKey(_self);
    						    boolean _not = (!_containsKey);
    						    if (_not) {
          						fr.inria.triskell.k3.sample.logo.ParameterCallAspectParameterCallAspectProperties prop = new fr.inria.triskell.k3.sample.logo.ParameterCallAspectParameterCallAspectProperties();
       						   selfProp.put(_self, prop);
    					    }
    					     _self_ = selfProp.get(_self);
    					        if (_self instanceof kmLogo.ASM.ParameterCall){
    					     									return fr.inria.triskell.k3.sample.logo.ParameterCallAspect.priveval((kmLogo.ASM.ParameterCall)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.Expression){
    					     									return fr.inria.triskell.k3.sample.logo.ExpressionAspect.priveval((kmLogo.ASM.Expression)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.Instruction){
    					     									return fr.inria.triskell.k3.sample.logo.InstructionAspect.priveval((kmLogo.ASM.Instruction)_self,context);
    					     									} else 
    					      {
    					           										throw new IllegalArgumentException("Unhandled parameter types: " +
    					     									        java.util.Arrays.<Object>asList(_self).toString());
    					     							    } 
    
  }
  
  public static ParameterCallAspectParameterCallAspectProperties _self_;
  
  private static int super_eval(final ParameterCall _self, final Context context) {
     return  fr.inria.triskell.k3.sample.logo.ExpressionAspect.priveval(_self,context);  
  }
  
  protected static int priveval(final ParameterCall _self, final Context context) {
    Parameter _parameter = _self.getParameter();
    return ParameterAspect.eval(_parameter, context);
  }
}
