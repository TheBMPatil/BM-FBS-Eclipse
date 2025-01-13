package com.bm.interfaces.crosshirarchy;

public class Developer extends Employee {

	public Developer() {
		super();
	}

	@Override
	public void print() {
		System.out.println("Inside Developer implementing Printable interface");

	}

}
