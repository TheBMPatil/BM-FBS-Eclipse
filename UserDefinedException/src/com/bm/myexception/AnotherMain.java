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
