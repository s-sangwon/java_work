package logic.sample;

import java.util.Scanner;

/**
 *  if(조건표현식) {
 *  }
 *  else {
 *  }
 *
 */
public class IfElseSample {
	//Field
	//Constructor
	
	//method
	public void testIfElse1() {
		System.out.print("정수 입력 : ");
		int n;
//		if ((n = new Scanner(System.in).nextInt()) % 2 == 0) {
//			System.out.println(n + " is even.");
//		} else {
//			System.out.println(n + " is odd.");
//		}
		
		//실행 구문 하나면 블럭생략가능
		if ((n = new Scanner(System.in).nextInt()) % 2 == 0) 
			System.out.println(n + " is even.");
		 else 
			System.out.println(n + " is odd.");
		
	}
	
	public void testIfElse2() {
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat;
		System.out.print("국어 : ");
		kor = sc.nextInt();
		
		System.out.print("영어 : ");
		eng = sc.nextInt();
		
		System.out.print("수학 : ");
		mat = sc.nextInt();
		
		int tot = kor + eng + mat;
		double avg = tot / 3.;
		
		if ( kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60.) {
			System.out.println("합격!");
		} else {
			System.out.println("불합격!");
		}
	}
	
	public void testIfElse3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력 : ");
		int a = sc.nextInt();
		System.out.print("두번째 정수를 입력 : ");
		int b = sc.nextInt();
		if ( a>0 && b > 0) {
			System.out.println(a + " + " + b + "= " + (a+b));
			System.out.println(a + " - " + b + "= " + (a-b));
			System.out.println(a + " * " + b + "= " + (a*b));
			System.out.println(a + " / " + b + "= " + (a/b));
			System.out.println(a + " % " + b + "= " + (a%b));
		} else {
			System.out.println("양수가 아닌 값은 계산할 없습니다.");
		}
		
	}
}
