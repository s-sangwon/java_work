package logic.sample;

import java.util.Scanner;

public class WhileSample {
	
	private Scanner sc = new Scanner(System.in);
	
	//Constructor
	//생성자가 없는 클래스는 컴파일할 때 기본생성자(매개변수 없는 생성자)
	//자동 추가하면서 class 파일이 만들어짐
	
	//Method
	public void testWhile1() {
		//키보드로 문자하나 입력받아, 유니코드 출력
		//종료조건 '0'문자 입력시 반복 종료됨.
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
		while ((ch=sc.next().charAt(0)) != '0') {
			System.out.println(ch + " is unicode " + (int)ch);
			System.out.print("문자 입력 : ");
		}
	}
	
	public void testWhile2() {
		//키보드로 문자하나 입력받아, 유니코드 출력
		//종료조건 '0'문자 입력시 반복 종료됨.
		System.out.print("문자 입력 : ");
		char ch;
		while ((ch=sc.next().charAt(0)) != '0') {
			System.out.println(ch + " is unicode " + (int)ch);
			System.out.print("문자 입력 : ");
		}
	}
	
	public void containChar() {
		/* 입력 예 :
		 * 문자열 입력 : apple
		 * 문자입력 : p
		 * 
		 * 반복 처리 내용 : 문자열 안에 입력받은 문자가 몇 개
		 * 							포한되어 있는지 갯수 카운트
		 * 
		 * 출력 : "apple 에 포함된 p 의 개수는 2개"
		 */
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
		int i = 0;
		int count = 0;
		while(i<str.length()) {
			if(ch == str.charAt(++i))
				count++;
		}
		System.out.println(str + " 에 포함된 " + ch + " 의 개수는 " + count+"개");
		
	}
	//매개변수(parameter) : 메소드 실행시 메소드로 전달오는 값 받는 변수
	//전달인자(argument) : 실행하는 메소드 쪽으로 전달되는 값
	public void sumNumber(int bound) {
		//1부터 bound 까지의 정수들의 합계를 구해서 출력 처리
		//단, 전달값은 1이상의 양수여야 함
		int i =0, re=0;
		
		while(i < bound) {
			re += ++i;
		}
		System.out.println(re);
	}
}
