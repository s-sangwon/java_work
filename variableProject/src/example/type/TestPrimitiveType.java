package example.type; // 패키지 선언문은 반듯 첫 줄에 작성

//  클래스 작성함 : 클래스명이 파일명임. 클래스명. java (원시 소스파일이라고 함.)
// => 컴파일함(기계어로 번역한 소스파일을 만듦) : 클래스명.class
//  =>  jvm 위에서 실행됨

//다른 클래스 또는 다른 패키지에 소속된 클래스를 사용하려면
//import 패키지명.클래스명; 선언해야 함
import java.util.Scanner;
import java.text.*;

public class TestPrimitiveType { 

	public static void main(String[] args) {
		//  프로그램을 실행시킬 때 이용하는 메소드임
		// 자바는  main method 의 signature 를 정해놓았음
		
		System.out.println("변수와 자료형 테스트");
		
		//자바에서 다른 클래스가 가진 메소드를 실행하려면.
		//해당 클레스에 대한 객체 생성부터 해야 함
		//클래스명 참조변수 = new 클래스명();
		//참조변수.메소드명();
		
		VariableSample vsamp = new VariableSample();
		vsamp.useprimitiveType();
	}

}
