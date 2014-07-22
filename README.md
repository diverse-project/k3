K3
==

K3 is both a language and an environment for executable metamodeling and software language engineering. It is mainly integrated within the Eclipse platform and interoperates with most of the tooling developed around the Eclipse Modeling Framework (e.g. Ecore, Xtext, Sirius). Its two main components are K3AL for aspect-oriented metamodeling and executability weaving, and K3SLE for software language engineering.

Please have a look to the [wiki](https://github.com/diverse-project/k3/wiki) for more details and tutorials.

K3AL
----
K3AL is a DSL built on top of the Xtend programming language that allows to "re-open" classes from an Ecore metamodel to weave new features or operations. It consists in a set of annotations that can be used in plain Xtend files to express e.g. aspects, pre/post conditions or invariants, and uses Xbase as the expression language for operations bodies.

K3SLE
-----
K3SLE  is a meta-language for specifying software languages. It allows the mashup of different language components, such as abstract syntax and semantics, and automatically extract interfaces that expose specific concerns. It comes with Eclipse-integrated editors and compiles to Java code that is fully interoperable with legacy EMF code.

K3SLE comes with a model-oriented typing system that statically and structurally types the different constructs of its meta-language. Model types are one type of interfaces that serve as a typing layer on top of metamodels, along with subtyping relations that enables model polymorphism.

Contributing
------------------------
The git uses 2 main branches: *production_stable* for releases, and *master* for development and integration.

Folders named *-eclipse contains Eclipse-based projects that can be built directly in eclipse or using maven/tycho.
Other folders contain pure maven projects.
All root folders contains a *.root project that allows to build all the project in one maven command.
