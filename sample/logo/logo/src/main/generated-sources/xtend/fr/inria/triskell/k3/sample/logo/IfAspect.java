package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import fr.inria.triskell.k3.sample.logo.BlockAspect;
import fr.inria.triskell.k3.sample.logo.Context;
import fr.inria.triskell.k3.sample.logo.ControlStructureAspect;
import fr.inria.triskell.k3.sample.logo.ExpressionAspect;
import fr.inria.triskell.k3.sample.logo.IfAspectIfAspectProperties;
import kmLogo.ASM.Block;
import kmLogo.ASM.Expression;
import kmLogo.ASM.If;

@Aspect(className = If.class)
@SuppressWarnings("all")
public class IfAspect extends ControlStructureAspect {
  @OverrideAspectMethod
  public static int eval(final If _self, final Context context) {
    fr.inria.triskell.k3.sample.logo.IfAspectIfAspectContext _instance = fr.inria.triskell.k3.sample.logo.IfAspectIfAspectContext.getInstance();
    						    java.util.Map<If,fr.inria.triskell.k3.sample.logo.IfAspectIfAspectProperties> selfProp = _instance.getMap();
        						boolean _containsKey = selfProp.containsKey(_self);
    						    boolean _not = (!_containsKey);
    						    if (_not) {
          						fr.inria.triskell.k3.sample.logo.IfAspectIfAspectProperties prop = new fr.inria.triskell.k3.sample.logo.IfAspectIfAspectProperties();
       						   selfProp.put(_self, prop);
    					    }
    					     _self_ = selfProp.get(_self);
    					        if (_self instanceof kmLogo.ASM.If){
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
  
  public static IfAspectIfAspectProperties _self_;
  
  private static int super_eval(final If _self, final Context context) {
     return  fr.inria.triskell.k3.sample.logo.ControlStructureAspect.priveval(_self,context);  
  }
  
  protected static int priveval(final If _self, final Context context) {
    Expression _condition = _self.getCondition();
    int _eval = ExpressionAspect.eval(_condition, context);
    boolean _notEquals = (_eval != 0);
    if (_notEquals) {
      Block _thenPart = _self.getThenPart();
      return BlockAspect.eval(_thenPart, context);
    } else {
      Block _elsePart = _self.getElsePart();
      return BlockAspect.eval(_elsePart, context);
    }
  }
}
