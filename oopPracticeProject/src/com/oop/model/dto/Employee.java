package com.oop.model.dto;

public class Employee {
	private int empNO;
	private String empName;
	private String dept;
	private String job;
	
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	
	private String phone;
	private String address;
	
	// Constructor
	public Employee() {}
	
	public Employee(int empNO,String empName,int age, int salary ) {
		this.empNO = empNO;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
	}
	public Employee(int empNO,String empName, String dept, String job, int age, char gender, int salary, double bonusPoint, String phone, String address ) {
		this.empNO = empNO;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
	}
	
	//int getter, setter
	public void setEmpNO(int eno) {empNO = eno; }
	public int getEmpNO() {return empNO;}
	
	public void setAge(int y) {age = y; }
	public int getAge() {return age;}
	
	public void setSalary(int s) {salary = s; }
	public int getSalary() {return salary;}
	//end 
	
	//String getter, setter
	public void setEmpName(String ename) {empName = ename; }
	public String getEmpName() {return empName;}
	
	public void setDept(String dept) {this.dept = dept; }
	public String getDept() {return dept;}
	
	public void setJob(String job) {this.job = job; }
	public String getJob() {return job;}
	
	public void setPhone(String phone) {this.phone = phone; }
	public String getPhone() {return phone;}
	
	public void setAddress(String address) {this.address = address; }
	public String getAddress() {return address;}
	//end
	
	//char getter, setter
	public void setGender(char gender) {this.gender = gender; }
	public char getGender() {return gender;}
	
	//double getter, setter
	public void setBonusPoint(double bonusPoint) {this.bonusPoint = bonusPoint; }
	public double getBonusPoint() {return bonusPoint;}
	
	public void information() { 
		System.out.println(this);
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empNO +"\t"+ empName +"\t"+ dept +"\t"+ job +"\t"+ age +"\t"+ gender +"\t"+ salary +"\t"+ bonusPoint +"\t"+ phone +"\t"+ address;
	}
	

}
