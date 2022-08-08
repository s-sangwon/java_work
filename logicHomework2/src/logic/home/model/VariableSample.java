package logic.home.model;
import java.util.Scanner;

public class VariableSample {
 //5
	Scanner sc = new Scanner(System.in);
	boolean bool;	//true or false 만 기록할 수 있음. 1바이트
	char ch;  //문자값 한개만 기록할 수 있음. 2바이트
	byte byt2;	//1바이트 정수를 기록함(-128~127)
	short sValue;	//2바이트 정수를 기록함(-32768~32767)
	int intValue;	//4바이트 정수 기록 (-2147483648~2147483647)
	long longValue; //int 보다 큰 정수 기록, 8바이트(2의 63승)
	float fValue;			//4바이트 실수형
	double dValue;		//8바이트 실수형
	
	public void myProfile() {
		String name = "서상원";
		int age = 26;
		char gender = '남';
		double height = 175.5;
		double weight = 65.5;
		String phone = "010-3049-6533";
		String email = "tjgyqo2@gmail.com";
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("성별 : " + gender);
		System.out.println("전화번호 : " + phone);
		System.out.println("이메일 : " + email);
	}
	
	public void empInformation() {
		String name, phone, email;
		int age;
		char gender;
		double height, weight;
//		double weight;
//		String phone;
//		String email;
		
		//키보드 입력
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		System.out.print("성별 입력 : ");
		gender = sc.next().charAt(0);
		System.out.print("키 입력 : ");
		height = sc.nextDouble();
		System.out.print("몸무게 입력 : ");
		weight = sc.nextDouble();
		System.out.print("전화번호 입력 : ");
		phone = sc.next();
		System.out.print("이메일 입력 : ");
		email = sc.next();
		
		//출력 확인
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("전화번호 : " + phone);
		System.out.println("이메일 : " + email);

	}

	public void defaultValue() {

		System.out.println("\n초기값 확인하기 위해 클래스의 필드로 초기화하지 않고 선언.");
		System.out.println("boolean : " + bool + "\n" 
				+ "char : " + (int)ch + "\n"
				+ "byte : " + byt2 + "\n"
				+ "short : " + sValue + "\n"
				+ "int : " + intValue + "\n"
				+ "long : " + longValue + "\n"
				+ "float : " + fValue + "\n"
				+ "double : " + dValue);
		
		
	}
	
	
}
