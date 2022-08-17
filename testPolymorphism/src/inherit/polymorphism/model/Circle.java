package inherit.polymorphism.model;

import test.abst.IShape;

public class Circle implements IShape {
	// Field
	double radius;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {

		return Math.PI * radius * radius;
	}

	@Override
	public double perimeter() {

		return Math.PI * radius * 2;
	}
}
