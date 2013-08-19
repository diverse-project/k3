package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import fr.inria.triskell.k3.sample.logo.Context;
import fr.inria.triskell.k3.sample.logo.ExpressionAspect;
import fr.inria.triskell.k3.sample.logo.PrimitiveAspect;
import fr.inria.triskell.k3.sample.logo.RightAspectRightAspectProperties;
import kmLogo.ASM.Expression;
import kmLogo.ASM.Right;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Right.class)
@SuppressWarnings("all")
public class RightAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static int eval(final Right _self, final Context context) {
    fr.inria.triskell.k3.sample.logo.RightAspectRightAspectContext _instance = fr.inria.triskell.k3.sample.logo.RightAspectRightAspectContext.getInstance();
    						    java.util.Map<Right,fr.inria.triskell.k3.sample.logo.RightAspectRightAspectProperties> selfProp = _instance.getMap();
        						boolean _containsKey = selfProp.containsKey(_self);
    						    boolean _not = (!_containsKey);
    						    if (_not) {
          						fr.inria.triskell.k3.sample.logo.RightAspectRightAspectProperties prop = new fr.inria.triskell.k3.sample.logo.RightAspectRightAspectProperties();
       						   selfProp.put(_self, prop);
    					    }
    					     _self_ = selfProp.get(_self);
    					        if (_self instanceof kmLogo.ASM.Right){
    					     									return fr.inria.triskell.k3.sample.logo.RightAspect.priveval((kmLogo.ASM.Right)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.Primitive){
    					     									return fr.inria.triskell.k3.sample.logo.PrimitiveAspect.priveval((kmLogo.ASM.Primitive)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.Instruction){
    					     									return fr.inria.triskell.k3.sample.logo.InstructionAspect.priveval((kmLogo.ASM.Instruction)_self,context);
    					     									} else 
    					      {
    					           										throw new IllegalArgumentException("Unhandled parameter types: " +
    					     									        java.util.Arrays.<Object>asList(_self).toString());
    					     							    } 
    
  }
  
  public static RightAspectRightAspectProperties _self_;
  
  private static int super_eval(final Right _self, final Context context) {
     return  fr.inria.triskell.k3.sample.logo.PrimitiveAspect.priveval(_self,context);  
  }
  
  protected static int priveval(final Right _self, final Context context) {
    Expression _angle = _self.getAngle();
    int param = ExpressionAspect.eval(_angle, context);
    String _plus = ("RIGHT " + Integer.valueOf(param));
    InputOutput.<String>println(_plus);
    context.turtle.rotate(param);
    return 0;
  }
}
