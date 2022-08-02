package cast.practice;

import java.util.Scanner;

public class CastingSample {
//	 - 키보드로 문자하나를 입력받아, 그 문자의 유니코드를 출력되게 함
//	 - 입력예 : 
//		문자 입력 : A
//	 - 출력예 : 
//		A is unicode : 97
	public void printUniCode(){
		Scanner sc = new Scanner(System.in);
		System.out.print("문자하나를 입력하세요 : ");
		char ch = (sc.next().charAt(0));
		System.out.println(ch + " is unicode : " + (int)(ch));
	}
	
	
//	 - 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력받아 총점과 평균을 계산해서 출력함
//	 - 총점과 평균은 정수형으로 처리함
//	 - 입력예 : 
//		국어 : 90.0
//		영어 : 90.0
//		수학 : 90.0
//	 - 출력예 : 
//		총점 : 270
//		평균 : 90
	public void calculatorScore(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double kor  = sc.nextDouble();
		System.out.print("영어 : ");
		double eng  = sc.nextDouble();
		System.out.print("수학 : ");
		double math  = sc.nextDouble();
		
		System.out.println("총점 : " + (int)(kor + eng + math));
		System.out.println("평균 : " + (int)(kor + eng + math)/3);
	}
	
	
	
	
//	 - 정수를 하나 입력받아, 그 정수의 2진수 값에서 1의 갯수가 몇개인지를 출력함
//		(힌트 : java.lang.Integer 의 메소드를 찾아서 이용함)
//	 - 입력예 : 
//		정수 입력 : 11
//	 - 출력예 : 
//		11의 2진수에 포함된 1의 갯수 : 3
	public void printBitCount(){
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		
		System.out.println(a +"의 2진수에 포함된 1의 갯수 : " + Integer.bitCount(a));
		int count = 0;
		
		while(a!=0) {
			if(Math.abs(a)%2 == 1) {
				count++;}
			a>>>=1;
		}
		

		System.out.println(count);

	}
	
}
