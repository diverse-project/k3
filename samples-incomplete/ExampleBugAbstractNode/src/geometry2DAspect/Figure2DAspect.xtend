package geometry2DAspect

import fr.inria.triskell.k3.Aspect
import geometryAspect.FigureAspect
import geometry2D.Carre
import geometry2D.Rectangle

class Figure2DAspect {
	
}


@Aspect(className=typeof(Carre))
class CarreAspect extends FigureAspect {
	
}

@Aspect(className=typeof(Rectangle))
class RectanlgeAspect extends FigureAspect {
	
}