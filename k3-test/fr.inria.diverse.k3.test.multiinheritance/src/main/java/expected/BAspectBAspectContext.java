package expected;

import java.util.Map;

public class BAspectBAspectContext {
	public final static BAspectBAspectContext INSTANCE = new BAspectBAspectContext();

	public static BAspectBAspectContext getInstance() {
		return INSTANCE;
	}

	private Map<B, BAspectBAspectProperties> map = new java.util.HashMap<>();

	public Map<B, BAspectBAspectProperties> getMap() {
		return map;
	}
	
	public static BAspectBAspectProperties getSelf(B _self) {
		if (!INSTANCE.map.containsKey(_self))
			INSTANCE.map.put(_self, new BAspectBAspectProperties());
		return INSTANCE.map.get(_self);
	}
}
