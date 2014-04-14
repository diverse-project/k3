# Creating an aspect on a class
1. Add the annotation _**Aspect**_ on the class corresponding to the aspect
2. Specify the class to augment using the annotation parameter **className**
3. Update the imported packages using **ctrl+shift+o**


```xtend
package mypackage

import fr.inria.triskell.k3.Aspect

import mypackage.OtherClass

@Aspect(className=typeof(OtherClass))
class OtherClassAspect {
    def void display (){
         prinln("I am OtherClassAspect")
    }
}
```

In an aspect you can use the attributes and operations of both the augmented class and the aspect itself.<br/>
In aspects **the keyword this must not be used**.
Instead, the keyword **_self** must be used.

```xtend
@Aspect(className=typeof(OtherClass))
class OtherClassAspect {
   var int foo = 1

    def void display (){
         // The keyword _self must be used to refer to attributes and operations of the class and aspect.
         _self.foo = 2
         _self.callingOnOperationOfOtherClass()
    }
}
```
