package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import fr.inria.triskell.k3.sample.logo.BinaryExpAspect;
import fr.inria.triskell.k3.sample.logo.Context;
import fr.inria.triskell.k3.sample.logo.ExpressionAspect;
import fr.inria.triskell.k3.sample.logo.MinusAspectMinusAspectProperties;
import kmLogo.ASM.Expression;
import kmLogo.ASM.Minus;

@Aspect(className = Minus.class)
@SuppressWarnings("all")
public class MinusAspect extends BinaryExpAspect {
  @OverrideAspectMethod
  public static int eval(final Minus _self, final Context context) {
    fr.inria.triskell.k3.sample.logo.MinusAspectMinusAspectContext _instance = fr.inria.triskell.k3.sample.logo.MinusAspectMinusAspectContext.getInstance();
    						    java.util.Map<Minus,fr.inria.triskell.k3.sample.logo.MinusAspectMinusAspectProperties> selfProp = _instance.getMap();
        						boolean _containsKey = selfProp.containsKey(_self);
    						    boolean _not = (!_containsKey);
    						    if (_not) {
          						fr.inria.triskell.k3.sample.logo.MinusAspectMinusAspectProperties prop = new fr.inria.triskell.k3.sample.logo.MinusAspectMinusAspectProperties();
       						   selfProp.put(_self, prop);
    					    }
    					     _self_ = selfProp.get(_self);
    					        if (_self instanceof kmLogo.ASM.Minus){
    					     									return fr.inria.triskell.k3.sample.logo.MinusAspect.priveval((kmLogo.ASM.Minus)_self,context);
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
  
  public static MinusAspectMinusAspectProperties _self_;
  
  private static int super_eval(final Minus _self, final Context context) {
     return  fr.inria.triskell.k3.sample.logo.BinaryExpAspect.priveval(_self,context);  
  }
  
  protected static int priveval(final Minus _self, final Context context) {
    Expression _lhs = _self.getLhs();
    int _eval = ExpressionAspect.eval(_lhs, context);
    Expression _rhs = _self.getRhs();
    int _eval_1 = ExpressionAspect.eval(_rhs, context);
    return (_eval - _eval_1);
  }
}
