# Using the @Step annotation

The `@Step` annotation can be used to delegate the execution of a K3AL operation to some other external component.
More precisely, the generated code will create a `StepCommand` object whose `execute` method contains all the code, an pass it to this component.

# Implementing the IStepManager interface

Such external component must implements the `IStepManager` interface, which consists of two operations:

- `execute(Object caller, StepCommand command, String methodName)`, to handle the execution of the `command` knowing both which object was the `caller` and
what was the `methodName` called;
- `canHandle(Object caller)`, to tell whether or not the manager can handle the execution of an operation called by this object.

Example of a `IStepManager` implementation that only manages instances of classes whose names begin with `Toto`, and that prints messages when steps are executed:
```java
package my.pkg.toto;

import fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager;
import fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand;

public class MyStepManager implements IStepManager {

	@Override
	public void executeStep(Object caller, StepCommand command, String methodName) {
		System.out.println("Starting " + methodName + " called by " + caller);
		command.execute();
		System.out.println("Ending " + methodName + " called by " + caller);
	}

	@Override
	public boolean canHandle(Object caller) {
		return caller.getClass().getSimpleName().startsWith("Toto");
	}

}
```

# Using `StepManagerRegistry` to register managers

`IStepManager` implementations must be registered at runtime using the `StepManagerRegistry` singleton. For instance:

~~~~
StepManagerRegistry.getInstance().registerManager(new MyStepManager());
~~~~

# GEMOC case

A more complete example can be found in the GEMOC project, with the class `PlainK3ExecutionEngine` that handles the execution of `@Step` methods using EMF Transaction,
while making sure that there are no compound transactions (ie starting a transaction within a transaction).
