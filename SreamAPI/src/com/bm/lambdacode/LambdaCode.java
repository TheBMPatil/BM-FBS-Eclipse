<<<<<<< HEAD
package com.bm.lambdacode;

public class LambdaCode {
	public static void main(String[] args) {
//		System.out.println("Lambda Code");

		// Approach 1 : Implementation Calass

		ArithmeticOps add = new Addition();

		System.out.println(add.calculate(10, 5));
//
		// Approach 2 : Anonymous inner Class
		// We do not use it usually
		// Use mostly in GUI Application devleopment
		ArithmeticOps subs = new ArithmeticOps() {
			@Override
			public int calculate(int op1, int op2) {
				return op1 - op2;
			}
		};

		System.out.println(subs.calculate(30, 10));

		// Approach 3 : Lambda expression
		// Only intefaces can work with lambda

//		ArithmeticOps multiply = (a, b) -> a * b;
		ArithmeticOps multiply = (a, b) -> {
			System.out.println("Inside Lambda");
			return a * b;
		};

		System.out.println(multiply.calculate(12, 2));

	}
}
=======
package com.bm.lambdacode;

public class LambdaCode {
	public static void main(String[] args) {
//		System.out.println("Lambda Code");

		// Approach 1 : Implementation Calass

		ArithmeticOps add = new Addition();

		System.out.println(add.calculate(10, 5));
//
		// Approach 2 : Anonymous inner Class
		// We do not use it usually
		// Use mostly in GUI Application devleopment
		ArithmeticOps subs = new ArithmeticOps() {
			@Override
			public int calculate(int op1, int op2) {
				return op1 - op2;
			}
		};

		System.out.println(subs.calculate(30, 10));

		// Approach 3 : Lambda expression
		// Only intefaces can work with lambda

//		ArithmeticOps multiply = (a, b) -> a * b;
		ArithmeticOps multiply = (a, b) -> {
			System.out.println("Inside Lambda");
			return a * b;
		};

		System.out.println(multiply.calculate(12, 2));

	}
}
>>>>>>> 820a8503d9b28a89c5c7c2077ec37760b56a3e84
