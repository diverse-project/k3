package expected;

import java.util.Map;

public class VisitorAspectObjectAspectContext {
	public final static VisitorAspectObjectAspectContext INSTANCE = new VisitorAspectObjectAspectContext();

	public static VisitorAspectObjectAspectContext getInstance() {
		return INSTANCE;
	}

	private Map<Object, VisitorAspectObjectAspectProperties> map = new java.util.HashMap<java.lang.Object, VisitorAspectObjectAspectProperties>();

	public Map<Object, VisitorAspectObjectAspectProperties> getMap() {
		return map;
	}
}
