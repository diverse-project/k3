package geometry

import geometry2D.Carre
import geometry2D.Rectangle

abstract class Figure {
	
}

class Schema {
	public Figure figure
	
	def public void setFigure (String fig) {
		if(fig == 'carre') {
			figure = new Carre
		}
		else {
			figure = new Rectangle			
		}
	}
}