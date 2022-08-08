package logic.home.model;

import java.util.Scanner;

public class ForSample {
	Scanner sc = new Scanner(System.in);
	  public void sum1To10(){
		  int sum = 0;
			
			for(int n = 1; n <= 10; n += 1) {
				sum += n;
				System.out.print(n + "+");
			}
			
			System.out.println();
			System.out.println("1 ~10까지의 합 : " + sum);
	  }
	  public void sumEven1To100(){
			int sum = 0;
			
			for(int n = 2; n <= 100; n += 2) {
				sum += n;
				System.out.print(n + "+");
			}
			
			System.out.println();
			System.out.println("1 ~ 100까지 짝수의 합 : " + sum);
	  }
	  public void oneGugudan(){
			System.out.print("단수 입력 : ");
			int dan = sc.nextInt();
			
			for(int su = 1; su < 10; su++) {
				System.out.println(dan + " * " + su + " = "
						+ (dan * su));
			}
		  
	  }

		public void sumMinToMax() {
			int min, max, sum = 0;
			System.out.print("첫번째 정수 : ");
			int a = sc.nextInt();
			System.out.print("두번째 정수 : ");
			int b = sc.nextInt();

			if (a > b) {
				max = a;
				min = b;
			} else {
				max = b;
				min = a;
			}

			for (int n = min; n <= max; n++) {
				sum += n;
				if (n == max) {
					System.out.print(n + "=");
				} else {
					System.out.print(n + "+");
				}
			}

			System.out.println(sum);
		}
	  public void printStar(){
		  int a,b;
		  System.out.print("줄수 입력 : ");
		  a = sc.nextInt();
		  System.out.print("칸수 입력 : ");
		  b = sc.nextInt();
		  for(int line = 1; line <= b; line++ ) {
				for(int k = 1; k <= a; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
	  }
	  public void printNumberStar(){
			for(int line = 1; line <= 7; line++ ) {
				for(int k = 1; k <= 7; k++) {
					if(line == k) System.out.print(line);
					else System.out.print("*");
				}
				System.out.println();
			}
	  }
	  
	  public void printTriangleStar(){
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
	  public void guguDan(){
			for(int dan = 2; dan < 10; dan++) {
				System.out.println(dan + "단 --------------------");
				for(int su = 1; su < 10; su++) {
					System.out.println(dan + " * " + su + " = "
							+ (dan * su));
				}
				System.out.println();
			}	
	  }
}
