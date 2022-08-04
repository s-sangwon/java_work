package logic.sample;

import java.util.Scanner;

public class DoWhileSample {
	private Scanner sc = new Scanner(System.in);
	
	//method
	public void printUnicode() {
		char ch;
		
		
		do {
			System.out.print("문자 입력 : ");
			ch = sc.next().charAt(0);
			System.out.println((int)ch);
		}	 while ( ch != '0' ); 
				 
		
	}
	
	public void printUnicode2() {
		char ch;
		
		
		do {
			System.out.print("문자 입력 : ");
			ch = sc.next().charAt(0);
			if(ch=='0') break;
			System.out.println((int)ch);
		}	 while (true); 
				 
		
	}
	
	public void displayMenu() {
		int no;
		
		do {
			System.out.println("*** 제어문 연습 프로그램 ***\n");
			System.out.println("1. 여러 줄 별 출력");
			System.out.println("2. 양수일 때만 별 출력");
			System.out.println("3. 문자열에서 문자 찾기");
			System.out.println("4. 문자 유니코드 확인");
			System.out.println("9. 끝내기");
			
			System.out.println("번호 선택 : ");
			no = sc.nextInt();
			
			switch(no) {
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 9: System.out.println("정말로 끝내시겠습니까?[y|n]");
						char answer = sc.next().toUpperCase().charAt(0);
						if(answer == 'Y') {
							System.out.println("프로그램 끝");
							return; //메인으로 리턴
						}else {
							break; //switch 문 종료함, 반복 다시 실행
						}
			default: System.out.println("잘못 입력함 다시입력해."); break;
			}
		}while(true);
		
		
	}
}
