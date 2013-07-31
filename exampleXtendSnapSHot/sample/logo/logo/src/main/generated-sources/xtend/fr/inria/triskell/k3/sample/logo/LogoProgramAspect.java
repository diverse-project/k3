package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.sample.logo.Context;
import fr.inria.triskell.k3.sample.logo.InstructionAspect;
import fr.inria.triskell.k3.sample.logo.LogoProgramAspectLogoProgramAspectProperties;
import kmLogo.ASM.Instruction;
import kmLogo.ASM.LogoProgram;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@Aspect(className = LogoProgram.class)
@SuppressWarnings("all")
public class LogoProgramAspect {
  public static int eval(final LogoProgram _self, final Context context) {
    fr.inria.triskell.k3.sample.logo.LogoProgramAspectLogoProgramAspectContext _instance = fr.inria.triskell.k3.sample.logo.LogoProgramAspectLogoProgramAspectContext.getInstance();
    						    java.util.Map<LogoProgram,fr.inria.triskell.k3.sample.logo.LogoProgramAspectLogoProgramAspectProperties> selfProp = _instance.getMap();
        						boolean _containsKey = selfProp.containsKey(_self);
    						    boolean _not = (!_containsKey);
    						    if (_not) {
          						fr.inria.triskell.k3.sample.logo.LogoProgramAspectLogoProgramAspectProperties prop = new fr.inria.triskell.k3.sample.logo.LogoProgramAspectLogoProgramAspectProperties();
       						   selfProp.put(_self, prop);
    					    }
    					     _self_ = selfProp.get(_self);
    					     return priveval(_self,context); 
    
  }
  
  public static LogoProgramAspectLogoProgramAspectProperties _self_;
  
  protected static int priveval(final LogoProgram _self, final Context context) {
    InputOutput.<String>println("LogoProgram eval !");
    EList<Instruction> _instructions = _self.getInstructions();
    final Procedure1<Instruction> _function = new Procedure1<Instruction>() {
        public void apply(final Instruction instr) {
          InstructionAspect.eval(instr, context);
        }
      };
    IterableExtensions.<Instruction>forEach(_instructions, _function);
    return 0;
  }
}
