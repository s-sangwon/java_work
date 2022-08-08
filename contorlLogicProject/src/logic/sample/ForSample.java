package logic.sample;

import java.util.Scanner;

/**
 * 횟수가 정해진 반복에 주로 사용
 * 배열 데이터 처리에 주로 사용됨 
 *구문 형식 :
 *for(초기식; 조건식; 증감식) { 반복 처리 구문 }
 *
 */
 
public class ForSample {
	
	
	private Scanner sc = new Scanner(System.in);
	
	//Constructor
	
	//Method
//	public testFor1(int bound)
	
	public void printGugudan() {
		// 구구단의 단수를 입력받아, 해당 단의 구구단을 출력 처리
		
		System.out.print("단수 입력 : ");
		int d = sc.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(d + " * " + i + " = " + (d*i));
		}
	}
	
	public void sumEven(int bound) {
		int sum=0;
		
		for(int i=0; i<=bound; i++) {
			if( i % 2 == 0)
				sum+=i;
		}
		System.out.println(sum);
	}
	
	public void sumMinToMax(int a, int b) {
		int sum=0;
		
		if (a>b) {
			int tmp=a;
			a=b; 
			b=tmp;
		}
		
		for(int i=a; i<=b; i++) 
			sum += i;
		System.out.println(sum);
		
	}
}
