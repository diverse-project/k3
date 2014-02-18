package expected;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;

@Aspect(className = Object.class)
@SuppressWarnings("all")
public class VisitorAspect {
	public static StringBuilder visit(final Object _self) {
		VisitorAspectObjectAspectContext _instance = VisitorAspectObjectAspectContext.getInstance();
		java.util.Map<java.lang.Object, VisitorAspectObjectAspectProperties> selfProp = _instance.getMap();
		boolean _containsKey = selfProp.containsKey(_self);
		boolean _not = (!_containsKey);
		if (_not) {
			VisitorAspectObjectAspectProperties prop = new VisitorAspectObjectAspectProperties();
			selfProp.put(_self, prop);
		}
		_self_ = selfProp.get(_self);
		if (_self instanceof A) {
			return AAspect.privvisit((A) _self);
		} else if (_self instanceof C) {
			return CAspect.privvisit((C) _self);
		} else if (_self instanceof B) {
			return BAspect.privvisit((B) _self);
		} else if (_self instanceof java.lang.Object) {
			return VisitorAspect.privvisit((java.lang.Object) _self);
		} else {
			throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object> asList(_self).toString());
		}
	}

	public static VisitorAspectObjectAspectProperties _self_;

	protected static StringBuilder privvisit(final Object _self) {
		Class<?> _class = _self.getClass();
		String _simpleName = _class.getSimpleName();
		String _plus = ("Visiting VisitorAspect with " + _simpleName);
		return new StringBuilder(_plus);
	}
}
