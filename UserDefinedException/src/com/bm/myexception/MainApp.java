<<<<<<< HEAD
package com.bm.myexception;

public class MainApp {

	public static void main(String[] args) {

		Account acc = new Account(20000, "Bhagavt");
		acc.cheackBalance();
		
		try {
			acc.withdrow(20052);
		} catch (LowBalnceException e) {
			e.printStackTrace();
		}
		acc.cheackBalance();

	}

}
=======
package com.bm.myexception;

public class MainApp {

	public static void main(String[] args) {

		Account acc = new Account(20000, "Bhagavt");
		acc.cheackBalance();
		
		try {
			acc.withdrow(20052);
		} catch (LowBalnceException e) {
			e.printStackTrace();
		}
		acc.cheackBalance();

	}

}
>>>>>>> 820a8503d9b28a89c5c7c2077ec37760b56a3e84
