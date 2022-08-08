package logic.home.view;

import java.util.Scanner;

//3
import logic.home.model.*;

public class Menu {
	static Scanner sc = new Scanner(System.in);

	public static void mainMenu() {
		// 4
		do {
			String menu = "\n***** 프로그래밍 기본 기능 테스트 프로그램 *****\n\n" +

					"1. 변수 테스트\n" + "2. 기본 자료형 테스트\n" + "3. if문 테스트\n" + "4. switch문 테스트\n" + "5. for문 테스트\n"
					+ "6. while문 테스트\n" + "7. do~while문 테스트\n" + "8. break문 테스트\n" + "9. continue문 테스트\n"
					+ "10. static 메소드 사용 테스트\n" + "11. non-static 메소드 사용 테스트\n" + "12. 프로그램 종료\n" + "메뉴 번호 입력 : ";
			System.out.print(menu);
			int no = sc.nextInt();

			switch (no) {
			case 1:
				subVarMenu();
				break;
			case 2:
				subPTypeMenu();
				break;
			case 3:
				subIfMenu();
				break;
			case 4:
				subSwitchMenu();
				break;
			case 5:
				subForMenu();
				break;
			case 6:
				subWhileMenu();
				break;
			case 7:
				subDoWhileMenu();
				break;
			case 8:
				subBreakMenu();
				break;
			case 9:
				subContinueMenu();
				break;
			case 10:
				subStaticMethodMenu();
				break;
			case 11:
				subNonStaticMethodMenu();
				break;
			case 12:
				System.out.print("정말로 종료하시겠습니까?(예:y/아니오:n) : ");
				char ch = sc.next().toUpperCase().charAt(0);
				if (ch == 'Y')
					return;
				break;
			default:
				System.out.println("올바른 메뉴를 선택해주세요.\n\n");
				break;
			}

		} while (true);
	}

	public static void subVarMenu() {
		VariableSample ref = new VariableSample();
		do {
			String menu = "\n\n*** 변수 테스트 부메뉴 ***\n\n" +

					"1. 내 신상정보 변수에 담아 출력하기\n" + "2. 사원정보를 키보드로 입력받아 출력하기\n" + "3. 기본 자료형 변수의 초기값 확인하기\n"
					+ "4. 이전 메뉴로 가기\n" + "메뉴 선택 : ";
			System.out.print(menu);
			int no = sc.nextInt();
			switch (no) {
			case 1:
				ref.myProfile();
				break;// VariableSample 클래스의 myProfile() 실행; break;
			case 2:
				ref.empInformation();
				break;// VariableSample 클래스의 empInformation() 실행; break;
			case 3:
				ref.defaultValue();
				break;// VariableSample 클래스의 defaultValue() 실행; break;
			case 4:
				System.out.println("메인 메뉴로 돌아갑니다.");
				return; // 이전 메뉴로 되돌아감.
			default:
				continue;
			}
		} while (true);
	}

	public static void subPTypeMenu() {
		PrimitiveTypeSample ref = new PrimitiveTypeSample();

		do {
			String menu = "\n\n*** 기본자료형 테스트 부메뉴 ***\n\n" +

					"1. 기본자료형 메모리 할당크기 확인하기\n" + "2. 기본자료형 값의 최소값, 최대값 출력하기\n" + "3. 기본자료형 비트갯수 확인하기\n"
					+ "4. 이전 메뉴로 가기\n" + "메뉴 선택 : ";
			System.out.print(menu);
			int no = sc.nextInt();
			switch (no) {
			case 1:
				ref.typeSize();
				break;// PrimitiveTypeSample 클래스의 typeSize() 실행; break;
			case 2:
				ref.minMaxValue();
				break;// PrimitiveTypeSample 클래스의 minMaxValue() 실행; break;
			case 3:
				ref.bitSize();
				break;// PrimitiveTypeSample 클래스의 bitSize() 실행; break;
			case 4:
				System.out.println("메인 메뉴로 돌아갑니다.");
				return; // 이전 메뉴로 되돌아감.
			default:
				continue;
			}
		} while (true);
	}

	public static void subIfMenu() {
		IfSample ref = new IfSample();

		String menu = "\n\n*** if문 테스트 부메뉴 ***\n\n" +

				"1. 두 개의 정수를 입력받아, 두 수중 큰 값 출력하기\n" + "2. 두 개의 정수를 입력받아, 두 수중 작은 값 출력하기\n"
				+ "3. 세 개의 정수를 입력받아, 세 수중 가장 큰수와 가장 작은수 출력하기\n" + "4. 한 개의 정수를 입력받아, 짝수인지 홀수인지 출력하기\n"
				+ "5. 국,영,수 세 과목의 점수를 입력받아, 합격/불합격 확인하기\n" + "6. 점수를 입력받아, 학점 확인하기\n"
				+ "7. 한 개의 정수를 입력받아, 양수인지 0인지 음수인지 확인하기\n" + "8. 문자 하나를 입력받아, 영어대문자인지 소문자인지 숫자문자인지 기타문자인지 확인하기\n"
				+ "9. 이전 메뉴로 가기\n" + "메뉴 선택 : ";

		do {
			System.out.print(menu);
			int no = sc.nextInt();

			switch (no) {
			case 1:
				ref.maxNumber();
				break;// IfSample 클래스의 maxNumber() 실행; break;
			case 2:
				ref.minNumber();
				break;// IfSample 클래스의 minNumber() 실행; break;
			case 3:
				ref.threeMaxMin();
				break;// IfSample 클래스의 threeMaxMin() 실행; break;
			case 4:
				ref.checkEven();
				break;// IfSample 클래스의 checkEven() 실행; break;
			case 5:
				ref.isPassFail();
				break;// IfSample 클래스의 isPassFail() 실행; break;
			case 6:
				ref.scoreGrade();
				break;// IfSample 클래스의 scoreGrade() 실행; break;
			case 7:
				ref.checkPlusMinusZero();
				break;// IfSample 클래스의 checkPlusMinusZero() 실행; break;
			case 8:
				ref.whatCaracter();
				break;// IfSample 클래스의 whatCaracter() 실행; break;
			case 9:
				System.out.println("메인 메뉴로 돌아갑니다.");
				return; // 이전 메뉴로 되돌아감.
			default:
				continue;
			}

		} while (true);
		// 몰라

	}

	public static void subSwitchMenu() {
		SwitchSample ref = new SwitchSample();
		String menu = "\n\n*** switch문 테스트 부메뉴 ***\n\n" +

				"1. 두 개의 정수와 한 개의 연산문자를 입력받아 계산한 결과 확인하기\n" + "2. 과일이름을 문자열로 입력받아, 그 과일의 가격 출력하기\n" + "3. 이전 메뉴로 가기\n"
				+ "메뉴 선택 : ";

		do {

			System.out.print(menu);
			int no = sc.nextInt();

			switch (no) {
			case 1:
				ref.calculator();
				break;// SwitchSample 클래스의 calculator() 실행; break;
			case 2:
				ref.fruitPrice();
				break;// SwitchSample 클래스의 fruitPrice() 실행; break;
			case 3:
				System.out.println("메인 메뉴로 돌아갑니다.");
				return; // 이전 메뉴로 되돌아감.
			default:
				continue;
			}

		} while (true);
	}

	public static void subForMenu() {
		ForSample ref = new ForSample();
		String menu = "\n\n*** for문 테스트 부메뉴 ***\n\n" +

				"1. 1~10까지 정수들의 합계 구하기\n" + "2. 1~100사이의 짝수들의 합게 구하기\n" + "3. 정수 하나 입력받아, 그 수의 구구단 출력하기\n"
				+ "4. 두 개의 정수를 입력받아, 두 수중 작은 값에서 큰 값까지의 합계 구하기\n" + "5. 줄수와 칸수 입력받아, 입력된 줄수/칸수만큼 별표문자 출력하기\n"
				+ "6. 7줄에 7칸에 별표문자 출력하되, 각 줄에 줄번호와 같은 칸에 숫자 출력하기\n"
				+ "7. 줄수를 입력받아, 삼각형 모양으로 별표문자 출력하기(양수:직각삼각형, 음수:역삼각형)\n" + "8. 구구단 2단부터 9단까지 출력하기\n" + "9. 이전 메뉴로 가기\n"
				+ "메뉴 선택 : ";

		do {

			System.out.print(menu);
			int no = sc.nextInt();

			switch (no) {
			case 1:
				ref.sum1To10();
				break;// ForSample 클래스의 sum1To10() 실행; break;
			case 2:
				ref.sumEven1To100();
				break;// ForSample 클래스의 sumEven1To100() 실행; break;
			case 3:
				ref.oneGugudan();
				break;// ForSample 클래스의 oneGugudan() 실행; break;
			case 4:
				ref.sumMinToMax();
				break;// ForSample 클래스의 sumMinToMax() 실행; break;
			case 5:
				ref.printStar();
				break;// ForSample 클래스의 printStar() 실행; break;
			case 6:
				ref.printNumberStar();
				break;// ForSample 클래스의 printNumberStar() 실행; break;
			case 7:
				ref.printTriangleStar();
				break;// ForSample 클래스의 printTriangleStar() 실행; break;
			case 8:
				ref.guguDan();
				break;// ForSample 클래스의 guguDan() 실행; break;
			case 9:
				System.out.println("메인 메뉴로 돌아갑니다.");
				return; // 이전 메뉴로 되돌아감.
			default:
				continue;
			}

		} while (true);
	}

	public static void subWhileMenu() {
		WhileSample ref = new WhileSample();
		String menu = "\n\n*** while문 테스트 부메뉴 ***\n\n" +

				"1. 문자 하나 입력받아, 그 문자의 유니코드 출력 반복('0' 입력되면 반복종료)\n" + "2. 1~100까지 정수들의 합계 출력하기(while 문으로 작성)\n"
				+ "3. 1~100사이의 임의의 정수를 발생시켜, 숫자 알아맞추기\n" + "4. 문자열을 입력받아, 글자 갯수 알아내어 출력하기\n"
				+ "5. 문자열값과 문자 하나를 입력받아, 문자열에 문자가 몇 개 있는지 확인하기\n" + "6. 이전 메뉴로 가기\n" + "메뉴 선택 : ";

		do {
			System.out.print(menu);
			int no = sc.nextInt();

			switch (no) {
			case 1:
				ref.printUniCode();
				break;// WhileSample 클래스의 printUniCode() 실행; break;
			case 2:
				ref.sum1To100();
				break;// WhileSample 클래스의 sum1To100() 실행; break;
			case 3:
				ref.numberGame();
				break;// WhileSample 클래스의 numberGame() 실행; break;
			case 4:
				ref.countCharacter();
				break;// WhileSample 클래스의 countCharacter() 실행; break;
			case 5:
				ref.countInChar();
				break;// WhileSample 클래스의 countInChar() 실행; break;
			case 6:
				System.out.println("메인 메뉴로 돌아갑니다.");
				return; // 이전 메뉴로 되돌아감.
			default:
				continue;// 잘못된 값 입력시 메뉴 다시 출력되게 처리
			}

		} while (true);
	}

	public static void subDoWhileMenu() {
		DoWhileSample ref = new DoWhileSample();
		String menu = "\n\n*** do~while문 테스트 부메뉴 ***\n\n" +

				"1. 문자열값 입력받아, 문자 사이에 '-' 끼워넣어 출력하기\n" + "2. 버거킹 메뉴 주문 테스트\n"
				+ "3. 문자열 입력받아, \"모든 글자 영문자다\"/\"영문자 아니다.\" 출력하기\n" + "4. 이전 메뉴로 가기\n" + "메뉴 선택 : ";

		do {
			System.out.print(menu);
			int no = sc.nextInt();

			switch (no) {
			case 1:
				ref.addDashToken();
				break;// DoWhileSample 클래스의 addDashToken() 실행; break;
			case 2:
				ref.burgerKingMenu();
				break;// DoWhileSample 클래스의 burgerKingMenu() 실행; break;
			case 3:
				ref.isStringAlphabet();
				break;// DoWhileSample 클래스의 isStringAlphabet() 실행; break;
			case 4:
				System.out.println("메인 메뉴로 돌아갑니다.");
				return; // 이전 메뉴로 되돌아감.
			default:
				continue; // 잘못된 값 입력시 메뉴 다시 출력되게 처리
			}

		} while (true);
	}

	public static void subBreakMenu() {
		BreakSample ref = new BreakSample();
		String menu = "\n\n*** break문 테스트 부메뉴 ***\n\n" +

				"1. 1~100까지 정수들의 합계 출력하기(break문 사용)\n" + "2. 구구단 1단~9단까지 출력하되, * 5 계산에서 반복문 빠지기(break 이름 사용)\n"
				+ "3. 이전 메뉴로 가기\n" + "메뉴 선택 : ";
		do {

			System.out.print(menu);
			int no = sc.nextInt();

			switch (no) {
			case 1:
				ref.sumBreak();
				break; // BreakSample 클래스의 sumBreak() 실행; break;
			case 2:
				ref.guguDanBreak();
				break;// BreakSample 클래스의 guguDanBreak() 실행; break;
			case 3:
				System.out.println("메인 메뉴로 돌아갑니다.");
				return; // 이전 메뉴로 되돌아감.
			default:
				continue;// 잘못된 값 입력시 메뉴 다시 출력되게 처리
			}

		} while (true);
	}

	public static void subContinueMenu() {
		ContinueSample ref = new ContinueSample();
		String menu = "\n\n*** continue문 테스트 부메뉴 ***\n\n" +

				"1. 1~100까지의 정수 중 3의 배수를 뺀 정수들의 합계 출력하기\n" + "2. 3행 5열의 행열값 출력하되, 1행 3열부터 1행 5열까지 생략하고 출력하기\n"
				+ "3. 이전 메뉴로 가기\n" + "메뉴 선택 : ";

		do {

			System.out.print(menu);
			int no = sc.nextInt();

			switch (no) {
			case 1:
				ref.sumJumpThree();
				break;// ContinueSample 클래스의 sumJumpThree() 실행; break;
			case 2:
				ref.rowColJump();
				break;// ContinueSample 클래스의 rowColJump() 실행; break;
			case 3:
				System.out.println("메인 메뉴로 돌아갑니다.");
				return; // 이전 메뉴로 되돌아감.
			default:
				continue;// 잘못된 값 입력시 메뉴 다시 출력되게 처리
			}

		} while (true);
	}

	public static void subStaticMethodMenu() {
		StaticMethodSample ref = new StaticMethodSample();
		String menu = "\n\n*** static 메소드 사용 테스트 부메뉴 ***\n\n" +

				"1. Math 클래스의 랜덤값 구하는 메소드 : 1~45사이의 임의의 정수 출력\n"
				+ "2. Math 클래스의 실수값에 대한 절대값 구하는 메소드 : -12.77 절대값 출력하기\n"
				+ "3. Math 클래스의 두 정수중 큰값 구하는 메소드 : 120, 54 중 큰값 출력하기\n" + "4. 이전 메뉴로 가기\n" + "메뉴 선택 : ";

		do {

			System.out.print(menu);
			int no = sc.nextInt();

			switch (no) {
			case 1: ref.testMathRandom(); break;// StaticMethodSample 클래스의 testMathRandom() 실행; break;
			case 2: ref.testMathAbs(); break;// StaticMethodSample 클래스의 testMathAbs() 실행; break;
			case 3: ref.testMathMax(); break;// StaticMethodSample 클래스의 testMathMax() 실행; break;
			case 4:  System.out.println("메인 메뉴로 돌아갑니다.");
				return; // 이전 메뉴로 되돌아감.
			default:
				continue;// 잘못된 값 입력시 메뉴 다시 출력되게 처리
			}

		} while (true);
	}

	public static void subNonStaticMethodMenu() {
		NonStaticMethodSample ref = new NonStaticMethodSample();
		String menu = "\n\n*** non-static 메소드 사용 테스트 부메뉴 ***\n\n" +

				"1. Scanner 클래스 사용 : 자료형 종류별로 값 입력받아 출력하기\n" + "2. Date 클래스 사용 : 오늘 날짜, 현재 시간 정보 출력하기\n"
				+ "3. Random 클래스 사용 : 정수와 실수에 대한 난수 출력하기\n" + "4. 이전 메뉴로 가기\n" + "메뉴 선택 : ";

		do {

			System.out.print(menu);
			int no = sc.nextInt();

			switch (no) {
			case 1: ref.testScanner(); break;// NonStaticMethodSample 클래스의 testScanner() 실행; break;
			case 2: ref.testDate(); break;// NonStaticMethodSample 클래스의 testDate() 실행; break;
			case 3: ref.testRandom(); break;// NonStaticMethodSample 클래스의 testRandom() 실행; break;
			case 4:
				System.out.println("메인 메뉴로 돌아갑니다.");
				return; // 이전 메뉴로 되돌아감.
			default:
				continue;// 잘못된 값 입력시 메뉴 다시 출력되게 처리
			}

		} while (true);
	}

}
