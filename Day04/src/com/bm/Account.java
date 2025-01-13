<<<<<<< HEAD
package com.bm;

public class Account {
	int accId;
	String actName;
	double balance;
	Address postal; // This is containment : Account has address

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int accId, String actName, double balance, Address v4) {
//		System.out.println("Inside Account Constructor");
		this.accId = accId;
		this.actName = actName;
		this.balance = balance;
		this.postal = v4;

	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getActName() {
		return actName;
	}

	public void setActName(String actName) {
		this.actName = actName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposite(double amt) {
		this.balance += amt;
	}

//Static polymorphism
	public void withdrow(double amt) {
		this.balance -= amt;
	}

	public void withdrow(String cheque) {
//		this.balance -= amt;
		System.out.println("Withdrow String");
	}

	public Address getPostal() {
		return postal;
	}

	public void setPostal(Address postal) {
		this.postal = postal;
	}

	public void dispay() {
		System.out.println("ACC no : " + this.accId);
		System.out.println("ACC Name : " + this.actName);
		System.out.println("ACC Balance: " + this.balance);
		System.out.println("Lane1 :" + this.postal.getLane1());
		System.out.println("Lane2 :" + this.postal.getLane2());
	}

}
=======
package com.bm;

public class Account {
	int accId;
	String actName;
	double balance;
	Address postal; // This is containment : Account has address

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int accId, String actName, double balance, Address v4) {
//		System.out.println("Inside Account Constructor");
		this.accId = accId;
		this.actName = actName;
		this.balance = balance;
		this.postal = v4;

	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getActName() {
		return actName;
	}

	public void setActName(String actName) {
		this.actName = actName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposite(double amt) {
		this.balance += amt;
	}

//Static polymorphism
	public void withdrow(double amt) {
		this.balance -= amt;
	}

	public void withdrow(String cheque) {
//		this.balance -= amt;
		System.out.println("Withdrow String");
	}

	public Address getPostal() {
		return postal;
	}

	public void setPostal(Address postal) {
		this.postal = postal;
	}

	public void dispay() {
		System.out.println("ACC no : " + this.accId);
		System.out.println("ACC Name : " + this.actName);
		System.out.println("ACC Balance: " + this.balance);
		System.out.println("Lane1 :" + this.postal.getLane1());
		System.out.println("Lane2 :" + this.postal.getLane2());
	}

}
>>>>>>> 820a8503d9b28a89c5c7c2077ec37760b56a3e84
