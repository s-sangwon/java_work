package com.practice2.model.entity;

public class Circle extends Point{
	//Field
	private int radius;

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override 
	public void draw() {
		super.draw();
		System.out.println("원면적 : "+ Math.round(Math.PI* radius*radius*10)/10.);
		System.out.println("원둘레 : "+ Math.round(Math.PI* radius*2*10)/10.);

	}

	public void draw2() {
		System.out.printf("원면적 : %.2f\n", Math.PI* radius*radius);
		System.out.printf("원둘레 : %.2f", Math.PI* radius*2);
	}





	
}
