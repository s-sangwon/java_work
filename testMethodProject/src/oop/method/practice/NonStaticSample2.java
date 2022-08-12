package oop.method.practice;

import java.util.Random;
import java.util.Scanner;

public class NonStaticSample2 {
	private Scanner sc = new Scanner(System.in);
	private Random rd = new Random();
	
	public NonStaticSample2(){}
	
	//int 한개의 전달값을 받아서, 배열의 주소를 리턴하는 메소드
	//처리할 내용 : 전달받은 정수 갯수만큼의 배열공간을 할당하여, 
	//         임의의 1부터 100사이의 값으로 값 기록하고 주소 리턴함
	//메소드 명 : intArrayAllocation
	//매개변수도 있고 반환값도 있는 메소드
	public int[] intArrayAllocation(int size) {
		int[] ar = new int[size];
		for(int i=0; i<ar.length; i++)
			ar[i] = rd.nextInt(100)+1;
		
		for(int i=0; i<ar.length; i++)
			System.out.print(ar[i] + "\t");
		System.out.println();
		
		return ar;
	}
	

	//메소드 명 : display
	//매개변수 있고 반환값 없는 메소드
	//처리할 내용 : 배열을 전달받아 화면에 출력함
	public void display(int[] ar) {
		for(int i=0; i<ar.length; i++)
			System.out.print(ar[i]);
		System.out.println();
	}
	
	
	//메소드명 : swap
	//매개변수 있고 반환값 없는 메소드
	//처리할 내용 : 배열과, 두 정수의 인덱스를 전달받아두 인덱스의 값을 교환함
	public void swap(int[] ar, int a, int b) {
//		for(int i=0; i<ar.length; i++)
//			System.out.print(ar[i]+"\t");
//		System.out.println();
		
		int tmp = ar[a];
		ar[a] = ar[b];
		ar[b] = tmp;
		System.out.println("swap");
		for(int i=0; i<ar.length; i++)
			System.out.print(ar[i]+"\t");
		System.out.println();
	}
	
	
	//메소드명 : sortDescending
	//매개변수 있고 반환값 없는 메소드
	//처리할 내용 : 위에서 작성한 swap 메소드를 이용하여배열의 값 들을 내림차순 정렬 처리함
	public void sortDescending(int[] ar) {
		//int start=0;
		
		for(int start=0; start<ar.length-1; start++) {
			int maxValueIndex=start;
			for(int i=start; i<ar.length; i++) {
				if(ar[i] > ar[maxValueIndex])
					maxValueIndex = i;
			}
			swap(ar, start, maxValueIndex);
		}
		System.out.println("selection sort complete");
		for(int i=0; i<ar.length; i++)
			System.out.print(ar[i]+"\t");
		System.out.println();
	}
	
	
	//메소드명 : sortAscending
	//매개변수 있고 반환값 없는 메소드
	//처리할 내용 : swap 메소드를 이용하여 배열의 값들을 오름차순 정렬함
	public void sortAscending(int[] ar) {
		//int start=0;
		
		for(int start=0; start<ar.length-1; start++) {
			int minIndex=start;
			for(int i=start; i<ar.length; i++) {
				if(ar[i] < ar[minIndex])
					minIndex = i;
			}
			swap(ar, start, minIndex);
		}
		System.out.println("selection sort complete");
		for(int i=0; i<ar.length; i++)
			System.out.print(ar[i]+"\t");
		System.out.println();
	}
	
	
	
	//1. 문자열과 문자 하나를 전달받아, 문자열에 포함된 문자의 갯수를 리턴하는 메소드
	//포함된 문자가 없으면 0 리턴함
	//메소드명 : countChar
	public int countChar(String str, char ch) {
		int count=0;
		if(str != null && str.length()>0) {
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i) == ch)
					count++;
			}
		}
		else
			count=0;
			
		return count;
	}
	
	
	//2. 정수 두 개를 전달받아, 두 수중 작은 값에서 큰 값사이의 정수들의 합계를 구해서
	//리턴하는 메소드
	//메소드명 : totalValue
	public int totalValue(int a, int b) {
		int result=0;
		int min=a, max=b;
		if ( a > b) {
			min=b; max=a;
		}
		
		for(int i=min; i<=max; i++) {
			System.out.print(i+"+");
			result+=i;
		}
		System.out.println();
		System.out.println(min + " ~ "+ max + " 합계 : " + result);
		return result;
		
	}
	
	//문자열과 인덱스를 전달받아, 그 위치의 문자를 리턴하는 메소드
	//메소명명 : pCharAt
	public char pCharAt(String str, int index) {
		char ch;
		if(str != null && str.length()>0 && str.length()-1>=index) {
			ch = str.charAt(index);
		}
		else {
			System.out.println("올바른 인덱스를 입력하세요");
			ch = 0;
		}
		return ch;
		
	}
	
	
	//두 개의 문자열을 전달받아, 하나의 문자열로 합쳐서 리턴하는 메소드
	//메소드명 : pConcat
	
	public String pConcat(String s1, String s2) {
		String cat="";
		if(s1 != null && s1.length()>0 && s2 != null && s2.length()>0) {
			cat = s1 + s2;
		}
		else
			System.out.println("한자리 이상의 문자열을 입력해주세요.");
		return cat;
	}
	
}
