package oop.abst;

public class SubClass extends AbstractSample {
//상속받은 부모의 추상메소드를 강제적으로 완성시켜야 함
	//추상메소드 오버라이딩

	@Override
	public void abstMethod() {
		// 추상메소드는 메소드 바디(body, {})를 만들면 완성으로 봄
		// 메소드 사용 규칙의 강제화를 목적으로함
	}
	
	
}
