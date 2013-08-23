package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import fr.inria.triskell.k3.sample.logo.ClearAspectClearAspectProperties;
import fr.inria.triskell.k3.sample.logo.Context;
import fr.inria.triskell.k3.sample.logo.PrimitiveAspect;
import kmLogo.ASM.Clear;
import org.eclipse.xtext.xbase.lib.InputOutput;

@Aspect(className = Clear.class)
@SuppressWarnings("all")
public class ClearAspect extends PrimitiveAspect {
  @OverrideAspectMethod
  public static int eval(final Clear _self, final Context context) {
    fr.inria.triskell.k3.sample.logo.ClearAspectClearAspectContext _instance = fr.inria.triskell.k3.sample.logo.ClearAspectClearAspectContext.getInstance();
    						    java.util.Map<Clear,fr.inria.triskell.k3.sample.logo.ClearAspectClearAspectProperties> selfProp = _instance.getMap();
        						boolean _containsKey = selfProp.containsKey(_self);
    						    boolean _not = (!_containsKey);
    						    if (_not) {
          						fr.inria.triskell.k3.sample.logo.ClearAspectClearAspectProperties prop = new fr.inria.triskell.k3.sample.logo.ClearAspectClearAspectProperties();
       						   selfProp.put(_self, prop);
    					    }
    					     _self_ = selfProp.get(_self);
    					        if (_self instanceof kmLogo.ASM.Clear){
    					     									return fr.inria.triskell.k3.sample.logo.ClearAspect.priveval((kmLogo.ASM.Clear)_self,context);
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
  
  public static ClearAspectClearAspectProperties _self_;
  
  private static int super_eval(final Clear _self, final Context context) {
     return  fr.inria.triskell.k3.sample.logo.PrimitiveAspect.priveval(_self,context);  
  }
  
  protected static int priveval(final Clear _self, final Context context) {
    InputOutput.<String>println("CLEAR");
    context.turtle.reset();
    return 0;
  }
}
