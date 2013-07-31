package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import fr.inria.triskell.k3.sample.logo.BinaryExpAspect;
import fr.inria.triskell.k3.sample.logo.Context;
import fr.inria.triskell.k3.sample.logo.ExpressionAspect;
import fr.inria.triskell.k3.sample.logo.MultAspectMultAspectProperties;
import kmLogo.ASM.Expression;
import kmLogo.ASM.Mult;

@Aspect(className = Mult.class)
@SuppressWarnings("all")
public class MultAspect extends BinaryExpAspect {
  @OverrideAspectMethod
  public static int eval(final Mult _self, final Context context) {
    fr.inria.triskell.k3.sample.logo.MultAspectMultAspectContext _instance = fr.inria.triskell.k3.sample.logo.MultAspectMultAspectContext.getInstance();
    						    java.util.Map<Mult,fr.inria.triskell.k3.sample.logo.MultAspectMultAspectProperties> selfProp = _instance.getMap();
        						boolean _containsKey = selfProp.containsKey(_self);
    						    boolean _not = (!_containsKey);
    						    if (_not) {
          						fr.inria.triskell.k3.sample.logo.MultAspectMultAspectProperties prop = new fr.inria.triskell.k3.sample.logo.MultAspectMultAspectProperties();
       						   selfProp.put(_self, prop);
    					    }
    					     _self_ = selfProp.get(_self);
    					        if (_self instanceof kmLogo.ASM.Mult){
    					     									return fr.inria.triskell.k3.sample.logo.MultAspect.priveval((kmLogo.ASM.Mult)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.BinaryExp){
    					     									return fr.inria.triskell.k3.sample.logo.BinaryExpAspect.priveval((kmLogo.ASM.BinaryExp)_self,context);
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
  
  public static MultAspectMultAspectProperties _self_;
  
  private static int super_eval(final Mult _self, final Context context) {
     return  fr.inria.triskell.k3.sample.logo.BinaryExpAspect.priveval(_self,context);  
  }
  
  protected static int priveval(final Mult _self, final Context context) {
    Expression _lhs = _self.getLhs();
    int _eval = ExpressionAspect.eval(_lhs, context);
    Expression _rhs = _self.getRhs();
    int _eval_1 = ExpressionAspect.eval(_rhs, context);
    return (_eval * _eval_1);
  }
}
