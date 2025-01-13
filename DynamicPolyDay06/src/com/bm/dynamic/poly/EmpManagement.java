package com.bm.dynamic.poly;

public class EmpManagement {

	static void calSal(Employee[] emp) {

		for (int itr = 0; itr < emp.length; itr++) {
			System.out.println(emp[itr].calSal());
		}
	}

	static void calTotalSal(Employee[] emp) {

		double totalsal = 0;
		for (int itr = 0; itr < emp.length; itr++) {
			totalsal += emp[itr].calSal();
		}
		System.out.println("Total salary of ORG : " + totalsal);
	}

}
