package com.array2.controller;

import java.util.Scanner;

import com.oop.array2.model.Student;

public class TestStudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] sar = new Student[10];
		Scanner sc = new Scanner(System.in);
		int sCount = 0, sum=0;
		do {
			sar[sCount] = new Student();
			System.out.print("이름 : ");
			sar[sCount].setName(sc.next());
			
			System.out.print("국어점수 : ");
			sar[sCount].setKor(sc.nextInt());
			System.out.print("영어점수 : ");
			sar[sCount].setEng(sc.nextInt());
			System.out.print("수학점수 : ");
			sar[sCount++].setMat(sc.nextInt());
			
			System.out.print("계속 추가할까요?(y|n) : ");
		}while(sc.next().toUpperCase().charAt(0) == 'Y');
		
		for(int i=0; i<sCount; i++) {
			sum+=sar[i].getKor();
			sum+=sar[i].getEng();
			sum+=sar[i].getMat();
		}
		System.out.println("현재 입력된 학생들의 점수 평균 : " + sum/(3*sCount));
		
		System.out.println();
		for(int i=0; i<sCount; i++)  {
			System.out.println(sar[i]);
		}
	}

}
