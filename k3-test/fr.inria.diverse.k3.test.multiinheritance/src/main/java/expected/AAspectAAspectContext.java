package expected;

import java.util.Map;

@SuppressWarnings("all")
public class AAspectAAspectContext {
	public final static AAspectAAspectContext INSTANCE = new AAspectAAspectContext();

	public static AAspectAAspectContext getInstance() {
		return INSTANCE;
	}

	private Map<A, AAspectAAspectProperties> map = new java.util.HashMap<A, AAspectAAspectProperties>();

	public Map<A, AAspectAAspectProperties> getMap() {
		return map;
	}
}
