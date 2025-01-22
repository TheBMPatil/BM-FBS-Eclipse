package com.bm.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.bm.connectionmanager.ConnectionManager;

public class MainApp {
	public static void main(String[] args) {
		System.out.println("Hiii");
		Scanner sc = new Scanner(System.in);
		ConnectionManager cManager = new ConnectionManager();
		try {
			Connection connection = cManager.getConnection();
			System.out.println("Connection success...!");

			int choice;
			do {
				System.out.println(
						"1 ) Show all records from Users table \n2 ) Show all records from attendance history \n0 ) Exit");
				String sql = "";
				choice = sc.nextInt();
				ResultSet res;
				switch (choice) {
				case 0 -> {
					System.out.println("Exiting");
					break;  
				}
				case 1 -> {
					sql = "SELECT * from useraccount;";
					res = cManager.executeQuery(sql, connection);

					// Print the table header
					System.out.println(
							"+-----------------+-----------------+-------------------+-----------------+-----------------+-----------------+-------------+----------+");
					System.out.println(
							"| First Name     | Last Name      | Login ID          | Password       | Email ID        | Registration    | Active Flag | User ID  |");
					System.out.println(
							"+-----------------+-----------------+-------------------+-----------------+-----------------+-----------------+-------------+----------+");

					while (res.next()) {
						// Retrieve data from the result set
						String firstName = res.getString(1);
						String lastName = res.getString(2);
						String loginId = res.getString(3);
						String password = res.getString(4);
						String emailId = res.getString(5);
						java.sql.Date regDate = res.getDate(6);
						String activeFlag = res.getString(7);
						int userId = res.getInt(8);

						// Print the row in table format
						System.out.printf("| %-15s | %-15s | %-17s | %-15s | %-17s | %-15s | %-11s | %-8d |\n",
								firstName, lastName, loginId, password, emailId, regDate, activeFlag, userId);
					}

					// Print the table footer
					System.out.println(
							"+-----------------+-----------------+-------------------+-----------------+-----------------+-----------------+-------------+----------+");

				}
				case 2 -> {
					sql = "SELECT * from userattendancehistory";
					res = cManager.executeQuery(sql, connection);

					// Print the table header
					System.out.println("+------------+---------------------+----------+");
					System.out.println("| History ID | Swipe In Time       | User ID  |");
					System.out.println("+------------+---------------------+----------+");

					while (res.next()) {
						int historyId = res.getInt("historyId");
						java.sql.Timestamp swipeInTime = res.getTimestamp("swipeInTime");
						int userId = res.getInt("userid");

						// Print the row in table format
						System.out.printf("| %-10d | %-19s | %-8d |\n", historyId, swipeInTime, userId);
					}

					// Print the table footer
					System.out.println("+------------+---------------------+----------+");

				}

				default -> System.out.println("Invalid choice");
				}
			} while (0 != choice);
			cManager.closeConnection(connection);
			System.out.println("Connection closed successfully!");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		}

	}
}
