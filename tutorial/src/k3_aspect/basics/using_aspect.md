# Using aspect from another k3/xTend program

To use the aspect, you need to import the correct classes and indicates to xTend thant some additionnal feautres can come from the aspect.

This is done using the special import ***import static extension*** which enable the use of the additions declared in the aspect.

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


## Disambiguisation

If several operations or attributes have similar names, xTend may not find the expected feature.
In that case you need to disambiguise the call by accessing the underlying helper class.

_* TODO *_ show an example of direct, non ambiguious call using the underlying helper class.

## Tip
Be careful when cleaning unused imports while your programs isn't complete (for example using **ctrl+shift+o**) because it will also removed unused static extension and will disable the code completion (**ctrl+space**) for the features of these aspects.