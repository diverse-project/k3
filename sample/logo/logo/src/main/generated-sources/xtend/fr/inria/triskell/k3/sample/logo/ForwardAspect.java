package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import fr.inria.triskell.k3.sample.logo.Context;
import fr.inria.triskell.k3.sample.logo.ExpressionAspect;
import fr.inria.triskell.k3.sample.logo.ForwardAspectForwardAspectProperties;
import fr.inria.triskell.k3.sample.logo.PrimitiveAspect;
import kmLogo.ASM.Expression;
import kmLogo.ASM.Forward;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Forward.class)
@SuppressWarnings("all")
public class ForwardAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static int eval(final Forward _self, final Context context) {
    fr.inria.triskell.k3.sample.logo.ForwardAspectForwardAspectContext _instance = fr.inria.triskell.k3.sample.logo.ForwardAspectForwardAspectContext.getInstance();
    						    java.util.Map<Forward,fr.inria.triskell.k3.sample.logo.ForwardAspectForwardAspectProperties> selfProp = _instance.getMap();
        						boolean _containsKey = selfProp.containsKey(_self);
    						    boolean _not = (!_containsKey);
    						    if (_not) {
          						fr.inria.triskell.k3.sample.logo.ForwardAspectForwardAspectProperties prop = new fr.inria.triskell.k3.sample.logo.ForwardAspectForwardAspectProperties();
       						   selfProp.put(_self, prop);
    					    }
    					     _self_ = selfProp.get(_self);
    					        if (_self instanceof kmLogo.ASM.Forward){
    					     									return fr.inria.triskell.k3.sample.logo.ForwardAspect.priveval((kmLogo.ASM.Forward)_self,context);
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
  
  public static ForwardAspectForwardAspectProperties _self_;
  
  private static int super_eval(final Forward _self, final Context context) {
     return  fr.inria.triskell.k3.sample.logo.PrimitiveAspect.priveval(_self,context);  
  }
  
  protected static int priveval(final Forward _self, final Context context) {
    Expression _steps = _self.getSteps();
    int param = ExpressionAspect.eval(_steps, context);
    String _plus = ("FORWARD " + Integer.valueOf(param));
    InputOutput.<String>println(_plus);
    context.turtle.forward(param);
    return 0;
  }
}
