package expected;

public class Factory {
	public static A newA() {
		return new AImpl();
	}

	public static B newB() {
		return new BImpl();
	}

	public static C newC() {
		return new CImpl();
	}
}
