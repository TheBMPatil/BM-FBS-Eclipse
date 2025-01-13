package com.bm.dynamic.poly;

public class MainApp {
	public static void main(String[] args) {
//		System.out.println("Main me hain hum");

		Employee[] emps = 
			{ new Developer("Bhagvat", 12, 35000, "Java", 2000.78),
				new Manager("Amol", 23400, 13, 17, 200.89),
				new Developer("Ajay", 12, 20000, "CPP", 2000.78),
				new Manager("Ankush", 23300, 13, 17, 200.89) };

		EmpManagement.calSal(emps);
		EmpManagement.calTotalSal(emps);
	}
}
