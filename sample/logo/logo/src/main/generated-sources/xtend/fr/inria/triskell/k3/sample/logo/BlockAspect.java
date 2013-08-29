package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import fr.inria.triskell.k3.sample.logo.BlockAspectBlockAspectProperties;
import fr.inria.triskell.k3.sample.logo.Context;
import fr.inria.triskell.k3.sample.logo.ExpressionAspect;
import fr.inria.triskell.k3.sample.logo.InstructionAspect;
import kmLogo.ASM.Block;
import kmLogo.ASM.Instruction;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@Aspect(className = Block.class)
@SuppressWarnings("all")
public class BlockAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static int eval(final Block _self, final Context context) {
    fr.inria.triskell.k3.sample.logo.BlockAspectBlockAspectContext _instance = fr.inria.triskell.k3.sample.logo.BlockAspectBlockAspectContext.getInstance();
    						    java.util.Map<Block,fr.inria.triskell.k3.sample.logo.BlockAspectBlockAspectProperties> selfProp = _instance.getMap();
        						boolean _containsKey = selfProp.containsKey(_self);
    						    boolean _not = (!_containsKey);
    						    if (_not) {
          						fr.inria.triskell.k3.sample.logo.BlockAspectBlockAspectProperties prop = new fr.inria.triskell.k3.sample.logo.BlockAspectBlockAspectProperties();
       						   selfProp.put(_self, prop);
    					    }
    					     _self_ = selfProp.get(_self);
    					        if (_self instanceof kmLogo.ASM.Block){
    					     									return fr.inria.triskell.k3.sample.logo.BlockAspect.priveval((kmLogo.ASM.Block)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.Expression){
    					     									return fr.inria.triskell.k3.sample.logo.ExpressionAspect.priveval((kmLogo.ASM.Expression)_self,context);
    					     									} else    if (_self instanceof kmLogo.ASM.Instruction){
    					     									return fr.inria.triskell.k3.sample.logo.InstructionAspect.priveval((kmLogo.ASM.Instruction)_self,context);
    					     									} else 
    					      {
    					           										throw new IllegalArgumentException("Unhandled parameter types: " +
    					     									        java.util.Arrays.<Object>asList(_self).toString());
    					     							    } 
    
  }
  
  public static BlockAspectBlockAspectProperties _self_;
  
  public static int res(final Block _self) {
    fr.inria.triskell.k3.sample.logo.BlockAspectBlockAspectContext _instance = fr.inria.triskell.k3.sample.logo.BlockAspectBlockAspectContext.getInstance();
    						    java.util.Map<Block,fr.inria.triskell.k3.sample.logo.BlockAspectBlockAspectProperties> selfProp = _instance.getMap();
        						boolean _containsKey = selfProp.containsKey(_self);
    						    boolean _not = (!_containsKey);
    						    if (_not) {
          						fr.inria.triskell.k3.sample.logo.BlockAspectBlockAspectProperties prop = new fr.inria.triskell.k3.sample.logo.BlockAspectBlockAspectProperties();
       						   selfProp.put(_self, prop);
    					    }
    					     _self_ = selfProp.get(_self);
    					     return privres(_self); 
    
  }
  
  public static void res(final Block _self, final int res) {
    fr.inria.triskell.k3.sample.logo.BlockAspectBlockAspectContext _instance = fr.inria.triskell.k3.sample.logo.BlockAspectBlockAspectContext.getInstance();
    						    java.util.Map<Block,fr.inria.triskell.k3.sample.logo.BlockAspectBlockAspectProperties> selfProp = _instance.getMap();
        						boolean _containsKey = selfProp.containsKey(_self);
    						    boolean _not = (!_containsKey);
    						    if (_not) {
          						fr.inria.triskell.k3.sample.logo.BlockAspectBlockAspectProperties prop = new fr.inria.triskell.k3.sample.logo.BlockAspectBlockAspectProperties();
       						   selfProp.put(_self, prop);
    					    }
    					     _self_ = selfProp.get(_self);
    					      privres(_self,res); 
    
  }
  
  private static int super_eval(final Block _self, final Context context) {
     return  fr.inria.triskell.k3.sample.logo.ExpressionAspect.priveval(_self,context);  
  }
  
  protected static int priveval(final Block _self, final Context context) {
    EList<Instruction> _instructions = _self.getInstructions();
    final Procedure1<Instruction> _function = new Procedure1<Instruction>() {
        public void apply(final Instruction instruction) {
          int _eval = InstructionAspect.eval(instruction, context);
          BlockAspect.res(_self, _eval);
        }
      };
    IterableExtensions.<Instruction>forEach(_instructions, _function);
    return BlockAspect.res(_self);
  }
  
  protected static int privres(final Block _self) {
     return fr.inria.triskell.k3.sample.logo.BlockAspect._self_.res; 
  }
  
  protected static void privres(final Block _self, final int res) {
    fr.inria.triskell.k3.sample.logo.BlockAspect._self_.res = res; 
  }
}
