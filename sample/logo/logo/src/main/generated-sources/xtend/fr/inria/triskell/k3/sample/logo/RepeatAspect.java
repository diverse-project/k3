package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import fr.inria.triskell.k3.sample.logo.BlockAspect;
import fr.inria.triskell.k3.sample.logo.Context;
import fr.inria.triskell.k3.sample.logo.ControlStructureAspect;
import fr.inria.triskell.k3.sample.logo.ExpressionAspect;
import fr.inria.triskell.k3.sample.logo.RepeatAspectRepeatAspectProperties;
import kmLogo.ASM.Block;
import kmLogo.ASM.Expression;
import kmLogo.ASM.Repeat;

@Aspect(className = Repeat.class)
@SuppressWarnings("all")
public class RepeatAspect extends ControlStructureAspect {
  @OverrideAspectMethod
  public static int eval(final Repeat _self, final Context context) {
    fr.inria.triskell.k3.sample.logo.RepeatAspectRepeatAspectContext _instance = fr.inria.triskell.k3.sample.logo.RepeatAspectRepeatAspectContext.getInstance();
    						    java.util.Map<Repeat,fr.inria.triskell.k3.sample.logo.RepeatAspectRepeatAspectProperties> selfProp = _instance.getMap();
        						boolean _containsKey = selfProp.containsKey(_self);
    						    boolean _not = (!_containsKey);
    						    if (_not) {
          						fr.inria.triskell.k3.sample.logo.RepeatAspectRepeatAspectProperties prop = new fr.inria.triskell.k3.sample.logo.RepeatAspectRepeatAspectProperties();
       						   selfProp.put(_self, prop);
    					    }
    					     _self_ = selfProp.get(_self);
    					        if (_self instanceof kmLogo.ASM.Repeat){
    					     									return fr.inria.triskell.k3.sample.logo.RepeatAspect.priveval((kmLogo.ASM.Repeat)_self,context);
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
  
  public static RepeatAspectRepeatAspectProperties _self_;
  
  private static int super_eval(final Repeat _self, final Context context) {
     return  fr.inria.triskell.k3.sample.logo.ControlStructureAspect.priveval(_self,context);  
  }
  
  protected static int priveval(final Repeat _self, final Context context) {
    Expression _condition = _self.getCondition();
    int time = ExpressionAspect.eval(_condition, context);
    boolean _greaterThan = (time > 0);
    boolean _while = _greaterThan;
    while (_while) {
      {
        Block _block = _self.getBlock();
        BlockAspect.eval(_block, context);
        int _minus = (time - 1);
        time = _minus;
      }
      boolean _greaterThan_1 = (time > 0);
      _while = _greaterThan_1;
    }
    return 0;
  }
}
