package com.bm.code.security;

public class Developer extends Employee {
	String skillSet;
	double bonus;


	public Developer() {
		super();
	}

	public Developer(String name, double salary, int empId, String skillSet) {
		super(name, salary, empId);
		this.skillSet = skillSet;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	public void attendance() {
		System.out.println("Attendance Develoer");
	}

	public String attendance(String msg) {
		return msg;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public double pay() {
		// TODO Auto-generated method stub

		System.out.println("Pay Salary to developer");

		return this.salary + this.bonus;

	}

}
