package logic.home.model;

import java.util.Random;
import java.util.Scanner;

public class WhileSample {
	Scanner sc = new Scanner(System.in);
	  public void printUniCode(){
		  
		  while(true) {
				System.out.print("문자 입력 : ");
				char ch = sc.next().charAt(0);
				
				if(ch == '0') {
					break;
				}
				
				System.out.println(ch + " is unicode " + (int)ch);		
							
			}
	  }
	  public void sum1To100(){
		  int sum = 0;
		  int i=0;

			while (i++<100){
				sum += i;
				System.out.print(i + "+");
			}
				
			System.out.println();
			System.out.println("1 ~100까지의 합 : " + sum);
		  
	  }
	  public void numberGame(){
			while (true) {
				int first = new Random().nextInt(100) + 1;
				
				System.out.print("숫자 입력(0종료) : ");
				int num = sc.nextInt();
				
				if(num == 0) {
					break;
				}
				
				if(first == num) System.out.println("맞췄습니다.");
				else System.out.println("틀렸습니다. 정답은 : "+ first);
				
				
			}
	  }
	  
	  public void countCharacter(){
		  System.out.print("문자열 입력 : ");
		  String str = sc.next();
		  System.out.println(str + " 글자 갯수 : " + str.length() + "개");
	  }
	  
	  public void countInChar(){
			System.out.print("문자열 입력 : ");
			String str = sc.next();
			System.out.print("문자 입력 : ");
			char ch = sc.next().charAt(0);
			
			int index = 0, count = 0;
			
			while(index < str.length()) {
				if(str.charAt(index) == ch) {
					count++;
				}
				index++;
			}
			
			System.out.println(str + " 에 포함된 " + ch 
					+ " 문자의 갯수는 " + count + "개");
	  }
}
