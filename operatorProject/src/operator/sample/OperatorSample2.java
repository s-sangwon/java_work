package operator.sample;

public class OperatorSample2 {
	//연산자는 1~15등급으로 구분됨
	//종류는 최우선, 단항, 이항, 삼항, 대입, 나열연산자로 분류됨
	//이항연산자가 세분화되어서, 산술,쉬프트,비교,논리연산자로 구분됨
	
	public void testDimension() {
		float pi = (float)Math.PI;
		
		//소수점아래 셋째자리까지로 변경
		
		float result = (int)(pi * 1000);
		System.out.println("result : " + result);
		
	}
	
	// 순수대입연산자 : 오른쪽에서 왼쪽으로 진행됨
	// 변수= 값; 또는 변수 = 계산식;
	public void testSubst() {
		int x = 12;
		int y, z;
		
		z = y = x;
		
		int sum = x + y + z;
		System.out.println(sum);
	}
	//복합대입연산자
	
	//메모리 변수에 직접 연산하는 방식 : 처리 속도가 빠름 (권장)
	public void testComplexSubst() {
		int num = 10;
		System.out.println("num : " + num); //10
		
		// 1증가 : ++
		num++;
		
		System.out.println("num : " + num); //11
		
		//3증가 : += 3
		num += 3;
		System.out.println("num : " + num); //14
		
		//1감소 : --
		num--;
		System.out.println("num : " + num); //13
		
		//2감소 : -= 2
		num -= 2;
		System.out.println("num : " + num); //11
		
		//4배 증가 : *= 4
		num *= 4;
		System.out.println("num : " + num);  // 44
		
		//4배 감소 : /= 4
		num /=4;
		System.out.println("num : " + num); 
	
	}
	
	
	public boolean continuousPwd(String pwd) {
		  int o = 0;
		  int d = 0;
		  int p = 0;
		  int n = 0;  
		  int limit = 3;
		  
		  for(int i=0; i<pwd.length(); i++) {
		   char tempVal = pwd.charAt(i);
		   if(i > 0 && (p = o - tempVal) > -2 && (n = p == d ? n + 1 :0) > limit -3) {
		    return true;
		   }
		   d = p;
		   o = tempVal;
		  }
		  return false;
		 }
}
