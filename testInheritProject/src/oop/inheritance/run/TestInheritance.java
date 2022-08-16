package oop.inheritance.run;

import oop.inheritance.sample.Shape;

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Shape();
		//protected 멤버는 비상속시 패키지 밖에서 사용 못 함
		
//		System.out.println(shape.info()); //error
		 
		Shape ref = shape; //주소 복사  shallow copy
		System.out.println("shape이 참조하는 객체 정보 : " + shape);
		System.out.println("ref이 참조하는 객체 정보 : " + ref);
		System.out.println("주소 비교 : " + shape.equals(ref));
		
		Shape shape2 = new Shape(10.,20.);
		
		System.out.println("주소 비교 : " + shape.equals(shape2));
		
		
		Shape ref2 = (Shape)shape2.clone(); // down casting
			
		System.out.println("ref2이 참조하는 객체 정보 : " + ref2);
		
		System.out.println(shape2.equals(ref2));
		
		System.out.println(shape2.hashCode());
		System.out.println(ref2.hashCode());
	}
	
}
