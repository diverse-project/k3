package fr.inria.diverse.k3.sample.fr.inria.diverse.k3.sample.loadXtendModelFromXtend;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.newArrayList;
import static org.eclipse.xtext.util.Strings.concat;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.ResourceSet;

import com.google.common.base.Predicate;
import com.google.inject.Injector;



public class TestParseStandalone {
/**
 * 
 * @param srcDirs (where are the xtend file)
 * @param tmpDir (where the trace will be generated)
 * @param outputDir (where the bin can be compile)
 * @param classpath can be null (in this case, it takes the current classpaths)
 * @return
 */
	public ResourceSet parse(List<String> srcDirs, String tmpDir,
			String outputDir, List<String> classpath) {
		Injector injector = new XtendStandaloneSetup()
				.createInjectorAndDoEMFRegistration();
		MyXtendBatchCompiler instance = injector
				.getInstance(MyXtendBatchCompiler.class);

		MyProjectResourceSetProvider rsprovide = new MyProjectResourceSetProvider();

		instance.setResourceSetProvider(rsprovide);


		List<String> classpaths = new ArrayList<String>();
		if (classpath != null) {
			classpaths = classpath;
		} else {

			for (URL u : ((URLClassLoader) (Thread.currentThread()
					.getContextClassLoader())).getURLs()) {
				classpaths.add(u.getPath());
			}
		}
		String classPath = concat(File.pathSeparator, classpaths);

		Iterable<String> filtered = filter(srcDirs, FILE_EXISTS);
		instance.setTempDirectory(tmpDir);
		instance.setDeleteTempDirectory(false);
		instance.setClassPath(classPath);
		instance.setSourcePath(concat(File.pathSeparator,
				newArrayList(filtered)));
		instance.setOutputPath(outputDir);
		instance.setFileEncoding("UTF-8");
		instance.setWriteTraceFiles(true);
		instance.compile();
		return instance.getResourceSet();

	}

	protected static final Predicate<String> FILE_EXISTS = new Predicate<String>() {

		public boolean apply(String filePath) {
			return new File(filePath).exists();
		}
	};
}
