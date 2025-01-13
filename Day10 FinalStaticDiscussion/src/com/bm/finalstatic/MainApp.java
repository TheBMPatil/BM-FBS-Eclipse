package com.bm.finalstatic;

public class MainApp {
	public static void main(String[] args) {
		Employee e1 = new Developer("Bhagvat", 123);
		Employee e2 = new Manager("Amol", 223);

		e1.print();
		e2.print();
	}
}
