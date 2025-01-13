package com.bm.empoyee;

public class MainApp {

	public static void main(String[] args) {
	
		Employee e1 = new Employee();
		Developer e2 = new Developer();
		Employee e3 = new Developer();

		e1.attendance();
		e2.attendance();
		System.out.println(e2.attendance("BM"));
		e3.attendance();

	}

}
