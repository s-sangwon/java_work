package com.oop.view;

import java.util.Scanner;

import com.oop.controller.EmployeeManager;
import com.oop.model.dto.Employee;

public class EmpMenu {
	private static Scanner sc = new Scanner(System.in);
	
	public static void mainMenu(){
		Employee emp = null;
		EmployeeManager emanager = new EmployeeManager();
		boolean flag = true;
		String menu = "\n******* 사원 정보 관리 프로그램 ************\n\n"+

				"1. 새 사원 정보 입력\n"+

				"2. 사원 정보 수정\n"+
				"3. 사원 정보 삭제\n"+
				"4. 사원정보 출력\n"+
				"9. 끝내기\n"+
				"번호 입력 : ";
		while(flag) {
			System.out.print(menu);
			int no = sc.nextInt();
			switch (no) {
			case 1: 
				emp = emanager.empInput();
				break;
			case 2: 
				modifyMenu(emp); 
				break;
			case 3: 
				emp = null;
				System.out.println("사원 정보 삭제됨.");
				break;
			case 4: 
				if(emp == null) System.out.println("조회할 직원 정보 없음.");
				else emanager.empOutput(emp);
				break;
			case 9: 
				flag=false; //반복종료.
				break;
			}
			
		}
		System.out.println("사원 정보 관리 프로그램 종료.");

	}
	
	public static void modifyMenu(Employee emp){
		
		String menu ="\n**** 사원 정보 수정 메뉴 *****\n\n"+
				"1. 이름 변경\n"+
				"2. 급여 변경\n"+
				"3. 부서 변경\n"+
				"4. 직급 변경\n"+
				"5. 이전 메뉴로 이동\n"+
				"번호 입력 : ";
		while(true) {
			System.out.print(menu);
			int no = sc.nextInt();
			switch (no) {
			case 1: 
				System.out.print("변경할 이름 : "); 
				emp.setEmpName(sc.next()); 
				break;
			case 2: 
				System.out.print("변경할 급여 : ");
				emp.setSalary(sc.nextInt()); 
				break;
			case 3: 
				System.out.print("변경할 부서 : ");
				emp.setDept(sc.next()); 
				break;
			case 4: 
				System.out.print("변경할 직급 : ");
				emp.setJob(sc.next());
				break;
			case 5: return;
			}
		}
				
	}
}
