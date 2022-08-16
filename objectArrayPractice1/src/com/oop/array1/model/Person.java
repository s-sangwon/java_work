package com.oop.array1.model;

public class Person {
	private String name;
	private int age;
	private double height;
	private int property;
	private double weight;
	public Person(String name, int age, double height, int property, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.property = property;
		this.weight = weight;
	}
	public Person() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getProperty() {
		return property;
	}
	public void setProperty(int property) {
		this.property = property;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", height=" + height + ", property=" + property + ", weight="
				+ weight + "]";
	}
	
	

}
