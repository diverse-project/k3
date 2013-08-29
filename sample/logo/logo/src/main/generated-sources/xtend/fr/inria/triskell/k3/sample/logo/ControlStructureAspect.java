package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import fr.inria.triskell.k3.sample.logo.Context;
import fr.inria.triskell.k3.sample.logo.ControlStructureAspectControlStructureAspectProperties;
import fr.inria.triskell.k3.sample.logo.InstructionAspect;
import kmLogo.ASM.ControlStructure;

@Aspect(className = ControlStructure.class)
@SuppressWarnings("all")
public class ControlStructureAspect extends InstructionAspect {
  @OverrideAspectMethod
  public static int eval(final ControlStructure _self, final Context context) {
    fr.inria.triskell.k3.sample.logo.ControlStructureAspectControlStructureAspectContext _instance = fr.inria.triskell.k3.sample.logo.ControlStructureAspectControlStructureAspectContext.getInstance();
    						    java.util.Map<ControlStructure,fr.inria.triskell.k3.sample.logo.ControlStructureAspectControlStructureAspectProperties> selfProp = _instance.getMap();
        						boolean _containsKey = selfProp.containsKey(_self);
    						    boolean _not = (!_containsKey);
    						    if (_not) {
          						fr.inria.triskell.k3.sample.logo.ControlStructureAspectControlStructureAspectProperties prop = new fr.inria.triskell.k3.sample.logo.ControlStructureAspectControlStructureAspectProperties();
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
  
  public static ControlStructureAspectControlStructureAspectProperties _self_;
  
  private static int super_eval(final ControlStructure _self, final Context context) {
     return  fr.inria.triskell.k3.sample.logo.InstructionAspect.priveval(_self,context);  
  }
  
  protected static int priveval(final ControlStructure _self, final Context context) {
    return 0;
  }
}
