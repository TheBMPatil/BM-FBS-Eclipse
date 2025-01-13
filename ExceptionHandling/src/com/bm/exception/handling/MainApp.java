<<<<<<< HEAD
package com.bm.exception.handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		System.out.println("Hi");
		finallyException();

	}

	public static void finallyException() {
		Scanner sc = new Scanner(System.in);

		boolean allIsWell = false;
		while (allIsWell == false) {
			try {// Code in which problem may occur
				int value = sc.nextInt();
				System.out.println("Value : " + value);// Handled the problem
				allIsWell = true;
			} catch (InputMismatchException ime) {
				// Handling the problem occured in the try block
				sc.next();
				System.out.println("Wrong input");

			} finally {
				System.out.println("Hmm Finally...!");
			}
		}
	}

}
=======
package com.bm.exception.handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		System.out.println("Hi");
		finallyException();

	}

	public static void finallyException() {
		Scanner sc = new Scanner(System.in);

		boolean allIsWell = false;
		while (allIsWell == false) {
			try {// Code in which problem may occur
				int value = sc.nextInt();
				System.out.println("Value : " + value);// Handled the problem
				allIsWell = true;
			} catch (InputMismatchException ime) {
				// Handling the problem occured in the try block
				sc.next();
				System.out.println("Wrong input");

			} finally {
				System.out.println("Hmm Finally...!");
			}
		}
	}

}
>>>>>>> 820a8503d9b28a89c5c7c2077ec37760b56a3e84
