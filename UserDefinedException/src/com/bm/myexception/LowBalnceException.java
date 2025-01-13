<<<<<<< HEAD
package com.bm.myexception;

public class LowBalnceException extends Exception {

	public LowBalnceException() {
	}

	public LowBalnceException(String msg) {
		super(msg);

	}

	public LowBalnceException(double amount, double balance) {
		super(getMsg(amount, balance));
	}

	private static String getMsg(double amount, double balance) {
		double less = amount - balance;
		return ("You are Rs : " + less + " short");

	}

	public void sendMail() {
		System.out.println("Mail sent to user");
	}

}
=======
package com.bm.myexception;

public class LowBalnceException extends Exception {

	public LowBalnceException() {
	}

	public LowBalnceException(String msg) {
		super(msg);

	}

	public LowBalnceException(double amount, double balance) {
		super(getMsg(amount, balance));
	}

	private static String getMsg(double amount, double balance) {
		double less = amount - balance;
		return ("You are Rs : " + less + " short");

	}

	public void sendMail() {
		System.out.println("Mail sent to user");
	}

}
>>>>>>> 820a8503d9b28a89c5c7c2077ec37760b56a3e84
