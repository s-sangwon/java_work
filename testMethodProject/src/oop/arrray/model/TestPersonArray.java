package oop.arrray.model;

public class TestPersonArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Person[] ar = new Person[3];
			ar[0] = new Person("홍길동", 27, 128.5);
			ar[1] = new Person("홍길동2", 28, 158.5);
			ar[2] = new Person("홍길동3", 29, 188.5);
			
			System.out.println(ar[0]);
	}

}
