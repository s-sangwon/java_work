package com.array1.controller;

import java.util.Scanner;

import com.oop.array1.model.Person;

public class TestPersonArray {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] par = new Person[2];
		int sumAge=0;
		long sump=0;
		double sumH=0, sumW=0;
		
		for(int i=0; i<par.length; i++) {
			par[i] = new Person();
			System.out.print("이름 : ");
			par[i].setName(sc.next());
			System.out.print("나이 : ");
			par[i].setAge(sc.nextInt());
			System.out.print("키 : ");
			par[i].setHeight(sc.nextDouble());
			System.out.print("몸무게 : ");
			par[i].setWeight(sc.nextDouble());
			System.out.print("재산 : ");
			par[i].setProperty(sc.nextInt());
		}
		for(Person ar : par) {
			sumAge += ar.getAge();
			sump += ar.getProperty();
			sumH += ar.getHeight();
			sumW += ar.getWeight();
		}
		System.out.println("나이 평균 : "+ sumAge/par.length);
		System.out.println("키 평균 : " +sump/par.length);
		System.out.println("몸무게 평균 : "+ sumH/par.length);
		System.out.println("재산 평균 : " +sumW/par.length);

	}

}
