package oop.inheritance.run;

import oop.inheritance.sample.Rectangle;

public class TestInheritance2 {

	public static void main(String[] args) {
		// 상속구조에서 생성자 호출 관계
		
		Rectangle ref = new Rectangle();
		System.out.println(ref.info());
		
		Rectangle ref2 = new Rectangle(10, 10);
		System.out.println(ref2.info());
		
		Rectangle ref3 = new Rectangle(20, 20, 400, 80);
		System.out.println(ref3.info());
		
		//면적과 둘레 계산처리
		ref2.calculator();
		System.out.println(ref2.info());
		
		//면적과 둘레 계산을 외부에서 처리한다면
		
		ref.setWidth(2.);
		ref.setHeight(3.);
		
		ref.setArea(ref.getWidth() * ref.getHeight());
		ref.setPerimeter(2 * (ref.getWidth() + ref.getHeight()));
		System.out.println(ref.info());
		
		//clone() 사용 : 복사본 객체 만들기(새 객체 생성)
		Rectangle ref4 = (Rectangle)ref.clone();
		System.out.println(ref.hashCode());
		System.out.println(ref4.hashCode());
		System.out.println("주소 비교 : " + (ref == ref4)); //false
		System.out.println("인스턴스 변수값 비교 : " + (ref.equals(ref4)));
	}

}
