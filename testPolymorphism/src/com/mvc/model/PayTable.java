package com.mvc.model;

import java.util.Scanner;

import com.mvc.view.Output;

public class PayTable extends Salary implements Calculate, Output {

	public PayTable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PayTable(String name, long pay, int family, int overtime) {
		super(name, pay, family, overtime);
		// TODO Auto-generated constructor stub
	}

	public PayTable(String name, long pay, long familyP, long overtimeP, long incenP, long tax, long totalPay,
			int family, int overtime) {
		super(name, pay, familyP, overtimeP, incenP, tax, totalPay, family, overtime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void out() {
	

		System.out.println(getName() +"\t" + getPay()+"\t" + getFamily()+"\t" + getFamilyP()+"\t" + getOvertime()+"\t"+ getOvertimeP()+"\t" + getTax()+"\t" + getIncentive()+"\t\t" + getIncenP()+"\t" + getTotalPay());

	}

	@Override
	public void calc() {

		if (super.getFamily() < 3)
			super.setFamilyP(super.getFamily() * 20000);
		else
			super.setFamilyP(60000);
		
		super.setOvertimeP(getOvertime()*5000);
		
		super.setTax((long)(getPay()*0.1));
		
		super.setIncenP((long)(getIncentive()*getPay()));
		
		super.setTotalPay(getPay() + getFamilyP() + getIncenP() + getOvertimeP() - getTax());

	}

}
