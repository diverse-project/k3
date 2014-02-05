package xtendFlatShort

import fr.inria.diverse.k3.sample.fr.inria.diverse.k3.sample.loadXtendModelFromXtend.TestParseStandalone
import java.util.ArrayList
import org.eclipse.xtend.core.linking.LinkingProxyAwareResource

import static extension xtend.LinkingProxyAwareResourceAspect.*
import java.util.List

class RunnerXtendFlatShortModel {
	
	def static void main(String[] args)  {		
		var listeSrc = new ArrayList<String>()
		listeSrc.add("C:\\Users\\vfontane\\workspace\\HelloWorldXtend\\src\\")
		
		var String trace = "C:\\Users\\vfontane\\workspace\\HelloWorldXtend\\target\\trace"
		var String bin = "C:\\Users\\vfontane\\workspace\\HelloWorldXtend\\target\\bin"
		
		new RunnerXtendFlatShortModel().run(listeSrc, trace, bin, null)
		
	}
	
	def void run(List<String> listeSrc, String trace, String bin, List<String> classpath) {
		var parser = new TestParseStandalone()
		
		var res = parser.parse(listeSrc, trace, bin, classpath)
		
		for (ll : res.resources) {
			if(ll instanceof LinkingProxyAwareResource) {
				(ll as LinkingProxyAwareResource).eval()
			}
		}	
	}
		
}