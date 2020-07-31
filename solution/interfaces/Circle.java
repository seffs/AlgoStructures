package solution.interfaces;

import presets.interfaces.*;

public class Circle extends AbstractCircle{
	
	
	public Circle(Vector middlePoint, double radius) 
	{super(middlePoint,radius);}
	
	public Circle(double radius) {super(radius);}
	
	@Override
	public void scale(double factor) { if (factor >= 0) { this.radius = factor * radius;} }
	
	@Override
	public double area() {return getRadius() * getRadius() * Math.PI;}
	
	@Override
	public double getDimension() {return getRadius();}
}
