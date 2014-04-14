# Calling a super operation
A call to a super operation can be done by writing **super_** followed by the name of the operation. Do not forget to use **_self** to handle elements of the class or aspect.

```xtend
@Aspect(className=typeof(MyClass))
class MyClassAspect extends OtherClassAspect {
    @OverrideAspectMethod
    def void display(){
       _self.super_display()
       prinln("I am MyClassAspect")
    }
}
```
