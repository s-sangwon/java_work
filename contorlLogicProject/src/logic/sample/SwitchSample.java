package logic.sample;

import java.util.Scanner;

public class SwitchSample {
	//Field
	//Constructor : 클래스에 생성자 코드 없으면, 자동으로 기본생성자 추가됨
	
	//method
	
	public void test1() {
		System.out.print("번호 선택[1, 2, 3] : ");
		int no = new Scanner(System.in).nextInt();
		
		String message = null;
		
		switch (no) {
		case 1: message="안녕하세요"; break;
		case 2: message="어서오세요"; break;
		case 3: message="환영합니다"; break;
		default: message="안녕히 가세요"; break;
		}
		
		System.out.println(no + " : " + message);
	}
	
	public void calculator() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int a = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int b = sc.nextInt();
		System.out.print("연산자(+, -, *, /, %) : ");
		char op = sc.next().charAt(0);
		int re;
		switch (op) {
		case '+': re= a+b; break;
		case '-':  re= a-b; break;
		case '*':  re= a*b; break;
		case '/':  re= a/b; break;
		case '%':  re= a%b; break;
		default:
			re=0; break;
		}
		System.out.println(a+" "+ op+" "+b +" = " + re);
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("과일명 : ");
		String fruitName = sc.next();
		System.out.print("수량 : ");
		int a = sc.nextInt();
		
		int price = 0;
		
		switch(fruitName) {
		case "사과":	price = 1200; break;
		case "배":	price = 2500; break;
		case "포도":	price = 5000; break;
		case "오렌지":	price = 700; break;
		case "키위":	price = 500; break;
		default: System.out.println("품절됨.");
		}
		System.out.println(fruitName + " : " + price + "원, "
				+ a + "개 => 구매가격 : "
				+ (a * price) + "원");
		
	}
	
	public void calculator2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int a = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int b = sc.nextInt();
		System.out.print("연산자(+, -, *, /, %) : ");
		char op = sc.next().charAt(0);
		int re=0;
//		switch (op) {
//		case '+': re= a+b; break;
//		case '-':  re= a-b; break;
//		case '*':  re= a*b; break;
//		case '/':  re= a/b; break;
//		case '%':  re= a%b; break;
//		default:
//			re=0; break;
//		}
		
		if(op == '+') re = a + b;
		else if (op == '-') re = a - b;
		else if (op == '*') re = a * b;
		else if (op == '/') re = a / b;
		else if (op == '%') re = a % b;
		else {
			System.out.println("잘못입력함 다시!");
		}
		
		System.out.println(a+" "+ op+" "+b +" = " + re);
	}
	
	public void test2ChangeIf() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("과일명 : ");
		String fruitName = sc.next();
		System.out.print("수량 : ");
		int a = sc.nextInt();
		
		int price = 0;
		
//		switch(fruitName) {
//		case "사과":	price = 1200; break;
//		case "배":	price = 2500; break;
//		case "포도":	price = 5000; break;
//		case "오렌지":	price = 700; break;
//		case "키위":	price = 500; break;
//		default: System.out.println("품절됨.");
//		}
		
		if ( fruitName.contentEquals("사과") ) price = 1200;
		else if (fruitName.contentEquals("배")) price = 2500;
		else if (fruitName.contentEquals("포도")) price = 5000;
		else if (fruitName.contentEquals("오렌지")) price = 700;
		else if (fruitName.contentEquals("키위")) price = 500;
		
		
		
		System.out.println(fruitName + " : " + price + "원, "
				+ a + "개 => 구매가격 : "
				+ (a * price) + "원");
		
		
	}
}
