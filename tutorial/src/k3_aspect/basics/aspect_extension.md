# Extending an aspect

Extending an aspect can be performed as in Xtend.<br/>
However, an aspect can inherit from another aspect only!<br/>
To use the operations and attributes added in a class, you have to import the aspect:
_import static extension myPkg.AspectName.*_

```xtend
package mypackage

import fr.inria.triskell.k3.Aspect
import fr.inria.triskell.k3.OverrideAspectMethod

import mypackage.OtherClass
import mypackage.MyClass

import static extension mypackage.OtherClassAspect.*

@Aspect(className=typeof(OtherClass))
class OtherClassAspect {
    def void display(){
      prinln("I am OtherClassAspect")
    }
}

@Aspect(className=typeof(MyClass))
class MyClassAspect extends OtherClassAspect {
    // Annotation to tag the operation as an operation 
    // overloading a super operation
    @OverrideAspectMethod
    def void display(){
      println("I am MyClassAspect")
    }
}
```

