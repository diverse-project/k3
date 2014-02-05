package geometryAspect

import fr.inria.triskell.k3.Aspect
import geometry.Figure
import geometry.Schema

import static extension geometryAspect.FigureAspect.*

@Aspect(className=typeof(Figure))
abstract class FigureAspect {
	
	def public void display ()
}

@Aspect(className=typeof(Schema))
class SchemaAspect {
	
	def public display () {
		_self.figure.display
	}
	
}