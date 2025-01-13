package role.based.external;

import role.based.inheritance.Payble;

public class SalesPerson implements Payble {

	public SalesPerson() {
	
		// TODO Auto-generated constructor stub
	}

	@Override
	public double pay() {
		// TODO Auto-generated method stub
		System.out.println("Sales pay Salary");
		return 0;
	}

}
