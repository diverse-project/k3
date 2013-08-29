package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import fr.inria.triskell.k3.sample.logo.BinaryExpAspect;
import fr.inria.triskell.k3.sample.logo.Context;
import fr.inria.triskell.k3.sample.logo.ExpressionAspect;
import fr.inria.triskell.k3.sample.logo.PlusAspectPlusAspectProperties;
import kmLogo.ASM.Expression;
import kmLogo.ASM.Plus;

@Aspect(className = Plus.class)
@SuppressWarnings("all")
public class PlusAspect extends BinaryExpAspect {
  @OverrideAspectMethod
  public static int eval(final Plus _self, final Context context) {
    fr.inria.triskell.k3.sample.logo.PlusAspectPlusAspectContext _instance = fr.inria.triskell.k3.sample.logo.PlusAspectPlusAspectContext.getInstance();
    						    java.util.Map<Plus,fr.inria.triskell.k3.sample.logo.PlusAspectPlusAspectProperties> selfProp = _instance.getMap();
        						boolean _containsKey = selfProp.containsKey(_self);
    						    boolean _not = (!_containsKey);
    						    if (_not) {
          						fr.inria.triskell.k3.sample.logo.PlusAspectPlusAspectProperties prop = new fr.inria.triskell.k3.sample.logo.PlusAspectPlusAspectProperties();
       						   selfProp.put(_self, prop);
    					    }
    					     _self_ = selfProp.get(_self);
    					        if (_self instanceof kmLogo.ASM.Plus){
    					     									return fr.inria.triskell.k3.sample.logo.PlusAspect.priveval((kmLogo.ASM.Plus)_self,context);
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
  
  public static PlusAspectPlusAspectProperties _self_;
  
  private static int super_eval(final Plus _self, final Context context) {
     return  fr.inria.triskell.k3.sample.logo.BinaryExpAspect.priveval(_self,context);  
  }
  
  protected static int priveval(final Plus _self, final Context context) {
    Expression _lhs = _self.getLhs();
    int _eval = ExpressionAspect.eval(_lhs, context);
    Expression _rhs = _self.getRhs();
    int _eval_1 = ExpressionAspect.eval(_rhs, context);
    return (_eval + _eval_1);
  }
}
