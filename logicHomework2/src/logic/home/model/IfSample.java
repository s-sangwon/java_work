package logic.home.model;

import java.util.Scanner;

public class IfSample {
	Scanner sc = new Scanner(System.in);
	  public void maxNumber(){
		  //1. 두 개의 정수를 입력받아, 두 수중 큰 값 출력하기
		  int a,b;
		  System.out.print("첫번째 정수 : ");
		  a = sc.nextInt();
		  System.out.print("두번째 정수 : ");
		  b = sc.nextInt();
		  
		  int max = b;
		  if(a > b) max = a;
		  System.out.println("두 수중 큰 값은 : "+ max);
	  }
	  public void minNumber(){
		  //1. 두 개의 정수를 입력받아, 두 수중 작은 값 출력하기
		  int a,b;
		  System.out.print("첫번째 정수 : ");
		  a = sc.nextInt();
		  System.out.print("두번째 정수 : ");
		  b = sc.nextInt();
		  
		  int min = b;
		  if(a < b) min = a;
		  System.out.println("두 수중 작은 값은 : "+ min);
		  
	  }
	  public void threeMaxMin(){
			System.out.print("첫번째 정수 : ");
			int first = sc.nextInt();
			System.out.print("두번째 정수 : ");
			int second = sc.nextInt();
			System.out.print("세번째 정수 : ");
			int third = sc.nextInt();
			
			int max, min;   //가장 큰 값, 작은 값 저장용 변수
			
			if(first > second && first > third) {
				max = first;
			}else if(second > third) {
				max = second;
			}else {
				max = third;
			}
			
			if(first < second && first < third) {
				min = first;
			}else if(second < third) {
				min = second;
			}else {
				min = third;
			}
			
			
			System.out.println("가장 큰 값 : " + max);
			System.out.println("가장 작은 값 : " + min);
		  
	  }
	  public void checkEven(){
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			if(num % 2 == 0) 
				System.out.println(num + " is even.");
			else 
				System.out.println(num + " is odd number.");
			
	  }
	  public void isPassFail(){
			System.out.print("국어 점수 : ");
			int kor = sc.nextInt();
			System.out.print("영어 점수 : ");
			int eng = sc.nextInt();
			System.out.print("수학 점수 : ");
			int mat = sc.nextInt();
			
			int total = kor + eng + mat;
			int average = total / 3;
			
			if(kor >= 40 && eng >= 40 && mat >= 40 
					&& average >= 60) {
				System.out.println("합격!");
			}else {
				System.out.println("불합격!");
			}
	  }
	  public void scoreGrade(){
		  System.out.print("점수 : ");
			int score = sc.nextInt();
			
			if(score >= 0) {
				char grade;
				
				//점수에 대한 등급 처리 : 다중 if문 사용
				if(score >= 90)	grade = 'A';
				else if(score >= 80) grade = 'B';
				else if(score >= 70) grade = 'C';
				else if(score >= 60) grade = 'D';
				else grade = 'F';
				
				System.out.println(score + " => " + grade);
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
	  }
	  public void checkPlusMinusZero(){
		  
		  System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			
			if(num > 0) {
				System.out.println("양수다.");
			}
			else if(num == 0) System.out.println("0이다.");
			else System.out.println("음수다.");
			
	  }
	  public void whatCaracter(){
		  System.out.print("문자 입력 : ");
		  char ch = sc.next().charAt(0);
			
			if(ch >= 'A' && ch <= 'Z') {
				System.out.println(ch + " 영어 대문자");
			} else if(ch >= 'a' && ch <= 'z')
				System.out.println(ch + " 영어 소문자");
			else if (ch >= '0' && ch <= '9')
				System.out.println(ch + " 숫자 문자");
			else
				System.out.println(ch + " 기타 문자");
	  }
}
