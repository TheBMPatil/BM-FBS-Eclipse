<<<<<<< HEAD
package com.bm.code.security;

public class Admin extends Employee {

	double allowance;

	public Admin() {
		// TODO Auto-generated constructor stub]
		super();
	}

	@Override
	public double pay() {
		// TODO Auto-generated method stub
		System.out.println("Admin Pay");
		return this.salary + this.allowance;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

}
=======
package com.bm.code.security;

public class Admin extends Employee {

	double allowance;

	public Admin() {
		// TODO Auto-generated constructor stub]
		super();
	}

	@Override
	public double pay() {
		// TODO Auto-generated method stub
		System.out.println("Admin Pay");
		return this.salary + this.allowance;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

}
>>>>>>> 820a8503d9b28a89c5c7c2077ec37760b56a3e84
