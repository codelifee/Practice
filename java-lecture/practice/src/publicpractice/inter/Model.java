package publicpractice.inter;

import publicpractice.inter.model.IShapeClass;
import publicpractice.inter.model2.Circ;
import publicpractice.inter.model2.Rect;
import publicpractice.inter.model2.Tria;

public class Model {
	
	static void draw(IShapeClass input) {
		input.draw();
	}

	public static void main(String[] args) {
		draw(new Circ());
		draw(new Rect());
		draw(new Tria());
	}
}
