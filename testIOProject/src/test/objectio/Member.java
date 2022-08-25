package test.objectio;

import java.io.Serializable;

public class Member implements Serializable {
	// Field
	private String name;
	private int age;
	private char gender;
	private double height;
	private transient double weigth;
	private transient int count;
	public Member() {
		super();
	}
	public Member(String name, int age, char gender, double height, double weigth) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weigth = weigth;
	}
	public Member(String name, int age, char gender, double height, double weigth, int count) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weigth = weigth;
		this.count = count;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", gender=" + gender + ", height=" + height + ", weigth="
				+ weigth + "]";
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeigth() {
		return weigth;
	}
	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	
}
