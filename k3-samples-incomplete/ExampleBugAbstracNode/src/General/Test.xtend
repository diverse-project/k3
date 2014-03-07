package General

import geometry.Schema
import static extension geometryAspect.SchemaAspect.*


class Test {
	def static void main(String[] args) {
		println('test')
		
		var Schema sc = new Schema
		sc.setFigure('carre')
		sc.display
	}
}