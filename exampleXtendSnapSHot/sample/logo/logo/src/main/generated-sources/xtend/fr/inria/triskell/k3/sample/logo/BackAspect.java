package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import fr.inria.triskell.k3.sample.logo.BackAspectBackAspectProperties;
import fr.inria.triskell.k3.sample.logo.Context;
import fr.inria.triskell.k3.sample.logo.ExpressionAspect;
import fr.inria.triskell.k3.sample.logo.PrimitiveAspect;
import kmLogo.ASM.Back;
import kmLogo.ASM.Expression;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Back.class)
@SuppressWarnings("all")
public class BackAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static int eval(final Back _self, final Context context) {
    fr.inria.triskell.k3.sample.logo.BackAspectBackAspectContext _instance = fr.inria.triskell.k3.sample.logo.BackAspectBackAspectContext.getInstance();
    						    java.util.Map<Back,fr.inria.triskell.k3.sample.logo.BackAspectBackAspectProperties> selfProp = _instance.getMap();
        						boolean _containsKey = selfProp.containsKey(_self);
    						    boolean _not = (!_containsKey);
    						    if (_not) {
          						fr.inria.triskell.k3.sample.logo.BackAspectBackAspectProperties prop = new fr.inria.triskell.k3.sample.logo.BackAspectBackAspectProperties();
       						   selfProp.put(_self, prop);
    					    }
    					     _self_ = selfProp.get(_self);
    					        if (_self instanceof kmLogo.ASM.Back){
    					     									return fr.inria.triskell.k3.sample.logo.BackAspect.priveval((kmLogo.ASM.Back)_self,context);
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
  
  public static BackAspectBackAspectProperties _self_;
  
  private static int super_eval(final Back _self, final Context context) {
     return  fr.inria.triskell.k3.sample.logo.PrimitiveAspect.priveval(_self,context);  
  }
  
  protected static int priveval(final Back _self, final Context context) {
    int _minus = (-1);
    Expression _steps = _self.getSteps();
    int _eval = ExpressionAspect.eval(_steps, context);
    int param = (_minus * _eval);
    String _plus = ("BACK " + Integer.valueOf(param));
    InputOutput.<String>println(_plus);
    context.turtle.forward(param);
    return 0;
  }
}
