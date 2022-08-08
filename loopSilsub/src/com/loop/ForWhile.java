package com.loop;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ForWhile {
	private Scanner sc = new Scanner(System.in);

//	[문제 1]
//			  : 정수를 하나 입력받아, 그 수가 양수일 때만
//			   입력된 수를 줄 수로 적용하여 다음과 같이 출력되게 함
//			 - if문과 이중 for문 사용
	public void printStar1() {
		System.out.print("정수 입력 : ");
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

//	[문제 2]
//			  : 정수를 하나 입력받아, 양수일 때와 0일때 음수일 때 각각 
//			    아래와 같이 출력되게 함.
//			 - if문과 for문 사용
	public void printStar2() {
		System.out.print("정수 입력 : ");
		int l = sc.nextInt();
		if (l > 0) {
			for (int i = 1; i <= l; i++) {
				for (int k = 1; k <= i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			l = Math.abs(l);
			for (int i = 1; i <= l; i++) {
				for (int k = 1; k <= l; k++) {
					if (i>k) System.out.print(" ");
					else System.out.print("*");
				}
				System.out.println();
			}
		}
	}

//	[문제 4]
//			  : 문자열 값을 입력받고, 그 다음 문자 하나를 입력받아,
//			   문자열 값 안에 입력문자가 몇 개 존재하는지 그 갯수를 출력함
//			   단, 영문자만 입력받도록 함.
	public void countInputCharacter(){
		String str;
		char ch;
		int count=0;
		
		System.out.print("문자열 입력 : ");
		str = sc.next();
		
		if (!Pattern.matches("^[a-zA-Z]*$", str)) {
			System.out.println("영문자가 아닙니다.");
			return;
		}
		System.out.print("문자 입력 : ");
		ch = sc.next().charAt(0);
		
		for(int i = 0; i<str.length(); i++) {
			if( str.charAt(i) == ch )
				count++;
		}
		System.out.println("포함된 갯수 : " + count + " 개");
	}
}
