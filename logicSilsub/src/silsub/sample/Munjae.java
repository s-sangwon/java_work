package silsub.sample;

import java.util.Scanner;

public class Munjae {
	private Scanner sc = new Scanner(System.in);

	public void test1() {
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int mat = sc.nextInt();

		int tot = kor + eng + mat;
		int avg = tot / 3;
		String str = "불합격";
		if (kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60) {
			str = "합격";
			System.out.println(str);
			System.out.printf("국어 : %d, 영어 : %d, 수학 : %d, 합계 : %d, 평균 : %d\n", kor, eng, mat, tot, avg);
		}
		else
			System.out.println(str);
	}

	public void test2() {
		System.out.println("*** 초기 메뉴 ***\n");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴번호 입력 : ");
		int no = sc.nextInt();
		switch (no) {
		case 1:
			System.out.println("입력메뉴가 선택되었습니다.");
			break;
		case 2:
			System.out.println("수정메뉴가 선택되었습니다.");
			break;
		case 3:
			System.out.println("조회메뉴가 선택되었습니다.");
			break;
		case 4:
			System.out.println("삭제메뉴가 선택되었습니다.");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			break;
		default:
			System.out.println("번호가 잘못 입력되었습니다.");
			System.out.println("다시 입력하십시오.");
			break;
		}
	}

	public void test3() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		if (num > 0)
			System.out.println("양수다.");
		else
			System.out.println("양수가 아니다.");

	}

	public void test4() {
		int num;
		String str;
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		if (num > 0 && num % 2 == 0)
			str = "짝수다.";
		else if (num % 2 == 1)
			str = "홀수다.";
		else
			str = "양수를 입력하세요.";
		System.out.println(str);
	}

	public void test5() {
		String name;
		int age;
		double tall;
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("나이 : ");
		age = sc.nextInt();
		System.out.print("키 : ");
		tall = sc.nextDouble();

		if (name != null && name.length() > 0 && age > 0 && tall > 0) {
			System.out.printf("확인 : %s의 나이는 %d이고, 키는 %.1f cm 이다.\n", name, age, tall);
		}
	}

	public void test7() {
		int score;
		char grade;
		System.out.print("점수 : ");
		score = sc.nextInt();
		if (score >= 90) grade = 'A';
		else if (score >= 80) grade = 'B';
		else if (score >= 70) grade = 'C';
		else if (score >= 60) grade = 'D';
		else if (score >= 0) grade = 'F';
		else {System.out.println("양수만 입력하세요"); return;}
		System.out.println(score + " : " + grade);
		
	}

	public void test6() {
		int a, b;
		System.out.print("첫번째 정수 : ");
		a = sc.nextInt();
		System.out.print("두번째 정수 : ");
		b = sc.nextInt();
		
		if(a>0 && b> 0) {
			System.out.println(a + " + " + b + " = " + (a+b));
			System.out.println(a + " - " + b + " = " + (a-b));
			System.out.println(a + " * " + b + " = " + (a*b));
			System.out.println(a + " / " + b + " = " + (a/b));
			System.out.println(a + " % " + b + " = " + (a%b));
		}
	}
}
