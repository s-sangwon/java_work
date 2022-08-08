package logic.home.model;



public class StaticMethodSample {
	  public void testMathRandom(){
		  double value = Math.random();
		  int num = (int)(value * 45) + 1;
		  
		  System.out.println("1~45사이의 임의의 정수 : " + num);
	  }
	  public void testMathAbs(){
		  System.out.println("-12.77 절대값 : " + Math.abs(-12.77));
	  }
	  
	  public void testMathMax(){
		  System.out.println("120, 54 중 큰값은 : " + Math.max(120, 54));
		  
	  }
}
