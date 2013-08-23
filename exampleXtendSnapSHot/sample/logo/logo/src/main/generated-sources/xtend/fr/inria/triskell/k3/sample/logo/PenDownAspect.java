package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import fr.inria.triskell.k3.sample.logo.Context;
import fr.inria.triskell.k3.sample.logo.PenDownAspectPenDownAspectProperties;
import fr.inria.triskell.k3.sample.logo.PrimitiveAspect;
import kmLogo.ASM.PenDown;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = PenDown.class)
@SuppressWarnings("all")
public class PenDownAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static int eval(final PenDown _self, final Context context) {
    fr.inria.triskell.k3.sample.logo.PenDownAspectPenDownAspectContext _instance = fr.inria.triskell.k3.sample.logo.PenDownAspectPenDownAspectContext.getInstance();
    						    java.util.Map<PenDown,fr.inria.triskell.k3.sample.logo.PenDownAspectPenDownAspectProperties> selfProp = _instance.getMap();
        						boolean _containsKey = selfProp.containsKey(_self);
    						    boolean _not = (!_containsKey);
    						    if (_not) {
          						fr.inria.triskell.k3.sample.logo.PenDownAspectPenDownAspectProperties prop = new fr.inria.triskell.k3.sample.logo.PenDownAspectPenDownAspectProperties();
       						   selfProp.put(_self, prop);
    					    }
    					     _self_ = selfProp.get(_self);
    					        if (_self instanceof kmLogo.ASM.Clear){
    					     									return fr.inria.triskell.k3.sample.logo.ClearAspect.priveval((kmLogo.ASM.Clear)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.PenUp){
    					     									return fr.inria.triskell.k3.sample.logo.PenUpAspect.priveval((kmLogo.ASM.PenUp)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.PenDown){
    					     									return fr.inria.triskell.k3.sample.logo.PenDownAspect.priveval((kmLogo.ASM.PenDown)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.Right){
    					     									return fr.inria.triskell.k3.sample.logo.RightAspect.priveval((kmLogo.ASM.Right)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.Left){
    					     									return fr.inria.triskell.k3.sample.logo.LeftAspect.priveval((kmLogo.ASM.Left)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.Forward){
    					     									return fr.inria.triskell.k3.sample.logo.ForwardAspect.priveval((kmLogo.ASM.Forward)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.Back){
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
  
  public static PenDownAspectPenDownAspectProperties _self_;
  
  private static int super_eval(final PenDown _self, final Context context) {
     return  fr.inria.triskell.k3.sample.logo.PrimitiveAspect.priveval(_self,context);  
  }
  
  protected static int priveval(final PenDown _self, final Context context) {
    InputOutput.<String>println("PENDOWN");
    context.turtle.setPenUp(false);
    return 0;
  }
}
