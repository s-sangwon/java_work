package logic.home.model;

import java.util.Scanner;

public class BreakSample {
	  public void sumBreak(){
		  int sum = 0;
		  int i=0;

			while (true){
				sum += ++i;
				System.out.print(i + "+");
				if (i == 100)
					break;
			}
				
			System.out.println();
			System.out.println("1 ~100까지의 합 : " + sum);
		  
		  
	  }
	  
	  
	  
	  public void guguDanBreak(){
		  for(int dan = 1; dan < 10; dan++) {
				System.out.println(dan + "단 --------------------");
				for(int su = 1; su < 10; su++) {
					if (su == 5) break;
					System.out.println(dan + " * " + su + " = "
							+ (dan * su));
				}
				System.out.println();
			}	
	  }
}
