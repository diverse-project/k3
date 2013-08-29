package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.LogoProgramAspectLogoProgramAspectProperties;
import java.util.Map;
import kmLogo.ASM.LogoProgram;

@SuppressWarnings("all")
public class LogoProgramAspectLogoProgramAspectContext {
  public final static LogoProgramAspectLogoProgramAspectContext INSTANCE = new LogoProgramAspectLogoProgramAspectContext();
  
  public static LogoProgramAspectLogoProgramAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<LogoProgram,LogoProgramAspectLogoProgramAspectProperties> map = new java.util.HashMap<LogoProgram, fr.inria.triskell.k3.sample.logo.LogoProgramAspectLogoProgramAspectProperties>();
  
  public Map<LogoProgram,LogoProgramAspectLogoProgramAspectProperties> getMap() {
    return map;
  }
}
