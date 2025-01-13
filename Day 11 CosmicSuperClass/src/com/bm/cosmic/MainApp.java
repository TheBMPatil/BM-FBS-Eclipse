package com.bm.cosmic;

public class MainApp {
	public static void main(String[] args) {
		Player p1 = new Player(123, "Sunil Chetri", 7);
		System.out.println(p1);
		Player p2 = new Player(123, "Sunil Chetri", 7);
		System.out.println(p2);

		if (p1.equals(p2)) {
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}

	}

}
