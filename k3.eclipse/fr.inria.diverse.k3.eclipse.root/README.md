reminder to manually deploy a local build to kermeta.org  (nightly)

after a successful build (not error, no failed test)

from the root of the repository

```
ant -Denv.WORKSPACE=`pwd` -Dkey.file=~/.ssh/kermeta_bot/id_rsa -f k3.eclipse/fr.inria.diverse.k3.eclipse.root/promotion_build.xml
```
