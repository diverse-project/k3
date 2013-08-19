package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import fr.inria.triskell.k3.sample.logo.BinaryExpAspect;
import fr.inria.triskell.k3.sample.logo.Context;
import fr.inria.triskell.k3.sample.logo.DivAspectDivAspectProperties;
import fr.inria.triskell.k3.sample.logo.ExpressionAspect;
import kmLogo.ASM.Div;
import kmLogo.ASM.Expression;

@Aspect(className = Div.class)
@SuppressWarnings("all")
public class DivAspect extends BinaryExpAspect {
  @OverrideAspectMethod
  public static int eval(final Div _self, final Context context) {
    fr.inria.triskell.k3.sample.logo.DivAspectDivAspectContext _instance = fr.inria.triskell.k3.sample.logo.DivAspectDivAspectContext.getInstance();
    						    java.util.Map<Div,fr.inria.triskell.k3.sample.logo.DivAspectDivAspectProperties> selfProp = _instance.getMap();
        						boolean _containsKey = selfProp.containsKey(_self);
    						    boolean _not = (!_containsKey);
    						    if (_not) {
          						fr.inria.triskell.k3.sample.logo.DivAspectDivAspectProperties prop = new fr.inria.triskell.k3.sample.logo.DivAspectDivAspectProperties();
       						   selfProp.put(_self, prop);
    					    }
    					     _self_ = selfProp.get(_self);
    					        if (_self instanceof kmLogo.ASM.Div){
    					     									return fr.inria.triskell.k3.sample.logo.DivAspect.priveval((kmLogo.ASM.Div)_self,context);
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
  
  public static DivAspectDivAspectProperties _self_;
  
  private static int super_eval(final Div _self, final Context context) {
     return  fr.inria.triskell.k3.sample.logo.BinaryExpAspect.priveval(_self,context);  
  }
  
  protected static int priveval(final Div _self, final Context context) {
    Expression _rhs = _self.getRhs();
    int _eval = ExpressionAspect.eval(_rhs, context);
    boolean _notEquals = (_eval != 0);
    if (_notEquals) {
      Expression _lhs = _self.getLhs();
      int _eval_1 = ExpressionAspect.eval(_lhs, context);
      Expression _rhs_1 = _self.getRhs();
      int _eval_2 = ExpressionAspect.eval(_rhs_1, context);
      return (_eval_1 / _eval_2);
    } else {
      return 0;
    }
  }
}
