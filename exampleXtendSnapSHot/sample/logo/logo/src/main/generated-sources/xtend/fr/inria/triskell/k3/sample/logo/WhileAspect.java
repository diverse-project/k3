package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import fr.inria.triskell.k3.sample.logo.BlockAspect;
import fr.inria.triskell.k3.sample.logo.Context;
import fr.inria.triskell.k3.sample.logo.ControlStructureAspect;
import fr.inria.triskell.k3.sample.logo.ExpressionAspect;
import fr.inria.triskell.k3.sample.logo.WhileAspectWhileAspectProperties;
import kmLogo.ASM.Block;
import kmLogo.ASM.Expression;
import kmLogo.ASM.While;

@Aspect(className = While.class)
@SuppressWarnings("all")
public class WhileAspect extends ControlStructureAspect {
  @OverrideAspectMethod
  public static int eval(final While _self, final Context context) {
    fr.inria.triskell.k3.sample.logo.WhileAspectWhileAspectContext _instance = fr.inria.triskell.k3.sample.logo.WhileAspectWhileAspectContext.getInstance();
    						    java.util.Map<While,fr.inria.triskell.k3.sample.logo.WhileAspectWhileAspectProperties> selfProp = _instance.getMap();
        						boolean _containsKey = selfProp.containsKey(_self);
    						    boolean _not = (!_containsKey);
    						    if (_not) {
          						fr.inria.triskell.k3.sample.logo.WhileAspectWhileAspectProperties prop = new fr.inria.triskell.k3.sample.logo.WhileAspectWhileAspectProperties();
       						   selfProp.put(_self, prop);
    					    }
    					     _self_ = selfProp.get(_self);
    					        if (_self instanceof kmLogo.ASM.While){
    					     									return fr.inria.triskell.k3.sample.logo.WhileAspect.priveval((kmLogo.ASM.While)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.Repeat){
    					     									return fr.inria.triskell.k3.sample.logo.RepeatAspect.priveval((kmLogo.ASM.Repeat)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.If){
    					     									return fr.inria.triskell.k3.sample.logo.IfAspect.priveval((kmLogo.ASM.If)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.ControlStructure){
    					     									return fr.inria.triskell.k3.sample.logo.ControlStructureAspect.priveval((kmLogo.ASM.ControlStructure)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.Instruction){
    					     									return fr.inria.triskell.k3.sample.logo.InstructionAspect.priveval((kmLogo.ASM.Instruction)_self,context);
    					     									} else 
    					      {
    					           										throw new IllegalArgumentException("Unhandled parameter types: " +
    					     									        java.util.Arrays.<Object>asList(_self).toString());
    					     							    } 
    
  }
  
  public static WhileAspectWhileAspectProperties _self_;
  
  private static int super_eval(final While _self, final Context context) {
     return  fr.inria.triskell.k3.sample.logo.ControlStructureAspect.priveval(_self,context);  
  }
  
  protected static int priveval(final While _self, final Context context) {
    Expression _condition = _self.getCondition();
    int _eval = ExpressionAspect.eval(_condition, context);
    boolean _greaterThan = (_eval > 0);
    boolean _while = _greaterThan;
    while (_while) {
      Block _block = _self.getBlock();
      BlockAspect.eval(_block, context);
      Expression _condition_1 = _self.getCondition();
      int _eval_1 = ExpressionAspect.eval(_condition_1, context);
      boolean _greaterThan_1 = (_eval_1 > 0);
      _while = _greaterThan_1;
    }
    return 0;
  }
}
