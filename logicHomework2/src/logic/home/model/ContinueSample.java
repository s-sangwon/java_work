package logic.home.model;

import java.util.Scanner;

public class ContinueSample {
	  public void sumJumpThree(){
		  int sum = 0;
		  int i=0;

			while (i++<100){
				if(i % 3 == 0) {
					continue;
				}
				sum += i;
				System.out.print(i + "+");
			
			}
				
			System.out.println();
			System.out.println("1~100까지의 정수 중 3의 배수를 뺀 정수들의 합 : " + sum);
		  
		  
	  }
	  public void rowColJump(){
		  for(int r=1;r<=3;r++) {
				for(int c=1;c<=5;c++) {
					if(r==1) 
						if(c>=3&&c<=5)
							continue;
				
					System.out.print(c);
				}System.out.println();
			}
		  
	  }

}
