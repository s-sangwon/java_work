// 1. 패키지 선언문 : 반드시 첫줄에 작성
package example.type;

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
	public void useprimitiveType() {
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

}
