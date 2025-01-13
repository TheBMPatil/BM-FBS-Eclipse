package com.bm.bookManagement;

import java.util.Scanner;

public class Library {
	static Scanner sc = new Scanner(System.in);

	static void loginToLibrary() {
		int size = 50;
		Book[] books = new Book[size];
		BookManagement.hardCodedBooks(books);
		int choice;
		do {

			choice = showMenu();
			switch (choice) {
			case 1:
				System.out.println("1 ");
				break;
			case 2:
				System.out.println("2 ");
				break;
			case 3:
				System.out.println("3 ");
				BookManagement.displayAllBooks(books);
				break;
			case 4:
				System.out.println("4 ");
				break;
			case 5:
				System.out.println("5 ");
				break;
			case 6:
				System.out.println("6 ");
				break;
			case 7:
				System.out.println("7 ");
				break;
			case 8:
				System.out.println("8 ");
				break;
			case 9:
				System.out.println("9 ");
				break;
			case 10:
				System.out.println("10");
				break;
			case 11:
				System.out.println("11");
				break;
			case 12:
				System.out.println("12 ");
				break;
			case 0:
				System.out.println("Exiting......!");
				break;
			default:
				System.out.println("Default ");
				break;

			}
		} while (choice != 0);
	}

	static int showMenu() {

		System.out.println("|--------------------------------------- Book System ----------------------------------|");
		System.out
				.println("| 1)  Add Book               | 2)  Add Multiple Books     | 3)  Display All Books      |\n");
		System.out.println("| 4)  Search Book 	     | 5)  Update Book            | 6)  Remove Book            |\n");
		System.out
				.println("| 7)  List All Authors       | 8)  List Books By Author   | 9)  List All Categories    |\n");
		System.out
				.println("| 10) List Books By Category | 11) Sort Books             | 12) List Top 3 Books       |\n");
		System.out
				.println("|--------------------------------------------------------------------------------------|\n");
		System.out.println("\tEnter your choice: ");

		int ch = sc.nextInt();
		System.out
				.println("|--------------------------------------------------------------------------------------|\n");
		return ch;
	}
}
