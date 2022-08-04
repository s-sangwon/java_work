package operator.sample;

import java.util.Scanner;

//삼항연산자 테스트용 클래스
//13순위 : 항목이 3개인 연산자
//결과변수 = (조건식)? 참일 때 선택할 값: 거짓일 때 선택할 값;
//처리구문 조건식 ? 참값 : 거짓값
public class TernayOperator {
	//키보드로 정수를 하나 입력받아, 그 수의 절대값을 출력하는 메소드
	//절대값 : 모든 정수의 양수
	public void testAbs() {
		System.out.print("정수 하나 입력 : ");
		int num = new Scanner(System.in).nextInt();
		int absnum = num > 0 ? num : -num;
		
		System.out.println(num + "의 절대값 : " + absnum);
	}
	
	public void testNestion() {
		System.out.print("문자 하나 입력 : ");
		char ch = new Scanner(System.in).next().charAt(0);
		
		String re = (ch  >= 'a') && (ch <= 'z') ? "Lower": 
							(ch >= 'A') && (ch <= 'Z') ? "Upper": 
							(ch>='0') && (ch<='9') ?  "Number"  : "Other";
		
		System.out.println(re);
	}
}
