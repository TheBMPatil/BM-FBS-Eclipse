package com.bm.finalstatic;

// This sets up a relation : is-like-a

public abstract class Employee {

	String empName;
	final int empId;

	public Employee(String empName, int empId) {
		this.empName = empName;
		this.empId = empId;
	}

	public Employee() {
		empId = 787;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public abstract void print();

}
