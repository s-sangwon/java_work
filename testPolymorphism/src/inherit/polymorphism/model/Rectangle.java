package inherit.polymorphism.model;

import test.abst.IShape;

public class Rectangle implements IShape  {
	//Field
	double width,heigth;
	
	
	public Rectangle() {
		super();
	}
	public Rectangle(double width, double heigth) {
		super();
		this.width = width;
		this.heigth = heigth;
	}

	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeigth() {
		return heigth;
	}
	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	
	@Override
	public double area() {
		
		return width*heigth;
	}

	@Override
	public double perimeter() {

		return (width+heigth) * 2;
	}
	
}
