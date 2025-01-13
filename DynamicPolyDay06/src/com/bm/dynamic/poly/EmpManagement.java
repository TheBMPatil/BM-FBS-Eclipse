<<<<<<< HEAD
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
=======
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
>>>>>>> 820a8503d9b28a89c5c7c2077ec37760b56a3e84
