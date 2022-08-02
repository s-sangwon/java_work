// 1. 패키지 선언문 : 반드시 첫줄에 작성
package example.type;

import java.util.Scanner;

//2. 필요한 크래스 import 선언


//3. 클래스 작성부
// 자바는 클래스명.java
// 클래스명은 반드시 첫글자가 여어 대문자로 작성할 것
public class VariableSample {
		//main method 가 없는 클래스는 기능 제공용  클래스임
	
	// 클래스에 소속되는 멤버들을 작성함
	// 멤버변수(Feild)
	// 생성자함수(Constructor) ==> 자바는 소멸자(Destructor) 없음
	// 자바는 jvm 이  동적메모리 관리를 자동으로 해 줌
	// 사용이 끝난 기억공간들(객체, 배열 등)을 찾아내서 자동 제거해 줌
	// 쓰레기 수집기 (Garbage Collector) 제공
	// 멤버함수(Method)
	// ** 클래스 안에 클래스 만들 수 있음 : 내부 클래스라고 함
	// inner class == nested class
	
	// 자바에서 클래스 안에 메소드 작성법 :
	// 접근제한자 [예약어] 반환자료형 메소드명(자료형 매개변수){ 코드 작성 } 
	public void usePrimitiveType() {
		// 기본자료형 확인용 메소드
		//자바는 기보자료형 8개 제공함
		//char, boolean, byte, short, int, long, float, double,
		
		//변수(variable) : 메모리(RAM)에 값을 기록하기 위한 방
		//자바에서는 변수 만들기하려면,
		//자료형 변수명;
		//어떤 종류의 값을 기록하는 방(기억공간)인지 미리 정함
		boolean flag; // true or false 만 기록할 수 있음. 1바이트
		char gender; // 문자값 한개만 기록할 수 있음. 2바이트
		byte bvalue; // 1바이트 정수를 기록함(-128~127)
		short svalue; // 2바이트 정수를 기록함(-32768~32767)
		int age;	// 4바이트 정수 기록(-2147483648~2147483647)
		long pay; // int 보다 큰 정수 기록, 8바이트(2^63)
		float tax; // 4바이트 실수형
		double salary; // 8바이트 실수형
		
		//준비된 변수방에 값 기록함
		//변수명 = 기록할값;
		//선언된 변수의 자료형과 일치하는 값을 기록해야 함
		//자료형과 일치하지 않는 값 기록시 에러 발생함
		flag = false;
		gender = '남'; // 문자하나만 기록할 수 있음
		// 문자 하나 표현시에는 반드시 작은따옴표 사용할 것
		// 문자 나열값(string)은 반드시 큰따옴표 사용할 것
		// '남' 과 "남"은 다름. (주의)
		
		bvalue = 100; //-128~127
		svalue = 30000;//-32768~32767
		age = 30;
		pay = 450000L;
		//iso 표준문법에서 long형 정수값은 반드시 숫자뒤에 대문자L 붙임
		
		tax = 0.03f;
		//iso 표준문법에서 float형 정수값은 반드시 숫자뒤에 소문자f 붙임
		salary = 580000.;
		
		System.out.println("flag : " + flag + "\n" 
					+ "gender : " + gender + "\n"
					+ "bvalue : " + bvalue + "\n"
					+ "svalue : " + svalue + "\n"
					+ "age : " + age + "\n"
					+ "pay : " + pay + "\n"
					+ "tax : " + tax + "\n"
					+ "salary : " + salary);
	}
// int, long, float, double, char, boolean, short, byte
	
	// 문자변수와 문자열변수 다루기
	public void userStrig( ) {

			// 파이썬에서는 문자와 문자열 구분안함
			// 자바는 구분함 ㅋ '' 단어하나 " " 문자열
		char ch = 'A'; // 문자 하나값은 작은따옴표로
		
		//문자나열값(문자열)은 기본자료형으로 제공되지 않는다.
		//자바에서는 String 클래스가 제공됨 : 문자열 취급 클래스임
		// 클래스 사용법 : 클래스명 참조변수 = new클래스명();
		// String str = new String();
		// 자바에서 String 클래스만 예외로 사용할 수 있게 제공함
		// String 을 기본자료형처럼 사용할 수 있게 제공
		String str = "java";
		str.substring(2,3);
		System.out.println(ch + str);
		
		
	}
	
	//실습
	//본인의 신상정보를 변수에 기록저장한 다음, 출력 확인
	//이름, 나이, 성별(남, 여), 키, 몸무게, 전화번호, 이메일
	//키와 몸무게는 소숫점아래 첫째자리까지 기록함
	
	public void printProfile() {
		String name = "서상원";
		int age  = 26;
		char gender = '남';
		float tall = 175.9f;
		float weight = 65.f;
		String phone = "010-3049-6533";
		String email = "tjgyqo2@gmail.com";
		
		System.out.println(name + ' ' + age + ' ' + gender + ' ' + tall + ' ' + weight + ' ' +
				phone + ' ' + email);
		
	}
	
	//키보드 입력 테스트용 메소드
	public void userScanner() {
		Scanner sc = new Scanner(System.in);
		
		//Scanner 가 제공하는 각 자료형별 값 입력용 메소드 사용
		// 자료형 변수명 = 참조변수.next자료형();
		System.out.print("문자열값 입력 : ");
		String str= sc.next();
		System.out.println(str);
	
		System.out.print("정수 숫자 입력 : ");
		int num = sc.nextInt();
		System.out.println("num : " + num);
		
		System.out.print("실수 숫자 입력 : " );
		double dnum = sc.nextDouble();
		System.out.println("dnum : " + dnum);
		
		System.out.print("논리값 입력 : ");
		boolean bool = sc.nextBoolean();
		System.out.println("bool : " + bool);
		
		//Scanner 에는 char 자료형 입력 기능 없음
		//문자하나를 String 으로 입력받아서
		//String 클래스의 문자하나 추출하는 메소드를 문자꺼냄
		System.out.print("문자하나 입력 : ");
//		String s = sc.next();
//		char ch = s.charAt(0);
		char ch = sc.next().charAt(0);
		System.out.println(ch);
	}
	
	// 본인 신상정보 저장할 변수 선언함
	// 각 변수에 키보드로 신상정보를 입력받아서 저장 처리함
	// 출력 확인
	public void inputProfile2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("name : ");
		String name = sc.next();
		
		System.out.print("age : ");
		int age = sc.nextInt();
		
		System.out.print("gender : ");
		char gender = sc.next().charAt(0);
		
		
		System.out.print("tall : ");
		double tall = sc.nextDouble();
		
		
		System.out.print("weight : ");
		double weight = sc.nextDouble();
		
		
		System.out.print("phone : ");
		String phone = sc.next();
		
		
		System.out.print("email : ");
		String email = sc.next();
		
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("gender : " + gender);
		System.out.println("tall : " + tall);
		System.out.println("weight : " + weight);
		System.out.println("phone : " + phone);
		System.out.println("email : " + email);
		
	}
	
	public void inputProfile() {
		Scanner sc = new Scanner(System.in);
		String name = "서상원";
		int age  = 26;
		char gender = '남';
		double tall = 175.9f;
		double weight = 65.f;
		String phone = "010-3049-6533";
		String email = "tjgyqo2@gmail.com";
		
		System.out.print("name : ");
		name = sc.next();
		
		
		System.out.print("age : ");
		age = sc.nextInt();
		
		
		System.out.print("gender : ");
		gender = sc.next().charAt(0);
		
		
		System.out.print("tall : ");
		tall = sc.nextDouble();
		
		
		System.out.print("weight : ");
		weight = sc.nextDouble();
		
		
		System.out.print("phone : ");
		phone = sc.next();
		
		
		System.out.print("email : ");
		email = sc.next();
		
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("gender : " + gender);
		System.out.println("tall : " + tall);
		System.out.println("weight : " + weight);
		System.out.println("phone : " + phone);
		System.out.println("email : " + email);
		
	}
	
	
}
