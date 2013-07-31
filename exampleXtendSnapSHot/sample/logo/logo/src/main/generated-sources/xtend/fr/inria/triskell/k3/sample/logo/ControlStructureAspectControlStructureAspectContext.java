package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.ControlStructureAspectControlStructureAspectProperties;
import java.util.Map;
import kmLogo.ASM.ControlStructure;

@SuppressWarnings("all")
public class ControlStructureAspectControlStructureAspectContext {
  public final static ControlStructureAspectControlStructureAspectContext INSTANCE = new ControlStructureAspectControlStructureAspectContext();
  
  public static ControlStructureAspectControlStructureAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<ControlStructure,ControlStructureAspectControlStructureAspectProperties> map = new java.util.HashMap<ControlStructure, fr.inria.triskell.k3.sample.logo.ControlStructureAspectControlStructureAspectProperties>();
  
  public Map<ControlStructure,ControlStructureAspectControlStructureAspectProperties> getMap() {
    return map;
  }
}
