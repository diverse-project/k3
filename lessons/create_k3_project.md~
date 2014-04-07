---
layout: page
title: "Creating a K3 Project"
description: ""
---
{% include JB/setup %}
# Introduction
K3 use maven to generate a new project.
This presentation is going to divide in two parts :
* Create a new K3 project with eclipse
* Create a new K3 project with maven

# Creation of a new K3 project with eclipse
### Prerequisite
* [Own Xtend on eclipse IDE](http://www.eclipse.org/xtend/download.html)
    * It is recommended to download the full eclipse edition (kepler) which includes automatically [Xtend](http://www.eclipse.org/xtend/index.html)
* Work on JDK, not on JRE
    * Default installation of eclipse is automatically featured on a JRE
    * To modify :Window => Preferences => Java => Installed JREs
* Have [m2e](http://eclipse.org/m2e/) plugin installed on IDE eclispe 

### Generate a new K3 project
* Go to : File -> New -> Project...
* A wizard opened called _New Project_ : Select Folder Maven => Maven Project => Click on Next button
![New Project](/barais/k3/raw/master/documentation/k3.doc/Img/CreationNewK3Project/Wizard_newProject_Maven.png)

* The next step consists to specify the kind of output the new k3 project will be
![New Maven Project](/barais/k3/raw/master/documentation/k3.doc/Img/CreationNewK3Project/New_Maven_Project.png)

* This step allows to select the good k3 project expected
    * Check the box _"Include Snapshot archetypes"_
    * In Field _"Filter"_ : key in "fr.irisa.triskell"
    * Select and Click on the next button
![Archetype choice](/barais/k3/raw/master/documentation/k3.doc/Img/CreationNewK3Project/Maven_GroupId_Selection.png)

* This is the final step, it consists to feature information about of the new k3 project, fill fields :
    * Group Id
    * Artifact Id
    * Version
    * Package
* Click on Finish button
![Information about new k3 project](/barais/k3/raw/master/documentation/k3.doc/Img/CreationNewK3Project/newArchetypeProject.png)

* **A New Project has just been created in workspace**

# Creation of a new K3 project with Maven
### Prerequisite
* Have maven installed on the machin : [link to download it](http://maven.apache.org/download.cgi)

### Generate a new K3 project 
* open a console and go to the path where the project should be created
* key this following maven command : > mvn archetype:generate -DarchetypeGroupId=fr.irisa.triskell -DarchetypeArtifactId=k3-archetype <
* the execution of this command pulls 4 requests :
    1. GroupId
    2. ArtifactId
    3. version
    4. validation of the encoding
See the red answers in the picture below
![Maven red answer of requests](/barais/k3/raw/master/documentation/k3.doc/Img/CreationNewK3Project/MavenCommandLine.png)
