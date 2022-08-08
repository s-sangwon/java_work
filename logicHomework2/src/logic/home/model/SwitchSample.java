package logic.home.model;

import java.util.Scanner;

public class SwitchSample {
	Scanner sc = new Scanner(System.in);
	  public void calculator(){
		  System.out.print("첫번째 정수 : ");
			int first = sc.nextInt();
			System.out.print("두번째 정수 : ");
			int second = sc.nextInt();
			System.out.print("연산문자(+,-,*,/,%) : ");
			char op = sc.next().charAt(0);
			
			int result = 0;  //지역변수(local variable)은 반드시 초기화함
			
			//case 에 문자값도 제시할 수 있음
			switch(op) {
			case '+':	result = first + second;		break;
			case '-':	result = first - second;		break;
			case '*':	result = first * second;		break;
			case '/':	result = first / second;		break;
			case '%':	result = first % second; 	break;
			default:	System.out.println("잘못 입력하였습니다.");
			        System.out.println("확인하고 다시 진행하세요.");
			}
			
			System.out.println(first + " " + op + " " + second
					+ " = " + result);
	  }
	  public void fruitPrice(){
		  System.out.print("과일명 : ");
			String fruitName = sc.next();
			
			int price = 0;
			
			//jdk1.7부터 case 에 문자열값 사용할 수 있음
			switch(fruitName) {
			case "사과":	price = 1200;	 break;
			case "배":		price = 2500;	 break;
			case "포도":	price = 5000;	 break;
			case "오렌지":	price = 700;	 break;
			case "키위":	price = 350;	 break;
			default:	System.out.println("품절되었습니다.");
			}
			
			System.out.println(fruitName + " : " + price + "원");

	  }
}
