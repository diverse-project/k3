
## Important note
The sources present in this folder are compiled twice:
* directly in here as an eclipse plugin: [fr.inria.diverse.k3.al.annotationprocessor.plugin](https://github.com/diverse-project/k3/tree/master/k3.eclipse/fr.inria.diverse.k3.al.annotationprocessor.plugin)
* and a second time in the pure java project [fr.inria.diverse.k3.al.annotationprocessor](https://github.com/diverse-project/k3/tree/master/k3-al/fr.inria.diverse.k3.al.annotationprocessor)
  * The pom.xml of this second project actually copies the relevant source files from [fr.inria.diverse.k3.al.annotationprocessor.plugin](https://github.com/diverse-project/k3/tree/master/k3.eclipse/fr.inria.diverse.k3.al.annotationprocessor.plugin) in the *generate-sources* phase.
  * Do not neglect it since it is used for tests.



To successfully build this file in eclipse you must first run *mvn generate-sources*