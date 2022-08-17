package oop.polymorphism;

public class ClassC extends ClassA{
	public ClassC() {}
	
	@Override
	public String toString() {
		return "ClassC toString() run!";
	}
	
	public void methodC() {
		System.out.println("ClassC methodC() run!");
	}
}
