package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.RepeatAspectRepeatAspectProperties;
import java.util.Map;
import kmLogo.ASM.Repeat;

@SuppressWarnings("all")
public class RepeatAspectRepeatAspectContext {
  public final static RepeatAspectRepeatAspectContext INSTANCE = new RepeatAspectRepeatAspectContext();
  
  public static RepeatAspectRepeatAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<Repeat,RepeatAspectRepeatAspectProperties> map = new java.util.HashMap<Repeat, fr.inria.triskell.k3.sample.logo.RepeatAspectRepeatAspectProperties>();
  
  public Map<Repeat,RepeatAspectRepeatAspectProperties> getMap() {
    return map;
  }
}
