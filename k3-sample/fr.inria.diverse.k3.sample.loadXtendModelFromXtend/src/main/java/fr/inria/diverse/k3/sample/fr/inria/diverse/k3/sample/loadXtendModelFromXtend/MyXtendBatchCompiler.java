package fr.inria.diverse.k3.sample.fr.inria.diverse.k3.sample.loadXtendModelFromXtend;

import java.io.File;
import java.util.List;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend.core.compiler.batch.XtendBatchCompiler;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.validation.Issue;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

public class MyXtendBatchCompiler extends XtendBatchCompiler{

	
	private ResourceSet resourceSet;



	public ResourceSet getResourceSet() {
		return resourceSet;
	}



	private final static class SeverityFilter implements Predicate<Issue> {
		private static final SeverityFilter WARNING = new SeverityFilter(Severity.WARNING);
		private static final SeverityFilter ERROR = new SeverityFilter(Severity.ERROR);
		private Severity severity;

		private SeverityFilter(Severity severity) {
			this.severity = severity;
		}

		public boolean apply(Issue issue) {
			return this.severity == issue.getSeverity();
		}
	}


	
	public boolean compile() {
		try {
			resourceSet = resourceSetProvider.get();
			File classDirectory = createTempDir("classes");
			// install a type provider without index lookup for the first phase
			installJvmTypeProvider(resourceSet, classDirectory, true);
			loadXtendFiles(resourceSet);
			File sourceDirectory = createStubs(resourceSet);
			if (!preCompileStubs(sourceDirectory, classDirectory)) {
				//log.debug("Compilation of stubs and existing Java code had errors. This is expected and usually is not a probblem.");
			}
			// install a fresh type provider for the second phase, so we clear all previously cached classes and misses.
			installJvmTypeProvider(resourceSet, classDirectory, false);
			EcoreUtil.resolveAll(resourceSet);
			List<Issue> issues = validate(resourceSet);
			Iterable<Issue> errors = Iterables.filter(issues, SeverityFilter.ERROR);
			Iterable<Issue> warnings = Iterables.filter(issues, SeverityFilter.WARNING);
			reportIssues(Iterables.concat(errors, warnings));
			if (!Iterables.isEmpty(errors)) {
				return false;
			}
			//generateJavaFiles(resourceSet);
		} finally {
			if (isDeleteTempDirectory()) {
				deleteTmpFolders();
			}
		}
		return true;
	}

}
