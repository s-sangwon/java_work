package test.object;

//하나의 클래스 파일 안에 클래스를 여러 개 작성할 수도 있음
//주의사항 : 파일명으로 사용된 클래스만 public class 로 지정함
//		파일명이 아닌 클래스는 public 사용 못 함
public class TestObject {

	public static void main(String[] args) {
		// 모든 클래스는 java.lang.Object 의 후손이다.
		// Object 가 제공하는 메소드 모두 사용할 수 있다.
		Book book = new Book();
		Book ref = book; // shallow copy
		
		System.out.println("hashCode : " + book.hashCode());
		System.out.println("equlas : " + book.equals(ref));
		System.out.println("toString : " + book.toString());
		
		
	}
	

}

class Book {
	private String title;
	
	public Book() {}
}