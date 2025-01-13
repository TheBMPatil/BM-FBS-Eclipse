package com.bm.code.security;

import com.bm.code.external.SalesPerson;

public class MainApp {

	public static void main(String[] args) {
		Employee[] emps = { new Developer(), new Admin(), new Developer() , new SalesPerson()};

		MainApp app = new MainApp();

//		app.paySalary(emps);
		app.superSecretCode(emps);
	}

	private void superSecretCode(Employee[] emps) {
		// TODO Auto-generated method stub
		for (Employee ref : emps) {
			ref.confidentialMethod();
		}
	}

	private void paySalary(Employee[] ref) {
		double totalExp = 0;
		for (Employee emp : ref) {
			totalExp += emp.pay();
		}

	}

//	public static void paySalary(Employee[] ref) {
//		double totalExp = 0;
//		for (Employee emp : ref) {
//			totalExp += emp.pay();
//		}
//		
//	}

}
