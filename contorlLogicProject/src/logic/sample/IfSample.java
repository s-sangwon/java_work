package logic.sample;

import java.util.Scanner;

/**
 * 조건문으로 if 문 사용 테스트용 샘플 클래스이다. 조건 표현식의 결과(true | false) 에 따라 준비된 내용을 선택해서 실행하는
 * 구문이다. 사용형식 : if(조건표현식) {
 * 
 * }
 * 
 */
public class IfSample {
	// 멤버 : 멤버변수(Field), 생성자함수(Constructor), 멤버함수(method)

	// method : 기능을 제공 => 기능에 대한 코드 작성 필요함
	// 접근제한자 [예약어] 반환자료형 메소드명([자료형 변수명]){ 코드작성 }
	public void testIf() {
		//정수 하나 입력받아서, 양수일때만 "양수다." 출력
		int num = new Scanner(System.in).nextInt();
		
		if(num>0) {
			System.out.println(num + " 은 양수다.");
		}
	}
	
	public void testIf2() {
		//문자 하나 입력받아서, 대문자일때만 유니코드 출력
		System.out.print("문자 입력 : ");
		char ch = new Scanner(System.in).next().charAt(0);
		if (ch >= 'A' && ch<='Z') {
			System.out.println((int)ch);
		}
	}
	
	public void testIf3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("번호입력 : ");
		int no = sc.nextInt();
		if (no == 1) {
			
		}
		
		else if (no==2) {
			System.out.println("회원 가입하셔야 합니다.");
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("암호 : ");
			String pwd = sc.next();
			System.out.print("이메일 : ");
			String email = sc.next();
			System.out.print("전화번호 : ");
			String phone = sc.next();
			System.out.print("성별[남|여] : ");
			char gender = sc.next().charAt(0);
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.printf("이름 : %s, 아이디 : %s, 암호 : %s, 이메일 : %s, 전화번호"
					+ "%s, 성별 : %c, 나이 : %d",name, id, pwd, email, phone, gender, age);
		}
	}
}
