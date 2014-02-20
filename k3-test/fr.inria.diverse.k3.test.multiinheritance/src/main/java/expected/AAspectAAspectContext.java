package expected;

import java.util.Map;

public class AAspectAAspectContext {
	public final static AAspectAAspectContext INSTANCE = new AAspectAAspectContext();

//	public static AAspectAAspectContext getInstance() {
//		return INSTANCE;
//	}

	private Map<A, AAspectAAspectProperties> map = new java.util.HashMap<>();

//	public Map<A, AAspectAAspectProperties> getMap() {
//		return map;
//	}
	
	public static AAspectAAspectProperties getSelf(A _self) {
		if (!INSTANCE.map.containsKey(_self))
			INSTANCE.map.put(_self, new AAspectAAspectProperties());
		return INSTANCE.map.get(_self);
	}
}
