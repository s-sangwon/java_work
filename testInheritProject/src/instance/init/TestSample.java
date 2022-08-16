package instance.init;

import java.text.NumberFormat;

public class TestSample {

	public static void main(String[] args) {
		// 1. 생성자 사용 테스트
		Sample ref1 = new Sample();
		
		System.out.println("인스턴스 변수 확인 : " + ref1.toString());
		//출력시 레퍼런스 toString() 생략가능
		System.out.println("인스턴스 변수 확인 : " + ref1);
		
		Sample ref2 = new Sample(ref1);
		
		System.out.println("인스턴스 변수 확인 : " + ref2);
		
		long startTime = System.currentTimeMillis();
		double a = 12.3456789;
		double dummy = 0.0;

		for(int i = 0; i < 100000; i++) {
			cutDecimal(2, a);
		}
		long stop1 = System.currentTimeMillis();
		System.out.println((stop1-startTime) + "(ms)");

		for(int i = 0; i < 100000; i++) {
			String.format("%.2f", a);
		}
		long stop2 = System.currentTimeMillis();
		System.out.println((stop2-stop1) + "(ms)");

		for(int i = 0; i < 100000; i++) {
			dummy = (double)Math.round(a*100)/100;
		}
		long stop3 = System.currentTimeMillis();
		System.out.println((stop3-stop2) + "(ms)");
		

	}
	public static String cutDecimal(int cutSize, double value) {
	 	NumberFormat nf = NumberFormat.getNumberInstance();
	    nf.setMaximumFractionDigits(cutSize);
	    nf.setGroupingUsed(false);
	        
	    return nf.format(value);
	 }
}
