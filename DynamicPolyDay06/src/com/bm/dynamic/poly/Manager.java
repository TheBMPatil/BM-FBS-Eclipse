package com.bm.dynamic.poly;

public class Manager extends Employee {
	int targt;
	double incetive;

	public int getTargt() {
		return targt;
	}

	public void setTargt(int targt) {
		this.targt = targt;
	}

	public double getIncetive() {
		return incetive;
	}

	public void setIncetive(double incetive) {
		this.incetive = incetive;
	}

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, double salary, int empId, int target, double incentive) {
		super(name, salary, empId);
		this.targt = target;
		this.incetive = incentive;
	}
	
	
	public double calSal() {

//		System.out.println("Manager salaray :");
		return salary+incetive;
	}

}
