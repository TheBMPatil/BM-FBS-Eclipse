<<<<<<< HEAD
package role.based.inheritance;

import role.based.external.SalesPerson;

public class MainApp {

	public static void main(String[] args) {
		Payble[] emps = { new Developer(), new Admin(), new Developer(), new SalesPerson() };

		MainApp app = new MainApp();

		app.paySalary(emps);
//		app.superSecretCode(emps);
	}

//	private void superSecretCode(Payble[] emps) {
//		// TODO Auto-generated method stub
//		for (Payble ref : emps) {
//			ref.confidentialMethod();
//		}
//	}

	private void paySalary(Payble[] ref) {
		double totalExp = 0;
		for (Payble emp : ref) {
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
=======
package role.based.inheritance;

import role.based.external.SalesPerson;

public class MainApp {

	public static void main(String[] args) {
		Payble[] emps = { new Developer(), new Admin(), new Developer(), new SalesPerson() };

		MainApp app = new MainApp();

		app.paySalary(emps);
//		app.superSecretCode(emps);
	}

//	private void superSecretCode(Payble[] emps) {
//		// TODO Auto-generated method stub
//		for (Payble ref : emps) {
//			ref.confidentialMethod();
//		}
//	}

	private void paySalary(Payble[] ref) {
		double totalExp = 0;
		for (Payble emp : ref) {
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
>>>>>>> 820a8503d9b28a89c5c7c2077ec37760b56a3e84
