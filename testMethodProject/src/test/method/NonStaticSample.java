package test.method;

import java.util.Random;

public class NonStaticSample {
	public NonStaticSample(){}
	
	//1. 반환값 없고 매개변수 없는 메소드
	//실행 요청시 1~45까지의 임의의 정수 6개 중복되지 않게 발생시켜 출력하는 메소드
	//메소드명 : printLottoNumbers
	public void printLottoNumbers() {
		int count = 0;
		int[] roto = new int[6];
		Random rd = new Random();
		while(count < roto.length) {
			roto[count] = rd.nextInt(6)+1;
			for(int i=0; i<count; i++) 
				if(roto[count] == roto[i])
					count--;
			count++;
		}
		
//		for(int i=0; i<roto.length; i++) {
//			roto[i] = rd.nextInt(45)+1;
//			for(int j=0; j<i; j++) {
//				if(roto[i] == roto[j]) {
//					i--;
//					break;
//				}
//			}
//		}
		
		
		for(int i=0; i<roto.length; i++) {
			System.out.print(roto[i]+ "\t");
		}
	}
	
	
	//2. 반환값 없고 매개변수 있는 메소드
	//실행 요청시 정수 하나, 문자 하나를 전달받아 문자를 정수 갯수만큼 출력하는 메소드
	//메소드명 : outputChar
	public void outputChar(int a, char b) {
		for(int i=0; i<a; i++) {
			System.out.print(b);
		}
	}
	
	
	
	//3. 반환값 있고 매개변수 없는 메소드
	//실행 요청시 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
	//메소드명 : alphabette
	public char alphabette() {
		Random rd = new Random();
		int a;
		while(true) {
			a = rd.nextInt(58)+65; // 65~ 122
			
			if((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z'))
				break;
		}
		return (char) a;	
		
	}
	
	//4. 반환값 있고 매개변수 있는 메소드
	//실행 요청시 문자열과 시작인덱스, 끝인덱스를 전달받아 해당 인덱스 범위의 문자열을
	//추출하여 리턴하는 메소드. 단 문자열은 반드시 값이 있어야함. 없으면 null 리턴처리
	//메소드명 : mySubstring
	public String mySubstring(String str, int start, int end) {
		String re;
		if(str != null) {
			re = str.substring(start, end);
		}
		else
			re = null;
		return re;
	}
	
	
}
