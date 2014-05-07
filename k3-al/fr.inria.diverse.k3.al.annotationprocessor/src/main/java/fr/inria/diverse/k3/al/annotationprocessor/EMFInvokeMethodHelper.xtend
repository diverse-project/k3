package fr.inria.diverse.k3.al.annotationprocessor

import java.lang.reflect.Method

class EMFInvokeMethodHelper {
	
	public val static instance = new EMFInvokeMethodHelper()
	
	def <T> invokeMethod(Object o, String methodname, String aspectQualifiedName,T res, Object ... params ){
			val a = Thread.currentThread().getContextClassLoader().loadClass(aspectQualifiedName);
			val ms = a.getMethods();
			var Method m = null;
			
			for(Method m1 : ms){
				if (methodname.equals(m1.getName()) && m1.parameterTypes.size == params.size)
						m = m1;
				
			}
			
			return m.invoke(null,o,params) as T;
		
		
		
	}
	
	
}