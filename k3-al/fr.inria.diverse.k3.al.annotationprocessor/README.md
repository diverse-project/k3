# How to build

mvn clean install

or mvn clean install from fr.inria.diverse.k3.al.root in order to both compile and run the tests

## Building from Eclipse
In order to use this project from Eclipse, we recommand to use the _File > import > Maven > Existing Maven Projects_ wizards
this will configure your workspace with the appropriate settings, classpath, .project, etc 

## Important note
This folder actually does not contain any sources, (at least, not stored in git).
The source files actually comes from [fr.inria.diverse.k3.al.annotationprocessor.plugin](https://github.com/diverse-project/k3/tree/master/k3.eclipse/fr.inria.diverse.k3.al.annotationprocessor.plugin) thanks to a selective copy of relevant files during the *mvn generate-sources* phase.
