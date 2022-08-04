package logic.sample;

import java.util.Scanner;

/**
 *  다중 if문테스트 샘플 클래스
 *  다중 if 문은 else 다음에 if(조건식) 을 사용함
 * if(조건식) {
 * } else if (조건식) {
 * } else {
 * }
 * 
 */
public class IfElseIfSample {
	//Field
	//Constructor
	
	//method
	public void testThreeMax() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int first = sc.nextInt();
		
		System.out.print("두번쨰 정수 : ");
		int second = sc.nextInt();
		
		System.out.print("세번째 정수 : ");
		int third = sc.nextInt();
		
		int max = first;
		
		if (first> second && first > third) {
			max = first;
		} else if (second > third) {
			max = second;
		} else {
			max = third;
		}
		System.out.println("가장 큰 값 : " + max);
	}
	
	public void testScoreGrade() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		char grade = 0;
		
		if (n >= 90)
			grade = 'A';
		else if (n >= 80)
			grade = 'B';
		else if (n >= 70)
			grade = 'C';
		else if (n >= 60)
			grade = 'D';
		else if (n >= 0)
			grade = 'F';
		else
			System.out.println("잘못 입력하셨습니다.");
		
		System.out.println(grade);
		
	}
}
