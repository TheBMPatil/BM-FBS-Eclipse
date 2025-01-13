package com.bm.containment;

import com.bm.containment.sy.SyMarks;
import com.bm.containment.ty.TyMarks;

public class MainApp {
	public static void main(String[] args) {

		SyMarks syMarks = new SyMarks(75, 80, 70);

		TyMarks tyMarks = new TyMarks(60, 65);

		Student stud = new Student("Bhagvat Mutthe", 12345, syMarks, tyMarks);
		stud.displayResult();

	}

}
