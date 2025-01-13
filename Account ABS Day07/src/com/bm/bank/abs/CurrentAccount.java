package com.bm.bank.abs;

public class CurrentAccount extends Account {

	public CurrentAccount() {
		super();
	}

	public void withdrow(double amt) {
		System.out.println("Current Acc withdow");
		this.balance -= amt;
	}
}
