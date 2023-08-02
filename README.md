K3
==

K3 is an action language build on top of the Xtend programming language in order to use it for executable metamodeling.

Its key feature allows to "re-open" classes of an Ecore metamodel and to weave new features or operations in these classes.

Please have a look to **[http://diverse-project.github.io/k3/](http://diverse-project.github.io/k3/)** for more details and tutorials.


Contributing
------------------------

Folders named `*-eclipse` contains Eclipse-based projects that can be built directly in eclipse or using maven/tycho.
Other folders contain pure maven projects.
All root folders contains a `*.root` project that allows to build all the projects in one maven command.

The documentation is in the `gh-pages` branch.


Development
------------------------

```
mvn clean verify
```

[![Build and Verify](https://github.com/diverse-project/k3/actions/workflows/verify.yml/badge.svg)](https://github.com/diverse-project/k3/actions)<br/>
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.diverse-project.k3/fr.inria.diverse.k3.al.annotationprocessor/badge.svg?style=flat)](https://maven-badges.herokuapp.com/maven-central/io.github.diverse-project.k3/fr.inria.diverse.k3.al.annotationprocessor)<br/>


Tips
------------------------

The annotation processor logs some message using `java.util.logging.Logger`

One may display  more detailed messages by setting the system property `java.util.logging.config.file` to point to a  logging.properties file such as 
https://github.com/diverse-project/k3/tree/master/resources/logging.properties

Ex: for maven: add `-Djava.util.logging.config.file=<locationofpropertiesfiles>`
