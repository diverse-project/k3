package expected;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = B.class)
public interface BAspect extends VisitorAspect {
	@OverrideAspectMethod
	static StringBuilder visit(final B _self) {
		_self_.setProp(BAspectBAspectContext.getSelf(_self));
		if (_self instanceof A) {
			return AAspect.privvisit((A) _self);
		} else if (_self instanceof B) {
			return BAspect.privvisit((B) _self);
		} else
			return VisitorAspect.privvisit(_self);
	}

	static BAspectBAspectPropertiesRef _self_ = new BAspectBAspectPropertiesRef();

	static StringBuilder super_visit(final B _self) {
		return VisitorAspect.privvisit(_self);
	}

	static StringBuilder privvisit(final B _self) {
		StringBuilder _super_visit = BAspect.super_visit(_self);
		Class<? extends B> _class = _self.getClass();
		String _simpleName = _class.getSimpleName();
		String _plus = (", Visiting BAspect with " + _simpleName);
		return _super_visit.append(_plus);
	}
}
