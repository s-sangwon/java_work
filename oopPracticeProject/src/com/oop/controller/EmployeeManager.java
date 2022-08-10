package com.oop.controller;

import java.util.Scanner;

import com.oop.model.dto.Employee;

public class EmployeeManager {
	private Scanner sc = new Scanner(System.in);
	
	public Employee empInput() {
		Employee emp = new Employee();
		
		System.out.print("사번 : ");
		emp.setEmpNO(sc.nextInt());
		
		System.out.print("이름 : ");
		emp.setEmpName(sc.next());
		System.out.print("소속부서 : ");
		emp.setDept(sc.next());
		System.out.print("직급 : ");
		emp.setJob(sc.next());
		
		System.out.print("나이 : ");
		emp.setAge(sc.nextInt());
		
		System.out.print("성별 : ");
		emp.setGender(sc.next().charAt(0));
		
		System.out.print("급여 : ");
		emp.setSalary(sc.nextInt());
		
		System.out.print("보너스포인트 : ");
		emp.setBonusPoint(sc.nextDouble());
		
		System.out.print("핸드폰 : ");
		emp.setPhone(sc.next());
		System.out.print("주소 : ");
		emp.setAddress(sc.next());
		
		return emp;
	}
	
	public void empOutput(Employee emp) {
		System.out.println("사번 : "+emp.getEmpNO());
		
		System.out.println("이름 : "+emp.getEmpName());
		System.out.println("소속부서 : "+emp.getDept());
		System.out.println("직급 : "+emp.getJob());
		
		System.out.println("나이 : "+emp.getAge());
		
		System.out.println("성별 : "+emp.getGender());
		
		System.out.println("급여 : "+emp.getSalary());
		
		System.out.println("보너스포인트 : "+emp.getBonusPoint());
		
		System.out.println("핸드폰 : "+emp.getPhone());
		System.out.println("주소 : "+emp.getAddress());

	}
}
