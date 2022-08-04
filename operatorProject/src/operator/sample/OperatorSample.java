package operator.sample;

import java.util.Scanner;

/**
 * 자바가 제공하는 연산자 사용 확인용 클래스이다.
 * 2022/8/3 제작됨
 * 자바가 제공하는 45개의 연산자를 확인하기 위한 메소드를 제공한다.
 * */
public class OperatorSample {
	/**
	 * 변수 초기화 테스트용 메소드
	 * 변수 초기화란, 변수 선언과 동시에 초기값을 기록하는 것을 말한다.
	 * 구문은 다음과 같이 작성함.
	 * 자료형 변수명 = 초기값;
	 * */
	public void initVairable() {

	}
	
	public void initInputVariable() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사번 : ");
		String empId = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("급여 : ");
		int salary = sc.nextInt();
		System.out.print("보너스포인트(소숫점 둘째자리까지) : ");
		double bonusPct = sc.nextDouble();
		System.out.print("결혼여부[기혼:Y,미혼:N] : ");
		char marriage = sc.next().toUpperCase().charAt(0);
		
		int pay = (int)(salary + (salary * bonusPct) * 12);
		
		System.out.println("사번 : " + empId);
		System.out.println("이름 : " + name);
		System.out.println("급여 : " + salary);
		System.out.println("보너스포인트 : " + bonusPct);
		System.out.println("결혼여부 : " + marriage);
		System.out.println("1년연봉 : " + pay);
	}
	
	//15순위 : 나열연산자(,)
	public void testComma() {
		int a = 10;
		int b, c=30;
		
		System.out.println(a + "\t");
		

	}
	
	//최우선연산자(1순위) : (), . , [], ->
	public void testLevel1() {
		System.out.println("result1 : "+ (10 + 20 * 30));
		System.out.println("result1 : "+ ((10 + 20) * 30));
	}
	
	//단항 연산자(2순위) : 부호(sign) 연산자 (+, -)
	//정수를 하나 입력받아, 양수이면 그대로 출력하고
	//음수이면 양수로 바꿔서 출력
	public void testSign() {
		System.out.print("정수 하나 입력 : ");
		int value = new Scanner(System.in).nextInt();
		
		//삼항연산자(13순위) : 항목이 3개
		//결과변수 = (조건식) ? 참일때 선택값: 거짓일떄 선택값;
		int result = value > 0 ? value : -value;
		System.out.println("value : " + value);
		System.out.println("result : " + result);
	}
	
	//단항 연산자 : 논리부정연산자 (! : boolean not)
	//논리값 : true, false 을 반대로 바꾸는 연산자
	//이항연산자 : 비교연산자( >, >=, <, <=, ==, !=) => 결과가 true|false
	public void testBooleanNot() {
		int first = 10, second = 20;
		
		System.out.println(first + " > " + second + " : " + (first> second));
		System.out.println("!(" + first + " > " + second + ") : " + !(first> second));
		
		System.out.println(first + " <" + second + " : " + (first< second));
		System.out.println("!(" +first + " < " + second + ") : " + !(first< second));
		
		System.out.println(first + " == " + second + " : " + (first== second));
		System.out.println("!(" + first + " == " + second + ") : " + !(first== second));
		
		System.out.println(first + " != " + second + " : " + (first!= second));
		System.out.println("!(" + first + " != " + second + ") : " + !(first!= second));
	}

	public void testIncDec() {
		int num = 12;
		System.out.println("num : " + num);
		
		num++;
		System.out.println("num : " + num);
		++num;
		System.out.println("num : " + num);
		
		num--;
		System.out.println("num : " + num);
		--num;
		System.out.println("num : " + num);
		
		// 증감구문이 다른 계산식이나 다른 구문의 일부로 사용될 경우
		//증감연산자 위치를 구분해야 함
		//부분사용시, 변수 뒤에 위치하면 연산 후증감을 뜻함 : 후증감
		//부분사용시, 변수 앞에 위치하면 증감후 연산을 뜻함 : 선증감
		
		int result = 3 + num++  * 2;
		// 계산하고 대입한 다음에1증가 시켜라. (처리 후 증가)
		// result = 3 + 12 * 2; --> result : 27, num : 13
		
		System.out.println("result : " + result); // 27
		
	}
	
	
	
}
