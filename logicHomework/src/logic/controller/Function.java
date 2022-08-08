package logic.controller;

import java.util.Random;
import java.util.Scanner;

public class Function {
	private Scanner sc = new Scanner(System.in);
	
//	<과제 4>

	public void calculator(){
		int a,b, result = 0;
		char op;
		
		System.out.print("첫번째 정수 : ");
		a = sc.nextInt();
		System.out.print("두번째 정수 : ");
		b = sc.nextInt();
		System.out.print("연산문자 : ");
		op = sc.next().toUpperCase().charAt(0);
		
		switch (op) {
		case '+': result=a+b; break;
		case '-': result=a-b; break;
		case 'X': result=a*b; break;
		case '/': 
			if(b==0) { 
				System.out.println("0으로 나눌 수 없습니다."); 
				result=0;
			} else { result=a/b; }
			break;
		}
		System.out.println(a + " "+ op + " " + b + " = " + result);
	}
	
	//5
	public void totalCalculator(){
		int min,max, result = 0;
		char op;
		
		System.out.print("첫번째 정수 : ");
		min = sc.nextInt();
		System.out.print("두번째 정수 : ");
		max = sc.nextInt();
		if(min> max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		
		for(int i =min; i<=max; i++) {
			result+=i;
			System.out.print(i);
			if(i == max) break;
			else System.out.print("+");
		}
		System.out.println();
		System.out.println(min + "부터 " + max + "까지 정수들의 합계 : " + result);
	}
	//6
	public void profile(){
		String name="서상원", gender="남자";
		int age=26;
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		
	}
	
	// 7
	public void sungjuk() {
		String name;
		int age, sclass, no;
		char gender, grade;
		double score;
		
		System.out.print("학생이름 : ");
		name = sc.next();
		
		System.out.print("학년 : ");
		age = sc.nextInt();
		System.out.print("반 : ");
		sclass = sc.nextInt();
		System.out.print("번호 : ");
		no = sc.nextInt();
		
		System.out.print("성별(M/F) : ");
		gender = sc.next().toUpperCase().charAt(0);
		System.out.print("성적 : ");
		score = sc.nextDouble();
		
		gender = gender == 'M' ? '남':'여';
		
		if( score >= 90) grade = 'A';
		else if(score >= 80) grade = 'B';
		else if(score >= 70) grade = 'C';
		else if(score >= 60) grade = 'D';
		else grade = 'F';
		
		System.out.printf("%d학년 %d반 %d번 %c학생 %s의 점수는 %.2f이고, %c 학점입니다."
				, age, sclass, no, gender, name, score, grade);
	}
	
	//8
	public void printStarNumber(){
		System.out.print("정수 하나 입력 : ");
		int l = sc.nextInt();
		if (l > 0) {
			for (int i = 1; i <= l; i++) {
				for (int k = 1; k <= i; k++) {
					if (i == k)
						System.out.print(i);
					else
						System.out.print("*");
				}
				System.out.println();
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}
	}
	
	//9
	public void sumRandomNumber(){
		int rnum = (int)(Math.random()*100) + 1;
		int result = 0;
		for(int i =1; i<=rnum; i++) 
			result+=i;
		System.out.println("1부터 "+ rnum+"까지의 합 : " + result);
	}
	
	//10
	public void continueGugudan(){
		int n, cn;
		System.out.print("단수 : ");
		n = sc.nextInt();
		if(n <= 0) { System.out.println("양수가 아닙니다."); return; }
		
		System.out.print("제외할 배수 : ");
		cn = sc.nextInt();
		
		for(int i=1; i<10; i++) {
			if (i == cn) { continue; }
			System.out.println(n + " * " + i + " = " + (n*i));
		}
	}
	
	//11
	public void shutNumber(){
		char ch = 'y';
		do {
			
			int first = new Random().nextInt(6) + 1;
			int second = new Random().nextInt(6) + 1;
			int answer;
			
			System.out.print("두 주사위 눈의 합은 ? : ");
			answer = sc.nextInt();
			if(answer == first+second)
				System.out.println("맞췄습니다.");
			else
				System.out.println("틀렸습니다.");
			System.out.println("정답은 " + first +" + "+second +" = "+(first+second) );
			System.out.print("계속하시겠습니까?(y/n) : ");
		}while( (ch = sc.next().toUpperCase().charAt(0)) != 'N' );
	}
	
}
