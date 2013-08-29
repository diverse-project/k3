package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.ProcCallAspectProcCallAspectProperties;
import java.util.Map;
import kmLogo.ASM.ProcCall;

@SuppressWarnings("all")
public class ProcCallAspectProcCallAspectContext {
  public final static ProcCallAspectProcCallAspectContext INSTANCE = new ProcCallAspectProcCallAspectContext();
  
  public static ProcCallAspectProcCallAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<ProcCall,ProcCallAspectProcCallAspectProperties> map = new java.util.HashMap<ProcCall, fr.inria.triskell.k3.sample.logo.ProcCallAspectProcCallAspectProperties>();
  
  public Map<ProcCall,ProcCallAspectProcCallAspectProperties> getMap() {
    return map;
  }
}
