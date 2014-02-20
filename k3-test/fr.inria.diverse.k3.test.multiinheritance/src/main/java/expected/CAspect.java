package expected;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = C.class)
public interface CAspect extends VisitorAspect {
	@OverrideAspectMethod
	static StringBuilder visit(final C _self) {
		_self_.setProp(CAspectCAspectContext.getSelf(_self));
		if (_self instanceof C) {
			return CAspect.privvisit((C) _self);
		} else
			return VisitorAspect.privvisit(_self);
	}

	static CAspectCAspectPropertiesRef _self_ = new CAspectCAspectPropertiesRef();

	static StringBuilder super_visit(final C _self) {
		return VisitorAspect.privvisit(_self);
	}

	static StringBuilder privvisit(final C _self) {
		StringBuilder _super_visit = CAspect.super_visit(_self);
		Class<? extends C> _class = _self.getClass();
		String _simpleName = _class.getSimpleName();
		String _plus = (", Visiting CAspect with " + _simpleName);
		return _super_visit.append(_plus);
	}
}
