package oop.abst;

public abstract class AbstractSample {
	
	//Constructor;
	public AbstractSample() {}
	
	//Method
	//추상(미완성) 메소드 : 메소드 헤드 선언만 하고, 메소드 바디가 없는 메소드
	public abstract void abstMethod();
	//추상 메소드를 멤버로 가진 클래스는 반드시 abstract class 로 표기해야 함
	
	public final void display() {
		System.out.println("final method test");
	}
}
