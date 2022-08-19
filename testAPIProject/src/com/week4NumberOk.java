package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class week4NumberOk {
	public static void main(String args[]) {
		int rd = (int) Math.round(Math.random() * 100) + 1;
		week4NumberOk ref = new week4NumberOk();
		int count = 0;

		System.out.println(rd);

		do {
			System.out.print("정수 입력 : ");
			int num = ref.getnumber();
			int eq = ref.questionNumber(num, rd);
			count++;
			if (eq == 0) {
				System.out.println("맞았습니다.(" + count + "번)");
				System.out.println();
				System.out.print("계속 하시겠습니까?(y/n) : ");
				count = 0;
				if(new Scanner(System.in).next().toUpperCase().charAt(0) == 'Y')
					rd = (int) Math.round(Math.random() * 100) + 1;
				else {
					break;
				}
			} else if (eq == -1)
				System.out.println("크다");
			else if (eq == 1)
				System.out.println("작다");

			
		} while (true);
		
		System.out.println("프로그램을 종료합니다.");
	}

	public int getnumber() {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		try {
			String s = bf.readLine();
			num = Integer.parseInt(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}

	public int questionNumber(int a, int rd) {
		int gt = 0;
		if (rd == a)
			gt = 0;
		else if (rd > a)
			gt = -1;
		else if (rd < a)
			gt = 1;
		return gt;
	}
}
