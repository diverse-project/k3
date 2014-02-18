package expected;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = C.class)
public class CAspect extends VisitorAspect {
	@OverrideAspectMethod
	public static StringBuilder visit(final C _self) {
		CAspectCAspectContext _instance = CAspectCAspectContext.getInstance();
		java.util.Map<C, CAspectCAspectProperties> selfProp = _instance.getMap();
		boolean _containsKey = selfProp.containsKey(_self);
		boolean _not = (!_containsKey);
		if (_not) {
			CAspectCAspectProperties prop = new CAspectCAspectProperties();
			selfProp.put(_self, prop);
		}
		_self_ = selfProp.get(_self);
		if (_self instanceof C) {
			return CAspect.privvisit((C) _self);
		} else
			return VisitorAspect.privvisit(_self);
	}

	public static CAspectCAspectProperties _self_;

	private static StringBuilder super_visit(final C _self) {
		return VisitorAspect.privvisit(_self);
	}

	protected static StringBuilder privvisit(final C _self) {
		StringBuilder _super_visit = CAspect.super_visit(_self);
		Class<? extends C> _class = _self.getClass();
		String _simpleName = _class.getSimpleName();
		String _plus = (", Visiting CAspect with " + _simpleName);
		return _super_visit.append(_plus);
	}
}
