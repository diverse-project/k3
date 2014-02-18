package expected;

@SuppressWarnings("all")
public class AImpl extends BImpl implements A {
	private final CImpl _c = new CImpl();

	public int getA() {
		return 12;
	}

	public String getC() {
		return this._c.getC();
	}
}
