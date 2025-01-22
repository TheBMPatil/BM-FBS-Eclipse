package com.bm.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.bm.connectionmanager.ConnectionManager;

public class MainApp {
	public static void main(String[] args) {
		System.out.println("Welcome to the Application");
		Scanner sc = new Scanner(System.in);
		ConnectionManager cManager = new ConnectionManager();
		try {
			Connection connection = cManager.getConnection();
			System.out.println("Connection successful!");

			int choice;
			do {
				System.out.println("""
						1 ) Show all records from Users table
						2 ) Show all records from attendance history
						3 ) Insert a new user
						4 ) Update an existing user's email
						5 ) Delete existing user
						0 ) Exit
						""");
				choice = sc.nextInt();
				sc.nextLine(); // Consume newline
				String sql;
				ResultSet res;

				switch (choice) {
				case 0 -> System.out.println("Exiting");
				case 1 -> {
					sql = "SELECT * FROM useraccount;";
					res = cManager.executeQuery(sql, connection);

					// Print the table header
					System.out.println(
							"+------------+----------------------+----------------------+----------------------+----------------------+---------------------+------------+");
					System.out.println(
							"| User ID    | First Name           | Last Name            | Login ID            | Email ID            | Registration Date   | Active Flag|");
					System.out.println(
							"+------------+----------------------+----------------------+----------------------+----------------------+---------------------+------------+");

					while (res.next()) {
						int userId = res.getInt("userid");
						String firstName = res.getString("FName");
						String lastName = res.getString("lname");
						String loginId = res.getString("loginId");
						String emailId = res.getString("emailId");
						java.sql.Timestamp regDate = res.getTimestamp("regDate");
						String activeFlag = res.getString("activeFlag");

						System.out.printf("| %-10d | %-20s | %-20s | %-20s | %-20s | %-19s | %-10s |\n", userId,
								firstName, lastName, loginId, emailId, regDate, activeFlag);
					}

					System.out.println(
							"+------------+----------------------+----------------------+----------------------+----------------------+---------------------+------------+");
				}
				case 2 -> {
					sql = "SELECT * FROM userattendancehistory;";
					res = cManager.executeQuery(sql, connection);

					// Print the table header
					System.out.println("+------------+---------------------+------------+");
					System.out.println("| History ID | Swipe In Time       | User ID    |");
					System.out.println("+------------+---------------------+------------+");

					while (res.next()) {
						int historyId = res.getInt("historyId");
						java.sql.Timestamp swipeInTime = res.getTimestamp("swipeInTime");
						int userId = res.getInt("userid");

						System.out.printf("| %-10d | %-19s | %-10d |\n", historyId, swipeInTime, userId);
					}

					System.out.println("+------------+---------------------+------------+");
				}
				case 3 -> {
					System.out.println("Enter First Name:");
					String firstName = sc.nextLine();
					System.out.println("Enter Last Name:");
					String lastName = sc.nextLine();
					System.out.println("Enter Login ID:");
					String loginId = sc.nextLine();
					System.out.println("Enter Password:");
					String password = sc.nextLine();
					System.out.println("Enter Email ID:");
					String emailId = sc.nextLine();
					System.out.println("Enter Active Flag (Y/N):");
					String activeFlag = sc.nextLine();

					sql = String.format(
							"INSERT INTO useraccount (FName, lname, loginId, pass, emailId, regDate, activeFlag) "
									+ "VALUES ('%s', '%s', '%s', '%s', '%s', NOW(), '%s');",
							firstName, lastName, loginId, password, emailId, activeFlag);
					int rowsAffected = cManager.updateQuery(sql, connection);
					System.out.println(rowsAffected + " record(s) inserted.");
				}
				case 4 -> {
					System.out.println("Enter User ID to update:");
					int userId = sc.nextInt();
					sc.nextLine(); // Consume newline
					System.out.println("Enter new Email ID:");
					String newEmail = sc.nextLine();

					sql = String.format("UPDATE useraccount SET emailId = '%s' WHERE userid = %d;", newEmail, userId);
					int rowsAffected = cManager.updateQuery(sql, connection);
					System.out.println(rowsAffected + " record(s) updated.");
				}
				case 5 -> {
					System.out.println("Enter User ID to delete:");
					int userId = sc.nextInt();
					cManager.deleteUserById(userId, connection);
				}
				default -> System.out.println("Invalid choice. Please try again.");
				}
			} while (choice != 0);

			cManager.closeConnection(connection);
			System.out.println("Connection closed successfully!");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
