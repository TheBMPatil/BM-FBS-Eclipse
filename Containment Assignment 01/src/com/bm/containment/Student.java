<<<<<<< HEAD
package com.bm.containment;

import com.bm.containment.sy.SyMarks;
import com.bm.containment.ty.TyMarks;

public class Student {
	private int rollNo;
	private String name;
	private SyMarks syMarks;
	private TyMarks tyMarks;

	public Student(String name, int rollNumber, SyMarks syMarks, TyMarks tyMarks) {
		this.name = name;
		this.rollNo = rollNumber;
		this.syMarks = syMarks;
		this.tyMarks = tyMarks;
	}

	public String calculateGrade() {
		int totalMarks = syMarks.getTotalMarks() + tyMarks.getTotalMarks();
		int percentage = totalMarks / 2; // Assuming total is out of 200

		if (percentage >= 70) {
			return "Grade: A";
		} else if (percentage >= 60) {
			return "Grade: B";
		} else if (percentage >= 50) {
			return "Grade: C";
		} else if (percentage >= 40) {
			return "Grade: Pass Class";
		} else {
			return "Grade: Fail";
		}
	}

	public void displayResult() {
		System.out.println("Student Name: " + name);
		System.out.println("Roll Number: " + rollNo);
		System.out.println("SY Marks (Computer, Maths, Electronics): " + syMarks.getComputerTotal() + ", "
				+ syMarks.getMathsTotal() + ", " + syMarks.getElectronicsTotal());
		System.out.println("TY Marks (Theory, Practical): " + tyMarks.getTheory() + ", " + tyMarks.getPractical());
		System.out.println(calculateGrade());
	}
}
=======
package com.bm.containment;

import com.bm.containment.sy.SyMarks;
import com.bm.containment.ty.TyMarks;

public class Student {
	private int rollNo;
	private String name;
	private SyMarks syMarks;
	private TyMarks tyMarks;

	public Student(String name, int rollNumber, SyMarks syMarks, TyMarks tyMarks) {
		this.name = name;
		this.rollNo = rollNumber;
		this.syMarks = syMarks;
		this.tyMarks = tyMarks;
	}

	public String calculateGrade() {
		int totalMarks = syMarks.getTotalMarks() + tyMarks.getTotalMarks();
		int percentage = totalMarks / 2; // Assuming total is out of 200

		if (percentage >= 70) {
			return "Grade: A";
		} else if (percentage >= 60) {
			return "Grade: B";
		} else if (percentage >= 50) {
			return "Grade: C";
		} else if (percentage >= 40) {
			return "Grade: Pass Class";
		} else {
			return "Grade: Fail";
		}
	}

	public void displayResult() {
		System.out.println("Student Name: " + name);
		System.out.println("Roll Number: " + rollNo);
		System.out.println("SY Marks (Computer, Maths, Electronics): " + syMarks.getComputerTotal() + ", "
				+ syMarks.getMathsTotal() + ", " + syMarks.getElectronicsTotal());
		System.out.println("TY Marks (Theory, Practical): " + tyMarks.getTheory() + ", " + tyMarks.getPractical());
		System.out.println(calculateGrade());
	}
}
>>>>>>> 820a8503d9b28a89c5c7c2077ec37760b56a3e84
