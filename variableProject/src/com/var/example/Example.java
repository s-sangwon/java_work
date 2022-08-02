package com.var.example;

import java.util.Scanner;

public class Example {
	//연습 1
	public void example1(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : "); 
		int a = sc.nextInt();
		System.out.print("두번째 정수 : "); 
		int b = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (a+b));
		System.out.println("빼기 결과 : " + (a-b));
		System.out.println("곱하기 결과 : " + (a*b));
		System.out.println("나누기한 몫 : " + (a/b));
		System.out.println("나누기한 나머지 : " + (a%b));
	}
	
	//연습 2
	public void example2(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : "); 
		double a = sc.nextDouble();
		System.out.print("세로 : "); 
		double b = sc.nextDouble();
		
		System.out.println("면적 : " + (a*b));
		System.out.println("둘레 : " + (a+b)* 2);
	}
	
	//연습 3
	public void example3(){
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열을 입력하시오 : "); 
		String str = sc.next();
		
		for(int i=0; i<str.length(); i++)
			System.out.println(i+1 + "번째 문자 : " + str.charAt(i));
		
	}
	
}
