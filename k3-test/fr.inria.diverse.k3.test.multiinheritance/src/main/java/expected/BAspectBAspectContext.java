package expected;

import java.util.Map;

@SuppressWarnings("all")
public class BAspectBAspectContext {
	public final static BAspectBAspectContext INSTANCE = new BAspectBAspectContext();

	public static BAspectBAspectContext getInstance() {
		return INSTANCE;
	}

	private Map<B, BAspectBAspectProperties> map = new java.util.HashMap<B, BAspectBAspectProperties>();

	public Map<B, BAspectBAspectProperties> getMap() {
		return map;
	}
}
