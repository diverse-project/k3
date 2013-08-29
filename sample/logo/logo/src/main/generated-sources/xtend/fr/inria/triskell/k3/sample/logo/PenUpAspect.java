package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import fr.inria.triskell.k3.sample.logo.Context;
import fr.inria.triskell.k3.sample.logo.PenUpAspectPenUpAspectProperties;
import fr.inria.triskell.k3.sample.logo.PrimitiveAspect;
import kmLogo.ASM.PenUp;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = PenUp.class)
@SuppressWarnings("all")
public class PenUpAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static int eval(final PenUp _self, final Context context) {
    fr.inria.triskell.k3.sample.logo.PenUpAspectPenUpAspectContext _instance = fr.inria.triskell.k3.sample.logo.PenUpAspectPenUpAspectContext.getInstance();
    						    java.util.Map<PenUp,fr.inria.triskell.k3.sample.logo.PenUpAspectPenUpAspectProperties> selfProp = _instance.getMap();
        						boolean _containsKey = selfProp.containsKey(_self);
    						    boolean _not = (!_containsKey);
    						    if (_not) {
          						fr.inria.triskell.k3.sample.logo.PenUpAspectPenUpAspectProperties prop = new fr.inria.triskell.k3.sample.logo.PenUpAspectPenUpAspectProperties();
       						   selfProp.put(_self, prop);
    					    }
    					     _self_ = selfProp.get(_self);
    					        if (_self instanceof kmLogo.ASM.PenUp){
    					     									return fr.inria.triskell.k3.sample.logo.PenUpAspect.priveval((kmLogo.ASM.PenUp)_self,context);
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
  
  public static PenUpAspectPenUpAspectProperties _self_;
  
  private static int super_eval(final PenUp _self, final Context context) {
     return  fr.inria.triskell.k3.sample.logo.PrimitiveAspect.priveval(_self,context);  
  }
  
  protected static int priveval(final PenUp _self, final Context context) {
    InputOutput.<String>println("PENUP");
    context.turtle.setPenUp(true);
    return 0;
  }
}
