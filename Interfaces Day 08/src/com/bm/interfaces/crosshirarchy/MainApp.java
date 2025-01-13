<<<<<<< HEAD
package com.bm.interfaces.crosshirarchy;


public class MainApp {
	public static void main(String[] args) {
//		Employee e1 = new Employee();
//		e1.print();
//		Printable ref = new Employee();
//		ref.print();
		Printable [] printables = { new Developer(),new Trainer(), new Manager(), new Developer(), new Trainer() };
//		Employee[] emps = { new Developer(), new Manager(), new Developer()  };
//		for (Employee emp : emps) {
//			emp.print();
//		}
		for (Printable pable : printables) {
			pable.print();
		}
	}
}
=======
package com.bm.interfaces.crosshirarchy;


public class MainApp {
	public static void main(String[] args) {
//		Employee e1 = new Employee();
//		e1.print();
//		Printable ref = new Employee();
//		ref.print();
		Printable [] printables = { new Developer(),new Trainer(), new Manager(), new Developer(), new Trainer() };
//		Employee[] emps = { new Developer(), new Manager(), new Developer()  };
//		for (Employee emp : emps) {
//			emp.print();
//		}
		for (Printable pable : printables) {
			pable.print();
		}
	}
}
>>>>>>> 820a8503d9b28a89c5c7c2077ec37760b56a3e84
