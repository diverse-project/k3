package expected;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;

@Aspect(className = A.class)
public interface AAspect extends BAspect, CAspect {
	@OverrideAspectMethod
	static StringBuilder visit(final A _self) {
		_self_.setProp(AAspectAAspectContext.getSelf(_self));
		if (_self instanceof A) {
			return AAspect.privvisit((A) _self);
		} else if (_self instanceof B) {
			return BAspect.privvisit((B) _self);
		} else if (_self instanceof C) {
			return CAspect.privvisit((C) _self);
		} else
			return VisitorAspect.privvisit(_self);
	}

	static AAspectAAspectPropertiesRef _self_ = new AAspectAAspectPropertiesRef();

	static StringBuilder super_B_visit(final A _self) {
		return BAspect.privvisit(_self);
	}
	
	static StringBuilder super_C_visit(final A _self) {
		return CAspect.privvisit(_self);
	}

	static StringBuilder privvisit(final A _self) {
		StringBuilder _super_B_visit = AAspect.super_B_visit(_self);
		StringBuilder _super_C_visit = AAspect.super_C_visit(_self);
		Class<? extends A> _class = _self.getClass();
		String _simpleName = _class.getSimpleName();
		String _plus = (", Visiting AAspect with " + _simpleName);
		return _super_B_visit.append(", ").append(_super_C_visit).append(_plus);
	}
}
