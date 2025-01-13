<<<<<<< HEAD
package com.bm.collectios;

public class Account {
	double balance;
	int accId;
	String name;

	public Account() {
	}

	public Account(int accID, double balance, String name) {
		this.accId = accID;
		this.balance = balance;
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return this.accId;
	}

	@Override
	public boolean equals(Object obj) {
		Account otherObj = (Account) obj;
		if (this.accId == otherObj.accId) {
			return true;
		}
		return false;

	}

	public void cheackBalance() {
		System.out.println("Balance  :  " + balance);
	}

	public void deposit(double amount) {
		balance += amount;
	}
}
=======
package com.bm.collectios;

public class Account {
	double balance;
	int accId;
	String name;

	public Account() {
	}

	public Account(int accID, double balance, String name) {
		this.accId = accID;
		this.balance = balance;
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return this.accId;
	}

	@Override
	public boolean equals(Object obj) {
		Account otherObj = (Account) obj;
		if (this.accId == otherObj.accId) {
			return true;
		}
		return false;

	}

	public void cheackBalance() {
		System.out.println("Balance  :  " + balance);
	}

	public void deposit(double amount) {
		balance += amount;
	}
}
>>>>>>> 820a8503d9b28a89c5c7c2077ec37760b56a3e84
