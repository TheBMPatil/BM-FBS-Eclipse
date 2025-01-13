package com.bm.finalstatic;

public class Developer extends Employee {

	public Developer() {
		super();
	}

	@Override
	public void print() {
		System.out.println("Developer");
		System.out.println("Name : " + this.getEmpName());
		System.out.println("EmpId : " + this.getEmpId());
	}

	public Developer(String empName, int empId) {
		super(empName, empId);
		// TODO Auto-generated constructor stub
	}

}
