package ShapeFactories;

import Circles.*;

public class CircleFactory implements ShapeFactory {

	public Shape getShape(ShapeType type){

		if (type == ShapeType.BIG_CIRCLE)
			return new BigCircle();

		else if (type == ShapeType.MEDIUM_CIRCLE)
			return new MediumCircle();

		else if (type == ShapeType.SMALL_CIRCLE)
			return new SmallCircle();

		else
			return null;
	}



}