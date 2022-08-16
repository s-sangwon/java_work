package oop.array.run;

import java.util.Scanner;

import oop.arrray.model.Person;

public class TestPersonArray2 {
	
	public static void inputPerson(Person[] ar) {
		Scanner sc = new Scanner(System.in);
		
		//객체 생성과 키보드 값 입력 처리
		for(int i=0; i< ar.length; i++) {
			ar[i] = new Person();
		
			System.out.println(i + "번째 Person 정보를 입력하세요.");
			System.out.print("이름 : ");
			ar[i].setName(sc.next());
			System.out.print("나이 : ");
			ar[i].setAge(sc.nextInt());
			System.out.print("키 : ");
			ar[i].setHeight(sc.nextDouble());
		}
		return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] par = new Person[3];
		inputPerson(par);
		
		//객체 정보 출력 확인
		//for each 문 사용 : 객체배열, 컬렉션
		/* for(클래스명 래퍼런스변수 : 배열명) {
		 * 
		 * 
		 * }
		 */
		for(Person ref : par) {
			System.out.println(ref.toString());
			
		}
	}

}
