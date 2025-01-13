<<<<<<< HEAD
package com.bm.str;

public class StringExample {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		System.out.println(123);
		System.out.println("Hash 1 : " + sb.hashCode());
		sb.append("Bhagvat");
		System.out.println("String : " + sb.toString());
		System.out.println("Hash 2 : " + sb.hashCode());

		String s1 = "Bhagvat";

		String s2 = new String("Bhagvat");
		System.out.println("s1 : " + s1.hashCode());
		s1 = "Mutthe";
		System.out.println("s1 : " + s1.hashCode());

		System.out.println("s2 : " + s2.hashCode());

	}

}
=======
package com.bm.str;

public class StringExample {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		System.out.println(123);
		System.out.println("Hash 1 : " + sb.hashCode());
		sb.append("Bhagvat");
		System.out.println("String : " + sb.toString());
		System.out.println("Hash 2 : " + sb.hashCode());

		String s1 = "Bhagvat";

		String s2 = new String("Bhagvat");
		System.out.println("s1 : " + s1.hashCode());
		s1 = "Mutthe";
		System.out.println("s1 : " + s1.hashCode());

		System.out.println("s2 : " + s2.hashCode());

	}

}
>>>>>>> 820a8503d9b28a89c5c7c2077ec37760b56a3e84
