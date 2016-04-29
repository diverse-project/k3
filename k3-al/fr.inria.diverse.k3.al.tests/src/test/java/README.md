## Test


Important note :
when the test are complex enough (large base structure) the bug https://github.com/diverse-project/k3/issues/45 is quite annoying for having realistic tests.

To workaround this, the *fr.inria.diverse.k3.al.tests* project uses a *fr.inria.diverse.k3.al.tests.base* project which may contain the bases classes for the tests.
In order to be associated properly, the folders in *base* must use the same names as the tests folders.