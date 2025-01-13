package com.bm.bank.abs;

public class SavingsAccount extends Account {

	public SavingsAccount() {
		super();
	}

	public void withdrow(double amt) {
		System.out.println("Savings Acc");
		this.balance -= amt;
	}
}
