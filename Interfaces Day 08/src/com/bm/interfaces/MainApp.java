package com.bm.interfaces;


public class MainApp {
	public static void main(String[] args) {
//		Employee e1 = new Employee();
//		e1.print();
//		Printable ref = new Employee();
//		ref.print();
//		Printable [] emps = { new Developer(), new Manager(), new Developer() };
		Employee[] emps = { new Developer(), new Manager(), new Developer() };
		for (Employee emp : emps) {
			emp.print();
		}
//		for (Printable emp : emps) {
//			emp.print();
//		}
	}
}
