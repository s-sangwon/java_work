package inherit.polymorphism.model;

import test.abst.IShape;

public class Triangle implements IShape {
	private double base, height;

	public Triangle() {
		super();
	}

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public double area() {
		return base*height/2;
	}

	@Override
	public double perimeter() {
		return base+height+getHypotenuse();
	}
	
	public double getHypotenuse() {
		return Math.sqrt(base*base + height*height);
	}
	
}
