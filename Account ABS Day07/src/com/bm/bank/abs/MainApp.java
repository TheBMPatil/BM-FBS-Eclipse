package com.bm.bank.abs;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account[] accounts = { new SavingsAccount(), new CurrentAccount() };
		AccountManagement.withdrow(accounts);

	}

}
