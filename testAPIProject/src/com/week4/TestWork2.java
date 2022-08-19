package com.week4;

public class TestWork2 {

	public static void main(String[] args) {
		String str =  "J a v a  P r o g r a m ";
		
		//StringBuilder sb = new StringBuilder(str);

		
		
		
		System.out.print("토큰 처리전 글자 출력 : ");
		System.out.println(str);
		System.out.println("전 글자갯수 출력 : " + str.length());
		
		String[] sar = str.split(" ");
		char[] car = new char[sar.length];
		
		for(int i=0; i<sar.length; i++) {
			if(sar[i].toString() != "")
				car[i] = sar[i].charAt(0);
			else
				car[i] = ' ';
		}
		

		System.out.println("토큰 처리 후 글자갯수 출력 : " + car.length);
		System.out.print("char [] 값 출력 : ");
		System.out.println(car);
		
		String str2 = String.valueOf(car);
		System.out.println("char [] 을 다시 String 으로 바꾼 후 출력 : " + str2);
		System.out.println("모두 대문자로 변환하여 출력 : " + str2.toUpperCase());

	}

}
