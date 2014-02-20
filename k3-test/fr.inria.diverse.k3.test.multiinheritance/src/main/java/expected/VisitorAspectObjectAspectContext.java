package expected;

import java.util.Map;

public class VisitorAspectObjectAspectContext {
	public final static VisitorAspectObjectAspectContext INSTANCE = new VisitorAspectObjectAspectContext();

	public static VisitorAspectObjectAspectContext getInstance() {
		return INSTANCE;
	}

	private Map<Object, VisitorAspectVisitorAspectProperties> map = new java.util.HashMap<>();

	public Map<Object, VisitorAspectVisitorAspectProperties> getMap() {
		return map;
	}
	
	
	public static VisitorAspectVisitorAspectProperties getSelf(Object _self) {
		if (!INSTANCE.map.containsKey(_self))
			INSTANCE.map.put(_self, new VisitorAspectVisitorAspectProperties());
		return INSTANCE.map.get(_self);
	}
}
