package oop.polymorphism;

public class ClassD extends ClassB{
	public ClassD() {}
	
	@Override
	public String toString() {
		return "ClassD toString() run!";
	}
	
	public void methodD() {
		System.out.println("ClassD methodD() run!");
	}
}
