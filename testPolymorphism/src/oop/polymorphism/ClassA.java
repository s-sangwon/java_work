package oop.polymorphism;

public class ClassA {
	//java.lang.Object 의 후손
	
	public ClassA() {}
	
	@Override
	public String toString() {
		return "ClassA toString() run";
	}
	
	public void methodA() {
		System.out.println("ClassA methodA() run!");
	}
	
	
}
