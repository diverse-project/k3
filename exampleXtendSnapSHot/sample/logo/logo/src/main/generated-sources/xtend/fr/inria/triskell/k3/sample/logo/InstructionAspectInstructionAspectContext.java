package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.InstructionAspectInstructionAspectProperties;
import java.util.Map;
import kmLogo.ASM.Instruction;

@SuppressWarnings("all")
public class InstructionAspectInstructionAspectContext {
  public final static InstructionAspectInstructionAspectContext INSTANCE = new InstructionAspectInstructionAspectContext();
  
  public static InstructionAspectInstructionAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<Instruction,InstructionAspectInstructionAspectProperties> map = new java.util.HashMap<Instruction, fr.inria.triskell.k3.sample.logo.InstructionAspectInstructionAspectProperties>();
  
  public Map<Instruction,InstructionAspectInstructionAspectProperties> getMap() {
    return map;
  }
}
