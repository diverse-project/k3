package fr.inria.diverse.k3.al.annotationprocessor

import java.lang.reflect.InvocationTargetException

class EMFInvokeMethodHelper
{
	public static val EMFInvokeMethodHelper instance = new EMFInvokeMethodHelper

	def <T> T invokeMethod(Object o, String methodname, String aspectQualifiedName,T res, Object... params ) {
		try {
			val a = Thread.currentThread.contextClassLoader.loadClass(aspectQualifiedName)
			val ms = a.methods
			var m = ms.findFirst[methodname == name && parameterTypes.size == params.size]

			return m.invoke(null, o, params) as T
		} catch (IllegalAccessException exc) {
			// ...
		} catch (InvocationTargetException exc) {
			// ...
		} catch (ClassNotFoundException exc) {
			// ...
		}
	}
}
