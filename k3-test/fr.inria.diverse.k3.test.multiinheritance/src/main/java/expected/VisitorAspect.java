package expected;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;

@Aspect(className = Object.class)
public interface VisitorAspect {
	static StringBuilder visit(final Object _self) {
		_self_.setProp(VisitorAspectObjectAspectContext.getSelf(_self));
		if (_self instanceof A) {
			return AAspect.privvisit((A) _self);
		} else if (_self instanceof C) {
			return CAspect.privvisit((C) _self);
		} else if (_self instanceof B) {
			return BAspect.privvisit((B) _self);
		} else
			return VisitorAspect.privvisit(_self);
	}

	static VisitorAspectObjectAspectPropertiesRef _self_ = new VisitorAspectObjectAspectPropertiesRef();

	static StringBuilder privvisit(final Object _self) {
		Class<?> _class = _self.getClass();
		String _simpleName = _class.getSimpleName();
		String _plus = ("Visiting VisitorAspect with " + _simpleName);
		return new StringBuilder(_plus);
	}
}
