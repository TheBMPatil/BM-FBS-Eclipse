<<<<<<< HEAD
package com.bm;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Account[] accs = new Account[10];
		Account[] accs = { new Account(1, "Bhagvat", 20012, new Address("Shivrai", "sambhajinagar")),
				new Account(2, "Amol", 200.12, new Address("Shivrai", "sambhajinagar")),
				new Account(3, "Ankush", 2001.2, new Address("Shivrai", "sambhajinagar")) };
//		for (int ctr = 0; ctr < accs.length; ctr++) {
//
//		}
		for (int ctr = 0; ctr < accs.length; ctr++) {

			System.out.println();
			System.out.println(accs[ctr]);

			accs[ctr].dispay();
		}
		accs[0].withdrow("123");
	}

}
=======
package com.bm;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Account[] accs = new Account[10];
		Account[] accs = { new Account(1, "Bhagvat", 20012, new Address("Shivrai", "sambhajinagar")),
				new Account(2, "Amol", 200.12, new Address("Shivrai", "sambhajinagar")),
				new Account(3, "Ankush", 2001.2, new Address("Shivrai", "sambhajinagar")) };
//		for (int ctr = 0; ctr < accs.length; ctr++) {
//
//		}
		for (int ctr = 0; ctr < accs.length; ctr++) {

			System.out.println();
			System.out.println(accs[ctr]);

			accs[ctr].dispay();
		}
		accs[0].withdrow("123");
	}

}
>>>>>>> 820a8503d9b28a89c5c7c2077ec37760b56a3e84
