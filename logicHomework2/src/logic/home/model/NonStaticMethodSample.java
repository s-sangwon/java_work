package logic.home.model;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class NonStaticMethodSample {
	Scanner sc = new Scanner(System.in);

	public void testScanner() {
		boolean bool;
		byte bValue;
		short sValue;
		int iValue;
		long lValue;
		float fValue;
		double dValue;
		char character;
		String str;

		System.out.println("논리형 입력 : ");
		bool = sc.nextBoolean();
		System.out.println(bool);

		System.out.println("byte정수형 입력 : ");
		bValue = sc.nextByte();
		System.out.println(bValue);

		System.out.println("short정수형 입력 : ");
		sValue = sc.nextShort();
		System.out.println(sValue);

		System.out.println("int정수형 입력 : ");
		iValue = sc.nextInt();
		System.out.println(iValue);

		System.out.println("long정수형 입력 : ");
		lValue = sc.nextLong();
		System.out.println(lValue);

		System.out.println("float실수형 입력 : ");
		fValue = sc.nextFloat();
		System.out.println(fValue);

		System.out.println("double실수형 입력 : ");
		dValue = sc.nextDouble();
		System.out.println(dValue);

		System.out.println("문자형 입력 : ");
		character = sc.next().charAt(0);
		System.out.println(character);

		System.out.println("문자열 입력 : ");
		str = sc.next();
		System.out.println(str);

	}

	public void testDate() {
		Date today = new Date();
		System.out.println(today);
	}

	public void testRandom() {
		int ri = new Random().nextInt();
		double rd = new Random().nextDouble();
		System.out.println("정수난수 : " + ri);
		System.out.println("실수난수 : " + rd);
	}

}
