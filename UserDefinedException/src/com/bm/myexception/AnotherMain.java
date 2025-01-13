<<<<<<< HEAD
package com.bm.myexception;

public class AnotherMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account(20000, "Bhagavt");
		acc.cheackBalance();
		try {
			acc.withdrow(20052);
		} catch (LowBalnceException e) {
			// TODO Auto-generated catch block
			e.sendMail();
//			System.out.println("Mail is to be sent");
		}
		acc.cheackBalance();
	}

}
=======
package com.bm.myexception;

public class AnotherMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account(20000, "Bhagavt");
		acc.cheackBalance();
		try {
			acc.withdrow(20052);
		} catch (LowBalnceException e) {
			// TODO Auto-generated catch block
			e.sendMail();
//			System.out.println("Mail is to be sent");
		}
		acc.cheackBalance();
	}

}
>>>>>>> 820a8503d9b28a89c5c7c2077ec37760b56a3e84
