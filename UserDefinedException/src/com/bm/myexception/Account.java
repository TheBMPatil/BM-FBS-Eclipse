package com.bm.myexception;

public class Account {
	double balance;
	String name;

	public Account(double balance, String name) {
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

//	public void withdrow(double amount) {
//
//		if (balance < amount) {
//
//			try {
//				throw new LowBalnceException(getLowBalanceMsg(amount));
//			} catch (LowBalnceException e) {
//				e.printStackTrace();
//			}
//
//		} else {
//
//			balance -= amount;
//		}
//	}
//
//	private String getLowBalanceMsg(double amt) {
//		double less = amt - balance;
//		String msg = "Itna kam pad rha hai bhai : ";
//		return msg + less;
//	}

//	public void withdrow(double amount) {
//		
//		if (balance < amount) {
////			LowBalnceException x=			new  LowBalnceException();
//			
//			try {
//				throw new LowBalnceException("Aukat me rah na bhai itna paisa nahi hain apne pass");
//			} catch (LowBalnceException e) {
//				e.printStackTrace();
//			}
//			
//		} else {
//			
//			balance -= amount;
//		}
//	}
	public void withdrow(double amount) throws LowBalnceException {

		if (balance < amount) {
			// LowBalnceException x= new LowBalnceException();
				throw new LowBalnceException(amount, balance);

		} else {

			balance -= amount;
		}
	}
//	public void withdrow(double amount) {
//		
//		if (balance < amount) {
//			// LowBalnceException x= new LowBalnceException();
//			
//			try {
//				throw new LowBalnceException(amount, balance);
//			} catch (LowBalnceException e) {
//				e.printStackTrace();
//			}
//			
//		} else {
//			
//			balance -= amount;
//		}
//	}

	public void cheackBalance() {
		System.out.println("Balance  :  " + balance);
	}

	public void deposit(double amount) {
		balance += amount;
	}
}
