package com.bm.code.security;

public class Admin extends Employee {

	double allowance;

	public Admin() {
		// TODO Auto-generated constructor stub]
		super();
	}

	@Override
	public double pay() {
		// TODO Auto-generated method stub
		System.out.println("Admin Pay");
		return this.salary + this.allowance;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

}
