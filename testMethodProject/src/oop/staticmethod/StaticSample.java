package oop.staticmethod;

/**
 * static 예약어
 * - 필드 선언시
 * - 메소드 시그니처 정의시
 * - 내부클래스 정의시
 * => 정적 메모리(static) 영역에 할당하라는 의미임
 */
public class StaticSample {
	//Field
	private static  int count; // 클래스변수
	private String name; //인스턴스 변수
	// 객처 == 인스턴스 instance
	//객체 생성시 객체 안에 만들어짐, 객체소멸시 사라짐
	//객체 소멸은 java virtual machine 의 garbage collector 구동시 제거됨
	
	
	//Method
	public static void setCount(int count) { 
		StaticSample.count = count; 
	}
	
	public static int getCount() {
		return count;
	}
	
}
