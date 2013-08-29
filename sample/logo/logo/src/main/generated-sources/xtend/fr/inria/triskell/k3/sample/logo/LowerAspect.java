package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.sample.logo.BinaryExpAspect;
import fr.inria.triskell.k3.sample.logo.Context;
import fr.inria.triskell.k3.sample.logo.ExpressionAspect;
import fr.inria.triskell.k3.sample.logo.LowerAspectLowerAspectProperties;
import kmLogo.ASM.Expression;
import kmLogo.ASM.Lower;

@Aspect(className = Lower.class)
@SuppressWarnings("all")
public class LowerAspect extends BinaryExpAspect {
  public static int eval(final Lower _self, final Context context) {
    fr.inria.triskell.k3.sample.logo.LowerAspectLowerAspectContext _instance = fr.inria.triskell.k3.sample.logo.LowerAspectLowerAspectContext.getInstance();
    						    java.util.Map<Lower,fr.inria.triskell.k3.sample.logo.LowerAspectLowerAspectProperties> selfProp = _instance.getMap();
        						boolean _containsKey = selfProp.containsKey(_self);
    						    boolean _not = (!_containsKey);
    						    if (_not) {
          						fr.inria.triskell.k3.sample.logo.LowerAspectLowerAspectProperties prop = new fr.inria.triskell.k3.sample.logo.LowerAspectLowerAspectProperties();
       						   selfProp.put(_self, prop);
    					    }
    					     _self_ = selfProp.get(_self);
    					        if (_self instanceof kmLogo.ASM.Lower){
    					     									return fr.inria.triskell.k3.sample.logo.LowerAspect.priveval((kmLogo.ASM.Lower)_self,context);
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
  
  public static LowerAspectLowerAspectProperties _self_;
  
  protected static int priveval(final Lower _self, final Context context) {
    Expression _lhs = _self.getLhs();
    int _eval = ExpressionAspect.eval(_lhs, context);
    Expression _rhs = _self.getRhs();
    int _eval_1 = ExpressionAspect.eval(_rhs, context);
    boolean _lessThan = (_eval < _eval_1);
    if (_lessThan) {
      return 1;
    } else {
      return 0;
    }
  }
}
