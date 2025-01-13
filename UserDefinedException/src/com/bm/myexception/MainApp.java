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
