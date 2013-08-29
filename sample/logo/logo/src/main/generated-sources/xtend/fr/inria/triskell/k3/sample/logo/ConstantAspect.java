package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import fr.inria.triskell.k3.sample.logo.ConstantAspectConstantAspectProperties;
import fr.inria.triskell.k3.sample.logo.Context;
import fr.inria.triskell.k3.sample.logo.ExpressionAspect;
import kmLogo.ASM.Constant;

@Aspect(className = Constant.class)
@SuppressWarnings("all")
public class ConstantAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static int eval(final Constant _self, final Context context) {
    fr.inria.triskell.k3.sample.logo.ConstantAspectConstantAspectContext _instance = fr.inria.triskell.k3.sample.logo.ConstantAspectConstantAspectContext.getInstance();
    						    java.util.Map<Constant,fr.inria.triskell.k3.sample.logo.ConstantAspectConstantAspectProperties> selfProp = _instance.getMap();
        						boolean _containsKey = selfProp.containsKey(_self);
    						    boolean _not = (!_containsKey);
    						    if (_not) {
          						fr.inria.triskell.k3.sample.logo.ConstantAspectConstantAspectProperties prop = new fr.inria.triskell.k3.sample.logo.ConstantAspectConstantAspectProperties();
       						   selfProp.put(_self, prop);
    					    }
    					     _self_ = selfProp.get(_self);
    					        if (_self instanceof kmLogo.ASM.Constant){
    					     									return fr.inria.triskell.k3.sample.logo.ConstantAspect.priveval((kmLogo.ASM.Constant)_self,context);
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
  
  public static ConstantAspectConstantAspectProperties _self_;
  
  private static int super_eval(final Constant _self, final Context context) {
     return  fr.inria.triskell.k3.sample.logo.ExpressionAspect.priveval(_self,context);  
  }
  
  protected static int priveval(final Constant _self, final Context context) {
    return _self.getIntegerValue();
  }
}
