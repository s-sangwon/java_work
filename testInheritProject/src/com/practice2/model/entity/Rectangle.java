package com.practice2.model.entity;

public class Rectangle extends Point {
	//Field
	private int width;
	private int height;
	//Construtor
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public void draw() {
		super.draw();
		System.out.println("면적 : "+ width*height);
		System.out.println("둘레 : "+ 2*(width+height));
	}

}
