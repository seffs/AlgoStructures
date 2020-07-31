package solution.interfaces;

import presets.interfaces.Vector;

public class CartesianVectorTest extends presets.interfaces.VectorTest {

	@Override
	public Vector createVector(double x, double y) {
		return new CartesianVector();
	}

}
