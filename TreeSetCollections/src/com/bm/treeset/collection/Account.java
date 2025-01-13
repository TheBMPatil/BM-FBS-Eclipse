package com.bm.treeset.collection;

public class Account implements Comparable<Account> {
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

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
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

	@Override
	public int compareTo(Account o) {
		if (this.accId > o.accId) {
			return -1;
//			return 1;
		} else if (this.accId < o.accId) {
			return 1;
//			return -1;
		} else {
			return 0;
		}
	}

}
