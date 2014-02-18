package expected;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = B.class)
public abstract class BAspect extends VisitorAspect {
	@OverrideAspectMethod
	public static StringBuilder visit(final B _self) {
		BAspectBAspectContext _instance = BAspectBAspectContext.getInstance();
		java.util.Map<B, BAspectBAspectProperties> selfProp = _instance.getMap();
		boolean _containsKey = selfProp.containsKey(_self);
		boolean _not = (!_containsKey);
		if (_not) {
			BAspectBAspectProperties prop = new BAspectBAspectProperties();
			selfProp.put(_self, prop);
		}
		_self_ = selfProp.get(_self);
		if (_self instanceof A) {
			return AAspect.privvisit((A) _self);
		} else if (_self instanceof B) {
			return BAspect.privvisit((B) _self);
		} else
			return VisitorAspect.privvisit(_self);
	}

	public static BAspectBAspectProperties _self_;

	private static StringBuilder super_visit(final B _self) {
		return VisitorAspect.privvisit(_self);
	}

	protected static StringBuilder privvisit(final B _self) {
		StringBuilder _super_visit = BAspect.super_visit(_self);
		Class<? extends B> _class = _self.getClass();
		String _simpleName = _class.getSimpleName();
		String _plus = (", Visiting BAspect with " + _simpleName);
		return _super_visit.append(_plus);
	}
}
