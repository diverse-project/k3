package expected;

import java.util.Map;

@SuppressWarnings("all")
public class CAspectCAspectContext {
  public final static CAspectCAspectContext INSTANCE = new CAspectCAspectContext();
  
  public static CAspectCAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<C,CAspectCAspectProperties> map = new java.util.HashMap<C, CAspectCAspectProperties>();
  
  public Map<C,CAspectCAspectProperties> getMap() {
    return map;
  }
}
