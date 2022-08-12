package com.oop.controller;

import com.oop.model.dto.Employee;

public class EmpArrayTest {

	public static void main(String[] args) {
		// Employee 실행용 클래스
		Employee[] ear = new Employee[3];
		ear[0] = new Employee();
		ear[1] = new Employee(201503, "박길동", 29, 'M', "010-1234-5678","경기도 의정부시");
		ear[2] = new Employee(201004, "김철수", "개발부", "과장", 34, 'M', 4500000, 0.15, "010-2143-9876", "서울시 노원구 노원동 123");
		System.out.println(ear[0].empInformation());
		System.out.println(ear[1].empInformation());
		System.out.println(ear[2].empInformation());
		
		ear[0].setEmpNo(201305);
		ear[0].setEmpName("이영희");
		ear[0].setDept("총무부");
		ear[0].setJob("대리");
		ear[0].setAge(28);
		ear[0].setGender('F');
		ear[0].setSalary(3750000);
		ear[0].setBonusPoint(0.1);
		ear[0].setPhone("010-9512-7534");
		ear[0].setAddress("경기도 동두천");
		
		ear[1].setDept("기획부");
		ear[1].setJob("사원");
		ear[1].setSalary(2900000);
		ear[1].setBonusPoint(0.05);
		System.out.println();
		System.out.println(ear[0].empInformation());
		System.out.println(ear[1].empInformation());
		
		int[] s = {(int)(ear[0].getSalary()+(ear[0].getSalary()*ear[0].getBonusPoint())) * 12 ,
				(int)(ear[1].getSalary()+(ear[1].getSalary()*ear[1].getBonusPoint())) * 12 ,
				(int)(ear[2].getSalary()+(ear[2].getSalary()*ear[2].getBonusPoint())) * 12 };
		
			
		
		System.out.println();
		System.out.println(ear[0].getEmpName() + "의 연봉 : " + s[0]);
		System.out.println(ear[1].getEmpName() + "의 연봉 : " + s[1]);
		System.out.println(ear[2].getEmpName() + "의 연봉 : " + s[2]);
		
		System.out.println();
		System.out.println("직원들의 연봉의 평균 : " +(s[0]+s[1]+s[2])/3);
	}

}
