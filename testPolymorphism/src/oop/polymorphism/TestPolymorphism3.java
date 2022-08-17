package oop.polymorphism;

import java.util.Date;

public class TestPolymorphism3 {
	//메소드 오버로딩(overloading) : 메소드 중복
	//한 클래스 안에서 이름이 같은 메소드를 여러 개 작성하는 것
	//매개변수를 반드시 다르게 구성해야 함 : 갯수, 자료형 나열순서
	
	public void test(ClassA ref) {
		System.out.println(ref);
	}
	
	public void test(ClassB ref) {
		System.out.println(ref);
	}
	
	public void test(ClassC ref) {
		System.out.println(ref);
	}
	
	public void test(ClassD ref) {
		System.out.println(ref);
	}
	
	public void test(Date ref) {
		System.out.println(ref);
	}
	
	public void test(String ref) {
		System.out.println(ref);
	}
	
	public static void main(String[] args) {
		// 오버로딩된 메소드 사용 테스트
		TestPolymorphism3 poly = new TestPolymorphism3();
		
		//메소드 매개변수에 다형성을 적용하면
		//메소드 오버로딩 갯수를 줄일 수 있음
		poly.test(new ClassA());
		poly.test(new ClassB());
		poly.test(new ClassC());
		poly.test(new ClassD());
		poly.test(new Date());
		poly.test(new String("다형성 테스트"));
		
		
		
	}

}
