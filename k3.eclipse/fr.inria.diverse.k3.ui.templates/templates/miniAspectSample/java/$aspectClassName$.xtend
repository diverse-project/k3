package $packageName$;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import java.io.PrintWriter
import java.util.ArrayList

/**
 * Sample aspect that gives java.io.File the ability to store Text content and save it to disk
 */
@Aspect(className=java.io.File)
class $aspectClassName$ {
	
	var String contentType = ""
	
	var ArrayList<String> contentArrayList = newArrayList("")
	
	public def void writeXML(){		
		var PrintWriter writer = new PrintWriter(_self, "UTF-8");
		// compute content String by using template
		val content = '''<xml>
	<«_self.contentType»s>	
		«FOR contentItem : _self.contentArrayList »<color>«contentItem»</color> «ENDFOR»
	</«_self.contentType»s>
</xml>'''
		writer.println(content);
		writer.close();
	}
	
}