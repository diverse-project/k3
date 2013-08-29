package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import fr.inria.triskell.k3.sample.logo.BinaryExpAspect;
import fr.inria.triskell.k3.sample.logo.Context;
import fr.inria.triskell.k3.sample.logo.EqualsAspectEqualsAspectProperties;
import fr.inria.triskell.k3.sample.logo.ExpressionAspect;
import kmLogo.ASM.Equals;
import kmLogo.ASM.Expression;

@Aspect(className = Equals.class)
@SuppressWarnings("all")
public class EqualsAspect extends BinaryExpAspect {
  @OverrideAspectMethod
  public static int eval(final Equals _self, final Context context) {
    fr.inria.triskell.k3.sample.logo.EqualsAspectEqualsAspectContext _instance = fr.inria.triskell.k3.sample.logo.EqualsAspectEqualsAspectContext.getInstance();
    						    java.util.Map<Equals,fr.inria.triskell.k3.sample.logo.EqualsAspectEqualsAspectProperties> selfProp = _instance.getMap();
        						boolean _containsKey = selfProp.containsKey(_self);
    						    boolean _not = (!_containsKey);
    						    if (_not) {
          						fr.inria.triskell.k3.sample.logo.EqualsAspectEqualsAspectProperties prop = new fr.inria.triskell.k3.sample.logo.EqualsAspectEqualsAspectProperties();
       						   selfProp.put(_self, prop);
    					    }
    					     _self_ = selfProp.get(_self);
    					        if (_self instanceof kmLogo.ASM.Equals){
    					     									return fr.inria.triskell.k3.sample.logo.EqualsAspect.priveval((kmLogo.ASM.Equals)_self,context);
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
  
  public static EqualsAspectEqualsAspectProperties _self_;
  
  private static int super_eval(final Equals _self, final Context context) {
     return  fr.inria.triskell.k3.sample.logo.BinaryExpAspect.priveval(_self,context);  
  }
  
  protected static int priveval(final Equals _self, final Context context) {
    Expression _lhs = _self.getLhs();
    int _eval = ExpressionAspect.eval(_lhs, context);
    Expression _rhs = _self.getRhs();
    int _eval_1 = ExpressionAspect.eval(_rhs, context);
    boolean _equals = (_eval == _eval_1);
    if (_equals) {
      return 1;
    } else {
      return 0;
    }
  }
}
