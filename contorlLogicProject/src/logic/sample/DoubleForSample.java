package logic.sample;

import java.util.Scanner;

/**
 * 다중 for 문 : 반복이 다시 여러 번 반복 수행될 때 사용함
 * for 문안에 for 를 사용하는 구조
 *
 */
public class DoubleForSample {
	private Scanner sc = new Scanner(System.in);
	
	//Method
	
	public void gugudan() {
		int dan = 2;
		
		for(int su=2; su < 10; su++) {
			for(int d=1; d<10; d++) {
				System.out.println(su + " * " + d + " = " + (d * su ));
			}
		}
	}
	
	public void printStar1() {
		// *******
		for(int line =1; line<=5; line++) {
			for(int k = 1; k <= 7; k++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
	
	public void printStar2(int line) {
		if(line > 0) {
			for(int i =0; i<line; i++) {
				for(int k=0; k<line; k++) {
					if(i>k) {
						System.out.print(" ");
					}else { System.out.print("*"); }
				}
				System.out.println();
			}
		}else {
			System.out.println("양수만 사용하세요.");
		}
	}
	
	
}
