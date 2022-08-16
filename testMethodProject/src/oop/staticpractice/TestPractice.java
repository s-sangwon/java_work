package oop.staticpractice;

public class TestPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticMethod.getValue());

		StaticMethod.setValue("Java");

		System.out.println(StaticMethod.getValue());

		StaticMethod.toUpper();
		
		System.out.println(StaticMethod.getValue());
		
		StaticMethod.setChar(1, 'f');
		
		System.out.println(StaticMethod.getValue());
		
		System.out.println(StaticMethod.valueLength());
		
		
		System.out.println(StaticMethod.valueConcat(" hello"));
	}

}
