package logic.view;

import java.util.Scanner;

import logic.controller.Function;

public class Menu {
	private static Scanner sc = new Scanner(System.in);
	public static void displayMenu(){
		do {
			int no;
			String menu = "\n1. 간단 계산기	\n"+	//=> calculator() 메소드 실행되게 함
					"2. 작은수에서 큰수까지 합계구하기  \n"+	//=> totalCalculator() 실행
					"3. 신상정보 확인하기 \n"+			//=> profile() 실행
					"4. 학생정보 확인하기 \n"+				//=> sungjuk() 실행
					"5. 별과 숫자 출력하기 \n"+				//=> printStarNumber() 실행
					"6. 난수까지의 합게 구하기 \n"+		//=> sumRandomNumber() 실행
					"7. 구구단  \n"+							//=>continueGugudan() 실행
					"8. 주사위 숫자 알아맞추기 게임 \n"+//=> shutNumber() 실행
					"9. 프로그램 종료\n"+
					"메뉴 번호 입력 : ";
			System.out.print(menu);
			no = sc.nextInt();
			Function fc = new Function();
			switch (no) {
			case 1: fc.calculator(); break;
			case 2: fc.totalCalculator(); break;
			case 3: fc.profile(); break;
			case 4: fc.sungjuk(); break;
			case 5: fc.printStarNumber(); break;
			case 6: fc.sumRandomNumber(); break;
			case 7: fc.continueGugudan(); break;
			case 8: fc.shutNumber(); break;
			case 9: return;
			}
		} while (true);
	}
}
