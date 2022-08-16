package instance.init;

public class TestSample2 {

	public static void main(String[] args) {
		Sample2 ref = new Sample2();
		
		System.out.println(ref);
		//인스턴스 변수 초기화 순서 : 객체 생성시 초기화 실행됨
		//1. 명시적 초기화 >> 2. 초기화 블럭 >> 3. 생성자
		
		//클래스변수 초기화 순서 : main() 실행될 때 초기화 처리됨
	}
}
