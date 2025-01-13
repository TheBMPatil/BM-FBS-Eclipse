package com.bm.interfaces;

import com.bm.interfaces.Printable;

// This sets up a relation : is-like-a

public abstract class  Employee implements Printable {

	String empName;
	int empId;

	public Employee(String empName, int empId) {
		this.empName = empName;
		this.empId = empId;
	}

	public Employee() {
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

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	
	public abstract void print() ;


}
