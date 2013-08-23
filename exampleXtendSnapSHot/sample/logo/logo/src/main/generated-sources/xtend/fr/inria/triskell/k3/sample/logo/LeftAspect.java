package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import fr.inria.triskell.k3.sample.logo.Context;
import fr.inria.triskell.k3.sample.logo.ExpressionAspect;
import fr.inria.triskell.k3.sample.logo.LeftAspectLeftAspectProperties;
import fr.inria.triskell.k3.sample.logo.PrimitiveAspect;
import kmLogo.ASM.Expression;
import kmLogo.ASM.Left;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Left.class)
@SuppressWarnings("all")
public class LeftAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static int eval(final Left _self, final Context context) {
    fr.inria.triskell.k3.sample.logo.LeftAspectLeftAspectContext _instance = fr.inria.triskell.k3.sample.logo.LeftAspectLeftAspectContext.getInstance();
    						    java.util.Map<Left,fr.inria.triskell.k3.sample.logo.LeftAspectLeftAspectProperties> selfProp = _instance.getMap();
        						boolean _containsKey = selfProp.containsKey(_self);
    						    boolean _not = (!_containsKey);
    						    if (_not) {
          						fr.inria.triskell.k3.sample.logo.LeftAspectLeftAspectProperties prop = new fr.inria.triskell.k3.sample.logo.LeftAspectLeftAspectProperties();
       						   selfProp.put(_self, prop);
    					    }
    					     _self_ = selfProp.get(_self);
    					        if (_self instanceof kmLogo.ASM.Left){
    					     									return fr.inria.triskell.k3.sample.logo.LeftAspect.priveval((kmLogo.ASM.Left)_self,context);
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
  
  public static LeftAspectLeftAspectProperties _self_;
  
  private static int super_eval(final Left _self, final Context context) {
     return  fr.inria.triskell.k3.sample.logo.PrimitiveAspect.priveval(_self,context);  
  }
  
  protected static int priveval(final Left _self, final Context context) {
    int _minus = (-1);
    Expression _angle = _self.getAngle();
    int _eval = ExpressionAspect.eval(_angle, context);
    int param = (_minus * _eval);
    String _plus = ("LEFT " + Integer.valueOf(param));
    InputOutput.<String>println(_plus);
    context.turtle.rotate(param);
    return 0;
  }
}
