package xtend

import fr.inria.triskell.k3.Aspect

import org.eclipse.xtend.core.linking.LinkingProxyAwareResource
import org.eclipse.xtend.core.xtend.XtendFile
import org.eclipse.xtend.core.xtend.XtendClass
import org.eclipse.xtend.core.xtend.XtendField
import org.eclipse.xtend.core.xtend.XtendFunction

import static extension xtend.XtendFileAspect.*
import static extension xtend.XtendClassAspect.*
import static extension xtend.XtendFieldAspect.*
import static extension xtend.XtendFunctionAspect.*


@Aspect(className=typeof(LinkingProxyAwareResource)) 
public class LinkingProxyAwareResourceAspect {
	def public void eval () {
		for (xfiles : _self.contents) {
			if(xfiles instanceof XtendFile) {
				(xfiles as XtendFile).eval
			}
		}		
	}
}

@Aspect(className=typeof(XtendFile)) 
public class XtendFileAspect {
	def public void eval () {
		print('Displaying xtend File : ')
		println('package = ' + _self.package)
		
		for(xClass : _self.xtendTypes) {
			if(xClass instanceof XtendClass) {
				(xClass as XtendClass).eval
			}
		}
	}
}

@Aspect(className=typeof(XtendClass)) 
public class XtendClassAspect {
	def public void eval () {
		print('Displaying xtend Class : ')
		println('class = ' + _self.name)
		
		for(xMember : _self.members) {
			if(xMember instanceof XtendField) {
				(xMember as XtendField).eval
			}
			
			if(xMember instanceof XtendFunction) {
				(xMember as XtendFunction).eval
			}
		}
	}
}

@Aspect(className=typeof(XtendField)) 
public class XtendFieldAspect {
	def public void eval () {
		print('Displaying xtend Attributes : ')
		println('attribute = ' + _self.name) 		
	}
}

@Aspect(className=typeof(XtendFunction)) 
public class XtendFunctionAspect {
	def public void eval () {
		print('Displaying xtend Function : ')
		println('function = ' + _self.name)
	}
}
