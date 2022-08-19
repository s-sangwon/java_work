package com.week4;

public class ExamString {
	public String preChar(String s) {
		char[] ar= new char[s.length()];
		ar = s.toCharArray();
		ar[0] = Character.toUpperCase(ar[0]);
		return String.valueOf(ar);
	}
	
	public int charSu(String s, char ch) {
		int count=0;
		char[] ar = new char[s.length()];
		ar = s.toCharArray();
		for(int i=0; i<ar.length; i++) {
			if(ar[i] == ch)
				count++;
		}
		return count;
	}
}
