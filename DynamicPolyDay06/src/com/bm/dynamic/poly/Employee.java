package com.bm.dynamic.poly;

public class Employee {
	String name;
	double salary;
	int empId;

	public Employee() {
	}

	public Employee(String name, double salary, int empId) {
		this.name = name;
		this.salary = salary;
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void attendance() {
		System.out.println("Attendance Employee");
	}

	public double calSal() {
//		System.out.println("Employee salaray :");
		return salary;
	}
}
