K3
==
K3 is an environment for executable metamodeling and DSL engineering. It is composed of two main parts: K3AL and K3SLE
K3AL is a DSL on top of XTEND that works "à la" Kermeta 1.x / Kermeta 2.x. Is is mainly used as an action language for model element manipulation (modeling in the small).
K3SLE is a set of features dedicated to manipulate models (modeling in the large). It contains a modeltype system.

Git and projet structure
------------------------
The git uses 2 main branches: *production_stable* for releases and demo versions, and *master* for development and integration.

Root folders with name *-eclipse contains eclipse based project that can be built directly in eclipse or using maven+tycho.
Other root folders contains pure maven projects.
All root folders contains a *.root project that allow to build all the projects of the folder in one maven command.

K3AL
----
This project is a DSL on top of XTEND to work "à la" Kermeta. It is general enough to be used in more situation that just model manipulation programs.

Please use the exampleXtendSnapSHot

It provides examples to use this DSL. 

Among these examples:
* An archetype that generates an example of ecore model loading that contains aspects
* an example of FSM Operational Semantics
* an example of integration with Spoon
* an integration to generate Kevoree components. 
* Example with multiples aspects on the same metaclasses
* Example with aspect inheritance
* AspectProperty Active Annotation
* Example with design by contracts
* Inheritance and Design by contract
* Example of Aspect that overrides Base method Works when we remain in Xtend (Using ReplaceAspectMethod annotation)
* Example with GWT

### TODO
* Aspects and Design by contract
* Pretty printer from k2 to k3
* Example of Aspect that overrides Base method Works when we leave Xtend (the case of EMF)
* Documentation to explain _self on aspects (even for static method or static attributes. 
* Example of an Xtend program  that works on a xtend program


### Tools provided with K3AL
* Aspect generator for an ecore metamodel
* maven archetype



K3SLE
-----
K3SLE is modeltype system dedicated to manipulate models (modeling in the large). It allows to useconformance of models in order to apply transformation to models that may not be of the same exact metamodel.
... See the recent papers and Jim Steel's phd thesis.


