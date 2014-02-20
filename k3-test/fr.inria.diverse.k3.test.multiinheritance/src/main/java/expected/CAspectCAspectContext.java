package expected;

import java.util.Map;

public class CAspectCAspectContext {
	public final static CAspectCAspectContext INSTANCE = new CAspectCAspectContext();

	public static CAspectCAspectContext getInstance() {
		return INSTANCE;
	}

	private Map<C, CAspectCAspectProperties> map = new java.util.HashMap<>();

	public Map<C, CAspectCAspectProperties> getMap() {
		return map;
	}
	
	public static CAspectCAspectProperties getSelf(C _self) {
		if (!INSTANCE.map.containsKey(_self))
			INSTANCE.map.put(_self, new CAspectCAspectProperties());
		return INSTANCE.map.get(_self);
	}
}
