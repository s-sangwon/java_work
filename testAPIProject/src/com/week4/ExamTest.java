package com.week4;

import java.util.Scanner;

public class ExamTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ExamString es = new ExamString();
		
		System.out.print("문자열 :");
		String s = sc.next();
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		System.out.println(es.preChar(s));
		System.out.println(es.charSu(s, ch));

	}

}
