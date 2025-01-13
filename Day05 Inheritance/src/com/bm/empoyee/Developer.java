<<<<<<< HEAD
package com.bm.empoyee;

public class Developer extends Employee {
	String skillSet;

//	public Developer(int id, String name, double sal, String skills) {
//		super(name, sal, id);
//		skillSet = skills;
//	}




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

}
=======
package com.bm.empoyee;

public class Developer extends Employee {
	String skillSet;

//	public Developer(int id, String name, double sal, String skills) {
//		super(name, sal, id);
//		skillSet = skills;
//	}




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

}
>>>>>>> 820a8503d9b28a89c5c7c2077ec37760b56a3e84
