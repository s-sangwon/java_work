package test.math;

public class testMathMethod {

	public static void main(String[] args) {
		//java.lang.Math 클래스의 메소드 사용 테스트
		
		//랜덤값 처리
		java.util.Random r = new java.util.Random();
		int value = r.nextInt();
		
		System.out.println("value : " + value);
		System.out.println("절대값 : " + Math.abs(value));
		System.out.println("상수 E : " + Math.E);
		System.out.println("상수 PI : " + Math.PI);
		
		System.out.println("10.05 의 올림값 : " + Math.ceil(10.05));
		System.out.println("10.05 의 내림값 : " + Math.floor(10.05));
		System.out.println("10.5의 반올림값 : " + Math.round(10.5));
		System.out.println("10.4의 반올림값 : " + Math.round(10.4));
		
		//두 수의 큰값 알아내기
		System.out.println("max : "+Math.max(10, 20));
		System.out.println("min : "+Math.min(10, 20));
		
		System.out.println("2.4의 제곱근 : " + Math.sqrt(2.4));
		System.out.println("2의 7제곱한 값 : " + Math.pow(2, 7));
	}

}
