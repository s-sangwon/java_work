package oop.polymorphism;

public class ClassB extends ClassA {
	public ClassB() {}
	
	@Override
	public String toString() {
		return "ClassB toString() run!";
	}
	
	public void methodB() {
		System.out.println("ClassB methodB() run!");
	}
}
