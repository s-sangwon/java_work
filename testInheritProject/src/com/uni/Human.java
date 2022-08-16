package com.uni;

public class Human {
	protected String name;
	protected int age;
	protected int height;
	protected int weight;
	public Human() {
		super();
	}
	public Human(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
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
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	

	public String printInformation() {
		return new Human(name, age, height, weight).toString();
//		return this.toString();
		//return "Human [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
	

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}

	
}
