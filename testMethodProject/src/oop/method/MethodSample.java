package oop.method;

public class MethodSample {
	//기본생성자
	public MethodSample() {}
	
	//반환값 없고 매개변수 없는 메소드
	public void hello() {
		System.out.println("hello! java...");
		return; //메소드 맨 마지막에 위치함. 생략될 수 있음
		
	}
	
	//반환값 없고 매개변수 있는 메소드
	public void hello(int no) {
		switch(no) {
		case 1: System.out.println("환영"); break;
		case 2: System.out.println("반갑"); break;
		case 3: System.out.println("어서"); break;
		default: System.out.println("안녕"); break;
		
		}
		return;
	}
	
	//반환값 있고 매개변수 없는 메소드
	public int randomValue() { 
		return (int)(Math.random()*100)+1;
		}
	
	//반환값 있고 매개변수 있는 메소드
	public int maxValue(int first, int second) { 
		return 2;
	}
}
