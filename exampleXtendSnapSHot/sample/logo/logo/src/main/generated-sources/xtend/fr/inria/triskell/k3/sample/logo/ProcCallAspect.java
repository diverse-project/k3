package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.Aspect;
import fr.inria.triskell.k3.OverrideAspectMethod;
import fr.inria.triskell.k3.sample.logo.Context;
import fr.inria.triskell.k3.sample.logo.ExpressionAspect;
import fr.inria.triskell.k3.sample.logo.InstructionAspect;
import fr.inria.triskell.k3.sample.logo.ProcCallAspectProcCallAspectProperties;
import java.util.Hashtable;
import kmLogo.ASM.Expression;
import kmLogo.ASM.Instruction;
import kmLogo.ASM.Parameter;
import kmLogo.ASM.ProcCall;
import kmLogo.ASM.ProcDeclaration;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@Aspect(className = ProcCall.class)
@SuppressWarnings("all")
public class ProcCallAspect extends ExpressionAspect {
  @OverrideAspectMethod
  public static int eval(final ProcCall _self, final Context context) {
    fr.inria.triskell.k3.sample.logo.ProcCallAspectProcCallAspectContext _instance = fr.inria.triskell.k3.sample.logo.ProcCallAspectProcCallAspectContext.getInstance();
    						    java.util.Map<ProcCall,fr.inria.triskell.k3.sample.logo.ProcCallAspectProcCallAspectProperties> selfProp = _instance.getMap();
        						boolean _containsKey = selfProp.containsKey(_self);
    						    boolean _not = (!_containsKey);
    						    if (_not) {
          						fr.inria.triskell.k3.sample.logo.ProcCallAspectProcCallAspectProperties prop = new fr.inria.triskell.k3.sample.logo.ProcCallAspectProcCallAspectProperties();
       						   selfProp.put(_self, prop);
    					    }
    					     _self_ = selfProp.get(_self);
    					        if (_self instanceof kmLogo.ASM.ProcCall){
    					     									return fr.inria.triskell.k3.sample.logo.ProcCallAspect.priveval((kmLogo.ASM.ProcCall)_self,context);
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
  
  public static ProcCallAspectProcCallAspectProperties _self_;
  
  public static int res(final ProcCall _self) {
    fr.inria.triskell.k3.sample.logo.ProcCallAspectProcCallAspectContext _instance = fr.inria.triskell.k3.sample.logo.ProcCallAspectProcCallAspectContext.getInstance();
    						    java.util.Map<ProcCall,fr.inria.triskell.k3.sample.logo.ProcCallAspectProcCallAspectProperties> selfProp = _instance.getMap();
        						boolean _containsKey = selfProp.containsKey(_self);
    						    boolean _not = (!_containsKey);
    						    if (_not) {
          						fr.inria.triskell.k3.sample.logo.ProcCallAspectProcCallAspectProperties prop = new fr.inria.triskell.k3.sample.logo.ProcCallAspectProcCallAspectProperties();
       						   selfProp.put(_self, prop);
    					    }
    					     _self_ = selfProp.get(_self);
    					     return privres(_self); 
    
  }
  
  public static void res(final ProcCall _self, final int res) {
    fr.inria.triskell.k3.sample.logo.ProcCallAspectProcCallAspectContext _instance = fr.inria.triskell.k3.sample.logo.ProcCallAspectProcCallAspectContext.getInstance();
    						    java.util.Map<ProcCall,fr.inria.triskell.k3.sample.logo.ProcCallAspectProcCallAspectProperties> selfProp = _instance.getMap();
        						boolean _containsKey = selfProp.containsKey(_self);
    						    boolean _not = (!_containsKey);
    						    if (_not) {
          						fr.inria.triskell.k3.sample.logo.ProcCallAspectProcCallAspectProperties prop = new fr.inria.triskell.k3.sample.logo.ProcCallAspectProcCallAspectProperties();
       						   selfProp.put(_self, prop);
    					    }
    					     _self_ = selfProp.get(_self);
    					      privres(_self,res); 
    
  }
  
  private static int super_eval(final ProcCall _self, final Context context) {
     return  fr.inria.triskell.k3.sample.logo.ExpressionAspect.priveval(_self,context);  
  }
  
  protected static int priveval(final ProcCall _self, final Context context) {
    ProcDeclaration _declaration = _self.getDeclaration();
    String _name = _declaration.getName();
    String _plus = ("Calling of : " + _name);
    InputOutput.<String>println(_plus);
    Hashtable<String,Integer> _hashtable = new Hashtable<String,Integer>();
    Hashtable<String,Integer> params = _hashtable;
    int i = 0;
    EList<Expression> _actualArgs = _self.getActualArgs();
    for (final Expression exp : _actualArgs) {
      {
        int currentArg = ExpressionAspect.eval(exp, context);
        ProcDeclaration _declaration_1 = _self.getDeclaration();
        EList<Parameter> _args = _declaration_1.getArgs();
        Parameter _get = _args.get(i);
        String _name_1 = _get.getName();
        params.put(_name_1, Integer.valueOf(currentArg));
        int _plus_1 = (i + 1);
        i = _plus_1;
      }
    }
    context.push(params);
    ProcCallAspect.res(_self, 0);
    ProcDeclaration _declaration_1 = _self.getDeclaration();
    EList<Instruction> _instructions = _declaration_1.getInstructions();
    final Procedure1<Instruction> _function = new Procedure1<Instruction>() {
        public void apply(final Instruction instr) {
          int _eval = InstructionAspect.eval(instr, context);
          ProcCallAspect.res(_self, _eval);
        }
      };
    IterableExtensions.<Instruction>forEach(_instructions, _function);
    context.pop();
    return ProcCallAspect.res(_self);
  }
  
  protected static int privres(final ProcCall _self) {
     return fr.inria.triskell.k3.sample.logo.ProcCallAspect._self_.res; 
  }
  
  protected static void privres(final ProcCall _self, final int res) {
    fr.inria.triskell.k3.sample.logo.ProcCallAspect._self_.res = res; 
  }
}
