<<<<<<< HEAD
package com.bm.finalstatic;

public class Manager extends Employee {

	public Manager() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Override
	public void print() {
		System.out.println("Manager");
		System.out.println("Name : " + this.getEmpName());
		System.out.println("EmpId : " + this.getEmpId());

	}

	public Manager(String empName, int empId) {
		super(empName, empId);
		// TODO Auto-generated constructor stub
	}

}
=======
package com.bm.finalstatic;

public class Manager extends Employee {

	public Manager() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Override
	public void print() {
		System.out.println("Manager");
		System.out.println("Name : " + this.getEmpName());
		System.out.println("EmpId : " + this.getEmpId());

	}

	public Manager(String empName, int empId) {
		super(empName, empId);
		// TODO Auto-generated constructor stub
	}

}
>>>>>>> 820a8503d9b28a89c5c7c2077ec37760b56a3e84
