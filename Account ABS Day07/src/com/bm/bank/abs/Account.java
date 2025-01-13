<<<<<<< HEAD
package com.bm.bank.abs;

public abstract class Account {
	int accNo;
	double balance;
	String accHolderName;

	public Account(int accNo, double balance, String accHolderName) {
		this.accNo = accNo;
		this.balance = balance;
		this.accHolderName = accHolderName;
	}

	public Account() {
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public void deposite(double amt) {
		this.balance += amt;
	}

	public abstract void withdrow(double amt);

}
=======
package com.bm.bank.abs;

public abstract class Account {
	int accNo;
	double balance;
	String accHolderName;

	public Account(int accNo, double balance, String accHolderName) {
		this.accNo = accNo;
		this.balance = balance;
		this.accHolderName = accHolderName;
	}

	public Account() {
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public void deposite(double amt) {
		this.balance += amt;
	}

	public abstract void withdrow(double amt);

}
>>>>>>> 820a8503d9b28a89c5c7c2077ec37760b56a3e84
